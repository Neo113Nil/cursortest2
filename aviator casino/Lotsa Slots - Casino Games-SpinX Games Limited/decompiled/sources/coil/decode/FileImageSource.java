package coil.decode;

/* compiled from: ImageSource.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcoil/decode/FileImageSource;", "Lcoil/decode/ImageSource;", "file", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "diskCacheKey", "", "closeable", "Ljava/io/Closeable;", "metadata", "Lcoil/decode/ImageSource$Metadata;", "<init>", "(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/io/Closeable;Lcoil/decode/ImageSource$Metadata;)V", "getFile$coil_base_release", "()Lokio/Path;", "getFileSystem", "()Lokio/FileSystem;", "getDiskCacheKey$coil_base_release", "()Ljava/lang/String;", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "isClosed", "", "source", "Lokio/BufferedSource;", "sourceOrNull", "fileOrNull", "close", "", "assertNotClosed", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileImageSource extends coil.decode.ImageSource {
    private final java.io.Closeable closeable;
    private final java.lang.String diskCacheKey;
    private final okio.Path file;
    private final okio.FileSystem fileSystem;
    private boolean isClosed;
    private final coil.decode.ImageSource.Metadata metadata;
    private okio.BufferedSource source;

    /* renamed from: getFile$coil_base_release, reason: from getter */
    public final okio.Path getFile() {
        return this.file;
    }

    @Override // coil.decode.ImageSource
    public okio.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    /* renamed from: getDiskCacheKey$coil_base_release, reason: from getter */
    public final java.lang.String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @Override // coil.decode.ImageSource
    public coil.decode.ImageSource.Metadata getMetadata() {
        return this.metadata;
    }

    public FileImageSource(okio.Path path, okio.FileSystem fileSystem, java.lang.String str, java.io.Closeable closeable, coil.decode.ImageSource.Metadata metadata) {
        super(null);
        this.file = path;
        this.fileSystem = fileSystem;
        this.diskCacheKey = str;
        this.closeable = closeable;
        this.metadata = metadata;
    }

    @Override // coil.decode.ImageSource
    public synchronized okio.BufferedSource source() {
        assertNotClosed();
        okio.BufferedSource bufferedSource = this.source;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        okio.BufferedSource buffer = okio.Okio.buffer(getFileSystem().source(this.file));
        this.source = buffer;
        return buffer;
    }

    @Override // coil.decode.ImageSource
    public synchronized okio.BufferedSource sourceOrNull() {
        assertNotClosed();
        return this.source;
    }

    @Override // coil.decode.ImageSource
    public synchronized okio.Path file() {
        assertNotClosed();
        return this.file;
    }

    @Override // coil.decode.ImageSource
    public okio.Path fileOrNull() {
        return file();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.isClosed = true;
        okio.BufferedSource bufferedSource = this.source;
        if (bufferedSource != null) {
            coil.util.Utils.closeQuietly(bufferedSource);
        }
        java.io.Closeable closeable = this.closeable;
        if (closeable != null) {
            coil.util.Utils.closeQuietly(closeable);
        }
    }

    private final void assertNotClosed() {
        if (!(!this.isClosed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
    }
}
