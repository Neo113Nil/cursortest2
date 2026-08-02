package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake", f = "PurchaseRepositoryFake.kt", i = {0, 0}, l = {88}, m = "sendReceipt", n = {"purchaseId", "toEmail"}, nl = {89}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class PurchaseRepositoryFake$sendReceipt$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.sendReceipt(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseRepositoryFake$sendReceipt$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake purchaseRepositoryFake, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$sendReceipt$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = purchaseRepositoryFake;
    }
}
