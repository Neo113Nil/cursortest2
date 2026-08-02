package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class SeedDerive {
    private final org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    public final byte[] Camera2StreamConfigurationMap(byte[] bArr, int i) {
        if (bArr.length < this.Camera2StreamConfigurationMap.getDigestSize()) {
            throw new java.lang.IllegalArgumentException("target length is less than digest size.");
        }
        org.bouncycastle.crypto.Digest digest = this.Camera2StreamConfigurationMap;
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        digest.update(bArr2, 0, bArr2.length);
        this.Camera2StreamConfigurationMap.update((byte) (this.getHighSpeedVideoFpsRanges >>> 24));
        this.Camera2StreamConfigurationMap.update((byte) (this.getHighSpeedVideoFpsRanges >>> 16));
        this.Camera2StreamConfigurationMap.update((byte) (this.getHighSpeedVideoFpsRanges >>> 8));
        this.Camera2StreamConfigurationMap.update((byte) this.getHighSpeedVideoFpsRanges);
        this.Camera2StreamConfigurationMap.update((byte) (this.getHighResolutionOutputSizeshNQ4ISI >>> 8));
        this.Camera2StreamConfigurationMap.update((byte) this.getHighResolutionOutputSizeshNQ4ISI);
        this.Camera2StreamConfigurationMap.update((byte) -1);
        org.bouncycastle.crypto.Digest digest2 = this.Camera2StreamConfigurationMap;
        byte[] bArr3 = this.getHighSpeedVideoSizes;
        digest2.update(bArr3, 0, bArr3.length);
        this.Camera2StreamConfigurationMap.doFinal(bArr, i);
        return bArr;
    }

    public SeedDerive(byte[] bArr, byte[] bArr2, org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoSizes = bArr2;
        this.Camera2StreamConfigurationMap = digest;
    }
}
