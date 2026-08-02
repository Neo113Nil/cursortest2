package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\"\u0010\"\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00078UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\tR\u0014\u0010&\u001a\u00020\u00048UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u0011\u0010'\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b'\u0010\tR\u0011\u0010(\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0011\u0010)\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b)\u0010\t"}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "", "processNextEvent", "()J", "", "processUnconfinedEvent", "()Z", "shouldBeProcessedFromContext", "Lkotlinx/coroutines/DispatchedTask;", "task", "", "dispatchUnconfined", "(Lkotlinx/coroutines/DispatchedTask;)V", "p0", "Camera2StreamConfigurationMap", "(Z)J", "unconfined", "incrementUseCount", "(Z)V", "decrementUseCount", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "shutdown", "getHighResolutionOutputSizeshNQ4ISI", "J", "Z", "Lkotlin/collections/ArrayDeque;", "getHighSpeedVideoSizes", "Lkotlin/collections/ArrayDeque;", "isEmpty", "getNextTime", "nextTime", "isActive", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EventLoop extends kotlinx.coroutines.CoroutineDispatcher {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;
    private kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> getHighSpeedVideoSizes;

    private static long Camera2StreamConfigurationMap(boolean p0) {
        return p0 ? 4294967296L : 1L;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    protected boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    protected long getNextTime() {
        kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> arrayDeque = this.getHighSpeedVideoSizes;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean processUnconfinedEvent() {
        kotlinx.coroutines.DispatchedTask<?> removeFirstOrNull;
        kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> arrayDeque = this.getHighSpeedVideoSizes;
        if (arrayDeque == null || (removeFirstOrNull = arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        removeFirstOrNull.run();
        return true;
    }

    public final void dispatchUnconfined(kotlinx.coroutines.DispatchedTask<?> task) {
        kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> arrayDeque = this.getHighSpeedVideoSizes;
        if (arrayDeque == null) {
            arrayDeque = new kotlin.collections.ArrayDeque<>();
            this.getHighSpeedVideoSizes = arrayDeque;
        }
        arrayDeque.addLast(task);
    }

    public final boolean isActive() {
        return this.Camera2StreamConfigurationMap > 0;
    }

    public final boolean isUnconfinedLoopActive() {
        return this.Camera2StreamConfigurationMap >= Camera2StreamConfigurationMap(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> arrayDeque = this.getHighSpeedVideoSizes;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public static /* synthetic */ void incrementUseCount$default(kotlinx.coroutines.EventLoop eventLoop, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.incrementUseCount(z);
    }

    public final void incrementUseCount(boolean unconfined) {
        this.Camera2StreamConfigurationMap += Camera2StreamConfigurationMap(unconfined);
        if (unconfined) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    public static /* synthetic */ void decrementUseCount$default(kotlinx.coroutines.EventLoop eventLoop, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.decrementUseCount(z);
    }

    public final void decrementUseCount(boolean unconfined) {
        long Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap - Camera2StreamConfigurationMap(unconfined);
        this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
        if (Camera2StreamConfigurationMap <= 0) {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.AssertionError();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                shutdown();
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism, java.lang.String name2) {
        kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(parallelism);
        return kotlinx.coroutines.internal.LimitedDispatcherKt.namedOrThis(this, name2);
    }
}
