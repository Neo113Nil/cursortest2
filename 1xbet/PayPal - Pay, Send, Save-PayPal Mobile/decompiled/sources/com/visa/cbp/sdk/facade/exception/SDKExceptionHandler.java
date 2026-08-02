package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes16.dex */
public final class SDKExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private static final java.lang.String TAG = "SDKExceptionHandler";

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        getStackTrace(th);
    }

    private java.lang.String getStackTrace(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
