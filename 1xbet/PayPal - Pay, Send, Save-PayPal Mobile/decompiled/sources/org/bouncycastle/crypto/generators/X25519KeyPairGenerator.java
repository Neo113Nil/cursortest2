package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class X25519KeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = keyGenerationParameters.getRandom();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.X25519PrivateKeyParameters x25519PrivateKeyParameters = new org.bouncycastle.crypto.params.X25519PrivateKeyParameters(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) x25519PrivateKeyParameters.generatePublicKey(), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) x25519PrivateKeyParameters);
    }
}
