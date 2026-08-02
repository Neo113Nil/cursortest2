package com.paypal.oslo.feature.taptopay.ui.setup.bridge;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "screenLockResult", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/screenlock/RequireScreenLockNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1", f = "OnboardingBridgeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult requireScreenLockNavResult = (com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status status = requireScreenLockNavResult.getStatus();
        if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status.Completed) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Onboarding bridge: Screen lock enabled, launching PPDC", null, null, 6, null);
            this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt.$r8$lambda$8Nk1hxVQpZmSfIrD0wTwoOuww2A(com.paypal.oslo.feature.debitcard.api.model.DebitCardToolBarConfig.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else {
            if (!(status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.Status.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Onboarding bridge: Screen lock skipped, returning Cancelled", null, null, 6, null);
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.Status.Cancelled.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult requireScreenLockNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1) create(requireScreenLockNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1 onboardingBridgeScreenKt$OnboardingBridgeScreen$3$1 = new com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        onboardingBridgeScreenKt$OnboardingBridgeScreen$3$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return onboardingBridgeScreenKt$OnboardingBridgeScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1(com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination onboardingTapToPayDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = onboardingTapToPayDestination;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
