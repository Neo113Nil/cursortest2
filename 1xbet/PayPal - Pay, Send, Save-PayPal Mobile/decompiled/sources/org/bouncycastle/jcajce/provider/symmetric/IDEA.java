package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class IDEA {

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private byte[] getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == javax.crypto.spec.IvParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return new javax.crypto.spec.IvParameterSpec(this.getHighSpeedVideoFpsRangesFor);
            }
            throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "IDEA Parameters";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                if (!str.equals("ASN.1")) {
                    throw new java.io.IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(org.bouncycastle.asn1.misc.IDEACBCPar.getInstance(bArr).getIV());
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
                throw new java.security.spec.InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
            this.getHighSpeedVideoFpsRangesFor = ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
            if (isASN1FormatString(str)) {
                return new org.bouncycastle.asn1.misc.IDEACBCPar(engineGetEncoded("RAW")).getEncoded();
            }
            if (!str.equals("RAW")) {
                return null;
            }
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() throws java.io.IOException {
            return engineGetEncoded("ASN.1");
        }
    }

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for IDEA parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("IDEA");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.IDEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.IDEA", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.IDEA", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", sb4.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.IDEA", sb5.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.misc.MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$PBEWithSHAAndIDEA");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAANDIDEA-CBC", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.IDEA", sb8.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.misc.MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier2, sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$PBEWithSHAAndIDEAKeyGen");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$Mac");
            configurableProvider.addAlgorithm("Mac.IDEAMAC", sb11.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.IDEA", "IDEAMAC");
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$CFB8Mac");
            configurableProvider.addAlgorithm("Mac.IDEAMAC/CFB8", sb12.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.IDEAEngine()), 64);
        }
    }

    public static class CFB8Mac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CFB8Mac() {
            super(new org.bouncycastle.crypto.macs.CFBBlockCipherMac(new org.bouncycastle.crypto.engines.IDEAEngine()));
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.IDEAEngine());
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("IDEA", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class Mac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Mac() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.IDEAEngine()));
        }
    }

    public static class PBEWithSHAAndIDEA extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAndIDEA() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.IDEAEngine()));
        }
    }

    public static class PBEWithSHAAndIDEAKeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAndIDEAKeyGen() {
            super("PBEwithSHAandIDEA-CBC", null, true, 2, 1, 128, 64);
        }
    }

    private IDEA() {
    }
}
