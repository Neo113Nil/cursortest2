package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "<init>", "()V", "", "unpark", "", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "reschedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EventLoopImplPlatform extends kotlinx.coroutines.EventLoop {
    protected abstract java.lang.Thread getThread();

    protected final void unpark() {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        java.lang.Thread thread = getThread();
        if (java.lang.Thread.currentThread() != thread) {
            abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
            if (abstractTimeSource != null) {
                abstractTimeSource.unpark(thread);
            } else {
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    protected void reschedule(long now, kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask) {
        kotlinx.coroutines.DefaultExecutor.INSTANCE.schedule(now, delayedTask);
    }
}
