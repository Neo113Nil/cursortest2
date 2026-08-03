package io.ktor.websocket;

/* compiled from: WebSocketReader.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"buffer"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class WebSocketReader$readerJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> $pool;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ io.ktor.websocket.WebSocketReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketReader$readerJob$1(io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, io.ktor.websocket.WebSocketReader webSocketReader, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketReader$readerJob$1> continuation) {
        super(2, continuation);
        this.$pool = objectPool;
        this.this$0 = webSocketReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.WebSocketReader$readerJob$1(this.$pool, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.WebSocketReader$readerJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Throwable th;
        java.nio.ByteBuffer byteBuffer;
        io.ktor.websocket.ProtocolViolationException e;
        io.ktor.websocket.FrameTooBigException e2;
        java.lang.Object readLoop;
        kotlinx.coroutines.channels.Channel channel2;
        kotlinx.coroutines.channels.Channel channel3;
        kotlinx.coroutines.channels.Channel channel4;
        kotlinx.coroutines.channels.Channel channel5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBuffer = (java.nio.ByteBuffer) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (io.ktor.websocket.FrameTooBigException e3) {
                    e2 = e3;
                    channel4 = this.this$0.queue;
                    channel4.close(e2);
                } catch (io.ktor.websocket.ProtocolViolationException e4) {
                    e = e4;
                    channel3 = this.this$0.queue;
                    channel3.close(e);
                } catch (java.nio.channels.ClosedChannelException | java.util.concurrent.CancellationException unused) {
                } catch (java.io.IOException unused2) {
                    channel2 = this.this$0.queue;
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    throw th;
                }
                this.$pool.recycle(byteBuffer);
                channel5 = this.this$0.queue;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            java.nio.ByteBuffer borrow = this.$pool.borrow();
            try {
                this.L$0 = borrow;
                this.label = 1;
                readLoop = this.this$0.readLoop(borrow, this);
                if (readLoop == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (io.ktor.websocket.FrameTooBigException e5) {
                byteBuffer = borrow;
                e2 = e5;
                channel4 = this.this$0.queue;
                channel4.close(e2);
                this.$pool.recycle(byteBuffer);
                channel5 = this.this$0.queue;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                return kotlin.Unit.INSTANCE;
            } catch (io.ktor.websocket.ProtocolViolationException e6) {
                byteBuffer = borrow;
                e = e6;
                channel3 = this.this$0.queue;
                channel3.close(e);
                this.$pool.recycle(byteBuffer);
                channel5 = this.this$0.queue;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                return kotlin.Unit.INSTANCE;
            } catch (java.nio.channels.ClosedChannelException | java.util.concurrent.CancellationException unused3) {
            } catch (java.io.IOException unused4) {
                byteBuffer = borrow;
                channel2 = this.this$0.queue;
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) channel2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                this.$pool.recycle(byteBuffer);
                channel5 = this.this$0.queue;
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th3) {
                th = th3;
                throw th;
            }
            byteBuffer = borrow;
            this.$pool.recycle(byteBuffer);
            channel5 = this.this$0.queue;
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th4) {
            this.$pool.recycle(coroutine_suspended);
            channel = this.this$0.queue;
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            throw th4;
        }
    }
}
