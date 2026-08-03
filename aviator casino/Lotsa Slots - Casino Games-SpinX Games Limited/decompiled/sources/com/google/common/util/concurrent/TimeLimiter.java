package com.google.common.util.concurrent;

@com.google.errorprone.annotations.DoNotMock("Use FakeTimeLimiter")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface TimeLimiter {
    @com.google.common.util.concurrent.ParametricNullness
    <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException;

    @com.google.common.util.concurrent.ParametricNullness
    <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException, java.util.concurrent.ExecutionException;

    <T> T newProxy(T target, java.lang.Class<T> interfaceType, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit);

    void runUninterruptiblyWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.TimeoutException;

    void runWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException;
}
