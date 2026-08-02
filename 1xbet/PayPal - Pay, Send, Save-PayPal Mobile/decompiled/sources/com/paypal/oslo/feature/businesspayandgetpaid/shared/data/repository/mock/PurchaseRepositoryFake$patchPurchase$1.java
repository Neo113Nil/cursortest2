package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake", f = "PurchaseRepositoryFake.kt", i = {0, 0}, l = {64}, m = "patchPurchase", n = {"purchaseId", "updateData"}, nl = {65}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class PurchaseRepositoryFake$patchPurchase$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.patchPurchase(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseRepositoryFake$patchPurchase$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake purchaseRepositoryFake, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$patchPurchase$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = purchaseRepositoryFake;
    }
}
