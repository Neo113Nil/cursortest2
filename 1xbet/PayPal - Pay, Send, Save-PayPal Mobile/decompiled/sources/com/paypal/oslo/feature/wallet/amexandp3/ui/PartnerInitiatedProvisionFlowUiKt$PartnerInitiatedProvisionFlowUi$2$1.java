package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1", f = "PartnerInitiatedProvisionFlowUi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult amexAndP3LinkingFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, amexAndP3LinkingFlowNavResult.getOutcome().toString(), null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult amexAndP3LinkingFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1) create(amexAndP3LinkingFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1 partnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1 = new com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1(continuation);
        partnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return partnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1;
    }

    PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1> continuation) {
        super(2, continuation);
    }
}
