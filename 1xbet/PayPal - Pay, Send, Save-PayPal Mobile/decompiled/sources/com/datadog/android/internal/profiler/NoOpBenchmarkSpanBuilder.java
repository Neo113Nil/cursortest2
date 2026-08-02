package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/internal/profiler/NoOpBenchmarkSpanBuilder;", "Lcom/datadog/android/internal/profiler/BenchmarkSpanBuilder;", "<init>", "()V", "Lcom/datadog/android/internal/profiler/BenchmarkSpan;", "startSpan", "()Lcom/datadog/android/internal/profiler/BenchmarkSpan;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpBenchmarkSpanBuilder implements com.datadog.android.internal.profiler.BenchmarkSpanBuilder {
    @Override // com.datadog.android.internal.profiler.BenchmarkSpanBuilder
    public final com.datadog.android.internal.profiler.BenchmarkSpan startSpan() {
        return new com.datadog.android.internal.profiler.NoOpBenchmarkSpan();
    }
}
