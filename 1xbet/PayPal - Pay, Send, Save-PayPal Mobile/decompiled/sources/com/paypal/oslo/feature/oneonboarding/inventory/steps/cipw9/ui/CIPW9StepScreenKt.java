package com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"CIPW9StepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/ui/navigation/CIPW9Destination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "stepViewModel", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/ui/CIPW9StepViewModel;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/ui/navigation/CIPW9Destination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/ui/CIPW9StepViewModel;Landroidx/compose/runtime/Composer;II)V", "CIPW9StepScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CIPW9StepScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CIPW9StepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.navigation.CIPW9Destination cIPW9Destination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel cIPW9StepViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel cIPW9StepViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel cIPW9StepViewModel3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel cIPW9StepViewModel4;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel cIPW9StepViewModel5;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.oneonboarding.domain.Flow flow;
        java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> contextualInfo;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cIPW9Destination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1360526867);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(cIPW9Destination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingFlowViewModel) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    cIPW9StepViewModel2 = cIPW9StepViewModel;
                    if (startRestartGroup.changedInstance(cIPW9StepViewModel2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    cIPW9StepViewModel2 = cIPW9StepViewModel;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                cIPW9StepViewModel2 = cIPW9StepViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    modifier4 = modifier2;
                    cIPW9StepViewModel5 = cIPW9StepViewModel2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        cIPW9StepViewModel4 = (com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i3 &= -57345;
                    } else {
                        cIPW9StepViewModel4 = cIPW9StepViewModel2;
                    }
                    i4 = i3;
                    modifier4 = companion;
                    cIPW9StepViewModel5 = cIPW9StepViewModel4;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1360526867, i4, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreen (CIPW9StepScreen.kt:50)");
                }
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(oneOnboardingFlowViewModel.getUiState(), null, startRestartGroup, 0, 1).getValue();
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content content = oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content ? (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content) oneOnboardingUiState : null;
                final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list = (content == null || (flow = content.getFlow()) == null || (contextualInfo = flow.getContextualInfo()) == null) ? null : contextualInfo.get(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(cIPW9Destination.getStepComponentConfig().mo16702getIdfHLlpbY()));
                final com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel cIPW9StepViewModel6 = cIPW9StepViewModel5;
                final androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(cIPW9Destination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2131845612, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt.$r8$lambda$S1yVLvD6isCThhJgmu0d6uElGXE(com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.navigation.CIPW9Destination.this, cIPW9StepViewModel6, oneOnboardingFlowViewModel, modifier5, list, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i4 & 112) | 3072 | (i4 & 896), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                cIPW9StepViewModel3 = cIPW9StepViewModel5;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                cIPW9StepViewModel3 = cIPW9StepViewModel2;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt.$r8$lambda$cy6hh81avVysSoVYDmMS38tiKJY(com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.navigation.CIPW9Destination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier3, cIPW9StepViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LUHWMEbZUrBrKVO8EV9ceGKPpu8(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1531549320);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1531549320, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenContentPreview (CIPW9StepScreen.kt:80)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.domain.CIPW9StepComponentConfig cIPW9StepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.domain.CIPW9StepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-cipw9-step"), kotlin.collections.CollectionsKt.emptyList(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle bankingBundle = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle(null, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt.$r8$lambda$Vp4LDo8spLbl4JuF5OaOBHoTG6k((com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenContentKt.CIPW9StepScreenContent(cIPW9StepComponentConfig, bankingBundle, function1, (kotlin.jvm.functions.Function0) rememberedValue2, new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder(), null, null, null, null, null, startRestartGroup, 3456, 992);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt.$r8$lambda$LUHWMEbZUrBrKVO8EV9ceGKPpu8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S1yVLvD6isCThhJgmu0d6uElGXE(com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.navigation.CIPW9Destination cIPW9Destination, com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel cIPW9StepViewModel, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, java.util.List list, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2131845612, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreen.<anonymous> (CIPW9StepScreen.kt:61)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.domain.CIPW9StepComponentConfig stepComponentConfig = cIPW9Destination.getStepComponentConfig();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = cIPW9Destination.getIntentId();
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder = cIPW9StepViewModel.getAddressCollectionStateHolder();
            androidx.compose.runtime.MutableState<com.paypal.oslo.core.i18n.domain.model.Address> selectedAddressState = cIPW9StepViewModel.getSelectedAddressState();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt.m16731$r8$lambda$x9wiRuMe508ASCjyqCA1P_bm_c(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, (com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenKt.$r8$lambda$zaDsdc9_JSpV9epDsmvXeA9X2xE(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepScreenContentKt.CIPW9StepScreenContent(stepComponentConfig, intentId, function1, (kotlin.jvm.functions.Function0) rememberedValue2, addressCollectionStateHolder, modifier, list, null, null, selectedAddressState, composer, 0, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vp4LDo8spLbl4JuF5OaOBHoTG6k(com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cy6hh81avVysSoVYDmMS38tiKJY(com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.navigation.CIPW9Destination cIPW9Destination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9StepViewModel cIPW9StepViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CIPW9StepScreen(cIPW9Destination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, cIPW9StepViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$x9wiRuMe508A-SCjyqCA1P_bm_c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16731$r8$lambda$x9wiRuMe508ASCjyqCA1P_bm_c(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        oneOnboardingFlowViewModel.contributeCollectedItem(collectedItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zaDsdc9_JSpV9epDsmvXeA9X2xE(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepForward();
        return kotlin.Unit.INSTANCE;
    }
}
