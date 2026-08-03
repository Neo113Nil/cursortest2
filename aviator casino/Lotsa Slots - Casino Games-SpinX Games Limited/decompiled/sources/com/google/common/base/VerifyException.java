package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class VerifyException extends java.lang.RuntimeException {
    public VerifyException() {
    }

    public VerifyException(@javax.annotation.CheckForNull java.lang.String message) {
        super(message);
    }

    public VerifyException(@javax.annotation.CheckForNull java.lang.Throwable cause) {
        super(cause);
    }

    public VerifyException(@javax.annotation.CheckForNull java.lang.String message, @javax.annotation.CheckForNull java.lang.Throwable cause) {
        super(message, cause);
    }
}
