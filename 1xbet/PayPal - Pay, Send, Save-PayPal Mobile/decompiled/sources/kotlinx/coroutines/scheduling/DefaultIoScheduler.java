package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultIoScheduler;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "Lkotlinx/coroutines/CoroutineDispatcher;", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "close", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultIoScheduler extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements java.util.concurrent.Executor {
    public static final kotlinx.coroutines.scheduling.DefaultIoScheduler INSTANCE = new kotlinx.coroutines.scheduling.DefaultIoScheduler();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    private DefaultIoScheduler() {
    }

    static {
        int systemProp$default;
        kotlinx.coroutines.scheduling.UnlimitedIoScheduler unlimitedIoScheduler = kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE;
        systemProp$default = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default(kotlinx.coroutines.DispatchersKt.IO_PARALLELISM_PROPERTY_NAME, kotlin.ranges.RangesKt.coerceAtLeast(64, kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS()), 0, 0, 12, (java.lang.Object) null);
        Camera2StreamConfigurationMap = kotlinx.coroutines.CoroutineDispatcher.limitedParallelism$default(unlimitedIoScheduler, systemProp$default, null, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final java.util.concurrent.Executor getExecutor() {
        return this;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable command) {
        dispatch(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, command);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism, java.lang.String name2) {
        return kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE.limitedParallelism(parallelism, name2);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        Camera2StreamConfigurationMap.dispatch(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        Camera2StreamConfigurationMap.dispatchYield(context, block);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return "Dispatchers.IO";
    }
}
