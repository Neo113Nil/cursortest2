package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1", f = "PoolDetailsViewModel.kt", i = {0, 0}, l = {109}, m = "loadPoolDetails", n = {"input", "poolId"}, nl = {110}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class PoolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1 getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1.access$loadPoolDetails(this.getHighSpeedVideoSizes, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PoolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1 poolDetailsViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = poolDetailsViewModel$sideEffectsMiddleware$1;
    }
}
