package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/internal/profiler/NoOpBenchmarkTracer;", "Lcom/datadog/android/internal/profiler/BenchmarkTracer;", "<init>", "()V", "", "spanName", "", "additionalProperties", "Lcom/datadog/android/internal/profiler/BenchmarkSpanBuilder;", "spanBuilder", "(Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/internal/profiler/BenchmarkSpanBuilder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpBenchmarkTracer implements com.datadog.android.internal.profiler.BenchmarkTracer {
    @Override // com.datadog.android.internal.profiler.BenchmarkTracer
    public final com.datadog.android.internal.profiler.BenchmarkSpanBuilder spanBuilder(java.lang.String spanName, java.util.Map<java.lang.String, java.lang.String> additionalProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
        return new com.datadog.android.internal.profiler.NoOpBenchmarkSpanBuilder();
    }
}
