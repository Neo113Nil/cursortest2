package com.paypal.oslo.feature.onboarding.welcomeback.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1", f = "WelcomeBackEmailConfirmationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult emailConfirmationNavResult = (com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel = this.getHighSpeedVideoFpsRanges;
        final com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt.handleEmailConfirmationResult(emailConfirmationNavResult, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, welcomeBackEmailConfirmationDestination, (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(welcomeBackEmailConfirmationDestination.getStep(), transition));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult emailConfirmationNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1) create(emailConfirmationNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1 welcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1 = new com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        welcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1.Camera2StreamConfigurationMap = obj;
        return welcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = postOnboardingViewModel;
        this.getHighSpeedVideoFpsRangesFor = welcomeBackEmailConfirmationDestination;
    }
}
