package androidx.datastore.core;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Landroidx/datastore/core/FileDiagnostics;", "", "<init>", "()V", "attachFileDebugInfo", "Ljava/io/IOException;", Constants.FILE, "Ljava/io/File;", "cause", "attachParentStacktrace", "attachFileSystemMessage", "origException", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileDiagnostics {
    public static final FileDiagnostics INSTANCE = new FileDiagnostics();

    private FileDiagnostics() {
    }

    private final IOException attachFileSystemMessage(File file, IOException origException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return new IOException(sb2, origException);
    }

    private final IOException attachParentStacktrace(File file, IOException cause) {
        File parentFile = file.getParentFile();
        return parentFile == null ? attachFileSystemMessage(file, cause) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? attachFileSystemMessage(file, cause) : attachFileSystemMessage(file, cause) : parentFile.canWrite() ? attachFileSystemMessage(file, cause) : attachFileSystemMessage(file, cause) : parentFile.canRead() ? parentFile.canWrite() ? attachFileSystemMessage(file, cause) : attachFileSystemMessage(file, cause) : parentFile.canWrite() ? attachFileSystemMessage(file, cause) : attachFileSystemMessage(file, cause) : attachFileSystemMessage(file, cause);
    }

    public final IOException attachFileDebugInfo(File file, IOException cause) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cause, "cause");
        return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? attachParentStacktrace(file, cause) : attachParentStacktrace(file, cause) : file.canWrite() ? attachParentStacktrace(file, cause) : attachParentStacktrace(file, cause) : file.canRead() ? file.canWrite() ? attachParentStacktrace(file, cause) : attachParentStacktrace(file, cause) : file.canWrite() ? attachParentStacktrace(file, cause) : attachParentStacktrace(file, cause) : attachParentStacktrace(file, cause);
    }
}
