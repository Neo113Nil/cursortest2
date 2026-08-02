package okio;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003"}, d2 = {"Lokio/BlackholeSink;", "Lokio/Sink;", "<init>", "()V", "Lokio/Buffer;", "p0", "", "p1", "", "write", "(Lokio/Buffer;J)V", "flush", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "close"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
final class BlackholeSink implements okio.Sink {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.Sink
    public final void write(okio.Buffer p0, long p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.skip(p1);
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final okio.Timeout getGetHighSpeedVideoSizes() {
        return okio.Timeout.NONE;
    }
}
