package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes17.dex */
public class BasicGCMMultiplier implements org.bouncycastle.crypto.modes.gcm.GCMMultiplier {
    private long[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] asLongs = org.bouncycastle.crypto.modes.gcm.GCMUtil.asLongs(bArr);
        org.bouncycastle.crypto.modes.gcm.GCMUtil.multiply(asLongs, this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.crypto.modes.gcm.GCMUtil.asBytes(asLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.modes.gcm.GCMUtil.asLongs(bArr);
    }
}
