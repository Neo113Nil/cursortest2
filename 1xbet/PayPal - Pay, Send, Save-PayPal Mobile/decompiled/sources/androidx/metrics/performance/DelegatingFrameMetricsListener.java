package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/metrics/performance/DelegatingFrameMetricsListener;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "", "p0", "<init>", "(Ljava/util/List;)V", "Landroid/view/Window;", "Landroid/view/FrameMetrics;", "p1", "", "p2", "", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DelegatingFrameMetricsListener implements android.view.Window.OnFrameMetricsAvailableListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.metrics.performance.DelegatingFrameMetricsListener.Companion INSTANCE = new androidx.metrics.performance.DelegatingFrameMetricsListener.Companion(null);
    private static android.os.Handler frameMetricsHandler;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.util.List<android.view.Window.OnFrameMetricsAvailableListener> getHighSpeedVideoFpsRanges;

    public DelegatingFrameMetricsListener(java.util.List<android.view.Window.OnFrameMetricsAvailableListener> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRanges = list;
    }

    public final java.util.List<android.view.Window.OnFrameMetricsAvailableListener> getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(android.view.Window p0, android.view.FrameMetrics p1, int p2) {
        synchronized (this) {
            java.util.Iterator<android.view.Window.OnFrameMetricsAvailableListener> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                it.next().onFrameMetricsAvailable(p0, p1, p2);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/metrics/performance/DelegatingFrameMetricsListener$Companion;", "", "<init>", "()V", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Landroid/view/Window$OnFrameMetricsAvailableListener;", "delegate", "", "addDelegateToWindow", "(Landroid/view/Window;Landroid/view/Window$OnFrameMetricsAvailableListener;)Z", "", "removeDelegateFromWindow", "(Landroid/view/Window;Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "Landroid/os/Handler;", "frameMetricsHandler", "Landroid/os/Handler;", "getFrameMetricsHandler$metrics_performance_release", "()Landroid/os/Handler;", "setFrameMetricsHandler$metrics_performance_release", "(Landroid/os/Handler;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final android.os.Handler getFrameMetricsHandler$metrics_performance_release() {
            return androidx.metrics.performance.DelegatingFrameMetricsListener.frameMetricsHandler;
        }

        public final void setFrameMetricsHandler$metrics_performance_release(android.os.Handler handler) {
            androidx.metrics.performance.DelegatingFrameMetricsListener.frameMetricsHandler = handler;
        }

        public final boolean addDelegateToWindow(android.view.Window window, android.view.Window.OnFrameMetricsAvailableListener delegate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
            if (!window.getDecorView().isHardwareAccelerated()) {
                return false;
            }
            androidx.metrics.performance.DelegatingFrameMetricsListener delegatingFrameMetricsListener = (androidx.metrics.performance.DelegatingFrameMetricsListener) window.getDecorView().getTag(androidx.metrics.performance.R.id.metricsDelegator);
            if (delegatingFrameMetricsListener == null) {
                androidx.metrics.performance.DelegatingFrameMetricsListener delegatingFrameMetricsListener2 = new androidx.metrics.performance.DelegatingFrameMetricsListener(kotlin.collections.CollectionsKt.mutableListOf(delegate));
                if (getFrameMetricsHandler$metrics_performance_release() == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("FrameMetricsAggregator");
                    handlerThread.start();
                    setFrameMetricsHandler$metrics_performance_release(new android.os.Handler(handlerThread.getLooper()));
                }
                window.getDecorView().setTag(androidx.metrics.performance.R.id.metricsDelegator, delegatingFrameMetricsListener2);
                window.addOnFrameMetricsAvailableListener(delegatingFrameMetricsListener2, getFrameMetricsHandler$metrics_performance_release());
                return true;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
            synchronized (delegatingFrameMetricsListener) {
                delegatingFrameMetricsListener.getHighSpeedVideoFpsRanges.add(delegate);
            }
            return true;
        }

        public final void removeDelegateFromWindow(android.view.Window window, android.view.Window.OnFrameMetricsAvailableListener delegate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
            androidx.metrics.performance.DelegatingFrameMetricsListener delegatingFrameMetricsListener = (androidx.metrics.performance.DelegatingFrameMetricsListener) window.getDecorView().getTag(androidx.metrics.performance.R.id.metricsDelegator);
            if (delegatingFrameMetricsListener != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
                synchronized (delegatingFrameMetricsListener) {
                    delegatingFrameMetricsListener.getHighSpeedVideoFpsRanges.remove(delegate);
                }
                if (delegatingFrameMetricsListener.getHighSpeedVideoFpsRanges().isEmpty()) {
                    try {
                        window.removeOnFrameMetricsAvailableListener(delegatingFrameMetricsListener);
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                    window.getDecorView().setTag(androidx.metrics.performance.R.id.metricsDelegator, null);
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
