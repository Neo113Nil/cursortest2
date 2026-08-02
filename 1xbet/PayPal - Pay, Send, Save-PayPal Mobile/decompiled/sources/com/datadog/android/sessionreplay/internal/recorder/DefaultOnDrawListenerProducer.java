package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/DefaultOnDrawListenerProducer;", "Lcom/datadog/android/sessionreplay/internal/recorder/OnDrawListenerProducer;", "Lcom/datadog/android/sessionreplay/internal/recorder/SnapshotProducer;", "snapshotProducer", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "recordedDataQueueHandler", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "dynamicOptimizationEnabled", "<init>", "(Lcom/datadog/android/sessionreplay/internal/recorder/SnapshotProducer;Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;Lcom/datadog/android/api/feature/FeatureSdkCore;Z)V", "", "Landroid/view/View;", "decorViews", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "Landroid/view/ViewTreeObserver$OnDrawListener;", "create", "(Ljava/util/List;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;)Landroid/view/ViewTreeObserver$OnDrawListener;", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/recorder/SnapshotProducer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultOnDrawListenerProducer implements com.datadog.android.sessionreplay.internal.recorder.OnDrawListenerProducer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighResolutionOutputSizeshNQ4ISI;

    public DefaultOnDrawListenerProducer(com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer snapshotProducer, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snapshotProducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.getHighSpeedVideoFpsRangesFor = snapshotProducer;
        this.getHighSpeedVideoSizes = recordedDataQueueHandler;
        this.getHighResolutionOutputSizeshNQ4ISI = featureSdkCore;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.OnDrawListenerProducer
    public final android.view.ViewTreeObserver.OnDrawListener create(java.util.List<? extends android.view.View> decorViews, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decorViews, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        return new com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener(decorViews, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, textAndInputPrivacy, imagePrivacy, null, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, touchPrivacyManager, null, com.datadog.android.core.metrics.MethodCallSamplingRate.LOW.getRate(), 544, null);
    }
}
