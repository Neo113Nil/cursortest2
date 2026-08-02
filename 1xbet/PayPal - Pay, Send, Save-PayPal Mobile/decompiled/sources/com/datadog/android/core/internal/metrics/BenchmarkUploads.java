package com.datadog.android.core.internal.metrics;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/core/internal/metrics/BenchmarkUploads;", "", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "benchmarkSdkUploads", "<init>", "(Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;)V", "", "featureName", "", "incrementBenchmarkUploadsCount$dd_sdk_android_core_release", "(Ljava/lang/String;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "sendBenchmarkBytesDeleted$dd_sdk_android_core_release", "(Ljava/lang/String;J)V", "sendBenchmarkBytesUploaded$dd_sdk_android_core_release", "sendBenchmarkBytesWritten$dd_sdk_android_core_release", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;J)V", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BenchmarkUploads {
    public static final java.lang.String BENCHMARK_BYTES_DELETED = "android.benchmark.bytes_deleted";
    public static final java.lang.String BENCHMARK_BYTES_UPLOADED = "android.benchmark.bytes_uploaded";
    public static final java.lang.String BENCHMARK_BYTES_WRITTEN = "android.benchmark.bytes_written";
    public static final java.lang.String BENCHMARK_UPLOAD_COUNT = "android.benchmark.upload_count";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.internal.profiler.BenchmarkSdkUploads getHighResolutionOutputSizeshNQ4ISI;

    public BenchmarkUploads(com.datadog.android.internal.profiler.BenchmarkSdkUploads benchmarkSdkUploads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmarkSdkUploads, "");
        this.getHighResolutionOutputSizeshNQ4ISI = benchmarkSdkUploads;
    }

    public /* synthetic */ BenchmarkUploads(com.datadog.android.internal.profiler.BenchmarkSdkUploads benchmarkSdkUploads, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getBenchmarkSdkUploads() : benchmarkSdkUploads);
    }

    public final void sendBenchmarkBytesUploaded$dd_sdk_android_core_release(java.lang.String featureName, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        getHighSpeedVideoSizes(featureName, BENCHMARK_BYTES_UPLOADED, value);
    }

    public final void sendBenchmarkBytesDeleted$dd_sdk_android_core_release(java.lang.String featureName, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        getHighSpeedVideoSizes(featureName, BENCHMARK_BYTES_DELETED, value);
    }

    public final void sendBenchmarkBytesWritten$dd_sdk_android_core_release(java.lang.String featureName, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        getHighSpeedVideoSizes(featureName, BENCHMARK_BYTES_WRITTEN, value);
    }

    public final void incrementBenchmarkUploadsCount$dd_sdk_android_core_release(java.lang.String featureName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        getHighSpeedVideoSizes(featureName, BENCHMARK_UPLOAD_COUNT, 1L);
    }

    private final void getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1, long p2) {
        this.getHighResolutionOutputSizeshNQ4ISI.getMeter("dd-sdk-android").getCounter(p1).add(p2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("track", p0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BenchmarkUploads() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
