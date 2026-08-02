package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class Ed25519KeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoFpsRanges = keyGenerationParameters.getRandom();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = new org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) ed25519PrivateKeyParameters.generatePublicKey(), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) ed25519PrivateKeyParameters);
    }
}
