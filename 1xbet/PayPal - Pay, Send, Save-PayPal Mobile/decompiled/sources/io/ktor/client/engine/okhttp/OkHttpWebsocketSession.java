package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001b\u0010\u001fJ'\u0010#\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010$J)\u0010(\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b*\u0010+J\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0017¢\u0006\u0004\b-\u0010,R\u0014\u00100\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u0000078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00108R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0015078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b9\u00108\u001a\u0004\b:\u0010;R$\u0010B\u001a\u00020<2\u0006\u0010=\u001a\u00020<8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010E\u001a\u00020<2\u0006\u0010=\u001a\u00020<8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR$\u0010K\u001a\u00020F2\u0006\u0010=\u001a\u00020F8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010N\u001a\u00020<2\u0006\u0010=\u001a\u00020<8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010QR\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u00108R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020P0T8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0X8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR&\u0010]\u001a\b\u0012\u0004\u0012\u00020P0\\8\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010,\u001a\u0004\b_\u0010`R\u001e\u0010d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpWebsocketSession;", "Lio/ktor/websocket/DefaultWebSocketSession;", "Lokhttp3/WebSocketListener;", "Lokhttp3/OkHttpClient;", "engine", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "Lokhttp3/Request;", "engineRequest", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/WebSocket$Factory;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;)V", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Ljava/util/List;)V", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "Lokio/ByteString;", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "onMessage", "(Lokhttp3/WebSocket;Lokio/ByteString;)V", "", "text", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "", "code", "reason", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosing", "", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "()V", "terminate", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/OkHttpClient;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lokhttp3/WebSocket$Factory;", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "originResponse", "getOriginResponse$ktor_client_okhttp", "()Lkotlinx/coroutines/CompletableDeferred;", "", "_", "getPingIntervalMillis", "()J", "setPingIntervalMillis", "(J)V", "pingIntervalMillis", "getTimeoutMillis", "setTimeoutMillis", "timeoutMillis", "", "getMasking", "()Z", "setMasking", "(Z)V", "masking", "getMaxFrameSize", "setMaxFrameSize", "maxFrameSize", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "Lkotlinx/coroutines/channels/Channel;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/websocket/CloseReason;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "Lkotlinx/coroutines/Deferred;", "getCloseReason", "()Lkotlinx/coroutines/Deferred;", "closeReason", "Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing$annotations", "getExtensions", "()Ljava/util/List;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHttpWebsocketSession extends okhttp3.WebSocketListener implements io.ktor.websocket.DefaultWebSocketSession {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okhttp3.WebSocket.Factory getHighSpeedVideoFpsRanges;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableDeferred<io.ktor.websocket.CloseReason> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okhttp3.OkHttpClient getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableDeferred<io.ktor.client.engine.okhttp.OkHttpWebsocketSession> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.CompletableDeferred<okhttp3.Response> originResponse;
    private final kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> outgoing;

    public static /* synthetic */ void getOutgoing$annotations() {
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final boolean getMasking() {
        return true;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final long getMaxFrameSize() {
        return Long.MAX_VALUE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return io.ktor.websocket.DefaultWebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public OkHttpWebsocketSession(okhttp3.OkHttpClient okHttpClient, okhttp3.WebSocket.Factory factory, okhttp3.Request request, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoSizes = okHttpClient;
        this.getHighSpeedVideoFpsRanges = factory;
        this.coroutineContext = coroutineContext;
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.originResponse = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.outgoing = kotlinx.coroutines.channels.ActorKt.actor$default(this, null, 0, null, null, new io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1(this, request, null), 15, null);
    }

    public final kotlinx.coroutines.CompletableDeferred<okhttp3.Response> getOriginResponse$ktor_client_okhttp() {
        return this.originResponse;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final long getPingIntervalMillis() {
        return this.getHighSpeedVideoSizes.pingIntervalMillis();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void setPingIntervalMillis(long j) {
        throw new io.ktor.client.plugins.websocket.WebSocketException("OkHttp doesn't support dynamic ping interval. You could switch it in the engine configuration.");
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final long getTimeoutMillis() {
        return this.getHighSpeedVideoSizes.readTimeoutMillis();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void setTimeoutMillis(long j) {
        throw new io.ktor.client.plugins.websocket.WebSocketException("Websocket timeout should be configured in OkHttp engine.");
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        throw new io.ktor.client.plugins.websocket.WebSocketException("Masking switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        throw new io.ktor.client.plugins.websocket.WebSocketException("Max frame size switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> getIncoming() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final kotlinx.coroutines.Deferred<io.ktor.websocket.CloseReason> getCloseReason() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void start(java.util.List<? extends io.ktor.websocket.WebSocketExtension<?>> negotiatedExtensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(negotiatedExtensions, "");
        if (!negotiatedExtensions.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Extensions are not supported.".toString());
        }
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> getOutgoing() {
        return this.outgoing;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(okhttp3.WebSocket webSocket, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        super.onOpen(webSocket, response);
        this.originResponse.complete(response);
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(okhttp3.WebSocket webSocket, okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        super.onMessage(webSocket, bytes);
        kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(this.getHighResolutionOutputSizeshNQ4ISI, new io.ktor.websocket.Frame.Binary(true, bytes.toByteArray()));
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(okhttp3.WebSocket webSocket, java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        super.onMessage(webSocket, text);
        kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> channel = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bytes = text.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(channel, new io.ktor.websocket.Frame.Text(true, bytes));
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(okhttp3.WebSocket webSocket, int code, java.lang.String reason) {
        java.lang.Object valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        super.onClosed(webSocket, code, reason);
        short s = (short) code;
        this.Camera2StreamConfigurationMap.complete(new io.ktor.websocket.CloseReason(s, reason));
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> outgoing = getOutgoing();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebSocket session closed with code ");
        io.ktor.websocket.CloseReason.Codes byCode = io.ktor.websocket.CloseReason.Codes.INSTANCE.byCode(s);
        if (byCode == null || (valueOf = byCode.toString()) == null) {
            valueOf = java.lang.Integer.valueOf(code);
        }
        sb.append(valueOf);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        outgoing.close(new java.util.concurrent.CancellationException(sb.toString()));
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosing(okhttp3.WebSocket webSocket, int code, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        super.onClosing(webSocket, code, reason);
        short s = (short) code;
        this.Camera2StreamConfigurationMap.complete(new io.ktor.websocket.CloseReason(s, reason));
        try {
            kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(getOutgoing(), new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(s, reason)));
        } catch (java.lang.Throwable unused) {
        }
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(okhttp3.WebSocket webSocket, java.lang.Throwable t, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        super.onFailure(webSocket, t, response);
        java.lang.Integer valueOf = response != null ? java.lang.Integer.valueOf(response.code()) : null;
        int value = io.ktor.http.HttpStatusCode.INSTANCE.getUnauthorized().getValue();
        if (valueOf != null && valueOf.intValue() == value) {
            this.originResponse.complete(response);
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        } else {
            this.originResponse.completeExceptionally(t);
            this.Camera2StreamConfigurationMap.completeExceptionally(t);
            this.getHighResolutionOutputSizeshNQ4ISI.close(t);
            getOutgoing().close(t);
        }
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    public final void start() {
        this.getHighSpeedVideoFpsRangesFor.complete(this);
    }

    @Override // io.ktor.websocket.WebSocketSession
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public final void terminate() {
        kotlinx.coroutines.JobKt__JobKt.cancel$default(getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }
}
