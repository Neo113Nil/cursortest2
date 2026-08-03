package io.ktor.websocket;

/* compiled from: PingPong.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", i = {0, 1}, l = {119, 33}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$1", "L$1"})
/* loaded from: classes6.dex */
final class PingPongKt$ponger$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Ping> $channel;
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> $outgoing;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PingPongKt$ponger$1(kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Ping> channel, kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame.Pong> sendChannel, kotlin.coroutines.Continuation<? super io.ktor.websocket.PingPongKt$ponger$1> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$outgoing = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.PingPongKt$ponger$1(this.$channel, this.$outgoing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.PingPongKt$ponger$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x001b, B:10:0x004b, B:15:0x005d, B:17:0x0065, B:21:0x008e, B:29:0x0034, B:33:0x0046), top: B:2:0x0009, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x001b, B:10:0x004b, B:15:0x005d, B:17:0x0065, B:21:0x008e, B:29:0x0034, B:33:0x0046), top: B:2:0x0009, outer: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:10:0x004b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Ping> channel;
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> sendChannel;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Throwable th;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } finally {
            }
        } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused) {
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            channel = this.$channel;
            sendChannel = this.$outgoing;
            it = channel.iterator();
        } else if (i == 1) {
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$2;
            channel = (kotlinx.coroutines.channels.ReceiveChannel) this.L$1;
            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> sendChannel2 = (kotlinx.coroutines.channels.SendChannel) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> sendChannel3 = sendChannel2;
            th = null;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                io.ktor.websocket.Frame.Ping ping = (io.ktor.websocket.Frame.Ping) it.next();
                io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("Received ping message, sending pong message");
                io.ktor.websocket.Frame.Pong pong = new io.ktor.websocket.Frame.Pong(ping.getData(), (kotlinx.coroutines.DisposableHandle) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                this.L$0 = sendChannel3;
                this.L$1 = channel;
                this.L$2 = it;
                this.label = 2;
                if (sendChannel3.send(pong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sendChannel = sendChannel3;
                this.L$0 = sendChannel;
                this.L$1 = channel;
                this.L$2 = it;
                this.label = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                sendChannel3 = sendChannel;
                obj = hasNext;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(channel, th);
                    return kotlin.Unit.INSTANCE;
                }
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$2;
            channel = (kotlinx.coroutines.channels.ReceiveChannel) this.L$1;
            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> sendChannel4 = (kotlinx.coroutines.channels.SendChannel) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            sendChannel = sendChannel4;
        }
        th = null;
        this.L$0 = sendChannel;
        this.L$1 = channel;
        this.L$2 = it;
        this.label = 1;
        hasNext = it.hasNext(this);
        if (hasNext != coroutine_suspended) {
        }
    }
}
