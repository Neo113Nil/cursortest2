package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1", f = "StepupCreditCardScreen.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel getHighSpeedVideoSizesFor;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1$1", f = "StepupCreditCardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel getOutputFormats;
        int getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect stepupCreditCardEffect = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect) this.getInputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputMinFrameDuration != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (stepupCreditCardEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (stepupCreditCardEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToNextScreen) {
                com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToNextScreen navigateToNextScreen = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToNextScreen) stepupCreditCardEffect;
                com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token = navigateToNextScreen.getToken();
                if (token != null) {
                    this.Camera2StreamConfigurationMap.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.identity.foundation.model.Token(token.getTokenType(), token.getTokenValue(), token.getExpires(), token.getExpirationInSeconds()), this.getHighSpeedVideoSizes.getAuthIntent(), navigateToNextScreen.getPostAuthOperations()));
                } else {
                    com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt.access$handleNullTokenNavigation(this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            } else if (stepupCreditCardEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToMoreOptions) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (stepupCreditCardEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToDifferentChallenge) {
                com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt.access$navigateToDifferentChallenge((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToDifferentChallenge) stepupCreditCardEffect, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
            } else {
                if (!(stepupCreditCardEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToStepupDestination)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToStepupDestination navigateToStepupDestination = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect.NavigateToStepupDestination) stepupCreditCardEffect;
                final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(navigateToStepupDestination.getChallenges(), com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext.copy$default(this.getHighSpeedVideoSizes, null, null, navigateToStepupDestination.getAuthIntent(), 3, null), null, null, 12, null);
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                final java.lang.String str = this.getHighSpeedVideoFpsRanges;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(str, challengeResult, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, challengeResult, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEffect stepupCreditCardEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1.AnonymousClass1) create(stepupCreditCardEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getInputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel stepupCreditCardViewModel, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.lang.String str, boolean z, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getOutputFormats = stepupCreditCardViewModel;
            this.getHighSpeedVideoSizes = challengeContext;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = z;
            this.Camera2StreamConfigurationMap = loginFlowController;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizesFor.getUiEffect(), new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel stepupCreditCardViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.lang.String str, boolean z, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardScreenKt$StepupCreditCardEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = stepupCreditCardViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.Camera2StreamConfigurationMap = challengeContext;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = loginFlowController;
    }
}
