package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Ljava/lang/Thread;", "p1", "Lkotlinx/coroutines/EventLoop;", "p2", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "", "", "afterCompletion", "(Ljava/lang/Object;)V", "getHighSpeedVideoFpsRanges", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/EventLoop;", "getHighSpeedVideoSizes", "", "isScopedCoroutine", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class BlockingCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.EventLoop getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Thread getHighSpeedVideoFpsRangesFor;

    @Override // kotlinx.coroutines.JobSupport
    protected final boolean isScopedCoroutine() {
        return true;
    }

    public BlockingCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Thread thread, kotlinx.coroutines.EventLoop eventLoop) {
        super(coroutineContext, true, true);
        this.getHighSpeedVideoFpsRangesFor = thread;
        this.getHighSpeedVideoSizes = eventLoop;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final void afterCompletion(java.lang.Object p0) {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Thread.currentThread(), this.getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        java.lang.Thread thread = this.getHighSpeedVideoFpsRangesFor;
        abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
        if (abstractTimeSource != null) {
            abstractTimeSource.unpark(thread);
        } else {
            java.util.concurrent.locks.LockSupport.unpark(thread);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T getHighSpeedVideoFpsRanges() {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource2;
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource3;
        abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
        if (abstractTimeSource != null) {
            abstractTimeSource.registerTimeLoopThread();
        }
        try {
            kotlinx.coroutines.EventLoop eventLoop = this.getHighSpeedVideoSizes;
            if (eventLoop != null) {
                kotlinx.coroutines.EventLoop.incrementUseCount$default(eventLoop, false, 1, null);
            }
            while (true) {
                try {
                    kotlinx.coroutines.EventLoop eventLoop2 = this.getHighSpeedVideoSizes;
                    long processNextEvent = eventLoop2 != null ? eventLoop2.processNextEvent() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        break;
                    }
                    abstractTimeSource3 = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
                    if (abstractTimeSource3 != null) {
                        abstractTimeSource3.parkNanos(this, processNextEvent);
                    } else {
                        java.util.concurrent.locks.LockSupport.parkNanos(this, processNextEvent);
                    }
                    if (java.lang.Thread.interrupted()) {
                        cancelCoroutine(new java.lang.InterruptedException());
                    }
                } finally {
                    kotlinx.coroutines.EventLoop eventLoop3 = this.getHighSpeedVideoSizes;
                    if (eventLoop3 != null) {
                        kotlinx.coroutines.EventLoop.decrementUseCount$default(eventLoop3, false, 1, null);
                    }
                }
            }
            T t = (T) kotlinx.coroutines.JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
            r3 = t instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) t : null;
            if (r3 == null) {
                return t;
            }
            throw r3.cause;
        } finally {
            abstractTimeSource2 = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
            if (abstractTimeSource2 != null) {
                abstractTimeSource2.unregisterTimeLoopThread();
            }
        }
    }
}
