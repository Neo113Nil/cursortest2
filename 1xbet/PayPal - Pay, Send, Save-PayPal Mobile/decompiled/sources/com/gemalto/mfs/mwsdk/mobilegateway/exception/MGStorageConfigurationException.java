package com.gemalto.mfs.mwsdk.mobilegateway.exception;

/* loaded from: classes8.dex */
public class MGStorageConfigurationException extends com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private java.lang.Exception getHighResolutionOutputSizeshNQ4ISI;

    public MGStorageConfigurationException() {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public MGStorageConfigurationException(java.lang.String str) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f345, str);
    }

    public MGStorageConfigurationException(java.lang.Throwable th) {
        super(th);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f345, util.h.xy.al.rc.m25022(th));
    }

    public MGStorageConfigurationException(java.lang.Exception exc, java.lang.String str) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (exc != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = exc;
        }
        java.lang.String str2 = util.h.xy.al.ra.f345;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(exc));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public java.lang.Exception getCauseException() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 103) % 128;
        java.lang.Exception exc = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ 63) + ((i & 63) << 1)) % 128;
        return exc;
    }
}
