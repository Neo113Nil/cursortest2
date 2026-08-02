package com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$3$1", f = "InstantVaultScreen.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class InstantVaultScreenKt$InstantVaultScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel getInputFormats;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State> getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect> effect = this.getInputFormats.getEffect();
            final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator = this.Camera2StreamConfigurationMap;
            final java.lang.String str = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel = this.getOutputFormats;
            final java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State> state = this.getInputSizeshNQ4ISI;
            final android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizesFor = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    java.lang.String returnUrl;
                    com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect effect2 = (com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect) obj2;
                    if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToSuccess(((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen) effect2).getThanksScreenData());
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError) {
                        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError navigateToError = (com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError) effect2;
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.m15465navigateToErrorForResultuMTlDqM$default(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, str, navigateToError.getErrorScreenType(), checkoutLogger, null, navigateToError.getReturnUrl(), 8, null);
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.LoadCardMetaData) {
                        if (cardSharedViewModel.getCardFormData().getValue() == null) {
                            cardSharedViewModel.loadCardFormData(null);
                        }
                        if (cardSharedViewModel.getFiMetadata().getValue() == null) {
                            cardSharedViewModel.loadFIMetadata();
                        }
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToEConsent(((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent) effect2).getResponse());
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToRyp(((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp) effect2).getAuthenticationXOResponse());
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToAddCard) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.m15466navigateToAddCardDpEMydE(str2);
                    } else {
                        if (!(effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateBackToMerchant)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt.access$InstantVaultScreen$lambda$0(state).getInitializeCheckoutEntity();
                        if (initializeCheckoutEntity != null && (returnUrl = com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.returnUrl(initializeCheckoutEntity)) != null) {
                            com.paypal.oslo.feature.inappcheckout.ui.util.URLUtils.INSTANCE.openUrl(context, returnUrl);
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$3$1(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantVaultScreenKt$InstantVaultScreen$3$1(com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, java.lang.String str2, androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State> state, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$3$1> continuation) {
        super(2, continuation);
        this.getInputFormats = instantVaultViewModel;
        this.Camera2StreamConfigurationMap = inAppCheckoutCoordinator;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = checkoutLogger;
        this.getOutputFormats = cardSharedViewModel;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getInputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRangesFor = context;
    }
}
