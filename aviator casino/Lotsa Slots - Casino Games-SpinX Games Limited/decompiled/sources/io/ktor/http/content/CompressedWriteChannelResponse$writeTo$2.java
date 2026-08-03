package io.ktor.http.content;

/* compiled from: CompressedContent.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2", f = "CompressedContent.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$use$iv"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class CompressedWriteChannelResponse$writeTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel $channel;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ io.ktor.http.content.CompressedWriteChannelResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompressedWriteChannelResponse$writeTo$2(io.ktor.http.content.CompressedWriteChannelResponse compressedWriteChannelResponse, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2> continuation) {
        super(2, continuation);
        this.this$0 = compressedWriteChannelResponse;
        this.$channel = byteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2 compressedWriteChannelResponse$writeTo$2 = new io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2(this.this$0, this.$channel, continuation);
        compressedWriteChannelResponse$writeTo$2.L$0 = obj;
        return compressedWriteChannelResponse$writeTo$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.ByteWriteChannel encode = this.this$0.getEncoder().encode(this.$channel, ((kotlinx.coroutines.CoroutineScope) this.L$0).getCoroutineContext());
            try {
                io.ktor.http.content.OutgoingContent.WriteChannelContent original = this.this$0.getOriginal();
                this.L$0 = encode;
                this.label = 1;
                if (original.writeTo(encode, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteWriteChannel = encode;
            } catch (java.lang.Throwable th2) {
                byteWriteChannel = encode;
                th = th2;
                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) this.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
                    throw th;
                } catch (java.lang.Throwable th4) {
                    io.ktor.utils.io.ByteWriteChannelKt.close(byteWriteChannel);
                    throw th4;
                }
            }
        }
        io.ktor.utils.io.ByteWriteChannelKt.close(byteWriteChannel);
        return kotlin.Unit.INSTANCE;
    }
}
