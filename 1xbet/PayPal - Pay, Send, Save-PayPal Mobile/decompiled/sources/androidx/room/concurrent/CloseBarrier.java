package androidx.room.concurrent;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/room/concurrent/CloseBarrier;", "", "Landroidx/room/concurrent/SynchronizedObject;", "Lkotlin/Function0;", "", "closeAction", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "block$room_runtime", "()Z", "unblock$room_runtime", "()V", "close$room_runtime", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/Camera2StreamConfigurationMap;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/getHighResolutionOutputSizeshNQ4ISI;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CloseBarrier {
    private final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;

    public CloseBarrier(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(0);
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final boolean block$room_runtime() {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes.get()) {
                return false;
            }
            this.Camera2StreamConfigurationMap.incrementAndGet();
            return true;
        }
    }

    public final void unblock$room_runtime() {
        synchronized (this) {
            this.Camera2StreamConfigurationMap.decrementAndGet();
            if (this.Camera2StreamConfigurationMap.get() < 0) {
                throw new java.lang.IllegalStateException("Unbalanced call to unblock() detected.".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void close$room_runtime() {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                while (this.Camera2StreamConfigurationMap.get() != 0) {
                }
                this.getHighSpeedVideoFpsRangesFor.invoke();
            }
        }
    }
}
