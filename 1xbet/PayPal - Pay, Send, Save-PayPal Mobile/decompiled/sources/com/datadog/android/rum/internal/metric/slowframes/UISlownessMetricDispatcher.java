package com.datadog.android.rum.internal.metric.slowframes;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/metric/slowframes/UISlownessMetricDispatcher;", "", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "incrementIgnoredFrameCount", "(Ljava/lang/String;)V", "incrementMissedFrameCount", "incrementSlowFrameCount", "onViewCreated", "", "viewDurationNs", "sendMetric", "(Ljava/lang/String;J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UISlownessMetricDispatcher {
    void incrementIgnoredFrameCount(java.lang.String viewId);

    void incrementMissedFrameCount(java.lang.String viewId);

    void incrementSlowFrameCount(java.lang.String viewId);

    void onViewCreated(java.lang.String viewId);

    void sendMetric(java.lang.String viewId, long viewDurationNs);
}
