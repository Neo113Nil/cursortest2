package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u00112\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/core/internal/persistence/Storage;", "", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "", "deleteBatch", "", "confirmBatchRead", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/core/internal/metrics/RemovalReason;Z)V", "dropAll", "()V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lcom/datadog/android/api/feature/EventWriteScope;", "getEventWriteScope", "(Lcom/datadog/android/api/context/DatadogContext;)Lkotlin/jvm/functions/Function1;", "Lcom/datadog/android/core/internal/persistence/BatchData;", "readNextBatch", "()Lcom/datadog/android/core/internal/persistence/BatchData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Storage {
    void confirmBatchRead(com.datadog.android.core.internal.persistence.BatchId batchId, com.datadog.android.core.internal.metrics.RemovalReason removalReason, boolean deleteBatch);

    void dropAll();

    kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> getEventWriteScope(com.datadog.android.api.context.DatadogContext datadogContext);

    com.datadog.android.core.internal.persistence.BatchData readNextBatch();
}
