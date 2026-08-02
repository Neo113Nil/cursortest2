package okio;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "<init>", "()V", "Lokio/Path;", "path", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "Ljava/nio/file/Path;", "nioPath", "(Ljava/nio/file/Path;)Lokio/FileMetadata;", "source", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "createSymlink", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class NioSystemFileSystem extends okio.JvmSystemFileSystem {
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return metadataOrNull(path.toNioPath());
    }

    protected final okio.FileMetadata metadataOrNull(java.nio.file.Path nioPath) {
        java.lang.Long l;
        java.lang.Long l2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nioPath, "");
        java.lang.Long l3 = null;
        try {
            java.nio.file.attribute.BasicFileAttributes readAttributes = java.nio.file.Files.readAttributes(nioPath, (java.lang.Class<java.nio.file.attribute.BasicFileAttributes>) java.nio.file.attribute.BasicFileAttributes.class, java.nio.file.LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path readSymbolicLink = readAttributes.isSymbolicLink() ? java.nio.file.Files.readSymbolicLink(nioPath) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            okio.Path path = readSymbolicLink != null ? okio.Path.Companion.get$default(okio.Path.INSTANCE, readSymbolicLink, false, 1, (java.lang.Object) null) : null;
            long size = readAttributes.size();
            java.nio.file.attribute.FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(creationTime.toMillis());
                if (valueOf.longValue() == 0) {
                    valueOf = null;
                }
                l = valueOf;
            } else {
                l = null;
            }
            java.nio.file.attribute.FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                java.lang.Long valueOf2 = java.lang.Long.valueOf(lastModifiedTime.toMillis());
                if (valueOf2.longValue() == 0) {
                    valueOf2 = null;
                }
                l2 = valueOf2;
            } else {
                l2 = null;
            }
            java.nio.file.attribute.FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                java.lang.Long valueOf3 = java.lang.Long.valueOf(lastAccessTime.toMillis());
                if (valueOf3.longValue() != 0) {
                    l3 = valueOf3;
                }
            }
            return new okio.FileMetadata(isRegularFile, isDirectory, path, java.lang.Long.valueOf(size), l, l2, l3, null, 128, null);
        } catch (java.nio.file.NoSuchFileException | java.nio.file.FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        try {
            java.nio.file.Files.move(source.toNioPath(), target.toNioPath(), java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new java.io.IOException("atomic move not supported");
        } catch (java.nio.file.NoSuchFileException e) {
            throw new java.io.FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        java.nio.file.Files.createSymbolicLink(source.toNioPath(), target.toNioPath(), new java.nio.file.attribute.FileAttribute[0]);
    }

    @Override // okio.JvmSystemFileSystem
    public java.lang.String toString() {
        return "NioSystemFileSystem";
    }
}
