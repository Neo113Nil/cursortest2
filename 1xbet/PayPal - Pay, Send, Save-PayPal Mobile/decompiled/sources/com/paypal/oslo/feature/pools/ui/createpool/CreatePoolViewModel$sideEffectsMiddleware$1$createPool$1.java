package com.paypal.oslo.feature.pools.ui.createpool;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1", f = "CreatePoolViewModel.kt", i = {0, 0, 0}, l = {75}, m = "createPool", n = {"input", "formState", "poolInput"}, nl = {76}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class CreatePoolViewModel$sideEffectsMiddleware$1$createPool$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1 getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1.access$createPool(this.getOutputMinFrameDuration, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreatePoolViewModel$sideEffectsMiddleware$1$createPool$1(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1 createPoolViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1$createPool$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = createPoolViewModel$sideEffectsMiddleware$1;
    }
}
