package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/Debouncer;", "", "Landroid/os/Handler;", "handler", "", "maxRecordDelayInNs", "Lcom/datadog/android/sessionreplay/internal/recorder/TimeBank;", "timeBank", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "dynamicOptimizationEnabled", "<init>", "(Landroid/os/Handler;JLcom/datadog/android/sessionreplay/internal/recorder/TimeBank;Lcom/datadog/android/api/feature/FeatureSdkCore;Z)V", "Ljava/lang/Runnable;", "runnable", "", "debounce$dd_sdk_android_session_replay_release", "(Ljava/lang/Runnable;)V", "p0", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "()V", "Lkotlin/Function0;", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function0;)V", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroid/os/Handler;", "J", "getInputFormats", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getOutputFormats", "getInputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/recorder/TimeBank;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Debouncer {
    public static final long DEBOUNCE_TIME_IN_MS = 64;
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private final android.os.Handler getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.sessionreplay.internal.recorder.TimeBank getInputSizeshNQ4ISI;
    private static final long getHighSpeedVideoFpsRangesFor = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(64);

    public Debouncer(android.os.Handler handler, long j, com.datadog.android.sessionreplay.internal.recorder.TimeBank timeBank, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBank, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.getHighSpeedVideoFpsRanges = handler;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getInputSizeshNQ4ISI = timeBank;
        this.getOutputFormats = featureSdkCore;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = true;
    }

    public /* synthetic */ Debouncer(android.os.Handler handler, long j, com.datadog.android.sessionreplay.internal.recorder.RecordingTimeBank recordingTimeBank, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler, (i & 2) != 0 ? getHighSpeedVideoFpsRangesFor : j, (i & 4) != 0 ? new com.datadog.android.sessionreplay.internal.recorder.RecordingTimeBank(0L, 1, null) : recordingTimeBank, featureSdkCore, z);
    }

    public final void debounce$dd_sdk_android_session_replay_release(final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        if (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRangesFor = this.getOutputFormats.getTimeProvider().getDeviceElapsedTimeNanos();
            this.getHighSpeedVideoSizes = false;
        }
        this.getHighSpeedVideoFpsRanges.removeCallbacksAndMessages(null);
        if (this.getOutputFormats.getTimeProvider().getDeviceElapsedTimeNanos() - this.getHighSpeedVideoFpsRangesFor >= this.getHighResolutionOutputSizeshNQ4ISI) {
            getHighSpeedVideoFpsRangesFor(runnable);
        } else {
            this.getHighSpeedVideoFpsRanges.postDelayed(new java.lang.Runnable() { // from class: com.datadog.android.sessionreplay.internal.recorder.Debouncer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.datadog.android.sessionreplay.internal.recorder.Debouncer.this.getHighSpeedVideoFpsRangesFor(runnable);
                }
            }, 64L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(final java.lang.Runnable p0) {
        if (this.Camera2StreamConfigurationMap) {
            Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.recorder.Debouncer$executeRunnable$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighSpeedVideoFpsRangesFor();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor() {
                    p0.run();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        } else {
            p0.run();
        }
        this.getHighSpeedVideoFpsRangesFor = this.getOutputFormats.getTimeProvider().getDeviceElapsedTimeNanos();
    }

    private final void Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
        if (this.getInputSizeshNQ4ISI.updateAndCheck(this.getOutputFormats.getTimeProvider().getDeviceElapsedTimeNanos())) {
            long deviceElapsedTimeNanos = this.getOutputFormats.getTimeProvider().getDeviceElapsedTimeNanos();
            p0.invoke();
            this.getInputSizeshNQ4ISI.consume(this.getOutputFormats.getTimeProvider().getDeviceElapsedTimeNanos() - deviceElapsedTimeNanos);
            return;
        }
        getHighSpeedVideoFpsRanges();
    }

    private final void getHighSpeedVideoFpsRanges() {
        com.datadog.android.api.feature.FeatureScope feature = this.getOutputFormats.getFeature("rum");
        if (feature == null) {
            return;
        }
        feature.sendEvent(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", com.datadog.android.rum.internal.RumFeature.TELEMETRY_SESSION_REPLAY_SKIP_FRAME)));
    }
}
