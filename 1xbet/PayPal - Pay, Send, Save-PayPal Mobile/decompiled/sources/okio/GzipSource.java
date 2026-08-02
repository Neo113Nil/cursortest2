package okio;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0014\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u001e\u001a\u00060!j\u0002`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u001a\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0018\u0010\u0014\u001a\u00060&j\u0002`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010("}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "source", "<init>", "(Lokio/Source;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "close", "()V", "p0", "p1", "p2", "Camera2StreamConfigurationMap", "(Lokio/Buffer;JJ)V", "", "", "(Ljava/lang/String;II)V", "", "getHighSpeedVideoSizes", "B", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/RealBufferedSource;", "getHighSpeedVideoFpsRangesFor", "Lokio/RealBufferedSource;", "getHighSpeedVideoFpsRanges", "Ljava/util/zip/Inflater;", "Lokio/getHighSpeedVideoSizesFor;", "Ljava/util/zip/Inflater;", "Lokio/InflaterSource;", "Lokio/InflaterSource;", "Ljava/util/zip/CRC32;", "Lokio/internal/getHighSpeedVideoFpsRanges;", "Ljava/util/zip/CRC32;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GzipSource implements okio.Source {
    private final java.util.zip.CRC32 Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.InflaterSource getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.zip.Inflater getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okio.RealBufferedSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private byte getHighResolutionOutputSizeshNQ4ISI;

    public GzipSource(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        okio.RealBufferedSource realBufferedSource = new okio.RealBufferedSource(source);
        this.getHighSpeedVideoFpsRanges = realBufferedSource;
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.getHighSpeedVideoFpsRangesFor = inflater;
        this.getHighSpeedVideoSizes = new okio.InflaterSource((okio.BufferedSource) realBufferedSource, inflater);
        this.Camera2StreamConfigurationMap = new java.util.zip.CRC32();
    }

    @Override // okio.Source
    public final long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            this.getHighSpeedVideoFpsRanges.require(10L);
            byte b = this.getHighSpeedVideoFpsRanges.bufferField.getByte(3L);
            boolean z = ((b >> 1) & 1) == 1;
            if (z) {
                Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.bufferField, 0L, 10L);
            }
            Camera2StreamConfigurationMap("ID1ID2", 8075, this.getHighSpeedVideoFpsRanges.readShort());
            this.getHighSpeedVideoFpsRanges.skip(8L);
            if (((b >> 2) & 1) == 1) {
                this.getHighSpeedVideoFpsRanges.require(2L);
                if (z) {
                    Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.bufferField, 0L, 2L);
                }
                long readShortLe = this.getHighSpeedVideoFpsRanges.bufferField.readShortLe() & kotlin.UShort.MAX_VALUE;
                this.getHighSpeedVideoFpsRanges.require(readShortLe);
                if (z) {
                    j = readShortLe;
                    Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.bufferField, 0L, readShortLe);
                } else {
                    j = readShortLe;
                }
                this.getHighSpeedVideoFpsRanges.skip(j);
            }
            if (((b >> 3) & 1) == 1) {
                long indexOf = this.getHighSpeedVideoFpsRanges.indexOf((byte) 0);
                if (indexOf == -1) {
                    throw new java.io.EOFException();
                }
                if (z) {
                    Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.bufferField, 0L, indexOf + 1);
                }
                this.getHighSpeedVideoFpsRanges.skip(indexOf + 1);
            }
            if (((b >> 4) & 1) == 1) {
                long indexOf2 = this.getHighSpeedVideoFpsRanges.indexOf((byte) 0);
                if (indexOf2 == -1) {
                    throw new java.io.EOFException();
                }
                if (z) {
                    Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.bufferField, 0L, indexOf2 + 1);
                }
                this.getHighSpeedVideoFpsRanges.skip(indexOf2 + 1);
            }
            if (z) {
                Camera2StreamConfigurationMap("FHCRC", this.getHighSpeedVideoFpsRanges.readShortLe(), (short) this.Camera2StreamConfigurationMap.getValue());
                this.Camera2StreamConfigurationMap.reset();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) 1;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == 1) {
            long size = sink.size();
            long read = this.getHighSpeedVideoSizes.read(sink, byteCount);
            if (read != -1) {
                Camera2StreamConfigurationMap(sink, size, read);
                return read;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) 2;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == 2) {
            Camera2StreamConfigurationMap("CRC", this.getHighSpeedVideoFpsRanges.readIntLe(), (int) this.Camera2StreamConfigurationMap.getValue());
            Camera2StreamConfigurationMap("ISIZE", this.getHighSpeedVideoFpsRanges.readIntLe(), (int) this.getHighSpeedVideoFpsRangesFor.getBytesWritten());
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) 3;
            if (!this.getHighSpeedVideoFpsRanges.exhausted()) {
                throw new java.io.IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.Source
    public final okio.Timeout timeout() {
        return this.getHighSpeedVideoFpsRanges.timeout();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getHighSpeedVideoSizes.close();
    }

    private final void Camera2StreamConfigurationMap(okio.Buffer p0, long p1, long p2) {
        okio.Segment segment = p0.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        while (p1 >= segment.limit - segment.pos) {
            p1 -= segment.limit - segment.pos;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        }
        while (p2 > 0) {
            int min = (int) java.lang.Math.min(segment.limit - r6, p2);
            this.Camera2StreamConfigurationMap.update(segment.data, (int) (segment.pos + p1), min);
            p2 -= min;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            p1 = 0;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String p0, int p1, int p2) {
        if (p2 == p1) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0);
        sb.append(": actual 0x");
        sb.append(kotlin.text.StringsKt.padStart(okio.SegmentedByteString.toHexString(p2), 8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        sb.append(" != expected 0x");
        sb.append(kotlin.text.StringsKt.padStart(okio.SegmentedByteString.toHexString(p1), 8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        throw new java.io.IOException(sb.toString());
    }
}
