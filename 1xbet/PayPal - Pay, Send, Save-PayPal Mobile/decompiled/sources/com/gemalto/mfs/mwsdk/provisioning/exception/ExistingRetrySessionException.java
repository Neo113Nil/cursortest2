package com.gemalto.mfs.mwsdk.provisioning.exception;

/* loaded from: classes8.dex */
public class ExistingRetrySessionException extends java.lang.Exception {
    private static final long serialVersionUID = 8360700476772223687L;

    public ExistingRetrySessionException(java.lang.String str) {
        super(str);
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f386, str);
    }

    public ExistingRetrySessionException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        java.lang.String str2 = util.h.xy.al.ra.f386;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }
}
