package io.ktor.websocket;

/* compiled from: DefaultWebSocketSession.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", i = {}, l = {270, 281, 281, 281, 274, 281, 281, 278, 281, 281}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultWebSocketSessionImpl$runOutgoingProcessor$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    int label;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$runOutgoingProcessor$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultWebSocketSessionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        io.ktor.websocket.WebSocketSession webSocketSession;
        kotlinx.coroutines.channels.Channel channel2;
        io.ktor.websocket.WebSocketSession webSocketSession2;
        kotlinx.coroutines.channels.Channel channel3;
        io.ktor.websocket.WebSocketSession webSocketSession3;
        kotlinx.coroutines.channels.Channel channel4;
        io.ktor.websocket.WebSocketSession webSocketSession4;
        kotlinx.coroutines.channels.Channel channel5;
        io.ktor.websocket.WebSocketSession webSocketSession5;
        kotlinx.coroutines.channels.Channel channel6;
        io.ktor.websocket.WebSocketSession webSocketSession6;
        kotlinx.coroutines.channels.Channel channel7;
        io.ktor.websocket.WebSocketSession webSocketSession7;
        java.lang.Object outgoingProcessorLoop;
        kotlinx.coroutines.channels.Channel channel8;
        io.ktor.websocket.WebSocketSession webSocketSession8;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                try {
                } catch (io.ktor.util.cio.ChannelIOException unused) {
                    channel4 = this.this$0.outgoingToBeProcessed;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel4, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession4 = this.this$0.raw;
                    this.label = 7;
                    if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession4, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.util.concurrent.CancellationException unused2) {
                    this.label = 5;
                    if (io.ktor.websocket.DefaultWebSocketSessionImpl.sendCloseSequence$default(this.this$0, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.NORMAL, ""), null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (kotlinx.coroutines.channels.ClosedReceiveChannelException unused3) {
                channel3 = this.this$0.outgoingToBeProcessed;
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                webSocketSession3 = this.this$0.raw;
                this.label = 4;
                if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession3, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused4) {
                channel2 = this.this$0.outgoingToBeProcessed;
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                webSocketSession2 = this.this$0.raw;
                this.label = 3;
                if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession2, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (java.lang.Throwable th) {
                channel = this.this$0.outgoingToBeProcessed;
                channel.cancel(kotlinx.coroutines.ExceptionsKt.CancellationException("Failed to send frame", th));
                webSocketSession = this.this$0.raw;
                this.label = 8;
                if (io.ktor.websocket.WebSocketSessionKt.closeExceptionally(webSocketSession, th, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            switch (this.label) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    outgoingProcessorLoop = this.this$0.outgoingProcessorLoop(this);
                    if (outgoingProcessorLoop == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel8 = this.this$0.outgoingToBeProcessed;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel8, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession8 = this.this$0.raw;
                    this.label = 2;
                    if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession8, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                case 1:
                    kotlin.ResultKt.throwOnFailure(obj);
                    channel8 = this.this$0.outgoingToBeProcessed;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel8, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession8 = this.this$0.raw;
                    this.label = 2;
                    if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession8, null, this, 1, null) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 9:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 5:
                    kotlin.ResultKt.throwOnFailure(obj);
                    channel6 = this.this$0.outgoingToBeProcessed;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel6, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession6 = this.this$0.raw;
                    this.label = 6;
                    if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession6, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                case 8:
                    kotlin.ResultKt.throwOnFailure(obj);
                    channel7 = this.this$0.outgoingToBeProcessed;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel7, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession7 = this.this$0.raw;
                    this.label = 9;
                    if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession7, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                case 10:
                    java.lang.Throwable th2 = (java.lang.Throwable) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw th2;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th3) {
            channel5 = this.this$0.outgoingToBeProcessed;
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel5, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            webSocketSession5 = this.this$0.raw;
            this.L$0 = th3;
            this.label = 10;
            if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession5, null, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th3;
        }
    }
}
