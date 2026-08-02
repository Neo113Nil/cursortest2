package okhttp3.internal.ws;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lokio/Buffer;", "buffer", "", "inflate", "(Lokio/Buffer;)V", "close", "()V", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/Buffer;", "Ljava/util/zip/Inflater;", "Ljava/util/zip/Inflater;", "getHighSpeedVideoFpsRangesFor", "Lokio/InflaterSource;", "Camera2StreamConfigurationMap", "Lokio/InflaterSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MessageInflater implements java.io.Closeable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private okio.InflaterSource getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.Buffer getHighSpeedVideoFpsRanges = new okio.Buffer();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.zip.Inflater getHighSpeedVideoFpsRangesFor;

    public MessageInflater(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public final void inflate(okio.Buffer buffer) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (this.getHighSpeedVideoFpsRanges.size() != 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.util.zip.Inflater inflater = this.getHighSpeedVideoFpsRangesFor;
        if (inflater == null) {
            inflater = new java.util.zip.Inflater(true);
            this.getHighSpeedVideoFpsRangesFor = inflater;
        }
        okio.InflaterSource inflaterSource = this.getHighResolutionOutputSizeshNQ4ISI;
        if (inflaterSource == null) {
            inflaterSource = new okio.InflaterSource((okio.Source) this.getHighSpeedVideoFpsRanges, inflater);
            this.getHighResolutionOutputSizeshNQ4ISI = inflaterSource;
        }
        if (this.getHighSpeedVideoSizes) {
            inflater.reset();
        }
        this.getHighSpeedVideoFpsRanges.writeAll(buffer);
        this.getHighSpeedVideoFpsRanges.writeInt(65535);
        long bytesRead = inflater.getBytesRead() + this.getHighSpeedVideoFpsRanges.size();
        do {
            inflaterSource.readOrInflate(buffer, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            this.getHighSpeedVideoFpsRanges.clear();
            inflaterSource.close();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        okio.InflaterSource inflaterSource = this.getHighResolutionOutputSizeshNQ4ISI;
        if (inflaterSource != null) {
            inflaterSource.close();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = null;
    }
}
