package com.paypal.oslo.feature.inappcheckout.ui.entry.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1", f = "AppSwitchEntryScreen.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect> effect = this.getHighSpeedVideoSizes.getEffect();
            final android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    android.net.Uri parse;
                    android.content.Intent buildIntent;
                    com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect effect2 = (com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect) obj2;
                    if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant) {
                        java.lang.String cancelUrl = ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant) effect2).getCancelUrl();
                        if (cancelUrl != null) {
                            if (kotlin.text.StringsKt.isBlank(cancelUrl)) {
                                cancelUrl = null;
                            }
                            if (cancelUrl != null && (parse = android.net.Uri.parse(cancelUrl)) != null && (buildIntent = com.paypal.oslo.feature.inappcheckout.extensions.UriExtensionKt.buildIntent(parse, context)) != null) {
                                context.startActivity(buildIntent);
                            }
                        }
                        inAppCheckoutCoordinator.navigateToPayPalHomeScreen();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(effect2, com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToHome.INSTANCE)) {
                        inAppCheckoutCoordinator.navigateToPayPalHomeScreen();
                    } else if (effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout) {
                        inAppCheckoutCoordinator.navigateToOneShot(((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout) effect2).getAuthenticationXOResponse());
                    } else {
                        if (!(effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        inAppCheckoutWebViewCoordinator.navigateToWebViewCheckoutFlow(((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout) effect2).getUniversalLinkData());
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
        return ((com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, android.content.Context context, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appSwitchEntryViewModel;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = inAppCheckoutCoordinator;
        this.getHighSpeedVideoFpsRanges = inAppCheckoutWebViewCoordinator;
    }
}
