package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/FPSVitalListener;", "Lcom/datadog/android/rum/internal/vitals/FrameStateListener;", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "vitalObserver", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "", "screenRefreshRate", "<init>", "(Lcom/datadog/android/rum/internal/vitals/VitalObserver;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;D)V", "Landroidx/metrics/performance/FrameData;", "volatileFrameData", "", "onFrame", "(Landroidx/metrics/performance/FrameData;)V", "Lcom/datadog/android/rum/internal/domain/FrameMetricsData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onFrameMetricsData", "(Lcom/datadog/android/rum/internal/domain/FrameMetricsData;)V", "getHighSpeedVideoSizes", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "D", "", "J", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FPSVitalListener implements com.datadog.android.rum.internal.vitals.FrameStateListener {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;
    private double getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private double getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.VitalObserver getHighSpeedVideoFpsRangesFor;
    private static final double Camera2StreamConfigurationMap = java.util.concurrent.TimeUnit.SECONDS.toNanos(1);

    public FPSVitalListener(com.datadog.android.rum.internal.vitals.VitalObserver vitalObserver, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalObserver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getHighSpeedVideoFpsRangesFor = vitalObserver;
        this.getHighResolutionOutputSizeshNQ4ISI = buildSdkVersionProvider;
        this.getHighSpeedVideoFpsRanges = d;
        this.Camera2StreamConfigurationMap = 16666666L;
        this.getHighSpeedVideoSizes = 60.0d;
    }

    public /* synthetic */ FPSVitalListener(com.datadog.android.rum.internal.vitals.VitalObserver vitalObserver, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, double d, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(vitalObserver, (i & 2) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider, (i & 4) != 0 ? 60.0d : d);
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public final void onFrame(androidx.metrics.performance.FrameData volatileFrameData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(volatileFrameData, "");
        double frameDurationUiNanos = volatileFrameData.getFrameDurationUiNanos();
        if (frameDurationUiNanos > 0.0d) {
            double d = Camera2StreamConfigurationMap;
            double d2 = d / frameDurationUiNanos;
            if (this.getHighResolutionOutputSizeshNQ4ISI.getIsAtLeastS()) {
                this.getHighSpeedVideoFpsRanges = d / this.Camera2StreamConfigurationMap;
            } else if (this.getHighResolutionOutputSizeshNQ4ISI.getVersion() == 30) {
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
            }
            double coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(d2 * (60.0d / this.getHighSpeedVideoFpsRanges), 60.0d);
            if (coerceAtMost > 1.0d) {
                this.getHighSpeedVideoFpsRangesFor.onNewSample(coerceAtMost);
            }
        }
    }

    @Override // com.datadog.android.rum.internal.vitals.FrameMetricsDataListener
    public final void onFrameMetricsData(com.datadog.android.rum.internal.domain.FrameMetricsData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        this.getHighSpeedVideoSizes = data.getDisplayRefreshRate();
        if (this.getHighResolutionOutputSizeshNQ4ISI.getIsAtLeastS()) {
            this.Camera2StreamConfigurationMap = data.getDeadline();
        }
    }
}
