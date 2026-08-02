package com.gemalto.mfs.mwsdk.provisioning.exception;

/* loaded from: classes8.dex */
public class WalletSecureEnrollmentException extends java.lang.Exception {
    public static final int CPS_ERROR_CODE_DEFAULT = -1;
    private static int Camera2StreamConfigurationMap = 0;
    public static final int HTTP_STATUS_CODE_DEFAULT = -2;
    public static final int HTTP_STATUS_CODE_NO_INTERNET = -101;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private final java.lang.Throwable getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;
    private final com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;
    private final int getOutputFormats;

    public WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes, int i, int i2, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this(walletSecureEnrollmentErrorCodes, i, i2, str, null, map);
    }

    public WalletSecureEnrollmentException(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes, int i, int i2, java.lang.String str, java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f647);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        java.lang.String str3 = util.h.xy.al.ra.f647;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str3, sb2.toString());
        this.getHighSpeedVideoSizesFor = walletSecureEnrollmentErrorCodes;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getOutputFormats = i2;
        this.getInputFormats = str;
        this.getHighSpeedVideoFpsRanges = th;
        this.getHighSpeedVideoSizes = map == null ? new java.util.HashMap<>() : map;
    }

    public com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes getSdkErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f829);
        sb.append(util.h.xy.al.ra.f555);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentErrorCodes walletSecureEnrollmentErrorCodes = this.getHighSpeedVideoSizesFor;
        int i = Camera2StreamConfigurationMap + 111;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return walletSecureEnrollmentErrorCodes;
        }
        throw new java.lang.ArithmeticException();
    }

    public int getHttpStatusCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f829);
        sb.append(util.h.xy.al.ra.f620);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public int getCpsErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f829);
        sb.append(util.h.xy.al.ra.f581);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.getOutputFormats;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
        return i;
    }

    public java.lang.String getErrorMessage() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f829);
        sb.append(util.h.xy.al.ra.f496);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputFormats;
        int i = Camera2StreamConfigurationMap + 51;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.util.Map<java.lang.String, java.lang.String> getStatusAdditionalInfo() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f829);
        sb.append(util.h.xy.al.ra.f615);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighSpeedVideoSizes;
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 89) << 1) - (i ^ 89)) % 128;
        return map;
    }

    public java.lang.Throwable getCausingException() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f829);
        sb.append(util.h.xy.al.ra.f491);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return th;
        }
        throw null;
    }
}
