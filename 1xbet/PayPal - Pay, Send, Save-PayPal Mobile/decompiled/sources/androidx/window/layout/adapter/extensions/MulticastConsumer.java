package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0001J\u0014\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0001J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00010\f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/core/util/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "lastKnownValue", "Landroidx/window/layout/WindowLayoutInfo;", "registeredListeners", "", "accept", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "isEmpty", "", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MulticastConsumer implements androidx.core.util.Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
    private final java.util.Set<androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo>> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.window.layout.WindowLayoutInfo getHighSpeedVideoFpsRanges;
    private final android.content.Context getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoSizes;

    public MulticastConsumer(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoSizes = new java.util.concurrent.locks.ReentrantLock();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashSet();
    }

    @Override // androidx.core.util.Consumer
    public final void accept(androidx.window.extensions.layout.WindowLayoutInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            androidx.window.layout.WindowLayoutInfo translate$window_release = androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.getHighSpeedVideoFpsRangesFor, value);
            this.getHighSpeedVideoFpsRanges = translate$window_release;
            java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
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
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            androidx.window.layout.WindowLayoutInfo windowLayoutInfo = this.getHighSpeedVideoFpsRanges;
            if (windowLayoutInfo != null) {
                listener.accept(windowLayoutInfo);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.add(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void removeListener(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }
}
