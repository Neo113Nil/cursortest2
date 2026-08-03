package kotlin.io.path;

/* compiled from: PathUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "<init>", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PathRelativizer {
    public static final kotlin.io.path.PathRelativizer INSTANCE = new kotlin.io.path.PathRelativizer();
    private static final java.nio.file.Path emptyPath = java.nio.file.Paths.get("", new java.lang.String[0]);
    private static final java.nio.file.Path parentPath = java.nio.file.Paths.get("..", new java.lang.String[0]);

    private PathRelativizer() {
    }

    public final java.nio.file.Path tryRelativeTo(java.nio.file.Path path, java.nio.file.Path base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.nio.file.Path normalize = base.normalize();
        java.nio.file.Path normalize2 = path.normalize();
        java.nio.file.Path relativize = normalize.relativize(normalize2);
        int min = java.lang.Math.min(normalize.getNameCount(), normalize2.getNameCount());
        for (int i = 0; i < min; i++) {
            java.nio.file.Path name = normalize.getName(i);
            java.nio.file.Path path2 = parentPath;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(name, path2)) {
                break;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(normalize2.getName(i), path2)) {
                throw new java.lang.IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(normalize2, normalize) || !kotlin.jvm.internal.Intrinsics.areEqual(normalize, emptyPath)) {
            java.lang.String obj = relativize.toString();
            java.lang.String separator = relativize.getFileSystem().getSeparator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "getSeparator(...)");
            normalize2 = kotlin.text.StringsKt.endsWith$default(obj, separator, false, 2, (java.lang.Object) null) ? relativize.getFileSystem().getPath(kotlin.text.StringsKt.dropLast(obj, relativize.getFileSystem().getSeparator().length()), new java.lang.String[0]) : relativize;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(normalize2);
        return normalize2;
    }
}
