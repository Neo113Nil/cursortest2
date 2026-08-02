package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class Zuc {

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.symmetric.Zuc.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$Zuc128");
            configurableProvider.addAlgorithm("Cipher.ZUC-128", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator.ZUC-128", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.ZUC-128", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$Zuc256");
            configurableProvider.addAlgorithm("Cipher.ZUC-256", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator.ZUC-256", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.ZUC-256", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$ZucMac128");
            configurableProvider.addAlgorithm("Mac.ZUC-128", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$ZucMac256");
            configurableProvider.addAlgorithm("Mac.ZUC-256", sb8.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ZUC-256-128", "ZUC-256");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$ZucMac256_64");
            configurableProvider.addAlgorithm("Mac.ZUC-256-64", sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$ZucMac256_32");
            configurableProvider.addAlgorithm("Mac.ZUC-256-32", sb10.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Zuc IV";
        }
    }

    public static class KeyGen128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen128() {
            super("ZUC128", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGen256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen256() {
            super("ZUC256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class Zuc128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Zuc128() {
            super(new org.bouncycastle.crypto.engines.Zuc128Engine(), 16, 128);
        }
    }

    public static class Zuc256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Zuc256() {
            super(new org.bouncycastle.crypto.engines.Zuc256Engine(), 25, 256);
        }
    }

    public static class ZucMac128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public ZucMac128() {
            super(new org.bouncycastle.crypto.macs.Zuc128Mac());
        }
    }

    public static class ZucMac256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public ZucMac256() {
            super(new org.bouncycastle.crypto.macs.Zuc256Mac(128));
        }
    }

    public static class ZucMac256_32 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public ZucMac256_32() {
            super(new org.bouncycastle.crypto.macs.Zuc256Mac(32));
        }
    }

    public static class ZucMac256_64 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public ZucMac256_64() {
            super(new org.bouncycastle.crypto.macs.Zuc256Mac(64));
        }
    }

    private Zuc() {
    }
}
