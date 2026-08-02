package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class FakeTimeLimiter implements com.google.common.util.concurrent.TimeLimiter {
    @Override // com.google.common.util.concurrent.TimeLimiter
    public final <T> T newProxy(T t, java.lang.Class<T> cls, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.base.Preconditions.checkNotNull(t);
        com.google.common.base.Preconditions.checkNotNull(cls);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        return t;
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        try {
            return callable.call();
        } catch (java.lang.Error e) {
            throw new com.google.common.util.concurrent.ExecutionError(e);
        } catch (java.lang.RuntimeException e2) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(e2);
        } catch (java.lang.Exception e3) {
            com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(e3);
            throw new java.util.concurrent.ExecutionException(e3);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        return (T) callWithTimeout(callable, j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final void runWithTimeout(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.base.Preconditions.checkNotNull(runnable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        try {
            runnable.run();
        } catch (java.lang.Error e) {
            throw new com.google.common.util.concurrent.ExecutionError(e);
        } catch (java.lang.Exception e2) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(e2);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final void runUninterruptiblyWithTimeout(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        runWithTimeout(runnable, j, timeUnit);
    }
}
