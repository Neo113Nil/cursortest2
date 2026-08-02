package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class CAST5 {

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private int Camera2StreamConfigurationMap = 128;
        private byte[] getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == javax.crypto.spec.IvParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return new javax.crypto.spec.IvParameterSpec(this.getHighSpeedVideoFpsRangesFor);
            }
            throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to CAST5 parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "CAST5 Parameters";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (isASN1FormatString(str)) {
                org.bouncycastle.asn1.misc.CAST5CBCParameters cAST5CBCParameters = org.bouncycastle.asn1.misc.CAST5CBCParameters.getInstance(new org.bouncycastle.asn1.ASN1InputStream(bArr).readObject());
                this.Camera2StreamConfigurationMap = cAST5CBCParameters.getKeyLength();
                this.getHighSpeedVideoFpsRangesFor = cAST5CBCParameters.getIV();
            } else {
                if (!str.equals("RAW")) {
                    throw new java.io.IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(bArr);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.getHighSpeedVideoFpsRangesFor = bArr2;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec)) {
                throw new java.security.spec.InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
            }
            this.getHighSpeedVideoFpsRangesFor = ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
            if (isASN1FormatString(str)) {
                return new org.bouncycastle.asn1.misc.CAST5CBCParameters(engineGetEncoded(), this.Camera2StreamConfigurationMap).getEncoded();
            }
            if (str.equals("RAW")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("CAST5");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.CAST5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.CAST5", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CAST5", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.CAST5", sb3.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cast5CBC;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.CAST5", sb5.toString());
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator", org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cast5CBC, "CAST5");
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.CAST5Engine()), 64);
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.CAST5Engine());
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("CAST5", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private CAST5() {
    }
}
