package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class RC2Parameters extends org.bouncycastle.crypto.params.KeyParameter {
    private int getHighSpeedVideoFpsRanges;

    public int getEffectiveKeyBits() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public RC2Parameters(byte[] bArr, int i) {
        super(bArr);
        this.getHighSpeedVideoFpsRanges = i;
    }

    public RC2Parameters(byte[] bArr) {
        this(bArr, bArr.length > 128 ? 1024 : bArr.length * 8);
    }
}
