package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public class DataSourceException extends java.io.IOException {

    @java.lang.Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public static boolean isCausedByPositionOutOfRange(java.io.IOException iOException) {
        for (java.io.IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof com.google.android.exoplayer2.upstream.DataSourceException) && ((com.google.android.exoplayer2.upstream.DataSourceException) iOException2).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(int i) {
        this.reason = i;
    }

    public DataSourceException(java.lang.Throwable th, int i) {
        super(th);
        this.reason = i;
    }

    public DataSourceException(java.lang.String str, int i) {
        super(str);
        this.reason = i;
    }

    public DataSourceException(java.lang.String str, java.lang.Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }
}
