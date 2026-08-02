package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes17.dex */
public class Tables8kGCMMultiplier implements org.bouncycastle.crypto.modes.gcm.GCMMultiplier {
    private byte[] getHighSpeedVideoFpsRanges;
    private long[][][] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long j = 0;
        long j2 = 0;
        for (int i = 15; i >= 0; i--) {
            long[][][] jArr = this.getHighSpeedVideoFpsRangesFor;
            int i2 = i + i;
            long[][] jArr2 = jArr[i2 + 1];
            byte b = bArr[i];
            long[] jArr3 = jArr2[b & com.google.common.base.Ascii.SI];
            long[] jArr4 = jArr[i2][(b & com.visa.cbp.getEncExpo.onUnminimized) >>> 4];
            j ^= jArr3[0] ^ jArr4[0];
            j2 ^= jArr4[1] ^ jArr3[1];
        }
        org.bouncycastle.util.Pack.longToBigEndian(j, bArr, 0);
        org.bouncycastle.util.Pack.longToBigEndian(j2, bArr, 8);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = (long[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, 32, 16, 2);
        } else if (org.bouncycastle.crypto.modes.gcm.GCMUtil.areEqual(this.getHighSpeedVideoFpsRanges, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.getHighSpeedVideoFpsRanges = bArr2;
        org.bouncycastle.crypto.modes.gcm.GCMUtil.copy(bArr, bArr2);
        for (int i = 0; i < 32; i++) {
            long[][][] jArr = this.getHighSpeedVideoFpsRangesFor;
            long[][] jArr2 = jArr[i];
            if (i == 0) {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.asLongs(this.getHighSpeedVideoFpsRanges, jArr2[1]);
                long[] jArr3 = jArr2[1];
                org.bouncycastle.crypto.modes.gcm.GCMUtil.multiplyP3(jArr3, jArr3);
            } else {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.multiplyP4(jArr[i - 1][1], jArr2[1]);
            }
            for (int i2 = 2; i2 < 16; i2 += 2) {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.divideP(jArr2[i2 >> 1], jArr2[i2]);
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(jArr2[i2], jArr2[1], jArr2[i2 + 1]);
            }
        }
    }
}
