package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 270, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultWebSocketSessionImpl$runOutgoingProcessor$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a0, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close$default(r7, null, r6, 1, null) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0156, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f5, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close$default(r7, null, r6, 1, null) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close$default(r7, null, r6, 1, null) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (io.ktor.websocket.DefaultWebSocketSessionImpl.access$outgoingProcessorLoop(r6.getHighSpeedVideoSizes, r6) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close$default(r7, null, r6, 1, null) != r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.closeExceptionally(r1, r7, r6) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if (r7 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0136, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close$default(r7, null, r6, 1, null) != r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0154, code lost:
    
        if (io.ktor.websocket.WebSocketSessionKt.close$default(r7, null, r6, 1, null) != r0) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        io.ktor.websocket.WebSocketSession webSocketSession;
        kotlinx.coroutines.channels.Channel channel2;
        io.ktor.websocket.WebSocketSession webSocketSession2;
        java.lang.Object highSpeedVideoFpsRanges;
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
        kotlinx.coroutines.channels.Channel channel8;
        io.ktor.websocket.WebSocketSession webSocketSession8;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                try {
                } catch (io.ktor.util.cio.ChannelIOException unused) {
                    channel4 = this.getHighSpeedVideoSizes.getOutputFormats;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel4, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession4 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                    this.Camera2StreamConfigurationMap = 7;
                } catch (java.lang.Throwable th) {
                    channel3 = this.getHighSpeedVideoSizes.getOutputFormats;
                    channel3.cancel(kotlinx.coroutines.ExceptionsKt.CancellationException("Failed to send frame", th));
                    webSocketSession3 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                    this.Camera2StreamConfigurationMap = 8;
                }
            } catch (java.util.concurrent.CancellationException unused2) {
                this.Camera2StreamConfigurationMap = 5;
                highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.NORMAL, ""), null, this);
            } catch (kotlinx.coroutines.channels.ClosedReceiveChannelException unused3) {
                channel2 = this.getHighSpeedVideoSizes.getOutputFormats;
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                webSocketSession2 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = 4;
            } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused4) {
                channel = this.getHighSpeedVideoSizes.getOutputFormats;
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                webSocketSession = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = 3;
            }
            switch (this.Camera2StreamConfigurationMap) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.Camera2StreamConfigurationMap = 1;
                    break;
                case 1:
                    kotlin.ResultKt.throwOnFailure(obj);
                    channel8 = this.getHighSpeedVideoSizes.getOutputFormats;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel8, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession8 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                    this.Camera2StreamConfigurationMap = 2;
                    break;
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
                    channel6 = this.getHighSpeedVideoSizes.getOutputFormats;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel6, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession6 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                    this.Camera2StreamConfigurationMap = 6;
                    break;
                case 8:
                    kotlin.ResultKt.throwOnFailure(obj);
                    channel7 = this.getHighSpeedVideoSizes.getOutputFormats;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel7, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    webSocketSession7 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                    this.Camera2StreamConfigurationMap = 9;
                    break;
                case 10:
                    java.lang.Throwable th2 = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw th2;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th3) {
            channel5 = this.getHighSpeedVideoSizes.getOutputFormats;
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel5, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            webSocketSession5 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = th3;
            this.Camera2StreamConfigurationMap = 10;
            if (io.ktor.websocket.WebSocketSessionKt.close$default(webSocketSession5, null, this, 1, null) != coroutine_suspended) {
                throw th3;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$runOutgoingProcessor$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = defaultWebSocketSessionImpl;
    }
}
