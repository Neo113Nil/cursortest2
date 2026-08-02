package com.gemalto.mfs.mwsdk.payment.exception;

/* loaded from: classes8.dex */
public class ServiceAlreadyActivatedException extends util.h.xy.ab.b {
    private static final long serialVersionUID = -7902620038479726326L;

    public ServiceAlreadyActivatedException(java.lang.String str) {
        super(str);
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f524, str);
    }

    public ServiceAlreadyActivatedException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        java.lang.String str2 = util.h.xy.al.ra.f524;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }
}
