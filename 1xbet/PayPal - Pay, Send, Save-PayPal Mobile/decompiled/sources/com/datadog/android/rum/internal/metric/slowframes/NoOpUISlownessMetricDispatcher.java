package com.datadog.android.rum.internal.metric.slowframes;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/metric/slowframes/NoOpUISlownessMetricDispatcher;", "Lcom/datadog/android/rum/internal/metric/slowframes/UISlownessMetricDispatcher;", "<init>", "()V", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "incrementIgnoredFrameCount", "(Ljava/lang/String;)V", "incrementMissedFrameCount", "incrementSlowFrameCount", "onViewCreated", "", "viewDurationNs", "sendMetric", "(Ljava/lang/String;J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpUISlownessMetricDispatcher implements com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher {
    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void sendMetric(java.lang.String viewId, long viewDurationNs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void onViewCreated(java.lang.String viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void incrementSlowFrameCount(java.lang.String viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void incrementMissedFrameCount(java.lang.String viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
    }

    @Override // com.datadog.android.rum.internal.metric.slowframes.UISlownessMetricDispatcher
    public final void incrementIgnoredFrameCount(java.lang.String viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
    }
}
