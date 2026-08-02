package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011"}, d2 = {"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "", "p0", "<init>", "(Z)V", "Lkotlin/io/path/PathNode;", "", "Camera2StreamConfigurationMap", "(Lkotlin/io/path/PathNode;)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", "Lkotlin/io/path/PathNode;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DirectoryEntriesReader extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> getHighSpeedVideoFpsRanges = new kotlin.collections.ArrayDeque<>();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.io.path.PathNode getHighSpeedVideoFpsRangesFor;

    public DirectoryEntriesReader(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final /* synthetic */ java.nio.file.FileVisitResult preVisitDirectory(java.lang.Object obj, java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        java.nio.file.Path path = (java.nio.file.Path) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        this.getHighSpeedVideoFpsRanges.add(new kotlin.io.path.PathNode(path, basicFileAttributes.fileKey(), this.getHighSpeedVideoFpsRangesFor));
        java.nio.file.FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "");
        return preVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final /* synthetic */ java.nio.file.FileVisitResult visitFile(java.lang.Object obj, java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        java.nio.file.Path path = (java.nio.file.Path) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        this.getHighSpeedVideoFpsRanges.add(new kotlin.io.path.PathNode(path, null, this.getHighSpeedVideoFpsRangesFor));
        java.nio.file.FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visitFile, "");
        return visitFile;
    }

    public final java.util.List<kotlin.io.path.PathNode> Camera2StreamConfigurationMap(kotlin.io.path.PathNode p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRangesFor = p0;
        java.nio.file.Files.walkFileTree(p0.getHighSpeedVideoFpsRangesFor, kotlin.io.path.LinkFollowing.INSTANCE.toVisitOptions(this.getHighSpeedVideoSizes), 1, this);
        this.getHighSpeedVideoFpsRanges.removeFirst();
        kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> arrayDeque = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = new kotlin.collections.ArrayDeque<>();
        return arrayDeque;
    }
}
