package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/internal/profiler/BenchmarkTracer;", "", "", "spanName", "", "additionalProperties", "Lcom/datadog/android/internal/profiler/BenchmarkSpanBuilder;", "spanBuilder", "(Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/internal/profiler/BenchmarkSpanBuilder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BenchmarkTracer {
    com.datadog.android.internal.profiler.BenchmarkSpanBuilder spanBuilder(java.lang.String spanName, java.util.Map<java.lang.String, java.lang.String> additionalProperties);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.internal.profiler.BenchmarkSpanBuilder spanBuilder$default(com.datadog.android.internal.profiler.BenchmarkTracer benchmarkTracer, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: spanBuilder");
            }
            if ((i & 2) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            return benchmarkTracer.spanBuilder(str, map);
        }
    }
}
