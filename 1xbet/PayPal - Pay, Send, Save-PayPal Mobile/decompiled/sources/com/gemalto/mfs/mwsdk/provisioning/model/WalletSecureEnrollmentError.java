package com.gemalto.mfs.mwsdk.provisioning.model;

/* loaded from: classes8.dex */
public class WalletSecureEnrollmentError {
    public static final int CPS_ERROR_CODE_DEFAULT = -1;
    public static final int HTTP_STATUS_CODE_DEFAULT = -2;
    public static final int HTTP_STATUS_CODE_NO_INTERNET = -101;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes getInputFormats;
    private final int getInputSizeshNQ4ISI;
    private final java.lang.Throwable getOutputFormats;

    public WalletSecureEnrollmentError(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes, int i, int i2, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this(walletSecureEnrollmentErrorCodes, i, i2, str, null, map);
    }

    public WalletSecureEnrollmentError(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes, int i, int i2, java.lang.String str, java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f794);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        java.lang.String str3 = util.h.xy.al.ra.f647;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str3, sb2.toString());
        this.getInputFormats = walletSecureEnrollmentErrorCodes;
        this.getHighSpeedVideoFpsRanges = i;
        this.getInputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputFormats = th;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    public com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes getSdkErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f794);
        sb.append(util.h.xy.al.ra.f555);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = this.getInputFormats;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 107) % 128;
        return walletSecureEnrollmentErrorCodes;
    }

    public int getHttpStatusCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f794);
        sb.append(util.h.xy.al.ra.f620);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i2 | 19) << 1) - (i2 ^ 19)) % 128;
        return i;
    }

    public int getCpsErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f794);
        sb.append(util.h.xy.al.ra.f581);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.getInputSizeshNQ4ISI;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public java.lang.String getErrorMessage() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f794);
        sb.append(util.h.xy.al.ra.f496);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 3) % 128;
        return str2;
    }

    public java.util.Map<java.lang.String, java.lang.String> getStatusAdditionalInfo() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f794);
        sb.append(util.h.xy.al.ra.f615);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i ^ 57) + ((i & 57) << 1)) % 128;
        return map;
    }

    public java.lang.Throwable getCausingException() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f794);
        sb.append(util.h.xy.al.ra.f491);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.Throwable th = this.getOutputFormats;
        int i = getHighSpeedVideoSizes + 111;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return th;
        }
        throw null;
    }
}
