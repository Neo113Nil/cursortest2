package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003"}, d2 = {"Lkotlinx/io/DiscardingSink;", "Lkotlinx/io/RawSink;", "<init>", "()V", "Lkotlinx/io/Buffer;", "p0", "", "p1", "", "write", "(Lkotlinx/io/Buffer;J)V", "flush", "close"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DiscardingSink implements kotlinx.io.RawSink {
    @Override // kotlinx.io.RawSink, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // kotlinx.io.RawSink, java.io.Flushable
    public final void flush() {
    }

    @Override // kotlinx.io.RawSink
    public final void write(kotlinx.io.Buffer p0, long p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.skip(p1);
    }
}
