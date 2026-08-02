package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl", f = "MerchantVisitHistoryRepositoryImpl.kt", i = {0}, l = {32}, m = "isMerchantSeen", n = {"merchantId"}, nl = {33}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class MerchantVisitHistoryRepositoryImpl$isMerchantSeen$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.isMerchantSeen(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantVisitHistoryRepositoryImpl$isMerchantSeen$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl merchantVisitHistoryRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$isMerchantSeen$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = merchantVisitHistoryRepositoryImpl;
    }
}
