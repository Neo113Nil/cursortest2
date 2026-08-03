package kotlinx.io.files;

/* compiled from: FileSystem.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003H&J\u001a\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003H&J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0003H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u0005H&\u0082\u0001\u0001\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lkotlinx/io/files/FileSystem;", "", "exists", "", "path", "Lkotlinx/io/files/Path;", "delete", "", "mustExist", "createDirectories", "mustCreate", "atomicMove", "source", "destination", "Lkotlinx/io/RawSource;", "sink", "Lkotlinx/io/RawSink;", "append", "metadataOrNull", "Lkotlinx/io/files/FileMetadata;", "resolve", "list", "", "directory", "Lkotlinx/io/files/SystemFileSystemImpl;", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
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

    /* compiled from: FileSystem.kt */
    /* renamed from: kotlinx.io.files.FileSystem$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void delete$default(kotlinx.io.files.FileSystem fileSystem, kotlinx.io.files.Path path, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            fileSystem.delete(path, z);
        }

        public static /* synthetic */ void createDirectories$default(kotlinx.io.files.FileSystem fileSystem, kotlinx.io.files.Path path, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            fileSystem.createDirectories(path, z);
        }

        public static /* synthetic */ kotlinx.io.RawSink sink$default(kotlinx.io.files.FileSystem fileSystem, kotlinx.io.files.Path path, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return fileSystem.sink(path, z);
        }
    }
}
