package io.ktor.utils.io;

/* compiled from: ByteWriteChannelSink.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlinx/io/RawSink;", "asSink", "(Lio/ktor/utils/io/ByteWriteChannel;)Lkotlinx/io/RawSink;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteWriteChannelSinkKt {
    public static final kotlinx.io.RawSink asSink(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        return new io.ktor.utils.io.ByteWriteChannelSink(byteWriteChannel);
    }
}
