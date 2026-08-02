package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {397, 199, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 205, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 238, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
/* loaded from: classes3.dex */
final class DefaultWebSocketSessionImpl$runIncomingProcessor$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl getOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0521, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close(r31.getOutputSizeshNQ4ISI, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, (java.lang.String) r3), r31) == r2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0488, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close(r31.getOutputSizeshNQ4ISI, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, (java.lang.String) r3), r31) == r2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x041f, code lost:
    
        if (r0 == r2) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0238, code lost:
    
        if (r3 != r2) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0425: MOVE (r7 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:163:0x0423 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0424: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:163:0x0423 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d4 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #3 {all -> 0x0127, blocks: (B:13:0x0045, B:14:0x03bc, B:20:0x017a, B:22:0x0182, B:24:0x0192, B:27:0x01b2, B:29:0x01bc, B:31:0x01ca, B:32:0x01ce, B:36:0x01ed, B:50:0x0248, B:52:0x024e, B:55:0x0269, B:58:0x0271, B:61:0x028c, B:62:0x0290, B:126:0x03d4, B:140:0x006a, B:145:0x00bb, B:148:0x00e0, B:153:0x00fc, B:155:0x0121), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0182 A[Catch: all -> 0x0127, TryCatch #3 {all -> 0x0127, blocks: (B:13:0x0045, B:14:0x03bc, B:20:0x017a, B:22:0x0182, B:24:0x0192, B:27:0x01b2, B:29:0x01bc, B:31:0x01ca, B:32:0x01ce, B:36:0x01ed, B:50:0x0248, B:52:0x024e, B:55:0x0269, B:58:0x0271, B:61:0x028c, B:62:0x0290, B:126:0x03d4, B:140:0x006a, B:145:0x00bb, B:148:0x00e0, B:153:0x00fc, B:155:0x0121), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c1 A[Catch: all -> 0x0098, TryCatch #4 {all -> 0x0098, blocks: (B:65:0x02bb, B:67:0x02c1, B:69:0x02c5, B:70:0x02c7, B:72:0x02cb, B:73:0x02d1, B:75:0x02ea, B:77:0x02ee, B:83:0x0333, B:143:0x0093), top: B:142:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ea A[Catch: all -> 0x0098, TryCatch #4 {all -> 0x0098, blocks: (B:65:0x02bb, B:67:0x02c1, B:69:0x02c5, B:70:0x02c7, B:72:0x02cb, B:73:0x02d1, B:75:0x02ea, B:77:0x02ee, B:83:0x0333, B:143:0x0093), top: B:142:0x0093 }] */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v51, types: [T, io.ktor.websocket.Frame] */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v31, types: [T, kotlinx.io.Sink] */
    /* JADX WARN: Type inference failed for: r4v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v13, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v15, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x024c -> B:15:0x03be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x03b4 -> B:14:0x03bc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Throwable th;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        kotlinx.io.Sink sink;
        kotlinx.coroutines.channels.Channel channel3;
        kotlinx.io.Sink sink2;
        kotlinx.coroutines.channels.Channel channel4;
        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        io.ktor.websocket.WebSocketSession webSocketSession;
        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> incoming;
        io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> it;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator;
        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel2;
        io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        java.lang.Object obj2;
        ?? r7;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator2;
        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel3;
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel2;
        io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl3;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef7;
        kotlinx.coroutines.CoroutineScope coroutineScope3;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator3;
        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel4;
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel3;
        io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl4;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef8;
        kotlin.jvm.internal.Ref.ObjectRef objectRef9;
        kotlinx.coroutines.CoroutineScope coroutineScope4;
        ?? r0;
        kotlinx.coroutines.channels.Channel channel5;
        kotlinx.coroutines.channels.Channel channel6;
        kotlinx.io.Sink sink3;
        kotlinx.coroutines.channels.Channel channel7;
        kotlinx.coroutines.channels.Channel channel8;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r3 = "Connection was closed without close frame";
        int i = 1;
        ?? r4 = 1;
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        r5 = 0;
        try {
            try {
            } catch (java.lang.Throwable th2) {
                th = th2;
                booleanRef = booleanRef2;
                objectRef = objectRef2;
            }
        } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused) {
            booleanRef = booleanRef3;
            objectRef = objectRef4;
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, r5, 1, r5);
            sink2 = (kotlinx.io.Sink) objectRef.element;
            if (sink2 != null) {
                sink2.close();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            channel4 = this.getOutputSizeshNQ4ISI.getInputFormats;
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel4, r5, 1, r5);
            if (!booleanRef.element) {
                this.getOutputStallDurationlomOqCM = r5;
                this.getHighSpeedVideoSizes = r5;
                this.Camera2StreamConfigurationMap = r5;
                this.getHighSpeedVideoFpsRanges = r5;
                this.getHighResolutionOutputSizeshNQ4ISI = r5;
                this.getInputFormats = r5;
                this.getOutputMinFrameDuration = r5;
                this.getInputSizeshNQ4ISI = r5;
                this.getOutputFormats = r5;
                this.getHighSpeedVideoSizesFor = 10;
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th3) {
            th = th3;
            booleanRef = booleanRef3;
            objectRef = objectRef4;
            try {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, r5, 1, r5);
                channel2 = this.getOutputSizeshNQ4ISI.getInputFormats;
                channel2.close(th);
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, r5, 1, r5);
                sink = (kotlinx.io.Sink) objectRef.element;
                if (sink != null) {
                    sink.close();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                channel3 = this.getOutputSizeshNQ4ISI.getInputFormats;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel3, r5, 1, r5);
                if (!booleanRef.element) {
                    this.getOutputStallDurationlomOqCM = r5;
                    this.getHighSpeedVideoSizes = r5;
                    this.Camera2StreamConfigurationMap = r5;
                    this.getHighSpeedVideoFpsRanges = r5;
                    this.getHighResolutionOutputSizeshNQ4ISI = r5;
                    this.getInputFormats = r5;
                    this.getOutputMinFrameDuration = r5;
                    this.getInputSizeshNQ4ISI = r5;
                    this.getOutputFormats = r5;
                    this.getHighSpeedVideoSizesFor = 11;
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th4) {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, r5, 1, r5);
                kotlinx.io.Sink sink4 = (kotlinx.io.Sink) objectRef.element;
                if (sink4 != null) {
                    sink4.close();
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
                channel = this.getOutputSizeshNQ4ISI.getInputFormats;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, r5, 1, r5);
                if (booleanRef.element) {
                    throw th4;
                }
                this.getOutputStallDurationlomOqCM = th4;
                this.getHighSpeedVideoSizes = r5;
                this.Camera2StreamConfigurationMap = r5;
                this.getHighSpeedVideoFpsRanges = r5;
                this.getHighResolutionOutputSizeshNQ4ISI = r5;
                this.getInputFormats = r5;
                this.getOutputMinFrameDuration = r5;
                this.getInputSizeshNQ4ISI = r5;
                this.getOutputFormats = r5;
                this.getHighSpeedVideoSizesFor = 12;
                if (io.ktor.websocket.WebSocketSessionKt.close(this.getOutputSizeshNQ4ISI, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, (java.lang.String) r3), this) != coroutine_suspended) {
                    throw th4;
                }
            }
        }
        switch (this.getHighSpeedVideoSizesFor) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
                objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                try {
                    webSocketSession = this.getOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                    incoming = webSocketSession.getIncoming();
                    defaultWebSocketSessionImpl = this.getOutputSizeshNQ4ISI;
                    sendChannel = this.getHighSpeedVideoFpsRangesFor;
                    try {
                        it = incoming.iterator();
                        this.getOutputStallDurationlomOqCM = coroutineScope;
                        this.getHighSpeedVideoSizes = objectRef3;
                        this.Camera2StreamConfigurationMap = objectRef;
                        this.getHighSpeedVideoFpsRanges = booleanRef;
                        this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
                        this.getInputFormats = sendChannel;
                        this.getOutputMinFrameDuration = incoming;
                        this.getInputSizeshNQ4ISI = it;
                        this.getOutputFormats = null;
                        this.getHighSpeedVideoSizesFor = i;
                        obj2 = it.hasNext(this);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        receiveChannel = incoming;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th6) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                            throw th6;
                        }
                    }
                } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused2) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, r5, 1, r5);
                    sink2 = (kotlinx.io.Sink) objectRef.element;
                    if (sink2 != null) {
                    }
                    channel4 = this.getOutputSizeshNQ4ISI.getInputFormats;
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel4, r5, 1, r5);
                    if (!booleanRef.element) {
                    }
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, r5, 1, r5);
                    channel2 = this.getOutputSizeshNQ4ISI.getInputFormats;
                    channel2.close(th);
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, r5, 1, r5);
                    sink = (kotlinx.io.Sink) objectRef.element;
                    if (sink != null) {
                    }
                    channel3 = this.getOutputSizeshNQ4ISI.getInputFormats;
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel3, r5, 1, r5);
                    if (!booleanRef.element) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (obj2 != coroutine_suspended) {
                    kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator4 = it;
                    coroutineScope2 = coroutineScope;
                    channelIterator = channelIterator4;
                    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel4 = sendChannel;
                    objectRef5 = objectRef3;
                    receiveChannel2 = incoming;
                    booleanRef3 = booleanRef;
                    defaultWebSocketSessionImpl2 = defaultWebSocketSessionImpl;
                    objectRef4 = objectRef;
                    r7 = sendChannel4;
                    if (((java.lang.Boolean) obj2).booleanValue()) {
                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
                        kotlinx.io.Sink sink5 = (kotlinx.io.Sink) objectRef4.element;
                        if (sink5 != null) {
                            sink5.close();
                            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                        }
                        channel8 = this.getOutputSizeshNQ4ISI.getInputFormats;
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel8, null, 1, null);
                        if (!booleanRef3.element) {
                            io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl5 = this.getOutputSizeshNQ4ISI;
                            io.ktor.websocket.CloseReason closeReason = new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                            io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1 = this;
                            this.getOutputStallDurationlomOqCM = null;
                            this.getHighSpeedVideoSizes = null;
                            this.Camera2StreamConfigurationMap = null;
                            this.getHighSpeedVideoFpsRanges = null;
                            this.getHighResolutionOutputSizeshNQ4ISI = null;
                            this.getInputFormats = null;
                            this.getOutputMinFrameDuration = null;
                            this.getInputSizeshNQ4ISI = null;
                            r5 = 9;
                            this.getHighSpeedVideoSizesFor = 9;
                            java.lang.Object close = io.ktor.websocket.WebSocketSessionKt.close(defaultWebSocketSessionImpl5, closeReason, defaultWebSocketSessionImpl$runIncomingProcessor$1);
                            r3 = defaultWebSocketSessionImpl$runIncomingProcessor$1;
                            break;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    io.ktor.websocket.Frame next = channelIterator.next();
                    org.slf4j.Logger logger = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER();
                    if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("WebSocketSession(");
                        sb.append(coroutineScope2);
                        sb.append(") receiving frame ");
                        sb.append(next);
                        logger.trace(sb.toString());
                    }
                    if (next instanceof io.ktor.websocket.Frame.Close) {
                        if (!defaultWebSocketSessionImpl2.getOutgoing().isClosedForSend()) {
                            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> outgoing = defaultWebSocketSessionImpl2.getOutgoing();
                            io.ktor.websocket.CloseReason readReason = io.ktor.websocket.FrameCommonKt.readReason((io.ktor.websocket.Frame.Close) next);
                            if (readReason == null) {
                                readReason = io.ktor.websocket.DefaultWebSocketSessionKt.Camera2StreamConfigurationMap;
                            }
                            io.ktor.websocket.Frame.Close close2 = new io.ktor.websocket.Frame.Close(readReason);
                            this.getOutputStallDurationlomOqCM = objectRef4;
                            this.getHighSpeedVideoSizes = booleanRef3;
                            this.Camera2StreamConfigurationMap = receiveChannel2;
                            this.getHighSpeedVideoFpsRanges = null;
                            this.getHighResolutionOutputSizeshNQ4ISI = null;
                            this.getInputFormats = null;
                            this.getOutputMinFrameDuration = null;
                            this.getInputSizeshNQ4ISI = null;
                            this.getHighSpeedVideoSizesFor = 2;
                            if (outgoing.send(close2, this) == coroutine_suspended) {
                            }
                        }
                        r4 = 1;
                        booleanRef3.element = r4;
                        kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, null, r4, null);
                        sink3 = (kotlinx.io.Sink) objectRef4.element;
                        if (sink3 != null) {
                            sink3.close();
                            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        }
                        channel7 = this.getOutputSizeshNQ4ISI.getInputFormats;
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel7, null, r4, null);
                        if (!booleanRef3.element) {
                            this.getOutputStallDurationlomOqCM = unit6;
                            this.getHighSpeedVideoSizes = null;
                            this.Camera2StreamConfigurationMap = null;
                            this.getHighSpeedVideoFpsRanges = null;
                            this.getHighResolutionOutputSizeshNQ4ISI = null;
                            this.getInputFormats = null;
                            this.getOutputMinFrameDuration = null;
                            this.getInputSizeshNQ4ISI = null;
                            r5 = 3;
                            this.getHighSpeedVideoSizesFor = 3;
                            java.lang.Object close3 = io.ktor.websocket.WebSocketSessionKt.close(this.getOutputSizeshNQ4ISI, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this);
                            r3 = close3;
                            break;
                        }
                        return unit6;
                    }
                    if (next instanceof io.ktor.websocket.Frame.Pong) {
                        kotlinx.coroutines.channels.SendChannel sendChannel5 = (kotlinx.coroutines.channels.SendChannel) defaultWebSocketSessionImpl2.pinger;
                        if (sendChannel5 != null) {
                            this.getOutputStallDurationlomOqCM = coroutineScope2;
                            this.getHighSpeedVideoSizes = objectRef5;
                            this.Camera2StreamConfigurationMap = objectRef4;
                            this.getHighSpeedVideoFpsRanges = booleanRef3;
                            this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl2;
                            this.getInputFormats = r7;
                            this.getOutputMinFrameDuration = receiveChannel2;
                            this.getInputSizeshNQ4ISI = channelIterator;
                            this.getHighSpeedVideoSizesFor = 4;
                            if (sendChannel5.send(next, this) != coroutine_suspended) {
                                kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                            }
                        }
                    } else if (next instanceof io.ktor.websocket.Frame.Ping) {
                        this.getOutputStallDurationlomOqCM = coroutineScope2;
                        this.getHighSpeedVideoSizes = objectRef5;
                        this.Camera2StreamConfigurationMap = objectRef4;
                        this.getHighSpeedVideoFpsRanges = booleanRef3;
                        this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl2;
                        this.getInputFormats = r7;
                        this.getOutputMinFrameDuration = receiveChannel2;
                        this.getInputSizeshNQ4ISI = channelIterator;
                        this.getHighSpeedVideoSizesFor = 5;
                        if (r7.send(next, this) != coroutine_suspended) {
                            kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                        }
                    } else {
                        kotlinx.io.Sink sink6 = (kotlinx.io.Sink) objectRef4.element;
                        this.getOutputStallDurationlomOqCM = coroutineScope2;
                        this.getHighSpeedVideoSizes = objectRef5;
                        this.Camera2StreamConfigurationMap = objectRef4;
                        this.getHighSpeedVideoFpsRanges = booleanRef3;
                        this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl2;
                        this.getInputFormats = r7;
                        this.getOutputMinFrameDuration = receiveChannel2;
                        this.getInputSizeshNQ4ISI = channelIterator;
                        this.getOutputFormats = next;
                        this.getHighSpeedVideoSizesFor = 6;
                        if (io.ktor.websocket.DefaultWebSocketSessionImpl.access$checkMaxFrameSize(defaultWebSocketSessionImpl2, sink6, next, this) != coroutine_suspended) {
                            kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel5 = receiveChannel2;
                            channelIterator2 = channelIterator;
                            r0 = next;
                            coroutineScope3 = coroutineScope2;
                            objectRef7 = objectRef5;
                            objectRef6 = objectRef4;
                            booleanRef4 = booleanRef3;
                            defaultWebSocketSessionImpl3 = defaultWebSocketSessionImpl2;
                            sendChannel2 = r7;
                            receiveChannel3 = receiveChannel5;
                            if (!r0.getFin()) {
                                if (objectRef7.element == null) {
                                    objectRef7.element = r0;
                                }
                                if (objectRef6.element == null) {
                                    objectRef6.element = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();
                                }
                                java.lang.Object obj3 = objectRef6.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                                io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default((kotlinx.io.Sink) obj3, r0.getData(), 0, 0, 6, null);
                                coroutineScope = coroutineScope3;
                                kotlin.jvm.internal.Ref.ObjectRef objectRef10 = objectRef7;
                                it = channelIterator2;
                                objectRef3 = objectRef10;
                                io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl6 = defaultWebSocketSessionImpl3;
                                incoming = receiveChannel3;
                                objectRef = objectRef6;
                                sendChannel = sendChannel2;
                                booleanRef = booleanRef4;
                                defaultWebSocketSessionImpl = defaultWebSocketSessionImpl6;
                                i = 1;
                                this.getOutputStallDurationlomOqCM = coroutineScope;
                                this.getHighSpeedVideoSizes = objectRef3;
                                this.Camera2StreamConfigurationMap = objectRef;
                                this.getHighSpeedVideoFpsRanges = booleanRef;
                                this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
                                this.getInputFormats = sendChannel;
                                this.getOutputMinFrameDuration = incoming;
                                this.getInputSizeshNQ4ISI = it;
                                this.getOutputFormats = null;
                                this.getHighSpeedVideoSizesFor = i;
                                obj2 = it.hasNext(this);
                                if (obj2 != coroutine_suspended) {
                                }
                            } else if (objectRef7.element == null) {
                                channel6 = defaultWebSocketSessionImpl3.getInputFormats;
                                io.ktor.websocket.Frame access$processIncomingExtensions = io.ktor.websocket.DefaultWebSocketSessionImpl.access$processIncomingExtensions(defaultWebSocketSessionImpl3, r0);
                                this.getOutputStallDurationlomOqCM = coroutineScope3;
                                this.getHighSpeedVideoSizes = objectRef7;
                                this.Camera2StreamConfigurationMap = objectRef6;
                                this.getHighSpeedVideoFpsRanges = booleanRef4;
                                this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl3;
                                this.getInputFormats = sendChannel2;
                                this.getOutputMinFrameDuration = receiveChannel3;
                                this.getInputSizeshNQ4ISI = channelIterator2;
                                this.getOutputFormats = null;
                                this.getHighSpeedVideoSizesFor = 7;
                                if (channel6.send(access$processIncomingExtensions, this) != coroutine_suspended) {
                                    channelIterator3 = channelIterator2;
                                    receiveChannel4 = receiveChannel3;
                                    sendChannel3 = sendChannel2;
                                    defaultWebSocketSessionImpl4 = defaultWebSocketSessionImpl3;
                                    booleanRef5 = booleanRef4;
                                    objectRef8 = objectRef6;
                                    objectRef9 = objectRef7;
                                    coroutineScope4 = coroutineScope3;
                                    kotlinx.coroutines.CoroutineScope coroutineScope5 = coroutineScope4;
                                    kotlin.jvm.internal.Ref.ObjectRef objectRef11 = objectRef9;
                                    kotlin.jvm.internal.Ref.ObjectRef objectRef12 = objectRef8;
                                    kotlin.jvm.internal.Ref.BooleanRef booleanRef6 = booleanRef5;
                                    io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl7 = defaultWebSocketSessionImpl4;
                                    kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel6 = sendChannel3;
                                    kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel6 = receiveChannel4;
                                    kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator5 = channelIterator3;
                                    coroutineScope = coroutineScope5;
                                    it = channelIterator5;
                                    objectRef3 = objectRef11;
                                    incoming = receiveChannel6;
                                    objectRef = objectRef12;
                                    sendChannel = sendChannel6;
                                    booleanRef = booleanRef6;
                                    defaultWebSocketSessionImpl = defaultWebSocketSessionImpl7;
                                    i = 1;
                                    this.getOutputStallDurationlomOqCM = coroutineScope;
                                    this.getHighSpeedVideoSizes = objectRef3;
                                    this.Camera2StreamConfigurationMap = objectRef;
                                    this.getHighSpeedVideoFpsRanges = booleanRef;
                                    this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
                                    this.getInputFormats = sendChannel;
                                    this.getOutputMinFrameDuration = incoming;
                                    this.getInputSizeshNQ4ISI = it;
                                    this.getOutputFormats = null;
                                    this.getHighSpeedVideoSizesFor = i;
                                    obj2 = it.hasNext(this);
                                    if (obj2 != coroutine_suspended) {
                                    }
                                }
                            } else {
                                java.lang.Object obj4 = objectRef6.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj4);
                                io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default((kotlinx.io.Sink) obj4, r0.getData(), 0, 0, 6, null);
                                io.ktor.websocket.Frame.Companion companion = io.ktor.websocket.Frame.INSTANCE;
                                java.lang.Object obj5 = objectRef7.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj5);
                                io.ktor.websocket.FrameType frameType = ((io.ktor.websocket.Frame) obj5).getFrameType();
                                java.lang.Object obj6 = objectRef6.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj6);
                                byte[] readByteArray = kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build((kotlinx.io.Sink) obj6));
                                java.lang.Object obj7 = objectRef7.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj7);
                                boolean rsv1 = ((io.ktor.websocket.Frame) obj7).getRsv1();
                                java.lang.Object obj8 = objectRef7.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj8);
                                boolean rsv2 = ((io.ktor.websocket.Frame) obj8).getRsv2();
                                java.lang.Object obj9 = objectRef7.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj9);
                                io.ktor.websocket.Frame byType = companion.byType(true, frameType, readByteArray, rsv1, rsv2, ((io.ktor.websocket.Frame) obj9).getRsv3());
                                objectRef7.element = null;
                                channel5 = defaultWebSocketSessionImpl3.getInputFormats;
                                io.ktor.websocket.Frame access$processIncomingExtensions2 = io.ktor.websocket.DefaultWebSocketSessionImpl.access$processIncomingExtensions(defaultWebSocketSessionImpl3, byType);
                                this.getOutputStallDurationlomOqCM = coroutineScope3;
                                this.getHighSpeedVideoSizes = objectRef7;
                                this.Camera2StreamConfigurationMap = objectRef6;
                                this.getHighSpeedVideoFpsRanges = booleanRef4;
                                this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl3;
                                this.getInputFormats = sendChannel2;
                                this.getOutputMinFrameDuration = receiveChannel3;
                                this.getInputSizeshNQ4ISI = channelIterator2;
                                this.getOutputFormats = null;
                                this.getHighSpeedVideoSizesFor = 8;
                                if (channel5.send(access$processIncomingExtensions2, this) != coroutine_suspended) {
                                    channelIterator = channelIterator2;
                                    receiveChannel2 = receiveChannel3;
                                    r7 = sendChannel2;
                                    defaultWebSocketSessionImpl2 = defaultWebSocketSessionImpl3;
                                    booleanRef3 = booleanRef4;
                                    objectRef4 = objectRef6;
                                    objectRef5 = objectRef7;
                                    coroutineScope2 = coroutineScope3;
                                    kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    kotlinx.coroutines.CoroutineScope coroutineScope6 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope6;
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef7 = booleanRef3;
                    incoming = receiveChannel2;
                    objectRef3 = objectRef5;
                    sendChannel = r7;
                    objectRef = objectRef4;
                    defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                    booleanRef = booleanRef7;
                    i = 1;
                    this.getOutputStallDurationlomOqCM = coroutineScope;
                    this.getHighSpeedVideoSizes = objectRef3;
                    this.Camera2StreamConfigurationMap = objectRef;
                    this.getHighSpeedVideoFpsRanges = booleanRef;
                    this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
                    this.getInputFormats = sendChannel;
                    this.getOutputMinFrameDuration = incoming;
                    this.getInputSizeshNQ4ISI = it;
                    this.getOutputFormats = null;
                    this.getHighSpeedVideoSizesFor = i;
                    obj2 = it.hasNext(this);
                    if (obj2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            case 1:
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getInputSizeshNQ4ISI;
                receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getOutputMinFrameDuration;
                kotlinx.coroutines.channels.SendChannel sendChannel7 = (kotlinx.coroutines.channels.SendChannel) this.getInputFormats;
                defaultWebSocketSessionImpl2 = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.getHighResolutionOutputSizeshNQ4ISI;
                booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
                objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                r7 = sendChannel7;
                if (((java.lang.Boolean) obj2).booleanValue()) {
                }
                break;
            case 2:
                receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.Camera2StreamConfigurationMap;
                booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoSizes;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                booleanRef3.element = r4;
                kotlin.Unit unit62 = kotlin.Unit.INSTANCE;
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, null, r4, null);
                sink3 = (kotlinx.io.Sink) objectRef4.element;
                if (sink3 != null) {
                }
                channel7 = this.getOutputSizeshNQ4ISI.getInputFormats;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel7, null, r4, null);
                if (!booleanRef3.element) {
                }
                return unit62;
            case 3:
                kotlin.Unit unit11 = (kotlin.Unit) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                return unit11;
            case 4:
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getInputSizeshNQ4ISI;
                receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getOutputMinFrameDuration;
                r7 = (kotlinx.coroutines.channels.SendChannel) this.getInputFormats;
                defaultWebSocketSessionImpl2 = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.getHighResolutionOutputSizeshNQ4ISI;
                booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
                objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                kotlinx.coroutines.CoroutineScope coroutineScope62 = coroutineScope2;
                it = channelIterator;
                coroutineScope = coroutineScope62;
                kotlin.jvm.internal.Ref.BooleanRef booleanRef72 = booleanRef3;
                incoming = receiveChannel2;
                objectRef3 = objectRef5;
                sendChannel = r7;
                objectRef = objectRef4;
                defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                booleanRef = booleanRef72;
                i = 1;
                this.getOutputStallDurationlomOqCM = coroutineScope;
                this.getHighSpeedVideoSizes = objectRef3;
                this.Camera2StreamConfigurationMap = objectRef;
                this.getHighSpeedVideoFpsRanges = booleanRef;
                this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
                this.getInputFormats = sendChannel;
                this.getOutputMinFrameDuration = incoming;
                this.getInputSizeshNQ4ISI = it;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = i;
                obj2 = it.hasNext(this);
                if (obj2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getInputSizeshNQ4ISI;
                receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getOutputMinFrameDuration;
                r7 = (kotlinx.coroutines.channels.SendChannel) this.getInputFormats;
                defaultWebSocketSessionImpl2 = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.getHighResolutionOutputSizeshNQ4ISI;
                booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
                objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
                kotlinx.coroutines.CoroutineScope coroutineScope622 = coroutineScope2;
                it = channelIterator;
                coroutineScope = coroutineScope622;
                kotlin.jvm.internal.Ref.BooleanRef booleanRef722 = booleanRef3;
                incoming = receiveChannel2;
                objectRef3 = objectRef5;
                sendChannel = r7;
                objectRef = objectRef4;
                defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                booleanRef = booleanRef722;
                i = 1;
                this.getOutputStallDurationlomOqCM = coroutineScope;
                this.getHighSpeedVideoSizes = objectRef3;
                this.Camera2StreamConfigurationMap = objectRef;
                this.getHighSpeedVideoFpsRanges = booleanRef;
                this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
                this.getInputFormats = sendChannel;
                this.getOutputMinFrameDuration = incoming;
                this.getInputSizeshNQ4ISI = it;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = i;
                obj2 = it.hasNext(this);
                if (obj2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                io.ktor.websocket.Frame frame = (io.ktor.websocket.Frame) this.getOutputFormats;
                channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) this.getInputSizeshNQ4ISI;
                receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) this.getOutputMinFrameDuration;
                sendChannel2 = (kotlinx.coroutines.channels.SendChannel) this.getInputFormats;
                defaultWebSocketSessionImpl3 = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.getHighResolutionOutputSizeshNQ4ISI;
                booleanRef4 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
                objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
                objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    r0 = frame;
                    if (!r0.getFin()) {
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    receiveChannel = receiveChannel3;
                    booleanRef = booleanRef4;
                    objectRef = objectRef6;
                    throw th;
                }
                break;
            case 7:
                channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) this.getInputSizeshNQ4ISI;
                receiveChannel4 = (kotlinx.coroutines.channels.ReceiveChannel) this.getOutputMinFrameDuration;
                sendChannel3 = (kotlinx.coroutines.channels.SendChannel) this.getInputFormats;
                defaultWebSocketSessionImpl4 = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.getHighResolutionOutputSizeshNQ4ISI;
                booleanRef5 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
                objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
                objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope4 = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope52 = coroutineScope4;
                kotlin.jvm.internal.Ref.ObjectRef objectRef112 = objectRef9;
                kotlin.jvm.internal.Ref.ObjectRef objectRef122 = objectRef8;
                kotlin.jvm.internal.Ref.BooleanRef booleanRef62 = booleanRef5;
                io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl72 = defaultWebSocketSessionImpl4;
                kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> sendChannel62 = sendChannel3;
                kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> receiveChannel62 = receiveChannel4;
                kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator52 = channelIterator3;
                coroutineScope = coroutineScope52;
                it = channelIterator52;
                objectRef3 = objectRef112;
                incoming = receiveChannel62;
                objectRef = objectRef122;
                sendChannel = sendChannel62;
                booleanRef = booleanRef62;
                defaultWebSocketSessionImpl = defaultWebSocketSessionImpl72;
                i = 1;
                this.getOutputStallDurationlomOqCM = coroutineScope;
                this.getHighSpeedVideoSizes = objectRef3;
                this.Camera2StreamConfigurationMap = objectRef;
                this.getHighSpeedVideoFpsRanges = booleanRef;
                this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
                this.getInputFormats = sendChannel;
                this.getOutputMinFrameDuration = incoming;
                this.getInputSizeshNQ4ISI = it;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = i;
                obj2 = it.hasNext(this);
                if (obj2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 8:
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getInputSizeshNQ4ISI;
                receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getOutputMinFrameDuration;
                kotlinx.coroutines.channels.SendChannel sendChannel8 = (kotlinx.coroutines.channels.SendChannel) this.getInputFormats;
                defaultWebSocketSessionImpl2 = (io.ktor.websocket.DefaultWebSocketSessionImpl) this.getHighResolutionOutputSizeshNQ4ISI;
                booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
                objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                r7 = sendChannel8;
                kotlin.Unit unit102 = kotlin.Unit.INSTANCE;
                kotlinx.coroutines.CoroutineScope coroutineScope6222 = coroutineScope2;
                it = channelIterator;
                coroutineScope = coroutineScope6222;
                kotlin.jvm.internal.Ref.BooleanRef booleanRef7222 = booleanRef3;
                incoming = receiveChannel2;
                objectRef3 = objectRef5;
                sendChannel = r7;
                objectRef = objectRef4;
                defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                booleanRef = booleanRef7222;
                i = 1;
                this.getOutputStallDurationlomOqCM = coroutineScope;
                this.getHighSpeedVideoSizes = objectRef3;
                this.Camera2StreamConfigurationMap = objectRef;
                this.getHighSpeedVideoFpsRanges = booleanRef;
                this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
                this.getInputFormats = sendChannel;
                this.getOutputMinFrameDuration = incoming;
                this.getInputSizeshNQ4ISI = it;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = i;
                obj2 = it.hasNext(this);
                if (obj2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 9:
            case 10:
            case 11:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 12:
                java.lang.Throwable th9 = (java.lang.Throwable) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th9;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1 = new io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1(this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        defaultWebSocketSessionImpl$runIncomingProcessor$1.getOutputStallDurationlomOqCM = obj;
        return defaultWebSocketSessionImpl$runIncomingProcessor$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultWebSocketSessionImpl$runIncomingProcessor$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame.Ping> sendChannel, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1> continuation) {
        super(2, continuation);
        this.getOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
        this.getHighSpeedVideoFpsRangesFor = sendChannel;
    }
}
