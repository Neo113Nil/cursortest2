package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0014\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001bX\u008a\u008e\u0002"}, d2 = {"SavingsEditGoalScreen", "", "goal", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalViewModel;", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalViewModel;Landroidx/compose/runtime/Composer;II)V", "SavingsEditGoalContent", "state", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;", "(Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SavingsEditGoalScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "SavingsEditGoalScreenLoadingPreview", "SavingsEditGoalScreenNoTargetPreview", "SavingsEditGoalContentTestWrapper", "toErrorMessage", "", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "(Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "savings_prodRelease", "showNetworkErrorScreen", "", "showServiceUnavailableScreen"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsEditGoalScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsEditGoalScreen(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        androidx.compose.runtime.State collectAsStateWithLifecycle;
        boolean changed;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue3;
        androidx.compose.runtime.MutableState mutableState2;
        kotlin.Unit unit;
        boolean changedInstance;
        boolean changed2;
        java.lang.Object rememberedValue4;
        kotlin.Unit unit2;
        final androidx.compose.runtime.MutableState mutableState3;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(403740732);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(goalSummaryDTO) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    savingsEditGoalViewModel2 = savingsEditGoalViewModel;
                    if (startRestartGroup.changedInstance(savingsEditGoalViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    savingsEditGoalViewModel2 = savingsEditGoalViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                savingsEditGoalViewModel2 = savingsEditGoalViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
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
                        i4 = i3 & (-897);
                        savingsEditGoalViewModel3 = (com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(403740732, i4, -1, "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreen (SavingsEditGoalScreen.kt:77)");
                        }
                        appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
                        savingsEditGoalViewModel3.initialize(goalSummaryDTO);
                        collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(savingsEditGoalViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        boolean isLoading = ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState) collectAsStateWithLifecycle.getValue()).isLoading();
                        changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$1$1(collectAsStateWithLifecycle, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isLoading), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                        unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(savingsEditGoalViewModel3);
                        changed2 = startRestartGroup.changed(appNavigator);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((!changedInstance && !changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            unit2 = unit;
                            mutableState3 = mutableState;
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1(savingsEditGoalViewModel3, appNavigator, mutableState, mutableState2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        } else {
                            unit2 = unit;
                            mutableState3 = mutableState;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                        if (!((java.lang.Boolean) mutableState3.getValue()).booleanValue()) {
                            startRestartGroup.startReplaceGroup(1933640152);
                            com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_service_unavailable, startRestartGroup, 0);
                            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_retry, startRestartGroup, 0);
                            com.paypal.pds.core.Icon.Warning warning2 = warning;
                            boolean changedInstance2 = startRestartGroup.changedInstance(savingsEditGoalViewModel3);
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$703MPbL3832rW45wSelck162v1c(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel.this, mutableState3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                            boolean changed3 = startRestartGroup.changed(appNavigator);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$67ROMiyzkRxPz4BKAivxxRirZ2k(com.paypal.oslo.core.navigation.AppNavigator.this, mutableState3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            com.paypal.oslo.feature.savings.ui.basescreen.SavingsAccountErrorScreenKt.SavingsAccountErrorScreen(warning2, stringResource, stringResource2, function0, modifier3, null, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, ((i4 << 9) & 57344) | 6, 32);
                            startRestartGroup.endReplaceGroup();
                        } else if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                            startRestartGroup.startReplaceGroup(1934413943);
                            com.paypal.pds.core.Icon.Warning warning3 = com.paypal.pds.core.Icon.Warning.INSTANCE;
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_service_unavailable, startRestartGroup, 0);
                            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_ok, startRestartGroup, 0);
                            com.paypal.pds.core.Icon.Warning warning4 = warning3;
                            boolean changed4 = startRestartGroup.changed(appNavigator);
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (changed4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda19
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18769$r8$lambda$0TEv8SPjW0izOU1v5Bpc_qpfDc(com.paypal.oslo.core.navigation.AppNavigator.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue7;
                            boolean changed5 = startRestartGroup.changed(appNavigator);
                            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if (changed5 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda20
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$YfROXgxPLxpUA0rdzm0S6zPGhc4(com.paypal.oslo.core.navigation.AppNavigator.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            com.paypal.oslo.feature.savings.ui.basescreen.SavingsAccountErrorScreenKt.SavingsAccountErrorScreen(warning4, stringResource3, stringResource4, function02, modifier3, null, (kotlin.jvm.functions.Function0) rememberedValue8, startRestartGroup, ((i4 << 9) & 57344) | 6, 32);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1935015250);
                            com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState = (com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState) collectAsStateWithLifecycle.getValue();
                            boolean changedInstance3 = startRestartGroup.changedInstance(savingsEditGoalViewModel3);
                            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (changedInstance3 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$7$1(savingsEditGoalViewModel3);
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                            }
                            getHighResolutionOutputSizeshNQ4ISI(savingsEditGoalState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue9), modifier3, startRestartGroup, (i4 << 3) & 896, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }
                i4 = i3;
                savingsEditGoalViewModel3 = savingsEditGoalViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
                savingsEditGoalViewModel3.initialize(goalSummaryDTO);
                collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(savingsEditGoalViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean isLoading2 = ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState) collectAsStateWithLifecycle.getValue()).isLoading();
                changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$1$1(collectAsStateWithLifecycle, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isLoading2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(savingsEditGoalViewModel3);
                changed2 = startRestartGroup.changed(appNavigator);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!(changedInstance | changed2)) {
                }
                unit2 = unit;
                mutableState3 = mutableState;
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1(savingsEditGoalViewModel3, appNavigator, mutableState, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                if (!((java.lang.Boolean) mutableState3.getValue()).booleanValue()) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                savingsEditGoalViewModel3 = savingsEditGoalViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18776$r8$lambda$RdWKTIenbYL_oDt0OjVUsYMsxo(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, modifier4, savingsEditGoalViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(267167791);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(savingsEditGoalState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(267167791, i4, -1, "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalContent (SavingsEditGoalScreen.kt:185)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.SCREEN);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_edit_goal_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.TOP_BAR), null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1996387765, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$AQzQPq_gM5ITvdU7CwuVyy3GX5E(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 196656, 92);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.SCROLLABLE_CONTENT);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.EditGoal.INSTANCE.getNAME_ZONE());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, module);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String goalName = savingsEditGoalState.getGoalName();
                int i6 = i4 & 112;
                boolean z = i6 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18777$r8$lambda$aMEzxaI4LoDQ6BVvZ9JQYnn1Qw(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommonKt.ValidatedTextInput(goalName, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_name_label, startRestartGroup, 0), getHighSpeedVideoSizes(savingsEditGoalState.getValidationError(), startRestartGroup), null, !savingsEditGoalState.isLoading(), com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.GOAL_NAME_INPUT, null, null, 127, startRestartGroup, 806879232, 400);
                startRestartGroup.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                androidx.compose.ui.Modifier module2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.EditGoal.INSTANCE.getTARGET_ZONE());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, module2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String targetAmount = savingsEditGoalState.getTargetAmount();
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_target_amount_label, startRestartGroup, 0);
                java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(savingsEditGoalState.getTargetAmountError(), startRestartGroup);
                androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                boolean isLoading = savingsEditGoalState.isLoading();
                boolean z2 = i6 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$75z4L9e8RLFNRp6QlWGGmIchEAE(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommonKt.ValidatedTextInput(targetAmount, (kotlin.jvm.functions.Function1) rememberedValue2, stringResource, highSpeedVideoSizes, null, !isLoading, com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.TARGET_AMOUNT_INPUT, keyboardOptions, "USD", null, startRestartGroup, 114819072, 528);
                startRestartGroup.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                startRestartGroup.endNode();
                androidx.compose.foundation.layout.PaddingValues asPaddingValues = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_save, startRestartGroup, 0);
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                boolean z3 = savingsEditGoalState.isSaveEnabled() && !savingsEditGoalState.isLoading();
                boolean isLoading2 = savingsEditGoalState.isLoading();
                androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), asPaddingValues.getBottom()), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.EditGoal.INSTANCE.getSAVE_BUTTON()), com.paypal.oslo.feature.savings.ui.testtags.GoalsTestTags.EditGoal.SAVE_BUTTON);
                boolean z4 = i6 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$AN2V442170ckuUmhl2zr5NtZMWc(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource2, testTag3, null, null, null, large, z3, isLoading2, startRestartGroup, 1572864, 56);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18771$r8$lambda$6_cV78o3bW_5UkyePhvw_NG14c(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SavingsEditGoalContentTestWrapper(final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsEditGoalState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(578535568);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(savingsEditGoalState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(578535568, i3, -1, "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalContentTestWrapper (SavingsEditGoalScreen.kt:323)");
            }
            getHighResolutionOutputSizeshNQ4ISI(savingsEditGoalState, function1, modifier, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18770$r8$lambda$40vXh_T95cjCiqSmP9bagF7b0(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState.this, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final java.lang.String getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError goalValidationError, androidx.compose.runtime.Composer composer) {
        java.lang.String str;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1095774418, 0, -1, "com.paypal.oslo.feature.savings.ui.goals.editgoal.toErrorMessage (SavingsEditGoalScreen.kt:338)");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(goalValidationError, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.EmptyGoalName.INSTANCE)) {
            composer.startReplaceGroup(772232170);
            str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_name_error, composer, 0);
            composer.endReplaceGroup();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(goalValidationError, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.DuplicateGoalName.INSTANCE)) {
            composer.startReplaceGroup(772235572);
            str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_goal_name_duplicate_error, composer, 0);
            composer.endReplaceGroup();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(goalValidationError, com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.TargetAmountBelowMinimum.INSTANCE)) {
            composer.startReplaceGroup(772239502);
            str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_target_amount_error, composer, 0);
            composer.endReplaceGroup();
        } else if (goalValidationError == null) {
            composer.startReplaceGroup(-1830304565);
            composer.endReplaceGroup();
            str = null;
        } else {
            composer.startReplaceGroup(772230601);
            composer.endReplaceGroup();
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return str;
    }

    /* renamed from: $r8$lambda$0TEv8SPjW0izOU1v5Bpc_qpf-Dc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18769$r8$lambda$0TEv8SPjW0izOU1v5Bpc_qpfDc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$rZ_gL8j_yPwurfJxzsP3H0TqzR4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$40vXh_T95cjCiqSmP-9bagF-7b0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18770$r8$lambda$40vXh_T95cjCiqSmP9bagF7b0(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsEditGoalContentTestWrapper(savingsEditGoalState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$67ROMiyzkRxPz4BKAivxxRirZ2k(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18775$r8$lambda$LCGYJqU5nTTvCjN9Uwy_mSEDNI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6_cV78o3bW_-5UkyePhvw_NG14c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18771$r8$lambda$6_cV78o3bW_5UkyePhvw_NG14c(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(savingsEditGoalState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$703MPbL3832rW45wSelck162v1c(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        savingsEditGoalViewModel.processIntent(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.SaveClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$75z4L9e8RLFNRp6QlWGGmIchEAE(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.TargetAmountChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$83Ydrh8_1fnZU-QtNHJk7MasHkk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18772$r8$lambda$83Ydrh8_1fnZUQtNHJk7MasHkk(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent savingsEditGoalIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsEditGoalIntent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AN2V442170ckuUmhl2zr5NtZMWc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.SaveClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AQzQPq_gM5ITvdU7CwuVyy3GX5E(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1996387765, i, -1, "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalContent.<anonymous>.<anonymous> (SavingsEditGoalScreen.kt:195)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$_X3mUKD8w7TwmXr_spJsbC_niUI(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Av-LJobuFI-DUJndvlMBenhF7ik, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18773$r8$lambda$AvLJobuFIDUJndvlMBenhF7ik(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-850382049);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-850382049, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenPreview (SavingsEditGoalScreen.kt:273)");
            }
            com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState("1", "Travel", "500.00", null, null, false, true, null, null, 440, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18779$r8$lambda$woRo_kirA3RDTsW7EYziOLAriQ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighResolutionOutputSizeshNQ4ISI(savingsEditGoalState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18773$r8$lambda$AvLJobuFIDUJndvlMBenhF7ik(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D288j4YpyrORh-DHspq_KAKx9ok, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18774$r8$lambda$D288j4YpyrORhDHspq_KAKx9ok(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-720918677);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-720918677, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenLoadingPreview (SavingsEditGoalScreen.kt:287)");
            }
            com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState("1", "Travel", "500.00", null, null, true, false, null, null, 408, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18778$r8$lambda$uJ0NFZv9ptvYKkvs2J3JWf32Z4((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighResolutionOutputSizeshNQ4ISI(savingsEditGoalState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18774$r8$lambda$D288j4YpyrORhDHspq_KAKx9ok(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LCGYJqU-5nTTvCjN9Uwy_mSEDNI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18775$r8$lambda$LCGYJqU5nTTvCjN9Uwy_mSEDNI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RdWKTIenbYL_oDt0OjVUsYM-sxo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18776$r8$lambda$RdWKTIenbYL_oDt0OjVUsYMsxo(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsEditGoalScreen(goalSummaryDTO, modifier, savingsEditGoalViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YfROXgxPLxpUA0rdzm0S6zPGhc4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$k6KLfoWRpf67x4XxcImryQ2BeGk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_X3mUKD8w7TwmXr_spJsbC_niUI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aMEzxaI4L-oDQ6BVvZ9JQYnn1Qw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18777$r8$lambda$aMEzxaI4LoDQ6BVvZ9JQYnn1Qw(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent.GoalNameChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k6KLfoWRpf67x4XxcImryQ2BeGk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rZ_gL8j_yPwurfJxzsP3H0TqzR4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uJ0NFZv9ptvY-Kkvs2J3JWf32Z4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18778$r8$lambda$uJ0NFZv9ptvYKkvs2J3JWf32Z4(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent savingsEditGoalIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsEditGoalIntent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wiHDuBBJ7CJogCweqXTxd8h456I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2101469555);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2101469555, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenNoTargetPreview (SavingsEditGoalScreen.kt:302)");
            }
            com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState("1", "General Savings", "", null, null, false, true, null, null, 440, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.m18772$r8$lambda$83Ydrh8_1fnZUQtNHJk7MasHkk((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighResolutionOutputSizeshNQ4ISI(savingsEditGoalState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt.$r8$lambda$wiHDuBBJ7CJogCweqXTxd8h456I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$woRo_kirA3RDTsW-7EYziOLAriQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18779$r8$lambda$woRo_kirA3RDTsW7EYziOLAriQ(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent savingsEditGoalIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsEditGoalIntent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState access$SavingsEditGoalScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState) state.getValue();
    }
}
