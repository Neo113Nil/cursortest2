package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\t\u001a\u00020\u00072\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/EventLoop;", "createEventLoop", "()Lkotlinx/coroutines/EventLoop;", "", "processNextEventInCurrentThread", "()J", "Lkotlin/Function0;", "", "block", "platformAutoreleasePool", "(Lkotlin/jvm/functions/Function0;)V", "runSingleTaskFromCurrentSystemDispatcher", "Ljava/lang/Thread;", "", "isIoDispatcherThread", "(Ljava/lang/Thread;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventLoopKt {
    public static final kotlinx.coroutines.EventLoop createEventLoop() {
        return new kotlinx.coroutines.BlockingEventLoop(java.lang.Thread.currentThread());
    }

    public static final long processNextEventInCurrentThread() {
        kotlinx.coroutines.EventLoop currentOrNull$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
        if (currentOrNull$kotlinx_coroutines_core != null) {
            return currentOrNull$kotlinx_coroutines_core.processNextEvent();
        }
        return Long.MAX_VALUE;
    }

    public static final void platformAutoreleasePool(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        function0.invoke();
    }

    public static final long runSingleTaskFromCurrentSystemDispatcher() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (!(currentThread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker)) {
            throw new java.lang.IllegalStateException("Expected CoroutineScheduler.Worker, but got ".concat(java.lang.String.valueOf(currentThread)));
        }
        return ((kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) currentThread).runSingleTask();
    }

    public static final boolean isIoDispatcherThread(java.lang.Thread thread) {
        if (thread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) {
            return ((kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) thread).isIo();
        }
        return false;
    }
}
