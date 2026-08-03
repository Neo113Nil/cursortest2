package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class UncheckedExecutionException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 0;

    protected UncheckedExecutionException() {
    }

    protected UncheckedExecutionException(@javax.annotation.CheckForNull java.lang.String message) {
        super(message);
    }

    public UncheckedExecutionException(@javax.annotation.CheckForNull java.lang.String message, @javax.annotation.CheckForNull java.lang.Throwable cause) {
        super(message, cause);
    }

    public UncheckedExecutionException(@javax.annotation.CheckForNull java.lang.Throwable cause) {
        super(cause);
    }
}
