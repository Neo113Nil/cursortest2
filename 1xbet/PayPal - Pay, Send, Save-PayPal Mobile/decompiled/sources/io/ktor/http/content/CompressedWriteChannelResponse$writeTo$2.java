package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2", f = "CompressedContent.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$use$iv"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class CompressedWriteChannelResponse$writeTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.http.content.CompressedWriteChannelResponse Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.ByteWriteChannel encode = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.encode(this.getHighResolutionOutputSizeshNQ4ISI, ((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes).getCoroutineContext());
            try {
                io.ktor.http.content.OutgoingContent.WriteChannelContent writeChannelContent = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = encode;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (writeChannelContent.writeTo(encode, this) == coroutine_suspended) {
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
            byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) this.getHighSpeedVideoSizes;
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2 compressedWriteChannelResponse$writeTo$2 = new io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        compressedWriteChannelResponse$writeTo$2.getHighSpeedVideoSizes = obj;
        return compressedWriteChannelResponse$writeTo$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompressedWriteChannelResponse$writeTo$2(io.ktor.http.content.CompressedWriteChannelResponse compressedWriteChannelResponse, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = compressedWriteChannelResponse;
        this.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel;
    }
}
