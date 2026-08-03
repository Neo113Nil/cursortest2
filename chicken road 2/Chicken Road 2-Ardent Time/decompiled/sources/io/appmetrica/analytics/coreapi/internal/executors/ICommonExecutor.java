package io.appmetrica.analytics.coreapi.internal.executors;

/* loaded from: classes.dex */
public interface ICommonExecutor extends io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread, java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    void execute(java.lang.Runnable runnable);

    void executeDelayed(java.lang.Runnable runnable, long j2);

    void executeDelayed(java.lang.Runnable runnable, long j2, java.util.concurrent.TimeUnit timeUnit);

    void remove(java.lang.Runnable runnable);

    void removeAll();

    <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable);
}
