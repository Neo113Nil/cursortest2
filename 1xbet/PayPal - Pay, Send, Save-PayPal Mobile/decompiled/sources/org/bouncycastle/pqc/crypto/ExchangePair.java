package org.bouncycastle.pqc.crypto;

/* loaded from: classes17.dex */
public class ExchangePair {
    private final byte[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor;

    public byte[] getSharedValue() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublicKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public ExchangePair(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = asymmetricKeyParameter;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
