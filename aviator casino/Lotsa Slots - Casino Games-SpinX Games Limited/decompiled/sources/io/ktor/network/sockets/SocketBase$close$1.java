package io.ktor.network.sockets;

/* compiled from: SocketBase.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.SocketBase$close$1", f = "SocketBase.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SocketBase$close$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ io.ktor.network.sockets.SocketBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SocketBase$close$1(io.ktor.network.sockets.SocketBase socketBase, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.SocketBase$close$1> continuation) {
        super(2, continuation);
        this.this$0 = socketBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.network.sockets.SocketBase$close$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.SocketBase$close$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.ReaderJob readerJob = (io.ktor.utils.io.ReaderJob) this.this$0.readerJob;
            if (readerJob != null) {
                this.label = 1;
                if (readerJob.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.ktor.utils.io.WriterJob writerJob = (io.ktor.utils.io.WriterJob) this.this$0.writerJob;
        if (writerJob != null) {
            io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(writerJob);
        }
        this.this$0.checkChannels();
        return kotlin.Unit.INSTANCE;
    }
}
