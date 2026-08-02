package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"buffer"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class WebSocketReader$readerJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.websocket.WebSocketReader getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Throwable th;
        java.nio.ByteBuffer byteBuffer;
        io.ktor.websocket.ProtocolViolationException e;
        io.ktor.websocket.FrameTooBigException e2;
        kotlinx.coroutines.channels.Channel channel2;
        kotlinx.coroutines.channels.Channel channel3;
        kotlinx.coroutines.channels.Channel channel4;
        kotlinx.coroutines.channels.Channel channel5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBuffer = (java.nio.ByteBuffer) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (io.ktor.websocket.FrameTooBigException e3) {
                    e2 = e3;
                    channel4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    channel4.close(e2);
                } catch (io.ktor.websocket.ProtocolViolationException e4) {
                    e = e4;
                    channel3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    channel3.close(e);
                } catch (java.nio.channels.ClosedChannelException | java.util.concurrent.CancellationException unused) {
                } catch (java.io.IOException unused2) {
                    channel2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    throw th;
                }
                this.getHighSpeedVideoFpsRanges.recycle(byteBuffer);
                channel5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            java.nio.ByteBuffer borrow = this.getHighSpeedVideoFpsRanges.borrow();
            try {
                this.Camera2StreamConfigurationMap = borrow;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (io.ktor.websocket.WebSocketReader.access$readLoop(this.getHighResolutionOutputSizeshNQ4ISI, borrow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (io.ktor.websocket.FrameTooBigException e5) {
                byteBuffer = borrow;
                e2 = e5;
                channel4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                channel4.close(e2);
                this.getHighSpeedVideoFpsRanges.recycle(byteBuffer);
                channel5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                return kotlin.Unit.INSTANCE;
            } catch (io.ktor.websocket.ProtocolViolationException e6) {
                byteBuffer = borrow;
                e = e6;
                channel3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                channel3.close(e);
                this.getHighSpeedVideoFpsRanges.recycle(byteBuffer);
                channel5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                return kotlin.Unit.INSTANCE;
            } catch (java.nio.channels.ClosedChannelException | java.util.concurrent.CancellationException unused3) {
            } catch (java.io.IOException unused4) {
                byteBuffer = borrow;
                channel2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                this.getHighSpeedVideoFpsRanges.recycle(byteBuffer);
                channel5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th3) {
                th = th3;
                throw th;
            }
            byteBuffer = borrow;
            this.getHighSpeedVideoFpsRanges.recycle(byteBuffer);
            channel5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th4) {
            this.getHighSpeedVideoFpsRanges.recycle(coroutine_suspended);
            channel = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            throw th4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.WebSocketReader$readerJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.WebSocketReader$readerJob$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketReader$readerJob$1(io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, io.ktor.websocket.WebSocketReader webSocketReader, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketReader$readerJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = objectPool;
        this.getHighResolutionOutputSizeshNQ4ISI = webSocketReader;
    }
}
