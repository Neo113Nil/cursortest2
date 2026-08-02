package coil3.fetch;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/nio/ByteBuffer;", "Lokio/Source;", "asSource", "(Ljava/nio/ByteBuffer;)Lokio/Source;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteBufferFetcherKt {
    public static final okio.Source asSource(final java.nio.ByteBuffer byteBuffer) {
        return new okio.Source(byteBuffer) { // from class: coil3.fetch.ByteBufferFetcherKt$asSource$1
            private final int getHighResolutionOutputSizeshNQ4ISI;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private final java.nio.ByteBuffer getHighSpeedVideoSizes;

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            {
                java.nio.ByteBuffer slice = byteBuffer.slice();
                this.getHighSpeedVideoSizes = slice;
                this.getHighResolutionOutputSizeshNQ4ISI = slice.capacity();
            }

            @Override // okio.Source
            public final long read(okio.Buffer sink, long byteCount) {
                if (this.getHighSpeedVideoSizes.position() == this.getHighResolutionOutputSizeshNQ4ISI) {
                    return -1L;
                }
                this.getHighSpeedVideoSizes.limit(kotlin.ranges.RangesKt.coerceAtMost((int) (this.getHighSpeedVideoSizes.position() + byteCount), this.getHighResolutionOutputSizeshNQ4ISI));
                return sink.write(this.getHighSpeedVideoSizes);
            }

            @Override // okio.Source
            public final okio.Timeout timeout() {
                return okio.Timeout.NONE;
            }
        };
    }
}
