package okhttp3.internal.cache;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "", "onException", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "Lokio/Buffer;", "source", "", "byteCount", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", "", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FaultHidingSink extends okio.ForwardingSink {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<java.io.IOException, kotlin.Unit> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(okio.Sink sink, kotlin.jvm.functions.Function1<? super java.io.IOException, kotlin.Unit> function1) {
        super(sink);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onException = function1;
    }

    public final kotlin.jvm.functions.Function1<java.io.IOException, kotlin.Unit> getOnException() {
        return this.onException;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(okio.Buffer source, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (java.io.IOException e) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.onException.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        try {
            super.flush();
        } catch (java.io.IOException e) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.onException.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (java.io.IOException e) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.onException.invoke(e);
        }
    }
}
