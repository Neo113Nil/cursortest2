package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, d2 = {"InstantBankConfirmationRouterScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "config", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationRouterViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationRouterViewModel;Landroidx/compose/runtime/Composer;II)V", "toInstantBankConfirmationFlowNavResult", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult$Outcome;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "toInstantBankConfirmationFlowReason", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult$CancellationReason;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$CancellationReason;", "wallet_prodRelease", "navigateEvent", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InstantBankConfirmationRouterScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public static final void InstantBankConfirmationRouterScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig, final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel3;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        boolean z;
        int i4;
        int i5;
        com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel4;
        int i6;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        ?? r1;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel5;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel5;
        java.lang.String str;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIAnalyticsContext, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1628249219);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = 32;
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(confirmBankConfig) : startRestartGroup.changedInstance(confirmBankConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(addFIAnalyticsContext) : startRestartGroup.changedInstance(addFIAnalyticsContext) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                bankSharedViewModel2 = bankSharedViewModel;
                if (startRestartGroup.changedInstance(bankSharedViewModel2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                bankSharedViewModel2 = bankSharedViewModel;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            bankSharedViewModel2 = bankSharedViewModel;
        }
        if ((i & 24576) == 0) {
            instantBankConfirmationRouterViewModel2 = instantBankConfirmationRouterViewModel;
            i3 |= ((i2 & 16) == 0 && startRestartGroup.changedInstance(instantBankConfirmationRouterViewModel2)) ? 16384 : 8192;
        } else {
            instantBankConfirmationRouterViewModel2 = instantBankConfirmationRouterViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                    kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                    androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, startRestartGroup, 0);
                    if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
                    } else {
                        empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    z = false;
                    i4 = 256;
                    i3 &= -7169;
                    i8 = 32;
                    bankSharedViewModel2 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                } else {
                    z = false;
                    i4 = 256;
                }
                if ((i2 & 16) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, z ? 1 : 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    i5 = i8;
                    com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel6 = (com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl.class), current, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                    i6 = i3 & (-57345);
                    bankSharedViewModel4 = bankSharedViewModel2;
                    instantBankConfirmationRouterViewModel4 = instantBankConfirmationRouterViewModel6;
                    r1 = z;
                } else {
                    i5 = i8;
                    instantBankConfirmationRouterViewModel4 = instantBankConfirmationRouterViewModel;
                    i6 = i3;
                    bankSharedViewModel4 = bankSharedViewModel2;
                    r1 = z;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                r1 = 0;
                i4 = 256;
                i5 = 32;
                bankSharedViewModel4 = bankSharedViewModel2;
                instantBankConfirmationRouterViewModel4 = instantBankConfirmationRouterViewModel2;
                i6 = i3;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1628249219, i6, -1, "com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreen (InstantBankConfirmationRouterScreen.kt:37)");
            }
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, r1);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean z2 = ((i6 & 112) == i5 || ((i6 & 64) != 0 && startRestartGroup.changedInstance(confirmBankConfig))) ? true : r1;
            boolean changedInstance = startRestartGroup.changedInstance(bankSharedViewModel4);
            boolean z3 = ((i6 & 896) == i4 || ((i6 & 512) != 0 && startRestartGroup.changedInstance(addFIAnalyticsContext))) ? true : r1;
            boolean changedInstance2 = startRestartGroup.changedInstance(instantBankConfirmationRouterViewModel4);
            com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((z3 | z2 | changedInstance) || changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                bankSharedViewModel5 = bankSharedViewModel4;
                composer3 = startRestartGroup;
                rememberedValue = new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$1$1(confirmBankConfig, bankSharedViewModel4, addFIAnalyticsContext, instantBankConfirmationRouterViewModel4, null);
                composer3.updateRememberedValue(rememberedValue);
            } else {
                bankSharedViewModel5 = bankSharedViewModel4;
                composer3 = startRestartGroup;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer3, 6);
            com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel7 = instantBankConfirmationRouterViewModel4;
            androidx.compose.runtime.Composer composer5 = composer3;
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(instantBankConfirmationRouterViewModel4.getNavEvent(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer3, 0, 7);
            com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent instantBankConfirmationNavEvent = (com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent) collectAsStateWithLifecycle.getValue();
            boolean changed = composer5.changed(collectAsStateWithLifecycle);
            boolean z4 = (i6 & 14) == 4;
            boolean changed2 = composer5.changed(rememberNavResultRequestId);
            boolean changedInstance3 = composer5.changedInstance(instantBankConfirmationRouterViewModel7);
            com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1 rememberedValue2 = composer5.rememberedValue();
            if (((changed2 | changed | z4) || changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer4 = composer5;
                instantBankConfirmationRouterViewModel5 = instantBankConfirmationRouterViewModel7;
                str = rememberNavResultRequestId;
                rememberedValue2 = new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1(appNavigator, rememberNavResultRequestId, instantBankConfirmationRouterViewModel7, collectAsStateWithLifecycle, null);
                composer4.updateRememberedValue(rememberedValue2);
            } else {
                composer4 = composer5;
                instantBankConfirmationRouterViewModel5 = instantBankConfirmationRouterViewModel7;
                str = rememberNavResultRequestId;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(instantBankConfirmationNavEvent, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer4, 0);
            boolean changedInstance4 = composer4.changedInstance(instantBankConfirmationRouterViewModel5);
            com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$3$1 rememberedValue3 = composer4.rememberedValue();
            if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$3$1(instantBankConfirmationRouterViewModel5, null);
                composer4.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer4, 0);
            com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue4 = composer4.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20941invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20941invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                composer4.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel8 = instantBankConfirmationRouterViewModel5;
            composer2 = composer4;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, composer4, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            instantBankConfirmationRouterViewModel3 = instantBankConfirmationRouterViewModel8;
            bankSharedViewModel3 = bankSharedViewModel5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            instantBankConfirmationRouterViewModel3 = instantBankConfirmationRouterViewModel;
            bankSharedViewModel3 = bankSharedViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt.$r8$lambda$CR7HToZNKj7aZ_T4Q1cDwjVJ04E(com.paypal.oslo.core.navigation.AppNavigator.this, confirmBankConfig, addFIAnalyticsContext, bankSharedViewModel3, instantBankConfirmationRouterViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CR7HToZNKj7aZ_T4Q1cDwjVJ04E(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InstantBankConfirmationRouterScreen(appNavigator, confirmBankConfig, addFIAnalyticsContext, bankSharedViewModel, instantBankConfirmationRouterViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent access$InstantBankConfirmationRouterScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent) state.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome access$toInstantBankConfirmationFlowNavResult(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult) {
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.CancellationReason.UserSkippedFlow userSkippedFlow;
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome = bankFlowNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled) {
            com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason reason = ((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled) bankFlowNavResult.getOutcome()).getReason();
            if (kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE)) {
                userSkippedFlow = com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE)) {
                userSkippedFlow = com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                userSkippedFlow = com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE;
            }
            return new com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Cancelled(userSkippedFlow);
        }
        if (outcome instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) {
            return new com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Error(((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) bankFlowNavResult.getOutcome()).getErrorMessage(), ((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) bankFlowNavResult.getOutcome()).getErrorCode());
        }
        if (!(outcome instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Success((com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount) kotlin.collections.CollectionsKt.first((java.util.List) ((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success) bankFlowNavResult.getOutcome()).getLinkedBankAccounts()), ((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success) bankFlowNavResult.getOutcome()).getSuccessMessage());
    }
}
