package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/businesscustomers/api/navigation/result/RecipientSelectedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenKt$RequestPaymentScreen$2$1", f = "RequestPaymentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class RequestPaymentScreenKt$RequestPaymentScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult recipientSelectedNavResult = (com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceKt.toCustomer(recipientSelectedNavResult.getRecipient());
        if (customer != null) {
            this.getHighSpeedVideoFpsRangesFor.sendInvoice(customer);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult recipientSelectedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenKt$RequestPaymentScreen$2$1) create(recipientSelectedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenKt$RequestPaymentScreen$2$1 requestPaymentScreenKt$RequestPaymentScreen$2$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenKt$RequestPaymentScreen$2$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        requestPaymentScreenKt$RequestPaymentScreen$2$1.Camera2StreamConfigurationMap = obj;
        return requestPaymentScreenKt$RequestPaymentScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPaymentScreenKt$RequestPaymentScreen$2$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel requestPaymentScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenKt$RequestPaymentScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = requestPaymentScreenViewModel;
    }
}
