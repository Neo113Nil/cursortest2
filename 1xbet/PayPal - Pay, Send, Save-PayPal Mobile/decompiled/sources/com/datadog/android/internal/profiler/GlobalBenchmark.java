package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/datadog/android/internal/profiler/GlobalBenchmark;", "", "<init>", "()V", "", "track", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/internal/profiler/ExecutionTimer;", "createExecutionTimer", "(Ljava/lang/String;Lcom/datadog/android/internal/time/TimeProvider;)Lcom/datadog/android/internal/profiler/ExecutionTimer;", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "getBenchmarkSdkUploads", "()Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "Lcom/datadog/android/internal/profiler/BenchmarkProfiler;", "getProfiler", "()Lcom/datadog/android/internal/profiler/BenchmarkProfiler;", "benchmarkProfiler", "", "register", "(Lcom/datadog/android/internal/profiler/BenchmarkProfiler;)V", "benchmarkSdkUploads", "(Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/internal/profiler/BenchmarkProfiler;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GlobalBenchmark {
    public static final com.datadog.android.internal.profiler.GlobalBenchmark INSTANCE = new com.datadog.android.internal.profiler.GlobalBenchmark();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static com.datadog.android.internal.profiler.BenchmarkProfiler Camera2StreamConfigurationMap = new com.datadog.android.internal.profiler.NoOpBenchmarkProfiler();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static com.datadog.android.internal.profiler.BenchmarkSdkUploads getHighSpeedVideoFpsRangesFor = new com.datadog.android.internal.profiler.NoOpBenchmarkSdkUploads();

    private GlobalBenchmark() {
    }

    public final void register(com.datadog.android.internal.profiler.BenchmarkProfiler benchmarkProfiler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmarkProfiler, "");
        Camera2StreamConfigurationMap = benchmarkProfiler;
    }

    public final void register(com.datadog.android.internal.profiler.BenchmarkSdkUploads benchmarkSdkUploads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmarkSdkUploads, "");
        getHighSpeedVideoFpsRangesFor = benchmarkSdkUploads;
    }

    public final com.datadog.android.internal.profiler.BenchmarkProfiler getProfiler() {
        return Camera2StreamConfigurationMap;
    }

    public final com.datadog.android.internal.profiler.BenchmarkSdkUploads getBenchmarkSdkUploads() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public final com.datadog.android.internal.profiler.ExecutionTimer createExecutionTimer(java.lang.String track, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(track, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        if (getHighSpeedVideoFpsRangesFor instanceof com.datadog.android.internal.profiler.NoOpBenchmarkSdkUploads) {
            return new com.datadog.android.internal.profiler.NoOpExecutionTimer();
        }
        return new com.datadog.android.internal.profiler.DDExecutionTimer(track, timeProvider, null, 4, null);
    }
}
