package com.datadog.android.core.internal.persistence.file.single;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/single/SingleFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Ljava/io/File;", "file", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "", "decrementAndGetPendingFilesCount", "()I", "", "getAllFiles", "()Ljava/util/List;", "getFlushableFiles", "getMetadataFile", "(Ljava/io/File;)Ljava/io/File;", "", "excludeFiles", "getReadableFile", "(Ljava/util/Set;)Ljava/io/File;", "getRootDir", "()Ljava/io/File;", "getWritableFile", "getHighSpeedVideoFpsRanges", "Ljava/io/File;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleFileOrchestrator implements com.datadog.android.core.internal.persistence.file.FileOrchestrator {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.io.File Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final int decrementAndGetPendingFilesCount() {
        return 0;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getRootDir() {
        return null;
    }

    public SingleFileOrchestrator(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = file;
        this.getHighSpeedVideoSizes = internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getWritableFile() {
        java.io.File parentFile = this.Camera2StreamConfigurationMap.getParentFile();
        if (parentFile != null) {
            com.datadog.android.core.internal.persistence.file.FileExtKt.mkdirsSafe(parentFile, this.getHighSpeedVideoSizes);
        }
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getReadableFile(java.util.Set<? extends java.io.File> excludeFiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeFiles, "");
        java.io.File parentFile = this.Camera2StreamConfigurationMap.getParentFile();
        if (parentFile != null) {
            com.datadog.android.core.internal.persistence.file.FileExtKt.mkdirsSafe(parentFile, this.getHighSpeedVideoSizes);
        }
        if (excludeFiles.contains(this.Camera2StreamConfigurationMap)) {
            return null;
        }
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.util.List<java.io.File> getAllFiles() {
        java.io.File parentFile = this.Camera2StreamConfigurationMap.getParentFile();
        if (parentFile != null) {
            com.datadog.android.core.internal.persistence.file.FileExtKt.mkdirsSafe(parentFile, this.getHighSpeedVideoSizes);
        }
        return kotlin.collections.CollectionsKt.listOf(this.Camera2StreamConfigurationMap);
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.util.List<java.io.File> getFlushableFiles() {
        return getAllFiles();
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getMetadataFile(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return null;
    }
}
