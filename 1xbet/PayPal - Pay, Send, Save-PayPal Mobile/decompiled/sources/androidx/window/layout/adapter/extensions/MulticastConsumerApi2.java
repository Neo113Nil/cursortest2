package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001J\u0014\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00010\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumerApi2;", "Landroidx/core/util/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/reflection/Consumer2;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "lastKnownValue", "Landroidx/window/layout/WindowLayoutInfo;", "registeredListeners", "", "accept", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "isEmpty", "", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MulticastConsumerApi2 implements androidx.core.util.Consumer<androidx.window.extensions.layout.WindowLayoutInfo>, androidx.window.reflection.Consumer2<androidx.window.extensions.layout.WindowLayoutInfo> {
    private final java.util.Set<androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo>> Camera2StreamConfigurationMap;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoFpsRangesFor;
    private androidx.window.layout.WindowLayoutInfo getHighSpeedVideoSizes;

    public MulticastConsumerApi2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.locks.ReentrantLock();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashSet();
    }

    @Override // androidx.core.util.Consumer
    public final void accept(androidx.window.extensions.layout.WindowLayoutInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoFpsRangesFor;
        reentrantLock.lock();
        try {
            androidx.window.layout.WindowLayoutInfo translate$window_release = androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.getHighSpeedVideoFpsRanges, value);
            this.getHighSpeedVideoSizes = translate$window_release;
            java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.Consumer) it.next()).accept(translate$window_release);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addListener(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoFpsRangesFor;
        reentrantLock.lock();
        try {
            androidx.window.layout.WindowLayoutInfo windowLayoutInfo = this.getHighSpeedVideoSizes;
            if (windowLayoutInfo != null) {
                listener.accept(windowLayoutInfo);
            }
            this.Camera2StreamConfigurationMap.add(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void removeListener(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoFpsRangesFor;
        reentrantLock.lock();
        try {
            this.Camera2StreamConfigurationMap.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.isEmpty();
    }
}
