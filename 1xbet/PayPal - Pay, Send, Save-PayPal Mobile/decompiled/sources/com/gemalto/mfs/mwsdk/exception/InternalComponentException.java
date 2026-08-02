package com.gemalto.mfs.mwsdk.exception;

/* loaded from: classes3.dex */
public class InternalComponentException extends java.lang.Exception {
    public static final int ERROR_CODE_DCM_CARD_MAP_NOT_FOUND = 509;
    public static final int ERROR_CODE_SERIAL_NUMBER_MIGRATION_FAILURE = 505;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final long serialVersionUID = -4851424658708213010L;
    private final int getHighSpeedVideoFpsRangesFor;

    public InternalComponentException() {
        this(-1, "", null);
    }

    public InternalComponentException(java.lang.String str) {
        this(-1, str, null);
    }

    public InternalComponentException(java.lang.String str, java.lang.Throwable th) {
        this(-1, str, th);
        util.h.xy.am.ma.m25029(util.h.xy.al.ra.f368, util.h.xy.al.rc.m25022(th));
    }

    public InternalComponentException(int i, java.lang.String str) {
        this(i, str, null);
    }

    public InternalComponentException(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.getHighSpeedVideoFpsRangesFor = i;
        java.lang.String str2 = util.h.xy.al.ra.f432;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(i);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public int getmErrorCode() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 67) << 1) - (i ^ 67);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        int i5 = i3 + 105;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw new java.lang.ArithmeticException();
    }
}
