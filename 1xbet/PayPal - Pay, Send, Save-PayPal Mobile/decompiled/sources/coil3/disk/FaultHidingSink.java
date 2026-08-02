package coil3.disk;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcoil3/disk/FaultHidingSink;", "Lokio/Sink;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/getHighSpeedVideoSizes;", "", "onException", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "Lokio/Buffer;", "source", "", "byteCount", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "getHighSpeedVideoSizes", "Lokio/Sink;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FaultHidingSink implements okio.Sink {
    private final kotlin.jvm.functions.Function1<java.io.IOException, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.Sink Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(okio.Sink sink, kotlin.jvm.functions.Function1<? super java.io.IOException, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = sink;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @Override // okio.Sink
    public final void write(okio.Buffer source, long byteCount) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            source.skip(byteCount);
            return;
        }
        try {
            this.Camera2StreamConfigurationMap.write(source, byteCount);
        } catch (java.io.IOException e) {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(e);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        try {
            this.Camera2StreamConfigurationMap.flush();
        } catch (java.io.IOException e) {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(e);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.Camera2StreamConfigurationMap.close();
        } catch (java.io.IOException e) {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(e);
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final okio.Timeout getGetHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes();
    }
}
