package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class ElGamalKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters) keyGenerationParameters;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.generators.DHKeyGeneratorHelper dHKeyGeneratorHelper = org.bouncycastle.crypto.generators.DHKeyGeneratorHelper.getHighSpeedVideoFpsRanges;
        org.bouncycastle.crypto.params.ElGamalParameters parameters = this.Camera2StreamConfigurationMap.getParameters();
        org.bouncycastle.crypto.params.DHParameters dHParameters = new org.bouncycastle.crypto.params.DHParameters(parameters.getP(), parameters.getG(), null, parameters.getL());
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.generators.DHKeyGeneratorHelper.getHighResolutionOutputSizeshNQ4ISI(dHParameters, this.Camera2StreamConfigurationMap.getRandom());
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.ElGamalPublicKeyParameters(org.bouncycastle.crypto.generators.DHKeyGeneratorHelper.getHighSpeedVideoFpsRanges(dHParameters, highResolutionOutputSizeshNQ4ISI), parameters), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters(highResolutionOutputSizeshNQ4ISI, parameters));
    }
}
