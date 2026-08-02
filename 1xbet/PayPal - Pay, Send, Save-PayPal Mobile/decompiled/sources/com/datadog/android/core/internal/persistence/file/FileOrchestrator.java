package com.datadog.android.core.internal.persistence.file;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "", "", "decrementAndGetPendingFilesCount", "()I", "", "Ljava/io/File;", "getAllFiles", "()Ljava/util/List;", "getFlushableFiles", "file", "getMetadataFile", "(Ljava/io/File;)Ljava/io/File;", "", "excludeFiles", "getReadableFile", "(Ljava/util/Set;)Ljava/io/File;", "getRootDir", "()Ljava/io/File;", "getWritableFile"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FileOrchestrator {
    int decrementAndGetPendingFilesCount();

    java.util.List<java.io.File> getAllFiles();

    java.util.List<java.io.File> getFlushableFiles();

    java.io.File getMetadataFile(java.io.File file);

    java.io.File getReadableFile(java.util.Set<? extends java.io.File> excludeFiles);

    java.io.File getRootDir();

    java.io.File getWritableFile();
}
