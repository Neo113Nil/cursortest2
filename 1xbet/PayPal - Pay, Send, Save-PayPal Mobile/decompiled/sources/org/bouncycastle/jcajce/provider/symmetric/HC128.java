package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class HC128 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.symmetric.HC128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.HC128", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.HC128", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.HC128", sb3.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "HC128 IV";
        }
    }

    public static class Base extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Base() {
            super(new org.bouncycastle.crypto.engines.HC128Engine(), 16);
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("HC128", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private HC128() {
    }
}
