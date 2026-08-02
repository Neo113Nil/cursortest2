package com.paypal.oslo.feature.taptopay.ui.setup.bridge;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "setupResult", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1", f = "OnboardingBridgeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult onboardingTapToPayNavResult;
        com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult = (com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status = setupFlowNavResult.getStatus();
        if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Onboarding bridge: Tokenization success, returning Success", null, null, 6, null);
            onboardingTapToPayNavResult = new com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.Status.Success.INSTANCE);
        } else if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Onboarding bridge: Tokenization cancelled, returning Cancelled", null, null, 6, null);
            onboardingTapToPayNavResult = new com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.Status.Cancelled.INSTANCE);
        } else {
            if (!(status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Onboarding bridge: Tokenization failed, returning Error", null, null, 6, null);
            onboardingTapToPayNavResult = new com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.Status.Error.INSTANCE);
        }
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult onboardingTapToPayNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(onboardingTapToPayNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1) create(setupFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1 onboardingBridgeScreenKt$OnboardingBridgeScreen$5$1 = new com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        onboardingBridgeScreenKt$OnboardingBridgeScreen$5$1.getHighSpeedVideoSizes = obj;
        return onboardingBridgeScreenKt$OnboardingBridgeScreen$5$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}
