package com.paypal.oslo.feature.taptopay.ui.setup.bridge;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1", f = "OnboardingBridgeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
        if (!booleanValue) {
            this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Onboarding bridge: launching NFC Intro", null, null, 6, null);
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination onboardingTapToPayDestination = this.getHighSpeedVideoSizes;
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination onboardingTapToPayDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.taptopay.api.navigation.OnboardingIntroDestination(onboardingTapToPayDestination.getTopBarConfig()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination onboardingTapToPayDestination, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.bridge.OnboardingBridgeScreenKt$OnboardingBridgeScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighSpeedVideoSizes = onboardingTapToPayDestination;
    }
}
