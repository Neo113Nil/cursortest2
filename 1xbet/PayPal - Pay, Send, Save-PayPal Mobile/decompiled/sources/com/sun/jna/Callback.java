package com.sun.jna;

/* loaded from: classes5.dex */
public interface Callback {
    public static final java.util.List<java.lang.String> FORBIDDEN_NAMES = java.util.Collections.unmodifiableList(java.util.Arrays.asList("hashCode", "equals", "toString"));
    public static final java.lang.String METHOD_NAME = "callback";

    public interface UncaughtExceptionHandler {
        void uncaughtException(com.sun.jna.Callback callback, java.lang.Throwable th);
    }
}
