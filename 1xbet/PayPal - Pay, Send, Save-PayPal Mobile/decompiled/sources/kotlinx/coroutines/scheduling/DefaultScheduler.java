package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "<init>", "()V", "", "parallelism", "", "name", "Lkotlinx/coroutines/CoroutineDispatcher;", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "", "shutdown$kotlinx_coroutines_core", "close", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultScheduler extends kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher {
    public static final kotlinx.coroutines.scheduling.DefaultScheduler INSTANCE = new kotlinx.coroutines.scheduling.DefaultScheduler();

    private DefaultScheduler() {
        super(kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE, kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE, kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS, kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism, java.lang.String name2) {
        kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(parallelism);
        if (parallelism >= kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE) {
            return kotlinx.coroutines.internal.LimitedDispatcherKt.namedOrThis(this, name2);
        }
        return super.limitedParallelism(parallelism, name2);
    }

    public final void shutdown$kotlinx_coroutines_core() {
        super.close();
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return "Dispatchers.Default";
    }
}
