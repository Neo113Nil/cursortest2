package coil.disk;

/* compiled from: DiskCache.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003!\"#J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H§\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H'J\b\u0010\u001f\u001a\u00020 H'R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache;", "", "size", "", "getSize$annotations", "()V", "getSize", "()J", "maxSize", "getMaxSize$annotations", "getMaxSize", "directory", "Lokio/Path;", "getDirectory$annotations", "getDirectory", "()Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "getFileSystem$annotations", "getFileSystem", "()Lokio/FileSystem;", "openSnapshot", "Lcoil/disk/DiskCache$Snapshot;", com.ironsource.X3.i.W, "", "get", "openEditor", "Lcoil/disk/DiskCache$Editor;", "edit", "remove", "", "clear", "", "Snapshot", "Editor", "Builder", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DiskCache {

    /* compiled from: DiskCache.kt */
    /* renamed from: coil.disk.DiskCache$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void getDirectory$annotations() {
        }

        public static /* synthetic */ void getFileSystem$annotations() {
        }

        public static /* synthetic */ void getMaxSize$annotations() {
        }

        public static /* synthetic */ void getSize$annotations() {
        }
    }

    /* compiled from: DiskCache.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH'J\b\u0010\r\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache$Editor;", "", "metadata", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "data", "getData", "commit", "", "commitAndOpenSnapshot", "Lcoil/disk/DiskCache$Snapshot;", "commitAndGet", "abort", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Editor {
        void abort();

        void commit();

        @kotlin.Deprecated(message = "Renamed to 'commitAndOpenSnapshot'.", replaceWith = @kotlin.ReplaceWith(expression = "commitAndOpenSnapshot()", imports = {}))
        coil.disk.DiskCache.Snapshot commitAndGet();

        coil.disk.DiskCache.Snapshot commitAndOpenSnapshot();

        okio.Path getData();

        okio.Path getMetadata();
    }

    /* compiled from: DiskCache.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00060\u0002j\u0002`\u0001J\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\fH'R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache$Snapshot;", "Lokio/Closeable;", "Ljava/io/Closeable;", "metadata", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "data", "getData", "close", "", "closeAndOpenEditor", "Lcoil/disk/DiskCache$Editor;", "closeAndEdit", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Snapshot extends java.io.Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        @kotlin.Deprecated(message = "Renamed to 'closeAndOpenEditor'.", replaceWith = @kotlin.ReplaceWith(expression = "closeAndOpenEditor()", imports = {}))
        coil.disk.DiskCache.Editor closeAndEdit();

        coil.disk.DiskCache.Editor closeAndOpenEditor();

        okio.Path getData();

        okio.Path getMetadata();
    }

    void clear();

    @kotlin.Deprecated(message = "Renamed to 'openEditor'.", replaceWith = @kotlin.ReplaceWith(expression = "openEditor(key)", imports = {}))
    coil.disk.DiskCache.Editor edit(java.lang.String key);

    @kotlin.Deprecated(message = "Renamed to 'openSnapshot'.", replaceWith = @kotlin.ReplaceWith(expression = "openSnapshot(key)", imports = {}))
    coil.disk.DiskCache.Snapshot get(java.lang.String key);

    okio.Path getDirectory();

    okio.FileSystem getFileSystem();

    long getMaxSize();

    long getSize();

    coil.disk.DiskCache.Editor openEditor(java.lang.String key);

    coil.disk.DiskCache.Snapshot openSnapshot(java.lang.String key);

    boolean remove(java.lang.String key);

    /* compiled from: DiskCache.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0010J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcoil/disk/DiskCache$Builder;", "", "<init>", "()V", "directory", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "maxSizePercent", "", "minimumMaxSizeBytes", "", "maximumMaxSizeBytes", "maxSizeBytes", "cleanupDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/File;", "percent", "size", "dispatcher", "build", "Lcoil/disk/DiskCache;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private okio.Path directory;
        private long maxSizeBytes;
        private okio.FileSystem fileSystem = okio.FileSystem.SYSTEM;
        private double maxSizePercent = 0.02d;
        private long minimumMaxSizeBytes = 10485760;
        private long maximumMaxSizeBytes = 262144000;
        private kotlinx.coroutines.CoroutineDispatcher cleanupDispatcher = kotlinx.coroutines.Dispatchers.getIO();

        public final coil.disk.DiskCache.Builder directory(java.io.File directory) {
            return directory(okio.Path.Companion.get$default(okio.Path.INSTANCE, directory, false, 1, (java.lang.Object) null));
        }

        public final coil.disk.DiskCache.Builder directory(okio.Path directory) {
            this.directory = directory;
            return this;
        }

        public final coil.disk.DiskCache.Builder fileSystem(okio.FileSystem fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public final coil.disk.DiskCache.Builder maxSizePercent(double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new java.lang.IllegalArgumentException("size must be in the range [0.0, 1.0].".toString());
            }
            this.maxSizeBytes = 0L;
            this.maxSizePercent = percent;
            return this;
        }

        public final coil.disk.DiskCache.Builder minimumMaxSizeBytes(long size) {
            if (size <= 0) {
                throw new java.lang.IllegalArgumentException("size must be > 0.".toString());
            }
            this.minimumMaxSizeBytes = size;
            return this;
        }

        public final coil.disk.DiskCache.Builder maximumMaxSizeBytes(long size) {
            if (size <= 0) {
                throw new java.lang.IllegalArgumentException("size must be > 0.".toString());
            }
            this.maximumMaxSizeBytes = size;
            return this;
        }

        public final coil.disk.DiskCache.Builder maxSizeBytes(long size) {
            if (size <= 0) {
                throw new java.lang.IllegalArgumentException("size must be > 0.".toString());
            }
            this.maxSizePercent = 0.0d;
            this.maxSizeBytes = size;
            return this;
        }

        public final coil.disk.DiskCache.Builder cleanupDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            this.cleanupDispatcher = dispatcher;
            return this;
        }

        public final coil.disk.DiskCache build() {
            long j;
            okio.Path path = this.directory;
            if (path == null) {
                throw new java.lang.IllegalStateException("directory == null".toString());
            }
            if (this.maxSizePercent > 0.0d) {
                try {
                    java.io.File file = path.toFile();
                    file.mkdir();
                    android.os.StatFs statFs = new android.os.StatFs(file.getAbsolutePath());
                    j = kotlin.ranges.RangesKt.coerceIn((long) (this.maxSizePercent * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (java.lang.Exception unused) {
                    j = this.minimumMaxSizeBytes;
                }
            } else {
                j = this.maxSizeBytes;
            }
            return new coil.disk.RealDiskCache(j, path, this.fileSystem, this.cleanupDispatcher);
        }
    }
}
