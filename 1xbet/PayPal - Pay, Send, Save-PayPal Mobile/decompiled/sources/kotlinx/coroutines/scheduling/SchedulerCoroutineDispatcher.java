package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0010\f\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010#\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010-"}, d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "dispatchWithContext$kotlinx_coroutines_core", "(Ljava/lang/Runnable;ZZ)V", "close", "()V", "usePrivateScheduler$kotlinx_coroutines_core", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "shutdown$kotlinx_coroutines_core", "(J)V", "restore$kotlinx_coroutines_core", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "J", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public class SchedulerCoroutineDispatcher extends kotlinx.coroutines.ExecutorCoroutineDispatcher {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.scheduling.CoroutineScheduler getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ SchedulerCoroutineDispatcher(int i, int i2, long j, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE : i, (i3 & 2) != 0 ? kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE : i2, (i3 & 4) != 0 ? kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public SchedulerCoroutineDispatcher(int i, int i2, long j, java.lang.String str) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = new kotlinx.coroutines.scheduling.CoroutineScheduler(i, i2, j, str);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public java.util.concurrent.Executor getExecutor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        kotlinx.coroutines.scheduling.CoroutineScheduler.dispatch$default(this.getHighSpeedVideoFpsRanges, block, false, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        kotlinx.coroutines.scheduling.CoroutineScheduler.dispatch$default(this.getHighSpeedVideoFpsRanges, block, false, true, 2, null);
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(java.lang.Runnable block, boolean context, boolean fair) {
        this.getHighSpeedVideoFpsRanges.dispatch(block, context, fair);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    public final void usePrivateScheduler$kotlinx_coroutines_core() {
        synchronized (this) {
            this.getHighSpeedVideoFpsRanges.shutdown(1000L);
            this.getHighSpeedVideoFpsRanges = new kotlinx.coroutines.scheduling.CoroutineScheduler(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }
    }

    public final void shutdown$kotlinx_coroutines_core(long timeout) {
        synchronized (this) {
            this.getHighSpeedVideoFpsRanges.shutdown(timeout);
        }
    }

    public final void restore$kotlinx_coroutines_core() {
        usePrivateScheduler$kotlinx_coroutines_core();
    }

    public SchedulerCoroutineDispatcher() {
        this(0, 0, 0L, null, 15, null);
    }
}
