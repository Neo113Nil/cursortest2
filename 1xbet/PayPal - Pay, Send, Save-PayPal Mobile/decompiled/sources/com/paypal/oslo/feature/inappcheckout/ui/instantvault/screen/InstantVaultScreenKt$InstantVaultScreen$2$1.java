package com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/navigation/result/CardSavedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$2$1", f = "InstantVaultScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class InstantVaultScreenKt$InstantVaultScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult cardSavedNavResult = (com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (cardSavedNavResult.getCardSaved()) {
            com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State value = this.getHighSpeedVideoFpsRangesFor.getState().getValue();
            this.getHighResolutionOutputSizeshNQ4ISI.navigateToRyp(new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse(value.getInitializeCheckoutEntity(), value.getFundingSelectionEntity(), value.getBuyerInfoEntity()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult cardSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$2$1) create(cardSavedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$2$1 instantVaultScreenKt$InstantVaultScreen$2$1 = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        instantVaultScreenKt$InstantVaultScreen$2$1.getHighSpeedVideoFpsRanges = obj;
        return instantVaultScreenKt$InstantVaultScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantVaultScreenKt$InstantVaultScreen$2$1(com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = instantVaultViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = inAppCheckoutCoordinator;
    }
}
