package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/BlockingEventLoop;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Thread;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME, "<init>", "(Ljava/lang/Thread;)V", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BlockingEventLoop extends kotlinx.coroutines.EventLoopImplBase {
    private final java.lang.Thread thread;

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected final java.lang.Thread getThread() {
        return this.thread;
    }

    public BlockingEventLoop(java.lang.Thread thread) {
        this.thread = thread;
    }
}
