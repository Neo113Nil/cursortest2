package com.datadog.android.core.internal.persistence.file;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/NoOpFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "<init>", "()V", "", "decrementAndGetPendingFilesCount", "()I", "", "Ljava/io/File;", "getAllFiles", "()Ljava/util/List;", "getFlushableFiles", "file", "getMetadataFile", "(Ljava/io/File;)Ljava/io/File;", "", "excludeFiles", "getReadableFile", "(Ljava/util/Set;)Ljava/io/File;", "getRootDir", "()Ljava/io/File;", "getWritableFile"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpFileOrchestrator implements com.datadog.android.core.internal.persistence.file.FileOrchestrator {
    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final int decrementAndGetPendingFilesCount() {
        return 0;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getRootDir() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getWritableFile() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.util.List<java.io.File> getFlushableFiles() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.util.List<java.io.File> getAllFiles() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getReadableFile(java.util.Set<? extends java.io.File> excludeFiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeFiles, "");
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getMetadataFile(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return null;
    }
}
