package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository", f = "MockShoppingIABRepository.kt", i = {0}, l = {43}, m = "fetchStoreInfoByHoneyStoreId", n = {"honeyStoreId"}, nl = {41}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class MockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.fetchStoreInfoByHoneyStoreId(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository mockShoppingIABRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockShoppingIABRepository;
    }
}
