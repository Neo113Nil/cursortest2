package coil3.disk;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u001f !J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/disk/DiskCache;", "", "", "key", "Lcoil3/disk/DiskCache$Snapshot;", "openSnapshot", "(Ljava/lang/String;)Lcoil3/disk/DiskCache$Snapshot;", "Lcoil3/disk/DiskCache$Editor;", "openEditor", "(Ljava/lang/String;)Lcoil3/disk/DiskCache$Editor;", "", "remove", "(Ljava/lang/String;)Z", "", "clear", "()V", "shutdown", "", "getSize", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "getMaxSize", "maxSize", "Lokio/Path;", "getDirectory", "()Lokio/Path;", "directory", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "fileSystem", "Snapshot", "Editor", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DiskCache {

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/disk/DiskCache$Editor;", "", "", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "()V", "Lcoil3/disk/DiskCache$Snapshot;", "commitAndOpenSnapshot", "()Lcoil3/disk/DiskCache$Snapshot;", "abort", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Editor {
        void abort();

        void commit();

        coil3.disk.DiskCache.Snapshot commitAndOpenSnapshot();

        okio.Path getData();

        okio.Path getMetadata();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcoil3/disk/DiskCache$Snapshot;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "metadata", "Lokio/Path;", "getMetadata", "()Lokio/Path;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "close", "", "closeAndOpenEditor", "Lcoil3/disk/DiskCache$Editor;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Snapshot extends java.lang.AutoCloseable {
        @Override // java.lang.AutoCloseable
        void close();

        coil3.disk.DiskCache.Editor closeAndOpenEditor();

        okio.Path getData();

        okio.Path getMetadata();
    }

    void clear();

    okio.Path getDirectory();

    okio.FileSystem getFileSystem();

    long getMaxSize();

    long getSize();

    coil3.disk.DiskCache.Editor openEditor(java.lang.String key);

    coil3.disk.DiskCache.Snapshot openSnapshot(java.lang.String key);

    boolean remove(java.lang.String key);

    void shutdown();

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010'R\u0016\u0010+\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010*"}, d2 = {"Lcoil3/disk/DiskCache$Builder;", "", "<init>", "()V", "Lokio/Path;", "directory", "(Lokio/Path;)Lcoil3/disk/DiskCache$Builder;", "Lokio/FileSystem;", "fileSystem", "(Lokio/FileSystem;)Lcoil3/disk/DiskCache$Builder;", "", "percent", "maxSizePercent", "(D)Lcoil3/disk/DiskCache$Builder;", "", io.ktor.http.ContentDisposition.Parameters.Size, "minimumMaxSizeBytes", "(J)Lcoil3/disk/DiskCache$Builder;", "maximumMaxSizeBytes", "maxSizeBytes", "Lkotlin/coroutines/CoroutineContext;", "context", "cleanupCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)Lcoil3/disk/DiskCache$Builder;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "cleanupDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lcoil3/disk/DiskCache$Builder;", "Lcoil3/disk/DiskCache;", "build", "()Lcoil3/disk/DiskCache;", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/Path;", "Camera2StreamConfigurationMap", "Lokio/FileSystem;", "getHighSpeedVideoFpsRanges", "D", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "J", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Lkotlin/coroutines/CoroutineContext;", "getOutputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private okio.Path getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private long getOutputMinFrameDuration;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private okio.FileSystem getHighSpeedVideoFpsRanges = coil3.content.FileSystems_nonJsCommonKt.defaultFileSystem();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private double getHighSpeedVideoSizes = 0.02d;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private long getHighSpeedVideoFpsRangesFor = 10485760;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private long Camera2StreamConfigurationMap = 262144000;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private kotlin.coroutines.CoroutineContext getOutputFormats = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;

        public final coil3.disk.DiskCache.Builder directory(okio.Path directory) {
            this.getHighResolutionOutputSizeshNQ4ISI = directory;
            return this;
        }

        public final coil3.disk.DiskCache.Builder fileSystem(okio.FileSystem fileSystem) {
            this.getHighSpeedVideoFpsRanges = fileSystem;
            return this;
        }

        public final coil3.disk.DiskCache.Builder maxSizePercent(double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new java.lang.IllegalArgumentException("percent must be in the range [0.0, 1.0].".toString());
            }
            this.getOutputMinFrameDuration = 0L;
            this.getHighSpeedVideoSizes = percent;
            return this;
        }

        public final coil3.disk.DiskCache.Builder minimumMaxSizeBytes(long size) {
            if (size <= 0) {
                throw new java.lang.IllegalArgumentException("size must be > 0.".toString());
            }
            this.getHighSpeedVideoFpsRangesFor = size;
            return this;
        }

        public final coil3.disk.DiskCache.Builder maximumMaxSizeBytes(long size) {
            if (size <= 0) {
                throw new java.lang.IllegalArgumentException("size must be > 0.".toString());
            }
            this.Camera2StreamConfigurationMap = size;
            return this;
        }

        public final coil3.disk.DiskCache.Builder maxSizeBytes(long size) {
            if (size <= 0) {
                throw new java.lang.IllegalArgumentException("size must be > 0.".toString());
            }
            this.getHighSpeedVideoSizes = 0.0d;
            this.getOutputMinFrameDuration = size;
            return this;
        }

        public final coil3.disk.DiskCache.Builder cleanupCoroutineContext(kotlin.coroutines.CoroutineContext context) {
            this.getOutputFormats = context;
            return this;
        }

        @kotlin.Deprecated(message = "Replaced by cleanupCoroutineContext.", replaceWith = @kotlin.ReplaceWith(expression = "cleanupCoroutineContext(dispatcher)", imports = {}))
        public final coil3.disk.DiskCache.Builder cleanupDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            return cleanupCoroutineContext(dispatcher);
        }

        public final coil3.disk.DiskCache build() {
            long j;
            okio.Path path = this.getHighResolutionOutputSizeshNQ4ISI;
            if (path == null) {
                throw new java.lang.IllegalStateException("directory == null".toString());
            }
            double d = this.getHighSpeedVideoSizes;
            if (d > 0.0d) {
                try {
                    j = kotlin.ranges.RangesKt.coerceIn((long) (d * coil3.content.FileSystems_androidKt.remainingFreeSpaceBytes(this.getHighSpeedVideoFpsRanges, path)), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
                } catch (java.lang.Exception unused) {
                    j = this.getHighSpeedVideoFpsRangesFor;
                }
            } else {
                j = this.getOutputMinFrameDuration;
            }
            return new coil3.disk.RealDiskCache(j, path, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
        }
    }
}
