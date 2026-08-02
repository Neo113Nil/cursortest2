package com.datadog.android.rum.internal.thread;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0018\u00010\u0014\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0018\u00010\u0014\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0018J/\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ1\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010\"J?\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 \"\u0004\b\u0000\u0010#2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010%J9\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b(\u0010)J9\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u0003J\u0017\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\b\u0010.\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b/\u00100J/\u0010/\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u00102\b\u0010.\u001a\u0004\u0018\u00010\u000b2\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0004\b/\u00102J-\u0010/\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u00102\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0016¢\u0006\u0004\b/\u00103"}, d2 = {"Lcom/datadog/android/rum/internal/thread/NoOpScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "<init>", "()V", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "T", "", "Ljava/util/concurrent/Callable;", "tasks", "", "Ljava/util/concurrent/Future;", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isShutdown", "()Z", "isTerminated", "delay", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "V", "callable", "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "initialDelay", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "shutdown", "shutdownNow", "()Ljava/util/List;", "task", "submit", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpScheduledExecutorService implements java.util.concurrent.ScheduledExecutorService {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) {
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable command) {
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List<java.lang.Runnable> shutdownNow() {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future<?> submit(java.lang.Runnable task) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task) {
        return null;
    }
}
