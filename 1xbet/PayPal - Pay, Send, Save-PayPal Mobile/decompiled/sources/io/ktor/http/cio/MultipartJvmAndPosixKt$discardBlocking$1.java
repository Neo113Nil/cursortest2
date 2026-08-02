package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1", f = "MultipartJvmAndPosix.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class MultipartJvmAndPosixKt$discardBlocking$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object discard$default = io.ktor.utils.io.ByteReadChannelOperationsKt.discard$default(this.getHighResolutionOutputSizeshNQ4ISI, 0L, this, 1, null);
        return discard$default == coroutine_suspended ? coroutine_suspended : discard$default;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return ((io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartJvmAndPosixKt$discardBlocking$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = byteReadChannel;
    }
}
