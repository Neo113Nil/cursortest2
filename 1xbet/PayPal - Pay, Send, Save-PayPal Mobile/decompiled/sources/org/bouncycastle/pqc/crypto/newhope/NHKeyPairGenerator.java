package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
public class NHKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private java.security.SecureRandom Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.Camera2StreamConfigurationMap = keyGenerationParameters.getRandom();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        byte[] bArr = new byte[1824];
        short[] sArr = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.NewHope.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, bArr, sArr);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters(bArr), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters(sArr));
    }
}
