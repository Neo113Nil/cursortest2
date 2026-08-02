package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aG\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"CashInStoresListScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListViewModel;", "testTag", "", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListViewModel;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "StoresListContent", "featuredStores", "", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoreUiModel;", "otherStores", "onStoreClick", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "cash-in_prodRelease", "uiState", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInStoresListScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashInStoresListScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel2;
        int i4;
        java.lang.String str2;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel4;
        java.lang.String str3;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel5;
        int i5;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r4;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1132193032);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cashInStoresListViewModel2 = cashInStoresListViewModel;
                    if (startRestartGroup.changedInstance(cashInStoresListViewModel2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    cashInStoresListViewModel2 = cashInStoresListViewModel;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                cashInStoresListViewModel2 = cashInStoresListViewModel;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                }
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    r4 = 0;
                    str3 = str2;
                    cashInStoresListViewModel5 = cashInStoresListViewModel2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        z = false;
                        cashInStoresListViewModel4 = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i3 &= -897;
                    } else {
                        z = false;
                        cashInStoresListViewModel4 = cashInStoresListViewModel2;
                    }
                    if (i4 != 0) {
                        str2 = "cash_in_stores_list_screen";
                    }
                    str3 = str2;
                    cashInStoresListViewModel5 = cashInStoresListViewModel4;
                    i5 = i3;
                    modifier3 = modifier4;
                    r4 = z;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1132193032, i5, -1, "com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreen (CashInStoresListScreen.kt:73)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(cashInStoresListViewModel5.getUiState(), null, startRestartGroup, r4, 1);
                boolean z2 = (i5 & 14) == 4 ? true : r4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.$r8$lambda$eLt7SI_gVT60tXf_hk_sk8cSuCA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState cashInStoresListUiState = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState) collectAsState.getValue();
                boolean changed = startRestartGroup.changed(collectAsState);
                com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$CashInStoresListScreen$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$CashInStoresListScreen$1$1(collectAsState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(cashInStoresListUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (int) r4);
                com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState cashInStoresListUiState2 = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState) collectAsState.getValue();
                if (cashInStoresListUiState2 instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Loading) {
                    startRestartGroup.startReplaceGroup(-783101498);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), r4);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r4));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                    com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "stores_list_loader"), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.LoaderSize.Large.$stable << 3) | 6, 12);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                    cashInStoresListViewModel3 = cashInStoresListViewModel5;
                    str2 = str3;
                } else if (cashInStoresListUiState2 instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error) {
                    startRestartGroup.startReplaceGroup(-782781516);
                    int attemptNumber = ((com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error) cashInStoresListUiState2).getAttemptNumber();
                    com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig infinite = com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig.INSTANCE.getInfinite();
                    boolean changedInstance = startRestartGroup.changedInstance(cashInStoresListViewModel5);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.$r8$lambda$zvqB5xA6OqI7rTydXCWiD8leGiA(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    cashInStoresListViewModel3 = cashInStoresListViewModel5;
                    com.paypal.oslo.feature.cashin.ui.screens.CashInErrorScreenKt.CashInErrorScreen(attemptNumber, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, (kotlin.jvm.functions.Function0<kotlin.Unit>) function02, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue5, modifier3, infinite, false, startRestartGroup, ((i5 << 9) & 57344) | 1576320, 0);
                    startRestartGroup.endReplaceGroup();
                    str2 = str3;
                } else {
                    cashInStoresListViewModel3 = cashInStoresListViewModel5;
                    str2 = str3;
                    if (cashInStoresListUiState2 instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success) {
                        startRestartGroup.startReplaceGroup(-782387320);
                        com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success success = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success) cashInStoresListUiState2;
                        Camera2StreamConfigurationMap(success.getFeaturedStores(), success.getOtherStores(), function1, androidx.compose.ui.platform.TestTagKt.testTag(modifier3, str2), startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1410736261);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                cashInStoresListViewModel3 = cashInStoresListViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel6 = cashInStoresListViewModel3;
                final java.lang.String str4 = str2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.$r8$lambda$PcANWyDJfsplwIJomBMD5ZR87xs(com.paypal.oslo.core.navigation.AppNavigator.this, modifier5, cashInStoresListViewModel6, str4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> list, final java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> list2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(908981641);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(908981641, i3, -1, "com.paypal.oslo.feature.cashin.ui.screens.StoresListContent (CashInStoresListScreen.kt:141)");
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean z = (i3 & 896) == 256;
                boolean changedInstance2 = startRestartGroup.changedInstance(list2);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance2 | changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.$r8$lambda$pABywG4LTJCXMlVCeh765SriK7s(list, list2, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(m1708paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 510);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.m13479$r8$lambda$spGGfvf0QHxQ2ofmrFHY75G0Ok(list, list2, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$AiOv_S3jz_BTHBQCbNzFO4brzsE(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        int i2 = 0;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1998505946, i, -1, "com.paypal.oslo.feature.cashin.ui.screens.StoresListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashInStoresListScreen.kt:189)");
            }
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel cashInStoreUiModel = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel) obj;
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(cashInStoreUiModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.$r8$lambda$eSHZpk66PlRbe9vK434vBGXqNIA(kotlin.jvm.functions.Function1.this, cashInStoreUiModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.cashin.ui.components.OtherStoreItemKt.OtherStoreItem(cashInStoreUiModel, (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.StoresListScreen.INSTANCE.getSTORE_LIST_ITEM()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.PRODUCT, "store_search", "select_store"))), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("other_store", 0, null, java.lang.Integer.valueOf(i2), 6, null)), composer, 0, 0);
                i2++;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LKpKXoK0_ifx5TWW8Lc51t3Ri9c(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel cashInStoreUiModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination(cashInStoreUiModel.getPartnerId(), cashInStoreUiModel.getId(), cashInStoreUiModel.getAddress(), cashInStoreUiModel.getDistance()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PcANWyDJfsplwIJomBMD5ZR87xs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CashInStoresListScreen(appNavigator, modifier, cashInStoresListViewModel, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QYVrG6xGw1Q7Ks6GLXi2mlza4oE(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1947586137, i, -1, "com.paypal.oslo.feature.cashin.ui.screens.StoresListContent.<anonymous>.<anonymous>.<anonymous> (CashInStoresListScreen.kt:150)");
            }
            com.paypal.oslo.feature.cashin.ui.components.FeaturedStoresGridKt.FeaturedStoresGrid(list, function1, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.StoresListScreen.INSTANCE.getFEATURED_STORES_MODULE()), null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RqvP1kot-X6JJo3Ld9Uup5PrVCI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13478$r8$lambda$RqvP1kotX6JJo3Ld9Uup5PrVCI(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-77571326, i, -1, "com.paypal.oslo.feature.cashin.ui.screens.StoresListContent.<anonymous>.<anonymous>.<anonymous> (CashInStoresListScreen.kt:167)");
            }
            androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.StoresListScreen.INSTANCE.getOTHER_STORES_MODULE());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, module);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_other_stores, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, composer, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "other_stores_card"), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1998505946, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.$r8$lambda$AiOv_S3jz_BTHBQCbNzFO4brzsE(list, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 805306422 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9), 500);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eLt7SI_gVT60tXf_hk_sk8cSuCA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel cashInStoreUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStoreUiModel, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.$r8$lambda$LKpKXoK0_ifx5TWW8Lc51t3Ri9c(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eSHZpk66PlRbe9vK434vBGXqNIA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel cashInStoreUiModel) {
        function1.invoke(cashInStoreUiModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pABywG4LTJCXMlVCeh765SriK7s(final java.util.List list, final java.util.List list2, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        if (!list.isEmpty()) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1947586137, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.$r8$lambda$QYVrG6xGw1Q7Ks6GLXi2mlza4oE(list, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 3, null);
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInStoresListScreenKt.INSTANCE.getLambda$1526565122$cash_in_prodRelease(), 3, null);
        }
        if (!list2.isEmpty()) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-77571326, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.m13478$r8$lambda$RqvP1kotX6JJo3Ld9Uup5PrVCI(list2, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$spGGf-vf0QHxQ2ofmrFHY75G0Ok, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13479$r8$lambda$spGGfvf0QHxQ2ofmrFHY75G0Ok(java.util.List list, java.util.List list2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(list, list2, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zvqB5xA6OqI7rTydXCWiD8leGiA(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel) {
        cashInStoresListViewModel.retry();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState access$CashInStoresListScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState) state.getValue();
    }
}
