package okio.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010"}, d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "truncate", "<init>", "(Lokio/Source;JZ)V", "Lokio/Buffer;", "sink", "byteCount", "read", "(Lokio/Buffer;J)J", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRangesFor", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FixedLengthSource extends okio.ForwardingSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(okio.Source source, long j, boolean z) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        long j = this.getHighSpeedVideoFpsRanges;
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        if (j > j2) {
            byteCount = 0;
        } else if (this.Camera2StreamConfigurationMap) {
            long j3 = j2 - j;
            if (j3 == 0) {
                return -1L;
            }
            byteCount = java.lang.Math.min(byteCount, j3);
        }
        long read = super.read(sink, byteCount);
        if (read != -1) {
            this.getHighSpeedVideoFpsRanges += read;
        }
        long j4 = this.getHighSpeedVideoFpsRanges;
        long j5 = this.getHighSpeedVideoFpsRangesFor;
        if ((j4 >= j5 || read != -1) && j4 <= j5) {
            return read;
        }
        if (read > 0 && j4 > j5) {
            long size = sink.size() - (this.getHighSpeedVideoFpsRanges - this.getHighSpeedVideoFpsRangesFor);
            okio.Buffer buffer = new okio.Buffer();
            buffer.writeAll(sink);
            sink.write(buffer, size);
            buffer.clear();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("expected ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(" bytes but got ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.IOException(sb.toString());
    }
}
