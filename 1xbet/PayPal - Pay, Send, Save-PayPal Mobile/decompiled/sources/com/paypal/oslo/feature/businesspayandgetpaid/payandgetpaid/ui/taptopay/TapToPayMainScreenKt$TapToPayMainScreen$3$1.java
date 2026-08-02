package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/businessinventory/api/navigation/result/TaxSelectedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainScreenKt$TapToPayMainScreen$3$1", f = "TapToPayMainScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TapToPayMainScreenKt$TapToPayMainScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult taxSelectedNavResult = (com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel tapToPayCustomAmountViewModel = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption tax = taxSelectedNavResult.getTax();
        tapToPayCustomAmountViewModel.setSelectedTax$business_pay_and_get_paid_prodRelease(tax != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxKt.toTax(tax) : null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult taxSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainScreenKt$TapToPayMainScreen$3$1) create(taxSelectedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainScreenKt$TapToPayMainScreen$3$1 tapToPayMainScreenKt$TapToPayMainScreen$3$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainScreenKt$TapToPayMainScreen$3$1(this.getHighSpeedVideoSizes, continuation);
        tapToPayMainScreenKt$TapToPayMainScreen$3$1.getHighSpeedVideoFpsRangesFor = obj;
        return tapToPayMainScreenKt$TapToPayMainScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayMainScreenKt$TapToPayMainScreen$3$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel tapToPayCustomAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainScreenKt$TapToPayMainScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = tapToPayCustomAmountViewModel;
    }
}
