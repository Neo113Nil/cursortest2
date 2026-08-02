package com.paypal.oslo.feature.identity.challenges.stepupotp.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1", f = "StepupOtpVerificationScreen.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, nl = {386}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class StepupOtpVerificationScreenKt$OtpEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ android.content.res.Resources getInputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1", f = "StepupOtpVerificationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;
        final /* synthetic */ android.content.res.Resources getHighSpeedVideoSizesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getInputFormats;
        final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel getInputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getOutputFormats;
        final /* synthetic */ java.lang.String getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect stepupOtpUiEffect = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect) this.getOutputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputMinFrameDurationlomOqCM != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (stepupOtpUiEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateBack) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (stepupOtpUiEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen) {
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen navigateToNextScreen = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen) stepupOtpUiEffect;
                if (navigateToNextScreen.getToken() != null) {
                    this.getHighSpeedVideoFpsRanges.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(this.getOutputMinFrameDuration, new com.paypal.oslo.feature.identity.foundation.model.Token(navigateToNextScreen.getToken().getTokenType(), navigateToNextScreen.getToken().getTokenValue(), navigateToNextScreen.getToken().getExpires(), navigateToNextScreen.getToken().getExpirationInSeconds()), this.getHighSpeedVideoFpsRangesFor.getAuthIntent(), navigateToNextScreen.getPostAuthOperations()));
                } else {
                    int i = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRangesFor.getFlowType().ordinal()];
                    if (i == 1) {
                        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    } else if (i != 2) {
                        if (i == 3) {
                            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState value = this.getInputSizeshNQ4ISI.getUiState().getValue();
                            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges = value.getLatestChallenges();
                            java.lang.Object obj2 = null;
                            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess verificationSuccess = value instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess ? (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess) value : null;
                            final java.lang.String nonce = verificationSuccess != null ? verificationSuccess.getNonce() : null;
                            final java.lang.String partialToken = verificationSuccess != null ? verificationSuccess.getPartialToken() : null;
                            for (java.lang.Object obj3 : latestChallenges) {
                                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj3;
                                if (challenge.getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CHANGE_PASSWORD || challenge.getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SKIP_AND_LOGIN) {
                                    obj2 = obj3;
                                    break;
                                }
                            }
                            final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj2;
                            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj4) {
                                    return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge.this, nonce, partialToken, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj4);
                                }
                            });
                        } else if (i != 4) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                }
            } else if (stepupOtpUiEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge) {
                int i2 = com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$1[((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge) stepupOtpUiEffect).getChallenge().getType().ordinal()];
                if (i2 == 1) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
                    final java.lang.String str = this.getOutputMinFrameDuration;
                    final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext = this.getHighSpeedVideoFpsRangesFor;
                    final boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                    appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(str, stepupOtpUiEffect, challengeContext, z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj4);
                        }
                    });
                } else if (i2 == 2) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.Camera2StreamConfigurationMap;
                    final java.lang.String str2 = this.getOutputMinFrameDuration;
                    final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext2 = this.getHighSpeedVideoFpsRangesFor;
                    final boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes(str2, stepupOtpUiEffect, challengeContext2, z2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj4);
                        }
                    });
                } else {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator3 = this.Camera2StreamConfigurationMap;
                    final java.lang.String str3 = this.getOutputMinFrameDuration;
                    final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext3 = this.getHighSpeedVideoFpsRangesFor;
                    final boolean z3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    appNavigator3.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(str3, stepupOtpUiEffect, challengeContext3, z3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj4);
                        }
                    });
                }
            } else if (!(stepupOtpUiEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat)) {
                if (!(stepupOtpUiEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple)) {
                    if (!(stepupOtpUiEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination) stepupOtpUiEffect).getChallenges(), this.getHighSpeedVideoFpsRangesFor, null, null, 12, null);
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator4 = this.Camera2StreamConfigurationMap;
                    final java.lang.String str4 = this.getOutputMinFrameDuration;
                    appNavigator4.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(str4, challengeResult, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj4);
                        }
                    });
                } else {
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple simple = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple) stepupOtpUiEffect;
                    this.getInputFormats.setValue(this.getHighSpeedVideoSizesFor.getString(simple.getMessageResId()));
                    this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(simple.isError()));
                }
            } else {
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat withFormat = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat) stepupOtpUiEffect;
                this.getInputFormats.setValue(this.getHighSpeedVideoSizesFor.getString(withFormat.getMessageResId(), withFormat.getFormatArg()));
                this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(withFormat.isError()));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect stepupOtpUiEffect, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge navigateToDifferentChallenge = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge) stepupOtpUiEffect;
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination(str, navigateToDifferentChallenge.getChallenge(), challengeContext, navigateToDifferentChallenge.getLatestChallenges(), z, true));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, challengeResult, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect stepupOtpUiEffect, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge navigateToDifferentChallenge = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge) stepupOtpUiEffect;
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination(str, navigateToDifferentChallenge.getChallenge(), challengeContext, navigateToDifferentChallenge.getLatestChallenges(), z, true));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult(arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.stepup.StepupSuccess(null, 1, null))));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect stepupOtpUiEffect, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge navigateToDifferentChallenge = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge) stepupOtpUiEffect;
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination(str, navigateToDifferentChallenge.getChallenge(), challengeContext, navigateToDifferentChallenge.getLatestChallenges(), z, true));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult(new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success(challenge, str, str2)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.stepup.StepupError.UserCanceled.INSTANCE)));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect stepupOtpUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1) create(stepupOtpUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.values().length];
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.TRANSACTION.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.LOGIN.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.PASSWORD_RESET.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.SWITCH_ACCOUNT.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.values().length];
                try {
                    iArr2[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr2[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getOutputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, android.content.res.Resources resources, boolean z, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighSpeedVideoFpsRanges = loginFlowController;
            this.getOutputMinFrameDuration = str;
            this.getHighSpeedVideoFpsRangesFor = challengeContext;
            this.getInputSizeshNQ4ISI = stepupOtpVerificationViewModel;
            this.getHighSpeedVideoSizesFor = resources;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getInputFormats = mutableState;
            this.getHighSpeedVideoSizes = mutableState2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputMinFrameDuration.getUiEffect(), new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupOtpVerificationScreenKt$OtpEffectHandler$1$1(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, android.content.res.Resources resources, boolean z, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = stepupOtpVerificationViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighSpeedVideoSizes = loginFlowController;
        this.getHighSpeedVideoSizesFor = str;
        this.getHighSpeedVideoFpsRanges = challengeContext;
        this.getInputFormats = resources;
        this.Camera2StreamConfigurationMap = z;
        this.getInputSizeshNQ4ISI = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
    }
}
