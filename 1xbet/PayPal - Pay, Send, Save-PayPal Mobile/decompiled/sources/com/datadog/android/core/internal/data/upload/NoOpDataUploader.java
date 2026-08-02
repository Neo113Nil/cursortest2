package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/NoOpDataUploader;", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "<init>", "()V", "Lcom/datadog/android/api/context/DatadogContext;", "context", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batch", "", "batchMeta", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "upload", "(Lcom/datadog/android/api/context/DatadogContext;Ljava/util/List;[BLcom/datadog/android/core/internal/persistence/BatchId;)Lcom/datadog/android/core/internal/data/upload/UploadStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpDataUploader implements com.datadog.android.core.internal.data.upload.DataUploader {
    @Override // com.datadog.android.core.internal.data.upload.DataUploader
    public final com.datadog.android.core.internal.data.upload.UploadStatus upload(com.datadog.android.api.context.DatadogContext context, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batch, byte[] batchMeta, com.datadog.android.core.internal.persistence.BatchId batchId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batch, "");
        return com.datadog.android.core.internal.data.upload.UploadStatus.UnknownStatus.INSTANCE;
    }
}
