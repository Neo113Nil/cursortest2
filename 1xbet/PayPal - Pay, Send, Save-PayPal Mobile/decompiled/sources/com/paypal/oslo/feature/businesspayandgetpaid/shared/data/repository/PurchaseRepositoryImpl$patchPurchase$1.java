package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl", f = "PurchaseRepositoryImpl.kt", i = {0, 0, 0}, l = {142}, m = "patchPurchase", n = {"purchaseId", "updateData", "updateRequest"}, nl = {143}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes11.dex */
final class PurchaseRepositoryImpl$patchPurchase$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.patchPurchase(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseRepositoryImpl$patchPurchase$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl purchaseRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$patchPurchase$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = purchaseRepositoryImpl;
    }
}
