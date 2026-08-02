package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public class MerchantIdentifier {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;

    public java.lang.String getClientID() {
        int i = getHighSpeedVideoSizes + 89;
        getHighSpeedVideoFpsRangesFor = i % 128;
        java.lang.String str = this.getInputSizeshNQ4ISI;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setClientID(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 7) + (i | 7);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            this.getInputSizeshNQ4ISI = str;
        } else {
            this.getInputSizeshNQ4ISI = str;
            throw null;
        }
    }

    public java.lang.String getAcquireID() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 67) + ((i & 67) << 1)) % 128;
        getHighSpeedVideoSizes = i2;
        java.lang.String str = this.getInputFormats;
        getHighSpeedVideoFpsRangesFor = (((i2 | 95) << 1) - (i2 ^ 95)) % 128;
        return str;
    }

    public void setAcquireID(java.lang.String str) {
        int i = (getHighSpeedVideoFpsRangesFor + 87) % 128;
        getHighSpeedVideoSizes = i;
        this.getInputFormats = str;
        getHighSpeedVideoFpsRangesFor = ((i & 103) + (i | 103)) % 128;
    }

    public java.lang.String getMerchantID() {
        int i = getHighSpeedVideoSizes;
        int i2 = (((i | 103) << 1) - (i ^ 103)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 117) % 128;
        return str;
    }

    public void setMerchantID(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 95) << 1) - (i ^ 95);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            throw null;
        }
    }

    public java.lang.String getApplicationURL() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 49;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.Camera2StreamConfigurationMap;
        int i3 = (i & 9) + (i | 9);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setApplicationURL(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 75) << 1) - (i ^ 75);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 != 0) {
            this.Camera2StreamConfigurationMap = str;
            int i4 = i3 + 63;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.Camera2StreamConfigurationMap = str;
        throw null;
    }

    public java.lang.String getMerchantName() {
        int i = getHighSpeedVideoSizes + 99;
        getHighSpeedVideoFpsRangesFor = i % 128;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setMerchantName(java.lang.String str) {
        int i = (getHighSpeedVideoFpsRangesFor + 17) % 128;
        getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = str;
        getHighSpeedVideoFpsRangesFor = (i + 63) % 128;
    }
}
