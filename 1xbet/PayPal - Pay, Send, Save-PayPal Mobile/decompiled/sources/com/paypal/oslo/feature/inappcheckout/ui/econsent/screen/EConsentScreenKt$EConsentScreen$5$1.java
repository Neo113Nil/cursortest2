package com.paypal.oslo.feature.inappcheckout.ui.econsent.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$5$1", f = "EConsentScreen.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class EConsentScreenKt$EConsentScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect> effect = this.getHighSpeedVideoSizes.getEffect();
            final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.Camera2StreamConfigurationMap;
            final androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State> state = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$5$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect effect2 = (com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect) obj2;
                    if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToProfile) {
                        com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.access$EConsentScreen$lambda$1(state).buyerInfoEntity();
                        if (buyerInfoEntity != null) {
                            com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToProfile(buyerInfoEntity);
                        }
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToRyp(((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp) effect2).getResponse());
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateBackWithResult) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateBackWithResult();
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToError) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.navigateToError$default(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE, checkoutLogger, null, null, 12, null);
                    } else {
                        if (!(effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToNativeInAppWebView(((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToNativeInAppWebView) effect2).getData());
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
        return ((com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$5$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EConsentScreenKt$EConsentScreen$5$1(com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = eConsentViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = inAppCheckoutCoordinator;
        this.Camera2StreamConfigurationMap = checkoutLogger;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
