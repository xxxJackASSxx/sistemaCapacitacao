package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    private static ServidorPublico isabela;

    public static <String> void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");

        System.out.println("Servidor: "+ isabela.getNome());

        isabela.calcularSalariohorasExtras(10, 5.60);


        System.out.println("Servidor: " + isabela.getNome);
        System.out.printf("Horas extras R$ : "+isabela, getHorasExtras());

    }

    private static Object getHorasExtras() {
        return null;

    }
}
