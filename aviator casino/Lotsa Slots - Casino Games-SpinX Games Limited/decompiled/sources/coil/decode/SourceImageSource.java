package coil.decode;

/* compiled from: ImageSource.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcoil/decode/SourceImageSource;", "Lcoil/decode/ImageSource;", "source", "Lokio/BufferedSource;", "cacheDirectoryFactory", "Lkotlin/Function0;", "Ljava/io/File;", "metadata", "Lcoil/decode/ImageSource$Metadata;", "<init>", "(Lokio/BufferedSource;Lkotlin/jvm/functions/Function0;Lcoil/decode/ImageSource$Metadata;)V", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "isClosed", "", "file", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "sourceOrNull", "fileOrNull", "close", "", "createTempFile", "assertNotClosed", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SourceImageSource extends coil.decode.ImageSource {
    private kotlin.jvm.functions.Function0<? extends java.io.File> cacheDirectoryFactory;
    private okio.Path file;
    private boolean isClosed;
    private final coil.decode.ImageSource.Metadata metadata;
    private okio.BufferedSource source;

    @Override // coil.decode.ImageSource
    public coil.decode.ImageSource.Metadata getMetadata() {
        return this.metadata;
    }

    public SourceImageSource(okio.BufferedSource bufferedSource, kotlin.jvm.functions.Function0<? extends java.io.File> function0, coil.decode.ImageSource.Metadata metadata) {
        super(null);
        this.metadata = metadata;
        this.source = bufferedSource;
        this.cacheDirectoryFactory = function0;
    }

    @Override // coil.decode.ImageSource
    public okio.FileSystem getFileSystem() {
        return okio.FileSystem.SYSTEM;
    }

    @Override // coil.decode.ImageSource
    public synchronized okio.BufferedSource source() {
        assertNotClosed();
        okio.BufferedSource bufferedSource = this.source;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        okio.FileSystem fileSystem = getFileSystem();
        okio.Path path = this.file;
        kotlin.jvm.internal.Intrinsics.checkNotNull(path);
        okio.BufferedSource buffer = okio.Okio.buffer(fileSystem.source(path));
        this.source = buffer;
        return buffer;
    }

    @Override // coil.decode.ImageSource
    public okio.BufferedSource sourceOrNull() {
        return source();
    }

    @Override // coil.decode.ImageSource
    public synchronized okio.Path file() {
        java.lang.Throwable th;
        assertNotClosed();
        okio.Path path = this.file;
        if (path != null) {
            return path;
        }
        okio.Path createTempFile = createTempFile();
        okio.BufferedSink buffer = okio.Okio.buffer(getFileSystem().sink(createTempFile, false));
        try {
            okio.BufferedSource bufferedSource = this.source;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSource);
            java.lang.Long.valueOf(buffer.writeAll(bufferedSource));
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (java.lang.Throwable th3) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
        }
        if (th == null) {
            this.source = null;
            this.file = createTempFile;
            this.cacheDirectoryFactory = null;
            return createTempFile;
        }
        throw th;
    }

    @Override // coil.decode.ImageSource
    public synchronized okio.Path fileOrNull() {
        assertNotClosed();
        return this.file;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.isClosed = true;
        okio.BufferedSource bufferedSource = this.source;
        if (bufferedSource != null) {
            coil.util.Utils.closeQuietly(bufferedSource);
        }
        okio.Path path = this.file;
        if (path != null) {
            getFileSystem().delete(path);
        }
    }

    private final okio.Path createTempFile() {
        kotlin.jvm.functions.Function0<? extends java.io.File> function0 = this.cacheDirectoryFactory;
        kotlin.jvm.internal.Intrinsics.checkNotNull(function0);
        java.io.File invoke = function0.invoke();
        if (!invoke.isDirectory()) {
            throw new java.lang.IllegalStateException("cacheDirectory must be a directory.".toString());
        }
        return okio.Path.Companion.get$default(okio.Path.INSTANCE, java.io.File.createTempFile("tmp", null, invoke), false, 1, (java.lang.Object) null);
    }

    private final void assertNotClosed() {
        if (!(!this.isClosed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
    }
}
