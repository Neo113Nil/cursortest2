package io.ktor.util;

/* compiled from: NioPath.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/file/Path;", "relativePath", "combineSafe", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "normalizeAndRelativize", "(Ljava/nio/file/Path;)Ljava/nio/file/Path;", "dropLeadingTopDirs", "Ljava/io/File;", "(Ljava/io/File;Ljava/nio/file/Path;)Ljava/io/File;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NioPathKt {
    public static final java.nio.file.Path combineSafe(java.nio.file.Path path, java.nio.file.Path relativePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        java.nio.file.Path normalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (normalizeAndRelativize.startsWith("..")) {
            throw new java.nio.file.InvalidPathException(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (!(!normalizeAndRelativize.isAbsolute())) {
            throw new java.lang.IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        if (path.getNameCount() == 0) {
            return normalizeAndRelativize;
        }
        java.nio.file.Path resolve = path.resolve(normalizeAndRelativize);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resolve, "resolve(...)");
        return resolve;
    }

    public static final java.nio.file.Path normalizeAndRelativize(java.nio.file.Path path) {
        java.nio.file.Path relativize;
        java.nio.file.Path normalize;
        java.nio.file.Path dropLeadingTopDirs;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.nio.file.Path root = path.getRoot();
        if (root != null && (relativize = root.relativize(path)) != null && (normalize = relativize.normalize()) != null && (dropLeadingTopDirs = dropLeadingTopDirs(normalize)) != null) {
            return dropLeadingTopDirs;
        }
        java.nio.file.Path normalize2 = path.normalize();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(normalize2, "normalize(...)");
        return dropLeadingTopDirs(normalize2);
    }

    private static final java.nio.file.Path dropLeadingTopDirs(java.nio.file.Path path) {
        java.util.Iterator it = path.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(((java.nio.file.Path) next).toString(), "..")) {
                break;
            }
            i++;
        }
        if (i <= 0) {
            return path;
        }
        java.nio.file.Path subpath = path.subpath(i, path.getNameCount());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subpath, "subpath(...)");
        return subpath;
    }

    public static final java.io.File combineSafe(java.io.File file, java.nio.file.Path relativePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        java.nio.file.Path normalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (normalizeAndRelativize.startsWith("..")) {
            throw new java.nio.file.InvalidPathException(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (!(!normalizeAndRelativize.isAbsolute())) {
            throw new java.lang.IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        return new java.io.File(file, normalizeAndRelativize.toString());
    }
}
