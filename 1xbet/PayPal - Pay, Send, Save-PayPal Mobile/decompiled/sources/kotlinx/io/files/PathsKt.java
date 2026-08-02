package kotlinx.io.files;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002\"\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002\"\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "base", "", "parts", "Lkotlinx/io/files/Path;", "Path", "(Ljava/lang/String;[Ljava/lang/String;)Lkotlinx/io/files/Path;", "(Lkotlinx/io/files/Path;[Ljava/lang/String;)Lkotlinx/io/files/Path;", "Lkotlinx/io/Source;", "sourceDeprecated", "(Lkotlinx/io/files/Path;)Lkotlinx/io/Source;", "Lkotlinx/io/Sink;", "sinkDeprecated", "(Lkotlinx/io/files/Path;)Lkotlinx/io/Sink;", "path", "", "isWindows_", "removeTrailingSeparators", "(Ljava/lang/String;Z)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PathsKt {
    public static final kotlinx.io.files.Path Path(java.lang.String str, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        for (java.lang.String str2 : strArr) {
            java.lang.StringBuilder sb2 = sb;
            if (sb2.length() > 0 && !kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) sb2, kotlinx.io.files.PathsJvmKt.SystemPathSeparator, false, 2, (java.lang.Object) null)) {
                sb.append(kotlinx.io.files.PathsJvmKt.SystemPathSeparator);
            }
            sb.append(str2);
        }
        return kotlinx.io.files.PathsJvmKt.Path(sb.toString());
    }

    public static final kotlinx.io.files.Path Path(kotlinx.io.files.Path path, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return Path(path.toString(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use FileSystem.source instead", replaceWith = @kotlin.ReplaceWith(expression = "SystemFileSystem.source(this).buffered()", imports = {"kotlinx.io.files.FileSystem"}))
    public static final kotlinx.io.Source sourceDeprecated(kotlinx.io.files.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.files.FileSystemJvmKt.SystemFileSystem.source(path));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use FileSystem.sink instead", replaceWith = @kotlin.ReplaceWith(expression = "SystemFileSystem.sink(this).buffered()", imports = {"kotlinx.io.files.FileSystem"}))
    public static final kotlinx.io.Sink sinkDeprecated(kotlinx.io.files.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.files.FileSystem.sink$default(kotlinx.io.files.FileSystemJvmKt.SystemFileSystem, path, false, 2, null));
    }

    public static /* synthetic */ java.lang.String removeTrailingSeparators$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = kotlinx.io.files.FileSystemJvmKt.isWindows();
        }
        return removeTrailingSeparators(str, z);
    }

    public static final java.lang.String removeTrailingSeparators(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i = 1;
        if (z) {
            if (str.length() > 1) {
                if (str.charAt(1) == ':') {
                    i = 3;
                } else if (str.length() >= 2 && (kotlin.text.StringsKt.startsWith$default(str, "\\\\", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(str, "//", false, 2, (java.lang.Object) null))) {
                    i = 2;
                }
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
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            return substring;
        }
        int length2 = str.length();
        while (length2 > 1 && str.charAt(length2 - 1) == '/') {
            length2--;
        }
        java.lang.String substring2 = str.substring(0, length2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        return substring2;
    }
}
