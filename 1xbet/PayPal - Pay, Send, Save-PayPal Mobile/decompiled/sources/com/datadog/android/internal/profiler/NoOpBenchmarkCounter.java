package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/internal/profiler/NoOpBenchmarkCounter;", "Lcom/datadog/android/internal/profiler/BenchmarkCounter;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(JLjava/util/Map;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpBenchmarkCounter implements com.datadog.android.internal.profiler.BenchmarkCounter {
    @Override // com.datadog.android.internal.profiler.BenchmarkCounter
    public final void add(long value, java.util.Map<java.lang.String, java.lang.String> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }
}
