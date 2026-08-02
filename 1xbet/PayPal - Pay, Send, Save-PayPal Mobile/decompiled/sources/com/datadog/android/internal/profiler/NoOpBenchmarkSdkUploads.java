package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/internal/profiler/NoOpBenchmarkSdkUploads;", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "<init>", "()V", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lcom/datadog/android/internal/profiler/BenchmarkMeter;", "getMeter", "(Ljava/lang/String;)Lcom/datadog/android/internal/profiler/BenchmarkMeter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpBenchmarkSdkUploads implements com.datadog.android.internal.profiler.BenchmarkSdkUploads {
    @Override // com.datadog.android.internal.profiler.BenchmarkSdkUploads
    public final com.datadog.android.internal.profiler.BenchmarkMeter getMeter(java.lang.String operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return new com.datadog.android.internal.profiler.NoOpBenchmarkMeter();
    }
}
