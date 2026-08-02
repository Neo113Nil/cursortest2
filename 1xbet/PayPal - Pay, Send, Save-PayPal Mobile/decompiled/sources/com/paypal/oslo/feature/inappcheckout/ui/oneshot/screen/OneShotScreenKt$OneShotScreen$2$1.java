package com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$2$1", f = "OneShotScreen.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class OneShotScreenKt$OneShotScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect> effect = this.getHighSpeedVideoSizes.getEffect();
            final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator = this.getHighSpeedVideoFpsRanges;
            final java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect effect2 = (com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect) obj2;
                    if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToRyp(((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp) effect2).getAuthenticationXOResponse());
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToInstantVault(((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen) effect2).getAuthenticationXOResponse());
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToEConsent(((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent) effect2).getAuthenticationXOResponse());
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToWebFlow) {
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToWebFlow();
                    } else {
                        if (!(effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError navigateToError = (com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError) effect2;
                        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.m15465navigateToErrorForResultuMTlDqM$default(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, str, navigateToError.getErrorScreenType(), checkoutLogger, null, navigateToError.getReturnUrl(), 8, null);
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
        return ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneShotScreenKt$OneShotScreen$2$1(com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = oneShotViewModel;
        this.getHighSpeedVideoFpsRanges = inAppCheckoutCoordinator;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = checkoutLogger;
    }
}
