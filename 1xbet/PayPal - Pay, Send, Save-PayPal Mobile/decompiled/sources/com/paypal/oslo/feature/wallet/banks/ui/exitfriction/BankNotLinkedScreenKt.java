package com.paypal.oslo.feature.wallet.banks.ui.exitfriction;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"BankNotLinkedScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease", "shouldHideAddBankManual", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankNotLinkedScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ad  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BankNotLinkedScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r13;
        int i4;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4;
        androidx.compose.runtime.State collectAsStateWithLifecycle;
        boolean changed;
        boolean changedInstance;
        boolean z;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        boolean z2;
        java.lang.Object rememberedValue2;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1745680100);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(outcome) : startRestartGroup.changedInstance(outcome) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                bankSharedViewModel2 = bankSharedViewModel;
                if (startRestartGroup.changedInstance(bankSharedViewModel2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                bankSharedViewModel2 = bankSharedViewModel;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            bankSharedViewModel2 = bankSharedViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                    kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                    androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, startRestartGroup, 0);
                    if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    r13 = 0;
                    i4 = i6 & (-897);
                    bankSharedViewModel4 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1745680100, i4, -1, "com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreen (BankNotLinkedScreen.kt:56)");
                    }
                    collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel4.getShouldHideAddBankManual(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue();
                    changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                    changedInstance = startRestartGroup.changedInstance(bankSharedViewModel4);
                    int i7 = i4 & 112;
                    z = (i7 != 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(outcome))) ? true : r13;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changed | changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$BankNotLinkedScreen$1$1(bankSharedViewModel4, outcome, collectAsStateWithLifecycle, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (int) r13);
                    changedInstance2 = startRestartGroup.changedInstance(bankSharedViewModel4);
                    z2 = (i7 != 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(outcome))) ? true : r13;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance2 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$jMbNA5VGx10ZBLvBAG8L01BX5Gk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, outcome);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, r13);
                    if (((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue()) {
                        startRestartGroup.startReplaceGroup(2092519398);
                        androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)));
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r13);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r13));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, navigationBarsPadding);
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
                        com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_exit_friction_manual_add_bank_entry_title, startRestartGroup, r13);
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_exit_friction_manual_add_bank_entry_description, startRestartGroup, r13);
                        java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_enter_bank_info, startRestartGroup, r13);
                        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_exit_friction_manual_add_bank_entry_secondary_button, startRestartGroup, r13);
                        com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1558898018, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$h_AGsJCHXutrnDy8ttR930hsoJo(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, outcome, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), 3, null);
                        boolean z3 = (i4 & 14) == 4;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$9aM1rAMKsG8u4MbwOOeKmVDqPyI(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        boolean changedInstance3 = startRestartGroup.changedInstance(bankSharedViewModel4);
                        boolean z4 = i7 == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(outcome));
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((changedInstance3 | z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$UjYRRWnUcW9Z4Km7t76jTZkfExk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, outcome);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(stringResource, stringResource2, stringResource3, stringResource4, function0, (kotlin.jvm.functions.Function0) rememberedValue4, walletTopBarConfig, warning, startRestartGroup, 12582912);
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(2093772542);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    bankSharedViewModel3 = bankSharedViewModel4;
                }
                r13 = 0;
                i4 = i6;
                bankSharedViewModel4 = bankSharedViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel4.getShouldHideAddBankManual(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean booleanValue2 = ((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue();
                changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                changedInstance = startRestartGroup.changedInstance(bankSharedViewModel4);
                int i72 = i4 & 112;
                if (i72 != 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | changedInstance | z)) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$BankNotLinkedScreen$1$1(bankSharedViewModel4, outcome, collectAsStateWithLifecycle, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (int) r13);
                changedInstance2 = startRestartGroup.changedInstance(bankSharedViewModel4);
                if (i72 != 32) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | z2)) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$jMbNA5VGx10ZBLvBAG8L01BX5Gk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, outcome);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, r13);
                if (((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue()) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                bankSharedViewModel3 = bankSharedViewModel4;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i4 = i6 & (-897);
                    bankSharedViewModel4 = bankSharedViewModel2;
                    r13 = 0;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel4.getShouldHideAddBankManual(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    boolean booleanValue22 = ((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue();
                    changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                    changedInstance = startRestartGroup.changedInstance(bankSharedViewModel4);
                    int i722 = i4 & 112;
                    if (i722 != 32) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changed | changedInstance | z)) {
                    }
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$BankNotLinkedScreen$1$1(bankSharedViewModel4, outcome, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue22), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (int) r13);
                    changedInstance2 = startRestartGroup.changedInstance(bankSharedViewModel4);
                    if (i722 != 32) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance2 | z2)) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$jMbNA5VGx10ZBLvBAG8L01BX5Gk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, outcome);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, r13);
                    if (((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue()) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    bankSharedViewModel3 = bankSharedViewModel4;
                }
                r13 = 0;
                i4 = i6;
                bankSharedViewModel4 = bankSharedViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel4.getShouldHideAddBankManual(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean booleanValue222 = ((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue();
                changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                changedInstance = startRestartGroup.changedInstance(bankSharedViewModel4);
                int i7222 = i4 & 112;
                if (i7222 != 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | changedInstance | z)) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$BankNotLinkedScreen$1$1(bankSharedViewModel4, outcome, collectAsStateWithLifecycle, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue222), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (int) r13);
                changedInstance2 = startRestartGroup.changedInstance(bankSharedViewModel4);
                if (i7222 != 32) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | z2)) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$jMbNA5VGx10ZBLvBAG8L01BX5Gk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, outcome);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, r13);
                if (((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue()) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                bankSharedViewModel3 = bankSharedViewModel4;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            bankSharedViewModel3 = bankSharedViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$F07wrtRj4tI0Kyg0WN3W1rJnPK8(com.paypal.oslo.core.navigation.AppNavigator.this, outcome, bankSharedViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9aM1rAMKsG8u4MbwOOeKmVDqPyI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$zpHVfg__SJVDLPGGUfgcmW9KS54((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F07wrtRj4tI0Kyg0WN3W1rJnPK8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BankNotLinkedScreen(appNavigator, outcome, bankSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UjYRRWnUcW9Z4Km7t76jTZkfExk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome) {
        bankSharedViewModel.finishFlowWithResult(outcome);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h_AGsJCHXutrnDy8ttR930hsoJo(final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1558898018, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreen.<anonymous>.<anonymous> (BankNotLinkedScreen.kt:92)");
            }
            boolean changedInstance = composer.changedInstance(bankSharedViewModel);
            boolean changedInstance2 = composer.changedInstance(outcome);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.$r8$lambda$lpIn4NS8iGvZp89yQunhWkSrWeU(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, outcome);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarTrailingElementKt.WalletTopBarClose((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jMbNA5VGx10ZBLvBAG8L01BX5Gk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome) {
        bankSharedViewModel.finishFlowWithResult(outcome);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lpIn4NS8iGvZp89yQunhWkSrWeU(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome) {
        bankSharedViewModel.finishFlowWithResult(outcome);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zpHVfg__SJVDLPGGUfgcmW9KS54(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
