package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes17.dex */
public class Tables16kKGCMMultiplier_512 implements org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier {
    private long[][] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        long[] jArr2 = new long[8];
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.copy(this.getHighSpeedVideoSizes[((int) (jArr[7] >>> 56)) & 255], jArr2);
        for (int i = 62; i >= 0; i--) {
            org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.multiplyX8(jArr2, jArr2);
            org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.add(this.getHighSpeedVideoSizes[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.copy(jArr2, jArr);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        long[][] jArr2 = this.getHighSpeedVideoSizes;
        if (jArr2 == null) {
            this.getHighSpeedVideoSizes = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, 256, 8);
        } else if (org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.equal(jArr, jArr2[1])) {
            return;
        }
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.copy(jArr, this.getHighSpeedVideoSizes[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr3 = this.getHighSpeedVideoSizes;
            org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.multiplyX(jArr3[i >> 1], jArr3[i]);
            long[][] jArr4 = this.getHighSpeedVideoSizes;
            org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.add(jArr4[i], jArr4[1], jArr4[i + 1]);
        }
    }
}
