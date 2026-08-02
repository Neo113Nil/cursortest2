package com.datadog.android.core.internal.metrics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "", "Ljava/io/File;", "batchFile", "Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;", "batchMetadata", "", "sendBatchClosedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;)V", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "", "numPendingBatches", "sendBatchDeletedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MetricsDispatcher {
    void sendBatchClosedMetric(java.io.File batchFile, com.datadog.android.core.internal.metrics.BatchClosedMetadata batchMetadata);

    void sendBatchDeletedMetric(java.io.File batchFile, com.datadog.android.core.internal.metrics.RemovalReason removalReason, int numPendingBatches);
}
