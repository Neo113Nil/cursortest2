package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    org.bouncycastle.crypto.params.ECKeyGenerationParameters Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.crypto.generators.ECKeyPairGenerator getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    java.security.SecureRandom getInputFormats;
    int getOutputMinFrameDuration;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST3410ParameterSpec) {
            getHighSpeedVideoSizes((org.bouncycastle.jcajce.spec.GOST3410ParameterSpec) algorithmParameterSpec, secureRandom);
            return;
        }
        if (algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECParameterSpec) {
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) algorithmParameterSpec;
            this.getHighResolutionOutputSizeshNQ4ISI = algorithmParameterSpec;
            org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH()), secureRandom);
            this.Camera2StreamConfigurationMap = eCKeyGenerationParameters;
            this.getHighSpeedVideoFpsRanges.init(eCKeyGenerationParameters);
            this.getHighSpeedVideoSizes = true;
            return;
        }
        if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
            java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
            this.getHighResolutionOutputSizeshNQ4ISI = algorithmParameterSpec;
            org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec2.getCurve());
            org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters2 = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(convertCurve, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, eCParameterSpec2.getGenerator()), eCParameterSpec2.getOrder(), java.math.BigInteger.valueOf(eCParameterSpec2.getCofactor())), secureRandom);
            this.Camera2StreamConfigurationMap = eCKeyGenerationParameters2;
            this.getHighSpeedVideoFpsRanges.init(eCKeyGenerationParameters2);
            this.getHighSpeedVideoSizes = true;
            return;
        }
        boolean z = algorithmParameterSpec instanceof java.security.spec.ECGenParameterSpec;
        if (z || (algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec)) {
            getHighSpeedVideoSizes(new org.bouncycastle.jcajce.spec.GOST3410ParameterSpec(z ? ((java.security.spec.ECGenParameterSpec) algorithmParameterSpec).getName() : ((org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName()), secureRandom);
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
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmParameterSpec;
        org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters3 = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH()), secureRandom);
        this.Camera2StreamConfigurationMap = eCKeyGenerationParameters3;
        this.getHighSpeedVideoFpsRanges.init(eCKeyGenerationParameters3);
        this.getHighSpeedVideoSizes = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        this.getOutputMinFrameDuration = i;
        this.getInputFormats = secureRandom;
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
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
        if (!this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("EC Key Pair Generator not initialised");
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRanges.generateKeyPair();
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) generateKeyPair.getPublic();
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) generateKeyPair.getPrivate();
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        if (obj instanceof org.bouncycastle.jce.spec.ECParameterSpec) {
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) obj;
            org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey(this.getHighSpeedVideoFpsRangesFor, eCPublicKeyParameters, eCParameterSpec);
            return new java.security.KeyPair(bCECGOST3410_2012PublicKey, new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey(this.getHighSpeedVideoFpsRangesFor, eCPrivateKeyParameters, bCECGOST3410_2012PublicKey, eCParameterSpec));
        }
        if (obj == null) {
            return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey(this.getHighSpeedVideoFpsRangesFor, eCPublicKeyParameters), new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey(this.getHighSpeedVideoFpsRangesFor, eCPrivateKeyParameters));
        }
        java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) obj;
        org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey2 = new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey(this.getHighSpeedVideoFpsRangesFor, eCPublicKeyParameters, eCParameterSpec2);
        return new java.security.KeyPair(bCECGOST3410_2012PublicKey2, new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey(this.getHighSpeedVideoFpsRangesFor, eCPrivateKeyParameters, bCECGOST3410_2012PublicKey2, eCParameterSpec2));
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.jcajce.spec.GOST3410ParameterSpec gOST3410ParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.asn1.x9.X9ECParameters byOIDX9 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(gOST3410ParameterSpec.getPublicKeyParamSet());
        if (byOIDX9 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown curve: ");
            sb.append(gOST3410ParameterSpec.getPublicKeyParamSet());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jce.spec.ECNamedCurveSpec(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(gOST3410ParameterSpec.getPublicKeyParamSet()), byOIDX9.getCurve(), byOIDX9.getG(), byOIDX9.getN(), byOIDX9.getH(), byOIDX9.getSeed());
        org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECGOST3410Parameters(new org.bouncycastle.crypto.params.ECNamedDomainParameters(gOST3410ParameterSpec.getPublicKeyParamSet(), byOIDX9), gOST3410ParameterSpec.getPublicKeyParamSet(), gOST3410ParameterSpec.getDigestParamSet(), gOST3410ParameterSpec.getEncryptionParamSet()), secureRandom);
        this.Camera2StreamConfigurationMap = eCKeyGenerationParameters;
        this.getHighSpeedVideoFpsRanges.init(eCKeyGenerationParameters);
        this.getHighSpeedVideoSizes = true;
    }

    public KeyPairGeneratorSpi() {
        super("ECGOST3410-2012");
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.generators.ECKeyPairGenerator();
        this.getHighSpeedVideoFpsRangesFor = "ECGOST3410-2012";
        this.getOutputMinFrameDuration = 239;
        this.getInputFormats = null;
        this.getHighSpeedVideoSizes = false;
    }
}
