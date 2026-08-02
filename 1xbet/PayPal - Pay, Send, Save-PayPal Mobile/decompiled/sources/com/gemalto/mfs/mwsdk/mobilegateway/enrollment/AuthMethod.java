package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public class AuthMethod {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoSizes;

    public java.lang.String getType() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 19) + (i | 19);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setType(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 93) + (i | 93);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            this.Camera2StreamConfigurationMap = str;
        } else {
            this.Camera2StreamConfigurationMap = str;
            throw null;
        }
    }

    public java.lang.String getId() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 73) % 128;
        java.lang.String str = this.getHighSpeedVideoSizes;
        int i2 = (i & 67) + (i | 67);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setId(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 81) + ((i & 81) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoSizes = str;
        getHighSpeedVideoFpsRangesFor = (i2 + 97) % 128;
    }
}
