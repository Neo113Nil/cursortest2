package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository", f = "MockShoppingIABRepository.kt", i = {0}, l = {48}, m = "enrollInOffer", n = {"offerId"}, nl = {49}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class MockShoppingIABRepository$enrollInOffer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.enrollInOffer(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockShoppingIABRepository$enrollInOffer$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository mockShoppingIABRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$enrollInOffer$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = mockShoppingIABRepository;
    }
}
