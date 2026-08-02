package com.paypal.oslo.feature.onboarding.welcomeback.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/welcomeback/navigation/WelcomeBackEmailConfirmationDestination;", "destination", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "viewModel", "", "WelcomeBackEmailConfirmationScreen", "(Lcom/paypal/oslo/feature/onboarding/welcomeback/navigation/WelcomeBackEmailConfirmationDestination;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;", "result", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "onTransition", "handleEmailConfirmationResult", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeBackEmailConfirmationScreenKt {
    public static final void WelcomeBackEmailConfirmationScreen(final com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomeBackEmailConfirmationDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1838019446);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(welcomeBackEmailConfirmationDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(postOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(postOnboardingViewModel) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1838019446, i2, -1, "com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreen (WelcomeBackEmailConfirmationScreen.kt:55)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(postOnboardingNavigator);
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt.m16604$r8$lambda$xW7HFn5tfxt9yoHTnbwIqOr9Qs(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, rememberNavResultRequestId, (androidx.navigation3.runtime.NavKey) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> rememberGuardedNavigateForResult = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.GuardedNavigateForResultKt.rememberGuardedNavigateForResult((kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16125PostOnboardingFlowScreenfVxw3D8(welcomeBackEmailConfirmationDestination.mo15903getFlowId8NcbBzM(), postOnboardingNavigator, postOnboardingViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-852649519, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt.m16603$r8$lambda$PcI6NN5JhnmLX3lr4keranpytw(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, welcomeBackEmailConfirmationDestination, rememberNavResultRequestId, rememberGuardedNavigateForResult, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 112) | 3072 | (i2 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt.$r8$lambda$__anSILgo1q50fj8TUGtAT4hvF8(com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination.this, postOnboardingNavigator, postOnboardingViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handleEmailConfirmationResult(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult emailConfirmationNavResult, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome outcome = emailConfirmationNavResult.getOutcome();
        if ((outcome instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success) || (outcome instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed)) {
            function1.invoke(new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close(false, 1, null));
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function1.invoke(new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Fail(false, 1, null));
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DoXAggBdRG03wMiu9bJwPN98JUU(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PcI6NN5Jhn-mLX3lr4keranpytw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16603$r8$lambda$PcI6NN5JhnmLX3lr4keranpytw(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-852649519, i, -1, "com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreen.<anonymous> (WelcomeBackEmailConfirmationScreen.kt:68)");
            }
            com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams deepLinkParams = postOnboardingViewModel.getDeepLinkParams();
            com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation welcomeBackEmailConfirmation = deepLinkParams instanceof com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation ? (com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams.WelcomeBackEmailConfirmation) deepLinkParams : null;
            if (welcomeBackEmailConfirmation == null) {
                composer.startReplaceGroup(-845048556);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = composer.changedInstance(postOnboardingViewModel);
                boolean changedInstance2 = composer.changedInstance(welcomeBackEmailConfirmationDestination);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$1$1(postOnboardingViewModel, welcomeBackEmailConfirmationDestination, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return kotlin.Unit.INSTANCE;
            }
            composer.startReplaceGroup(-844651663);
            composer.endReplaceGroup();
            boolean changedInstance3 = composer.changedInstance(postOnboardingViewModel);
            boolean changedInstance4 = composer.changedInstance(welcomeBackEmailConfirmationDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$2$1(postOnboardingViewModel, welcomeBackEmailConfirmationDestination, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer, 0);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$lambda$1$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m16605invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16605invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, composer, 3072);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changed = composer.changed(function1);
            boolean changedInstance5 = composer.changedInstance(welcomeBackEmailConfirmation);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed | changedInstance5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$WelcomeBackEmailConfirmationScreen$1$3$1(function1, welcomeBackEmailConfirmation, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$__anSILgo1q50fj8TUGtAT4hvF8(com.paypal.oslo.feature.onboarding.welcomeback.navigation.WelcomeBackEmailConfirmationDestination welcomeBackEmailConfirmationDestination, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        WelcomeBackEmailConfirmationScreen(welcomeBackEmailConfirmationDestination, postOnboardingNavigator, postOnboardingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xW7HFn5tfxt9yoHTn-bwIqOr9Qs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16604$r8$lambda$xW7HFn5tfxt9yoHTnbwIqOr9Qs(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, java.lang.String str, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        postOnboardingNavigator.getAppNavigator().m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.welcomeback.ui.WelcomeBackEmailConfirmationScreenKt.$r8$lambda$DoXAggBdRG03wMiu9bJwPN98JUU(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
