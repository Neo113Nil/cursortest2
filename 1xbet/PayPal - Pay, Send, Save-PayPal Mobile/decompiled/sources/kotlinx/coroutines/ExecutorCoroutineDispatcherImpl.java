package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u00020\u00182\n\u0010\u0019\u001a\u00060\tj\u0002`\n2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "Ljava/util/concurrent/ScheduledExecutorService;", "p0", "p1", "p2", "Ljava/util/concurrent/ScheduledFuture;", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;J)Ljava/util/concurrent/ScheduledFuture;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExecutorCoroutineDispatcherImpl extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements kotlinx.coroutines.Delay {
    private final java.util.concurrent.Executor executor;

    public ExecutorCoroutineDispatcherImpl(java.util.concurrent.Executor executor) {
        this.executor = executor;
        kotlinx.coroutines.internal.ConcurrentKt.removeFutureOnCancel(getExecutor());
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public final java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.Delay.DefaultImpls.delay(this, j, continuation);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final java.util.concurrent.Executor getExecutor() {
        return this.executor;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource2;
        java.lang.Runnable runnable;
        try {
            java.util.concurrent.Executor executor = getExecutor();
            abstractTimeSource2 = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
            if (abstractTimeSource2 == null || (runnable = abstractTimeSource2.wrapTask(block)) == null) {
                runnable = block;
            }
            executor.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
            if (abstractTimeSource != null) {
                abstractTimeSource.unTrackTask();
            }
            kotlinx.coroutines.JobKt.cancel(context, kotlinx.coroutines.ExceptionsKt.CancellationException("The task was rejected", e));
            kotlinx.coroutines.Dispatchers.getIO().dispatch(context, block);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long timeMillis, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        java.util.concurrent.Executor executor = getExecutor();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        java.util.concurrent.ScheduledFuture<?> highSpeedVideoFpsRangesFor = scheduledExecutorService != null ? getHighSpeedVideoFpsRangesFor(scheduledExecutorService, new kotlinx.coroutines.ResumeUndispatchedRunnable(this, continuation), continuation.getGetHighSpeedVideoSizes(), timeMillis) : null;
        if (highSpeedVideoFpsRangesFor != null) {
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(continuation, new kotlinx.coroutines.CancelFutureOnCancel(highSpeedVideoFpsRangesFor));
        } else {
            kotlinx.coroutines.DefaultExecutor.INSTANCE.scheduleResumeAfterDelay(timeMillis, continuation);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public final kotlinx.coroutines.DisposableHandle invokeOnTimeout(long timeMillis, java.lang.Runnable block, kotlin.coroutines.CoroutineContext context) {
        java.util.concurrent.Executor executor = getExecutor();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        java.util.concurrent.ScheduledFuture<?> highSpeedVideoFpsRangesFor = scheduledExecutorService != null ? getHighSpeedVideoFpsRangesFor(scheduledExecutorService, block, context, timeMillis) : null;
        if (highSpeedVideoFpsRangesFor != null) {
            return new kotlinx.coroutines.DisposableFutureHandle(highSpeedVideoFpsRangesFor);
        }
        return kotlinx.coroutines.DefaultExecutor.INSTANCE.invokeOnTimeout(timeMillis, block, context);
    }

    private static java.util.concurrent.ScheduledFuture<?> getHighSpeedVideoFpsRangesFor(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.Runnable runnable, kotlin.coroutines.CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            kotlinx.coroutines.JobKt.cancel(coroutineContext, kotlinx.coroutines.ExceptionsKt.CancellationException("The task was rejected", e));
            return null;
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.Executor executor = getExecutor();
        java.util.concurrent.ExecutorService executorService = executor instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return getExecutor().toString();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.coroutines.ExecutorCoroutineDispatcherImpl) && ((kotlinx.coroutines.ExecutorCoroutineDispatcherImpl) other).getExecutor() == getExecutor();
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(getExecutor());
    }
}
