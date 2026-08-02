package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u00060\u0002j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "T", "", "<init>", "()V", "get", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/ThreadMap;", "Landroidx/compose/runtime/internal/getHighSpeedVideoSizes;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/platform/SynchronizedObject;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private T getHighSpeedVideoSizes;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.internal.ThreadMap> getHighSpeedVideoFpsRanges;

    public SnapshotThreadLocal() {
        androidx.compose.runtime.internal.ThreadMap threadMap;
        threadMap = androidx.compose.runtime.internal.SnapshotThreadLocalKt.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(threadMap);
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    }

    public final T get() {
        long currentThreadId = androidx.compose.runtime.internal.Thread_jvmKt.currentThreadId();
        if (currentThreadId == androidx.compose.runtime.internal.Thread_androidKt.getMainThreadId()) {
            return this.getHighSpeedVideoSizes;
        }
        return (T) this.getHighSpeedVideoFpsRanges.get().get(currentThreadId);
    }

    public final void set(T value) {
        long currentThreadId = androidx.compose.runtime.internal.Thread_jvmKt.currentThreadId();
        if (currentThreadId == androidx.compose.runtime.internal.Thread_androidKt.getMainThreadId()) {
            this.getHighSpeedVideoSizes = value;
            return;
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            androidx.compose.runtime.internal.ThreadMap threadMap = this.getHighSpeedVideoFpsRanges.get();
            if (threadMap.trySet(currentThreadId, value)) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.set(threadMap.newWith(currentThreadId, value));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
