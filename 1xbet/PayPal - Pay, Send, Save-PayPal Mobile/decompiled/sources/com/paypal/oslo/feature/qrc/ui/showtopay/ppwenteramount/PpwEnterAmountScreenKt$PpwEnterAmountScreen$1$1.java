package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/qrc/navigation/result/ShowToPayNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1", f = "PpwEnterAmountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.qrc.navigation.result.ShowToPayNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.navigation.result.ShowToPayNavResult showToPayNavResult = (com.paypal.oslo.feature.qrc.navigation.result.ShowToPayNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (showToPayNavResult.getShouldResetAmount()) {
            this.getHighResolutionOutputSizeshNQ4ISI.handleEvent(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ResetAmount.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.qrc.navigation.result.ShowToPayNavResult showToPayNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1) create(showToPayNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1 ppwEnterAmountScreenKt$PpwEnterAmountScreen$1$1 = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        ppwEnterAmountScreenKt$PpwEnterAmountScreen$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return ppwEnterAmountScreenKt$PpwEnterAmountScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel ppwEnterAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = ppwEnterAmountViewModel;
    }
}
