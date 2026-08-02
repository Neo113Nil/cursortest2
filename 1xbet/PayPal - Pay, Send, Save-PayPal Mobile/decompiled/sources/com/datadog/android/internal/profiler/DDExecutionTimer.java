package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/internal/profiler/DDExecutionTimer;", "Lcom/datadog/android/internal/profiler/ExecutionTimer;", "", "track", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "benchmarkSdkUploads", "<init>", "(Ljava/lang/String;Lcom/datadog/android/internal/time/TimeProvider;Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;)V", "T", "Lkotlin/Function0;", "action", "measure", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/internal/time/TimeProvider;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DDExecutionTimer implements com.datadog.android.internal.profiler.ExecutionTimer {
    private static final com.datadog.android.internal.profiler.DDExecutionTimer.Companion Companion = new com.datadog.android.internal.profiler.DDExecutionTimer.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.internal.profiler.BenchmarkSdkUploads getHighSpeedVideoFpsRanges;
    private final com.datadog.android.internal.time.TimeProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public DDExecutionTimer(java.lang.String str, com.datadog.android.internal.time.TimeProvider timeProvider, com.datadog.android.internal.profiler.BenchmarkSdkUploads benchmarkSdkUploads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmarkSdkUploads, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = timeProvider;
        this.getHighSpeedVideoFpsRanges = benchmarkSdkUploads;
    }

    public /* synthetic */ DDExecutionTimer(java.lang.String str, com.datadog.android.internal.time.TimeProvider timeProvider, com.datadog.android.internal.profiler.BenchmarkSdkUploads benchmarkSdkUploads, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, timeProvider, (i & 4) != 0 ? com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getBenchmarkSdkUploads() : benchmarkSdkUploads);
    }

    @Override // com.datadog.android.internal.profiler.ExecutionTimer
    public final <T> T measure(kotlin.jvm.functions.Function0<? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (this.getHighSpeedVideoFpsRangesFor.length() == 0) {
            return action.invoke();
        }
        long deviceElapsedTimeNanos = this.getHighResolutionOutputSizeshNQ4ISI.getDeviceElapsedTimeNanos();
        T invoke = action.invoke();
        final double deviceElapsedTimeNanos2 = (this.getHighResolutionOutputSizeshNQ4ISI.getDeviceElapsedTimeNanos() - deviceElapsedTimeNanos) / 1.0E9d;
        this.getHighSpeedVideoFpsRanges.getMeter("dd-sdk-android").createObservableGauge("android.benchmark.response_latency", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("track", this.getHighSpeedVideoFpsRangesFor)), new kotlin.jvm.functions.Function0<java.lang.Double>() { // from class: com.datadog.android.internal.profiler.DDExecutionTimer$responseLatencyReport$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Double invoke() {
                return java.lang.Double.valueOf(deviceElapsedTimeNanos2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        return invoke;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/internal/profiler/DDExecutionTimer$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
