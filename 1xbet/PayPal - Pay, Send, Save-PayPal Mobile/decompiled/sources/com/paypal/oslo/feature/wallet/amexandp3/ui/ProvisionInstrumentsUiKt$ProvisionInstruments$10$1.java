package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PartnerLinkingNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$10$1", f = "ProvisionInstrumentsUi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ProvisionInstrumentsUiKt$ProvisionInstruments$10$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult partnerLinkingNavResult = (com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor.handlePartnerLinkingResult(partnerLinkingNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult partnerLinkingNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$10$1) create(partnerLinkingNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$10$1 provisionInstrumentsUiKt$ProvisionInstruments$10$1 = new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$10$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        provisionInstrumentsUiKt$ProvisionInstruments$10$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return provisionInstrumentsUiKt$ProvisionInstruments$10$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProvisionInstrumentsUiKt$ProvisionInstruments$10$1(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$10$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = provisionInstrumentsViewModel;
    }
}
