package com.visa.cbp;

/* loaded from: classes16.dex */
public class getSignCert {
    byte[] Camera2StreamConfigurationMap;
    byte getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizes;

    public getSignCert(byte[] bArr, long j, java.lang.String str, byte b, byte[] bArr2) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = b;
    }

    public byte[] ConfirmReplenishRequest() {
        return this.Camera2StreamConfigurationMap;
    }

    public long BuildConfig() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String valueOf() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte values() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] ReplenishAckRequest() {
        return this.getHighSpeedVideoSizes;
    }
}
