package io.ktor.utils.io.jvm.javaio;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1", f = "Blocking.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class BlockingKt$toInputStream$1$blockingWait$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object awaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(this.getHighSpeedVideoFpsRangesFor, 0, this, 1, null);
        return awaitContent$default == coroutine_suspended ? coroutine_suspended : awaitContent$default;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockingKt$toInputStream$1$blockingWait$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = byteReadChannel;
    }
}
