package com.datadog.trace.logger;

/* loaded from: classes3.dex */
public interface Logger {
    public static final java.lang.String ROOT_LOGGER_NAME = "ROOT";

    void debug(java.lang.String str);

    void debug(java.lang.String str, java.lang.Object obj);

    void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void debug(java.lang.String str, java.lang.Throwable th);

    void debug(java.lang.String str, java.lang.Object... objArr);

    void error(java.lang.String str);

    void error(java.lang.String str, java.lang.Object obj);

    void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void error(java.lang.String str, java.lang.Throwable th);

    void error(java.lang.String str, java.lang.Object... objArr);

    void info(java.lang.String str);

    void info(java.lang.String str, java.lang.Object obj);

    void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void info(java.lang.String str, java.lang.Throwable th);

    void info(java.lang.String str, java.lang.Object... objArr);

    boolean isDebugEnabled();

    boolean isInfoEnabled();

    boolean isWarnEnabled();

    void warn(java.lang.String str);

    void warn(java.lang.String str, java.lang.Object obj);

    void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void warn(java.lang.String str, java.lang.Throwable th);

    void warn(java.lang.String str, java.lang.Object... objArr);
}
