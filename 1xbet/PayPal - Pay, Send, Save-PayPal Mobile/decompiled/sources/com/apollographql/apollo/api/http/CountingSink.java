package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00068\u0007@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/api/http/CountingSink;", "Lokio/Sink;", "p0", "<init>", "(Lokio/Sink;)V", "Lokio/Buffer;", "", "p1", "", "write", "(Lokio/Buffer;J)V", "close", "()V", "flush", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "getHighSpeedVideoFpsRanges", "Lokio/Sink;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "J", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CountingSink implements okio.Sink {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okio.Sink getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    long Camera2StreamConfigurationMap;

    public CountingSink(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sink;
    }

    @Override // okio.Sink
    public final void write(okio.Buffer p0, long p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.write(p0, p1);
        this.Camera2StreamConfigurationMap += p1;
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final okio.Timeout getGetHighSpeedVideoSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizes();
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        this.getHighResolutionOutputSizeshNQ4ISI.flush();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }
}
