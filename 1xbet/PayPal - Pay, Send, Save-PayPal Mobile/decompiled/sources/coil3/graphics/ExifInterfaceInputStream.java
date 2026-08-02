package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\tJ'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcoil3/decode/ExifInterfaceInputStream;", "Ljava/io/InputStream;", "p0", "<init>", "(Ljava/io/InputStream;)V", "", "read", "()I", "", "([B)I", "p1", "p2", "([BII)I", "", "skip", "(J)J", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "", "close", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/io/InputStream;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ExifInterfaceInputStream extends java.io.InputStream {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor = 1073741824;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.io.InputStream Camera2StreamConfigurationMap;

    public ExifInterfaceInputStream(java.io.InputStream inputStream) {
        this.Camera2StreamConfigurationMap = inputStream;
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.Camera2StreamConfigurationMap.read();
        if (read == -1) {
            this.getHighSpeedVideoFpsRangesFor = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] p0) {
        int read = this.Camera2StreamConfigurationMap.read(p0);
        if (read == -1) {
            this.getHighSpeedVideoFpsRangesFor = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] p0, int p1, int p2) {
        int read = this.Camera2StreamConfigurationMap.read(p0, p1, p2);
        if (read == -1) {
            this.getHighSpeedVideoFpsRangesFor = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long p0) {
        return this.Camera2StreamConfigurationMap.skip(p0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap.close();
    }
}
