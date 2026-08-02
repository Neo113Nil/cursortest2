package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel", f = "PurchaseDetailsViewModel.kt", i = {0, 1, 1, 1, 1}, l = {176, 193}, m = "sendReceiptToEmail", n = {"email", "email", "this_$iv", "$i$f$fold", "$i$a$-fold-PurchaseDetailsViewModel$sendReceiptToEmail$3"}, nl = {203, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, s = {"L$0", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class PurchaseDetailsViewModel$sendReceiptToEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.access$sendReceiptToEmail(this.getHighSpeedVideoSizesFor, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseDetailsViewModel$sendReceiptToEmail$1(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel purchaseDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceiptToEmail$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = purchaseDetailsViewModel;
    }
}
