package com.google.common.util.concurrent;

@com.google.errorprone.annotations.DoNotMock("Use FakeTimeLimiter")
/* loaded from: classes9.dex */
public interface TimeLimiter {
    <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException;

    <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException, java.util.concurrent.ExecutionException;

    <T> T newProxy(T t, java.lang.Class<T> cls, long j, java.util.concurrent.TimeUnit timeUnit);

    void runUninterruptiblyWithTimeout(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException;

    void runWithTimeout(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException;
}
