package com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"TermsStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terms/ui/navigation/TermsDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terms/ui/navigation/TermsDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TermsStepScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TermsStepScreenKt {
    public static final void TermsStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsDestination termsDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1597437131);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(termsDestination) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1597437131, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreen (TermsStepScreen.kt:43)");
            }
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(termsDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-416832106, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt.$r8$lambda$mxm35KpB0ElgfTWAh06t_kXaifk(com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsDestination.this, oneOnboardingFlowViewModel, modifier, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 3072 | (i3 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt.$r8$lambda$AGaaZ2BZvNWFRjkBWvOx49Vcz1c(com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$2z-5blELJyYVKtgpmgVUCmcgt80, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16873$r8$lambda$2z5blELJyYVKtgpmgVUCmcgt80(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1235712937);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1235712937, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenContentPreview (TermsStepScreen.kt:64)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.domain.TermsStepComponentConfig termsStepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.domain.TermsStepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-terms"), kotlin.collections.CollectionsKt.emptyList(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt.$r8$lambda$gEGaJT3BMIFPaNo8dXV5ReHsIYg((com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenContentKt.TermsStepScreenContent(termsStepComponentConfig, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt.m16873$r8$lambda$2z5blELJyYVKtgpmgVUCmcgt80(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AGaaZ2BZvNWFRjkBWvOx49Vcz1c(com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsDestination termsDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TermsStepScreen(termsDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FWfyzj6IxUFp1S-k2TUHnunLZMs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16874$r8$lambda$FWfyzj6IxUFp1Sk2TUHnunLZMs(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        oneOnboardingFlowViewModel.contributeCollectedItem(collectedItem);
        oneOnboardingFlowViewModel.stepForward();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gEGaJT3BMIFPaNo8dXV5ReHsIYg(com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mxm35KpB0ElgfTWAh06t_kXaifk(com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsDestination termsDestination, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-416832106, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreen.<anonymous> (TermsStepScreen.kt:49)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.domain.TermsStepComponentConfig stepComponentConfig = termsDestination.getStepComponentConfig();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenKt.m16874$r8$lambda$FWfyzj6IxUFp1Sk2TUHnunLZMs(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, (com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.TermsStepScreenContentKt.TermsStepScreenContent(stepComponentConfig, (kotlin.jvm.functions.Function1) rememberedValue, modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
