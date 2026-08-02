package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public class EphemeralKeyPair {
    private org.bouncycastle.crypto.KeyEncoder Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.AsymmetricCipherKeyPair getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.crypto.AsymmetricCipherKeyPair getKeyPair() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getEncodedPublicKey() {
        return this.Camera2StreamConfigurationMap.getEncoded(this.getHighSpeedVideoFpsRangesFor.getPublic());
    }

    public EphemeralKeyPair(org.bouncycastle.crypto.AsymmetricCipherKeyPair asymmetricCipherKeyPair, org.bouncycastle.crypto.KeyEncoder keyEncoder) {
        this.getHighSpeedVideoFpsRangesFor = asymmetricCipherKeyPair;
        this.Camera2StreamConfigurationMap = keyEncoder;
    }
}
