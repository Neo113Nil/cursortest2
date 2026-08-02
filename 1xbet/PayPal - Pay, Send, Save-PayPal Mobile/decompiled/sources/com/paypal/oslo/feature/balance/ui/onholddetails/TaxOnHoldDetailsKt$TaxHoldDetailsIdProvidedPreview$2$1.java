package com.paypal.oslo.feature.balance.ui.onholddetails;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "money", "Lcom/paypal/oslo/feature/balance/domain/model/Money;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1", f = "TaxOnHoldDetails.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TaxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.domain.model.Money, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.domain.model.Money money = (com.paypal.oslo.feature.balance.domain.model.Money) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD.concat(java.lang.String.valueOf(money.getAmount()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.domain.model.Money money, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1) create(money, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1 taxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1 = new com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1(continuation);
        taxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return taxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1;
    }

    TaxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxHoldDetailsIdProvidedPreview$2$1> continuation) {
        super(2, continuation);
    }
}
