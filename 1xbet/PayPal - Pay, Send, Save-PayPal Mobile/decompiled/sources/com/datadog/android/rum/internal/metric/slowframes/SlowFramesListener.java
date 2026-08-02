package com.datadog.android.rum.internal.metric.slowframes;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "Lcom/datadog/android/rum/internal/vitals/FrameStateListener;", "", "durationNs", "", "onAddLongTask", "(J)V", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "startedTimestampNs", "onViewCreated", "(Ljava/lang/String;J)V", "", "isViewCompleted", "viewDurationNs", "Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport$Snapshot;", "resolveReport", "(Ljava/lang/String;ZJ)Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport$Snapshot;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SlowFramesListener extends com.datadog.android.rum.internal.vitals.FrameStateListener {
    void onAddLongTask(long durationNs);

    void onViewCreated(java.lang.String viewId, long startedTimestampNs);

    com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot resolveReport(java.lang.String viewId, boolean isViewCompleted, long viewDurationNs);
}
