package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class DHKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private org.bouncycastle.crypto.params.DHKeyGenerationParameters getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.DHKeyGenerationParameters) keyGenerationParameters;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.generators.DHKeyGeneratorHelper dHKeyGeneratorHelper = org.bouncycastle.crypto.generators.DHKeyGeneratorHelper.getHighSpeedVideoFpsRanges;
        org.bouncycastle.crypto.params.DHParameters parameters = this.getHighResolutionOutputSizeshNQ4ISI.getParameters();
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.generators.DHKeyGeneratorHelper.getHighResolutionOutputSizeshNQ4ISI(parameters, this.getHighResolutionOutputSizeshNQ4ISI.getRandom());
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.DHPublicKeyParameters(org.bouncycastle.crypto.generators.DHKeyGeneratorHelper.getHighSpeedVideoFpsRanges(parameters, highResolutionOutputSizeshNQ4ISI), parameters), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.DHPrivateKeyParameters(highResolutionOutputSizeshNQ4ISI, parameters));
    }
}
