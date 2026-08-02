package com.gemalto.mfs.mwsdk.mobilegateway.exception;

/* loaded from: classes8.dex */
public class MGSDKException extends java.lang.RuntimeException {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.Exception getHighResolutionOutputSizeshNQ4ISI;

    public MGSDKException() {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public MGSDKException(java.lang.String str) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f357, str);
    }

    public MGSDKException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        java.lang.String str2 = util.h.xy.al.ra.f357;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public MGSDKException(java.lang.Throwable th) {
        super(th);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (th != null && (th instanceof java.lang.Exception)) {
            this.getHighResolutionOutputSizeshNQ4ISI = (java.lang.Exception) th;
        }
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f357, util.h.xy.al.rc.m25022(th));
    }

    public MGSDKException(java.lang.Exception exc, java.lang.String str) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (exc != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = exc;
        }
        java.lang.String str2 = util.h.xy.al.ra.f357;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(exc));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public java.lang.Exception getCauseException() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 71) + ((i & 71) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }
}
