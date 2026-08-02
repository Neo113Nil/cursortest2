package com.visa.cbp;

/* loaded from: classes16.dex */
class getDeviceName {
    private byte Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    public getDeviceName(byte[] bArr, byte[] bArr2, byte[] bArr3, byte b) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoSizes = bArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr3;
        this.Camera2StreamConfigurationMap = (byte) (b & com.google.common.base.Ascii.SI);
    }

    public byte[] Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte getHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap;
    }
}
