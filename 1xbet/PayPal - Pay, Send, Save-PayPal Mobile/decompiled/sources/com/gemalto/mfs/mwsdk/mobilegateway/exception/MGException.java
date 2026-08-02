package com.gemalto.mfs.mwsdk.mobilegateway.exception;

/* loaded from: classes3.dex */
public class MGException extends java.lang.Exception {
    public MGException() {
    }

    public MGException(java.lang.String str) {
        super(str);
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f544, str);
    }

    public MGException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        java.lang.String str2 = util.h.xy.al.ra.f544;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public MGException(java.lang.Throwable th) {
        super(th);
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f544, util.h.xy.al.rc.m25022(th));
    }
}
