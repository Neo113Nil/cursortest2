package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public class Date {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;

    public Date(int i, int i2, int i3) {
    }

    public Date() {
    }

    public int getYear() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    public void setYear(int i) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i2 + 75) % 128;
        this.getHighSpeedVideoFpsRanges = i;
        int i3 = ((i2 | 115) << 1) - (i2 ^ 115);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public int getDay() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i ^ 65) + ((i & 65) << 1)) % 128;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i & 29) + (i | 29);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    public void setDay(int i) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 & 31) + (i2 | 31);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            int i4 = i2 + 57;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        throw new java.lang.ArithmeticException();
    }

    public int getMonth() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 111;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = ((i | 121) << 1) - (i ^ 121);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setMonth(int i) {
        int i2 = getHighSpeedVideoSizes + 25;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            this.Camera2StreamConfigurationMap = i;
        } else {
            this.Camera2StreamConfigurationMap = i;
            throw new java.lang.ArithmeticException();
        }
    }

    public boolean isValid() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 111) + ((i & 111) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        return i2 % 2 == 0;
    }

    public byte[] getDateAsByteArray() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i + 111) % 128;
        getHighSpeedVideoFpsRangesFor = (i + 79) % 128;
        return null;
    }
}
