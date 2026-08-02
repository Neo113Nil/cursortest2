package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository", f = "MockShoppingIABRepository.kt", i = {0}, l = {55}, m = "generateIabOfferDetails", n = {"honeyStoreId"}, nl = {59}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class MockShoppingIABRepository$generateIabOfferDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockShoppingIABRepository$generateIabOfferDetails$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository mockShoppingIABRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$generateIabOfferDetails$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockShoppingIABRepository;
    }
}
