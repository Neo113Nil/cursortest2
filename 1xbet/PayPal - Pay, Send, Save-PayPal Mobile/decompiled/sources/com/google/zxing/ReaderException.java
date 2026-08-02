package com.google.zxing;

/* loaded from: classes9.dex */
public abstract class ReaderException extends java.lang.Exception {
    protected static final java.lang.StackTraceElement[] NO_TRACE;
    protected static boolean isStackTrace;

    static {
        isStackTrace = java.lang.System.getProperty("surefire.test.class.path") != null;
        NO_TRACE = new java.lang.StackTraceElement[0];
    }

    ReaderException() {
    }

    ReaderException(java.lang.Throwable th) {
        super(th);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return null;
    }

    public static void setStackTrace(boolean z) {
        isStackTrace = z;
    }
}
