package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class UncheckedTimeoutException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 0;

    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(@javax.annotation.CheckForNull java.lang.String message) {
        super(message);
    }

    public UncheckedTimeoutException(@javax.annotation.CheckForNull java.lang.Throwable cause) {
        super(cause);
    }

    public UncheckedTimeoutException(@javax.annotation.CheckForNull java.lang.String message, @javax.annotation.CheckForNull java.lang.Throwable cause) {
        super(message, cause);
    }
}
