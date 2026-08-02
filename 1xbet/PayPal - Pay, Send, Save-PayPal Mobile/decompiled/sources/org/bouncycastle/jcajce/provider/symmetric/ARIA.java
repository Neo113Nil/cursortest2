package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class ARIA {

    public static class AlgParamsCCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private org.bouncycastle.internal.asn1.cms.CCMParameters Camera2StreamConfigurationMap;

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
            return "CCM";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (!isASN1FormatString(str)) {
                throw new java.io.IOException("unknown format specified");
            }
            this.Camera2StreamConfigurationMap = org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            this.Camera2StreamConfigurationMap = org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.AEADParameterSpec) {
                org.bouncycastle.jcajce.spec.AEADParameterSpec aEADParameterSpec = (org.bouncycastle.jcajce.spec.AEADParameterSpec) algorithmParameterSpec;
                this.Camera2StreamConfigurationMap = new org.bouncycastle.internal.asn1.cms.CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
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

    public static class AlgParamsGCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private org.bouncycastle.internal.asn1.cms.GCMParameters getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == java.security.spec.AlgorithmParameterSpec.class || org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.isGcmSpec(cls)) {
                return org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.gcmSpecExists() ? org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.extractGcmSpec(this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive()) : new org.bouncycastle.jcajce.spec.AEADParameterSpec(this.getHighResolutionOutputSizeshNQ4ISI.getNonce(), this.getHighResolutionOutputSizeshNQ4ISI.getIcvLen() * 8);
            }
            if (cls == org.bouncycastle.jcajce.spec.AEADParameterSpec.class) {
                return new org.bouncycastle.jcajce.spec.AEADParameterSpec(this.getHighResolutionOutputSizeshNQ4ISI.getNonce(), this.getHighResolutionOutputSizeshNQ4ISI.getIcvLen() * 8);
            }
            if (cls == javax.crypto.spec.IvParameterSpec.class) {
                return new javax.crypto.spec.IvParameterSpec(this.getHighResolutionOutputSizeshNQ4ISI.getNonce());
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
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.internal.asn1.cms.GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.internal.asn1.cms.GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.AEADParameterSpec) {
                org.bouncycastle.jcajce.spec.AEADParameterSpec aEADParameterSpec = (org.bouncycastle.jcajce.spec.AEADParameterSpec) algorithmParameterSpec;
                this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.internal.asn1.cms.GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AlgorithmParameterSpec class not recognized: ");
                sb.append(algorithmParameterSpec.getClass().getName());
                throw new java.security.spec.InvalidParameterSpecException(sb.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
            if (isASN1FormatString(str)) {
                return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
            }
            throw new java.io.IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() throws java.io.IOException {
            return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
        }
    }

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("ARIA");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.symmetric.ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.ARIA", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cbc, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cbc, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cbc, "ARIA");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIA", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cbc, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cbc, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cbc, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_ofb, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_ofb, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_ofb, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cfb, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cfb, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cfb, "ARIA");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.ARIA", sb3.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_ecb;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb4.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_ecb;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, sb5.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_ecb;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, sb6.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cbc;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier4, sb7.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cbc;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier5, sb8.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cbc;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, sb9.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cfb;
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier7, sb10.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cfb;
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier8, sb11.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cfb;
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier9, sb12.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier10 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_ofb;
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, sb13.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier11 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_ofb;
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, sb14.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier12 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_ofb;
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, sb15.toString());
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.ARIARFC3211WRAP", sb16.toString());
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAP", sb17.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_kw, "ARIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_kw, "ARIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_kw, "ARIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP");
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$WrapPad");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAPPAD", sb18.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_kwp, "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_kwp, "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_kwp, "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD");
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.ARIA", sb19.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier13 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_kw;
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier13, sb20.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier14 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_kw;
            java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
            sb21.append(str);
            sb21.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier14, sb21.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier15 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_kw;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(str);
            sb22.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier15, sb22.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier16 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_kwp;
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
            sb23.append(str);
            sb23.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier16, sb23.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier17 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_kwp;
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
            sb24.append(str);
            sb24.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier17, sb24.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier18 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_kwp;
            java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
            sb25.append(str);
            sb25.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier18, sb25.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier19 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_ecb;
            java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
            sb26.append(str);
            sb26.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier19, sb26.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier20 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_ecb;
            java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
            sb27.append(str);
            sb27.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier20, sb27.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier21 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_ecb;
            java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
            sb28.append(str);
            sb28.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier21, sb28.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier22 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cbc;
            java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
            sb29.append(str);
            sb29.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier22, sb29.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier23 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cbc;
            java.lang.StringBuilder sb30 = new java.lang.StringBuilder();
            sb30.append(str);
            sb30.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier23, sb30.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier24 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cbc;
            java.lang.StringBuilder sb31 = new java.lang.StringBuilder();
            sb31.append(str);
            sb31.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, sb31.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier25 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cfb;
            java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
            sb32.append(str);
            sb32.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier25, sb32.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier26 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cfb;
            java.lang.StringBuilder sb33 = new java.lang.StringBuilder();
            sb33.append(str);
            sb33.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier26, sb33.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier27 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cfb;
            java.lang.StringBuilder sb34 = new java.lang.StringBuilder();
            sb34.append(str);
            sb34.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier27, sb34.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier28 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_ofb;
            java.lang.StringBuilder sb35 = new java.lang.StringBuilder();
            sb35.append(str);
            sb35.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier28, sb35.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier29 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_ofb;
            java.lang.StringBuilder sb36 = new java.lang.StringBuilder();
            sb36.append(str);
            sb36.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier29, sb36.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier30 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_ofb;
            java.lang.StringBuilder sb37 = new java.lang.StringBuilder();
            sb37.append(str);
            sb37.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier30, sb37.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier31 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_ccm;
            java.lang.StringBuilder sb38 = new java.lang.StringBuilder();
            sb38.append(str);
            sb38.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier31, sb38.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier32 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_ccm;
            java.lang.StringBuilder sb39 = new java.lang.StringBuilder();
            sb39.append(str);
            sb39.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier32, sb39.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier33 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_ccm;
            java.lang.StringBuilder sb40 = new java.lang.StringBuilder();
            sb40.append(str);
            sb40.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier33, sb40.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier34 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_gcm;
            java.lang.StringBuilder sb41 = new java.lang.StringBuilder();
            sb41.append(str);
            sb41.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier34, sb41.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier35 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_gcm;
            java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
            sb42.append(str);
            sb42.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier35, sb42.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier36 = org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_gcm;
            java.lang.StringBuilder sb43 = new java.lang.StringBuilder();
            sb43.append(str);
            sb43.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier36, sb43.toString());
            java.lang.StringBuilder sb44 = new java.lang.StringBuilder();
            sb44.append(str);
            sb44.append("$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.ARIA", sb44.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cbc, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cbc, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cbc, "ARIA");
            java.lang.StringBuilder sb45 = new java.lang.StringBuilder();
            sb45.append(str);
            sb45.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIACCM", sb45.toString());
            java.lang.StringBuilder sb46 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb46.append(org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_ccm);
            configurableProvider.addAlgorithm(sb46.toString(), "ARIACCM");
            java.lang.StringBuilder sb47 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb47.append(org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_ccm);
            configurableProvider.addAlgorithm(sb47.toString(), "ARIACCM");
            java.lang.StringBuilder sb48 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb48.append(org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_ccm);
            configurableProvider.addAlgorithm(sb48.toString(), "ARIACCM");
            java.lang.StringBuilder sb49 = new java.lang.StringBuilder();
            sb49.append(str);
            sb49.append("$CCM");
            configurableProvider.addAlgorithm("Cipher.ARIACCM", sb49.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_ccm, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_ccm, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_ccm, "CCM");
            java.lang.StringBuilder sb50 = new java.lang.StringBuilder();
            sb50.append(str);
            sb50.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIAGCM", sb50.toString());
            java.lang.StringBuilder sb51 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb51.append(org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_gcm);
            configurableProvider.addAlgorithm(sb51.toString(), "ARIAGCM");
            java.lang.StringBuilder sb52 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb52.append(org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_gcm);
            configurableProvider.addAlgorithm(sb52.toString(), "ARIAGCM");
            java.lang.StringBuilder sb53 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb53.append(org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_gcm);
            configurableProvider.addAlgorithm(sb53.toString(), "ARIAGCM");
            java.lang.StringBuilder sb54 = new java.lang.StringBuilder();
            sb54.append(str);
            sb54.append("$GCM");
            configurableProvider.addAlgorithm("Cipher.ARIAGCM", sb54.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_gcm, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_gcm, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_gcm, "ARIAGCM");
            java.lang.StringBuilder sb55 = new java.lang.StringBuilder();
            sb55.append(str);
            sb55.append("$GMAC");
            java.lang.String obj = sb55.toString();
            java.lang.StringBuilder sb56 = new java.lang.StringBuilder();
            sb56.append(str);
            sb56.append("$KeyGen");
            addGMacAlgorithm(configurableProvider, "ARIA", obj, sb56.toString());
            java.lang.StringBuilder sb57 = new java.lang.StringBuilder();
            sb57.append(str);
            sb57.append("$Poly1305");
            java.lang.String obj2 = sb57.toString();
            java.lang.StringBuilder sb58 = new java.lang.StringBuilder();
            sb58.append(str);
            sb58.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "ARIA", obj2, sb58.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "ARIA IV";
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen(int i) {
            super("ARIA", i, new org.bouncycastle.crypto.CipherKeyGenerator());
        }

        public KeyGen() {
            this(256);
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.ARIAEngine()), 128);
        }
    }

    public static class CCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CCM() {
            super((org.bouncycastle.crypto.modes.AEADBlockCipher) new org.bouncycastle.crypto.modes.CCMBlockCipher(new org.bouncycastle.crypto.engines.ARIAEngine()), false, 12);
        }
    }

    public static class CFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(new org.bouncycastle.crypto.engines.ARIAEngine(), 128)), 128);
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.ARIA.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.ARIAEngine();
                }
            });
        }
    }

    public static class GCM extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCM() {
            super(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.ARIAEngine()));
        }
    }

    public static class GMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public GMAC() {
            super(new org.bouncycastle.crypto.macs.GMac(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.ARIAEngine())));
        }
    }

    public static class KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", null);
        }
    }

    public static class KeyGen128 extends org.bouncycastle.jcajce.provider.symmetric.ARIA.KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends org.bouncycastle.jcajce.provider.symmetric.ARIA.KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends org.bouncycastle.jcajce.provider.symmetric.ARIA.KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class OFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(new org.bouncycastle.crypto.engines.ARIAEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new org.bouncycastle.crypto.engines.ARIAEngine()));
        }
    }

    public static class Poly1305KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", 256, new org.bouncycastle.crypto.generators.Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public RFC3211Wrap() {
            super(new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.ARIAEngine()), 16);
        }
    }

    public static class Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() {
            super(new org.bouncycastle.crypto.engines.ARIAWrapEngine());
        }
    }

    public static class WrapPad extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public WrapPad() {
            super(new org.bouncycastle.crypto.engines.ARIAWrapPadEngine());
        }
    }

    private ARIA() {
    }
}
