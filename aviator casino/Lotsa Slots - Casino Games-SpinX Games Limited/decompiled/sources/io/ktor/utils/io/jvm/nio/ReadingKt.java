package io.ktor.utils.io.jvm.nio;

/* compiled from: Reading.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/nio/channels/ReadableByteChannel;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/RawSource;", "asSource", "(Ljava/nio/channels/ReadableByteChannel;)Lkotlinx/io/RawSource;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReadingKt {
    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel toByteReadChannel$default(java.nio.channels.ReadableByteChannel readableByteChannel, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getIO();
        }
        return toByteReadChannel(readableByteChannel, coroutineContext);
    }

    public static final io.ktor.utils.io.ByteReadChannel toByteReadChannel(java.nio.channels.ReadableByteChannel readableByteChannel, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new io.ktor.utils.io.jvm.javaio.RawSourceChannel(asSource(readableByteChannel), context);
    }

    public static final kotlinx.io.RawSource asSource(java.nio.channels.ReadableByteChannel readableByteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        return new io.ktor.utils.io.jvm.nio.ReadableByteChannelSource(readableByteChannel);
    }
}
