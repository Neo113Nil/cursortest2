package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
final class Platform {
    static boolean isInstanceOfThrowableClass(java.lang.Throwable th, java.lang.Class<? extends java.lang.Throwable> cls) {
        return cls.isInstance(th);
    }

    static void restoreInterruptIfIsInterruptedException(java.lang.Throwable th) {
        com.google.common.base.Preconditions.checkNotNull(th);
        if (th instanceof java.lang.InterruptedException) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    static void interruptCurrentThread() {
        java.lang.Thread.currentThread().interrupt();
    }

    static void rethrowIfErrorOtherThanStackOverflow(java.lang.Throwable th) {
        com.google.common.base.Preconditions.checkNotNull(th);
        if ((th instanceof java.lang.Error) && !(th instanceof java.lang.StackOverflowError)) {
            throw ((java.lang.Error) th);
        }
    }

    static <V> V get(com.google.common.util.concurrent.AbstractFuture<V> abstractFuture) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return abstractFuture.blockingGet();
    }

    static <V> V get(com.google.common.util.concurrent.AbstractFuture<V> abstractFuture, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return abstractFuture.blockingGet(j, timeUnit);
    }

    private Platform() {
    }
}
