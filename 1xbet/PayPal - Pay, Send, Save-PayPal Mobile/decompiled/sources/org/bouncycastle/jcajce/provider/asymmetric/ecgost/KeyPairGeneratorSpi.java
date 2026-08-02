package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    org.bouncycastle.crypto.generators.ECKeyPairGenerator Camera2StreamConfigurationMap;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.crypto.params.ECKeyGenerationParameters getHighSpeedVideoSizes;
    int getOutputFormats;
    java.security.SecureRandom getOutputMinFrameDuration;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST3410ParameterSpec) {
            getHighSpeedVideoFpsRangesFor((org.bouncycastle.jcajce.spec.GOST3410ParameterSpec) algorithmParameterSpec, secureRandom);
            return;
        }
        if (algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECParameterSpec) {
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoFpsRangesFor = algorithmParameterSpec;
            org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH()), secureRandom);
            this.getHighSpeedVideoSizes = eCKeyGenerationParameters;
            this.Camera2StreamConfigurationMap.init(eCKeyGenerationParameters);
            this.getHighSpeedVideoFpsRanges = true;
            return;
        }
        if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
            java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoFpsRangesFor = algorithmParameterSpec;
            org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec2.getCurve());
            org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters2 = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(convertCurve, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, eCParameterSpec2.getGenerator()), eCParameterSpec2.getOrder(), java.math.BigInteger.valueOf(eCParameterSpec2.getCofactor())), secureRandom);
            this.getHighSpeedVideoSizes = eCKeyGenerationParameters2;
            this.Camera2StreamConfigurationMap.init(eCKeyGenerationParameters2);
            this.getHighSpeedVideoFpsRanges = true;
            return;
        }
        boolean z = algorithmParameterSpec instanceof java.security.spec.ECGenParameterSpec;
        if (z || (algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec)) {
            getHighSpeedVideoFpsRangesFor(new org.bouncycastle.jcajce.spec.GOST3410ParameterSpec(z ? ((java.security.spec.ECGenParameterSpec) algorithmParameterSpec).getName() : ((org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName()), secureRandom);
            return;
        }
        if (algorithmParameterSpec != null || org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() == null) {
            if (algorithmParameterSpec == null && org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() == null) {
                throw new java.security.InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("parameter object not a ECParameterSpec: ");
            sb.append(algorithmParameterSpec.getClass().getName());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
        this.getHighSpeedVideoFpsRangesFor = algorithmParameterSpec;
        org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters3 = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH()), secureRandom);
        this.getHighSpeedVideoSizes = eCKeyGenerationParameters3;
        this.Camera2StreamConfigurationMap.init(eCKeyGenerationParameters3);
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        this.getOutputFormats = i;
        this.getOutputMinFrameDuration = secureRandom;
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
        if (obj == null) {
            throw new java.security.InvalidParameterException("unknown key size.");
        }
        try {
            initialize((java.security.spec.ECGenParameterSpec) obj, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException unused) {
            throw new java.security.InvalidParameterException("key size not configurable.");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("EC Key Pair Generator not initialised");
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.Camera2StreamConfigurationMap.generateKeyPair();
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) generateKeyPair.getPublic();
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) generateKeyPair.getPrivate();
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
        if (obj instanceof org.bouncycastle.jce.spec.ECParameterSpec) {
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) obj;
            org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey bCECGOST3410PublicKey = new org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey(this.getHighResolutionOutputSizeshNQ4ISI, eCPublicKeyParameters, eCParameterSpec);
            return new java.security.KeyPair(bCECGOST3410PublicKey, new org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey(this.getHighResolutionOutputSizeshNQ4ISI, eCPrivateKeyParameters, bCECGOST3410PublicKey, eCParameterSpec));
        }
        if (obj == null) {
            return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey(this.getHighResolutionOutputSizeshNQ4ISI, eCPublicKeyParameters), new org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey(this.getHighResolutionOutputSizeshNQ4ISI, eCPrivateKeyParameters));
        }
        java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) obj;
        org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey bCECGOST3410PublicKey2 = new org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey(this.getHighResolutionOutputSizeshNQ4ISI, eCPublicKeyParameters, eCParameterSpec2);
        return new java.security.KeyPair(bCECGOST3410PublicKey2, new org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey(this.getHighResolutionOutputSizeshNQ4ISI, eCPrivateKeyParameters, bCECGOST3410PublicKey2, eCParameterSpec2));
    }

    private void getHighSpeedVideoFpsRangesFor(org.bouncycastle.jcajce.spec.GOST3410ParameterSpec gOST3410ParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier publicKeyParamSet = gOST3410ParameterSpec.getPublicKeyParamSet();
        org.bouncycastle.asn1.x9.X9ECParameters byOIDX9 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(publicKeyParamSet);
        if (byOIDX9 == null) {
            throw new java.security.InvalidAlgorithmParameterException("unknown curve: ".concat(java.lang.String.valueOf(publicKeyParamSet)));
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(publicKeyParamSet), byOIDX9.getCurve(), byOIDX9.getG(), byOIDX9.getN(), byOIDX9.getH(), byOIDX9.getSeed());
        org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECGOST3410Parameters(new org.bouncycastle.crypto.params.ECNamedDomainParameters(publicKeyParamSet, byOIDX9), publicKeyParamSet, gOST3410ParameterSpec.getDigestParamSet(), gOST3410ParameterSpec.getEncryptionParamSet()), secureRandom);
        this.getHighSpeedVideoSizes = eCKeyGenerationParameters;
        this.Camera2StreamConfigurationMap.init(eCKeyGenerationParameters);
        this.getHighSpeedVideoFpsRanges = true;
    }

    public KeyPairGeneratorSpi() {
        super("ECGOST3410");
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.generators.ECKeyPairGenerator();
        this.getHighResolutionOutputSizeshNQ4ISI = "ECGOST3410";
        this.getOutputFormats = 239;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = false;
    }
}
