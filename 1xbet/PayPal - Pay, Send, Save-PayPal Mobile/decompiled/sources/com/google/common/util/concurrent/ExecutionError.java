package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public class ExecutionError extends java.lang.Error {
    private static final long serialVersionUID = 0;

    @java.lang.Deprecated
    protected ExecutionError() {
    }

    @java.lang.Deprecated
    protected ExecutionError(java.lang.String str) {
        super(str);
    }

    public ExecutionError(java.lang.String str, java.lang.Error error) {
        super(str, error);
    }

    public ExecutionError(java.lang.Error error) {
        super(error);
    }
}
