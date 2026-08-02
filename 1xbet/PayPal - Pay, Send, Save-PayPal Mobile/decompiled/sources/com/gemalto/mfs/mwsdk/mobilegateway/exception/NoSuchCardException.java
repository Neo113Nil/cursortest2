package com.gemalto.mfs.mwsdk.mobilegateway.exception;

/* loaded from: classes8.dex */
public final class NoSuchCardException extends java.lang.Exception {
    public NoSuchCardException() {
    }

    public NoSuchCardException(java.lang.String str) {
        super(str);
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f374, str);
    }

    public NoSuchCardException(java.lang.Throwable th) {
        super(th);
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f374, util.h.xy.al.rc.m25022(th));
    }
}
