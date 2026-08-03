package com.helpshift.log;

/* loaded from: classes2.dex */
public interface ILogger {

    public enum LEVEL {
        DEBUG,
        WARN,
        ERROR
    }

    void d(java.lang.String str, java.lang.String str2);

    void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    void e(java.lang.String str, java.lang.String str2);

    void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    java.lang.String getStackTrace(java.lang.Throwable th);

    void w(java.lang.String str, java.lang.String str2);

    void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th);
}
