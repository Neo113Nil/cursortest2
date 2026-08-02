package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aq\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"AutoSaveFullScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "source", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/SavingsAutoSaveViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/SavingsAutoSaveViewModel;Landroidx/compose/runtime/Composer;II)V", "AutoSaveFullScreenContent", "uiState", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;", "onClose", "Lkotlin/Function0;", "onSetupClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "onManageClick", "onRetry", "onDismiss", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AutoSaveFullScreenErrorContent", "errorType", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveErrorType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveFullScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:110:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoSaveFullScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        boolean changed;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        int i5;
        java.lang.Object rememberedValue2;
        boolean changed2;
        boolean z;
        boolean changed3;
        java.lang.Object rememberedValue3;
        boolean z2;
        boolean changed4;
        java.lang.Object rememberedValue4;
        java.lang.Object rememberedValue5;
        boolean z3;
        java.lang.Object rememberedValue6;
        androidx.compose.runtime.Composer composer3;
        java.lang.Object rememberedValue7;
        boolean changedInstance3;
        java.lang.Object rememberedValue8;
        boolean z4;
        boolean changed5;
        java.lang.Object rememberedValue9;
        boolean z5;
        boolean changed6;
        java.lang.Object rememberedValue10;
        boolean changedInstance4;
        java.lang.Object rememberedValue11;
        boolean changedInstance5;
        java.lang.Object rememberedValue12;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1378830470);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    savingsAutoSaveViewModel2 = savingsAutoSaveViewModel;
                    if (startRestartGroup.changedInstance(savingsAutoSaveViewModel2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    savingsAutoSaveViewModel2 = savingsAutoSaveViewModel;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                savingsAutoSaveViewModel2 = savingsAutoSaveViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = modifier2;
                } else {
                    companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
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
                        androidx.view.viewmodel.CreationExtras creationExtras = empty;
                        i4 = 0;
                        savingsAutoSaveViewModel2 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, creationExtras, startRestartGroup, 0, 0);
                        i3 &= -7169;
                        int i8 = i3;
                        androidx.compose.ui.Modifier modifier4 = companion;
                        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel4 = savingsAutoSaveViewModel2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1378830470, i8, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreen (AutoSaveFullScreen.kt:84)");
                        }
                        int i9 = i4;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.savings.LoggerKt.log, str, null, null, 6, null);
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(savingsAutoSaveViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i9);
                        final java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i9);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_setup_success_message, startRestartGroup, i9);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                        changedInstance = startRestartGroup.changedInstance(savingsAutoSaveViewModel4);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$1$1(savingsAutoSaveViewModel4, collectAsStateWithLifecycle, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        changedInstance2 = startRestartGroup.changedInstance(savingsAutoSaveViewModel4);
                        int i10 = i8 & 14;
                        i5 = i10 != 4 ? 1 : i9;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (((changedInstance2 ? 1 : 0) | i5) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$2$1(savingsAutoSaveViewModel4, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) collectAsStateWithLifecycle.getValue();
                        changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                        z = i10 != 4;
                        changed3 = startRestartGroup.changed(rememberNavResultRequestId);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!(changed2 | z | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$3$1(appNavigator, rememberNavResultRequestId, collectAsStateWithLifecycle, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(autoSaveUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                        z2 = i10 != 4;
                        changed4 = startRestartGroup.changed(stringResource);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!(z2 | changed4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$4$1(appNavigator, stringResource, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m18827invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m18827invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                        z3 = i10 != 4;
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!z3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1(appNavigator, null);
                            composer3 = startRestartGroup;
                            composer3.updateRememberedValue(rememberedValue6);
                        } else {
                            composer3 = startRestartGroup;
                        }
                        kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue6;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer3, 0);
                        rememberedValue7 = composer3.rememberedValue();
                        if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$$inlined$NavResultEffect-rtGRyWw$2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m18828invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m18828invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue7);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue7, composer3, 3072);
                        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState2 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) collectAsStateWithLifecycle.getValue();
                        changedInstance3 = composer3.changedInstance(savingsAutoSaveViewModel4);
                        rememberedValue8 = composer3.rememberedValue();
                        if (!changedInstance3 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$uspKfMFORUukmT8n6SDUkgBgOYU(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.this);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue8);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue8;
                        z4 = i10 != 4;
                        changed5 = composer3.changed(rememberNavResultRequestId);
                        rememberedValue9 = composer3.rememberedValue();
                        if (!(z4 | changed5) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$2pkFuTDq5DlYHkKLcYZzS9NZilM(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue9);
                        }
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue9;
                        z5 = i10 == 4;
                        changed6 = composer3.changed(rememberNavResultRequestId2);
                        rememberedValue10 = composer3.rememberedValue();
                        if (!(changed6 | z5) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$Cij9DNEa4Em2nVzOv0SwqU1U1Mc(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId2, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue10);
                        }
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue10;
                        changedInstance4 = composer3.changedInstance(savingsAutoSaveViewModel4);
                        rememberedValue11 = composer3.rememberedValue();
                        if (!changedInstance4 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$8n2YBo2ct12NcAMZtSNcOGWYo0Y(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.this);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue11);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue11;
                        changedInstance5 = composer3.changedInstance(savingsAutoSaveViewModel4);
                        rememberedValue12 = composer3.rememberedValue();
                        if (!changedInstance5 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$hHU_BPrUxcUwxXmgfy3nspN2AQQ(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.this);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue12);
                        }
                        composer2 = composer3;
                        AutoSaveFullScreenContent(autoSaveUiState2, function0, function1, function12, function02, (kotlin.jvm.functions.Function0) rememberedValue12, modifier4, composer2, (i8 << 12) & 3670016, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        savingsAutoSaveViewModel3 = savingsAutoSaveViewModel4;
                        modifier3 = modifier4;
                    }
                }
                i4 = 0;
                int i82 = i3;
                androidx.compose.ui.Modifier modifier42 = companion;
                final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel42 = savingsAutoSaveViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i92 = i4;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.savings.LoggerKt.log, str, null, null, 6, null);
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(savingsAutoSaveViewModel42.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                final java.lang.String rememberNavResultRequestId3 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i92);
                final java.lang.String rememberNavResultRequestId22 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i92);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_setup_success_message, startRestartGroup, i92);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
                changedInstance = startRestartGroup.changedInstance(savingsAutoSaveViewModel42);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | changedInstance)) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$1$1(savingsAutoSaveViewModel42, collectAsStateWithLifecycle2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(savingsAutoSaveViewModel42);
                int i102 = i82 & 14;
                if (i102 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance2 ? 1 : 0) | i5) == 0) {
                }
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$2$1(savingsAutoSaveViewModel42, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState3 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) collectAsStateWithLifecycle2.getValue();
                changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2);
                if (i102 != 4) {
                }
                changed3 = startRestartGroup.changed(rememberNavResultRequestId3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(changed2 | z | changed3)) {
                }
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$3$1(appNavigator, rememberNavResultRequestId3, collectAsStateWithLifecycle2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(autoSaveUiState3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                if (i102 != 4) {
                }
                changed4 = startRestartGroup.changed(stringResource2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!(z2 | changed4)) {
                }
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$4$1(appNavigator, stringResource2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue4;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId3, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                if (i102 != 4) {
                }
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (z3) {
                }
                rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1(appNavigator, null);
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue6);
                kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) rememberedValue6;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer3, 0);
                rememberedValue7 = composer3.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId22, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue7, composer3, 3072);
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState22 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) collectAsStateWithLifecycle2.getValue();
                changedInstance3 = composer3.changedInstance(savingsAutoSaveViewModel42);
                rememberedValue8 = composer3.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$uspKfMFORUukmT8n6SDUkgBgOYU(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.this);
                    }
                };
                composer3.updateRememberedValue(rememberedValue8);
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue8;
                if (i102 != 4) {
                }
                changed5 = composer3.changed(rememberNavResultRequestId3);
                rememberedValue9 = composer3.rememberedValue();
                if (!(z4 | changed5)) {
                }
                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$2pkFuTDq5DlYHkKLcYZzS9NZilM(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId3, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                composer3.updateRememberedValue(rememberedValue9);
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue9;
                if (i102 == 4) {
                }
                changed6 = composer3.changed(rememberNavResultRequestId22);
                rememberedValue10 = composer3.rememberedValue();
                if (!(changed6 | z5)) {
                }
                rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$Cij9DNEa4Em2nVzOv0SwqU1U1Mc(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId22, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                composer3.updateRememberedValue(rememberedValue10);
                kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue10;
                changedInstance4 = composer3.changedInstance(savingsAutoSaveViewModel42);
                rememberedValue11 = composer3.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$8n2YBo2ct12NcAMZtSNcOGWYo0Y(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.this);
                    }
                };
                composer3.updateRememberedValue(rememberedValue11);
                kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue11;
                changedInstance5 = composer3.changedInstance(savingsAutoSaveViewModel42);
                rememberedValue12 = composer3.rememberedValue();
                if (!changedInstance5) {
                }
                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$hHU_BPrUxcUwxXmgfy3nspN2AQQ(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel.this);
                    }
                };
                composer3.updateRememberedValue(rememberedValue12);
                composer2 = composer3;
                AutoSaveFullScreenContent(autoSaveUiState22, function03, function13, function122, function022, (kotlin.jvm.functions.Function0) rememberedValue12, modifier42, composer2, (i82 << 12) & 3670016, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                savingsAutoSaveViewModel3 = savingsAutoSaveViewModel42;
                modifier3 = modifier42;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                savingsAutoSaveViewModel3 = savingsAutoSaveViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.m18826$r8$lambda$kiglV3SOOQMafxtqvz5E9Pyn0(com.paypal.oslo.core.navigation.AppNavigator.this, str, modifier3, savingsAutoSaveViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoSaveFullScreenContent(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1823229654);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(autoSaveUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1823229654, i3, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenContent (AutoSaveFullScreen.kt:191)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.AutoSaveFullScreen.SCREEN);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getFULLSCREEN_CLOSE()), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.AutoSaveFullScreen.TOP_BAR), null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-198402519, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$XPRN5oQJkVYQLLPHGYgWX40bi9I(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 1572870, 60);
                if (autoSaveUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Loading) {
                    startRestartGroup.startReplaceGroup(146867485);
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.AutoSaveFullScreen.LOADING);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.Modifier.INSTANCE, null, null, null, startRestartGroup, 6, 14);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                    if (autoSaveUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup) {
                        composer2.startReplaceGroup(147279723);
                        composer2.endReplaceGroup();
                    } else if (autoSaveUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded) {
                        composer2.startReplaceGroup(147513773);
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                        int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1708paddingVpY3zN4$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save, composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.AutoSaveFullScreen.HEADER), (java.lang.String) null, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Left, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, 24624, 108);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), composer2, 0);
                        int i5 = i3 >> 3;
                        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveGoalsContentKt.AutoSaveGoalsContent(((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.GoalsLoaded) autoSaveUiState).getGoals(), function1, function12, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.AutoSaveFullScreen.GOALS_CONTENT), composer2, (i5 & 112) | 3072 | (i5 & 896), 0);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        if (!(autoSaveUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error)) {
                            composer2.startReplaceGroup(281832092);
                            composer2.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(148579057);
                        int i6 = i3 >> 9;
                        getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error) autoSaveUiState).getErrorType(), function02, function03, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.AutoSaveFullScreen.ERROR_CONTENT), composer2, (i6 & 112) | 3072 | (i6 & 896), 0);
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.m18825$r8$lambda$Sf8wX2Bc1rNzJLzzEFmOxxS4o(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.this, function0, function1, function12, function02, function03, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType autoSaveErrorType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1371098891);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(autoSaveErrorType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1371098891, i3, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenErrorContent (AutoSaveFullScreen.kt:270)");
                }
                if (autoSaveErrorType instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.NetworkError) {
                    startRestartGroup.startReplaceGroup(-1267839576);
                    com.paypal.oslo.feature.savings.ui.basescreen.SavingsAccountErrorScreenKt.SavingsAccountErrorScreen(com.paypal.pds.core.Icon.Information.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_service_unavailable, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_retry, startRestartGroup, 0), function0, modifier3, null, null, startRestartGroup, ((i3 << 6) & 7168) | 6 | ((i3 << 3) & 57344), 96);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(autoSaveErrorType instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.GraphQLError) && !(autoSaveErrorType instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.UnknownError) && !(autoSaveErrorType instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.NoGoalsFound)) {
                        startRestartGroup.startReplaceGroup(928931820);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1267340259);
                    int i5 = i3 << 3;
                    com.paypal.oslo.feature.savings.ui.basescreen.SavingsAccountErrorScreenKt.SavingsAccountErrorScreen(com.paypal.pds.core.Icon.Information.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_service_unavailable, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_ok, startRestartGroup, 0), function02, modifier3, null, function02, startRestartGroup, (57344 & i5) | (i5 & 7168) | 6 | ((i3 << 12) & 3670016), 32);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.m18824$r8$lambda$GZUCstVBGU0ZN9CRBr3mGyvfc(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.this, function0, function02, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$1jeQzqFFcQFVHiihXG-a5Oy2i-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18823$r8$lambda$1jeQzqFFcQFVHiihXGa5Oy2i8(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.AutoSaveManageDestination(goalSummaryDTO, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2pkFuTDq5DlYHkKLcYZzS9NZilM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.$r8$lambda$8RI_oSBb_tfThVUekTDM9msUTHc(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8RI_oSBb_tfThVUekTDM9msUTHc(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination(goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE, (java.lang.String) null, (java.lang.String) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8n2YBo2ct12NcAMZtSNcOGWYo0Y(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel) {
        savingsAutoSaveViewModel.fetchGoals(true);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Cij9DNEa4Em2nVzOv0SwqU1U1Mc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.m18823$r8$lambda$1jeQzqFFcQFVHiihXGa5Oy2i8(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GZUCstV-BGU0ZN9CRBr-3mGyvfc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18824$r8$lambda$GZUCstVBGU0ZN9CRBr3mGyvfc(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType autoSaveErrorType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(autoSaveErrorType, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Sf8wX2Bc1r-Nz-JLzzEFmOxxS4o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18825$r8$lambda$Sf8wX2Bc1rNzJLzzEFmOxxS4o(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState autoSaveUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoSaveFullScreenContent(autoSaveUiState, function0, function1, function12, function02, function03, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XPRN5oQJkVYQLLPHGYgWX40bi9I(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-198402519, i, -1, "com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenContent.<anonymous>.<anonymous>.<anonymous> (AutoSaveFullScreen.kt:203)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hHU_BPrUxcUwxXmgfy3nspN2AQQ(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel) {
        savingsAutoSaveViewModel.onCancelled();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kiglV-3SOOQM-afxtqvz5E9Pyn0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18826$r8$lambda$kiglV3SOOQMafxtqvz5E9Pyn0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoSaveFullScreen(appNavigator, str, modifier, savingsAutoSaveViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uspKfMFORUukmT8n6SDUkgBgOYU(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel) {
        savingsAutoSaveViewModel.onCancelled();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState access$AutoSaveFullScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState) state.getValue();
    }
}
