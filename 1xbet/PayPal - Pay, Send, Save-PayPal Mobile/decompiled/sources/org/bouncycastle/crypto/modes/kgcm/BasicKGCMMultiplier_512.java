package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes17.dex */
public class BasicKGCMMultiplier_512 implements org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier {
    private final long[] getHighSpeedVideoSizes = new long[8];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.multiply(jArr, this.getHighSpeedVideoSizes, jArr);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_512.copy(jArr, this.getHighSpeedVideoSizes);
    }
}
