package com.gemalto.mfs.mwsdk.exception;

/* loaded from: classes3.dex */
public class SDKInitializationException extends java.lang.Exception {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.util.HashMap<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode getHighSpeedVideoSizes;
    private java.lang.Throwable getOutputFormats;

    public SDKInitializationException(com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode, java.lang.String str, java.lang.Throwable th, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        this.getHighSpeedVideoFpsRanges = "";
        this.getHighSpeedVideoSizes = com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.INTERNAL_COMPONENT_ERROR;
        new java.util.HashMap();
        this.getHighSpeedVideoSizes = sDKInitializeErrorCode;
        this.getHighSpeedVideoFpsRanges = str;
        this.getOutputFormats = th;
        this.getHighSpeedVideoFpsRangesFor = hashMap;
        java.lang.String str2 = util.h.xy.al.ra.f478;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(sDKInitializeErrorCode);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public SDKInitializationException(com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode, java.lang.String str, java.lang.Throwable th) {
        this(sDKInitializeErrorCode, str, th, new java.util.HashMap());
    }

    public SDKInitializationException(com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        this(sDKInitializeErrorCode, str, null, hashMap);
    }

    public SDKInitializationException(com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode, java.lang.String str) {
        this(sDKInitializeErrorCode, str, null, new java.util.HashMap());
    }

    public java.lang.String getErrorMessage() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f800);
        sb.append(util.h.xy.al.ra.f496);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode getErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f800);
        sb.append(util.h.xy.al.ra.f528);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode sDKInitializeErrorCode = this.getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 37) % 128;
        return sDKInitializeErrorCode;
    }

    public java.util.HashMap<java.lang.String, java.lang.Object> getAdditionalInformation() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f800);
        sb.append(util.h.xy.al.ra.f560);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = this.getHighSpeedVideoFpsRangesFor;
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    public java.lang.Throwable getCausingException() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f800);
        sb.append(util.h.xy.al.ra.f491);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.Throwable th = this.getOutputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 71) % 128;
        return th;
    }
}
