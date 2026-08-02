package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class LMOtsPrivateKey {
    final org.bouncycastle.pqc.crypto.lms.LMOtsParameters Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    final byte[] getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    final org.bouncycastle.pqc.crypto.lms.SeedDerive getHighSpeedVideoFpsRanges() {
        org.bouncycastle.pqc.crypto.lms.SeedDerive seedDerive = new org.bouncycastle.pqc.crypto.lms.SeedDerive(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.getDigestOID()));
        seedDerive.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
        return seedDerive;
    }

    public LMOtsPrivateKey(org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        this.Camera2StreamConfigurationMap = lMOtsParameters;
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
    }
}
