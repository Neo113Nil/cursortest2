package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes17.dex */
public class Tables64kGCMMultiplier implements org.bouncycastle.crypto.modes.gcm.GCMMultiplier {
    private byte[] getHighSpeedVideoFpsRanges;
    private long[][][] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.getHighSpeedVideoFpsRangesFor[15][bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.getHighSpeedVideoFpsRangesFor[i][bArr[i] & 255];
            j ^= jArr2[0];
            j2 ^= jArr2[1];
        }
        org.bouncycastle.util.Pack.longToBigEndian(j, bArr, 0);
        org.bouncycastle.util.Pack.longToBigEndian(j2, bArr, 8);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = (long[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, 16, 256, 2);
        } else if (org.bouncycastle.crypto.modes.gcm.GCMUtil.areEqual(this.getHighSpeedVideoFpsRanges, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.getHighSpeedVideoFpsRanges = bArr2;
        org.bouncycastle.crypto.modes.gcm.GCMUtil.copy(bArr, bArr2);
        for (int i = 0; i < 16; i++) {
            long[][][] jArr = this.getHighSpeedVideoFpsRangesFor;
            long[][] jArr2 = jArr[i];
            if (i == 0) {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.asLongs(this.getHighSpeedVideoFpsRanges, jArr2[1]);
                long[] jArr3 = jArr2[1];
                org.bouncycastle.crypto.modes.gcm.GCMUtil.multiplyP7(jArr3, jArr3);
            } else {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.multiplyP8(jArr[i - 1][1], jArr2[1]);
            }
            for (int i2 = 2; i2 < 256; i2 += 2) {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.divideP(jArr2[i2 >> 1], jArr2[i2]);
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(jArr2[i2], jArr2[1], jArr2[i2 + 1]);
            }
        }
    }
}
