package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class Threefish {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.Threefish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$CMAC_256");
            configurableProvider.addAlgorithm("Mac.Threefish-256CMAC", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$CMAC_512");
            configurableProvider.addAlgorithm("Mac.Threefish-512CMAC", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$CMAC_1024");
            configurableProvider.addAlgorithm("Mac.Threefish-1024CMAC", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$ECB_256");
            configurableProvider.addAlgorithm("Cipher.Threefish-256", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$ECB_512");
            configurableProvider.addAlgorithm("Cipher.Threefish-512", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$ECB_1024");
            configurableProvider.addAlgorithm("Cipher.Threefish-1024", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$KeyGen_256");
            configurableProvider.addAlgorithm("KeyGenerator.Threefish-256", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$KeyGen_512");
            configurableProvider.addAlgorithm("KeyGenerator.Threefish-512", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$KeyGen_1024");
            configurableProvider.addAlgorithm("KeyGenerator.Threefish-1024", sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$AlgParams_256");
            configurableProvider.addAlgorithm("AlgorithmParameters.Threefish-256", sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$AlgParams_512");
            configurableProvider.addAlgorithm("AlgorithmParameters.Threefish-512", sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$AlgParams_1024");
            configurableProvider.addAlgorithm("AlgorithmParameters.Threefish-1024", sb12.toString());
        }
    }

    public static class AlgParams_1024 extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Threefish-1024 IV";
        }
    }

    public static class AlgParams_256 extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Threefish-256 IV";
        }
    }

    public static class AlgParams_512 extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Threefish-512 IV";
        }
    }

    public static class CMAC_1024 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CMAC_1024() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.ThreefishEngine(1024)));
        }
    }

    public static class CMAC_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CMAC_256() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.ThreefishEngine(256)));
        }
    }

    public static class CMAC_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CMAC_512() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.ThreefishEngine(512)));
        }
    }

    public static class ECB_1024 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB_1024() {
            super(new org.bouncycastle.crypto.engines.ThreefishEngine(1024));
        }
    }

    public static class ECB_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB_256() {
            super(new org.bouncycastle.crypto.engines.ThreefishEngine(256));
        }
    }

    public static class ECB_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB_512() {
            super(new org.bouncycastle.crypto.engines.ThreefishEngine(512));
        }
    }

    public static class KeyGen_1024 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen_1024() {
            super("Threefish-1024", 1024, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGen_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen_256() {
            super("Threefish-256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGen_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen_512() {
            super("Threefish-512", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private Threefish() {
    }
}
