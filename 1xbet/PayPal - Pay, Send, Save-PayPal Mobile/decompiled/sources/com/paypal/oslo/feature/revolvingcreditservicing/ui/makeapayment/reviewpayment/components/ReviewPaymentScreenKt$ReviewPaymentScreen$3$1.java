package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/PaymentMethodSelectedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$3$1", f = "ReviewPaymentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ReviewPaymentScreenKt$ReviewPaymentScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult paymentMethodSelectedNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected(paymentMethodSelectedNavResult.getBankId(), paymentMethodSelectedNavResult.getBankName(), paymentMethodSelectedNavResult.getBankLastFour(), paymentMethodSelectedNavResult.getBankAccountType(), paymentMethodSelectedNavResult.getIconThumbnail()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult paymentMethodSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$3$1) create(paymentMethodSelectedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$3$1 reviewPaymentScreenKt$ReviewPaymentScreen$3$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        reviewPaymentScreenKt$ReviewPaymentScreen$3$1.Camera2StreamConfigurationMap = obj;
        return reviewPaymentScreenKt$ReviewPaymentScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPaymentScreenKt$ReviewPaymentScreen$3$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel reviewPaymentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = reviewPaymentViewModel;
    }
}
