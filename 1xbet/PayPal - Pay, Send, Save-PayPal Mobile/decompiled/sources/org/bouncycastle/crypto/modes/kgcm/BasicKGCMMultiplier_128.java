package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes17.dex */
public class BasicKGCMMultiplier_128 implements org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier {
    private final long[] getHighSpeedVideoSizes = new long[2];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.multiply(jArr, this.getHighSpeedVideoSizes, jArr);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_128.copy(jArr, this.getHighSpeedVideoSizes);
    }
}
