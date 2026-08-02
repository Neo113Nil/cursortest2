package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/PaymentMethodSelectedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.AutopayScreenKt$AutopayScreen$3$1", f = "AutopayScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AutopayScreenKt$AutopayScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult paymentMethodSelectedNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected(paymentMethodSelectedNavResult.getBalanceId(), paymentMethodSelectedNavResult.getBalanceAmount(), paymentMethodSelectedNavResult.getBankId(), paymentMethodSelectedNavResult.getBankName(), paymentMethodSelectedNavResult.getBankLastFour(), paymentMethodSelectedNavResult.getBankAccountType(), paymentMethodSelectedNavResult.getIconThumbnail()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult paymentMethodSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.AutopayScreenKt$AutopayScreen$3$1) create(paymentMethodSelectedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.AutopayScreenKt$AutopayScreen$3$1 autopayScreenKt$AutopayScreen$3$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.AutopayScreenKt$AutopayScreen$3$1(this.Camera2StreamConfigurationMap, continuation);
        autopayScreenKt$AutopayScreen$3$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return autopayScreenKt$AutopayScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutopayScreenKt$AutopayScreen$3$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel autopayViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.AutopayScreenKt$AutopayScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = autopayViewModel;
    }
}
