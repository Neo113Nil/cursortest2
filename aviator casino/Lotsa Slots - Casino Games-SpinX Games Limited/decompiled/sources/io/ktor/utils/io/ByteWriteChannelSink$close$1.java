package io.ktor.utils.io;

/* compiled from: ByteWriteChannelSink.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelSink$close$1", f = "ByteWriteChannelSink.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ByteWriteChannelSink$close$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannelSink this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteWriteChannelSink$close$1(io.ktor.utils.io.ByteWriteChannelSink byteWriteChannelSink, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteWriteChannelSink$close$1> continuation) {
        super(2, continuation);
        this.this$0 = byteWriteChannelSink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.utils.io.ByteWriteChannelSink$close$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.ByteWriteChannelSink$close$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            byteWriteChannel = this.this$0.origin;
            io.ktor.utils.io.ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(byteWriteChannel);
            byteWriteChannel2 = this.this$0.origin;
            this.label = 1;
            if (byteWriteChannel2.flushAndClose(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
