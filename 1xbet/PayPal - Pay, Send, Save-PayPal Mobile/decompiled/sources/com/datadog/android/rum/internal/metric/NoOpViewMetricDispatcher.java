package com.datadog.android.rum.internal.metric;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/metric/NoOpViewMetricDispatcher;", "Lcom/datadog/android/rum/internal/metric/ViewMetricDispatcher;", "<init>", "()V", "", "newDuration", "", "onDurationResolved", "(J)V", "newLoadingTime", "onViewLoadingTimeResolved", "Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;", "invState", "tnsState", "sendViewEnded", "(Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpViewMetricDispatcher implements com.datadog.android.rum.internal.metric.ViewMetricDispatcher {
    @Override // com.datadog.android.rum.internal.metric.ViewMetricDispatcher
    public final void onDurationResolved(long newDuration) {
    }

    @Override // com.datadog.android.rum.internal.metric.ViewMetricDispatcher
    public final void onViewLoadingTimeResolved(long newLoadingTime) {
    }

    @Override // com.datadog.android.rum.internal.metric.ViewMetricDispatcher
    public final void sendViewEnded(com.datadog.android.rum.internal.metric.ViewInitializationMetricsState invState, com.datadog.android.rum.internal.metric.ViewInitializationMetricsState tnsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tnsState, "");
    }
}
