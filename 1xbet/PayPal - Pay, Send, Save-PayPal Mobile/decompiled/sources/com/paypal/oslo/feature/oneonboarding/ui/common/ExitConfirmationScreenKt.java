package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"ExitConfirmationScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/ExitConfirmationDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/ExitConfirmationDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExitConfirmationScreenKt {
    public static final void ExitConfirmationScreen(final com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination exitConfirmationDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exitConfirmationDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1122875862);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(exitConfirmationDestination) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1122875862, i3, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreen (ExitConfirmationScreen.kt:30)");
            }
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(exitConfirmationDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1443131657, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt.$r8$lambda$UN20_nt7rzGEe4VOW5qiFQ6a8rc(com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination.this, oneOnboardingFlowViewModel, oneOnboardingNavigator, modifier, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 896) | (i3 & 112) | 3072, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt.m17145$r8$lambda$MBpZo9j23zT2nmeCBA3jKwGpmI(com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I9gwxEofukPrXY8Qb9ihEcTNOME(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator) {
        com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.navigateBack$default(oneOnboardingNavigator, 0, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MBp-Zo9j23zT2nmeCBA3jKwGpmI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17145$r8$lambda$MBpZo9j23zT2nmeCBA3jKwGpmI(com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination exitConfirmationDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ExitConfirmationScreen(exitConfirmationDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UN20_nt7rzGEe4VOW5qiFQ6a8rc(com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination exitConfirmationDestination, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1443131657, i, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreen.<anonymous> (ExitConfirmationScreen.kt:36)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt$ExitConfirmationScreen$1$1$1(bottomSheetController, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, 6);
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = exitConfirmationDestination.getIntentId();
            boolean changedInstance2 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt.m17146$r8$lambda$fq2Xkmt_hCxO8nXnetGiLjSXAQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changedInstance3 = composer.changedInstance(oneOnboardingNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationScreenKt.$r8$lambda$I9gwxEofukPrXY8Qb9ihEcTNOME(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.oneonboarding.ui.common.ExitConfirmationModalKt.ExitConfirmationModal(bottomSheetController, intentId, function0, (kotlin.jvm.functions.Function0) rememberedValue4, modifier, composer, com.paypal.pds.components.BottomSheetController.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fq2Xkmt_hCxO8nXnetGiLj-SXAQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17146$r8$lambda$fq2Xkmt_hCxO8nXnetGiLjSXAQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.closeFlow(com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED);
        return kotlin.Unit.INSTANCE;
    }
}
