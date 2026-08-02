package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class XTEA {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.symmetric.XTEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.XTEA", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.XTEA", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.XTEA", sb3.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "XTEA IV";
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.XTEAEngine());
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("XTEA", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private XTEA() {
    }
}
