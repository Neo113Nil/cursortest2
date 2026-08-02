package org.bouncycastle.jcajce.provider.asymmetric.gost;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    org.bouncycastle.jce.spec.GOST3410ParameterSpec Camera2StreamConfigurationMap;
    org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.crypto.generators.GOST3410KeyPairGenerator getHighSpeedVideoFpsRanges;
    java.security.SecureRandom getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof org.bouncycastle.jce.spec.GOST3410ParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
        }
        getHighSpeedVideoFpsRangesFor((org.bouncycastle.jce.spec.GOST3410ParameterSpec) algorithmParameterSpec, secureRandom);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        this.getInputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.getHighSpeedVideoSizes) {
            getHighSpeedVideoFpsRangesFor(new org.bouncycastle.jce.spec.GOST3410ParameterSpec(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94_CryptoPro_A.getId()), org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRanges.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey((org.bouncycastle.crypto.params.GOST3410PublicKeyParameters) generateKeyPair.getPublic(), this.Camera2StreamConfigurationMap), new org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PrivateKey((org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters) generateKeyPair.getPrivate(), this.Camera2StreamConfigurationMap));
    }

    private void getHighSpeedVideoFpsRangesFor(org.bouncycastle.jce.spec.GOST3410ParameterSpec gOST3410ParameterSpec, java.security.SecureRandom secureRandom) {
        org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec publicKeyParameters = gOST3410ParameterSpec.getPublicKeyParameters();
        org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters gOST3410KeyGenerationParameters = new org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters(secureRandom, new org.bouncycastle.crypto.params.GOST3410Parameters(publicKeyParameters.getP(), publicKeyParameters.getQ(), publicKeyParameters.getA()));
        this.getHighResolutionOutputSizeshNQ4ISI = gOST3410KeyGenerationParameters;
        this.getHighSpeedVideoFpsRanges.init(gOST3410KeyGenerationParameters);
        this.getHighSpeedVideoSizes = true;
        this.Camera2StreamConfigurationMap = gOST3410ParameterSpec;
    }

    public KeyPairGeneratorSpi() {
        super("GOST3410");
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.generators.GOST3410KeyPairGenerator();
        this.getInputSizeshNQ4ISI = 1024;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = false;
    }
}
