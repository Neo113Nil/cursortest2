package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ManualAddBankRouter", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManualAddBankRouterKt {
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014f, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManualAddBankRouter(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.MutableState mutableState;
        int i5;
        boolean changedInstance;
        java.lang.Object obj;
        com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-701484729);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                bankSharedViewModel2 = bankSharedViewModel;
                if (startRestartGroup.changedInstance(bankSharedViewModel2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                bankSharedViewModel2 = bankSharedViewModel;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            bankSharedViewModel2 = bankSharedViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                    kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                    androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, startRestartGroup, 0);
                    if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    i4 = 0;
                    bankSharedViewModel3 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i7 &= -113;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-701484729, i7, -1, "com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouter (ManualAddBankRouter.kt:32)");
                    }
                    java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                    java.lang.Object[] objArr = new java.lang.Object[i4];
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                androidx.compose.runtime.MutableState mutableStateOf$default;
                                mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                return mutableStateOf$default;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                    if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                        startRestartGroup.startReplaceGroup(1379658098);
                        mutableState.setValue(java.lang.Boolean.TRUE);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        int i8 = (i7 & 14) == 4 ? 1 : i4;
                        boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
                        com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                        if (((changed ? 1 : 0) | i8) != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$1$1(appNavigator, rememberNavResultRequestId, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1379851259);
                        startRestartGroup.endReplaceGroup();
                    }
                    i5 = (i7 & 14) != 4 ? i4 : 1;
                    changedInstance = startRestartGroup.changedInstance(bankSharedViewModel3);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i5) == 0) {
                        obj = rememberedValue4;
                    }
                    com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1 manualAddBankRouterKt$ManualAddBankRouter$2$1 = new com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1(appNavigator, bankSharedViewModel3, null);
                    startRestartGroup.updateRememberedValue(manualAddBankRouterKt$ManualAddBankRouter$2$1);
                    obj = manualAddBankRouterKt$ManualAddBankRouter$2$1;
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) obj;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$$inlined$NavResultEffect-rtGRyWw$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                return m20943invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                            }

                            /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                            public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20943invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                i4 = 0;
                bankSharedViewModel3 = bankSharedViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                java.lang.Object[] objArr2 = new java.lang.Object[i4];
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr2, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                }
                if ((i7 & 14) != 4) {
                }
                changedInstance = startRestartGroup.changedInstance(bankSharedViewModel3);
                java.lang.Object rememberedValue42 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i5) == 0) {
                }
                com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1 manualAddBankRouterKt$ManualAddBankRouter$2$12 = new com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1(appNavigator, bankSharedViewModel3, null);
                startRestartGroup.updateRememberedValue(manualAddBankRouterKt$ManualAddBankRouter$2$12);
                obj = manualAddBankRouterKt$ManualAddBankRouter$2$12;
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) obj;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                    bankSharedViewModel3 = bankSharedViewModel2;
                    i4 = 0;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    java.lang.String rememberNavResultRequestId22 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                    java.lang.Object[] objArr22 = new java.lang.Object[i4];
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr22, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                    if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                    }
                    if ((i7 & 14) != 4) {
                    }
                    changedInstance = startRestartGroup.changedInstance(bankSharedViewModel3);
                    java.lang.Object rememberedValue422 = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i5) == 0) {
                    }
                    com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1 manualAddBankRouterKt$ManualAddBankRouter$2$122 = new com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1(appNavigator, bankSharedViewModel3, null);
                    startRestartGroup.updateRememberedValue(manualAddBankRouterKt$ManualAddBankRouter$2$122);
                    obj = manualAddBankRouterKt$ManualAddBankRouter$2$122;
                    kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) obj;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId22, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                }
                i4 = 0;
                bankSharedViewModel3 = bankSharedViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                java.lang.String rememberNavResultRequestId222 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                java.lang.Object[] objArr222 = new java.lang.Object[i4];
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr222, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                }
                if ((i7 & 14) != 4) {
                }
                changedInstance = startRestartGroup.changedInstance(bankSharedViewModel3);
                java.lang.Object rememberedValue4222 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i5) == 0) {
                }
                com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1 manualAddBankRouterKt$ManualAddBankRouter$2$1222 = new com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1(appNavigator, bankSharedViewModel3, null);
                startRestartGroup.updateRememberedValue(manualAddBankRouterKt$ManualAddBankRouter$2$1222);
                obj = manualAddBankRouterKt$ManualAddBankRouter$2$1222;
                kotlin.jvm.functions.Function2 function2222 = (kotlin.jvm.functions.Function2) obj;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager222 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId222, resolveNavResultManager222, function2222, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            bankSharedViewModel3 = bankSharedViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt.$r8$lambda$ATmC8itJpMwHcZ2YRJXGC5PBV9A(com.paypal.oslo.core.navigation.AppNavigator.this, bankSharedViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ATmC8itJpMwHcZ2YRJXGC5PBV9A(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ManualAddBankRouter(appNavigator, bankSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
