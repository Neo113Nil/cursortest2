package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataUploader;", "", "Lcom/datadog/android/api/context/DatadogContext;", "context", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batch", "", "batchMeta", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "upload", "(Lcom/datadog/android/api/context/DatadogContext;Ljava/util/List;[BLcom/datadog/android/core/internal/persistence/BatchId;)Lcom/datadog/android/core/internal/data/upload/UploadStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploader {
    com.datadog.android.core.internal.data.upload.UploadStatus upload(com.datadog.android.api.context.DatadogContext context, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batch, byte[] batchMeta, com.datadog.android.core.internal.persistence.BatchId batchId);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ com.datadog.android.core.internal.data.upload.UploadStatus upload$default(com.datadog.android.core.internal.data.upload.DataUploader dataUploader, com.datadog.android.api.context.DatadogContext datadogContext, java.util.List list, byte[] bArr, com.datadog.android.core.internal.persistence.BatchId batchId, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upload");
            }
            if ((i & 8) != 0) {
                batchId = null;
            }
            return dataUploader.upload(datadogContext, list, bArr, batchId);
        }
    }
}
