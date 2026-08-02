package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class X448KeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private java.security.SecureRandom Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.Camera2StreamConfigurationMap = keyGenerationParameters.getRandom();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.X448PrivateKeyParameters x448PrivateKeyParameters = new org.bouncycastle.crypto.params.X448PrivateKeyParameters(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) x448PrivateKeyParameters.generatePublicKey(), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) x448PrivateKeyParameters);
    }
}
