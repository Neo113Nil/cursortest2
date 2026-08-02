package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/internal/profiler/NoOpBenchmarkMeter;", "Lcom/datadog/android/internal/profiler/BenchmarkMeter;", "<init>", "()V", "", "metricName", "", "tags", "Lkotlin/Function0;", "", com.sun.jna.Callback.METHOD_NAME, "", "createObservableGauge", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lcom/datadog/android/internal/profiler/BenchmarkCounter;", "getCounter", "(Ljava/lang/String;)Lcom/datadog/android/internal/profiler/BenchmarkCounter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpBenchmarkMeter implements com.datadog.android.internal.profiler.BenchmarkMeter {
    @Override // com.datadog.android.internal.profiler.BenchmarkMeter
    public final com.datadog.android.internal.profiler.BenchmarkCounter getCounter(java.lang.String operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return new com.datadog.android.internal.profiler.NoOpBenchmarkCounter();
    }

    @Override // com.datadog.android.internal.profiler.BenchmarkMeter
    public final void createObservableGauge(java.lang.String metricName, java.util.Map<java.lang.String, java.lang.String> tags, kotlin.jvm.functions.Function0<java.lang.Double> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }
}
