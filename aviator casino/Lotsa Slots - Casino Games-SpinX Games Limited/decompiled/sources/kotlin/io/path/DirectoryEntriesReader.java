package kotlin.io.path;

/* compiled from: PathTreeWalk.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "followLinks", "", "<init>", "(Z)V", "getFollowLinks", "()Z", "directoryNode", "Lkotlin/io/path/PathNode;", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lkotlin/collections/ArrayDeque;", "readEntries", "", "preVisitDirectory", "Ljava/nio/file/FileVisitResult;", "dir", "attrs", "Ljava/nio/file/attribute/BasicFileAttributes;", "visitFile", "file", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DirectoryEntriesReader extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {
    private kotlin.io.path.PathNode directoryNode;
    private kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> entries = new kotlin.collections.ArrayDeque<>();
    private final boolean followLinks;

    public DirectoryEntriesReader(boolean z) {
        this.followLinks = z;
    }

    public final boolean getFollowLinks() {
        return this.followLinks;
    }

    public final java.util.List<kotlin.io.path.PathNode> readEntries(kotlin.io.path.PathNode directoryNode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directoryNode, "directoryNode");
        this.directoryNode = directoryNode;
        java.nio.file.Files.walkFileTree(directoryNode.getPath(), kotlin.io.path.LinkFollowing.INSTANCE.toVisitOptions(this.followLinks), 1, this);
        this.entries.removeFirst();
        kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> arrayDeque = this.entries;
        this.entries = new kotlin.collections.ArrayDeque<>();
        return arrayDeque;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path dir, java.nio.file.attribute.BasicFileAttributes attrs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.entries.add(new kotlin.io.path.PathNode(dir, attrs.fileKey(), this.directoryNode));
        java.nio.file.FileVisitResult preVisitDirectory = super.preVisitDirectory((kotlin.io.path.DirectoryEntriesReader) dir, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.entries.add(new kotlin.io.path.PathNode(file, null, this.directoryNode));
        java.nio.file.FileVisitResult visitFile = super.visitFile((kotlin.io.path.DirectoryEntriesReader) file, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visitFile, "visitFile(...)");
        return visitFile;
    }
}
