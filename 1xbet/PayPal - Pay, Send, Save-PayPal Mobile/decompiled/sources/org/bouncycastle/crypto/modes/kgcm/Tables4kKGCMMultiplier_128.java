package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes17.dex */
public class Tables4kKGCMMultiplier_128 implements org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier {
    private long[][] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        long[] jArr2 = new long[2];
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.copy(this.getHighSpeedVideoFpsRangesFor[((int) (jArr[1] >>> 56)) & 255], jArr2);
        for (int i = 14; i >= 0; i--) {
            org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.multiplyX8(jArr2, jArr2);
            org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.add(this.getHighSpeedVideoFpsRangesFor[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.copy(jArr2, jArr);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        long[][] jArr2 = this.getHighSpeedVideoFpsRangesFor;
        if (jArr2 == null) {
            this.getHighSpeedVideoFpsRangesFor = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, 256, 2);
        } else if (org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.equal(jArr, jArr2[1])) {
            return;
        }
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.copy(jArr, this.getHighSpeedVideoFpsRangesFor[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr3 = this.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.multiplyX(jArr3[i >> 1], jArr3[i]);
            long[][] jArr4 = this.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.add(jArr4[i], jArr4[1], jArr4[i + 1]);
        }
    }
}
