package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\t"}, d2 = {"Landroidx/datastore/core/FileDiagnostics;", "", "<init>", "()V", "Ljava/io/File;", "file", "Ljava/io/IOException;", "cause", "attachFileDebugInfo", "(Ljava/io/File;Ljava/io/IOException;)Ljava/io/IOException;", "p0", "p1", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileDiagnostics {
    public static final androidx.content.core.FileDiagnostics INSTANCE = new androidx.content.core.FileDiagnostics();

    private FileDiagnostics() {
    }

    public final java.io.IOException attachFileDebugInfo(java.io.File file, java.io.IOException cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
        if (file.exists()) {
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return getHighSpeedVideoSizes(file, cause);
                    }
                    return getHighSpeedVideoSizes(file, cause);
                }
                if (file.canWrite()) {
                    return getHighSpeedVideoSizes(file, cause);
                }
                return getHighSpeedVideoSizes(file, cause);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    return getHighSpeedVideoSizes(file, cause);
                }
                return getHighSpeedVideoSizes(file, cause);
            }
            if (file.canWrite()) {
                return getHighSpeedVideoSizes(file, cause);
            }
            return getHighSpeedVideoSizes(file, cause);
        }
        return getHighSpeedVideoSizes(file, cause);
    }

    private static java.io.IOException getHighSpeedVideoSizes(java.io.File p0, java.io.IOException p1) {
        java.io.File parentFile = p0.getParentFile();
        if (parentFile == null) {
            return getHighSpeedVideoFpsRangesFor(p0, p1);
        }
        if (parentFile.exists()) {
            if (parentFile.isFile()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return getHighSpeedVideoFpsRangesFor(p0, p1);
                    }
                    return getHighSpeedVideoFpsRangesFor(p0, p1);
                }
                if (parentFile.canWrite()) {
                    return getHighSpeedVideoFpsRangesFor(p0, p1);
                }
                return getHighSpeedVideoFpsRangesFor(p0, p1);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return getHighSpeedVideoFpsRangesFor(p0, p1);
                }
                return getHighSpeedVideoFpsRangesFor(p0, p1);
            }
            if (parentFile.canWrite()) {
                return getHighSpeedVideoFpsRangesFor(p0, p1);
            }
            return getHighSpeedVideoFpsRangesFor(p0, p1);
        }
        return getHighSpeedVideoFpsRangesFor(p0, p1);
    }

    private static java.io.IOException getHighSpeedVideoFpsRangesFor(java.io.File p0, java.io.IOException p1) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Inoperable file:");
        try {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" canonical[");
            sb2.append(p0.getCanonicalPath());
            sb2.append("] freeSpace[");
            sb2.append(p0.getFreeSpace());
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            sb.append(sb2.toString());
        } catch (java.io.IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return new java.io.IOException(obj, p1);
    }
}
