package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/internal/profiler/NoOpBenchmarkProfiler;", "Lcom/datadog/android/internal/profiler/BenchmarkProfiler;", "<init>", "()V", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lcom/datadog/android/internal/profiler/BenchmarkTracer;", "getTracer", "(Ljava/lang/String;)Lcom/datadog/android/internal/profiler/BenchmarkTracer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpBenchmarkProfiler implements com.datadog.android.internal.profiler.BenchmarkProfiler {
    @Override // com.datadog.android.internal.profiler.BenchmarkProfiler
    public final com.datadog.android.internal.profiler.BenchmarkTracer getTracer(java.lang.String operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return new com.datadog.android.internal.profiler.NoOpBenchmarkTracer();
    }
}
