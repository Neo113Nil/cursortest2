package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Ljava/lang/Thread;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME, "", "isSchedulerWorker", "(Ljava/lang/Thread;)Z", "mayNotBlock"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CoroutineSchedulerKt {
    public static final boolean isSchedulerWorker(java.lang.Thread thread) {
        return thread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker;
    }

    public static final boolean mayNotBlock(java.lang.Thread thread) {
        return (thread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) && ((kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) thread).state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
    }
}
