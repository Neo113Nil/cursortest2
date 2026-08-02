package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataFlusher;", "Lcom/datadog/android/core/internal/data/upload/Flusher;", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "fileReader", "Lcom/datadog/android/core/internal/persistence/file/FileReader;", "", "metadataFileReader", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/ContextProvider;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;Lcom/datadog/android/core/internal/persistence/file/FileReader;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "uploader", "", "flush", "(Lcom/datadog/android/core/internal/data/upload/DataUploader;)V", "Lcom/datadog/android/core/internal/ContextProvider;", "getContextProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/ContextProvider;", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getFileMover$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getFileOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "getFileReader$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/internal/persistence/file/FileReader;", "getMetadataFileReader$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileReader;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataFlusher implements com.datadog.android.core.internal.data.upload.Flusher {
    private final com.datadog.android.core.internal.ContextProvider contextProvider;
    private final com.datadog.android.core.internal.persistence.file.FileMover fileMover;
    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator;
    private final com.datadog.android.core.internal.persistence.file.batch.BatchFileReader fileReader;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;
    private final com.datadog.android.core.internal.persistence.file.FileReader<byte[]> metadataFileReader;

    public DataFlusher(com.datadog.android.core.internal.ContextProvider contextProvider, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.core.internal.persistence.file.batch.BatchFileReader batchFileReader, com.datadog.android.core.internal.persistence.file.FileReader<byte[]> fileReader, com.datadog.android.core.internal.persistence.file.FileMover fileMover, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchFileReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileMover, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.contextProvider = contextProvider;
        this.fileOrchestrator = fileOrchestrator;
        this.fileReader = batchFileReader;
        this.metadataFileReader = fileReader;
        this.fileMover = fileMover;
        this.getHighSpeedVideoSizes = internalLogger;
    }

    /* renamed from: getContextProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    /* renamed from: getFileOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getFileOrchestrator() {
        return this.fileOrchestrator;
    }

    /* renamed from: getFileReader$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.batch.BatchFileReader getFileReader() {
        return this.fileReader;
    }

    public final com.datadog.android.core.internal.persistence.file.FileReader<byte[]> getMetadataFileReader$dd_sdk_android_core_release() {
        return this.metadataFileReader;
    }

    /* renamed from: getFileMover$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileMover getFileMover() {
        return this.fileMover;
    }

    @Override // com.datadog.android.core.internal.data.upload.Flusher
    public final void flush(com.datadog.android.core.internal.data.upload.DataUploader uploader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploader, "");
        com.datadog.android.api.context.DatadogContext context = this.contextProvider.getContext(kotlin.collections.SetsKt.emptySet());
        for (java.io.File file : this.fileOrchestrator.getFlushableFiles()) {
            java.util.List<com.datadog.android.api.storage.RawBatchEvent> readData = this.fileReader.readData(file);
            java.io.File metadataFile = this.fileOrchestrator.getMetadataFile(file);
            com.datadog.android.core.internal.data.upload.DataUploader.DefaultImpls.upload$default(uploader, context, readData, (metadataFile == null || !com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(metadataFile, this.getHighSpeedVideoSizes)) ? null : this.metadataFileReader.readData(metadataFile), null, 8, null);
            this.fileMover.delete(file);
            if (metadataFile != null && com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(metadataFile, this.getHighSpeedVideoSizes)) {
                this.fileMover.delete(metadataFile);
            }
        }
    }
}
