package kotlinx.coroutines;

/* compiled from: EventLoop.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0004J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u0012\u0010\u0004\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "<init>", "()V", "thread", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", "unpark", "", "reschedule", "now", "", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EventLoopImplPlatform extends kotlinx.coroutines.EventLoop {
    protected abstract java.lang.Thread getThread();

    protected final void unpark() {
        java.lang.Thread thread = getThread();
        if (java.lang.Thread.currentThread() != thread) {
            kotlinx.coroutines.AbstractTimeSource abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.timeSource;
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
