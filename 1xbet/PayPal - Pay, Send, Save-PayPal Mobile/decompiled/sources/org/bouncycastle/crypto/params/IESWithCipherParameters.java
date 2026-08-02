package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class IESWithCipherParameters extends org.bouncycastle.crypto.params.IESParameters {
    private int getHighSpeedVideoFpsRangesFor;

    public int getCipherKeySize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public IESWithCipherParameters(byte[] bArr, byte[] bArr2, int i, int i2) {
        super(bArr, bArr2, i);
        this.getHighSpeedVideoFpsRangesFor = i2;
    }
}
