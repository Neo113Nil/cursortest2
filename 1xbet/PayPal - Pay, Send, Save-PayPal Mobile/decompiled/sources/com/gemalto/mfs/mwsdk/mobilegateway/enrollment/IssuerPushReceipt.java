package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public class IssuerPushReceipt {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getOutputMinFrameDuration;

    public IssuerPushReceipt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getOutputMinFrameDuration = str3;
    }

    public void version(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 11) + (i | 11);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoFpsRangesFor = str;
            int i3 = ((i | 63) << 1) - (i ^ 63);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String getScheme() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    public java.lang.String getType() {
        int i = (Camera2StreamConfigurationMap + 77) % 128;
        getHighSpeedVideoSizes = i;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i + 95) % 128;
        return str;
    }

    public java.lang.String getPayload() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i ^ 115) + ((i & 115) << 1)) % 128;
        getHighSpeedVideoSizes = i2;
        java.lang.String str = this.getOutputMinFrameDuration;
        Camera2StreamConfigurationMap = (i2 + 39) % 128;
        return str;
    }

    public java.lang.String getVersion() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 103;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i + 41) % 128;
        return str;
    }
}
