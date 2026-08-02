package okio;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0013\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00060\u0012j\u0002`\u00138\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u00060!j\u0002`\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "sink", "<init>", "(Lokio/Sink;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "close", "Ljava/util/zip/Deflater;", "Lokio/getInputSizeshNQ4ISI;", "-deprecated_deflater", "()Ljava/util/zip/Deflater;", "Lokio/RealBufferedSink;", "Camera2StreamConfigurationMap", "Lokio/RealBufferedSink;", "deflater", "Ljava/util/zip/Deflater;", "Lokio/DeflaterSink;", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/DeflaterSink;", "", "getHighSpeedVideoSizes", "Z", "Ljava/util/zip/CRC32;", "Lokio/internal/getHighSpeedVideoFpsRanges;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/zip/CRC32;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GzipSink implements okio.Sink {
    private final okio.RealBufferedSink Camera2StreamConfigurationMap;
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.zip.CRC32 getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public GzipSink(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        okio.RealBufferedSink realBufferedSink = new okio.RealBufferedSink(sink);
        this.Camera2StreamConfigurationMap = realBufferedSink;
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(okio.internal._ZlibJvmKt.getDEFAULT_COMPRESSION(), true);
        this.deflater = deflater;
        this.getHighResolutionOutputSizeshNQ4ISI = new okio.DeflaterSink((okio.BufferedSink) realBufferedSink, deflater);
        this.getHighSpeedVideoFpsRangesFor = new java.util.zip.CRC32();
        okio.Buffer buffer = realBufferedSink.bufferField;
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    public final java.util.zip.Deflater deflater() {
        return this.deflater;
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI.flush();
    }

    @Override // okio.Sink
    public final okio.Timeout timeout() {
        return this.Camera2StreamConfigurationMap.timeout();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.finishDeflate$okio();
            this.Camera2StreamConfigurationMap.writeIntLe((int) this.getHighSpeedVideoFpsRangesFor.getValue());
            this.Camera2StreamConfigurationMap.writeIntLe((int) this.deflater.getBytesRead());
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            this.deflater.end();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.Camera2StreamConfigurationMap.close();
        } catch (java.lang.Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.getHighSpeedVideoSizes = true;
        if (th != null) {
            throw th;
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "deflater", imports = {}))
    /* renamed from: -deprecated_deflater, reason: not valid java name and from getter */
    public final java.util.zip.Deflater getDeflater() {
        return this.deflater;
    }

    @Override // okio.Sink
    public final void write(okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        if (byteCount == 0) {
            return;
        }
        okio.Segment segment = source.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        long j = byteCount;
        while (j > 0) {
            int min = (int) java.lang.Math.min(j, segment.limit - segment.pos);
            this.getHighSpeedVideoFpsRangesFor.update(segment.data, segment.pos, min);
            j -= min;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.write(source, byteCount);
    }
}
