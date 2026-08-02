package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u000b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Lio/ktor/websocket/WebSocketSession;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/websocket/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "send", "(Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "()V", "", "getMasking", "()Z", "setMasking", "(Z)V", "masking", "", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebSocketSession extends kotlinx.coroutines.CoroutineScope {
    java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions();

    kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> getIncoming();

    boolean getMasking();

    long getMaxFrameSize();

    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> getOutgoing();

    java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void setMasking(boolean z);

    void setMaxFrameSize(long j);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    void terminate();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.Object send(io.ktor.websocket.WebSocketSession webSocketSession, io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object send = webSocketSession.getOutgoing().send(frame, continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }
    }
}
