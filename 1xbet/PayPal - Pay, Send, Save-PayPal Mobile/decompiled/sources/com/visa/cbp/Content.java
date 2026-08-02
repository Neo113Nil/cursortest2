package com.visa.cbp;

/* loaded from: classes5.dex */
public class Content {
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public void values(byte[] bArr) {
        this.Camera2StreamConfigurationMap = bArr;
    }

    public byte[] valueOf() {
        return this.Camera2StreamConfigurationMap;
    }

    public void ConfirmReplenishRequest(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }

    public byte[] ConfirmReplenishRequest() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] values() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void valueOf(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    public int ReplenishAckRequest() {
        return this.getHighSpeedVideoSizes;
    }

    public void values(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public void BuildConfig(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    public byte[] BuildConfig() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
