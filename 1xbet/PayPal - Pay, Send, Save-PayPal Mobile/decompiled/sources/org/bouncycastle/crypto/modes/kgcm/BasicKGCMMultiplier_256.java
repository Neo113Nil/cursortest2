package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes17.dex */
public class BasicKGCMMultiplier_256 implements org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier {
    private final long[] getHighResolutionOutputSizeshNQ4ISI = new long[4];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_256.multiply(jArr, this.getHighResolutionOutputSizeshNQ4ISI, jArr);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        org.bouncycastle.crypto.modes.kgcm.KGCMUtil_256.copy(jArr, this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
