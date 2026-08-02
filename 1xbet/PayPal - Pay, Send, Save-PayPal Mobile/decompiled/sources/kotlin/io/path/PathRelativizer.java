package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0006*\u00020\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0018\u0010\u0007\u001a\u0006*\u00020\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "<init>", "()V", "Ljava/nio/file/Path;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "Ljava/nio/file/Path;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PathRelativizer {
    public static final kotlin.io.path.PathRelativizer INSTANCE = new kotlin.io.path.PathRelativizer();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.nio.file.Path getHighSpeedVideoSizes = java.nio.file.Paths.get("", new java.lang.String[0]);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.nio.file.Path getHighSpeedVideoFpsRangesFor = java.nio.file.Paths.get("..", new java.lang.String[0]);

    private PathRelativizer() {
    }

    public static java.nio.file.Path getHighSpeedVideoFpsRangesFor(java.nio.file.Path p0, java.nio.file.Path p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        java.nio.file.Path normalize = p1.normalize();
        java.nio.file.Path normalize2 = p0.normalize();
        java.nio.file.Path relativize = normalize.relativize(normalize2);
        int min = java.lang.Math.min(normalize.getNameCount(), normalize2.getNameCount());
        for (int i = 0; i < min; i++) {
            java.nio.file.Path name2 = normalize.getName(i);
            java.nio.file.Path path = getHighSpeedVideoFpsRangesFor;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(name2, path)) {
                break;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(normalize2.getName(i), path)) {
                throw new java.lang.IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(normalize2, normalize) || !kotlin.jvm.internal.Intrinsics.areEqual(normalize, getHighSpeedVideoSizes)) {
            java.lang.String obj = relativize.toString();
            java.lang.String separator = relativize.getFileSystem().getSeparator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "");
            normalize2 = kotlin.text.StringsKt.endsWith$default(obj, separator, false, 2, (java.lang.Object) null) ? relativize.getFileSystem().getPath(kotlin.text.StringsKt.dropLast(obj, relativize.getFileSystem().getSeparator().length()), new java.lang.String[0]) : relativize;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(normalize2);
        return normalize2;
    }
}
