package com.paypal.oslo.feature.identity.challenges.stepupsna.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1", f = "StepupSnaScreen.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, nl = {301}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class StepupSnaScreenKt$SnaEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getOutputFormats;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1$1", f = "StepupSnaScreen.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m = "invokeSuspend", n = {"effect", "elapsed", "remaining"}, nl = {183}, s = {"L$0", "J$0", "J$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ long getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel getHighSpeedVideoSizesFor;
        long getInputFormats;
        long getInputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getOutputFormats;
        final /* synthetic */ java.lang.String getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect stepupSnaEffect = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect) this.getOutputFormats;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputMinFrameDurationlomOqCM;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long m23953getInWholeMillisecondsimpl = kotlin.time.Duration.m23953getInWholeMillisecondsimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(this.getHighSpeedVideoFpsRanges));
                long j = 3000 - m23953getInWholeMillisecondsimpl;
                if (j > 0) {
                    this.getOutputFormats = stepupSnaEffect;
                    this.getInputFormats = m23953getInWholeMillisecondsimpl;
                    this.getInputSizeshNQ4ISI = j;
                    this.getOutputMinFrameDurationlomOqCM = 1;
                    if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (stepupSnaEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome) {
                com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome navigateToHome = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome) stepupSnaEffect;
                com.paypal.oslo.feature.identity.foundation.model.UserAccessToken firstPartyUserAccessToken = navigateToHome.getResult().getFirstPartyUserAccessToken();
                if (firstPartyUserAccessToken != null) {
                    this.getHighSpeedVideoSizes.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(this.getOutputMinFrameDuration, new com.paypal.oslo.feature.identity.foundation.model.Token(firstPartyUserAccessToken.getTokenType(), firstPartyUserAccessToken.getTokenValue(), firstPartyUserAccessToken.getExpires(), firstPartyUserAccessToken.getExpirationInSeconds()), this.getHighResolutionOutputSizeshNQ4ISI.getAuthIntent(), navigateToHome.getResult().getPostAuthOperations()));
                } else {
                    int i2 = com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[this.getHighResolutionOutputSizeshNQ4ISI.getFlowType().ordinal()];
                    if (i2 == 1) {
                        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges = navigateToHome.getResult().getChallenges();
                            if (challenges == null) {
                                challenges = kotlin.collections.CollectionsKt.emptyList();
                            }
                            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState value = this.getHighSpeedVideoSizesFor.getUiState().getValue();
                            java.lang.Object obj2 = null;
                            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success success = value instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success ? (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success) value : null;
                            final java.lang.String nonce = success != null ? success.getNonce() : null;
                            final java.lang.String partialToken = success != null ? success.getPartialToken() : null;
                            for (java.lang.Object obj3 : challenges) {
                                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj3;
                                if (challenge.getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CHANGE_PASSWORD || challenge.getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SKIP_AND_LOGIN) {
                                    obj2 = obj3;
                                    break;
                                }
                            }
                            final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj2;
                            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj4) {
                                    return com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge.this, nonce, partialToken, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj4);
                                }
                            });
                        } else if (i2 != 4) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                }
            } else if (stepupSnaEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination) {
                com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination navigateToStepupDestination = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination) stepupSnaEffect;
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges2 = navigateToStepupDestination.getChallenges();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj4 : challenges2) {
                    if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj4).getType() != com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH) {
                        arrayList.add(obj4);
                    }
                }
                final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(arrayList, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext.copy$default(this.getHighResolutionOutputSizeshNQ4ISI, null, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.Default, navigateToStepupDestination.getAuthIntent(), 1, null), null, null, 12, null);
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
                final java.lang.String str = this.getOutputMinFrameDuration;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj5) {
                        return com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes(str, challengeResult, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj5);
                    }
                });
            } else {
                if (!(stepupSnaEffect instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.getHighSpeedVideoFpsRangesFor;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj5 : list) {
                    if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj5).getType() != com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH) {
                        arrayList2.add(obj5);
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult2 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(arrayList3, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext.copy$default(this.getHighResolutionOutputSizeshNQ4ISI, null, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.Default, null, 5, null), null, null, 8, null);
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.Camera2StreamConfigurationMap;
                    final java.lang.String str2 = this.getOutputMinFrameDuration;
                    appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj6) {
                            return com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap(str2, challengeResult2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj6);
                        }
                    });
                } else {
                    this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj6) {
                            return com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj6);
                        }
                    });
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination(com.paypal.oslo.feature.identity.challenges.shared.ui.ContactUsErrorType.NoOptionsAtStart.INSTANCE));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, challengeResult, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult(new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success(challenge, str, str2)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.StepupNavResult(arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.stepup.StepupSuccess(null, 1, null))));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, challengeResult, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect stepupSnaEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1) create(stepupSnaEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getOutputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(long j, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel stepupSnaViewModel, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoSizes = loginFlowController;
            this.getOutputMinFrameDuration = str;
            this.getHighResolutionOutputSizeshNQ4ISI = challengeContext;
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighSpeedVideoSizesFor = stepupSnaViewModel;
            this.getHighSpeedVideoFpsRangesFor = list;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizesFor.getUiEffect(), new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StepupSnaScreenKt$SnaEffectHandler$1$1(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel stepupSnaViewModel, long j, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaScreenKt$SnaEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = stepupSnaViewModel;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = loginFlowController;
        this.getOutputFormats = str;
        this.getHighSpeedVideoFpsRanges = challengeContext;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
