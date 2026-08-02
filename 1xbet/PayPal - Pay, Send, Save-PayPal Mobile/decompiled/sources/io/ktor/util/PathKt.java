package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ljava/io/File;", "", "relativePath", "combineSafe", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "normalizeAndRelativize", "(Ljava/io/File;)Ljava/io/File;", "path", "", "dropLeadingTopDirs", "(Ljava/lang/String;)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PathKt {
    public static final java.io.File combineSafe(java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.io.File file2 = new java.io.File(str);
        java.io.File normalizeAndRelativize = normalizeAndRelativize(file2);
        if (kotlin.io.FilesKt.startsWith(normalizeAndRelativize, "..")) {
            throw new java.lang.IllegalArgumentException("Bad relative path ".concat(java.lang.String.valueOf(file2)));
        }
        if (normalizeAndRelativize.isAbsolute()) {
            throw new java.lang.IllegalStateException("Bad relative path ".concat(java.lang.String.valueOf(file2)).toString());
        }
        return new java.io.File(file, normalizeAndRelativize.getPath());
    }

    public static final java.io.File normalizeAndRelativize(java.io.File file) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.io.File normalize = kotlin.io.FilesKt.normalize(file);
        if (kotlin.io.FilesKt.isRooted(normalize)) {
            java.io.File file2 = normalize;
            while (true) {
                java.io.File parentFile = file2.getParentFile();
                if (parentFile == null) {
                    break;
                }
                file2 = parentFile;
            }
            java.lang.String path = normalize.getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            java.lang.String drop = kotlin.text.StringsKt.drop(path, file2.getName().length());
            int length = drop.length();
            int i = 0;
            while (true) {
                if (i < length) {
                    char charAt = drop.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        str = drop.substring(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        break;
                    }
                    i++;
                } else {
                    str = "";
                    break;
                }
            }
            normalize = new java.io.File(str);
        }
        java.lang.String path2 = normalize.getPath();
        if (path2 == null) {
            path2 = "";
        }
        int dropLeadingTopDirs = dropLeadingTopDirs(path2);
        if (dropLeadingTopDirs == 0) {
            return normalize;
        }
        if (dropLeadingTopDirs >= normalize.getPath().length()) {
            return new java.io.File(".");
        }
        java.lang.String path3 = normalize.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path3, "");
        java.lang.String substring = path3.substring(dropLeadingTopDirs);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return new java.io.File(substring);
    }

    public static final int dropLeadingTopDirs(java.lang.String str) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = str.length() - 1;
        int i2 = 0;
        while (i2 <= length) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == '/') {
                i2++;
            } else {
                if (charAt != '.') {
                    break;
                }
                if (i2 == length) {
                    return i2 + 1;
                }
                char charAt2 = str.charAt(i2 + 1);
                if (!(charAt2 == '\\' || charAt2 == '/')) {
                    if (charAt2 == '.') {
                        int i3 = i2 + 2;
                        if (i3 != str.length()) {
                            char charAt3 = str.charAt(i3);
                            if (charAt3 != '\\' && charAt3 != '/') {
                                break;
                            }
                            i = 3;
                            i2 += i;
                        }
                    } else {
                        break;
                    }
                }
                i = 2;
                i2 += i;
            }
        }
        return i2;
    }
}
