package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Landroidx/metrics/performance/JankStatsApi24Impl;", "Landroidx/metrics/performance/JankStatsApi16Impl;", "Landroidx/metrics/performance/JankStats;", "jankStats", "Landroid/view/View;", "view", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;Landroid/view/Window;)V", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "expectedDuration", "Landroid/view/FrameMetrics;", "frameMetrics", "Landroidx/metrics/performance/FrameDataApi24;", "getFrameData$metrics_performance_release", "(JJLandroid/view/FrameMetrics;)Landroidx/metrics/performance/FrameDataApi24;", "getFrameStartTime$metrics_performance_release", "(Landroid/view/FrameMetrics;)J", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, "getExpectedFrameDuration", "", "enable", "", "setupFrameTimer", "(Z)V", "Camera2StreamConfigurationMap", "Landroid/view/Window;", "getHighSpeedVideoSizes", "prevStart", "J", "getPrevStart", "()J", "setPrevStart", "(J)V", "listenerAddedTime", "getListenerAddedTime", "setListenerAddedTime", "prevEnd", "getPrevEnd", "setPrevEnd", "Landroidx/metrics/performance/FrameDataApi24;", "getHighSpeedVideoFpsRangesFor", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "getHighSpeedVideoFpsRanges", "Landroid/view/Window$OnFrameMetricsAvailableListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class JankStatsApi24Impl extends androidx.metrics.performance.JankStatsApi16Impl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.view.Window getHighSpeedVideoSizes;
    private final android.view.Window.OnFrameMetricsAvailableListener getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.metrics.performance.FrameDataApi24 getHighSpeedVideoFpsRangesFor;
    private long listenerAddedTime;
    private long prevEnd;
    private long prevStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi24Impl(final androidx.metrics.performance.JankStats jankStats, android.view.View view, android.view.Window window) {
        super(jankStats, view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jankStats, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
        this.getHighSpeedVideoSizes = window;
        this.getHighSpeedVideoFpsRangesFor = new androidx.metrics.performance.FrameDataApi24(0L, 0L, 0L, false, getStateInfo());
        this.getHighSpeedVideoFpsRanges = new android.view.Window.OnFrameMetricsAvailableListener() { // from class: androidx.metrics.performance.JankStatsApi24Impl$$ExternalSyntheticLambda1
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(android.view.Window window2, android.view.FrameMetrics frameMetrics, int i) {
                androidx.metrics.performance.JankStatsApi24Impl.getHighSpeedVideoSizes(androidx.metrics.performance.JankStatsApi24Impl.this, jankStats, window2, frameMetrics, i);
            }
        };
    }

    public final long getPrevStart() {
        return this.prevStart;
    }

    public final void setPrevStart(long j) {
        this.prevStart = j;
    }

    public final long getListenerAddedTime() {
        return this.listenerAddedTime;
    }

    public final void setListenerAddedTime(long j) {
        this.listenerAddedTime = j;
    }

    public final long getPrevEnd() {
        return this.prevEnd;
    }

    public final void setPrevEnd(long j) {
        this.prevEnd = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(androidx.metrics.performance.JankStatsApi24Impl jankStatsApi24Impl, androidx.metrics.performance.JankStats jankStats, android.view.Window window, android.view.FrameMetrics frameMetrics, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(frameMetrics);
        long max = java.lang.Math.max(jankStatsApi24Impl.getFrameStartTime$metrics_performance_release(frameMetrics), jankStatsApi24Impl.prevEnd);
        if (max < jankStatsApi24Impl.listenerAddedTime || max == jankStatsApi24Impl.prevStart) {
            return;
        }
        jankStats.logFrameData$metrics_performance_release(jankStatsApi24Impl.getFrameData$metrics_performance_release(max, (long) (jankStatsApi24Impl.getExpectedFrameDuration(frameMetrics) * jankStats.getJankHeuristicMultiplier()), frameMetrics));
        jankStatsApi24Impl.prevStart = max;
    }

    public androidx.metrics.performance.FrameDataApi24 getFrameData$metrics_performance_release(long startTime, long expectedDuration, android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetrics, "");
        long metric = frameMetrics.getMetric(0);
        long metric2 = frameMetrics.getMetric(1);
        long metric3 = metric + metric2 + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        this.prevEnd = startTime + metric3;
        androidx.metrics.performance.PerformanceMetricsState state = getMetricsStateHolder().getState();
        if (state != null) {
            state.getIntervalStates$metrics_performance_release(startTime, this.prevEnd, getStateInfo());
        }
        this.getHighSpeedVideoFpsRangesFor.update$metrics_performance_release(startTime, metric3, frameMetrics.getMetric(8), metric3 > expectedDuration);
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public long getFrameStartTime$metrics_performance_release(android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetrics, "");
        return getFrameStartTime$metrics_performance_release();
    }

    public long getExpectedFrameDuration(android.view.FrameMetrics metrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "");
        return getExpectedFrameDuration(getDecorViewRef$metrics_performance_release().get());
    }

    @Override // androidx.metrics.performance.JankStatsApi16Impl, androidx.metrics.performance.JankStatsBaseImpl
    public void setupFrameTimer(final boolean enable) {
        this.getHighSpeedVideoSizes.getDecorView().post(new java.lang.Runnable() { // from class: androidx.metrics.performance.JankStatsApi24Impl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.metrics.performance.JankStatsApi24Impl.getHighSpeedVideoSizes(enable, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(boolean z, androidx.metrics.performance.JankStatsApi24Impl jankStatsApi24Impl) {
        if (z) {
            if (jankStatsApi24Impl.listenerAddedTime == 0 && androidx.metrics.performance.DelegatingFrameMetricsListener.INSTANCE.addDelegateToWindow(jankStatsApi24Impl.getHighSpeedVideoSizes, jankStatsApi24Impl.getHighSpeedVideoFpsRanges)) {
                jankStatsApi24Impl.listenerAddedTime = java.lang.System.nanoTime();
                return;
            }
            return;
        }
        androidx.metrics.performance.DelegatingFrameMetricsListener.INSTANCE.removeDelegateFromWindow(jankStatsApi24Impl.getHighSpeedVideoSizes, jankStatsApi24Impl.getHighSpeedVideoFpsRanges);
        jankStatsApi24Impl.listenerAddedTime = 0L;
    }
}
