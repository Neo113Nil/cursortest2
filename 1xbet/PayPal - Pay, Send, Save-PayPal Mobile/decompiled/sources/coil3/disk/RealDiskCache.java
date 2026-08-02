package coil3.disk;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0003-.,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001f"}, d2 = {"Lcoil3/disk/RealDiskCache;", "Lcoil3/disk/DiskCache;", "", "maxSize", "Lokio/Path;", "directory", "Lokio/FileSystem;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "<init>", "(JLokio/Path;Lokio/FileSystem;Lkotlin/coroutines/CoroutineContext;)V", "", "key", "Lcoil3/disk/DiskCache$Snapshot;", "openSnapshot", "(Ljava/lang/String;)Lcoil3/disk/DiskCache$Snapshot;", "Lcoil3/disk/DiskCache$Editor;", "openEditor", "(Ljava/lang/String;)Lcoil3/disk/DiskCache$Editor;", "", "remove", "(Ljava/lang/String;)Z", "", "clear", "()V", "shutdown", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Ljava/lang/String;", "J", "getMaxSize", "()J", "Lokio/Path;", "getDirectory", "()Lokio/Path;", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Lcoil3/disk/DiskLruCache;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/disk/DiskLruCache;", "getHighSpeedVideoSizes", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Companion", "RealSnapshot", "RealEditor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RealDiskCache implements coil3.disk.DiskCache {
    private final okio.Path directory;
    private final okio.FileSystem fileSystem;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final coil3.disk.DiskLruCache getHighSpeedVideoSizes;
    private final long maxSize;

    public RealDiskCache(long j, okio.Path path, okio.FileSystem fileSystem, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.maxSize = j;
        this.directory = path;
        this.fileSystem = fileSystem;
        this.getHighSpeedVideoSizes = new coil3.disk.DiskLruCache(getFileSystem(), getDirectory(), coroutineContext, getMaxSize(), 3, 2);
    }

    @Override // coil3.disk.DiskCache
    public final long getMaxSize() {
        return this.maxSize;
    }

    @Override // coil3.disk.DiskCache
    public final okio.Path getDirectory() {
        return this.directory;
    }

    @Override // coil3.disk.DiskCache
    public final okio.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @Override // coil3.disk.DiskCache
    public final long getSize() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // coil3.disk.DiskCache
    public final coil3.disk.DiskCache.Snapshot openSnapshot(java.lang.String key) {
        coil3.disk.DiskLruCache.Snapshot snapshot = this.getHighSpeedVideoSizes.get(getHighSpeedVideoFpsRanges(key));
        return snapshot != null ? new coil3.disk.RealDiskCache.RealSnapshot(snapshot) : null;
    }

    @Override // coil3.disk.DiskCache
    public final coil3.disk.DiskCache.Editor openEditor(java.lang.String key) {
        coil3.disk.DiskLruCache.Editor edit = this.getHighSpeedVideoSizes.edit(getHighSpeedVideoFpsRanges(key));
        return edit != null ? new coil3.disk.RealDiskCache.RealEditor(edit) : null;
    }

    @Override // coil3.disk.DiskCache
    public final boolean remove(java.lang.String key) {
        return this.getHighSpeedVideoSizes.remove(getHighSpeedVideoFpsRanges(key));
    }

    @Override // coil3.disk.DiskCache
    public final void clear() {
        this.getHighSpeedVideoSizes.evictAll();
    }

    @Override // coil3.disk.DiskCache
    public final void shutdown() {
        coil3.content.UtilsKt.closeQuietly(this.getHighSpeedVideoSizes);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        return okio.ByteString.INSTANCE.encodeUtf8(str).sha256().hex();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcoil3/disk/RealDiskCache$RealSnapshot;", "Lcoil3/disk/DiskCache$Snapshot;", "Lcoil3/disk/DiskLruCache$Snapshot;", "Lcoil3/disk/DiskLruCache;", "p0", "<init>", "(Lcoil3/disk/DiskLruCache$Snapshot;)V", "", "close", "()V", "getHighSpeedVideoSizes", "Lcoil3/disk/DiskLruCache$Snapshot;", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "getHighSpeedVideoFpsRanges", "getData", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class RealSnapshot implements coil3.disk.DiskCache.Snapshot {
        private final coil3.disk.DiskLruCache.Snapshot getHighSpeedVideoSizes;

        public RealSnapshot(coil3.disk.DiskLruCache.Snapshot snapshot) {
            this.getHighSpeedVideoSizes = snapshot;
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final okio.Path getMetadata() {
            return this.getHighSpeedVideoSizes.file(0);
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final okio.Path getData() {
            return this.getHighSpeedVideoSizes.file(1);
        }

        @Override // coil3.disk.DiskCache.Snapshot, java.lang.AutoCloseable
        public final void close() {
            this.getHighSpeedVideoSizes.close();
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final /* synthetic */ coil3.disk.DiskCache.Editor closeAndOpenEditor() {
            coil3.disk.DiskLruCache.Editor closeAndEdit = this.getHighSpeedVideoSizes.closeAndEdit();
            return closeAndEdit != null ? new coil3.disk.RealDiskCache.RealEditor(closeAndEdit) : null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tR\u0018\u0010\u0010\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcoil3/disk/RealDiskCache$RealEditor;", "Lcoil3/disk/DiskCache$Editor;", "Lcoil3/disk/DiskLruCache$Editor;", "Lcoil3/disk/DiskLruCache;", "p0", "<init>", "(Lcoil3/disk/DiskLruCache$Editor;)V", "", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "()V", "Lcoil3/disk/RealDiskCache$RealSnapshot;", "getHighSpeedVideoSizes", "()Lcoil3/disk/RealDiskCache$RealSnapshot;", "abort", "Camera2StreamConfigurationMap", "Lcoil3/disk/DiskLruCache$Editor;", "getHighSpeedVideoFpsRanges", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "getHighResolutionOutputSizeshNQ4ISI", "getData", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class RealEditor implements coil3.disk.DiskCache.Editor {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final coil3.disk.DiskLruCache.Editor getHighSpeedVideoFpsRanges;

        public RealEditor(coil3.disk.DiskLruCache.Editor editor) {
            this.getHighSpeedVideoFpsRanges = editor;
        }

        @Override // coil3.disk.DiskCache.Editor
        public final okio.Path getMetadata() {
            return this.getHighSpeedVideoFpsRanges.file(0);
        }

        @Override // coil3.disk.DiskCache.Editor
        public final okio.Path getData() {
            return this.getHighSpeedVideoFpsRanges.file(1);
        }

        @Override // coil3.disk.DiskCache.Editor
        public final void commit() {
            this.getHighSpeedVideoFpsRanges.commit();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // coil3.disk.DiskCache.Editor
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public coil3.disk.RealDiskCache.RealSnapshot commitAndOpenSnapshot() {
            coil3.disk.DiskLruCache.Snapshot commitAndGet = this.getHighSpeedVideoFpsRanges.commitAndGet();
            if (commitAndGet != null) {
                return new coil3.disk.RealDiskCache.RealSnapshot(commitAndGet);
            }
            return null;
        }

        @Override // coil3.disk.DiskCache.Editor
        public final void abort() {
            this.getHighSpeedVideoFpsRanges.abort();
        }
    }
}
