package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d"}, d2 = {"Lkotlinx/io/PeekSource;", "Lkotlinx/io/RawSource;", "Lkotlinx/io/Source;", "upstream", "<init>", "(Lkotlinx/io/Source;)V", "Lkotlinx/io/Buffer;", "sink", "", "byteCount", "readAtMostTo", "(Lkotlinx/io/Buffer;J)J", "", "close", "()V", "getHighSpeedVideoSizesFor", "Lkotlinx/io/Source;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/io/Buffer;", "getHighSpeedVideoSizes", "Lkotlinx/io/Segment;", "Camera2StreamConfigurationMap", "Lkotlinx/io/Segment;", "getHighResolutionOutputSizeshNQ4ISI", "", com.visa.cbp.getEncExpo.warmup, "", "Z", "J", "getOutputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PeekSource implements kotlinx.io.RawSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.io.Segment getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.io.Buffer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.io.Source getHighSpeedVideoFpsRanges;

    public PeekSource(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        this.getHighSpeedVideoFpsRanges = source;
        kotlinx.io.Buffer getHighSpeedVideoFpsRanges = source.getGetHighSpeedVideoFpsRanges();
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges.getHead();
        kotlinx.io.Segment head = getHighSpeedVideoFpsRanges.getHead();
        this.getHighSpeedVideoFpsRangesFor = head != null ? head.getPos() : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r3 == r4.getPos()) goto L15;
     */
    @Override // kotlinx.io.RawSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long readAtMostTo(kotlinx.io.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("Source is closed.".toString());
        }
        if (byteCount >= 0) {
            kotlinx.io.Segment segment = this.getHighResolutionOutputSizeshNQ4ISI;
            if (segment != null) {
                if (segment == this.getHighSpeedVideoSizes.getHead()) {
                    int i = this.getHighSpeedVideoFpsRangesFor;
                    kotlinx.io.Segment head = this.getHighSpeedVideoSizes.getHead();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(head);
                }
                throw new java.lang.IllegalStateException("Peek source is invalid because upstream source was used".toString());
            }
            if (byteCount == 0) {
                return 0L;
            }
            if (!this.getHighSpeedVideoFpsRanges.request(this.getOutputFormats + 1)) {
                return -1L;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null && this.getHighSpeedVideoSizes.getHead() != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHead();
                kotlinx.io.Segment head2 = this.getHighSpeedVideoSizes.getHead();
                kotlin.jvm.internal.Intrinsics.checkNotNull(head2);
                this.getHighSpeedVideoFpsRangesFor = head2.getPos();
            }
            long min = java.lang.Math.min(byteCount, this.getHighSpeedVideoSizes.getSizeMut() - this.getOutputFormats);
            kotlinx.io.Buffer buffer = this.getHighSpeedVideoSizes;
            long j = this.getOutputFormats;
            buffer.copyTo(sink, j, j + min);
            this.getOutputFormats += min;
            return min;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("byteCount (");
        sb.append(byteCount);
        sb.append(") < 0");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap = true;
    }
}
