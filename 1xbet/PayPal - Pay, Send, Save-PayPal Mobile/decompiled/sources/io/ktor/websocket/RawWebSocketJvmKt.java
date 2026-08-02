package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "maxFrameSize", "", "masking", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/websocket/WebSocketSession;", "RawWebSocket", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;)Lio/ktor/websocket/WebSocketSession;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RawWebSocketJvmKt {
    public static /* synthetic */ io.ktor.websocket.WebSocketSession RawWebSocket$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = androidx.collection.SieveCacheKt.NodeLinkMask;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = false;
        }
        return RawWebSocket(byteReadChannel, byteWriteChannel, j2, z, coroutineContext);
    }

    public static final io.ktor.websocket.WebSocketSession RawWebSocket(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return new io.ktor.websocket.RawWebSocketJvm(byteReadChannel, byteWriteChannel, j, z, coroutineContext, null, 32, null);
    }
}
