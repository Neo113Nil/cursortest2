package org.slf4j.spi;

/* loaded from: classes18.dex */
public interface LocationAwareLogger extends org.slf4j.Logger {
    public static final int DEBUG_INT = 10;
    public static final int ERROR_INT = 40;
    public static final int INFO_INT = 20;
    public static final int TRACE_INT = 0;
    public static final int WARN_INT = 30;

    void log(org.slf4j.Marker marker, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr, java.lang.Throwable th);
}
