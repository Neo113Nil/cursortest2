package com.datadog.android.rum.internal.metric;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "", "", "sessionId", "", "ntpOffsetAtEndMs", "", "endMetric", "(Ljava/lang/String;J)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "missedEventType", "onMissedEventTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "errorKind", "onSdkErrorTracked", "(Ljava/lang/String;Ljava/lang/String;)V", "onSessionReplaySkippedFrameTracked", "(Ljava/lang/String;)V", "onSessionStopped", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEvent", "onViewTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "startReason", "ntpOffsetAtStartMs", "", "backgroundEventTracking", "startMetric", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SessionMetricDispatcher {
    void endMetric(java.lang.String sessionId, long ntpOffsetAtEndMs);

    void onMissedEventTracked(java.lang.String sessionId, com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType missedEventType);

    void onSdkErrorTracked(java.lang.String sessionId, java.lang.String errorKind);

    void onSessionReplaySkippedFrameTracked(java.lang.String sessionId);

    void onSessionStopped(java.lang.String sessionId);

    void onViewTracked(java.lang.String sessionId, com.datadog.android.rum.model.ViewEvent viewEvent);

    void startMetric(java.lang.String sessionId, com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason, long ntpOffsetAtStartMs, boolean backgroundEventTracking);
}
