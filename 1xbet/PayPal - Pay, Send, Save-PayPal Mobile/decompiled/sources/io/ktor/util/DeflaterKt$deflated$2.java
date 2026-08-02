package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.DeflaterKt$deflated$2", f = "Deflater.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class DeflaterKt$deflated$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            highResolutionOutputSizeshNQ4ISI = io.ktor.util.DeflaterKt.getHighResolutionOutputSizeshNQ4ISI(((io.ktor.utils.io.ReaderScope) this.getHighSpeedVideoFpsRanges).getChannel(), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.ReaderScope readerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.DeflaterKt$deflated$2) create(readerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.DeflaterKt$deflated$2 deflaterKt$deflated$2 = new io.ktor.util.DeflaterKt$deflated$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        deflaterKt$deflated$2.getHighSpeedVideoFpsRanges = obj;
        return deflaterKt$deflated$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeflaterKt$deflated$2(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, boolean z, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, kotlin.coroutines.Continuation<? super io.ktor.util.DeflaterKt$deflated$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = byteWriteChannel;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = objectPool;
    }
}
