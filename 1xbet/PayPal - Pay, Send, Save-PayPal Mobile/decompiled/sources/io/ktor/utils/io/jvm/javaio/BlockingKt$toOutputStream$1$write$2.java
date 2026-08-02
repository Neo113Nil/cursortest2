package io.ktor.utils.io.jvm.javaio;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2", f = "Blocking.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class BlockingKt$toOutputStream$1$write$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ byte[] getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.getHighResolutionOutputSizeshNQ4ISI;
            byte[] bArr = this.getHighSpeedVideoSizes;
            int i2 = this.Camera2StreamConfigurationMap;
            int i3 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(byteWriteChannel, bArr, i2, i3 + i2, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockingKt$toOutputStream$1$write$2(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel;
        this.getHighSpeedVideoSizes = bArr;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }
}
