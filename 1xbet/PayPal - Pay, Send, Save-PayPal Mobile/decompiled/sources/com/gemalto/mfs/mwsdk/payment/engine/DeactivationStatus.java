package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes3.dex */
public class DeactivationStatus {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode getHighSpeedVideoSizes;

    public DeactivationStatus(com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = deactivationStatusCode;
    }

    public java.lang.String getMessage() {
        int i = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        getHighSpeedVideoFpsRanges = i;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 77) + (i | 77);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode getSdkStatusCode() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode = this.getHighSpeedVideoSizes;
        int i3 = (i ^ 95) + ((i & 95) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return deactivationStatusCode;
        }
        throw null;
    }
}
