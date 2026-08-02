package com.gemalto.mfs.mwsdk.cdcvm;

/* loaded from: classes8.dex */
public class DeviceCVMVerifierInput {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.CharSequence Camera2StreamConfigurationMap;
    private java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.CharSequence getHighSpeedVideoFpsRanges;
    private com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMCancellationSignal getInputFormats;
    private java.lang.CharSequence getInputSizeshNQ4ISI;

    public DeviceCVMVerifierInput(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f298);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str, sb.toString());
        if (android.text.TextUtils.isEmpty(charSequence) || android.text.TextUtils.isEmpty(charSequence2) || android.text.TextUtils.isEmpty(charSequence3) || android.text.TextUtils.isEmpty(charSequence4)) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f454);
        }
        this.Camera2StreamConfigurationMap = charSequence;
        this.getInputSizeshNQ4ISI = charSequence2;
        this.getHighResolutionOutputSizeshNQ4ISI = charSequence3;
        this.getHighSpeedVideoFpsRanges = charSequence4;
        this.getInputFormats = new util.h.xy.aa.ra();
    }

    public com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMCancellationSignal getDeviceCVMCancellationSignal() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f298);
        sb.append(util.h.xy.al.ra.f405);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMCancellationSignal deviceCVMCancellationSignal = this.getInputFormats;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 15) % 128;
        return deviceCVMCancellationSignal;
    }

    public java.lang.CharSequence getTitle() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f298);
        sb.append(util.h.xy.al.ra.f645);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.CharSequence charSequence = this.Camera2StreamConfigurationMap;
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i & 17) + (i | 17)) % 128;
        return charSequence;
    }

    public java.lang.CharSequence getDescription() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f298);
        sb.append(util.h.xy.al.ra.f407);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.CharSequence charSequence = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 125) + (i | 125);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return charSequence;
        }
        throw null;
    }

    public java.lang.CharSequence getSubtitle() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f298);
        sb.append(util.h.xy.al.ra.f328);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.CharSequence charSequence = this.getInputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 3) % 128;
        return charSequence;
    }

    public java.lang.CharSequence getNegativeButtonText() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f298);
        sb.append(util.h.xy.al.ra.f404);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRanges;
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i | 11) << 1) - (i ^ 11)) % 128;
        return charSequence;
    }
}
