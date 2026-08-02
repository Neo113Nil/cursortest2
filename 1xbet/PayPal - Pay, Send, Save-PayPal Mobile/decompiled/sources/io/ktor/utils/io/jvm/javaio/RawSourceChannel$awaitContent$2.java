package io.ktor.utils.io.jvm.javaio;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class RawSourceChannel$awaitContent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.jvm.javaio.RawSourceChannel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Incorrect condition in loop: B:5:0x0020 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.io.Buffer buffer;
        kotlinx.io.RawSource rawSource;
        kotlinx.io.RawSource rawSource2;
        kotlinx.io.Buffer buffer2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        long j = 0;
        while (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(buffer) < this.getHighSpeedVideoFpsRangesFor && j >= 0) {
            try {
                rawSource2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                buffer2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                j = rawSource2.readAtMostTo(buffer2, Long.MAX_VALUE);
            } catch (java.io.EOFException unused) {
                j = -1;
            }
        }
        if (j == -1) {
            rawSource = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            rawSource.close();
            this.Camera2StreamConfigurationMap.getJob().complete();
            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap = new io.ktor.utils.io.CloseToken(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawSourceChannel$awaitContent$2(io.ktor.utils.io.jvm.javaio.RawSourceChannel rawSourceChannel, int i, kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = rawSourceChannel;
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
