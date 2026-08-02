package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b*\n\u0010\t\"\u00020\u00012\u00020\u0001"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "from", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/CoroutineDispatcher;", "asExecutor", "(Lkotlinx/coroutines/CoroutineDispatcher;)Ljava/util/concurrent/Executor;", "CloseableCoroutineDispatcher"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExecutorsKt {
    public static /* synthetic */ void CloseableCoroutineDispatcher$annotations() {
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher from(java.util.concurrent.ExecutorService executorService) {
        return new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl(executorService);
    }

    public static final kotlinx.coroutines.CoroutineDispatcher from(java.util.concurrent.Executor executor) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        kotlinx.coroutines.DispatcherExecutor dispatcherExecutor = executor instanceof kotlinx.coroutines.DispatcherExecutor ? (kotlinx.coroutines.DispatcherExecutor) executor : null;
        return (dispatcherExecutor == null || (coroutineDispatcher = dispatcherExecutor.getHighSpeedVideoFpsRanges) == null) ? new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl(executor) : coroutineDispatcher;
    }

    public static final java.util.concurrent.Executor asExecutor(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        java.util.concurrent.Executor executor;
        kotlinx.coroutines.ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof kotlinx.coroutines.ExecutorCoroutineDispatcher ? (kotlinx.coroutines.ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executor = executorCoroutineDispatcher.getExecutor()) == null) ? new kotlinx.coroutines.DispatcherExecutor(coroutineDispatcher) : executor;
    }
}
