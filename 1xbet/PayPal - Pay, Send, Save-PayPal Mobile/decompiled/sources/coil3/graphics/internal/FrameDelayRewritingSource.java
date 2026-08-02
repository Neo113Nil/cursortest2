package coil3.graphics.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcoil3/gif/internal/FrameDelayRewritingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "<init>", "(Lokio/Source;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(J)Z", "Camera2StreamConfigurationMap", "Lokio/Buffer;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FrameDelayRewritingSource extends okio.ForwardingSource {
    private static final coil3.gif.internal.FrameDelayRewritingSource.Companion Companion = new coil3.gif.internal.FrameDelayRewritingSource.Companion(null);
    private static final okio.ByteString getHighSpeedVideoFpsRanges = okio.ByteString.INSTANCE.decodeHex("0021F904");
    private final okio.Buffer Camera2StreamConfigurationMap;

    public FrameDelayRewritingSource(okio.Source source) {
        super(source);
        this.Camera2StreamConfigurationMap = new okio.Buffer();
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(okio.Buffer sink, long byteCount) {
        long j;
        getHighResolutionOutputSizeshNQ4ISI(byteCount);
        long j2 = -1;
        if (this.Camera2StreamConfigurationMap.size() == 0) {
            return byteCount == 0 ? 0L : -1L;
        }
        long j3 = 0;
        while (true) {
            okio.ByteString byteString = getHighSpeedVideoFpsRanges;
            long j4 = j2;
            while (true) {
                j4 = this.Camera2StreamConfigurationMap.indexOf(byteString.getByte(0), j4 + 1);
                if (j4 == j2 || (getHighResolutionOutputSizeshNQ4ISI(byteString.size()) && this.Camera2StreamConfigurationMap.rangeEquals(j4, byteString))) {
                    break;
                }
                j2 = -1;
            }
            if (j4 == j2) {
                break;
            }
            j3 += kotlin.ranges.RangesKt.coerceAtLeast(this.Camera2StreamConfigurationMap.read(sink, j4 + 4), 0L);
            if (getHighResolutionOutputSizeshNQ4ISI(5L) && this.Camera2StreamConfigurationMap.getByte(4L) == 0) {
                if (((kotlin.UByte.m23446constructorimpl(this.Camera2StreamConfigurationMap.getByte(1L)) & 255) | ((kotlin.UByte.m23446constructorimpl(this.Camera2StreamConfigurationMap.getByte(2L)) & 255) << 8)) < 2) {
                    sink.writeByte((int) this.Camera2StreamConfigurationMap.getByte(0L));
                    sink.writeByte(10);
                    sink.writeByte(0);
                    this.Camera2StreamConfigurationMap.skip(3L);
                }
            }
            j2 = -1;
        }
        if (j3 < byteCount) {
            j = 0;
            j3 += kotlin.ranges.RangesKt.coerceAtLeast(this.Camera2StreamConfigurationMap.read(sink, byteCount - j3), 0L);
        } else {
            j = 0;
        }
        if (j3 == j) {
            return -1L;
        }
        return j3;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(long p0) {
        if (this.Camera2StreamConfigurationMap.size() >= p0) {
            return true;
        }
        long size = p0 - this.Camera2StreamConfigurationMap.size();
        return super.read(this.Camera2StreamConfigurationMap, size) == size;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcoil3/gif/internal/FrameDelayRewritingSource$Companion;", "", "<init>", "()V", "Lokio/ByteString;", "getHighSpeedVideoFpsRanges", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
