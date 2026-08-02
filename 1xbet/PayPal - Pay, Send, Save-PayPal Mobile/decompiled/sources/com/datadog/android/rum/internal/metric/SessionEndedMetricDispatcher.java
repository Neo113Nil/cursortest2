package com.datadog.android.rum.internal.metric;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\"\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetricDispatcher;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "sessionSamplingRate", "<init>", "(Lcom/datadog/android/api/InternalLogger;F)V", "", "sessionId", "", "ntpOffsetAtEndMs", "", "endMetric", "(Ljava/lang/String;J)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "missedEventType", "onMissedEventTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "errorKind", "onSdkErrorTracked", "(Ljava/lang/String;Ljava/lang/String;)V", "onSessionReplaySkippedFrameTracked", "(Ljava/lang/String;)V", "onSessionStopped", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEvent", "onViewTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "startReason", "ntpOffsetAtStartMs", "", "backgroundEventTracking", "startMetric", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/ConcurrentHashMap;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionEndedMetricDispatcher implements com.datadog.android.rum.internal.metric.SessionMetricDispatcher {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.datadog.android.rum.internal.metric.SessionEndedMetric> getHighResolutionOutputSizeshNQ4ISI;

    public SessionEndedMetricDispatcher(com.datadog.android.api.InternalLogger internalLogger, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = internalLogger;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void startMetric(java.lang.String sessionId, com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason, long ntpOffsetAtStartMs, boolean backgroundEventTracking) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        this.getHighResolutionOutputSizeshNQ4ISI.put(sessionId, new com.datadog.android.rum.internal.metric.SessionEndedMetric(sessionId, startReason, ntpOffsetAtStartMs, backgroundEventTracking));
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void endMetric(java.lang.String sessionId, long ntpOffsetAtEndMs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        com.datadog.android.rum.internal.metric.SessionEndedMetric remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(sessionId);
        if (remove != null) {
            this.Camera2StreamConfigurationMap.logMetric(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$endMetric$1$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.metric.SessionEndedMetric.RUM_SESSION_ENDED_METRIC_NAME;
                }
            }, remove.toMetricAttributes(ntpOffsetAtEndMs), 15.0f, java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges));
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onSessionStopped(java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        com.datadog.android.rum.internal.metric.SessionEndedMetric sessionEndedMetric = this.getHighResolutionOutputSizeshNQ4ISI.get(sessionId);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.onSessionStopped();
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onViewTracked(final java.lang.String sessionId, final com.datadog.android.rum.model.ViewEvent viewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewEvent, "");
        com.datadog.android.rum.internal.metric.SessionEndedMetric sessionEndedMetric = this.getHighResolutionOutputSizeshNQ4ISI.get(sessionId);
        if (sessionEndedMetric == null || !sessionEndedMetric.onViewTracked(viewEvent)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$onViewTracked$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher.access$buildViewTrackError(com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher.this, sessionId, viewEvent);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onSdkErrorTracked(final java.lang.String sessionId, final java.lang.String errorKind) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        com.datadog.android.rum.internal.metric.SessionEndedMetric sessionEndedMetric = this.getHighResolutionOutputSizeshNQ4ISI.get(sessionId);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.onErrorTracked(errorKind);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher$onSdkErrorTracked$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher.access$buildSdkErrorTrackError(com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher.this, sessionId, errorKind);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onMissedEventTracked(java.lang.String sessionId, com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType missedEventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missedEventType, "");
        com.datadog.android.rum.internal.metric.SessionEndedMetric sessionEndedMetric = this.getHighResolutionOutputSizeshNQ4ISI.get(sessionId);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.onMissedEventTracked(missedEventType);
        }
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onSessionReplaySkippedFrameTracked(java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        com.datadog.android.rum.internal.metric.SessionEndedMetric sessionEndedMetric = this.getHighResolutionOutputSizeshNQ4ISI.get(sessionId);
        if (sessionEndedMetric != null) {
            sessionEndedMetric.onSessionReplaySkippedFrameTracked();
        }
    }

    public static final /* synthetic */ java.lang.String access$buildSdkErrorTrackError(com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher sessionEndedMetricDispatcher, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to track ");
        sb.append(str2);
        sb.append(" error, session ");
        sb.append(str);
        sb.append(" has ended");
        return sb.toString();
    }

    public static final /* synthetic */ java.lang.String access$buildViewTrackError(com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher sessionEndedMetricDispatcher, java.lang.String str, com.datadog.android.rum.model.ViewEvent viewEvent) {
        java.lang.String str2;
        java.lang.String url = viewEvent.getView().getUrl();
        if (kotlin.jvm.internal.Intrinsics.areEqual(url, com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_APP_LAUNCH_VIEW_URL)) {
            str2 = "AppLaunch";
        } else {
            str2 = kotlin.jvm.internal.Intrinsics.areEqual(url, com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_URL) ? com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME : androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to track ");
        sb.append(str2);
        sb.append(" view in session with different UUID ");
        sb.append(str);
        return sb.toString();
    }
}
