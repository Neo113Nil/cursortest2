package com.datadog.android.core.internal.persistence.file.batch;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/api/storage/RawBatchEvent;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BatchFileReaderWriter extends com.datadog.android.core.internal.persistence.file.FileWriter<com.datadog.android.api.storage.RawBatchEvent>, com.datadog.android.core.internal.persistence.file.batch.BatchFileReader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.Companion INSTANCE = com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter$Companion;", "", "<init>", "()V", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/security/Encryption;", "encryption", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "create", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/security/Encryption;)Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.Companion getHighSpeedVideoSizes = new com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.Companion();

        private Companion() {
        }

        public final com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter create(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.security.Encryption encryption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
            com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter plainBatchFileReaderWriter = new com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter(internalLogger);
            if (encryption == null) {
                return plainBatchFileReaderWriter;
            }
            return new com.datadog.android.core.internal.persistence.file.batch.EncryptedBatchReaderWriter(encryption, plainBatchFileReaderWriter, internalLogger);
        }
    }
}
