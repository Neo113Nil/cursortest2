package kotlinx.io.files;

/* compiled from: Paths.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005\"\u00020\u0003¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005\"\u00020\u0003¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\t*\u00020\u0001H\u0007¢\u0006\u0002\b\n\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0007¢\u0006\u0002\b\r\u001a\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¨\u0006\u0017"}, d2 = {"Path", "Lkotlinx/io/files/Path;", "base", "", "parts", "", "(Ljava/lang/String;[Ljava/lang/String;)Lkotlinx/io/files/Path;", "(Lkotlinx/io/files/Path;[Ljava/lang/String;)Lkotlinx/io/files/Path;", "source", "Lkotlinx/io/Source;", "sourceDeprecated", "sink", "Lkotlinx/io/Sink;", "sinkDeprecated", "removeTrailingSeparators", "path", "isWindows_", "", "isUnc", "removeTrailingSeparatorsUnix", "removeTrailingSeparatorsWindows", "suffixLength", "", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathsKt {
    public static final kotlinx.io.files.Path Path(java.lang.String base, java.lang.String... parts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parts, "parts");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(base);
        for (java.lang.String str : parts) {
            java.lang.StringBuilder sb2 = sb;
            if (sb2.length() > 0 && !kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) sb2, kotlinx.io.files.PathsJvmKt.SystemPathSeparator, false, 2, (java.lang.Object) null)) {
                sb.append(kotlinx.io.files.PathsJvmKt.SystemPathSeparator);
            }
            sb.append(str);
        }
        return kotlinx.io.files.PathsJvmKt.Path(sb.toString());
    }

    public static final kotlinx.io.files.Path Path(kotlinx.io.files.Path base, java.lang.String... parts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parts, "parts");
        return Path(base.toString(), (java.lang.String[]) java.util.Arrays.copyOf(parts, parts.length));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use FileSystem.source instead", replaceWith = @kotlin.ReplaceWith(expression = "SystemFileSystem.source(this).buffered()", imports = {"kotlinx.io.files.FileSystem"}))
    public static final kotlinx.io.Source sourceDeprecated(kotlinx.io.files.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.files.FileSystemJvmKt.SystemFileSystem.source(path));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use FileSystem.sink instead", replaceWith = @kotlin.ReplaceWith(expression = "SystemFileSystem.sink(this).buffered()", imports = {"kotlinx.io.files.FileSystem"}))
    public static final kotlinx.io.Sink sinkDeprecated(kotlinx.io.files.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.files.FileSystem.CC.sink$default(kotlinx.io.files.FileSystemJvmKt.SystemFileSystem, path, false, 2, null));
    }

    public static /* synthetic */ java.lang.String removeTrailingSeparators$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = kotlinx.io.files.FileSystemJvmKt.isWindows();
        }
        return removeTrailingSeparators(str, z);
    }

    public static final java.lang.String removeTrailingSeparators(java.lang.String path, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        if (z) {
            int i = 1;
            if (path.length() > 1) {
                if (path.charAt(1) == ':') {
                    i = 3;
                } else if (isUnc(path)) {
                    i = 2;
                }
            }
            return removeTrailingSeparatorsWindows(i, path);
        }
        return removeTrailingSeparatorsUnix(path);
    }

    private static final boolean isUnc(java.lang.String str) {
        if (str.length() < 2) {
            return false;
        }
        return kotlin.text.StringsKt.startsWith$default(str, "\\\\", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(str, "//", false, 2, (java.lang.Object) null);
    }

    private static final java.lang.String removeTrailingSeparatorsUnix(java.lang.String str) {
        int length = str.length();
        while (length > 1 && str.charAt(length - 1) == '/') {
            length--;
        }
        java.lang.String substring = str.substring(0, length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    private static final java.lang.String removeTrailingSeparatorsWindows(int i, java.lang.String str) {
        if (i < 1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int length = str.length();
        while (length > i) {
            char charAt = str.charAt(length - 1);
            if (charAt != '\\' && charAt != '/') {
                break;
            }
            length--;
        }
        java.lang.String substring = str.substring(0, length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
