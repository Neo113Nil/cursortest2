package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class Ed448KeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private java.security.SecureRandom getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoFpsRangesFor = keyGenerationParameters.getRandom();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.Ed448PrivateKeyParameters ed448PrivateKeyParameters = new org.bouncycastle.crypto.params.Ed448PrivateKeyParameters(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) ed448PrivateKeyParameters.generatePublicKey(), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) ed448PrivateKeyParameters);
    }
}
