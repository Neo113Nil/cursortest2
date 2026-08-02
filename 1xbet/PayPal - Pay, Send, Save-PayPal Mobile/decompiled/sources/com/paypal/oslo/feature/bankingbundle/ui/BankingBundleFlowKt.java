package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"BankingBundleFlow", "", "flowIntent", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "bankingBundleNavigator", "Lcom/paypal/oslo/feature/bankingbundle/ui/navigation/BankingBundleNavigator;", "featureManager", "Lcom/paypal/oslo/feature/bankingbundle/manager/BankingBundleFeatureManager;", "demoEligibility", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibility;", "viewModel", "Lcom/paypal/oslo/feature/bankingbundle/ui/BankingBundleFlowViewModel;", "(Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/bankingbundle/ui/navigation/BankingBundleNavigator;Lcom/paypal/oslo/feature/bankingbundle/manager/BankingBundleFeatureManager;Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibility;Lcom/paypal/oslo/feature/bankingbundle/ui/BankingBundleFlowViewModel;Landroidx/compose/runtime/Composer;II)V", "BankingBundleFlowWithResultHandling", "(Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibility;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/bankingbundle/ui/navigation/BankingBundleNavigator;Lcom/paypal/oslo/feature/bankingbundle/manager/BankingBundleFeatureManager;Landroidx/compose/runtime/Composer;I)V", "toDomainEligibility", "Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;", "apiEligibility", "banking-bundle_prodRelease", "eligibilityState", "Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankingBundleFlowKt {
    /* JADX WARN: Removed duplicated region for block: B:169:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BankingBundleFlow(final com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent bankingBundleFlowIntent, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility, com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility2;
        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel2;
        final com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        int i4;
        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel4;
        com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel5;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleFlowIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleFeatureManager, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-765960104);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bankingBundleFlowIntent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(bankingBundleNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(bankingBundleFeatureManager) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            bankingBundleEligibility2 = bankingBundleEligibility;
            i3 |= startRestartGroup.changedInstance(bankingBundleEligibility2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    bankingBundleFlowViewModel2 = bankingBundleFlowViewModel;
                    if (startRestartGroup.changedInstance(bankingBundleFlowViewModel2)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    bankingBundleFlowViewModel2 = bankingBundleFlowViewModel;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                bankingBundleFlowViewModel2 = bankingBundleFlowViewModel;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility4 = i6 != 0 ? null : bankingBundleEligibility2;
                    if ((i2 & 32) != 0) {
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
                        i4 = i3 & (-458753);
                        bankingBundleFlowViewModel4 = (com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i4 = i3;
                        bankingBundleFlowViewModel4 = bankingBundleFlowViewModel2;
                    }
                    bankingBundleEligibility3 = bankingBundleEligibility4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i4 = i3;
                    bankingBundleEligibility3 = bankingBundleEligibility2;
                    bankingBundleFlowViewModel4 = bankingBundleFlowViewModel2;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-765960104, i4, -1, "com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlow (BankingBundleFlow.kt:67)");
                }
                final com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel6 = bankingBundleFlowViewModel4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankingBundleFlowViewModel4.getEligibilityState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean isBankingBundleEnabled = bankingBundleFeatureManager.isBankingBundleEnabled();
                boolean changedInstance = startRestartGroup.changedInstance(bankingBundleEligibility3);
                boolean changedInstance2 = startRestartGroup.changedInstance(bankingBundleFlowViewModel6);
                com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$BankingBundleFlow$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$BankingBundleFlow$1$1(bankingBundleEligibility3, bankingBundleFlowViewModel6, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(bankingBundleEligibility3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (i4 >> 12) & 14);
                if (!isBankingBundleEnabled) {
                    startRestartGroup.startReplaceGroup(444593928);
                    boolean z = (i4 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.$r8$lambda$JWGngi2JFCrXbX2EHyXITEF8Eyc(com.paypal.oslo.core.navigation.AppNavigator.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.bankingbundle.ui.BankingBundleUnavailableScreenKt.BankingBundleUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScope = startRestartGroup.endRestartGroup();
                    if (scopeUpdateScope != null) {
                        final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility5 = bankingBundleEligibility3;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.$r8$lambda$R6K7oWWK9UOLZwO06bhvFPMp4IU(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.this, appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, bankingBundleEligibility5, bankingBundleFlowViewModel6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        scopeUpdateScope.updateScope(function2);
                        return;
                    }
                    return;
                }
                startRestartGroup.startReplaceGroup(444718858);
                startRestartGroup.endReplaceGroup();
                com.paypal.oslo.feature.bankingbundle.ui.EligibilityState eligibilityState = (com.paypal.oslo.feature.bankingbundle.ui.EligibilityState) collectAsStateWithLifecycle.getValue();
                if (eligibilityState instanceof com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Loading) {
                    startRestartGroup.startReplaceGroup(444804480);
                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6);
                    bankingBundleFlowViewModel5 = bankingBundleFlowViewModel6;
                } else if (!(eligibilityState instanceof com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error)) {
                    bankingBundleFlowViewModel5 = bankingBundleFlowViewModel6;
                    if (!(eligibilityState instanceof com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success)) {
                        startRestartGroup.startReplaceGroup(-1648220279);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(445404330);
                    int i7 = com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success) eligibilityState).getEligibility().getStatus().ordinal()];
                    if (i7 == 1) {
                        startRestartGroup.startReplaceGroup(445512551);
                        boolean z2 = (i4 & 112) == 32;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.$r8$lambda$We2HhVQ3725LBpPs7xDjAu70j5o(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleUnavailableScreenKt.BankingBundleUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (i7 == 2) {
                        startRestartGroup.startReplaceGroup(445734108);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        boolean z3 = (i4 & 112) == 32;
                        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$BankingBundleFlow$7$1 rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$BankingBundleFlow$7$1(appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    } else if (i7 == 3 || i7 == 4) {
                        startRestartGroup.startReplaceGroup(446108960);
                        boolean z4 = (i4 & 896) == 256;
                        boolean changedInstance3 = startRestartGroup.changedInstance(bankingBundleFlowIntent);
                        com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$BankingBundleFlow$8$1 rememberedValue5 = startRestartGroup.rememberedValue();
                        if ((z4 | changedInstance3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$BankingBundleFlow$8$1(bankingBundleNavigator, bankingBundleFlowIntent, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(bankingBundleFlowIntent, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, i4 & 14);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1648198192);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    startRestartGroup.startReplaceGroup(444956132);
                    boolean z5 = (i4 & 112) == 32;
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (z5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.$r8$lambda$emt38oFSeJarwAGxYXQokUfi4VU(com.paypal.oslo.core.navigation.AppNavigator.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                    boolean changedInstance4 = startRestartGroup.changedInstance(bankingBundleFlowViewModel6);
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.m12221$r8$lambda$ONV0RvnxJg5aCTOTSeLe2nKKc(com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error error = (com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Error) eligibilityState;
                    bankingBundleFlowViewModel5 = bankingBundleFlowViewModel6;
                    com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt.BankingBundleErrorScreen(function0, (kotlin.jvm.functions.Function0) rememberedValue7, error.getError().getIsRetryable(), error.getError().getErrorDetail(), "banking_bundle_flow", startRestartGroup, 24576, 0);
                }
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                bankingBundleEligibility2 = bankingBundleEligibility3;
                bankingBundleFlowViewModel3 = bankingBundleFlowViewModel5;
            } else {
                startRestartGroup.skipToGroupEnd();
                bankingBundleFlowViewModel3 = bankingBundleFlowViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility6 = bankingBundleEligibility2;
                scopeUpdateScope = endRestartGroup;
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.$r8$lambda$UlpdmDcf7abLy2kftZnZ0B04M1o(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.this, appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, bankingBundleEligibility6, bankingBundleFlowViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                scopeUpdateScope.updateScope(function2);
                return;
            }
            return;
        }
        bankingBundleEligibility2 = bankingBundleEligibility;
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void BankingBundleFlowWithResultHandling(final com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent bankingBundleFlowIntent, final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, final com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleFlowIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleFeatureManager, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-302426316);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(bankingBundleFlowIntent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(bankingBundleEligibility) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(bankingBundleNavigator) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(bankingBundleFeatureManager) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-302426316, i2, -1, "com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowWithResultHandling (BankingBundleFlow.kt:143)");
            }
            int i3 = i2 >> 3;
            BankingBundleFlow(bankingBundleFlowIntent, appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, bankingBundleEligibility, null, startRestartGroup, (i3 & 7168) | (i2 & 14) | (i3 & 112) | (i3 & 896) | ((i2 << 9) & 57344), 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.m12220$r8$lambda$Litb0lCBEY_NsC2r571OpeiRFI(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.this, bankingBundleEligibility, appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility toDomainEligibility(com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility) {
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus eligibilityStatus;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason;
        java.lang.Object obj;
        java.lang.String reason;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleEligibility, "");
        int i = com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.WhenMappings.$EnumSwitchMapping$1[bankingBundleEligibility.getStatus().ordinal()];
        if (i == 1) {
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.ELIGIBLE;
        } else if (i == 2) {
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.INELIGIBLE;
        } else if (i == 3) {
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.ELIGIBLE_WITH_CONDITION;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.BUNDLE_PROVISIONED;
        }
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus eligibilityStatus2 = eligibilityStatus;
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityReason reason2 = bankingBundleEligibility.getReason();
        if (reason2 == null || (reason = reason2.getReason()) == null) {
            eligibilityReason = null;
        } else {
            java.util.Iterator<E> it = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason) obj2).name(), reason)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason2 = (com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason) obj2;
            if (eligibilityReason2 == null) {
                eligibilityReason2 = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.OTHER;
            }
            eligibilityReason = eligibilityReason2;
        }
        java.util.List<com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> products = bankingBundleEligibility.getProducts();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct bundleProduct : products) {
            java.util.Iterator<E> it2 = com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct) obj).name(), bundleProduct.name())) {
                    break;
                }
            }
            com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct bundleProduct2 = (com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct) obj;
            if (bundleProduct2 != null) {
                arrayList.add(bundleProduct2);
            }
        }
        return new com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility(eligibilityStatus2, eligibilityReason, arrayList, null, 8, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3B11PVeTAlwgDbdIAwrdAc_jKec(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4KknrxoCMuOjcJ0LoCERgTZmgJI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JWGngi2JFCrXbX2EHyXITEF8Eyc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.$r8$lambda$Se8OtVKqmNvgyjEaf_5ZqS8Rii0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Litb0lCBEY-_NsC2r571OpeiRFI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12220$r8$lambda$Litb0lCBEY_NsC2r571OpeiRFI(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent bankingBundleFlowIntent, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, int i, androidx.compose.runtime.Composer composer, int i2) {
        BankingBundleFlowWithResultHandling(bankingBundleFlowIntent, bankingBundleEligibility, appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ONV0Rvnx-Jg5aCTOTSeL-e2nKKc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12221$r8$lambda$ONV0RvnxJg5aCTOTSeLe2nKKc(com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel) {
        bankingBundleFlowViewModel.retry();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R6K7oWWK9UOLZwO06bhvFPMp4IU(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent bankingBundleFlowIntent, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility, com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BankingBundleFlow(bankingBundleFlowIntent, appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, bankingBundleEligibility, bankingBundleFlowViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Se8OtVKqmNvgyjEaf_5ZqS8Rii0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UlpdmDcf7abLy2kftZnZ0B04M1o(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent bankingBundleFlowIntent, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibility bankingBundleEligibility, com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BankingBundleFlow(bankingBundleFlowIntent, appNavigator, bankingBundleNavigator, bankingBundleFeatureManager, bankingBundleEligibility, bankingBundleFlowViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$We2HhVQ3725LBpPs7xDjAu70j5o(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.$r8$lambda$4KknrxoCMuOjcJ0LoCERgTZmgJI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$emt38oFSeJarwAGxYXQokUfi4VU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowKt.$r8$lambda$3B11PVeTAlwgDbdIAwrdAc_jKec((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.INELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.BUNDLE_PROVISIONED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.ELIGIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.INELIGIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.BUNDLE_PROVISIONED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
