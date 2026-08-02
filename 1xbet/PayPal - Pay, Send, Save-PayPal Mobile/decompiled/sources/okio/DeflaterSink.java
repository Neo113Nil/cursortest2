package okio;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "Lokio/BufferedSink;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "", "p0", "getHighSpeedVideoFpsRangesFor", "(Z)V", "flush", "()V", "finishDeflate$okio", "close", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lokio/BufferedSink;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/zip/Deflater;", "getHighSpeedVideoFpsRanges", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeflaterSink implements okio.Sink {
    private boolean getHighSpeedVideoFpsRanges;
    private final java.util.zip.Deflater getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.BufferedSink getHighResolutionOutputSizeshNQ4ISI;

    public DeflaterSink(okio.BufferedSink bufferedSink, java.util.zip.Deflater deflater) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deflater, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bufferedSink;
        this.getHighSpeedVideoFpsRangesFor = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(okio.Sink sink, java.util.zip.Deflater deflater) {
        this(okio.Okio.buffer(sink), deflater);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deflater, "");
    }

    @Override // okio.Sink
    public final void write(okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        while (byteCount > 0) {
            okio.Segment segment = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int min = (int) java.lang.Math.min(byteCount, segment.limit - segment.pos);
            this.getHighSpeedVideoFpsRangesFor.setInput(segment.data, segment.pos, min);
            getHighSpeedVideoFpsRangesFor(false);
            long j = min;
            source.setSize$okio(source.size() - j);
            segment.pos += min;
            if (segment.pos == segment.limit) {
                source.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
            byteCount -= j;
        }
        this.getHighSpeedVideoFpsRangesFor.setInput(okio.internal._ZlibJvmKt.getEMPTY_BYTE_ARRAY(), 0, 0);
    }

    private final void getHighSpeedVideoFpsRangesFor(boolean p0) {
        okio.Segment writableSegment$okio;
        int deflate;
        okio.Buffer buffer = this.getHighResolutionOutputSizeshNQ4ISI.getBuffer();
        while (true) {
            writableSegment$okio = buffer.writableSegment$okio(1);
            if (p0) {
                try {
                    deflate = this.getHighSpeedVideoFpsRangesFor.deflate(writableSegment$okio.data, writableSegment$okio.limit, 8192 - writableSegment$okio.limit, 2);
                } catch (java.lang.NullPointerException e) {
                    throw new java.io.IOException("Deflater already closed", e);
                }
            } else {
                deflate = this.getHighSpeedVideoFpsRangesFor.deflate(writableSegment$okio.data, writableSegment$okio.limit, 8192 - writableSegment$okio.limit);
            }
            if (deflate > 0) {
                writableSegment$okio.limit += deflate;
                buffer.setSize$okio(buffer.size() + deflate);
                this.getHighResolutionOutputSizeshNQ4ISI.emitCompleteSegments();
            } else if (this.getHighSpeedVideoFpsRangesFor.needsInput()) {
                break;
            }
        }
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            okio.SegmentPool.recycle(writableSegment$okio);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor(true);
        this.getHighResolutionOutputSizeshNQ4ISI.flush();
    }

    public final void finishDeflate$okio() {
        this.getHighSpeedVideoFpsRangesFor.finish();
        getHighSpeedVideoFpsRangesFor(false);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        try {
            finishDeflate$okio();
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            this.getHighSpeedVideoFpsRangesFor.end();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.close();
        } catch (java.lang.Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.getHighSpeedVideoFpsRanges = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink
    public final okio.Timeout timeout() {
        return this.getHighResolutionOutputSizeshNQ4ISI.timeout();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeflaterSink(");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }
}
