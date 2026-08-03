package io.ktor.network.sockets;

/* compiled from: CIOWriter.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteChannel;", "channel", "Ljava/nio/channels/WritableByteChannel;", "nioChannel", "Lio/ktor/network/selector/Selectable;", "selectable", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/utils/io/ReaderJob;", "attachForWritingDirectImpl", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/WritableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/ReaderJob;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CIOWriterKt {
    public static /* synthetic */ io.ktor.utils.io.ReaderJob attachForWritingDirectImpl$default(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel byteChannel, java.nio.channels.WritableByteChannel writableByteChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForWritingDirectImpl(coroutineScope, byteChannel, writableByteChannel, selectable, selectorManager, tCPClientSocketOptions);
    }

    public static final io.ktor.utils.io.ReaderJob attachForWritingDirectImpl(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel channel, java.nio.channels.WritableByteChannel nioChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selector, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nioChannel, "nioChannel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectable, "selectable");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return io.ktor.utils.io.ByteReadChannelOperationsKt.reader(coroutineScope, kotlinx.coroutines.Dispatchers.getIO().plus(new kotlinx.coroutines.CoroutineName("cio-to-nio-writer")), channel, new io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1(selectable, tCPClientSocketOptions, channel, selector, nioChannel, null));
    }
}
