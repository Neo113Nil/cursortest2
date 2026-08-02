package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/metrics/performance/JankStatsApi31Impl;", "Landroidx/metrics/performance/JankStatsApi26Impl;", "Landroidx/metrics/performance/JankStats;", "jankStats", "Landroid/view/View;", "view", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;Landroid/view/Window;)V", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "expectedDuration", "Landroid/view/FrameMetrics;", "frameMetrics", "Landroidx/metrics/performance/FrameDataApi31;", "getFrameData$metrics_performance_release", "(JJLandroid/view/FrameMetrics;)Landroidx/metrics/performance/FrameDataApi31;", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, "getExpectedFrameDuration", "(Landroid/view/FrameMetrics;)J", "frameData", "Landroidx/metrics/performance/FrameDataApi31;", "getFrameData", "()Landroidx/metrics/performance/FrameDataApi31;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JankStatsApi31Impl extends androidx.metrics.performance.JankStatsApi26Impl {
    private final androidx.metrics.performance.FrameDataApi31 frameData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi31Impl(androidx.metrics.performance.JankStats jankStats, android.view.View view, android.view.Window window) {
        super(jankStats, view, window);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jankStats, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
        this.frameData = new androidx.metrics.performance.FrameDataApi31(0L, 0L, 0L, 0L, 0L, false, getStateInfo());
    }

    public final androidx.metrics.performance.FrameDataApi31 getFrameData() {
        return this.frameData;
    }

    @Override // androidx.metrics.performance.JankStatsApi24Impl
    public final androidx.metrics.performance.FrameDataApi31 getFrameData$metrics_performance_release(long startTime, long expectedDuration, android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetrics, "");
        long metric = frameMetrics.getMetric(0);
        long metric2 = frameMetrics.getMetric(1);
        long metric3 = metric + metric2 + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        setPrevEnd(startTime + metric3);
        androidx.metrics.performance.PerformanceMetricsState state = getMetricsStateHolder().getState();
        if (state != null) {
            state.getIntervalStates$metrics_performance_release(startTime, getPrevEnd(), getStateInfo());
        }
        boolean z = metric3 > expectedDuration;
        long metric4 = frameMetrics.getMetric(8);
        this.frameData.update$metrics_performance_release(startTime, metric3, (metric4 - frameMetrics.getMetric(12)) + frameMetrics.getMetric(7), metric4, metric4 - frameMetrics.getMetric(13), z);
        return this.frameData;
    }

    @Override // androidx.metrics.performance.JankStatsApi24Impl
    public final long getExpectedFrameDuration(android.view.FrameMetrics metrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "");
        return metrics.getMetric(13);
    }
}
