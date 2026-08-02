package com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1", f = "StepupSecurityQuestionScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE}, m = "invokeSuspend", n = {}, nl = {319}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1", f = "StepupSecurityQuestionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ boolean Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoSizes;
        int getInputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel getOutputFormats;
        /* synthetic */ java.lang.Object getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect stepupSecurityQuestionEffect = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect) this.getOutputMinFrameDuration;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (stepupSecurityQuestionEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (stepupSecurityQuestionEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToNextScreen) {
                com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt.access$handleNavigateToNextScreen((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToNextScreen) stepupSecurityQuestionEffect, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            } else if (!(stepupSecurityQuestionEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToMoreOptions)) {
                if (stepupSecurityQuestionEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToStepupDestination) {
                    com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToStepupDestination navigateToStepupDestination = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToStepupDestination) stepupSecurityQuestionEffect;
                    final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(navigateToStepupDestination.getChallenges(), com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext.copy$default(this.getHighSpeedVideoFpsRanges, null, null, navigateToStepupDestination.getAuthIntent(), 3, null), null, null, 12, null);
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                    final java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
                    appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(str, challengeResult, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    if (!(stepupSecurityQuestionEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToDifferentChallenge)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToDifferentChallenge navigateToDifferentChallenge = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect.NavigateToDifferentChallenge) stepupSecurityQuestionEffect;
                    final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = navigateToDifferentChallenge.getChallenge();
                    final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges = navigateToDifferentChallenge.getLatestChallenges();
                    switch (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[challenge.getType().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            final java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                            final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext = this.getHighSpeedVideoFpsRanges;
                            final boolean z = this.Camera2StreamConfigurationMap;
                            appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap(str2, challenge, challengeContext, latestChallenges, z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                }
                            });
                            break;
                        case 5:
                            com.paypal.oslo.core.navigation.AppNavigator appNavigator3 = this.getHighResolutionOutputSizeshNQ4ISI;
                            final java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
                            final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext2 = this.getHighSpeedVideoFpsRanges;
                            final boolean z2 = this.Camera2StreamConfigurationMap;
                            appNavigator3.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(str3, challenge, challengeContext2, latestChallenges, z2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                }
                            });
                            break;
                        case 6:
                            com.paypal.oslo.core.navigation.AppNavigator appNavigator4 = this.getHighResolutionOutputSizeshNQ4ISI;
                            final java.lang.String str4 = this.getHighSpeedVideoFpsRangesFor;
                            final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext3 = this.getHighSpeedVideoFpsRanges;
                            final boolean z3 = this.Camera2StreamConfigurationMap;
                            appNavigator4.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(str4, challenge, challengeContext3, latestChallenges, z3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                }
                            });
                            break;
                        default:
                            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                }
                            });
                            break;
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.stepup.StepupError.UserCanceled.INSTANCE)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination(str, challenge, challengeContext, list, z, true));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, challengeResult, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination(str, challenge, challengeContext, list, z, true));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination(str, challenge, challengeContext, list, z, true));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination(com.paypal.oslo.feature.identity.challenges.shared.ui.ContactUsErrorType.MaxFailuresRisk.INSTANCE));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEffect stepupSecurityQuestionEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1) create(stepupSecurityQuestionEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.values().length];
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getOutputMinFrameDuration = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel stepupSecurityQuestionViewModel, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getOutputFormats = stepupSecurityQuestionViewModel;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = challengeContext;
            this.getHighSpeedVideoSizes = loginFlowController;
            this.Camera2StreamConfigurationMap = z;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getInputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel stepupSecurityQuestionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionScreenKt$SecurityQuestionEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = stepupSecurityQuestionViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = challengeContext;
        this.Camera2StreamConfigurationMap = loginFlowController;
        this.getHighSpeedVideoSizes = z;
    }
}
