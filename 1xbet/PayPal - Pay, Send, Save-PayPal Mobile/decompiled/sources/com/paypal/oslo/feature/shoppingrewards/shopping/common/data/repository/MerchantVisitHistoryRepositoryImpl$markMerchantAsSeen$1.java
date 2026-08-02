package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl", f = "MerchantVisitHistoryRepositoryImpl.kt", i = {0, 1, 1, 1}, l = {52, 54}, m = "markMerchantAsSeen", n = {"merchantId", "merchantId", "seenMerchants", "updatedMerchants"}, nl = {52, 55}, s = {"L$0", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class MerchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.markMerchantAsSeen(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl merchantVisitHistoryRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = merchantVisitHistoryRepositoryImpl;
    }
}
