package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes17.dex */
public class BasicGCMExponentiator implements org.bouncycastle.crypto.modes.gcm.GCMExponentiator {
    private long[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.modes.gcm.GCMUtil.asLongs(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j, byte[] bArr) {
        long[] oneAsLongs = org.bouncycastle.crypto.modes.gcm.GCMUtil.oneAsLongs();
        if (j > 0) {
            long[] jArr = new long[2];
            org.bouncycastle.crypto.modes.gcm.GCMUtil.copy(this.getHighResolutionOutputSizeshNQ4ISI, jArr);
            do {
                if ((1 & j) != 0) {
                    org.bouncycastle.crypto.modes.gcm.GCMUtil.multiply(oneAsLongs, jArr);
                }
                org.bouncycastle.crypto.modes.gcm.GCMUtil.square(jArr, jArr);
                j >>>= 1;
            } while (j > 0);
        }
        org.bouncycastle.crypto.modes.gcm.GCMUtil.asBytes(oneAsLongs, bArr);
    }
}
