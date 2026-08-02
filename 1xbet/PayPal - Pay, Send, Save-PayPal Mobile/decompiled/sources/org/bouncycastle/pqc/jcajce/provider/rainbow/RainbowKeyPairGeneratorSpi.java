package org.bouncycastle.pqc.jcajce.provider.rainbow;

/* loaded from: classes17.dex */
public class RainbowKeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    boolean Camera2StreamConfigurationMap;
    org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters getHighResolutionOutputSizeshNQ4ISI;
    java.security.SecureRandom getHighSpeedVideoFpsRanges;
    org.bouncycastle.pqc.crypto.rainbow.RainbowKeyPairGenerator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a RainbowParameterSpec");
        }
        org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters rainbowKeyGenerationParameters = new org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters(secureRandom, new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters(((org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec) algorithmParameterSpec).getVi()));
        this.getHighResolutionOutputSizeshNQ4ISI = rainbowKeyGenerationParameters;
        this.getHighSpeedVideoFpsRangesFor.init(rainbowKeyGenerationParameters);
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.Camera2StreamConfigurationMap) {
            org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters rainbowKeyGenerationParameters = new org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters(this.getHighSpeedVideoFpsRanges, new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters(new org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec().getVi()));
            this.getHighResolutionOutputSizeshNQ4ISI = rainbowKeyGenerationParameters;
            this.getHighSpeedVideoFpsRangesFor.init(rainbowKeyGenerationParameters);
            this.Camera2StreamConfigurationMap = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRangesFor.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey((org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey((org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public RainbowKeyPairGeneratorSpi() {
        super("Rainbow");
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.crypto.rainbow.RainbowKeyPairGenerator();
        this.getHighSpeedVideoSizes = 1024;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.Camera2StreamConfigurationMap = false;
    }
}
