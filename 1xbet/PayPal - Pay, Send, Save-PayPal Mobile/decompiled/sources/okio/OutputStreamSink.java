package okio;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "Ljava/io/OutputStream;", "p0", "Lokio/Timeout;", "p1", "<init>", "(Ljava/io/OutputStream;Lokio/Timeout;)V", "Lokio/Buffer;", "", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/io/OutputStream;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lokio/Timeout;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
final class OutputStreamSink implements okio.Sink {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.io.OutputStream getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.Timeout getHighSpeedVideoFpsRangesFor;

    public OutputStreamSink(java.io.OutputStream outputStream, okio.Timeout timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "");
        this.getHighSpeedVideoFpsRanges = outputStream;
        this.getHighSpeedVideoFpsRangesFor = timeout;
    }

    @Override // okio.Sink
    public final void write(okio.Buffer p0, long p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        okio.SegmentedByteString.checkOffsetAndCount(p0.size(), 0L, p1);
        while (p1 > 0) {
            this.getHighSpeedVideoFpsRangesFor.throwIfReached();
            okio.Segment segment = p0.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int min = (int) java.lang.Math.min(p1, segment.limit - segment.pos);
            this.getHighSpeedVideoFpsRanges.write(segment.data, segment.pos, min);
            segment.pos += min;
            long j = min;
            p1 -= j;
            p0.setSize$okio(p0.size() - j);
            if (segment.pos == segment.limit) {
                p0.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        this.getHighSpeedVideoFpsRanges.flush();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    @Override // okio.Sink
    /* renamed from: timeout, reason: from getter */
    public final okio.Timeout getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("sink(");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }
}
