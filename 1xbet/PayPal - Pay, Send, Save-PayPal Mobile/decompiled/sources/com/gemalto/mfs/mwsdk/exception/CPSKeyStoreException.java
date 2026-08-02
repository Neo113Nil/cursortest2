package com.gemalto.mfs.mwsdk.exception;

/* loaded from: classes3.dex */
public class CPSKeyStoreException extends java.lang.Exception {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final long serialVersionUID = -4851424658708213010L;
    private final int getHighSpeedVideoFpsRangesFor;

    public CPSKeyStoreException() {
        this(-1, "", null);
    }

    public CPSKeyStoreException(java.lang.String str) {
        this(-1, str, null);
    }

    public CPSKeyStoreException(java.lang.String str, java.lang.Throwable th) {
        this(-1, str, th);
    }

    public CPSKeyStoreException(int i, java.lang.String str) {
        this(i, str, null);
    }

    public CPSKeyStoreException(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.getHighSpeedVideoFpsRangesFor = i;
        java.lang.String str2 = util.h.xy.al.ra.f342;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(i);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public int getmErrorCode() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 5) + (i | 5);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        if (i2 % 2 == 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }
}
