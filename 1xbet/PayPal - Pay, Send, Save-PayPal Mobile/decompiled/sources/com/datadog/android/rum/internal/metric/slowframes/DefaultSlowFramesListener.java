package com.datadog.android.rum.internal.metric.slowframes;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u00108"}, d2 = {"Lcom/datadog/android/rum/internal/metric/slowframes/DefaultSlowFramesListener;", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/datadog/android/rum/internal/metric/slowframes/UISlownessMetricDispatcher;", "metricDispatcher", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;Lcom/datadog/android/rum/internal/metric/slowframes/UISlownessMetricDispatcher;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;Lcom/datadog/android/internal/time/TimeProvider;)V", "", "p0", "Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport;", "", "durationNs", "", "onAddLongTask", "(J)V", "Landroidx/metrics/performance/FrameData;", "volatileFrameData", "onFrame", "(Landroidx/metrics/performance/FrameData;)V", "Lcom/datadog/android/rum/internal/domain/FrameMetricsData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onFrameMetricsData", "(Lcom/datadog/android/rum/internal/domain/FrameMetricsData;)V", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "startedTimestampNs", "onViewCreated", "(Ljava/lang/String;J)V", "", "isViewCompleted", "viewDurationNs", "Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport$Snapshot;", "resolveReport", "(Ljava/lang/String;ZJ)Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport$Snapshot;", "Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "getConfiguration$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "J", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "getInsightsCollector$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "Lcom/datadog/android/rum/internal/metric/slowframes/UISlownessMetricDispatcher;", "getMetricDispatcher$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/metric/slowframes/UISlownessMetricDispatcher;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultSlowFramesListener implements com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.rum.configuration.SlowFramesConfiguration configuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport> getHighSpeedVideoFpsRanges;
    private final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector;
    private final com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher metricDispatcher;

    public DefaultSlowFramesListener(com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration, com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher uISlownessMetricDispatcher, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slowFramesConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uISlownessMetricDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.configuration = slowFramesConfiguration;
        this.metricDispatcher = uISlownessMetricDispatcher;
        this.insightsCollector = insightsCollector;
        this.getHighResolutionOutputSizeshNQ4ISI = timeProvider.getDeviceElapsedTimeNanos();
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap<>();
    }

    /* renamed from: getConfiguration$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.configuration.SlowFramesConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: getMetricDispatcher$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher getMetricDispatcher() {
        return this.metricDispatcher;
    }

    /* renamed from: getInsightsCollector$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getInsightsCollector() {
        return this.insightsCollector;
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener
    public final void onViewCreated(java.lang.String viewId, long startedTimestampNs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        this.getHighSpeedVideoFpsRangesFor = viewId;
        this.getHighResolutionOutputSizeshNQ4ISI = startedTimestampNs;
        this.metricDispatcher.onViewCreated(viewId);
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener
    public final com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot resolveReport(java.lang.String viewId, boolean isViewCompleted, long viewDurationNs) {
        com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot snapshot;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport> concurrentHashMap = this.getHighSpeedVideoFpsRanges;
        com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport remove = isViewCompleted ? concurrentHashMap.remove(viewId) : concurrentHashMap.get(viewId);
        if (remove == null) {
            return null;
        }
        synchronized (remove) {
            if (isViewCompleted) {
                this.metricDispatcher.sendMetric(viewId, viewDurationNs);
            }
            snapshot = remove.snapshot();
        }
        return snapshot;
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public final void onFrame(androidx.metrics.performance.FrameData volatileFrameData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(volatileFrameData, "");
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str == null || volatileFrameData.getFrameStartNanos() < this.getHighResolutionOutputSizeshNQ4ISI) {
            if (str != null) {
                this.metricDispatcher.incrementMissedFrameCount(str);
                return;
            }
            return;
        }
        long frameDurationUiNanos = volatileFrameData.getFrameDurationUiNanos();
        long frameStartNanos = volatileFrameData.getFrameStartNanos();
        com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        synchronized (highSpeedVideoSizes) {
            highSpeedVideoSizes.setTotalFramesDurationNs(highSpeedVideoSizes.getTotalFramesDurationNs() + frameDurationUiNanos);
            if (frameDurationUiNanos <= this.configuration.getMaxSlowFrameThresholdNs$dd_sdk_android_rum_release() && volatileFrameData.getIsJank()) {
                highSpeedVideoSizes.setSlowFramesDurationNs(highSpeedVideoSizes.getSlowFramesDurationNs() + frameDurationUiNanos);
                this.metricDispatcher.incrementSlowFrameCount(str);
                com.datadog.android.rum.internal.domain.state.SlowFrameRecord lastSlowFrameRecord = highSpeedVideoSizes.getLastSlowFrameRecord();
                long startTimestampNs = lastSlowFrameRecord != null ? lastSlowFrameRecord.getStartTimestampNs() : frameStartNanos;
                if (lastSlowFrameRecord != null && frameStartNanos - startTimestampNs <= this.configuration.getContinuousSlowFrameThresholdNs$dd_sdk_android_rum_release()) {
                    lastSlowFrameRecord.setDurationNs(java.lang.Math.min(lastSlowFrameRecord.getDurationNs() + frameDurationUiNanos, this.configuration.getMaxSlowFrameThresholdNs$dd_sdk_android_rum_release() - 1));
                    this.insightsCollector.onSlowFrame(frameDurationUiNanos);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    return;
                }
                if (frameDurationUiNanos > 0) {
                    highSpeedVideoSizes.getSlowFramesRecords().add(new com.datadog.android.rum.internal.domain.state.SlowFrameRecord(frameStartNanos, frameDurationUiNanos));
                    this.insightsCollector.onSlowFrame(frameDurationUiNanos);
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                return;
            }
            this.metricDispatcher.incrementIgnoredFrameCount(str);
        }
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener
    public final void onAddLongTask(long durationNs) {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (durationNs < this.configuration.getFreezeDurationThresholdNs$dd_sdk_android_rum_release() || str == null) {
            return;
        }
        com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        synchronized (highSpeedVideoSizes) {
            highSpeedVideoSizes.setFreezeFramesDuration(highSpeedVideoSizes.getFreezeFramesDuration() + durationNs);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport getHighSpeedVideoSizes(java.lang.String p0) {
        final kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport> function0 = new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport>() { // from class: com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener$getViewPerformanceReport$createLambda$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport invoke() {
                long j;
                j = com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener.this.getHighResolutionOutputSizeshNQ4ISI;
                return new com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport(j, com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener.this.getConfiguration().getMaxSlowFramesAmount$dd_sdk_android_rum_release(), com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener.this.getConfiguration().getMinViewLifetimeThresholdNs$dd_sdk_android_rum_release());
            }

            {
                super(0);
            }
        };
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport> concurrentHashMap = this.getHighSpeedVideoFpsRanges;
        final kotlin.jvm.functions.Function1<java.lang.String, com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport> function1 = new kotlin.jvm.functions.Function1<java.lang.String, com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport>() { // from class: com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener$getViewPerformanceReport$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport invoke(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                return function0.invoke();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport computeIfAbsent = concurrentHashMap.computeIfAbsent(p0, new java.util.function.Function() { // from class: com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener.$r8$lambda$7sVmyyiTqV4GWaVMl34P7wXkU6Y(kotlin.jvm.functions.Function1.this, obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(computeIfAbsent, "");
        return computeIfAbsent;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport $r8$lambda$7sVmyyiTqV4GWaVMl34P7wXkU6Y(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        return (com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport) function1.invoke(obj);
    }

    @Override // com.datadog.android.rum.internal.vitals.FrameMetricsDataListener
    public final void onFrameMetricsData(com.datadog.android.rum.internal.domain.FrameMetricsData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
    }
}
