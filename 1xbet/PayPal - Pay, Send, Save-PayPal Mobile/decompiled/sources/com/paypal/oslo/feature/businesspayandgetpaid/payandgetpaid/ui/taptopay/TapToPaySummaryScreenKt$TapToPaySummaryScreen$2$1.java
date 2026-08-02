package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/EditItemNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1", f = "TapToPaySummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemNavResult editItemNavResult = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.handleEditItemResult(editItemNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemNavResult editItemNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1) create(editItemNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1 tapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1(this.Camera2StreamConfigurationMap, continuation);
        tapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return tapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel tapToPaySummaryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryScreenKt$TapToPaySummaryScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = tapToPaySummaryViewModel;
    }
}
