package kotlinx.coroutines.scheduling;

/* compiled from: Dispatcher.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\rj\u0002`\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\rj\u0002`\u0017H\u0017J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultIoScheduler;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "<init>", "()V", com.unity3d.ads.BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineDispatcher;", "executor", "getExecutor", "()Ljava/util/concurrent/Executor;", "execute", "", com.ironsource.sdk.controller.f.b.g, "Ljava/lang/Runnable;", "limitedParallelism", "parallelism", "", "name", "", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "close", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultIoScheduler extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements java.util.concurrent.Executor {
    public static final kotlinx.coroutines.scheduling.DefaultIoScheduler INSTANCE = new kotlinx.coroutines.scheduling.DefaultIoScheduler();
    private static final kotlinx.coroutines.CoroutineDispatcher default;

    private DefaultIoScheduler() {
    }

    static {
        int systemProp$default;
        kotlinx.coroutines.scheduling.UnlimitedIoScheduler unlimitedIoScheduler = kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE;
        systemProp$default = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default(kotlinx.coroutines.DispatchersKt.IO_PARALLELISM_PROPERTY_NAME, kotlin.ranges.RangesKt.coerceAtLeast(64, kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS()), 0, 0, 12, (java.lang.Object) null);
        default = kotlinx.coroutines.CoroutineDispatcher.limitedParallelism$default(unlimitedIoScheduler, systemProp$default, null, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public java.util.concurrent.Executor getExecutor() {
        return this;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        mo12370dispatch(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, command);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism, java.lang.String name) {
        return kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE.limitedParallelism(parallelism, name);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo12370dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        default.mo12370dispatch(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        default.dispatchYield(context, block);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public java.lang.String getName() {
        return "Dispatchers.IO";
    }
}
