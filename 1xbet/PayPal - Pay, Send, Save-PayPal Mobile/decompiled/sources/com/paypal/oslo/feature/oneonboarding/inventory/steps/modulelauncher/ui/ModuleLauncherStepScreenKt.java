package com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/modulelauncher/ui/navigation/ModuleLauncherDestination;", "destination", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "flowViewModel", "", "ModuleLauncherStepScreen", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/modulelauncher/ui/navigation/ModuleLauncherDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModuleLauncherStepScreenKt {
    public static final void ModuleLauncherStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.navigation.ModuleLauncherDestination moduleLauncherDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleLauncherDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(26656064);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(moduleLauncherDestination) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(26656064, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreen (ModuleLauncherStepScreen.kt:37)");
            }
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(moduleLauncherDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1373917633, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenKt.$r8$lambda$Drne_aNvAGnhCJbx5IxrJzNxfew(com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.navigation.ModuleLauncherDestination.this, oneOnboardingFlowViewModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 112) | 3072 | (i2 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenKt.m16747$r8$lambda$Y9l9HM0v16sD_ufBHr4bD0iM(com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.navigation.ModuleLauncherDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Drne_aNvAGnhCJbx5IxrJzNxfew(com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.navigation.ModuleLauncherDestination moduleLauncherDestination, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1373917633, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreen.<anonymous> (ModuleLauncherStepScreen.kt:43)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.domain.ModuleLauncherStepComponentConfig stepComponentConfig = moduleLauncherDestination.getStepComponentConfig();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = moduleLauncherDestination.getIntentId();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenKt.$r8$lambda$QCRaLSqd9ekRbCPW6eK6hDM42bA(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenContentKt.ModuleLauncherStepScreenContent(stepComponentConfig, intentId, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QCRaLSqd9ekRbCPW6eK6hDM42bA(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepForward();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y9l9-HM-0v16sD-_ufBHr4bD0iM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16747$r8$lambda$Y9l9HM0v16sD_ufBHr4bD0iM(com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.navigation.ModuleLauncherDestination moduleLauncherDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ModuleLauncherStepScreen(moduleLauncherDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
