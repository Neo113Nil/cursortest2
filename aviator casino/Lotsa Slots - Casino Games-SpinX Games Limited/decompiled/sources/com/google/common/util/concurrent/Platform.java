package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class Platform {
    static boolean isInstanceOfThrowableClass(@javax.annotation.CheckForNull java.lang.Throwable t, java.lang.Class<? extends java.lang.Throwable> expectedClass) {
        return expectedClass.isInstance(t);
    }

    static void restoreInterruptIfIsInterruptedException(java.lang.Throwable t) {
        com.google.common.base.Preconditions.checkNotNull(t);
        if (t instanceof java.lang.InterruptedException) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    private Platform() {
    }
}
