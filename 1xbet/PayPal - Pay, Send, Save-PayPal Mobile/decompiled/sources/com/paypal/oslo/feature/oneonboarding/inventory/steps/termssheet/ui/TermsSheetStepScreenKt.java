package com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"TermsSheetStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/ui/navigation/TermsSheetDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/ui/navigation/TermsSheetDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/runtime/Composer;I)V", "TermsSheetStepScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TermsSheetStepScreenKt {
    public static final void TermsSheetStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination termsSheetDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        com.paypal.oslo.feature.oneonboarding.domain.Flow flow;
        java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> contextualInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsSheetDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-101803392);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(termsSheetDestination) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-101803392, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreen (TermsSheetStepScreen.kt:35)");
            }
            final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list = null;
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel.getUiState(), null, startRestartGroup, 0, 1).getValue();
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content content = oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content ? (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content) oneOnboardingUiState : null;
            if (content != null && (flow = content.getFlow()) != null && (contextualInfo = flow.getContextualInfo()) != null) {
                list = contextualInfo.get(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(termsSheetDestination.getStepComponentConfig().mo16702getIdfHLlpbY()));
            }
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(termsSheetDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1956342143, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt.m16884$r8$lambda$wb_llmFOeI3ZYgiOwohFrj5vyU(com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination.this, oneOnboardingFlowViewModel, list, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 112) | 3072 | (i2 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt.$r8$lambda$04yiwdD3y10nxOItMv6FE7KNqwE(com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-ufrI2y6OgH3PA-sdmAN60MsofY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16882$r8$lambda$ufrI2y6OgH3PAsdmAN60MsofY(com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$04yiwdD3y10nxOItMv6FE7KNqwE(com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination termsSheetDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        TermsSheetStepScreen(termsSheetDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LmuFgJcmBQN1TikJl_WLx5tmdkQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepForward();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eu1TF85lHQYbPicaQskEQI0v9HQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1790686547);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1790686547, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenPreview (TermsSheetStepScreen.kt:62)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig termsSheetStepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview"), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.BalanceTermsViewComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("balance-terms-preview"), (kotlin.jvm.internal.DefaultConstructorMarker) null)), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings savings = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings(null, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt.m16882$r8$lambda$ufrI2y6OgH3PAsdmAN60MsofY((com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenContentKt.TermsSheetStepScreenContent(termsSheetStepComponentConfig, savings, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 28032, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt.$r8$lambda$eu1TF85lHQYbPicaQskEQI0v9HQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iq2imjT0u_pb5Jsc_CYyFvKfaN0(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        oneOnboardingFlowViewModel.contributeCollectedItem(collectedItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sHj5NSfkRhPWP471x0Gok3SwqNg(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wb_llmFOeI-3ZYgiOwohFrj5vyU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16884$r8$lambda$wb_llmFOeI3ZYgiOwohFrj5vyU(com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination termsSheetDestination, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, java.util.List list, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1956342143, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreen.<anonymous> (TermsSheetStepScreen.kt:45)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig stepComponentConfig = termsSheetDestination.getStepComponentConfig();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = termsSheetDestination.getIntentId();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt.$r8$lambda$iq2imjT0u_pb5Jsc_CYyFvKfaN0(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, (com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt.$r8$lambda$LmuFgJcmBQN1TikJl_WLx5tmdkQ(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenKt.$r8$lambda$sHj5NSfkRhPWP471x0Gok3SwqNg(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenContentKt.TermsSheetStepScreenContent(stepComponentConfig, intentId, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, list, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
