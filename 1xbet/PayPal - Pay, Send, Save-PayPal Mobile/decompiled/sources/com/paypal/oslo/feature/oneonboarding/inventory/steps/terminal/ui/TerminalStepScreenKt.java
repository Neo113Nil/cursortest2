package com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"TerminalStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terminal/ui/navigation/TerminalDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terminal/ui/navigation/TerminalDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TerminalStepScreenKt {
    public static final void TerminalStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.navigation.TerminalDestination terminalDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        com.paypal.oslo.feature.oneonboarding.domain.Flow flow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1487175456);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(terminalDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(oneOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(oneOnboardingFlowViewModel) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1487175456, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreen (TerminalStepScreen.kt:37)");
            }
            final com.paypal.oslo.feature.oneonboarding.api.domain.Status status = null;
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel.getUiState(), null, startRestartGroup, 0, 1).getValue();
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content content = oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content ? (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content) oneOnboardingUiState : null;
            if (content != null && (flow = content.getFlow()) != null) {
                status = flow.getStatus();
            }
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(terminalDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1570062625, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenKt.m16866$r8$lambda$n6jbl5P8v2Iitby_Ut6gUiuHOI(com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.navigation.TerminalDestination.this, oneOnboardingFlowViewModel, status, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 112) | 3072 | (i2 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenKt.m16864$r8$lambda$KKgNF5PSifeokRLhk0ZbnJ4ck(com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.navigation.TerminalDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$KKgNF5PSifeokRL--hk0ZbnJ4ck, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16864$r8$lambda$KKgNF5PSifeokRLhk0ZbnJ4ck(com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.navigation.TerminalDestination terminalDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        TerminalStepScreen(terminalDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OWV1HKJewr5Q2knLZnhIMAj7CQk(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.Status status) {
        oneOnboardingFlowViewModel.closeFlow(status);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e1uMDdREJQAsHYDXszj3_X-R-to, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16865$r8$lambda$e1uMDdREJQAsHYDXszj3_XRto(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.Status status) {
        oneOnboardingFlowViewModel.closeFlow(status);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$n6jbl5P8v2Iitby_Ut6gUiuHO-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16866$r8$lambda$n6jbl5P8v2Iitby_Ut6gUiuHOI(com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.navigation.TerminalDestination terminalDestination, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, final com.paypal.oslo.feature.oneonboarding.api.domain.Status status, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1570062625, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreen.<anonymous> (TerminalStepScreen.kt:46)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalStepComponentConfig stepComponentConfig = terminalDestination.getStepComponentConfig();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = terminalDestination.getIntentId();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            boolean changed = composer.changed(status == null ? -1 : status.ordinal());
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenKt.m16865$r8$lambda$e1uMDdREJQAsHYDXszj3_XRto(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, status);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(oneOnboardingFlowViewModel);
            boolean changed2 = composer.changed(status != null ? status.ordinal() : -1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenKt.$r8$lambda$OWV1HKJewr5Q2knLZnhIMAj7CQk(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, status);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.ui.TerminalStepScreenContentKt.TerminalStepScreenContent(stepComponentConfig, intentId, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
