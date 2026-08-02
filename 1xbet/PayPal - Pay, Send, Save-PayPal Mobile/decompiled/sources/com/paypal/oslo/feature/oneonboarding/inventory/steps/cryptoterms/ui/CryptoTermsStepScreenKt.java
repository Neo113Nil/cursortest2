package com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"CryptoTermsStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cryptoterms/ui/navigation/CryptoTermsDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cryptoterms/ui/navigation/CryptoTermsDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CryptoTermsStepScreenKt {
    public static final void CryptoTermsStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.navigation.CryptoTermsDestination cryptoTermsDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoTermsDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2125750933);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(cryptoTermsDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingFlowViewModel) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2125750933, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreen (CryptoTermsStepScreen.kt:34)");
            }
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(cryptoTermsDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(800205302, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenKt.$r8$lambda$NZWzBXSwavZQD1jprkOz5Mn3sY4(com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.navigation.CryptoTermsDestination.this, oneOnboardingFlowViewModel, modifier, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 3072 | (i3 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenKt.m16737$r8$lambda$VARBAFnZiqTRb8YFN_wceQj1iA(com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.navigation.CryptoTermsDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NZWzBXSwavZQD1jprkOz5Mn3sY4(com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.navigation.CryptoTermsDestination cryptoTermsDestination, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(800205302, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreen.<anonymous> (CryptoTermsStepScreen.kt:40)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.domain.CryptoTermsStepComponentConfig stepComponentConfig = cryptoTermsDestination.getStepComponentConfig();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = cryptoTermsDestination.getIntentId();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenKt.$r8$lambda$ZfOfo0u_U8eHEXYBfcEYh4GMRcQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, (com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenContentKt.CryptoTermsStepScreenContent(stepComponentConfig, (kotlin.jvm.functions.Function1) rememberedValue, modifier, intentId, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VARBA-FnZiqTRb8YFN_wceQj1iA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16737$r8$lambda$VARBAFnZiqTRb8YFN_wceQj1iA(com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.navigation.CryptoTermsDestination cryptoTermsDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoTermsStepScreen(cryptoTermsDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZfOfo0u_U8eHEXYBfcEYh4GMRcQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        oneOnboardingFlowViewModel.contributeCollectedItem(collectedItem);
        oneOnboardingFlowViewModel.stepForward();
        return kotlin.Unit.INSTANCE;
    }
}
