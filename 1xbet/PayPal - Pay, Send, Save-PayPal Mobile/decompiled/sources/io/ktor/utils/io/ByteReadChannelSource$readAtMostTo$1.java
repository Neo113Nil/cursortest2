package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1", f = "ByteReadChannelSource.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ByteReadChannelSource$readAtMostTo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteReadChannelSource Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        byteReadChannel = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object awaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, this, 1, null);
        return awaitContent$default == coroutine_suspended ? coroutine_suspended : awaitContent$default;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteReadChannelSource$readAtMostTo$1(io.ktor.utils.io.ByteReadChannelSource byteReadChannelSource, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = byteReadChannelSource;
    }
}
