package com.datadog.android.core.internal.metrics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/core/internal/metrics/NoOpMetricsDispatcher;", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "<init>", "()V", "Ljava/io/File;", "batchFile", "Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;", "batchMetadata", "", "sendBatchClosedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;)V", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "", "numPendingBatches", "sendBatchDeletedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpMetricsDispatcher implements com.datadog.android.core.internal.metrics.MetricsDispatcher {
    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public final void sendBatchDeletedMetric(java.io.File batchFile, com.datadog.android.core.internal.metrics.RemovalReason removalReason, int numPendingBatches) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchFile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removalReason, "");
    }

    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public final void sendBatchClosedMetric(java.io.File batchFile, com.datadog.android.core.internal.metrics.BatchClosedMetadata batchMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchFile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchMetadata, "");
    }
}
