package okio;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 "}, d2 = {"Lokio/PeekSource;", "Lokio/Source;", "Lokio/BufferedSource;", "upstream", "<init>", "(Lokio/BufferedSource;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "close", "()V", "getOutputMinFrameDuration", "Lokio/BufferedSource;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lokio/Buffer;", "Camera2StreamConfigurationMap", "Lokio/Segment;", "getHighSpeedVideoFpsRanges", "Lokio/Segment;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "", "Z", "J", "getOutputFormats"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PeekSource implements okio.Source {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private okio.Segment getHighSpeedVideoSizes;
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.Buffer Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI;

    public PeekSource(okio.BufferedSource bufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bufferedSource;
        okio.Buffer buffer = bufferedSource.getBuffer();
        this.Camera2StreamConfigurationMap = buffer;
        this.getHighSpeedVideoSizes = buffer.head;
        okio.Segment segment = buffer.head;
        this.getHighSpeedVideoFpsRangesFor = segment != null ? segment.pos : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        if (this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        okio.Segment segment = this.getHighSpeedVideoSizes;
        if (segment != null) {
            if (segment == this.Camera2StreamConfigurationMap.head) {
                int i = this.getHighSpeedVideoFpsRangesFor;
                okio.Segment segment2 = this.Camera2StreamConfigurationMap.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            }
            throw new java.lang.IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.request(this.getOutputFormats + 1)) {
            return -1L;
        }
        if (this.getHighSpeedVideoSizes == null && this.Camera2StreamConfigurationMap.head != null) {
            this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap.head;
            okio.Segment segment3 = this.Camera2StreamConfigurationMap.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
            this.getHighSpeedVideoFpsRangesFor = segment3.pos;
        }
        long min = java.lang.Math.min(byteCount, this.Camera2StreamConfigurationMap.size() - this.getOutputFormats);
        this.Camera2StreamConfigurationMap.copyTo(sink, this.getOutputFormats, min);
        this.getOutputFormats += min;
        return min;
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final okio.Timeout getGetHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoFpsRanges();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges = true;
    }
}
