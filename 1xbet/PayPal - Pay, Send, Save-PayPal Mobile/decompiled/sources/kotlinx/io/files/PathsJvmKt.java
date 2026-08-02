package kotlinx.io.files;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086D¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"", "path", "Lkotlinx/io/files/Path;", "Path", "(Ljava/lang/String;)Lkotlinx/io/files/Path;", "Lkotlinx/io/Source;", "source", "(Lkotlinx/io/files/Path;)Lkotlinx/io/Source;", "Lkotlinx/io/Sink;", "sink", "(Lkotlinx/io/files/Path;)Lkotlinx/io/Sink;", "", "SystemPathSeparator", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PathsJvmKt {
    public static final char SystemPathSeparator = java.io.File.separatorChar;

    public static final kotlinx.io.files.Path Path(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new kotlinx.io.files.Path(new java.io.File(str));
    }

    public static final kotlinx.io.Source source(kotlinx.io.files.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.files.FileSystemJvmKt.SystemFileSystem.source(path));
    }

    public static final kotlinx.io.Sink sink(kotlinx.io.files.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.files.FileSystem.sink$default(kotlinx.io.files.FileSystemJvmKt.SystemFileSystem, path, false, 2, null));
    }
}
