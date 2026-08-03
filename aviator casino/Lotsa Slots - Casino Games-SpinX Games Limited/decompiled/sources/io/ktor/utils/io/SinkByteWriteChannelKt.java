package io.ktor.utils.io;

/* compiled from: SinkByteWriteChannel.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/io/RawSink;", "Lio/ktor/utils/io/ByteWriteChannel;", "asByteWriteChannel", "(Lkotlinx/io/RawSink;)Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SinkByteWriteChannelKt {
    public static final io.ktor.utils.io.ByteWriteChannel asByteWriteChannel(kotlinx.io.RawSink rawSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawSink, "<this>");
        return new io.ktor.utils.io.SinkByteWriteChannel(rawSink);
    }
}
