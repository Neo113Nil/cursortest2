package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class TinkBugException extends java.lang.RuntimeException {

    /* loaded from: classes9.dex */
    public interface ThrowingRunnable {
        void run() throws java.lang.Exception;
    }

    public interface ThrowingSupplier<T> {
        T get() throws java.lang.Exception;
    }

    public TinkBugException(java.lang.String str) {
        super(str);
    }

    public TinkBugException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public TinkBugException(java.lang.Throwable th) {
        super(th);
    }

    public static <T> T exceptionIsBug(com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier<T> throwingSupplier) {
        try {
            return throwingSupplier.get();
        } catch (java.lang.Exception e) {
            throw new com.google.crypto.tink.internal.TinkBugException(e);
        }
    }

    public static void exceptionIsBug(com.google.crypto.tink.internal.TinkBugException.ThrowingRunnable throwingRunnable) {
        try {
            throwingRunnable.run();
        } catch (java.lang.Exception e) {
            throw new com.google.crypto.tink.internal.TinkBugException(e);
        }
    }
}
