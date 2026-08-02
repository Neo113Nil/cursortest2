package com.paypal.oslo.feature.wallet.banks.ui.consent;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u000e*\u0004\u0018\u00010\u000fH\u0000\u001a\u000e\u0010\u0010\u001a\u00020\u000e*\u0004\u0018\u00010\u000fH\u0000¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015X\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"AddBankConsentScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/consent/AddBankConsentViewModel;", "topBarConfig", "Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;", "bankAccount", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/banks/ui/consent/AddBankConsentViewModel;Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "getCountryCode", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getLogoUrl", "wallet_prodRelease", "state", "Lcom/paypal/oslo/feature/wallet/banks/ui/consent/AddBankConsentViewModel$State;", "banks", "", "navigateTo", "Lcom/paypal/oslo/feature/wallet/banks/ui/consent/AddBankConsentViewModel$NavigateTo;", "isBackButtonEnabled", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddBankConsentScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddBankConsentScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel addBankConsentViewModel, final com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount3;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount4;
        androidx.compose.runtime.State collectAsStateWithLifecycle;
        boolean changed;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo navigateTo;
        boolean changed2;
        boolean changed3;
        boolean changedInstance2;
        boolean z;
        boolean z2;
        java.lang.Object rememberedValue2;
        com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo navigateTo2;
        androidx.compose.runtime.State state;
        int i5;
        com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State state2;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConsentViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletTopBarConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(353972563);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(addBankConsentViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(walletTopBarConfig) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            bankAccount2 = bankAccount;
            i3 |= startRestartGroup.changed(bankAccount2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0 && startRestartGroup.changedInstance(bankSharedViewModel)) {
                    i6 = 16384;
                    i3 |= i6;
                }
                i6 = 8192;
                i3 |= i6;
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                bankAccount3 = bankAccount2;
                bankSharedViewModel2 = bankSharedViewModel;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        bankAccount2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                        androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
                        i4 = i3 & (-57345);
                        bankSharedViewModel3 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, startRestartGroup, 0), viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                        bankAccount4 = bankAccount2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(353972563, i4, -1, "com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreen (AddBankConsentScreen.kt:93)");
                        }
                        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(addBankConsentViewModel.getUiState(), null, startRestartGroup, 0, 1);
                        collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addBankConsentViewModel.getBanks(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(addBankConsentViewModel.getNavigateToDestination(), null, startRestartGroup, 0, 1);
                        final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel3.isBackButtonEnabled(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
                        changedInstance = startRestartGroup.changedInstance(bankSharedViewModel3);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.$r8$lambda$_HCqaawfAwp_tqJAbOJxH4WCqkY(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, collectAsStateWithLifecycle2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 0);
                        navigateTo = (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo) collectAsState2.getValue();
                        changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                        changed3 = startRestartGroup.changed(collectAsState2);
                        changedInstance2 = startRestartGroup.changedInstance(addBankConsentViewModel);
                        z = (i4 & 7168) != 2048;
                        z2 = (i4 & 14) != 4;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((!(changed2 | changed3 | changedInstance2 | z) && !z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            navigateTo2 = navigateTo;
                            state = collectAsStateWithLifecycle;
                            i5 = 0;
                            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1(addBankConsentViewModel, bankAccount4, appNavigator, collectAsStateWithLifecycle, collectAsState2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            navigateTo2 = navigateTo;
                            state = collectAsStateWithLifecycle;
                            i5 = 0;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(navigateTo2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i5);
                        java.lang.String str = null;
                        androidx.compose.ui.Modifier statusBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2));
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i5);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i5));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, statusBarsPadding);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.useNode();
                        } else {
                            startRestartGroup.createNode(constructor);
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        state2 = (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State) collectAsState.getValue();
                        if (!(state2 instanceof com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Loading)) {
                            startRestartGroup.startReplaceGroup(-1273828337);
                            com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen("", null, walletTopBarConfig, startRestartGroup, (i4 & 896) | 6, 2);
                            startRestartGroup.endReplaceGroup();
                        } else if (state2 instanceof com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Error) {
                            startRestartGroup.startReplaceGroup(-1273598720);
                            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2)), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i5);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i5));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                            com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.WalletTopBar(walletTopBarConfig, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 1, null), startRestartGroup, (i4 >> 6) & 14, i5);
                            com.paypal.pds.core.Icon.Alert alert = com.paypal.pds.core.Icon.Alert.INSTANCE;
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong, startRestartGroup, i5);
                            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again, startRestartGroup, i5);
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                            boolean changedInstance3 = startRestartGroup.changedInstance(addBankConsentViewModel);
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.$r8$lambda$fDAs0AUHTGNWux1bXAsaLeyVTkk(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(alert, stringResource, "", stringResource2, false, null, false, function0, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 12607878, 96);
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceGroup();
                        } else if (state2 instanceof com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Content) {
                            startRestartGroup.startReplaceGroup(-1272555942);
                            com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State state3 = (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State) collectAsState.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(state3, "");
                            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) state.getValue());
                            com.paypal.oslo.feature.wallet.banks.ui.consent.model.ConsentData consentData = ((com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Content) state3).getConsentData();
                            boolean changedInstance4 = startRestartGroup.changedInstance(addBankConsentViewModel);
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$3$2$1(addBankConsentViewModel);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue5;
                            boolean changedInstance5 = startRestartGroup.changedInstance(addBankConsentViewModel);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changedInstance5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$3$3$1(addBankConsentViewModel);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) rememberedValue6;
                            java.lang.String str2 = str;
                            java.lang.Object obj = str;
                            if (bankAccount4 != null) {
                                if (instantBankConfirmationBankDetails != null) {
                                    str2 = instantBankConfirmationBankDetails.getBankName();
                                }
                                obj = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount.copy$default(bankAccount4, null, str2 == null ? "" : str2, null, null, new com.paypal.oslo.feature.wallet.banks.domain.model.BankImage(getLogoUrl(instantBankConfirmationBankDetails), "", ""), null, null, 109, null);
                            }
                            com.paypal.oslo.feature.wallet.banks.ui.consent.ConsentContentKt.ConsentContent(consentData, obj, walletTopBarConfig, (kotlin.jvm.functions.Function0) kFunction, (kotlin.jvm.functions.Function1) kFunction2, startRestartGroup, i4 & 896);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (!(state2 instanceof com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.NeoBanks)) {
                                startRestartGroup.startReplaceGroup(-318185510);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(-1271610070);
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_neo_banks_title, startRestartGroup, i5);
                            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_neo_banks_description, startRestartGroup, i5);
                            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_choose_your_bank, startRestartGroup, i5);
                            java.util.List list = (java.util.List) state.getValue();
                            boolean changedInstance6 = startRestartGroup.changedInstance(addBankConsentViewModel);
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (changedInstance6 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$3$4$1(addBankConsentViewModel);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            bankSharedViewModel4 = bankSharedViewModel3;
                            composer2 = startRestartGroup;
                            com.paypal.oslo.feature.wallet.banks.ui.consent.NeoBankSelectionScreenKt.NeoBankSelectionScreen(stringResource3, stringResource4, stringResource5, list, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7), walletTopBarConfig, composer2, (i4 << 9) & 458752);
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            bankSharedViewModel2 = bankSharedViewModel4;
                            bankAccount3 = bankAccount4;
                        }
                        bankSharedViewModel4 = bankSharedViewModel3;
                        composer2 = startRestartGroup;
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        bankSharedViewModel2 = bankSharedViewModel4;
                        bankAccount3 = bankAccount4;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                bankSharedViewModel3 = bankSharedViewModel;
                i4 = i3;
                bankAccount4 = bankAccount2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(addBankConsentViewModel.getUiState(), null, startRestartGroup, 0, 1);
                collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addBankConsentViewModel.getBanks(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(addBankConsentViewModel.getNavigateToDestination(), null, startRestartGroup, 0, 1);
                final androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel3.isBackButtonEnabled(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                changed = startRestartGroup.changed(collectAsStateWithLifecycle22);
                changedInstance = startRestartGroup.changedInstance(bankSharedViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | changedInstance)) {
                }
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.$r8$lambda$_HCqaawfAwp_tqJAbOJxH4WCqkY(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, collectAsStateWithLifecycle22);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 0);
                navigateTo = (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo) collectAsState22.getValue();
                changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                changed3 = startRestartGroup.changed(collectAsState22);
                changedInstance2 = startRestartGroup.changedInstance(addBankConsentViewModel);
                if ((i4 & 7168) != 2048) {
                }
                if ((i4 & 14) != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changed2 | changed3 | changedInstance2 | z | z2)) {
                }
                navigateTo2 = navigateTo;
                state = collectAsStateWithLifecycle;
                i5 = 0;
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1(addBankConsentViewModel, bankAccount4, appNavigator, collectAsStateWithLifecycle, collectAsState22, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(navigateTo2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i5);
                java.lang.String str3 = null;
                androidx.compose.ui.Modifier statusBarsPadding2 = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2));
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i5);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i5));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, statusBarsPadding2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                state2 = (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State) collectAsState3.getValue();
                if (!(state2 instanceof com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Loading)) {
                }
                bankSharedViewModel4 = bankSharedViewModel3;
                composer2 = startRestartGroup;
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                bankSharedViewModel2 = bankSharedViewModel4;
                bankAccount3 = bankAccount4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.m20843$r8$lambda$yYlHrvfPXrET0RQjfDeekHgnic(com.paypal.oslo.core.navigation.AppNavigator.this, addBankConsentViewModel, walletTopBarConfig, bankAccount3, bankSharedViewModel2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        bankAccount2 = bankAccount;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.String getCountryCode(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails) {
        java.lang.String countryCode;
        return (instantBankConfirmationBankDetails == null || (countryCode = instantBankConfirmationBankDetails.getCountryCode()) == null || countryCode.length() <= 0) ? "US" : instantBankConfirmationBankDetails.getCountryCode();
    }

    public static final java.lang.String getLogoUrl(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails) {
        java.lang.String str = null;
        java.lang.String inlineLogoUrl = instantBankConfirmationBankDetails != null ? instantBankConfirmationBankDetails.getInlineLogoUrl() : null;
        if (inlineLogoUrl != null && inlineLogoUrl.length() != 0) {
            str = instantBankConfirmationBankDetails.getInlineLogoUrl();
        } else if (instantBankConfirmationBankDetails != null) {
            str = instantBankConfirmationBankDetails.getPrimaryLogoUrl();
        }
        return str == null ? "" : str;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_HCqaawfAwp_tqJAbOJxH4WCqkY(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.State state) {
        if (((java.lang.Boolean) state.getValue()).booleanValue()) {
            bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fDAs0AUHTGNWux1bXAsaLeyVTkk(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel addBankConsentViewModel) {
        addBankConsentViewModel.retry();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yYl-HrvfPXrET0RQjfDeekHgnic, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20843$r8$lambda$yYlHrvfPXrET0RQjfDeekHgnic(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel addBankConsentViewModel, com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddBankConsentScreen(appNavigator, addBankConsentViewModel, walletTopBarConfig, bankAccount, bankSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.util.List access$AddBankConsentScreen$lambda$1(androidx.compose.runtime.State state) {
        return (java.util.List) state.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo access$AddBankConsentScreen$lambda$2(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo) state.getValue();
    }
}
