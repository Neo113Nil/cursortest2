package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class KDFParameters implements org.bouncycastle.crypto.DerivationParameters {
    byte[] getHighSpeedVideoFpsRanges;
    byte[] getHighSpeedVideoFpsRangesFor;

    public byte[] getSharedSecret() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getIV() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoFpsRanges = bArr2;
    }
}
