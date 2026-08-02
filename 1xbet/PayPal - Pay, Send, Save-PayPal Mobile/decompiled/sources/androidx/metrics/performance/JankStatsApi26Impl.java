package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/metrics/performance/JankStatsApi26Impl;", "Landroidx/metrics/performance/JankStatsApi24Impl;", "Landroidx/metrics/performance/JankStats;", "jankStats", "Landroid/view/View;", "view", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;Landroid/view/Window;)V", "Landroid/view/FrameMetrics;", "frameMetrics", "", "getFrameStartTime$metrics_performance_release", "(Landroid/view/FrameMetrics;)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class JankStatsApi26Impl extends androidx.metrics.performance.JankStatsApi24Impl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi26Impl(androidx.metrics.performance.JankStats jankStats, android.view.View view, android.view.Window window) {
        super(jankStats, view, window);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jankStats, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
    }

    @Override // androidx.metrics.performance.JankStatsApi24Impl
    public long getFrameStartTime$metrics_performance_release(android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetrics, "");
        return frameMetrics.getMetric(10);
    }
}
