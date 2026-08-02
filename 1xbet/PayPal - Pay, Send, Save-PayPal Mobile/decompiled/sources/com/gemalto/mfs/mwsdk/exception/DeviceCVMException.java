package com.gemalto.mfs.mwsdk.exception;

/* loaded from: classes3.dex */
public class DeviceCVMException extends java.lang.Exception {
    public DeviceCVMException(java.lang.String str) {
        super(str);
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f807, str);
    }

    public DeviceCVMException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        java.lang.String str2 = util.h.xy.al.ra.f807;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }
}
