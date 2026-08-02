package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcoil3/decode/FileImageSource;", "Lcoil3/decode/ImageSource;", "file", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "diskCacheKey", "", "closeable", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "metadata", "Lcoil3/decode/ImageSource$Metadata;", "<init>", "(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Lcoil3/decode/ImageSource$Metadata;)V", "getFile$coil_core", "()Lokio/Path;", "getFileSystem", "()Lokio/FileSystem;", "getDiskCacheKey$coil_core", "()Ljava/lang/String;", "getMetadata", "()Lcoil3/decode/ImageSource$Metadata;", "lock", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "isClosed", "", "source", "Lokio/BufferedSource;", "sourceOrNull", "fileOrNull", "close", "", "assertNotClosed", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileImageSource implements coil3.graphics.ImageSource {
    private final okio.Path Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.AutoCloseable getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final okio.FileSystem getHighSpeedVideoSizes;
    private final coil3.decode.ImageSource.Metadata getHighSpeedVideoSizesFor;
    private final java.lang.Object getInputFormats = new java.lang.Object();
    private okio.BufferedSource getOutputMinFrameDuration;

    public FileImageSource(okio.Path path, okio.FileSystem fileSystem, java.lang.String str, java.lang.AutoCloseable autoCloseable, coil3.decode.ImageSource.Metadata metadata) {
        this.Camera2StreamConfigurationMap = path;
        this.getHighSpeedVideoSizes = fileSystem;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = autoCloseable;
        this.getHighSpeedVideoSizesFor = metadata;
    }

    /* renamed from: getFile$coil_core, reason: from getter */
    public final okio.Path getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // coil3.graphics.ImageSource
    /* renamed from: getFileSystem, reason: from getter */
    public final okio.FileSystem getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getDiskCacheKey$coil_core, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // coil3.graphics.ImageSource
    /* renamed from: getMetadata, reason: from getter */
    public final coil3.decode.ImageSource.Metadata getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // coil3.graphics.ImageSource
    public final okio.BufferedSource source() {
        synchronized (this.getInputFormats) {
            Camera2StreamConfigurationMap();
            okio.BufferedSource bufferedSource = this.getOutputMinFrameDuration;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            okio.BufferedSource buffer = okio.Okio.buffer(getGetHighSpeedVideoSizes().source(this.Camera2StreamConfigurationMap));
            this.getOutputMinFrameDuration = buffer;
            return buffer;
        }
    }

    @Override // coil3.graphics.ImageSource
    public final okio.BufferedSource sourceOrNull() {
        okio.BufferedSource bufferedSource;
        synchronized (this.getInputFormats) {
            Camera2StreamConfigurationMap();
            bufferedSource = this.getOutputMinFrameDuration;
        }
        return bufferedSource;
    }

    @Override // coil3.graphics.ImageSource
    public final okio.Path file() {
        okio.Path path;
        synchronized (this.getInputFormats) {
            Camera2StreamConfigurationMap();
            path = this.Camera2StreamConfigurationMap;
        }
        return path;
    }

    @Override // coil3.graphics.ImageSource
    public final okio.Path fileOrNull() {
        return file();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.getInputFormats) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            okio.BufferedSource bufferedSource = this.getOutputMinFrameDuration;
            if (bufferedSource != null) {
                coil3.content.UtilsKt.closeQuietly((java.io.Closeable) bufferedSource);
            }
            java.lang.AutoCloseable autoCloseable = this.getHighSpeedVideoFpsRanges;
            if (autoCloseable != null) {
                coil3.content.UtilsKt.closeQuietly(autoCloseable);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void Camera2StreamConfigurationMap() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
    }
}
