package io.ktor.utils.io;

import io.ktor.utils.io.core.BytePacketBuilderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.io.Buffer;
import kotlinx.io.RawSink;

/* compiled from: ByteWriteChannelSink.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannelSink;", "Lkotlinx/io/RawSink;", "Lio/ktor/utils/io/ByteWriteChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "Lkotlinx/io/Buffer;", "source", "", "byteCount", "", "write", "(Lkotlinx/io/Buffer;J)V", "flush", "()V", "close", "Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteWriteChannelSink implements RawSink {
    private final ByteWriteChannel origin;

    public ByteWriteChannelSink(ByteWriteChannel origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    @Override // kotlinx.io.RawSink
    public void write(Buffer source, long byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this.origin);
        this.origin.getWriteBuffer().write(source, byteCount);
        ByteWriteChannel byteWriteChannel = this.origin;
        ByteChannel byteChannel = byteWriteChannel instanceof ByteChannel ? (ByteChannel) byteWriteChannel : null;
        if ((byteChannel == null || !byteChannel.getAutoFlush()) && BytePacketBuilderKt.getSize(this.origin.getWriteBuffer()) < 1048576) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new ByteWriteChannelSink$write$1(this, null), 1, null);
    }

    @Override // kotlinx.io.RawSink, java.io.Flushable
    public void flush() {
        BuildersKt__BuildersKt.runBlocking$default(null, new ByteWriteChannelSink$flush$1(this, null), 1, null);
    }

    @Override // kotlinx.io.RawSink, java.lang.AutoCloseable
    public void close() {
        BuildersKt__BuildersKt.runBlocking$default(null, new ByteWriteChannelSink$close$1(this, null), 1, null);
    }
}
