package io.ktor.utils.io;

/* compiled from: ByteReadChannelSource.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/ByteReadChannelSource;", "Lkotlinx/io/RawSource;", "Lio/ktor/utils/io/ByteReadChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "Lkotlinx/io/Buffer;", "sink", "", "byteCount", "readAtMostTo", "(Lkotlinx/io/Buffer;J)J", "", "close", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteReadChannelSource implements kotlinx.io.RawSource {
    private final io.ktor.utils.io.ByteReadChannel origin;

    public ByteReadChannelSource(io.ktor.utils.io.ByteReadChannel origin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(kotlinx.io.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.origin.getReadBuffer().exhausted()) {
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1(this, null), 1, null);
        }
        if (this.origin.getReadBuffer().exhausted()) {
            return -1L;
        }
        return this.origin.getReadBuffer().readAtMostTo(sink, byteCount);
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.io.ByteReadChannelKt.cancel(this.origin);
    }
}
