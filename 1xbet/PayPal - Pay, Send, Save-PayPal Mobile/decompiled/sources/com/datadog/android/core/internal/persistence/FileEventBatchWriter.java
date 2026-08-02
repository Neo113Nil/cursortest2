package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/datadog/android/core/internal/persistence/FileEventBatchWriter;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/api/storage/RawBatchEvent;", "eventsWriter", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "metadataReaderWriter", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "Lcom/datadog/android/core/internal/persistence/BatchWriteEventListener;", "batchWriteEventListener", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/FileWriter;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/core/internal/persistence/BatchWriteEventListener;Lcom/datadog/android/api/InternalLogger;)V", "", "currentMetadata", "()[B", "event", "batchMetadata", "Lcom/datadog/android/api/storage/EventType;", "eventType", "", "write", "(Lcom/datadog/android/api/storage/RawBatchEvent;[BLcom/datadog/android/api/storage/EventType;)Z", "Ljava/io/File;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/internal/persistence/BatchWriteEventListener;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "getInputFormats", "Lcom/datadog/android/api/InternalLogger;", "getOutputMinFrameDuration", "getOutputFormats", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileEventBatchWriter implements com.datadog.android.api.storage.EventBatchWriter {
    public static final java.lang.String ERROR_LARGE_DATA = "Can't write data with size %d (max item size is %d)";
    public static final java.lang.String NO_BATCH_FILE_AVAILABLE = "No batch file available";
    public static final java.lang.String WARNING_METADATA_WRITE_FAILED = "Unable to write metadata file: %s";
    private final com.datadog.android.core.internal.persistence.BatchWriteEventListener Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;
    private final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.file.FileWriter<com.datadog.android.api.storage.RawBatchEvent> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getOutputMinFrameDuration;
    private final com.datadog.android.core.internal.persistence.file.FileReaderWriter getOutputFormats;

    public FileEventBatchWriter(com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.core.internal.persistence.file.FileWriter<com.datadog.android.api.storage.RawBatchEvent> fileWriter, com.datadog.android.core.internal.persistence.file.FileReaderWriter fileReaderWriter, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig, com.datadog.android.core.internal.persistence.BatchWriteEventListener batchWriteEventListener, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileReaderWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePersistenceConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchWriteEventListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = fileOrchestrator;
        this.getHighResolutionOutputSizeshNQ4ISI = fileWriter;
        this.getOutputFormats = fileReaderWriter;
        this.getHighSpeedVideoFpsRanges = filePersistenceConfig;
        this.Camera2StreamConfigurationMap = batchWriteEventListener;
        this.getOutputMinFrameDuration = internalLogger;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.datadog.android.core.internal.persistence.FileEventBatchWriter$batchFile$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.io.File invoke() {
                com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator2;
                fileOrchestrator2 = com.datadog.android.core.internal.persistence.FileEventBatchWriter.this.getHighSpeedVideoFpsRangesFor;
                return fileOrchestrator2.getWritableFile();
            }

            {
                super(0);
            }
        });
    }

    @Override // com.datadog.android.api.storage.EventBatchWriter
    public final byte[] currentMetadata() {
        java.io.File file = (java.io.File) this.getHighSpeedVideoSizes.getValue();
        java.io.File metadataFile = file != null ? this.getHighSpeedVideoFpsRangesFor.getMetadataFile(file) : null;
        if (metadataFile == null || !com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(metadataFile, this.getOutputMinFrameDuration)) {
            return null;
        }
        return this.getOutputFormats.readData(metadataFile);
    }

    @Override // com.datadog.android.api.storage.EventBatchWriter
    public final boolean write(com.datadog.android.api.storage.RawBatchEvent event, byte[] batchMetadata, com.datadog.android.api.storage.EventType eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        java.io.File file = (java.io.File) this.getHighSpeedVideoSizes.getValue();
        java.io.File file2 = (java.io.File) this.getHighSpeedVideoSizes.getValue();
        kotlin.Pair pair = kotlin.TuplesKt.to(file, file2 != null ? this.getHighSpeedVideoFpsRangesFor.getMetadataFile(file2) : null);
        java.io.File file3 = (java.io.File) pair.component1();
        final java.io.File file4 = (java.io.File) pair.component2();
        if (file3 == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputMinFrameDuration, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.FileEventBatchWriter$write$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.persistence.FileEventBatchWriter.NO_BATCH_FILE_AVAILABLE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        if (event.getData().length == 0) {
            return true;
        }
        final int length = event.getData().length;
        if (length <= this.getHighSpeedVideoFpsRanges.getMaxItemSize()) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI.writeData(file3, event, true)) {
                return false;
            }
            this.Camera2StreamConfigurationMap.onWriteEvent(event.getData().length);
            if (batchMetadata != null) {
                if ((!(batchMetadata.length == 0)) && file4 != null && !this.getOutputFormats.writeData(file4, batchMetadata, false)) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputMinFrameDuration, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.FileEventBatchWriter$writeBatchMetadata$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.FileEventBatchWriter.WARNING_METADATA_WRITE_FAILED, java.util.Arrays.copyOf(new java.lang.Object[]{file4.getPath()}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                }
            }
            return true;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputMinFrameDuration, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.FileEventBatchWriter$checkEventSize$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig;
                java.util.Locale locale = java.util.Locale.US;
                int i = length;
                filePersistenceConfig = this.getHighSpeedVideoFpsRanges;
                java.lang.String format = java.lang.String.format(locale, "Can't write data with size %d (max item size is %d)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Long.valueOf(filePersistenceConfig.getMaxItemSize())}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return false;
    }
}
