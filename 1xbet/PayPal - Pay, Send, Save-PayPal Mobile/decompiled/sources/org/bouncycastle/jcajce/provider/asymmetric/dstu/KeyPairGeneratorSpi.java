package org.bouncycastle.jcajce.provider.asymmetric.dstu;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    boolean Camera2StreamConfigurationMap;
    org.bouncycastle.crypto.params.ECKeyGenerationParameters getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.crypto.generators.ECKeyPairGenerator getHighSpeedVideoSizes;
    java.security.SecureRandom getOutputFormats;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.ECKeyGenerationParameters eCKeyGenerationParameters;
        if (algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECParameterSpec) {
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoFpsRangesFor = algorithmParameterSpec;
            eCKeyGenerationParameters = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH()), secureRandom);
        } else {
            if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
                java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
                this.getHighSpeedVideoFpsRangesFor = algorithmParameterSpec;
                org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec2.getCurve());
                org.bouncycastle.math.ec.ECPoint convertPoint = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, eCParameterSpec2.getGenerator());
                if (eCParameterSpec2 instanceof org.bouncycastle.jcajce.spec.DSTU4145ParameterSpec) {
                    this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.DSTU4145Parameters(new org.bouncycastle.crypto.params.ECDomainParameters(convertCurve, convertPoint, eCParameterSpec2.getOrder(), java.math.BigInteger.valueOf(eCParameterSpec2.getCofactor())), ((org.bouncycastle.jcajce.spec.DSTU4145ParameterSpec) eCParameterSpec2).getDKE()), secureRandom);
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(convertCurve, convertPoint, eCParameterSpec2.getOrder(), java.math.BigInteger.valueOf(eCParameterSpec2.getCofactor())), secureRandom);
                }
                this.getHighSpeedVideoSizes.init(this.getHighResolutionOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap = true;
            }
            boolean z = algorithmParameterSpec instanceof java.security.spec.ECGenParameterSpec;
            if (z || (algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec)) {
                java.lang.String name2 = z ? ((java.security.spec.ECGenParameterSpec) algorithmParameterSpec).getName() : ((org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
                org.bouncycastle.crypto.params.ECDomainParameters byOID = org.bouncycastle.asn1.ua.DSTU4145NamedCurves.getByOID(new org.bouncycastle.asn1.ASN1ObjectIdentifier(name2));
                if (byOID == null) {
                    throw new java.security.InvalidAlgorithmParameterException("unknown curve name: ".concat(java.lang.String.valueOf(name2)));
                }
                org.bouncycastle.jce.spec.ECNamedCurveSpec eCNamedCurveSpec = new org.bouncycastle.jce.spec.ECNamedCurveSpec(name2, byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
                this.getHighSpeedVideoFpsRangesFor = eCNamedCurveSpec;
                org.bouncycastle.jce.spec.ECNamedCurveSpec eCNamedCurveSpec2 = eCNamedCurveSpec;
                org.bouncycastle.math.ec.ECCurve convertCurve2 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCNamedCurveSpec2.getCurve());
                eCKeyGenerationParameters = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(convertCurve2, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve2, eCNamedCurveSpec2.getGenerator()), eCNamedCurveSpec2.getOrder(), java.math.BigInteger.valueOf(eCNamedCurveSpec2.getCofactor())), secureRandom);
            } else {
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
                eCKeyGenerationParameters = new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH()), secureRandom);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = eCKeyGenerationParameters;
        this.getHighSpeedVideoSizes.init(eCKeyGenerationParameters);
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        this.getOutputFormats = secureRandom;
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
        if (!this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("DSTU Key Pair Generator not initialised");
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoSizes.generateKeyPair();
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) generateKeyPair.getPublic();
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) generateKeyPair.getPrivate();
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
        if (obj instanceof org.bouncycastle.jce.spec.ECParameterSpec) {
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) obj;
            org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey bCDSTU4145PublicKey = new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey(this.getHighSpeedVideoFpsRanges, eCPublicKeyParameters, eCParameterSpec);
            return new java.security.KeyPair(bCDSTU4145PublicKey, new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey(this.getHighSpeedVideoFpsRanges, eCPrivateKeyParameters, bCDSTU4145PublicKey, eCParameterSpec));
        }
        if (obj == null) {
            return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey(this.getHighSpeedVideoFpsRanges, eCPublicKeyParameters), new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey(this.getHighSpeedVideoFpsRanges, eCPrivateKeyParameters));
        }
        java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) obj;
        org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey(this.getHighSpeedVideoFpsRanges, eCPublicKeyParameters, eCParameterSpec2);
        return new java.security.KeyPair(bCDSTU4145PublicKey2, new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey(this.getHighSpeedVideoFpsRanges, eCPrivateKeyParameters, bCDSTU4145PublicKey2, eCParameterSpec2));
    }

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.generators.DSTU4145KeyPairGenerator();
        this.getHighSpeedVideoFpsRanges = "DSTU4145";
        this.getOutputFormats = null;
        this.Camera2StreamConfigurationMap = false;
    }
}
