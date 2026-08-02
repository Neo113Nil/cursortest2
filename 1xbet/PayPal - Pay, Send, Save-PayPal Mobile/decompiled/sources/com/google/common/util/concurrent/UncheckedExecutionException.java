package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public class UncheckedExecutionException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 0;

    @java.lang.Deprecated
    protected UncheckedExecutionException() {
    }

    @java.lang.Deprecated
    protected UncheckedExecutionException(java.lang.String str) {
        super(str);
    }

    public UncheckedExecutionException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public UncheckedExecutionException(java.lang.Throwable th) {
        super(th);
    }
}
