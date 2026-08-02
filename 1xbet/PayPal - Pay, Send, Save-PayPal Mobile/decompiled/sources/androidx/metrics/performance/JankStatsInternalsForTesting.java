package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/metrics/performance/JankStatsInternalsForTesting;", "", "Landroidx/metrics/performance/JankStats;", "jankStats", "<init>", "(Landroidx/metrics/performance/JankStats;)V", "Landroidx/metrics/performance/PerformanceMetricsState;", "performanceMetricsState", "", "stateName", "", "removeStateNow", "(Landroidx/metrics/performance/PerformanceMetricsState;Ljava/lang/String;)V", "Landroidx/metrics/performance/FrameData;", "getFrameData", "()Landroidx/metrics/performance/FrameData;", "Landroid/view/FrameMetrics;", "frameMetrics", "(Landroid/view/FrameMetrics;)Landroidx/metrics/performance/FrameData;", "frameData", "logFrameData", "(Landroidx/metrics/performance/FrameData;)V", "Landroidx/metrics/performance/JankStats;", "getJankStats", "()Landroidx/metrics/performance/JankStats;", "Landroidx/metrics/performance/JankStatsBaseImpl;", "getHighSpeedVideoFpsRangesFor", "Landroidx/metrics/performance/JankStatsBaseImpl;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JankStatsInternalsForTesting {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.metrics.performance.JankStatsBaseImpl getHighSpeedVideoSizes;
    private final androidx.metrics.performance.JankStats jankStats;

    public JankStatsInternalsForTesting(androidx.metrics.performance.JankStats jankStats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jankStats, "");
        this.jankStats = jankStats;
        this.getHighSpeedVideoSizes = jankStats.getImplementation();
    }

    public final androidx.metrics.performance.JankStats getJankStats() {
        return this.jankStats;
    }

    public final void removeStateNow(androidx.metrics.performance.PerformanceMetricsState performanceMetricsState, java.lang.String stateName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performanceMetricsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateName, "");
        performanceMetricsState.removeStateNow$metrics_performance_release(stateName);
    }

    public final androidx.metrics.performance.FrameData getFrameData() {
        androidx.metrics.performance.JankStatsBaseImpl jankStatsBaseImpl = this.getHighSpeedVideoSizes;
        if (jankStatsBaseImpl instanceof androidx.metrics.performance.JankStatsApi16Impl) {
            return ((androidx.metrics.performance.JankStatsApi16Impl) jankStatsBaseImpl).getFrameData$metrics_performance_release(0L, 0L, 0L);
        }
        return null;
    }

    public final androidx.metrics.performance.FrameData getFrameData(android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetrics, "");
        androidx.metrics.performance.JankStatsBaseImpl jankStatsBaseImpl = this.getHighSpeedVideoSizes;
        if (jankStatsBaseImpl instanceof androidx.metrics.performance.JankStatsApi24Impl) {
            return ((androidx.metrics.performance.JankStatsApi24Impl) jankStatsBaseImpl).getFrameData$metrics_performance_release(0L, 0L, frameMetrics);
        }
        return null;
    }

    public final void logFrameData(androidx.metrics.performance.FrameData frameData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameData, "");
        this.jankStats.logFrameData$metrics_performance_release(frameData);
    }
}
