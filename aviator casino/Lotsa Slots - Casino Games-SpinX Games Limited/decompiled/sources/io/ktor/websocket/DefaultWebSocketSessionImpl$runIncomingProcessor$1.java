package io.ktor.websocket;

/* compiled from: DefaultWebSocketSession.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {com.ironsource.InterfaceC3141l1.a.b.f, 207, 260, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 231, 246, 260, 260, 260, 260}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frame", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
/* loaded from: classes6.dex */
final class DefaultWebSocketSessionImpl$runIncomingProcessor$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> $ponger;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    java.lang.Object L$8;
    int label;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultWebSocketSessionImpl$runIncomingProcessor$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame.Ping> sendChannel, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultWebSocketSessionImpl;
        this.$ponger = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1 = new io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1(this.this$0, this.$ponger, continuation);
        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runIncomingProcessor$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x03ca, code lost:
    
        r4 = r11.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default((kotlinx.io.Sink) r4, r0.getData(), 0, 0, 6, null);
        r0 = r13;
        r13 = r5;
        r30 = r12;
        r12 = r6;
        r6 = r30;
        r31 = r11;
        r11 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018c A[Catch: all -> 0x0131, TryCatch #2 {all -> 0x0131, blocks: (B:13:0x0045, B:15:0x03c6, B:22:0x0184, B:24:0x018c, B:26:0x019c, B:27:0x01b8, B:29:0x01bc, B:31:0x01c6, B:33:0x01d4, B:34:0x01d8, B:37:0x01f6, B:49:0x0247, B:51:0x024b, B:53:0x0251, B:56:0x026b, B:57:0x026f, B:59:0x0273, B:62:0x028d, B:63:0x0291, B:98:0x03ce, B:112:0x006b, B:118:0x00c0, B:122:0x00e6, B:128:0x0104, B:131:0x012a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c1 A[Catch: all -> 0x0099, TryCatch #5 {all -> 0x0099, blocks: (B:67:0x02bb, B:69:0x02c1, B:71:0x02c5, B:72:0x02c7, B:74:0x02cb, B:75:0x02d1, B:77:0x02f9, B:79:0x02fd, B:84:0x0338, B:116:0x0094), top: B:115:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f9 A[Catch: all -> 0x0099, TryCatch #5 {all -> 0x0099, blocks: (B:67:0x02bb, B:69:0x02c1, B:71:0x02c5, B:72:0x02c7, B:74:0x02cb, B:75:0x02d1, B:77:0x02f9, B:79:0x02fd, B:84:0x0338, B:116:0x0094), top: B:115:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ce A[Catch: all -> 0x0131, TRY_LEAVE, TryCatch #2 {all -> 0x0131, blocks: (B:13:0x0045, B:15:0x03c6, B:22:0x0184, B:24:0x018c, B:26:0x019c, B:27:0x01b8, B:29:0x01bc, B:31:0x01c6, B:33:0x01d4, B:34:0x01d8, B:37:0x01f6, B:49:0x0247, B:51:0x024b, B:53:0x0251, B:56:0x026b, B:57:0x026f, B:59:0x0273, B:62:0x028d, B:63:0x0291, B:98:0x03ce, B:112:0x006b, B:118:0x00c0, B:122:0x00e6, B:128:0x0104, B:131:0x012a), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, io.ktor.websocket.Frame] */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r4v32, types: [T, kotlinx.io.Sink] */
    /* JADX WARN: Type inference failed for: r7v13, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v9, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x024f -> B:16:0x032b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x03bc -> B:14:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        kotlinx.coroutines.channels.Channel channel3;
        kotlinx.coroutines.channels.Channel channel4;
        io.ktor.websocket.WebSocketSession webSocketSession;
        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> incoming;
        io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> it;
        java.lang.Throwable th2;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator;
        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        java.lang.Object obj2;
        ?? r7;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator2;
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel2;
        io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlinx.coroutines.CoroutineScope coroutineScope3;
        ?? r0;
        kotlinx.coroutines.channels.Channel channel5;
        io.ktor.websocket.Frame processIncomingExtensions;
        kotlinx.coroutines.channels.Channel channel6;
        io.ktor.websocket.Frame processIncomingExtensions2;
        kotlinx.io.Sink sink;
        kotlinx.coroutines.channels.Channel channel7;
        kotlinx.coroutines.channels.Channel channel8;
        java.lang.Object checkMaxFrameSize;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = 1;
        java.lang.Throwable th3 = null;
        try {
            switch (this.label) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                    try {
                        webSocketSession = this.this$0.raw;
                        incoming = webSocketSession.getIncoming();
                        defaultWebSocketSessionImpl = this.this$0;
                        sendChannel = this.$ponger;
                        try {
                            it = incoming.iterator();
                            th2 = null;
                            this.L$0 = coroutineScope;
                            this.L$1 = objectRef;
                            this.L$2 = objectRef2;
                            this.L$3 = booleanRef;
                            this.L$4 = defaultWebSocketSessionImpl;
                            this.L$5 = sendChannel;
                            this.L$6 = incoming;
                            this.L$7 = it;
                            this.L$8 = th3;
                            this.label = i;
                            obj2 = it.hasNext(this);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            receiveChannel = incoming;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th5) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                                throw th5;
                            }
                        }
                    } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused) {
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        kotlinx.io.Sink sink2 = (kotlinx.io.Sink) objectRef2.element;
                        if (sink2 != null) {
                            sink2.close();
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                        channel4 = this.this$0.filtered;
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel4, null, 1, null);
                        if (!booleanRef.element) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.label = 10;
                            if (io.ktor.websocket.WebSocketSessionKt.close(this.this$0, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                            channel2 = this.this$0.filtered;
                            channel2.close(th6);
                            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                            kotlinx.io.Sink sink3 = (kotlinx.io.Sink) objectRef2.element;
                            if (sink3 != null) {
                                sink3.close();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            }
                            channel3 = this.this$0.filtered;
                            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel3, null, 1, null);
                            if (!booleanRef.element) {
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.label = 11;
                                if (io.ktor.websocket.WebSocketSessionKt.close(this.this$0, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } catch (java.lang.Throwable th7) {
                            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                            kotlinx.io.Sink sink4 = (kotlinx.io.Sink) objectRef2.element;
                            if (sink4 != null) {
                                sink4.close();
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            }
                            channel = this.this$0.filtered;
                            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                            if (booleanRef.element) {
                                throw th7;
                            }
                            this.L$0 = th7;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.label = 12;
                            if (io.ktor.websocket.WebSocketSessionKt.close(this.this$0, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw th7;
                        }
                    }
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator3 = it;
                    coroutineScope2 = coroutineScope;
                    channelIterator = channelIterator3;
                    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel3 = sendChannel;
                    objectRef3 = objectRef;
                    receiveChannel2 = incoming;
                    r7 = sendChannel3;
                    if (((java.lang.Boolean) obj2).booleanValue()) {
                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th2);
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        kotlinx.io.Sink sink5 = (kotlinx.io.Sink) objectRef2.element;
                        if (sink5 != null) {
                            sink5.close();
                            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                        }
                        channel8 = this.this$0.filtered;
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel8, null, 1, null);
                        if (!booleanRef.element) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.label = 9;
                            if (io.ktor.websocket.WebSocketSessionKt.close(this.this$0, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    io.ktor.websocket.Frame next = channelIterator.next();
                    org.slf4j.Logger logger = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER();
                    if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                        logger.trace("WebSocketSession(" + coroutineScope2 + ") receiving frame " + next);
                    }
                    if (next instanceof io.ktor.websocket.Frame.Close) {
                        if (!defaultWebSocketSessionImpl.getOutgoing().isClosedForSend()) {
                            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> outgoing = defaultWebSocketSessionImpl.getOutgoing();
                            io.ktor.websocket.CloseReason readReason = io.ktor.websocket.FrameCommonKt.readReason((io.ktor.websocket.Frame.Close) next);
                            if (readReason == null) {
                                readReason = io.ktor.websocket.DefaultWebSocketSessionKt.NORMAL_CLOSE;
                            }
                            io.ktor.websocket.Frame.Close close = new io.ktor.websocket.Frame.Close(readReason);
                            this.L$0 = objectRef2;
                            this.L$1 = booleanRef;
                            this.L$2 = receiveChannel2;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.label = 2;
                            if (outgoing.send(close, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        booleanRef.element = true;
                        kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th2);
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        sink = (kotlinx.io.Sink) objectRef2.element;
                        if (sink != null) {
                            sink.close();
                            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        }
                        channel7 = this.this$0.filtered;
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel7, null, 1, null);
                        if (!booleanRef.element) {
                            return unit6;
                        }
                        this.L$0 = unit6;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.label = 3;
                        return io.ktor.websocket.WebSocketSessionKt.close(this.this$0, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended ? coroutine_suspended : unit6;
                    }
                    if (next instanceof io.ktor.websocket.Frame.Pong) {
                        kotlinx.coroutines.channels.SendChannel sendChannel4 = (kotlinx.coroutines.channels.SendChannel) defaultWebSocketSessionImpl.pinger;
                        if (sendChannel4 != null) {
                            this.L$0 = coroutineScope2;
                            this.L$1 = objectRef3;
                            this.L$2 = objectRef2;
                            this.L$3 = booleanRef;
                            this.L$4 = defaultWebSocketSessionImpl;
                            this.L$5 = r7;
                            this.L$6 = receiveChannel2;
                            this.L$7 = channelIterator;
                            this.label = 4;
                            if (sendChannel4.send(next, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                        }
                    } else if (next instanceof io.ktor.websocket.Frame.Ping) {
                        this.L$0 = coroutineScope2;
                        this.L$1 = objectRef3;
                        this.L$2 = objectRef2;
                        this.L$3 = booleanRef;
                        this.L$4 = defaultWebSocketSessionImpl;
                        this.L$5 = r7;
                        this.L$6 = receiveChannel2;
                        this.L$7 = channelIterator;
                        this.label = 5;
                        if (r7.send(next, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                    } else {
                        kotlinx.io.Sink sink6 = (kotlinx.io.Sink) objectRef2.element;
                        this.L$0 = coroutineScope2;
                        this.L$1 = objectRef3;
                        this.L$2 = objectRef2;
                        this.L$3 = booleanRef;
                        this.L$4 = defaultWebSocketSessionImpl;
                        this.L$5 = r7;
                        this.L$6 = receiveChannel2;
                        this.L$7 = channelIterator;
                        this.L$8 = next;
                        this.label = 6;
                        checkMaxFrameSize = defaultWebSocketSessionImpl.checkMaxFrameSize(sink6, next, this);
                        if (checkMaxFrameSize == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        th3 = th2;
                        coroutineScope3 = coroutineScope2;
                        objectRef5 = objectRef3;
                        objectRef4 = objectRef2;
                        booleanRef2 = booleanRef;
                        defaultWebSocketSessionImpl2 = defaultWebSocketSessionImpl;
                        sendChannel2 = r7;
                        incoming = receiveChannel2;
                        channelIterator2 = channelIterator;
                        r0 = next;
                        if (!r0.getFin()) {
                            if (objectRef5.element == null) {
                                objectRef5.element = r0;
                            }
                            if (objectRef4.element == null) {
                                objectRef4.element = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();
                            }
                            java.lang.Object obj3 = objectRef4.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                            io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default((kotlinx.io.Sink) obj3, r0.getData(), 0, 0, 6, null);
                            coroutineScope = coroutineScope3;
                            th2 = th3;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef6 = objectRef5;
                            it = channelIterator2;
                            objectRef = objectRef6;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef7 = objectRef4;
                            sendChannel = sendChannel2;
                            defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                            booleanRef = booleanRef2;
                            objectRef2 = objectRef7;
                            i = 1;
                            th3 = null;
                            this.L$0 = coroutineScope;
                            this.L$1 = objectRef;
                            this.L$2 = objectRef2;
                            this.L$3 = booleanRef;
                            this.L$4 = defaultWebSocketSessionImpl;
                            this.L$5 = sendChannel;
                            this.L$6 = incoming;
                            this.L$7 = it;
                            this.L$8 = th3;
                            this.label = i;
                            obj2 = it.hasNext(this);
                            if (obj2 == coroutine_suspended) {
                            }
                        } else if (objectRef5.element == null) {
                            channel6 = defaultWebSocketSessionImpl2.filtered;
                            processIncomingExtensions2 = defaultWebSocketSessionImpl2.processIncomingExtensions(r0);
                            this.L$0 = coroutineScope3;
                            this.L$1 = objectRef5;
                            this.L$2 = objectRef4;
                            this.L$3 = booleanRef2;
                            this.L$4 = defaultWebSocketSessionImpl2;
                            this.L$5 = sendChannel2;
                            this.L$6 = incoming;
                            this.L$7 = channelIterator2;
                            this.L$8 = null;
                            this.label = 7;
                            if (channel6.send(processIncomingExtensions2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelIterator = channelIterator2;
                            receiveChannel2 = incoming;
                            r7 = sendChannel2;
                            defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                            booleanRef = booleanRef2;
                            objectRef2 = objectRef4;
                            objectRef3 = objectRef5;
                            coroutineScope2 = coroutineScope3;
                            th2 = th3;
                        } else {
                            java.lang.Object obj4 = objectRef4.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4);
                            io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default((kotlinx.io.Sink) obj4, r0.getData(), 0, 0, 6, null);
                            io.ktor.websocket.Frame.Companion companion = io.ktor.websocket.Frame.INSTANCE;
                            java.lang.Object obj5 = objectRef5.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj5);
                            io.ktor.websocket.FrameType frameType = ((io.ktor.websocket.Frame) obj5).getFrameType();
                            java.lang.Object obj6 = objectRef4.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj6);
                            byte[] readByteArray = kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build((kotlinx.io.Sink) obj6));
                            java.lang.Object obj7 = objectRef5.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj7);
                            boolean rsv1 = ((io.ktor.websocket.Frame) obj7).getRsv1();
                            java.lang.Object obj8 = objectRef5.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj8);
                            boolean rsv2 = ((io.ktor.websocket.Frame) obj8).getRsv2();
                            java.lang.Object obj9 = objectRef5.element;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj9);
                            io.ktor.websocket.Frame byType = companion.byType(true, frameType, readByteArray, rsv1, rsv2, ((io.ktor.websocket.Frame) obj9).getRsv3());
                            objectRef5.element = null;
                            channel5 = defaultWebSocketSessionImpl2.filtered;
                            processIncomingExtensions = defaultWebSocketSessionImpl2.processIncomingExtensions(byType);
                            this.L$0 = coroutineScope3;
                            this.L$1 = objectRef5;
                            this.L$2 = objectRef4;
                            this.L$3 = booleanRef2;
                            this.L$4 = defaultWebSocketSessionImpl2;
                            this.L$5 = sendChannel2;
                            this.L$6 = incoming;
                            this.L$7 = channelIterator2;
                            this.L$8 = null;
                            this.label = 8;
                            if (channel5.send(processIncomingExtensions, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelIterator = channelIterator2;
                            receiveChannel2 = incoming;
                            r7 = sendChannel2;
                            defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                            booleanRef = booleanRef2;
                            objectRef2 = objectRef4;
                            objectRef3 = objectRef5;
                            coroutineScope2 = coroutineScope3;
                            th2 = th3;
                            kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                        }
                    }
                    kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope4;
                    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel5 = r7;
                    incoming = receiveChannel2;
                    objectRef = objectRef3;
                    sendChannel = sendChannel5;
                    i = 1;
                    th3 = null;
                    this.L$0 = coroutineScope;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef2;
                    this.L$3 = booleanRef;
                    this.L$4 = defaultWebSocketSessionImpl;
                    this.L$5 = sendChannel;
                    this.L$6 = incoming;
                    this.L$7 = it;
                    this.L$8 = th3;
                    this.label = i;
                    obj2 = it.hasNext(this);
                    if (obj2 == coroutine_suspended) {
                    }
                    break;
                case 1:
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$7;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$6;
                    kotlinx.coroutines.channels.SendChannel sendChannel6 = (kotlinx.coroutines.channels.SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$3;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    th2 = null;
                    r7 = sendChannel6;
                    if (((java.lang.Boolean) obj2).booleanValue()) {
                    }
                    break;
                case 2:
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$2;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$1;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    th2 = null;
                    booleanRef.element = true;
                    kotlin.Unit unit62 = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th2);
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                    sink = (kotlinx.io.Sink) objectRef2.element;
                    if (sink != null) {
                    }
                    channel7 = this.this$0.filtered;
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel7, null, 1, null);
                    if (!booleanRef.element) {
                    }
                    break;
                case 3:
                    kotlin.Unit unit11 = (kotlin.Unit) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return unit11;
                case 4:
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$7;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$6;
                    r7 = (kotlinx.coroutines.channels.SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$3;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    th2 = null;
                    kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.CoroutineScope coroutineScope42 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope42;
                    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel52 = r7;
                    incoming = receiveChannel2;
                    objectRef = objectRef3;
                    sendChannel = sendChannel52;
                    i = 1;
                    th3 = null;
                    this.L$0 = coroutineScope;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef2;
                    this.L$3 = booleanRef;
                    this.L$4 = defaultWebSocketSessionImpl;
                    this.L$5 = sendChannel;
                    this.L$6 = incoming;
                    this.L$7 = it;
                    this.L$8 = th3;
                    this.label = i;
                    obj2 = it.hasNext(this);
                    if (obj2 == coroutine_suspended) {
                    }
                    break;
                case 5:
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$7;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$6;
                    r7 = (kotlinx.coroutines.channels.SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$3;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    th2 = null;
                    kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.CoroutineScope coroutineScope422 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope422;
                    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel522 = r7;
                    incoming = receiveChannel2;
                    objectRef = objectRef3;
                    sendChannel = sendChannel522;
                    i = 1;
                    th3 = null;
                    this.L$0 = coroutineScope;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef2;
                    this.L$3 = booleanRef;
                    this.L$4 = defaultWebSocketSessionImpl;
                    this.L$5 = sendChannel;
                    this.L$6 = incoming;
                    this.L$7 = it;
                    this.L$8 = th3;
                    this.label = i;
                    obj2 = it.hasNext(this);
                    if (obj2 == coroutine_suspended) {
                    }
                    break;
                case 6:
                    io.ktor.websocket.Frame frame = (io.ktor.websocket.Frame) this.L$8;
                    channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) this.L$7;
                    incoming = (kotlinx.coroutines.channels.ReceiveChannel) this.L$6;
                    sendChannel2 = (kotlinx.coroutines.channels.SendChannel) this.L$5;
                    defaultWebSocketSessionImpl2 = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) this.L$3;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                    objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        r0 = frame;
                        if (!r0.getFin()) {
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        receiveChannel = incoming;
                        throw th;
                    }
                    break;
                case 7:
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$7;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$6;
                    r7 = (kotlinx.coroutines.channels.SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$3;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    th2 = null;
                    kotlinx.coroutines.CoroutineScope coroutineScope4222 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope4222;
                    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel5222 = r7;
                    incoming = receiveChannel2;
                    objectRef = objectRef3;
                    sendChannel = sendChannel5222;
                    i = 1;
                    th3 = null;
                    this.L$0 = coroutineScope;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef2;
                    this.L$3 = booleanRef;
                    this.L$4 = defaultWebSocketSessionImpl;
                    this.L$5 = sendChannel;
                    this.L$6 = incoming;
                    this.L$7 = it;
                    this.L$8 = th3;
                    this.label = i;
                    obj2 = it.hasNext(this);
                    if (obj2 == coroutine_suspended) {
                    }
                    break;
                case 8:
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$7;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$6;
                    kotlinx.coroutines.channels.SendChannel sendChannel7 = (kotlinx.coroutines.channels.SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$3;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r7 = sendChannel7;
                    th2 = th3;
                    kotlin.Unit unit102 = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.CoroutineScope coroutineScope42222 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope42222;
                    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel52222 = r7;
                    incoming = receiveChannel2;
                    objectRef = objectRef3;
                    sendChannel = sendChannel52222;
                    i = 1;
                    th3 = null;
                    this.L$0 = coroutineScope;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef2;
                    this.L$3 = booleanRef;
                    this.L$4 = defaultWebSocketSessionImpl;
                    this.L$5 = sendChannel;
                    this.L$6 = incoming;
                    this.L$7 = it;
                    this.L$8 = th3;
                    this.label = i;
                    obj2 = it.hasNext(this);
                    if (obj2 == coroutine_suspended) {
                    }
                    break;
                case 9:
                case 10:
                case 11:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 12:
                    java.lang.Throwable th9 = (java.lang.Throwable) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw th9;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
        }
    }
}
