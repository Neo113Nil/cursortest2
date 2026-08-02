package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e\"\u0016\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u0017\u001a\u00060\u0004j\u0002`\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u0019\u001a\u00060\u0004j\u0002`\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\"\u001d\u0010\u001a\u001a\u00060\u0004j\u0002`\u0005*\u00020\u00078Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b*\f\b\u0000\u0010\u001c\"\u00020\u00042\u00020\u0004"}, d2 = {"Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "", "submissionTime", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "Lkotlinx/coroutines/scheduling/Task;", "asTask", "(Ljava/lang/Runnable;JZ)Lkotlinx/coroutines/scheduling/Task;", "", "DEFAULT_SCHEDULER_NAME", "Ljava/lang/String;", "WORK_STEALING_TIME_RESOLUTION_NS", "J", "", "CORE_POOL_SIZE", com.visa.cbp.getEncExpo.warmup, "MAX_POOL_SIZE", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "NonBlockingContext", "Z", "BlockingContext", "isBlocking", "(Lkotlinx/coroutines/scheduling/Task;)Z", "TaskContext"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TasksKt {
    public static final boolean BlockingContext = true;
    public static final int CORE_POOL_SIZE;
    public static final java.lang.String DEFAULT_SCHEDULER_NAME = kotlinx.coroutines.internal.SystemPropsKt.systemProp("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long IDLE_WORKER_KEEP_ALIVE_NS;
    public static final int MAX_POOL_SIZE;
    public static final boolean NonBlockingContext = false;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS;
    public static kotlinx.coroutines.scheduling.SchedulerTimeSource schedulerTimeSource;

    static {
        long systemProp$default;
        int systemProp$default2;
        int systemProp$default3;
        long systemProp$default4;
        systemProp$default = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, (java.lang.Object) null);
        WORK_STEALING_TIME_RESOLUTION_NS = systemProp$default;
        systemProp$default2 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", kotlin.ranges.RangesKt.coerceAtLeast(kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS(), 2), 1, 0, 8, (java.lang.Object) null);
        CORE_POOL_SIZE = systemProp$default2;
        systemProp$default3 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", kotlinx.coroutines.scheduling.CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 0, kotlinx.coroutines.scheduling.CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 4, (java.lang.Object) null);
        MAX_POOL_SIZE = systemProp$default3;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        systemProp$default4 = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, (java.lang.Object) null);
        IDLE_WORKER_KEEP_ALIVE_NS = timeUnit.toNanos(systemProp$default4);
        schedulerTimeSource = kotlinx.coroutines.scheduling.NanoTimeSource.INSTANCE;
    }

    public static final boolean isBlocking(kotlinx.coroutines.scheduling.Task task) {
        return task.taskContext;
    }

    public static final kotlinx.coroutines.scheduling.Task asTask(java.lang.Runnable runnable, long j, boolean z) {
        return new kotlinx.coroutines.scheduling.TaskImpl(runnable, j, z);
    }

    public static final /* synthetic */ java.lang.String access$taskContextString(boolean z) {
        return z ? "Blocking" : "Non-blocking";
    }
}
