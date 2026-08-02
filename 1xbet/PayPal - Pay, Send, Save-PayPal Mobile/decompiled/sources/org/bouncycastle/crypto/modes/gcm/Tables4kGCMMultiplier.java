package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes17.dex */
public class Tables4kGCMMultiplier implements org.bouncycastle.crypto.modes.gcm.GCMMultiplier {
    private byte[] getHighSpeedVideoFpsRanges;
    private long[][] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.getHighSpeedVideoFpsRangesFor[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.getHighSpeedVideoFpsRangesFor[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        org.bouncycastle.util.Pack.longToBigEndian(j, bArr, 0);
        org.bouncycastle.util.Pack.longToBigEndian(j2, bArr, 8);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, 256, 2);
        } else if (org.bouncycastle.crypto.modes.gcm.GCMUtil.areEqual(this.getHighSpeedVideoFpsRanges, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.getHighSpeedVideoFpsRanges = bArr2;
        org.bouncycastle.crypto.modes.gcm.GCMUtil.copy(bArr, bArr2);
        org.bouncycastle.crypto.modes.gcm.GCMUtil.asLongs(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor[1]);
        long[] jArr = this.getHighSpeedVideoFpsRangesFor[1];
        org.bouncycastle.crypto.modes.gcm.GCMUtil.multiplyP7(jArr, jArr);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr2 = this.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.crypto.modes.gcm.GCMUtil.divideP(jArr2[i >> 1], jArr2[i]);
            long[][] jArr3 = this.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(jArr3[i], jArr3[1], jArr3[i + 1]);
        }
    }
}
