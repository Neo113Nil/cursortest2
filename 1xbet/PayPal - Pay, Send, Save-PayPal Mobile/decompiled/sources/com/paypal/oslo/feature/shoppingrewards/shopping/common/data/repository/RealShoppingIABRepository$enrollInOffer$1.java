package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository", f = "RealShoppingIABRepository.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {67, 93}, m = "enrollInOffer", n = {"offerId", "lastResult", "attempt", "offerId", "lastResult", "error", "attempt", "delayMs"}, nl = {68, 95}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "J$0"}, v = 2)
/* loaded from: classes15.dex */
final class RealShoppingIABRepository$enrollInOffer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.enrollInOffer(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealShoppingIABRepository$enrollInOffer$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository realShoppingIABRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository$enrollInOffer$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = realShoppingIABRepository;
    }
}
