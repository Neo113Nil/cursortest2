package io.ktor.websocket;

/* compiled from: PingPong.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", i = {}, l = {77, 81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PingPongKt$pinger$1$rc$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> $channel;
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> $outgoing;
    final /* synthetic */ java.lang.String $pingMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PingPongKt$pinger$1$rc$1(kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame> sendChannel, java.lang.String str, kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> channel, kotlin.coroutines.Continuation<? super io.ktor.websocket.PingPongKt$pinger$1$rc$1> continuation) {
        super(2, continuation);
        this.$outgoing = sendChannel;
        this.$pingMessage = str;
        this.$channel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.PingPongKt$pinger$1$rc$1(this.$outgoing, this.$pingMessage, this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.PingPongKt$pinger$1$rc$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:6:0x0053). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.websocket.Frame.Pong pong;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: sending ping frame");
            this.label = 1;
            if (this.$outgoing.send(new io.ktor.websocket.Frame.Ping(io.ktor.utils.io.core.StringsKt.toByteArray(this.$pingMessage, kotlin.text.Charsets.ISO_8859_1)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            pong = (io.ktor.websocket.Frame.Pong) obj;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.decodeToString$default(pong.getData(), 0, pong.getData().length, false, 4, null), this.$pingMessage)) {
                io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: received valid pong frame " + pong);
                return kotlin.Unit.INSTANCE;
            }
            io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: received invalid pong frame " + pong + ", continue waiting");
        }
        this.label = 2;
        obj = this.$channel.receive(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        pong = (io.ktor.websocket.Frame.Pong) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.decodeToString$default(pong.getData(), 0, pong.getData().length, false, 4, null), this.$pingMessage)) {
        }
    }
}
