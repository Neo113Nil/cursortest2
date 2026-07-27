package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.io.Buffer;
import kotlinx.io.RawSource;

/* compiled from: ByteReadChannelSource.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/ByteReadChannelSource;", "Lkotlinx/io/RawSource;", "Lio/ktor/utils/io/ByteReadChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "Lkotlinx/io/Buffer;", "sink", "", "byteCount", "readAtMostTo", "(Lkotlinx/io/Buffer;J)J", "", "close", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteReadChannelSource implements RawSource {
    private final ByteReadChannel origin;

    public ByteReadChannelSource(ByteReadChannel origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(Buffer sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.origin.getReadBuffer().exhausted()) {
            BuildersKt__BuildersKt.runBlocking$default(null, new ByteReadChannelSource$readAtMostTo$1(this, null), 1, null);
        }
        if (this.origin.getReadBuffer().exhausted()) {
            return -1L;
        }
        return this.origin.getReadBuffer().readAtMostTo(sink, byteCount);
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        ByteReadChannelKt.cancel(this.origin);
    }
}
