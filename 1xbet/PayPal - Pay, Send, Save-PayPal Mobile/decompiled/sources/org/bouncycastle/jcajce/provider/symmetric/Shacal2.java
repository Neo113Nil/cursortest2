package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class Shacal2 {

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Shacal2 parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[32];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("Shacal2");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.Shacal2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$CMAC");
            configurableProvider.addAlgorithm("Mac.Shacal-2CMAC", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.Shacal2", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.SHACAL-2", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.Shacal2", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.Shacal2", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.Shacal2", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.SHACAL-2", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.SHACAL-2", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.SHACAL-2", sb9.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Shacal2 IV";
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.Shacal2Engine()), 256);
        }
    }

    public static class CMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CMAC() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.Shacal2Engine()));
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Shacal2.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.Shacal2Engine();
                }
            });
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("SHACAL-2", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private Shacal2() {
    }
}
