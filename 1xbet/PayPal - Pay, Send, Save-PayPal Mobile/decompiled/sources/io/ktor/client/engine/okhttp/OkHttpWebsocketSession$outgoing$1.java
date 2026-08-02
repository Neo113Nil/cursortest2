package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ActorScope;", "Lio/ktor/websocket/Frame;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1", f = "OkHttpWebsocketSession.kt", i = {0, 1, 1}, l = {64, 68}, m = "invokeSuspend", n = {"$this$actor", "websocket", "closeReason"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class OkHttpWebsocketSession$outgoing$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ActorScope<io.ktor.websocket.Frame>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.engine.okhttp.OkHttpWebsocketSession Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ okhttp3.Request getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0095 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #4 {all -> 0x001f, blocks: (B:7:0x001a, B:8:0x008d, B:10:0x0095, B:13:0x009f, B:14:0x007a, B:21:0x00b7, B:24:0x00ca, B:27:0x00da, B:35:0x00ed, B:36:0x00f2), top: B:6:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0089 -> B:8:0x008d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ActorScope actorScope;
        okhttp3.WebSocket.Factory factory;
        okhttp3.Request request;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        okhttp3.WebSocket.Factory factory2;
        okhttp3.WebSocket newWebSocket;
        io.ktor.websocket.CloseReason closeReason;
        okhttp3.WebSocket webSocket;
        io.ktor.websocket.CloseReason closeReason2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                actorScope = (kotlinx.coroutines.channels.ActorScope) this.getInputSizeshNQ4ISI;
                factory = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                request = this.getHighSpeedVideoFpsRangesFor;
                completableDeferred = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                this.getInputSizeshNQ4ISI = actorScope;
                this.getHighResolutionOutputSizeshNQ4ISI = factory;
                this.getHighSpeedVideoFpsRanges = request;
                this.getHighSpeedVideoSizes = 1;
                java.lang.Object await = completableDeferred.await(this);
                if (await != coroutine_suspended) {
                    factory2 = factory;
                    obj = await;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                request = (okhttp3.Request) this.getHighSpeedVideoFpsRanges;
                factory2 = (okhttp3.WebSocket.Factory) this.getHighResolutionOutputSizeshNQ4ISI;
                actorScope = (kotlinx.coroutines.channels.ActorScope) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
                closeReason2 = (io.ktor.websocket.CloseReason) this.getHighResolutionOutputSizeshNQ4ISI;
                webSocket = (okhttp3.WebSocket) this.getInputSizeshNQ4ISI;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        io.ktor.websocket.Frame frame = (io.ktor.websocket.Frame) channelIterator.next();
                        if (frame instanceof io.ktor.websocket.Frame.Binary) {
                            webSocket.send(okio.ByteString.INSTANCE.of(frame.getData(), 0, frame.getData().length));
                        } else {
                            if (!(frame instanceof io.ktor.websocket.Frame.Text)) {
                                if (!(frame instanceof io.ktor.websocket.Frame.Close)) {
                                    throw new io.ktor.client.engine.okhttp.UnsupportedFrameTypeException(frame);
                                }
                                io.ktor.websocket.CloseReason readReason = io.ktor.websocket.FrameCommonKt.readReason((io.ktor.websocket.Frame.Close) frame);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(readReason);
                                if (!io.ktor.client.engine.okhttp.OkHttpWebsocketSessionKt.access$isReserved(readReason)) {
                                    closeReason2 = readReason;
                                }
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                try {
                                    webSocket.close(closeReason2.getCode(), closeReason2.getMessage());
                                    return unit;
                                } finally {
                                }
                            }
                            webSocket.send(new java.lang.String(frame.getData(), kotlin.text.Charsets.UTF_8));
                        }
                        this.getInputSizeshNQ4ISI = webSocket;
                        this.getHighResolutionOutputSizeshNQ4ISI = closeReason2;
                        this.getHighSpeedVideoFpsRanges = channelIterator;
                        this.getHighSpeedVideoSizes = 2;
                        obj = channelIterator.hasNext(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            try {
                                webSocket.close(closeReason2.getCode(), closeReason2.getMessage());
                                return kotlin.Unit.INSTANCE;
                            } finally {
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    closeReason = closeReason2;
                    newWebSocket = webSocket;
                    try {
                        webSocket.close(closeReason.getCode(), closeReason.getMessage());
                        throw th;
                    } finally {
                    }
                }
            }
            kotlinx.coroutines.channels.ChannelIterator it = actorScope.getChannel().iterator();
            webSocket = newWebSocket;
            closeReason2 = closeReason;
            channelIterator = it;
            this.getInputSizeshNQ4ISI = webSocket;
            this.getHighResolutionOutputSizeshNQ4ISI = closeReason2;
            this.getHighSpeedVideoFpsRanges = channelIterator;
            this.getHighSpeedVideoSizes = 2;
            obj = channelIterator.hasNext(this);
            if (obj == coroutine_suspended) {
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            webSocket.close(closeReason.getCode(), closeReason.getMessage());
            throw th;
        }
        newWebSocket = factory2.newWebSocket(request, (okhttp3.WebSocketListener) obj);
        closeReason = io.ktor.client.engine.okhttp.OkHttpWebsocketSessionKt.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ActorScope<io.ktor.websocket.Frame> actorScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1) create(actorScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1 okHttpWebsocketSession$outgoing$1 = new io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        okHttpWebsocketSession$outgoing$1.getInputSizeshNQ4ISI = obj;
        return okHttpWebsocketSession$outgoing$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpWebsocketSession$outgoing$1(io.ktor.client.engine.okhttp.OkHttpWebsocketSession okHttpWebsocketSession, okhttp3.Request request, kotlin.coroutines.Continuation<? super io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = okHttpWebsocketSession;
        this.getHighSpeedVideoFpsRangesFor = request;
    }
}
