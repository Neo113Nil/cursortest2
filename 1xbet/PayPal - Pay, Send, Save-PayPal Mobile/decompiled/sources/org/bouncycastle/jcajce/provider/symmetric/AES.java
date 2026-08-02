package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class AES {
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;

    public static class AESCCMMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {

        static class CCMMac implements org.bouncycastle.crypto.Mac {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private final org.bouncycastle.crypto.modes.CCMBlockCipher getHighSpeedVideoSizes;

            @Override // org.bouncycastle.crypto.Mac
            public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
                this.getHighSpeedVideoSizes.processAADBytes(bArr, i, i2);
            }

            @Override // org.bouncycastle.crypto.Mac
            public void update(byte b) throws java.lang.IllegalStateException {
                this.getHighSpeedVideoSizes.processAADByte(b);
            }

            @Override // org.bouncycastle.crypto.Mac
            public void reset() {
                this.getHighSpeedVideoSizes.reset();
            }

            @Override // org.bouncycastle.crypto.Mac
            public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
                this.getHighSpeedVideoSizes.init(true, cipherParameters);
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getMac().length;
            }

            @Override // org.bouncycastle.crypto.Mac
            public int getMacSize() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            @Override // org.bouncycastle.crypto.Mac
            public java.lang.String getAlgorithmName() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.getHighSpeedVideoSizes.getAlgorithmName());
                sb.append("Mac");
                return sb.toString();
            }

            @Override // org.bouncycastle.crypto.Mac
            public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
                try {
                    return this.getHighSpeedVideoSizes.doFinal(bArr, 0);
                } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("exception on doFinal(): ");
                    sb.append(e.toString());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            }

            /* synthetic */ CCMMac(byte b) {
                this();
            }

            private CCMMac() {
                this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.modes.CCMBlockCipher(new org.bouncycastle.crypto.engines.AESEngine());
                this.getHighResolutionOutputSizeshNQ4ISI = 8;
            }
        }

        public AESCCMMAC() {
            super(new org.bouncycastle.jcajce.provider.symmetric.AES.AESCCMMAC.CCMMac((byte) 0));
        }
    }

    public static class AlgParamsCCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private org.bouncycastle.internal.asn1.cms.CCMParameters getHighSpeedVideoFpsRanges;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == java.security.spec.AlgorithmParameterSpec.class || org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.isGcmSpec(cls)) {
                return org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.gcmSpecExists() ? org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.extractGcmSpec(this.getHighSpeedVideoFpsRanges.toASN1Primitive()) : new org.bouncycastle.jcajce.spec.AEADParameterSpec(this.getHighSpeedVideoFpsRanges.getNonce(), this.getHighSpeedVideoFpsRanges.getIcvLen() * 8);
            }
            if (cls == org.bouncycastle.jcajce.spec.AEADParameterSpec.class) {
                return new org.bouncycastle.jcajce.spec.AEADParameterSpec(this.getHighSpeedVideoFpsRanges.getNonce(), this.getHighSpeedVideoFpsRanges.getIcvLen() * 8);
            }
            if (cls == javax.crypto.spec.IvParameterSpec.class) {
                return new javax.crypto.spec.IvParameterSpec(this.getHighSpeedVideoFpsRanges.getNonce());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AlgorithmParameterSpec not recognized: ");
            sb.append(cls.getName());
            throw new java.security.spec.InvalidParameterSpecException(sb.toString());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "CCM";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (!isASN1FormatString(str)) {
                throw new java.io.IOException("unknown format specified");
            }
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.AEADParameterSpec) {
                org.bouncycastle.jcajce.spec.AEADParameterSpec aEADParameterSpec = (org.bouncycastle.jcajce.spec.AEADParameterSpec) algorithmParameterSpec;
                this.getHighSpeedVideoFpsRanges = new org.bouncycastle.internal.asn1.cms.CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AlgorithmParameterSpec class not recognized: ");
                sb.append(algorithmParameterSpec.getClass().getName());
                throw new java.security.spec.InvalidParameterSpecException(sb.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
            if (isASN1FormatString(str)) {
                return this.getHighSpeedVideoFpsRanges.getEncoded();
            }
            throw new java.io.IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() throws java.io.IOException {
            return this.getHighSpeedVideoFpsRanges.getEncoded();
        }
    }

    public static class AlgParamsGCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private org.bouncycastle.internal.asn1.cms.GCMParameters Camera2StreamConfigurationMap;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == java.security.spec.AlgorithmParameterSpec.class || org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.isGcmSpec(cls)) {
                return org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.gcmSpecExists() ? org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.extractGcmSpec(this.Camera2StreamConfigurationMap.toASN1Primitive()) : new org.bouncycastle.jcajce.spec.AEADParameterSpec(this.Camera2StreamConfigurationMap.getNonce(), this.Camera2StreamConfigurationMap.getIcvLen() * 8);
            }
            if (cls == org.bouncycastle.jcajce.spec.AEADParameterSpec.class) {
                return new org.bouncycastle.jcajce.spec.AEADParameterSpec(this.Camera2StreamConfigurationMap.getNonce(), this.Camera2StreamConfigurationMap.getIcvLen() * 8);
            }
            if (cls == javax.crypto.spec.IvParameterSpec.class) {
                return new javax.crypto.spec.IvParameterSpec(this.Camera2StreamConfigurationMap.getNonce());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AlgorithmParameterSpec not recognized: ");
            sb.append(cls.getName());
            throw new java.security.spec.InvalidParameterSpecException(sb.toString());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return com.google.android.gms.stats.CodePackage.GCM;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (!isASN1FormatString(str)) {
                throw new java.io.IOException("unknown format specified");
            }
            this.Camera2StreamConfigurationMap = org.bouncycastle.internal.asn1.cms.GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            this.Camera2StreamConfigurationMap = org.bouncycastle.internal.asn1.cms.GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.AEADParameterSpec) {
                org.bouncycastle.jcajce.spec.AEADParameterSpec aEADParameterSpec = (org.bouncycastle.jcajce.spec.AEADParameterSpec) algorithmParameterSpec;
                this.Camera2StreamConfigurationMap = new org.bouncycastle.internal.asn1.cms.GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AlgorithmParameterSpec class not recognized: ");
                sb.append(algorithmParameterSpec.getClass().getName());
                throw new java.security.spec.InvalidParameterSpecException(sb.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
            if (isASN1FormatString(str)) {
                return this.Camera2StreamConfigurationMap.getEncoded();
            }
            throw new java.io.IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() throws java.io.IOException {
            return this.Camera2StreamConfigurationMap.getEncoded();
        }
    }

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance(org.jose4j.keys.AesKey.ALGORITHM);
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class AlgParamGenCCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new java.security.SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("CCM");
                createParametersInstance.init(new org.bouncycastle.internal.asn1.cms.CCMParameters(bArr, 12).getEncoded());
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class AlgParamGenGCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new java.security.SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance(com.google.android.gms.stats.CodePackage.GCM);
                createParametersInstance.init(new org.bouncycastle.internal.asn1.cms.GCMParameters(bArr, 16).getEncoded());
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.symmetric.AES.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.AES", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", org.jose4j.keys.AesKey.ALGORITHM);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", org.jose4j.keys.AesKey.ALGORITHM);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", org.jose4j.keys.AesKey.ALGORITHM);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb2.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC);
            configurableProvider.addAlgorithm(sb2.toString(), org.jose4j.keys.AesKey.ALGORITHM);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb3.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC);
            configurableProvider.addAlgorithm(sb3.toString(), org.jose4j.keys.AesKey.ALGORITHM);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb4.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC);
            configurableProvider.addAlgorithm(sb4.toString(), org.jose4j.keys.AesKey.ALGORITHM);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParamsGCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.GCM", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb6.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM);
            configurableProvider.addAlgorithm(sb6.toString(), com.google.android.gms.stats.CodePackage.GCM);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb7.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM);
            configurableProvider.addAlgorithm(sb7.toString(), com.google.android.gms.stats.CodePackage.GCM);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb8.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM);
            configurableProvider.addAlgorithm(sb8.toString(), com.google.android.gms.stats.CodePackage.GCM);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$AlgParamsCCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.CCM", sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb10.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM);
            configurableProvider.addAlgorithm(sb10.toString(), "CCM");
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb11.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM);
            configurableProvider.addAlgorithm(sb11.toString(), "CCM");
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb12.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM);
            configurableProvider.addAlgorithm(sb12.toString(), "CCM");
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.AES", sb13.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", org.jose4j.keys.AesKey.ALGORITHM);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", org.jose4j.keys.AesKey.ALGORITHM);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", org.jose4j.keys.AesKey.ALGORITHM);
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb14.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC);
            configurableProvider.addAlgorithm(sb14.toString(), org.jose4j.keys.AesKey.ALGORITHM);
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb15.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC);
            configurableProvider.addAlgorithm(sb15.toString(), org.jose4j.keys.AesKey.ALGORITHM);
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb16.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC);
            configurableProvider.addAlgorithm(sb16.toString(), org.jose4j.keys.AesKey.ALGORITHM);
            configurableProvider.addAttributes("Cipher.AES", org.bouncycastle.jcajce.provider.symmetric.AES.getHighSpeedVideoFpsRanges);
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.AES", sb17.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", org.jose4j.keys.AesKey.ALGORITHM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", org.jose4j.keys.AesKey.ALGORITHM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", org.jose4j.keys.AesKey.ALGORITHM);
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_ECB;
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb18.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_ECB;
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, sb19.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_ECB;
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, sb20.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC;
            java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
            sb21.append(str);
            sb21.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier4, sb21.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(str);
            sb22.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier5, sb22.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC;
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
            sb23.append(str);
            sb23.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, sb23.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_OFB;
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
            sb24.append(str);
            sb24.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier7, sb24.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_OFB;
            java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
            sb25.append(str);
            sb25.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier8, sb25.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_OFB;
            java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
            sb26.append(str);
            sb26.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier9, sb26.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier10 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CFB;
            java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
            sb27.append(str);
            sb27.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, sb27.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier11 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CFB;
            java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
            sb28.append(str);
            sb28.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, sb28.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier12 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CFB;
            java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
            sb29.append(str);
            sb29.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, sb29.toString());
            configurableProvider.addAttributes("Cipher.AESWRAP", org.bouncycastle.jcajce.provider.symmetric.AES.getHighSpeedVideoFpsRanges);
            java.lang.StringBuilder sb30 = new java.lang.StringBuilder();
            sb30.append(str);
            sb30.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.AESWRAP", sb30.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.addAttributes("Cipher.AESWRAPPAD", org.bouncycastle.jcajce.provider.symmetric.AES.getHighSpeedVideoFpsRanges);
            java.lang.StringBuilder sb31 = new java.lang.StringBuilder();
            sb31.append(str);
            sb31.append("$WrapPad");
            configurableProvider.addAlgorithm("Cipher.AESWRAPPAD", sb31.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap_pad, "AESWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap_pad, "AESWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad, "AESWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
            sb32.append(str);
            sb32.append("$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.AESRFC3211WRAP", sb32.toString());
            java.lang.StringBuilder sb33 = new java.lang.StringBuilder();
            sb33.append(str);
            sb33.append("$RFC5649Wrap");
            configurableProvider.addAlgorithm("Cipher.AESRFC5649WRAP", sb33.toString());
            java.lang.StringBuilder sb34 = new java.lang.StringBuilder();
            sb34.append(str);
            sb34.append("$AlgParamGenCCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CCM", sb34.toString());
            java.lang.StringBuilder sb35 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb35.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM);
            configurableProvider.addAlgorithm(sb35.toString(), "CCM");
            java.lang.StringBuilder sb36 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb36.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM);
            configurableProvider.addAlgorithm(sb36.toString(), "CCM");
            java.lang.StringBuilder sb37 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb37.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM);
            configurableProvider.addAlgorithm(sb37.toString(), "CCM");
            configurableProvider.addAttributes("Cipher.CCM", org.bouncycastle.jcajce.provider.symmetric.AES.getHighSpeedVideoFpsRanges);
            java.lang.StringBuilder sb38 = new java.lang.StringBuilder();
            sb38.append(str);
            sb38.append("$CCM");
            configurableProvider.addAlgorithm("Cipher.CCM", sb38.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM, "CCM");
            java.lang.StringBuilder sb39 = new java.lang.StringBuilder();
            sb39.append(str);
            sb39.append("$AlgParamGenGCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", sb39.toString());
            java.lang.StringBuilder sb40 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb40.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM);
            configurableProvider.addAlgorithm(sb40.toString(), com.google.android.gms.stats.CodePackage.GCM);
            java.lang.StringBuilder sb41 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb41.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM);
            configurableProvider.addAlgorithm(sb41.toString(), com.google.android.gms.stats.CodePackage.GCM);
            java.lang.StringBuilder sb42 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb42.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM);
            configurableProvider.addAlgorithm(sb42.toString(), com.google.android.gms.stats.CodePackage.GCM);
            configurableProvider.addAttributes("Cipher.GCM", org.bouncycastle.jcajce.provider.symmetric.AES.getHighSpeedVideoFpsRanges);
            java.lang.StringBuilder sb43 = new java.lang.StringBuilder();
            sb43.append(str);
            sb43.append("$GCM");
            configurableProvider.addAlgorithm("Cipher.GCM", sb43.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM, com.google.android.gms.stats.CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM, com.google.android.gms.stats.CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM, com.google.android.gms.stats.CodePackage.GCM);
            java.lang.StringBuilder sb44 = new java.lang.StringBuilder();
            sb44.append(str);
            sb44.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.AES", sb44.toString());
            java.lang.StringBuilder sb45 = new java.lang.StringBuilder();
            sb45.append(str);
            sb45.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.2", sb45.toString());
            java.lang.StringBuilder sb46 = new java.lang.StringBuilder();
            sb46.append(str);
            sb46.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.22", sb46.toString());
            java.lang.StringBuilder sb47 = new java.lang.StringBuilder();
            sb47.append(str);
            sb47.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.42", sb47.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier13 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_ECB;
            java.lang.StringBuilder sb48 = new java.lang.StringBuilder();
            sb48.append(str);
            sb48.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier13, sb48.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier14 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC;
            java.lang.StringBuilder sb49 = new java.lang.StringBuilder();
            sb49.append(str);
            sb49.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier14, sb49.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier15 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_OFB;
            java.lang.StringBuilder sb50 = new java.lang.StringBuilder();
            sb50.append(str);
            sb50.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier15, sb50.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier16 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CFB;
            java.lang.StringBuilder sb51 = new java.lang.StringBuilder();
            sb51.append(str);
            sb51.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier16, sb51.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier17 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_ECB;
            java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
            sb52.append(str);
            sb52.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier17, sb52.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier18 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC;
            java.lang.StringBuilder sb53 = new java.lang.StringBuilder();
            sb53.append(str);
            sb53.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier18, sb53.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier19 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_OFB;
            java.lang.StringBuilder sb54 = new java.lang.StringBuilder();
            sb54.append(str);
            sb54.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier19, sb54.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier20 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CFB;
            java.lang.StringBuilder sb55 = new java.lang.StringBuilder();
            sb55.append(str);
            sb55.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier20, sb55.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier21 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_ECB;
            java.lang.StringBuilder sb56 = new java.lang.StringBuilder();
            sb56.append(str);
            sb56.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier21, sb56.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier22 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC;
            java.lang.StringBuilder sb57 = new java.lang.StringBuilder();
            sb57.append(str);
            sb57.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier22, sb57.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier23 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_OFB;
            java.lang.StringBuilder sb58 = new java.lang.StringBuilder();
            sb58.append(str);
            sb58.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier23, sb58.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier24 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CFB;
            java.lang.StringBuilder sb59 = new java.lang.StringBuilder();
            sb59.append(str);
            sb59.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, sb59.toString());
            java.lang.StringBuilder sb60 = new java.lang.StringBuilder();
            sb60.append(str);
            sb60.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.AESWRAP", sb60.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier25 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap;
            java.lang.StringBuilder sb61 = new java.lang.StringBuilder();
            sb61.append(str);
            sb61.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier25, sb61.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier26 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap;
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder();
            sb62.append(str);
            sb62.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier26, sb62.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier27 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap;
            java.lang.StringBuilder sb63 = new java.lang.StringBuilder();
            sb63.append(str);
            sb63.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier27, sb63.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier28 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM;
            java.lang.StringBuilder sb64 = new java.lang.StringBuilder();
            sb64.append(str);
            sb64.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier28, sb64.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier29 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM;
            java.lang.StringBuilder sb65 = new java.lang.StringBuilder();
            sb65.append(str);
            sb65.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier29, sb65.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier30 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM;
            java.lang.StringBuilder sb66 = new java.lang.StringBuilder();
            sb66.append(str);
            sb66.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier30, sb66.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier31 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM;
            java.lang.StringBuilder sb67 = new java.lang.StringBuilder();
            sb67.append(str);
            sb67.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier31, sb67.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier32 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM;
            java.lang.StringBuilder sb68 = new java.lang.StringBuilder();
            sb68.append(str);
            sb68.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier32, sb68.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier33 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM;
            java.lang.StringBuilder sb69 = new java.lang.StringBuilder();
            sb69.append(str);
            sb69.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier33, sb69.toString());
            java.lang.StringBuilder sb70 = new java.lang.StringBuilder();
            sb70.append(str);
            sb70.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.AESWRAPPAD", sb70.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier34 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap_pad;
            java.lang.StringBuilder sb71 = new java.lang.StringBuilder();
            sb71.append(str);
            sb71.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier34, sb71.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier35 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap_pad;
            java.lang.StringBuilder sb72 = new java.lang.StringBuilder();
            sb72.append(str);
            sb72.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier35, sb72.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier36 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad;
            java.lang.StringBuilder sb73 = new java.lang.StringBuilder();
            sb73.append(str);
            sb73.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier36, sb73.toString());
            java.lang.StringBuilder sb74 = new java.lang.StringBuilder();
            sb74.append(str);
            sb74.append("$AESCMAC");
            configurableProvider.addAlgorithm("Mac.AESCMAC", sb74.toString());
            java.lang.StringBuilder sb75 = new java.lang.StringBuilder();
            sb75.append(str);
            sb75.append("$AESCCMMAC");
            configurableProvider.addAlgorithm("Mac.AESCCMMAC", sb75.toString());
            java.lang.StringBuilder sb76 = new java.lang.StringBuilder("Alg.Alias.Mac.");
            sb76.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM.getId());
            configurableProvider.addAlgorithm(sb76.toString(), "AESCCMMAC");
            java.lang.StringBuilder sb77 = new java.lang.StringBuilder("Alg.Alias.Mac.");
            sb77.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM.getId());
            configurableProvider.addAlgorithm(sb77.toString(), "AESCCMMAC");
            java.lang.StringBuilder sb78 = new java.lang.StringBuilder("Alg.Alias.Mac.");
            sb78.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM.getId());
            configurableProvider.addAlgorithm(sb78.toString(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc, "PBEWITHSHA256AND256BITAES-CBC-BC");
            java.lang.StringBuilder sb79 = new java.lang.StringBuilder();
            sb79.append(str);
            sb79.append("$PBEWithSHA1AESCBC128");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", sb79.toString());
            java.lang.StringBuilder sb80 = new java.lang.StringBuilder();
            sb80.append(str);
            sb80.append("$PBEWithSHA1AESCBC192");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", sb80.toString());
            java.lang.StringBuilder sb81 = new java.lang.StringBuilder();
            sb81.append(str);
            sb81.append("$PBEWithSHA1AESCBC256");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", sb81.toString());
            java.lang.StringBuilder sb82 = new java.lang.StringBuilder();
            sb82.append(str);
            sb82.append("$PBEWithSHA256AESCBC128");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", sb82.toString());
            java.lang.StringBuilder sb83 = new java.lang.StringBuilder();
            sb83.append(str);
            sb83.append("$PBEWithSHA256AESCBC192");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", sb83.toString());
            java.lang.StringBuilder sb84 = new java.lang.StringBuilder();
            sb84.append(str);
            sb84.append("$PBEWithSHA256AESCBC256");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", sb84.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            java.lang.StringBuilder sb85 = new java.lang.StringBuilder();
            sb85.append(str);
            sb85.append("$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb85.toString());
            java.lang.StringBuilder sb86 = new java.lang.StringBuilder();
            sb86.append(str);
            sb86.append("$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb86.toString());
            java.lang.StringBuilder sb87 = new java.lang.StringBuilder();
            sb87.append(str);
            sb87.append("$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb87.toString());
            java.lang.StringBuilder sb88 = new java.lang.StringBuilder();
            sb88.append(str);
            sb88.append("$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.AES", sb88.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier37 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.aes;
            java.lang.StringBuilder sb89 = new java.lang.StringBuilder();
            sb89.append(str);
            sb89.append("$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory", aSN1ObjectIdentifier37, sb89.toString());
            java.lang.StringBuilder sb90 = new java.lang.StringBuilder();
            sb90.append(str);
            sb90.append("$PBEWithMD5And128BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb90.toString());
            java.lang.StringBuilder sb91 = new java.lang.StringBuilder();
            sb91.append(str);
            sb91.append("$PBEWithMD5And192BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb91.toString());
            java.lang.StringBuilder sb92 = new java.lang.StringBuilder();
            sb92.append(str);
            sb92.append("$PBEWithMD5And256BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb92.toString());
            java.lang.StringBuilder sb93 = new java.lang.StringBuilder();
            sb93.append(str);
            sb93.append("$PBEWithSHAAnd128BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", sb93.toString());
            java.lang.StringBuilder sb94 = new java.lang.StringBuilder();
            sb94.append(str);
            sb94.append("$PBEWithSHAAnd192BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", sb94.toString());
            java.lang.StringBuilder sb95 = new java.lang.StringBuilder();
            sb95.append(str);
            sb95.append("$PBEWithSHAAnd256BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", sb95.toString());
            java.lang.StringBuilder sb96 = new java.lang.StringBuilder();
            sb96.append(str);
            sb96.append("$PBEWithSHA256And128BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", sb96.toString());
            java.lang.StringBuilder sb97 = new java.lang.StringBuilder();
            sb97.append(str);
            sb97.append("$PBEWithSHA256And192BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", sb97.toString());
            java.lang.StringBuilder sb98 = new java.lang.StringBuilder();
            sb98.append(str);
            sb98.append("$PBEWithSHA256And256BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", sb98.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            java.lang.StringBuilder sb99 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb99.append(org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc.getId());
            configurableProvider.addAlgorithm(sb99.toString(), "PKCS12PBE");
            java.lang.StringBuilder sb100 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb100.append(org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc.getId());
            configurableProvider.addAlgorithm(sb100.toString(), "PKCS12PBE");
            java.lang.StringBuilder sb101 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb101.append(org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc.getId());
            configurableProvider.addAlgorithm(sb101.toString(), "PKCS12PBE");
            java.lang.StringBuilder sb102 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb102.append(org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc.getId());
            configurableProvider.addAlgorithm(sb102.toString(), "PKCS12PBE");
            java.lang.StringBuilder sb103 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb103.append(org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc.getId());
            configurableProvider.addAlgorithm(sb103.toString(), "PKCS12PBE");
            java.lang.StringBuilder sb104 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb104.append(org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc.getId());
            configurableProvider.addAlgorithm(sb104.toString(), "PKCS12PBE");
            java.lang.StringBuilder sb105 = new java.lang.StringBuilder();
            sb105.append(str);
            sb105.append("$AESGMAC");
            java.lang.String obj = sb105.toString();
            java.lang.StringBuilder sb106 = new java.lang.StringBuilder();
            sb106.append(str);
            sb106.append("$KeyGen128");
            addGMacAlgorithm(configurableProvider, org.jose4j.keys.AesKey.ALGORITHM, obj, sb106.toString());
            java.lang.StringBuilder sb107 = new java.lang.StringBuilder();
            sb107.append(str);
            sb107.append("$Poly1305");
            java.lang.String obj2 = sb107.toString();
            java.lang.StringBuilder sb108 = new java.lang.StringBuilder();
            sb108.append(str);
            sb108.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, org.jose4j.keys.AesKey.ALGORITHM, obj2, sb108.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "AES IV";
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen(int i) {
            super(org.jose4j.keys.AesKey.ALGORITHM, i, new org.bouncycastle.crypto.CipherKeyGenerator());
        }

        public KeyGen() {
            this(192);
        }
    }

    public static class AESCMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public AESCMAC() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.AESEngine()));
        }
    }

    public static class AESGMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public AESGMAC() {
            super(new org.bouncycastle.crypto.macs.GMac(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.AESEngine())));
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 128);
        }
    }

    public static class CCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CCM() {
            super((org.bouncycastle.crypto.modes.AEADBlockCipher) new org.bouncycastle.crypto.modes.CCMBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), false, 12);
        }
    }

    public static class CFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(new org.bouncycastle.crypto.engines.AESEngine(), 128)), 128);
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.AESEngine();
                }
            });
        }
    }

    public static class GCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCM() {
            super(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()));
        }
    }

    public static class KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        public KeyFactory() {
            super(org.jose4j.keys.AesKey.ALGORITHM, null);
        }
    }

    public static class KeyGen128 extends org.bouncycastle.jcajce.provider.symmetric.AES.KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends org.bouncycastle.jcajce.provider.symmetric.AES.KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends org.bouncycastle.jcajce.provider.symmetric.AES.KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class OFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(new org.bouncycastle.crypto.engines.AESEngine(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithAESCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 2, 1, 192, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 2, 4, 192, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 2, 4, 256, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new org.bouncycastle.crypto.engines.AESEngine()));
        }
    }

    public static class Poly1305KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new org.bouncycastle.crypto.generators.Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public RFC3211Wrap() {
            super(new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.AESEngine()), 16);
        }
    }

    public static class RFC5649Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public RFC5649Wrap() {
            super(new org.bouncycastle.crypto.engines.RFC5649WrapEngine(new org.bouncycastle.crypto.engines.AESEngine()));
        }
    }

    public static class Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() {
            super(new org.bouncycastle.crypto.engines.AESWrapEngine());
        }
    }

    public static class WrapPad extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public WrapPad() {
            super(new org.bouncycastle.crypto.engines.AESWrapPadEngine());
        }
    }

    private AES() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        hashMap.put("SupportedKeyFormats", "RAW");
    }
}
