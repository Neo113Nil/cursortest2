package com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"SubmissionStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/submission/ui/navigation/SubmissionDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/submission/ui/navigation/SubmissionDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubmissionStepScreenKt {
    public static final void SubmissionStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.navigation.SubmissionDestination submissionDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submissionDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1458321331);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(submissionDestination) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1458321331, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreen (SubmissionStepScreen.kt:48)");
            }
            final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel.getUiState(), null, startRestartGroup, 0, 1);
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = submissionDestination.getIntentId();
            boolean changedInstance = startRestartGroup.changedInstance(oneOnboardingFlowViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(submissionDestination);
            com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenKt$SubmissionStepScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenKt$SubmissionStepScreen$1$1(oneOnboardingFlowViewModel, submissionDestination, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(intentId, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(submissionDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-568956882, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenKt.$r8$lambda$w0rplpqhgAYU4SUSqTkKKl0iLBw(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, modifier, collectAsState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 3072 | (i3 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenKt.$r8$lambda$MOIBl2Kmco4BoT9p3ZgUGumLgl4(com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.navigation.SubmissionDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$3dvha8Jt4e0F18VVZ8Noc-Xm5VI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16857$r8$lambda$3dvha8Jt4e0F18VVZ8NocXm5VI(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.closeFlow$default(oneOnboardingFlowViewModel, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MOIBl2Kmco4BoT9p3ZgUGumLgl4(com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.navigation.SubmissionDestination submissionDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SubmissionStepScreen(submissionDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w0rplpqhgAYU4SUSqTkKKl0iLBw(final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-568956882, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreen.<anonymous> (SubmissionStepScreen.kt:60)");
            }
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) state.getValue();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenKt.m16857$r8$lambda$3dvha8Jt4e0F18VVZ8NocXm5VI(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentKt.SubmissionStepScreenContent(oneOnboardingUiState, (kotlin.jvm.functions.Function0) rememberedValue, modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
