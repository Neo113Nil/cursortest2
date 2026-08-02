package com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"AccountCreationSubmissionStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/submission/ui/navigation/AccountCreationSubmissionDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/submission/ui/navigation/AccountCreationSubmissionDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountCreationSubmissionStepScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountCreationSubmissionStepScreenKt {
    public static final void AccountCreationSubmissionStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.navigation.AccountCreationSubmissionDestination accountCreationSubmissionDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationSubmissionDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1265972157);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(accountCreationSubmissionDestination) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1265972157, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreen (AccountCreationSubmissionStepScreen.kt:52)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel.getUiState(), null, startRestartGroup, 0, 1);
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = accountCreationSubmissionDestination.getIntentId();
            boolean changedInstance = startRestartGroup.changedInstance(oneOnboardingFlowViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(accountCreationSubmissionDestination);
            com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt$AccountCreationSubmissionStepScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt$AccountCreationSubmissionStepScreen$1$1(oneOnboardingFlowViewModel, accountCreationSubmissionDestination, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(intentId, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) collectAsState.getValue();
            boolean changed = startRestartGroup.changed(collectAsState);
            boolean changedInstance3 = startRestartGroup.changedInstance(oneOnboardingFlowViewModel);
            com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt$AccountCreationSubmissionStepScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt$AccountCreationSubmissionStepScreen$2$1(oneOnboardingFlowViewModel, collectAsState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(oneOnboardingUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(accountCreationSubmissionDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1799590532, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt.$r8$lambda$dRoHWdnnIg54f4OyOo7EEqhvHDE(androidx.compose.ui.Modifier.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 896) | (i3 & 112) | 3072, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt.$r8$lambda$7wh6UircLXQnRX1E48wvpZzZWGY(com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.navigation.AccountCreationSubmissionDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7wh6UircLXQnRX1E48wvpZzZWGY(com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.navigation.AccountCreationSubmissionDestination accountCreationSubmissionDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountCreationSubmissionStepScreen(accountCreationSubmissionDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZmXCAEQOv3XfSpkCTvB96_135mQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(387422019);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(387422019, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenPreview (AccountCreationSubmissionStepScreen.kt:82)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenContentKt.AccountCreationSubmissionStepScreenContent(null, startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenKt.$r8$lambda$ZmXCAEQOv3XfSpkCTvB96_135mQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dRoHWdnnIg54f4OyOo7EEqhvHDE(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1799590532, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreen.<anonymous> (AccountCreationSubmissionStepScreen.kt:72)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionStepScreenContentKt.AccountCreationSubmissionStepScreenContent(modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState access$AccountCreationSubmissionStepScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) state.getValue();
    }
}
