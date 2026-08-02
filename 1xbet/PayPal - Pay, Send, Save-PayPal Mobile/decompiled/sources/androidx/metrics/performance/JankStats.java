package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%"}, d2 = {"Landroidx/metrics/performance/JankStats;", "", "Landroid/view/Window;", "p0", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "p1", "<init>", "(Landroid/view/Window;Landroidx/metrics/performance/JankStats$OnFrameListener;)V", "Landroidx/metrics/performance/FrameData;", "volatileFrameData", "", "logFrameData$metrics_performance_release", "(Landroidx/metrics/performance/FrameData;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "Camera2StreamConfigurationMap", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "Landroidx/metrics/performance/JankStatsBaseImpl;", "implementation", "Landroidx/metrics/performance/JankStatsBaseImpl;", "getImplementation$metrics_performance_release", "()Landroidx/metrics/performance/JankStatsBaseImpl;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isTrackingEnabled", "Z", "()Z", "setTrackingEnabled", "(Z)V", "", "jankHeuristicMultiplier", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getJankHeuristicMultiplier", "()F", "setJankHeuristicMultiplier", "(F)V", "Companion", "OnFrameListener"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JankStats {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.metrics.performance.JankStats.Companion INSTANCE = new androidx.metrics.performance.JankStats.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.metrics.performance.PerformanceMetricsState.Holder getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.metrics.performance.JankStats.OnFrameListener getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.metrics.performance.JankStatsBaseImpl implementation;
    private boolean isTrackingEnabled;
    private float jankHeuristicMultiplier;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/metrics/performance/JankStats$OnFrameListener;", "", "Landroidx/metrics/performance/FrameData;", "volatileFrameData", "", "onFrame", "(Landroidx/metrics/performance/FrameData;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnFrameListener {
        void onFrame(androidx.metrics.performance.FrameData volatileFrameData);
    }

    private JankStats(android.view.Window window, androidx.metrics.performance.JankStats.OnFrameListener onFrameListener) {
        androidx.metrics.performance.JankStatsApi26Impl jankStatsApi26Impl;
        this.getHighResolutionOutputSizeshNQ4ISI = onFrameListener;
        android.view.View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            throw new java.lang.IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        }
        this.getHighSpeedVideoFpsRangesFor = androidx.metrics.performance.PerformanceMetricsState.INSTANCE.create$metrics_performance_release(peekDecorView);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            jankStatsApi26Impl = new androidx.metrics.performance.JankStatsApi31Impl(this, peekDecorView, window);
        } else {
            jankStatsApi26Impl = new androidx.metrics.performance.JankStatsApi26Impl(this, peekDecorView, window);
        }
        this.implementation = jankStatsApi26Impl;
        ((androidx.metrics.performance.JankStatsApi16Impl) jankStatsApi26Impl).setupFrameTimer(true);
        this.isTrackingEnabled = true;
        this.jankHeuristicMultiplier = 2.0f;
    }

    /* renamed from: getImplementation$metrics_performance_release, reason: from getter */
    public final androidx.metrics.performance.JankStatsBaseImpl getImplementation() {
        return this.implementation;
    }

    /* renamed from: isTrackingEnabled, reason: from getter */
    public final boolean getIsTrackingEnabled() {
        return this.isTrackingEnabled;
    }

    public final void setTrackingEnabled(boolean z) {
        if (z != this.isTrackingEnabled) {
            this.implementation.setupFrameTimer(z);
            this.isTrackingEnabled = z;
        }
    }

    public final float getJankHeuristicMultiplier() {
        return this.jankHeuristicMultiplier;
    }

    public final void setJankHeuristicMultiplier(float f) {
        androidx.metrics.performance.JankStatsBaseImpl.INSTANCE.setFrameDuration(-1L);
        this.jankHeuristicMultiplier = f;
    }

    public final void logFrameData$metrics_performance_release(androidx.metrics.performance.FrameData volatileFrameData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(volatileFrameData, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onFrame(volatileFrameData);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/metrics/performance/JankStats$Companion;", "", "<init>", "()V", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Landroidx/metrics/performance/JankStats$OnFrameListener;", "frameListener", "Landroidx/metrics/performance/JankStats;", "createAndTrack", "(Landroid/view/Window;Landroidx/metrics/performance/JankStats$OnFrameListener;)Landroidx/metrics/performance/JankStats;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.metrics.performance.JankStats createAndTrack(android.view.Window window, androidx.metrics.performance.JankStats.OnFrameListener frameListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameListener, "");
            return new androidx.metrics.performance.JankStats(window, frameListener, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.metrics.performance.JankStats createAndTrack(android.view.Window window, androidx.metrics.performance.JankStats.OnFrameListener onFrameListener) {
        return INSTANCE.createAndTrack(window, onFrameListener);
    }

    public /* synthetic */ JankStats(android.view.Window window, androidx.metrics.performance.JankStats.OnFrameListener onFrameListener, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(window, onFrameListener);
    }
}
