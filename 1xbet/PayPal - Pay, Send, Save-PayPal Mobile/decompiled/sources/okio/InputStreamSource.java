package okio;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "Ljava/io/InputStream;", "p0", "Lokio/Timeout;", "p1", "<init>", "(Ljava/io/InputStream;Lokio/Timeout;)V", "Lokio/Buffer;", "", "read", "(Lokio/Buffer;J)J", "", "close", "()V", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/io/InputStream;", "getHighSpeedVideoSizes", "Lokio/Timeout;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
class InputStreamSource implements okio.Source {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.io.InputStream getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.Timeout Camera2StreamConfigurationMap;

    public InputStreamSource(java.io.InputStream inputStream, okio.Timeout timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "");
        this.getHighSpeedVideoSizes = inputStream;
        this.Camera2StreamConfigurationMap = timeout;
    }

    @Override // okio.Source
    public long read(okio.Buffer p0, long p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == 0) {
            return 0L;
        }
        if (p1 < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(p1)).toString());
        }
        try {
            this.Camera2StreamConfigurationMap.throwIfReached();
            okio.Segment writableSegment$okio = p0.writableSegment$okio(1);
            int read = this.getHighSpeedVideoSizes.read(writableSegment$okio.data, writableSegment$okio.limit, (int) java.lang.Math.min(p1, 8192 - writableSegment$okio.limit));
            if (read == -1) {
                if (writableSegment$okio.pos != writableSegment$okio.limit) {
                    return -1L;
                }
                p0.head = writableSegment$okio.pop();
                okio.SegmentPool.recycle(writableSegment$okio);
                return -1L;
            }
            writableSegment$okio.limit += read;
            long j = read;
            p0.setSize$okio(p0.size() + j);
            return j;
        } catch (java.lang.AssertionError e) {
            if (okio.internal._JavaIoKt.isAndroidGetsocknameError(e)) {
                throw new java.io.IOException(e);
            }
            throw e;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.getHighSpeedVideoSizes.close();
    }

    @Override // okio.Source
    /* renamed from: timeout, reason: from getter */
    public okio.Timeout getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("source(");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }
}
