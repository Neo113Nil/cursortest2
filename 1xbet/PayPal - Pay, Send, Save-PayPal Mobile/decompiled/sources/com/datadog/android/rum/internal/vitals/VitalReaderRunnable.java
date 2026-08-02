package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/VitalReaderRunnable;", "Ljava/lang/Runnable;", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "reader", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "observer", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "", "periodMs", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/rum/internal/vitals/VitalReader;Lcom/datadog/android/rum/internal/vitals/VitalObserver;Ljava/util/concurrent/ScheduledExecutorService;J)V", "", "featureName", "", "", "context", "", "onContextUpdate", "(Ljava/lang/String;Ljava/util/Map;)V", "run", "()V", "Lcom/datadog/android/rum/internal/domain/RumContext;", "currentRumContext", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getCurrentRumContext$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "setCurrentRumContext$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/RumContext;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "getObserver", "()Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getSdkCore", "()Lcom/datadog/android/api/feature/FeatureSdkCore;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VitalReaderRunnable implements java.lang.Runnable, com.datadog.android.api.feature.FeatureContextUpdateReceiver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;
    private volatile com.datadog.android.rum.internal.domain.RumContext currentRumContext;
    private final java.util.concurrent.ScheduledExecutorService executor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.VitalReader Camera2StreamConfigurationMap;
    private final com.datadog.android.rum.internal.vitals.VitalObserver observer;
    private final com.datadog.android.api.feature.FeatureSdkCore sdkCore;

    public VitalReaderRunnable(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.rum.internal.vitals.VitalReader vitalReader, com.datadog.android.rum.internal.vitals.VitalObserver vitalObserver, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalObserver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.sdkCore = featureSdkCore;
        this.Camera2StreamConfigurationMap = vitalReader;
        this.observer = vitalObserver;
        this.executor = scheduledExecutorService;
        this.getHighSpeedVideoFpsRanges = j;
    }

    public final com.datadog.android.api.feature.FeatureSdkCore getSdkCore() {
        return this.sdkCore;
    }

    public final com.datadog.android.rum.internal.vitals.VitalObserver getObserver() {
        return this.observer;
    }

    public final java.util.concurrent.ScheduledExecutorService getExecutor() {
        return this.executor;
    }

    /* renamed from: getCurrentRumContext$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.domain.RumContext getCurrentRumContext() {
        return this.currentRumContext;
    }

    public final void setCurrentRumContext$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.RumContext rumContext) {
        this.currentRumContext = rumContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Double readVitalData;
        com.datadog.android.rum.internal.domain.RumContext rumContext = this.currentRumContext;
        if ((rumContext != null ? rumContext.getViewType() : null) == com.datadog.android.rum.internal.domain.scope.RumViewType.FOREGROUND && (readVitalData = this.Camera2StreamConfigurationMap.readVitalData()) != null) {
            this.observer.onNewSample(readVitalData.doubleValue());
        }
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.scheduleSafe(this.executor, "Vitals monitoring", this.getHighSpeedVideoFpsRanges, java.util.concurrent.TimeUnit.MILLISECONDS, this.sdkCore.getInternalLogger(), this);
    }

    @Override // com.datadog.android.api.feature.FeatureContextUpdateReceiver
    public final void onContextUpdate(java.lang.String featureName, java.util.Map<java.lang.String, ? extends java.lang.Object> context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(featureName, "rum")) {
            this.currentRumContext = com.datadog.android.rum.internal.domain.RumContext.INSTANCE.fromFeatureContext(context);
        }
    }
}
