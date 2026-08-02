package com.datadog.android.rum.internal.metric;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/metric/NoOpSessionMetricDispatcher;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "<init>", "()V", "", "sessionId", "", "ntpOffsetAtEndMs", "", "endMetric", "(Ljava/lang/String;J)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "missedEventType", "onMissedEventTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "errorKind", "onSdkErrorTracked", "(Ljava/lang/String;Ljava/lang/String;)V", "onSessionReplaySkippedFrameTracked", "(Ljava/lang/String;)V", "onSessionStopped", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEvent", "onViewTracked", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "startReason", "ntpOffsetAtStartMs", "", "backgroundEventTracking", "startMetric", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpSessionMetricDispatcher implements com.datadog.android.rum.internal.metric.SessionMetricDispatcher {
    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void startMetric(java.lang.String sessionId, com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason, long ntpOffsetAtStartMs, boolean backgroundEventTracking) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onViewTracked(java.lang.String sessionId, com.datadog.android.rum.model.ViewEvent viewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewEvent, "");
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onSessionStopped(java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onSessionReplaySkippedFrameTracked(java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onSdkErrorTracked(java.lang.String sessionId, java.lang.String errorKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void onMissedEventTracked(java.lang.String sessionId, com.datadog.android.rum.internal.metric.SessionEndedMetric.MissedEventType missedEventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missedEventType, "");
    }

    @Override // com.datadog.android.rum.internal.metric.SessionMetricDispatcher
    public final void endMetric(java.lang.String sessionId, long ntpOffsetAtEndMs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
    }
}
