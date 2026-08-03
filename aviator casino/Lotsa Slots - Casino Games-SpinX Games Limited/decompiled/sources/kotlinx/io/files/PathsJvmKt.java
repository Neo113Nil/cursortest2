package kotlinx.io.files;

/* compiled from: PathsJvm.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0001¢\u0006\u0002\b\b\u001a\u0011\u0010\t\u001a\u00020\n*\u00020\u0003H\u0001¢\u0006\u0002\b\u000b\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"SystemPathSeparator", "", "Path", "Lkotlinx/io/files/Path;", "path", "", "sourceHack", "Lkotlinx/io/Source;", "source", "sinkHack", "Lkotlinx/io/Sink;", "sink", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathsJvmKt {
    public static final char SystemPathSeparator = java.io.File.separatorChar;

    public static final kotlinx.io.files.Path Path(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return new kotlinx.io.files.Path(new java.io.File(path));
    }

    public static final kotlinx.io.Source source(kotlinx.io.files.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.files.FileSystemJvmKt.SystemFileSystem.source(path));
    }

    public static final kotlinx.io.Sink sink(kotlinx.io.files.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.files.FileSystem.CC.sink$default(kotlinx.io.files.FileSystemJvmKt.SystemFileSystem, path, false, 2, null));
    }
}
