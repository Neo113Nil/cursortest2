package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102"}, d2 = {"Landroidx/metrics/performance/JankStatsApi16Impl;", "Landroidx/metrics/performance/JankStatsBaseImpl;", "Landroidx/metrics/performance/JankStats;", "jankStats", "Landroid/view/View;", "view", "<init>", "(Landroidx/metrics/performance/JankStats;Landroid/view/View;)V", "", "enable", "", "setupFrameTimer", "(Z)V", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "uiDuration", "expectedDuration", "Landroidx/metrics/performance/FrameData;", "getFrameData$metrics_performance_release", "(JJJ)Landroidx/metrics/performance/FrameData;", "getFrameStartTime$metrics_performance_release", "()J", "getExpectedFrameDuration", "(Landroid/view/View;)J", "Ljava/lang/ref/WeakReference;", "decorViewRef", "Ljava/lang/ref/WeakReference;", "getDecorViewRef$metrics_performance_release", "()Ljava/lang/ref/WeakReference;", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "metricsStateHolder", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "getMetricsStateHolder", "()Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "", "Landroidx/metrics/performance/StateInfo;", "stateInfo", "Ljava/util/List;", "getStateInfo", "()Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/metrics/performance/FrameData;", "getHighSpeedVideoFpsRanges", "Landroidx/metrics/performance/JankStatsApi16Impl$onFrameListenerDelegate$1;", "Camera2StreamConfigurationMap", "Landroidx/metrics/performance/JankStatsApi16Impl$onFrameListenerDelegate$1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class JankStatsApi16Impl extends androidx.metrics.performance.JankStatsBaseImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.metrics.performance.JankStatsApi16Impl$onFrameListenerDelegate$1 getHighSpeedVideoFpsRangesFor;
    private final android.view.Choreographer choreographer;
    private final java.lang.ref.WeakReference<android.view.View> decorViewRef;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.metrics.performance.FrameData getHighSpeedVideoFpsRanges;
    private final androidx.metrics.performance.PerformanceMetricsState.Holder metricsStateHolder;
    private final java.util.List<androidx.metrics.performance.StateInfo> stateInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.metrics.performance.JankStatsApi16Impl$onFrameListenerDelegate$1] */
    public JankStatsApi16Impl(final androidx.metrics.performance.JankStats jankStats, android.view.View view) {
        super(jankStats);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jankStats, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        this.decorViewRef = new java.lang.ref.WeakReference<>(view);
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(choreographer, "");
        this.choreographer = choreographer;
        this.metricsStateHolder = androidx.metrics.performance.PerformanceMetricsState.INSTANCE.getHolderForHierarchy(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.stateInfo = arrayList;
        this.getHighSpeedVideoFpsRanges = new androidx.metrics.performance.FrameData(0L, 0L, false, arrayList);
        this.getHighSpeedVideoFpsRangesFor = new androidx.metrics.performance.OnFrameListenerDelegate() { // from class: androidx.metrics.performance.JankStatsApi16Impl$onFrameListenerDelegate$1
            @Override // androidx.metrics.performance.OnFrameListenerDelegate
            public final void onFrame(long startTime, long uiDuration, long expectedDuration) {
                androidx.metrics.performance.JankStats jankStats2 = androidx.metrics.performance.JankStats.this;
                jankStats2.logFrameData$metrics_performance_release(this.getFrameData$metrics_performance_release(startTime, uiDuration, (long) (expectedDuration * jankStats2.getJankHeuristicMultiplier())));
            }
        };
    }

    public final java.lang.ref.WeakReference<android.view.View> getDecorViewRef$metrics_performance_release() {
        return this.decorViewRef;
    }

    public final android.view.Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final androidx.metrics.performance.PerformanceMetricsState.Holder getMetricsStateHolder() {
        return this.metricsStateHolder;
    }

    public final java.util.List<androidx.metrics.performance.StateInfo> getStateInfo() {
        return this.stateInfo;
    }

    @Override // androidx.metrics.performance.JankStatsBaseImpl
    public void setupFrameTimer(final boolean enable) {
        final android.view.View view = this.decorViewRef.get();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: androidx.metrics.performance.JankStatsApi16Impl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.metrics.performance.JankStatsApi16Impl.getHighSpeedVideoSizes(enable, view, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(boolean z, android.view.View view, androidx.metrics.performance.JankStatsApi16Impl jankStatsApi16Impl) {
        if (z) {
            androidx.metrics.performance.DelegatingOnPreDrawListener.INSTANCE.addDelegateToDecorView(view, jankStatsApi16Impl.choreographer, jankStatsApi16Impl.getHighSpeedVideoFpsRangesFor);
        } else {
            androidx.metrics.performance.DelegatingOnPreDrawListener.INSTANCE.removeDelegateFromDecorView(view, jankStatsApi16Impl.getHighSpeedVideoFpsRangesFor);
        }
    }

    public androidx.metrics.performance.FrameData getFrameData$metrics_performance_release(long startTime, long uiDuration, long expectedDuration) {
        androidx.metrics.performance.PerformanceMetricsState state = this.metricsStateHolder.getState();
        if (state != null) {
            state.getIntervalStates$metrics_performance_release(startTime, startTime + uiDuration, this.stateInfo);
        }
        this.getHighSpeedVideoFpsRanges.update$metrics_performance_release(startTime, uiDuration, uiDuration > expectedDuration);
        return this.getHighSpeedVideoFpsRanges;
    }

    public final long getFrameStartTime$metrics_performance_release() {
        java.lang.Object obj = androidx.metrics.performance.DelegatingOnPreDrawListener.INSTANCE.getChoreographerLastFrameTimeField().get(this.choreographer);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return ((java.lang.Long) obj).longValue();
    }

    public final long getExpectedFrameDuration(android.view.View view) {
        return androidx.metrics.performance.DelegatingOnPreDrawListener.INSTANCE.getExpectedFrameDuration(view);
    }
}
