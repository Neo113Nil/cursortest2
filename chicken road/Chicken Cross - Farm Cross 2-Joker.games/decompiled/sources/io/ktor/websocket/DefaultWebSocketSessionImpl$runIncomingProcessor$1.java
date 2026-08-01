package io.ktor.websocket;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.Frame;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.io.Sink;
import kotlinx.io.SourcesKt;
import org.slf4j.Logger;

/* compiled from: DefaultWebSocketSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {406, 207, 260, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 231, 246, 260, 260, 260, 260}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frame", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
/* loaded from: classes7.dex */
final class DefaultWebSocketSessionImpl$runIncomingProcessor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SendChannel<Frame.Ping> $ponger;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultWebSocketSessionImpl$runIncomingProcessor$1(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, SendChannel<? super Frame.Ping> sendChannel, Continuation<? super DefaultWebSocketSessionImpl$runIncomingProcessor$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultWebSocketSessionImpl;
        this.$ponger = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1 = new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this.this$0, this.$ponger, continuation);
        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runIncomingProcessor$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultWebSocketSessionImpl$runIncomingProcessor$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x03ce, code lost:
    
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x018c A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:13:0x0045, B:15:0x03ca, B:22:0x0184, B:24:0x018c, B:26:0x019c, B:27:0x01bc, B:29:0x01c0, B:31:0x01ca, B:33:0x01d8, B:34:0x01dc, B:37:0x01fa, B:49:0x024b, B:51:0x024f, B:53:0x0255, B:56:0x026f, B:57:0x0273, B:59:0x0277, B:62:0x0291, B:63:0x0295, B:98:0x03d2, B:112:0x006b, B:118:0x00c0, B:122:0x00e6, B:128:0x0104, B:131:0x012a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c5 A[Catch: all -> 0x0099, TryCatch #5 {all -> 0x0099, blocks: (B:67:0x02bf, B:69:0x02c5, B:71:0x02c9, B:72:0x02cb, B:74:0x02cf, B:75:0x02d5, B:77:0x02fd, B:79:0x0301, B:84:0x033c, B:116:0x0094), top: B:115:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fd A[Catch: all -> 0x0099, TryCatch #5 {all -> 0x0099, blocks: (B:67:0x02bf, B:69:0x02c5, B:71:0x02c9, B:72:0x02cb, B:74:0x02cf, B:75:0x02d5, B:77:0x02fd, B:79:0x0301, B:84:0x033c, B:116:0x0094), top: B:115:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d2 A[Catch: all -> 0x0131, TRY_LEAVE, TryCatch #1 {all -> 0x0131, blocks: (B:13:0x0045, B:15:0x03ca, B:22:0x0184, B:24:0x018c, B:26:0x019c, B:27:0x01bc, B:29:0x01c0, B:31:0x01ca, B:33:0x01d8, B:34:0x01dc, B:37:0x01fa, B:49:0x024b, B:51:0x024f, B:53:0x0255, B:56:0x026f, B:57:0x0273, B:59:0x0277, B:62:0x0291, B:63:0x0295, B:98:0x03d2, B:112:0x006b, B:118:0x00c0, B:122:0x00e6, B:128:0x0104, B:131:0x012a), top: B:2:0x000c }] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0253 -> B:16:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x03c0 -> B:14:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        ReceiveChannel<Frame> receiveChannel;
        CoroutineScope coroutineScope;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef;
        Channel channel;
        Channel channel2;
        Channel channel3;
        Channel channel4;
        WebSocketSession webSocketSession;
        ReceiveChannel<Frame> incoming;
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
        SendChannel<Frame.Ping> sendChannel;
        ChannelIterator<Frame> it;
        Throwable th2;
        ChannelIterator<Frame> channelIterator;
        ReceiveChannel<Frame> receiveChannel2;
        Ref.ObjectRef objectRef3;
        CoroutineScope coroutineScope2;
        Object obj2;
        ?? r7;
        ChannelIterator<Frame> channelIterator2;
        SendChannel<Frame.Ping> sendChannel2;
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl2;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        CoroutineScope coroutineScope3;
        ?? r0;
        Channel channel5;
        Frame processIncomingExtensions;
        Channel channel6;
        Frame processIncomingExtensions2;
        Sink sink;
        Channel channel7;
        Channel channel8;
        Object checkMaxFrameSize;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = 1;
        Throwable th3 = null;
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    objectRef = new Ref.ObjectRef();
                    objectRef2 = new Ref.ObjectRef();
                    booleanRef = new Ref.BooleanRef();
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
                        } catch (Throwable th4) {
                            th = th4;
                            receiveChannel = incoming;
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                ChannelsKt.cancelConsumed(receiveChannel, th);
                                throw th5;
                            }
                        }
                    } catch (ClosedSendChannelException unused) {
                        SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        Sink sink2 = (Sink) objectRef2.element;
                        if (sink2 != null) {
                            sink2.close();
                            Unit unit = Unit.INSTANCE;
                        }
                        channel4 = this.this$0.filtered;
                        SendChannel.DefaultImpls.close$default(channel4, null, 1, null);
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
                            if (WebSocketSessionKt.close(this.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                            channel2 = this.this$0.filtered;
                            channel2.close(th6);
                            SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                            Sink sink3 = (Sink) objectRef2.element;
                            if (sink3 != null) {
                                sink3.close();
                                Unit unit2 = Unit.INSTANCE;
                            }
                            channel3 = this.this$0.filtered;
                            SendChannel.DefaultImpls.close$default(channel3, null, 1, null);
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
                                if (WebSocketSessionKt.close(this.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } catch (Throwable th7) {
                            SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                            Sink sink4 = (Sink) objectRef2.element;
                            if (sink4 != null) {
                                sink4.close();
                                Unit unit3 = Unit.INSTANCE;
                            }
                            channel = this.this$0.filtered;
                            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
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
                            if (WebSocketSessionKt.close(this.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw th7;
                        }
                    }
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ChannelIterator<Frame> channelIterator3 = it;
                    coroutineScope2 = coroutineScope;
                    channelIterator = channelIterator3;
                    SendChannel<Frame.Ping> sendChannel3 = sendChannel;
                    objectRef3 = objectRef;
                    receiveChannel2 = incoming;
                    r7 = sendChannel3;
                    if (((Boolean) obj2).booleanValue()) {
                        Unit unit4 = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel2, th2);
                        SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        Sink sink5 = (Sink) objectRef2.element;
                        if (sink5 != null) {
                            sink5.close();
                            Unit unit5 = Unit.INSTANCE;
                        }
                        channel8 = this.this$0.filtered;
                        SendChannel.DefaultImpls.close$default(channel8, null, 1, null);
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
                            if (WebSocketSessionKt.close(this.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    Frame next = channelIterator.next();
                    Logger logger = DefaultWebSocketSessionKt.getLOGGER();
                    if (LoggerJvmKt.isTraceEnabled(logger)) {
                        logger.trace("WebSocketSession(" + coroutineScope2 + ") receiving frame " + next);
                    }
                    if (next instanceof Frame.Close) {
                        if (!defaultWebSocketSessionImpl.getOutgoing().isClosedForSend()) {
                            SendChannel<Frame> outgoing = defaultWebSocketSessionImpl.getOutgoing();
                            CloseReason readReason = FrameCommonKt.readReason((Frame.Close) next);
                            if (readReason == null) {
                                readReason = DefaultWebSocketSessionKt.NORMAL_CLOSE;
                            }
                            Frame.Close close = new Frame.Close(readReason);
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
                        Unit unit6 = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel2, th2);
                        SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        sink = (Sink) objectRef2.element;
                        if (sink != null) {
                            sink.close();
                            Unit unit7 = Unit.INSTANCE;
                        }
                        channel7 = this.this$0.filtered;
                        SendChannel.DefaultImpls.close$default(channel7, null, 1, null);
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
                        return WebSocketSessionKt.close(this.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended ? coroutine_suspended : unit6;
                    }
                    if (next instanceof Frame.Pong) {
                        SendChannel sendChannel4 = (SendChannel) defaultWebSocketSessionImpl.pinger;
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
                            Unit unit8 = Unit.INSTANCE;
                        }
                    } else if (next instanceof Frame.Ping) {
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
                        Unit unit9 = Unit.INSTANCE;
                    } else {
                        Sink sink6 = (Sink) objectRef2.element;
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
                                objectRef4.element = BytePacketBuilderKt.BytePacketBuilder();
                            }
                            Object obj3 = objectRef4.element;
                            Intrinsics.checkNotNull(obj3);
                            BytePacketBuilderKt.writeFully$default((Sink) obj3, r0.getData(), 0, 0, 6, null);
                            coroutineScope = coroutineScope3;
                            th2 = th3;
                            Ref.ObjectRef objectRef6 = objectRef5;
                            it = channelIterator2;
                            objectRef = objectRef6;
                            Ref.ObjectRef objectRef7 = objectRef4;
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
                            Object obj4 = objectRef4.element;
                            Intrinsics.checkNotNull(obj4);
                            BytePacketBuilderKt.writeFully$default((Sink) obj4, r0.getData(), 0, 0, 6, null);
                            Frame.Companion companion = Frame.INSTANCE;
                            Object obj5 = objectRef5.element;
                            Intrinsics.checkNotNull(obj5);
                            FrameType frameType = ((Frame) obj5).getFrameType();
                            Object obj6 = objectRef4.element;
                            Intrinsics.checkNotNull(obj6);
                            byte[] readByteArray = SourcesKt.readByteArray(BytePacketBuilderKt.build((Sink) obj6));
                            Object obj7 = objectRef5.element;
                            Intrinsics.checkNotNull(obj7);
                            boolean rsv1 = ((Frame) obj7).getRsv1();
                            Object obj8 = objectRef5.element;
                            Intrinsics.checkNotNull(obj8);
                            boolean rsv2 = ((Frame) obj8).getRsv2();
                            Object obj9 = objectRef5.element;
                            Intrinsics.checkNotNull(obj9);
                            Frame byType = companion.byType(true, frameType, readByteArray, rsv1, rsv2, ((Frame) obj9).getRsv3());
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
                            Unit unit10 = Unit.INSTANCE;
                        }
                    }
                    CoroutineScope coroutineScope4 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope4;
                    SendChannel<Frame.Ping> sendChannel5 = r7;
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
                    channelIterator = (ChannelIterator) this.L$7;
                    receiveChannel2 = (ReceiveChannel) this.L$6;
                    SendChannel sendChannel6 = (SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (Ref.BooleanRef) this.L$3;
                    objectRef2 = (Ref.ObjectRef) this.L$2;
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    th2 = null;
                    r7 = sendChannel6;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                    break;
                case 2:
                    receiveChannel2 = (ReceiveChannel) this.L$2;
                    booleanRef = (Ref.BooleanRef) this.L$1;
                    objectRef2 = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    th2 = null;
                    booleanRef.element = true;
                    Unit unit62 = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed(receiveChannel2, th2);
                    SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                    sink = (Sink) objectRef2.element;
                    if (sink != null) {
                    }
                    channel7 = this.this$0.filtered;
                    SendChannel.DefaultImpls.close$default(channel7, null, 1, null);
                    if (!booleanRef.element) {
                    }
                    break;
                case 3:
                    Unit unit11 = (Unit) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return unit11;
                case 4:
                    channelIterator = (ChannelIterator) this.L$7;
                    receiveChannel2 = (ReceiveChannel) this.L$6;
                    r7 = (SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (Ref.BooleanRef) this.L$3;
                    objectRef2 = (Ref.ObjectRef) this.L$2;
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    th2 = null;
                    Unit unit12 = Unit.INSTANCE;
                    CoroutineScope coroutineScope42 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope42;
                    SendChannel<Frame.Ping> sendChannel52 = r7;
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
                    channelIterator = (ChannelIterator) this.L$7;
                    receiveChannel2 = (ReceiveChannel) this.L$6;
                    r7 = (SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (Ref.BooleanRef) this.L$3;
                    objectRef2 = (Ref.ObjectRef) this.L$2;
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    th2 = null;
                    Unit unit13 = Unit.INSTANCE;
                    CoroutineScope coroutineScope422 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope422;
                    SendChannel<Frame.Ping> sendChannel522 = r7;
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
                    Frame frame = (Frame) this.L$8;
                    channelIterator2 = (ChannelIterator) this.L$7;
                    incoming = (ReceiveChannel) this.L$6;
                    sendChannel2 = (SendChannel) this.L$5;
                    defaultWebSocketSessionImpl2 = (DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef2 = (Ref.BooleanRef) this.L$3;
                    objectRef4 = (Ref.ObjectRef) this.L$2;
                    objectRef5 = (Ref.ObjectRef) this.L$1;
                    coroutineScope3 = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r0 = frame;
                        if (!r0.getFin()) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        receiveChannel = incoming;
                        throw th;
                    }
                    break;
                case 7:
                    channelIterator = (ChannelIterator) this.L$7;
                    receiveChannel2 = (ReceiveChannel) this.L$6;
                    r7 = (SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (Ref.BooleanRef) this.L$3;
                    objectRef2 = (Ref.ObjectRef) this.L$2;
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    th2 = null;
                    CoroutineScope coroutineScope4222 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope4222;
                    SendChannel<Frame.Ping> sendChannel5222 = r7;
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
                    channelIterator = (ChannelIterator) this.L$7;
                    receiveChannel2 = (ReceiveChannel) this.L$6;
                    SendChannel sendChannel7 = (SendChannel) this.L$5;
                    defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                    booleanRef = (Ref.BooleanRef) this.L$3;
                    objectRef2 = (Ref.ObjectRef) this.L$2;
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r7 = sendChannel7;
                    th2 = th3;
                    Unit unit102 = Unit.INSTANCE;
                    CoroutineScope coroutineScope42222 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope42222;
                    SendChannel<Frame.Ping> sendChannel52222 = r7;
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
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 12:
                    Throwable th9 = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th9;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }
}
