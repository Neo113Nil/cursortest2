package kotlinx.io.files;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\r\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0012J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lkotlinx/io/files/FileSystem;", "", "Lkotlinx/io/files/Path;", "path", "", "exists", "(Lkotlinx/io/files/Path;)Z", "mustExist", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Lkotlinx/io/files/Path;Z)V", "mustCreate", "createDirectories", "source", "destination", "atomicMove", "(Lkotlinx/io/files/Path;Lkotlinx/io/files/Path;)V", "Lkotlinx/io/RawSource;", "(Lkotlinx/io/files/Path;)Lkotlinx/io/RawSource;", "append", "Lkotlinx/io/RawSink;", "sink", "(Lkotlinx/io/files/Path;Z)Lkotlinx/io/RawSink;", "Lkotlinx/io/files/FileMetadata;", "metadataOrNull", "(Lkotlinx/io/files/Path;)Lkotlinx/io/files/FileMetadata;", "resolve", "(Lkotlinx/io/files/Path;)Lkotlinx/io/files/Path;", "directory", "", "list", "(Lkotlinx/io/files/Path;)Ljava/util/Collection;", "Lkotlinx/io/files/SystemFileSystemImpl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FileSystem {
    void atomicMove(kotlinx.io.files.Path source, kotlinx.io.files.Path destination);

    void createDirectories(kotlinx.io.files.Path path, boolean mustCreate);

    void delete(kotlinx.io.files.Path path, boolean mustExist);

    boolean exists(kotlinx.io.files.Path path);

    java.util.Collection<kotlinx.io.files.Path> list(kotlinx.io.files.Path directory);

    kotlinx.io.files.FileMetadata metadataOrNull(kotlinx.io.files.Path path);

    kotlinx.io.files.Path resolve(kotlinx.io.files.Path path);

    kotlinx.io.RawSink sink(kotlinx.io.files.Path path, boolean append);

    kotlinx.io.RawSource source(kotlinx.io.files.Path path);

    static /* synthetic */ void delete$default(kotlinx.io.files.FileSystem fileSystem, kotlinx.io.files.Path path, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        fileSystem.delete(path, z);
    }

    static /* synthetic */ void createDirectories$default(kotlinx.io.files.FileSystem fileSystem, kotlinx.io.files.Path path, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectories(path, z);
    }

    static /* synthetic */ kotlinx.io.RawSink sink$default(kotlinx.io.files.FileSystem fileSystem, kotlinx.io.files.Path path, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.sink(path, z);
    }
}
