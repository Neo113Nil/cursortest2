package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/ThreadLocalEventLoop;", "", "<init>", "()V", "Lkotlinx/coroutines/EventLoop;", "currentOrNull$kotlinx_coroutines_core", "()Lkotlinx/coroutines/EventLoop;", "", "resetEventLoop$kotlinx_coroutines_core", "eventLoop", "setEventLoop$kotlinx_coroutines_core", "(Lkotlinx/coroutines/EventLoop;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/getHighSpeedVideoFpsRangesFor;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ThreadLocal;", "getHighSpeedVideoSizes", "getEventLoop$kotlinx_coroutines_core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadLocalEventLoop {
    public static final kotlinx.coroutines.ThreadLocalEventLoop INSTANCE = new kotlinx.coroutines.ThreadLocalEventLoop();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> getHighSpeedVideoSizes = kotlinx.coroutines.internal.ThreadLocalKt.commonThreadLocal(new kotlinx.coroutines.internal.Symbol("ThreadLocalEventLoop"));

    private ThreadLocalEventLoop() {
    }

    public final kotlinx.coroutines.EventLoop getEventLoop$kotlinx_coroutines_core() {
        java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> threadLocal = getHighSpeedVideoSizes;
        kotlinx.coroutines.EventLoop eventLoop = threadLocal.get();
        if (eventLoop != null) {
            return eventLoop;
        }
        kotlinx.coroutines.EventLoop createEventLoop = kotlinx.coroutines.EventLoopKt.createEventLoop();
        threadLocal.set(createEventLoop);
        return createEventLoop;
    }

    public final kotlinx.coroutines.EventLoop currentOrNull$kotlinx_coroutines_core() {
        return getHighSpeedVideoSizes.get();
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
        getHighSpeedVideoSizes.set(null);
    }

    public final void setEventLoop$kotlinx_coroutines_core(kotlinx.coroutines.EventLoop eventLoop) {
        getHighSpeedVideoSizes.set(eventLoop);
    }
}
