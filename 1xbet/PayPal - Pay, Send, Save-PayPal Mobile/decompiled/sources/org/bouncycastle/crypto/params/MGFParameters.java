package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class MGFParameters implements org.bouncycastle.crypto.DerivationParameters {
    byte[] getHighSpeedVideoFpsRangesFor;

    public byte[] getSeed() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public MGFParameters(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.getHighSpeedVideoFpsRangesFor = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public MGFParameters(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
