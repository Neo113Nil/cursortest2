package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public class UncheckedTimeoutException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 0;

    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(java.lang.String str) {
        super(str);
    }

    public UncheckedTimeoutException(java.lang.Throwable th) {
        super(th);
    }

    public UncheckedTimeoutException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }
}
