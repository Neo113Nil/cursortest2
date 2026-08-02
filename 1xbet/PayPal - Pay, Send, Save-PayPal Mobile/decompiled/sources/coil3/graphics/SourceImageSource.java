package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u00060\u0019j\u0002`\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001b\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#"}, d2 = {"Lcoil3/decode/SourceImageSource;", "Lcoil3/decode/ImageSource;", "Lokio/BufferedSource;", "source", "Lokio/FileSystem;", "fileSystem", "Lcoil3/decode/ImageSource$Metadata;", "metadata", "<init>", "(Lokio/BufferedSource;Lokio/FileSystem;Lcoil3/decode/ImageSource$Metadata;)V", "()Lokio/BufferedSource;", "sourceOrNull", "Lokio/Path;", "file", "()Lokio/Path;", "fileOrNull", "", "close", "()V", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Lcoil3/decode/ImageSource$Metadata;", "getMetadata", "()Lcoil3/decode/ImageSource$Metadata;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes", "Lokio/BufferedSource;", "Lokio/Path;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SourceImageSource implements coil3.graphics.ImageSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final okio.FileSystem fileSystem;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private okio.Path getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private okio.BufferedSource Camera2StreamConfigurationMap;
    private final coil3.decode.ImageSource.Metadata metadata;

    public SourceImageSource(okio.BufferedSource bufferedSource, okio.FileSystem fileSystem, coil3.decode.ImageSource.Metadata metadata) {
        this.fileSystem = fileSystem;
        this.metadata = metadata;
        this.Camera2StreamConfigurationMap = bufferedSource;
    }

    @Override // coil3.graphics.ImageSource
    public final okio.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @Override // coil3.graphics.ImageSource
    public final coil3.decode.ImageSource.Metadata getMetadata() {
        return this.metadata;
    }

    @Override // coil3.graphics.ImageSource
    public final okio.BufferedSource source() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            okio.BufferedSource bufferedSource = this.Camera2StreamConfigurationMap;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            okio.FileSystem fileSystem = getFileSystem();
            okio.Path path = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(path);
            okio.BufferedSource buffer = okio.Okio.buffer(fileSystem.source(path));
            this.Camera2StreamConfigurationMap = buffer;
            return buffer;
        }
    }

    @Override // coil3.graphics.ImageSource
    public final okio.BufferedSource sourceOrNull() {
        return source();
    }

    @Override // coil3.graphics.ImageSource
    public final okio.Path file() {
        java.lang.Throwable th;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            okio.Path path = this.getHighSpeedVideoFpsRanges;
            if (path != null) {
                return path;
            }
            okio.Path createTempFile = coil3.content.FileSystemsKt.createTempFile(getFileSystem());
            okio.BufferedSink buffer = okio.Okio.buffer(getFileSystem().sink(createTempFile, false));
            try {
                okio.BufferedSource bufferedSource = this.Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSource);
                buffer.writeAll(bufferedSource);
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
            if (th != null) {
                throw th;
            }
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = createTempFile;
            return createTempFile;
        }
    }

    @Override // coil3.graphics.ImageSource
    public final okio.Path fileOrNull() {
        okio.Path path;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                path = this.getHighSpeedVideoFpsRanges;
            } else {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
        }
        return path;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            okio.BufferedSource bufferedSource = this.Camera2StreamConfigurationMap;
            if (bufferedSource != null) {
                coil3.content.UtilsKt.closeQuietly((java.io.Closeable) bufferedSource);
            }
            okio.Path path = this.getHighSpeedVideoFpsRanges;
            if (path != null) {
                getFileSystem().delete(path);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
