package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class RC5 {

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("RC5");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.symmetric.RC5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$ECB32");
            configurableProvider.addAlgorithm("Cipher.RC5", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RC5-32", "RC5");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$ECB64");
            configurableProvider.addAlgorithm("Cipher.RC5-64", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$KeyGen32");
            configurableProvider.addAlgorithm("KeyGenerator.RC5", sb3.toString());
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.RC5-32", "RC5");
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGen64");
            configurableProvider.addAlgorithm("KeyGenerator.RC5-64", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.RC5", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.RC5-64", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$Mac32");
            configurableProvider.addAlgorithm("Mac.RC5MAC", sb7.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC5", "RC5MAC");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$CFB8Mac32");
            configurableProvider.addAlgorithm("Mac.RC5MAC/CFB8", sb8.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "RC5 IV";
        }
    }

    public static class CBC32 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC32() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC532Engine()), 64);
        }
    }

    public static class CFB8Mac32 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CFB8Mac32() {
            super(new org.bouncycastle.crypto.macs.CFBBlockCipherMac(new org.bouncycastle.crypto.engines.RC532Engine()));
        }
    }

    public static class ECB32 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB32() {
            super(new org.bouncycastle.crypto.engines.RC532Engine());
        }
    }

    public static class ECB64 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB64() {
            super(new org.bouncycastle.crypto.engines.RC564Engine());
        }
    }

    public static class KeyGen32 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen32() {
            super("RC5", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGen64 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen64() {
            super("RC5-64", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class Mac32 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Mac32() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.RC532Engine()));
        }
    }

    private RC5() {
    }
}
