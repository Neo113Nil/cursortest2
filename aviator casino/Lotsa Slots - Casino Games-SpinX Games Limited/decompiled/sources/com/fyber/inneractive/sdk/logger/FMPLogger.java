package com.fyber.inneractive.sdk.logger;

/* loaded from: classes3.dex */
public abstract class FMPLogger {
    public abstract void debug(java.lang.String str, java.lang.Object... objArr);

    public abstract void error(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr);

    public abstract void info(java.lang.String str, java.lang.Object... objArr);

    public abstract void initialize(android.content.Context context);

    public abstract void log(int i, java.lang.Exception exc, java.lang.String str, java.lang.Object... objArr);

    public abstract void verbose(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr);

    public abstract void verbose(java.lang.String str, java.lang.Object... objArr);

    public abstract void warning(java.lang.String str, java.lang.Object... objArr);
}
