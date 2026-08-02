package com.datadog.android.core.internal.persistence.file.batch;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00018\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/EncryptedBatchReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "Lcom/datadog/android/security/Encryption;", "encryption", "delegate", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/security/Encryption;Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "file", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "readData", "(Ljava/io/File;)Ljava/util/List;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "append", "writeData", "(Ljava/io/File;Lcom/datadog/android/api/storage/RawBatchEvent;Z)Z", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "getDelegate$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "Lcom/datadog/android/security/Encryption;", "getEncryption$dd_sdk_android_core_release", "()Lcom/datadog/android/security/Encryption;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EncryptedBatchReaderWriter implements com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter {
    public static final java.lang.String BAD_ENCRYPTION_RESULT_MESSAGE = "Encryption of non-empty data produced empty result, aborting write operation.";
    private final com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter delegate;
    private final com.datadog.android.security.Encryption encryption;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    public EncryptedBatchReaderWriter(com.datadog.android.security.Encryption encryption, com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter batchFileReaderWriter, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchFileReaderWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.encryption = encryption;
        this.delegate = batchFileReaderWriter;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    /* renamed from: getEncryption$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.security.Encryption getEncryption() {
        return this.encryption;
    }

    /* renamed from: getDelegate$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter getDelegate() {
        return this.delegate;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public final boolean writeData(java.io.File file, com.datadog.android.api.storage.RawBatchEvent data, boolean append) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.datadog.android.api.storage.RawBatchEvent rawBatchEvent = new com.datadog.android.api.storage.RawBatchEvent(this.encryption.encrypt(data.getData()), this.encryption.encrypt(data.getMetadata()));
        if (data.getData().length != 0 && rawBatchEvent.getData().length == 0) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.EncryptedBatchReaderWriter$writeData$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Encryption of non-empty data produced empty result, aborting write operation.";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        return this.delegate.writeData(file, rawBatchEvent, append);
    }

    @Override // com.datadog.android.core.internal.persistence.file.batch.BatchFileReader
    public final java.util.List<com.datadog.android.api.storage.RawBatchEvent> readData(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.util.List<com.datadog.android.api.storage.RawBatchEvent> readData = this.delegate.readData(file);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(readData, 10));
        for (com.datadog.android.api.storage.RawBatchEvent rawBatchEvent : readData) {
            arrayList.add(new com.datadog.android.api.storage.RawBatchEvent(rawBatchEvent.getData().length == 0 ? rawBatchEvent.getData() : this.encryption.decrypt(rawBatchEvent.getData()), rawBatchEvent.getMetadata().length == 0 ? rawBatchEvent.getMetadata() : this.encryption.decrypt(rawBatchEvent.getMetadata())));
        }
        return arrayList;
    }
}
