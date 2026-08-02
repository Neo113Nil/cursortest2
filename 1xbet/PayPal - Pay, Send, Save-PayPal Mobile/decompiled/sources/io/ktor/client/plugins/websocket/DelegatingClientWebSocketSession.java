package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096A¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096A¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010&\u001a\u00020!8\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010,\u001a\u00020'8\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0-8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lio/ktor/client/plugins/websocket/DelegatingClientWebSocketSession;", "Lio/ktor/client/plugins/websocket/ClientWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/client/call/HttpClientCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "session", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/websocket/WebSocketSession;)V", "", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/websocket/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "send", "(Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "()V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "", "getMasking", "()Z", "setMasking", "(Z)V", "masking", "", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DelegatingClientWebSocketSession implements io.ktor.client.plugins.websocket.ClientWebSocketSession, io.ktor.websocket.WebSocketSession {
    private final io.ktor.client.call.HttpClientCall call;
    private final /* synthetic */ io.ktor.websocket.WebSocketSession getHighResolutionOutputSizeshNQ4ISI;

    public DelegatingClientWebSocketSession(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.websocket.WebSocketSession webSocketSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketSession, "");
        this.getHighResolutionOutputSizeshNQ4ISI = webSocketSession;
        this.call = httpClientCall;
    }

    @Override // io.ktor.client.plugins.websocket.ClientWebSocketSession
    public final io.ktor.client.call.HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public final void terminate() {
        this.getHighResolutionOutputSizeshNQ4ISI.terminate();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI.setMaxFrameSize(j);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setMasking(z);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.send(frame, continuation);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> getOutgoing() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOutgoing();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final long getMaxFrameSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final boolean getMasking() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> getIncoming() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIncoming();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getExtensions();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCoroutineContext();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.flush(continuation);
    }
}
