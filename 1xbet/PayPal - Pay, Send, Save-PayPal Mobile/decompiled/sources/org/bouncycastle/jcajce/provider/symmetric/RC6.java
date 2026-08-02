package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class RC6 {

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC6 parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("RC6");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.symmetric.RC6.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.RC6", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.RC6", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.RC6", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$GMAC");
            java.lang.String obj = sb4.toString();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$KeyGen");
            addGMacAlgorithm(configurableProvider, "RC6", obj, sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$Poly1305");
            java.lang.String obj2 = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "RC6", obj2, sb7.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "RC6 IV";
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC6Engine()), 128);
        }
    }

    public static class CFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(new org.bouncycastle.crypto.engines.RC6Engine(), 128)), 128);
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.RC6.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.RC6Engine();
                }
            });
        }
    }

    public static class GMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public GMAC() {
            super(new org.bouncycastle.crypto.macs.GMac(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.RC6Engine())));
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("RC6", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class OFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(new org.bouncycastle.crypto.engines.RC6Engine(), 128)), 128);
        }
    }

    public static class Poly1305 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new org.bouncycastle.crypto.engines.RC6Engine()));
        }
    }

    public static class Poly1305KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-RC6", 256, new org.bouncycastle.crypto.generators.Poly1305KeyGenerator());
        }
    }

    private RC6() {
    }
}
