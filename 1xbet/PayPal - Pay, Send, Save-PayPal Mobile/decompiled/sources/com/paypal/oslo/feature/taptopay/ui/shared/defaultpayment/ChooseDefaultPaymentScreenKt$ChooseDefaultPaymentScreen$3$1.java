package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$3$1", f = "ChooseDefaultPaymentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighResolutionOutputSizeshNQ4ISI.isPaypalDefaultPaymentApp()) {
            this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed(true));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$3$1(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = chooseDefaultPaymentViewModel;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
