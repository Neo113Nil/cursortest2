package okio;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\""}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "Lokio/BufferedSource;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "readOrInflate", "", "refill", "()Z", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "close", "()V", "Camera2StreamConfigurationMap", "Lokio/BufferedSource;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/zip/Inflater;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InflaterSource implements okio.Source {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okio.BufferedSource getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.zip.Inflater getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    public InflaterSource(okio.BufferedSource bufferedSource, java.util.zip.Inflater inflater) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        this.getHighSpeedVideoFpsRangesFor = bufferedSource;
        this.getHighSpeedVideoSizes = inflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(okio.Source source, java.util.zip.Inflater inflater) {
        this(okio.Okio.buffer(source), inflater);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
    }

    @Override // okio.Source
    public final long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        do {
            long readOrInflate = readOrInflate(sink, byteCount);
            if (readOrInflate > 0) {
                return readOrInflate;
            }
            if (this.getHighSpeedVideoSizes.finished() || this.getHighSpeedVideoSizes.needsDictionary()) {
                return -1L;
            }
        } while (!this.getHighSpeedVideoFpsRangesFor.exhausted());
        throw new java.io.EOFException("source exhausted prematurely");
    }

    public final long readOrInflate(okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        if (this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            okio.Segment writableSegment$okio = sink.writableSegment$okio(1);
            int min = (int) java.lang.Math.min(byteCount, 8192 - writableSegment$okio.limit);
            refill();
            int inflate = this.getHighSpeedVideoSizes.inflate(writableSegment$okio.data, writableSegment$okio.limit, min);
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
                int remaining = i - this.getHighSpeedVideoSizes.getRemaining();
                this.getHighResolutionOutputSizeshNQ4ISI -= remaining;
                this.getHighSpeedVideoFpsRangesFor.skip(remaining);
            }
            if (inflate > 0) {
                writableSegment$okio.limit += inflate;
                long j = inflate;
                sink.setSize$okio(sink.size() + j);
                return j;
            }
            if (writableSegment$okio.pos == writableSegment$okio.limit) {
                sink.head = writableSegment$okio.pop();
                okio.SegmentPool.recycle(writableSegment$okio);
            }
            return 0L;
        } catch (java.util.zip.DataFormatException e) {
            throw new java.io.IOException(e);
        }
    }

    public final boolean refill() throws java.io.IOException {
        if (!this.getHighSpeedVideoSizes.needsInput()) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRangesFor.exhausted()) {
            return true;
        }
        okio.Segment segment = this.getHighSpeedVideoFpsRangesFor.getBuffer().head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        this.getHighResolutionOutputSizeshNQ4ISI = segment.limit - segment.pos;
        this.getHighSpeedVideoSizes.setInput(segment.data, segment.pos, this.getHighResolutionOutputSizeshNQ4ISI);
        return false;
    }

    @Override // okio.Source
    public final okio.Timeout timeout() {
        return this.getHighSpeedVideoFpsRangesFor.timeout();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.getHighSpeedVideoSizes.end();
        this.Camera2StreamConfigurationMap = true;
        this.getHighSpeedVideoFpsRangesFor.close();
    }
}
