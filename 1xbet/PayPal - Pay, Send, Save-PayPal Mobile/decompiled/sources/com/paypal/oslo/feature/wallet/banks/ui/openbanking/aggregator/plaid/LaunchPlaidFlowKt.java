package com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0013\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, d2 = {"LaunchPlaidFlow", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "getLoaderMessage", "", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmFlowType;", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmFlowType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "wallet_prodRelease", "state", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State;", "isExitFrictionShown", "", "navigateTo", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LaunchPlaidFlowKt {
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02dd, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02fb, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LaunchPlaidFlow(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        final androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue4;
        boolean changed;
        int i6;
        boolean changedInstance2;
        kotlin.coroutines.Continuation continuation;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$2$1 launchPlaidFlowKt$LaunchPlaidFlow$2$1;
        boolean changedInstance3;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$3$1 rememberedValue5;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State state;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel5;
        final androidx.compose.runtime.MutableState mutableState2;
        int i7;
        androidx.compose.runtime.Composer composer3;
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean changedInstance4;
        java.lang.Object rememberedValue6;
        java.lang.Object rememberedValue7;
        java.lang.Object rememberedValue8;
        int i8;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plaidViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-370452829);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(plaidViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                bankSharedViewModel2 = bankSharedViewModel;
                if (startRestartGroup.changedInstance(bankSharedViewModel2)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                bankSharedViewModel2 = bankSharedViewModel;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            bankSharedViewModel2 = bankSharedViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i5 = i3 & (-897);
                    bankSharedViewModel4 = bankSharedViewModel2;
                    i4 = 0;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    com.plaid.link.FastOpenPlaidLink fastOpenPlaidLink = new com.plaid.link.FastOpenPlaidLink();
                    changedInstance = startRestartGroup.changedInstance(plaidViewModel);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$0rqIbPBv0XvVx2G0n9wKbGHEA3k(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.this, (com.plaid.link.result.LinkResult) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(fastOpenPlaidLink, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
                    int i9 = i5;
                    final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(plaidViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                    androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(plaidViewModel.getNavigateToDestination(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 54, i4);
                    com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo navigateTo = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo) collectAsStateWithLifecycle2.getValue();
                    changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
                    if ((i9 & 14) == 4) {
                    }
                    changedInstance2 = startRestartGroup.changedInstance(bankSharedViewModel4);
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (((changed ? 1 : 0) | i6 | (changedInstance2 ? 1 : 0)) == 0) {
                    }
                    continuation = null;
                    launchPlaidFlowKt$LaunchPlaidFlow$2$1 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$2$1(appNavigator, bankSharedViewModel4, collectAsStateWithLifecycle2, null);
                    startRestartGroup.updateRememberedValue(launchPlaidFlowKt$LaunchPlaidFlow$2$1);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(navigateTo, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) launchPlaidFlowKt$LaunchPlaidFlow$2$1, startRestartGroup, i4);
                    boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
                    changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue5 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$3$1(bottomSheetController, mutableState, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, i4);
                    androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel4.getConfirmFlowType(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    state = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State) collectAsStateWithLifecycle.getValue();
                    if (!(state instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading)) {
                    }
                    bankSharedViewModel5 = bankSharedViewModel4;
                    mutableState2 = mutableState;
                    i7 = i4;
                    composer3 = startRestartGroup;
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, composer3, i7);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_plaid_exit_friction_description, composer3, i7);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, composer3, i7);
                    java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, composer3, i7);
                    com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                    changedInstance4 = composer3.changedInstance(bankSharedViewModel5);
                    rememberedValue6 = composer3.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$WEeISmyS2tX3NZBwcmde_PK9Ch4(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue6);
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                    rememberedValue7 = composer3.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    rememberedValue8 = composer3.rememberedValue();
                    if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    composer2 = composer3;
                    com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel6 = bankSharedViewModel5;
                    com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController, stringResource, stringResource2, stringResource3, stringResource4, null, warning, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue8, composer2, com.paypal.pds.components.BottomSheetController.$stable | 907542528, 32);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    bankSharedViewModel3 = bankSharedViewModel6;
                }
            } else if ((i2 & 4) != 0) {
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
                bankSharedViewModel2 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -897;
                i5 = i3;
                bankSharedViewModel4 = bankSharedViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-370452829, i5, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlow (LaunchPlaidFlow.kt:95)");
                }
                com.plaid.link.FastOpenPlaidLink fastOpenPlaidLink2 = new com.plaid.link.FastOpenPlaidLink();
                changedInstance = startRestartGroup.changedInstance(plaidViewModel);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$0rqIbPBv0XvVx2G0n9wKbGHEA3k(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.this, (com.plaid.link.result.LinkResult) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult2 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(fastOpenPlaidLink2, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
                int i92 = i5;
                final androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(plaidViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(plaidViewModel.getNavigateToDestination(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$ZNF5VpbKlsy6Hnyy3n4mPene2Sc(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 54, i4);
                com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo navigateTo2 = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo) collectAsStateWithLifecycle22.getValue();
                changed = startRestartGroup.changed(collectAsStateWithLifecycle22);
                i6 = (i92 & 14) == 4 ? 1 : i4;
                changedInstance2 = startRestartGroup.changedInstance(bankSharedViewModel4);
                java.lang.Object rememberedValue92 = startRestartGroup.rememberedValue();
                if (((changed ? 1 : 0) | i6 | (changedInstance2 ? 1 : 0)) == 0 || rememberedValue92 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    launchPlaidFlowKt$LaunchPlaidFlow$2$1 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$2$1(appNavigator, bankSharedViewModel4, collectAsStateWithLifecycle22, null);
                    startRestartGroup.updateRememberedValue(launchPlaidFlowKt$LaunchPlaidFlow$2$1);
                } else {
                    launchPlaidFlowKt$LaunchPlaidFlow$2$1 = rememberedValue92;
                    continuation = null;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(navigateTo2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) launchPlaidFlowKt$LaunchPlaidFlow$2$1, startRestartGroup, i4);
                boolean booleanValue2 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
                changedInstance3 = startRestartGroup.changedInstance(bottomSheetController2);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$3$1(bottomSheetController2, mutableState, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, i4);
                androidx.compose.runtime.State collectAsStateWithLifecycle32 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel4.getConfirmFlowType(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                state = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State) collectAsStateWithLifecycle4.getValue();
                if (!(state instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading)) {
                    if (!(state instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success)) {
                        if (state instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Error) {
                            startRestartGroup.startReplaceGroup(1909315007);
                            com.paypal.pds.core.Icon.Warning warning2 = com.paypal.pds.core.Icon.Warning.INSTANCE;
                            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong, startRestartGroup, i4);
                            java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again, startRestartGroup, i4);
                            boolean changedInstance5 = startRestartGroup.changedInstance(bankSharedViewModel4);
                            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                            if (!changedInstance5) {
                                obj = rememberedValue10;
                            }
                            kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$F42ZvHujTqyazxQeVhVQISp_lq0(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(function03);
                            obj = function03;
                            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) obj;
                            boolean changedInstance6 = startRestartGroup.changedInstance(plaidViewModel);
                            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                            if (!changedInstance6) {
                                obj2 = rememberedValue11;
                            }
                            kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$XCFhsAQFBPKrdd9sbmOlTXKcePw(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(function05);
                            obj2 = function05;
                            com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(warning2, stringResource5, "", stringResource6, false, null, false, function04, (kotlin.jvm.functions.Function0) obj2, startRestartGroup, 390, 112);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.AddBankManualEntry.INSTANCE)) {
                                startRestartGroup.startReplaceGroup(477201529);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(1909930977);
                            bankSharedViewModel5 = bankSharedViewModel4;
                            mutableState2 = mutableState;
                            i7 = i4;
                            composer3 = startRestartGroup;
                            com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.BankNotLinkedScreen(appNavigator, new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE), bankSharedViewModel4, startRestartGroup, i92 & 910, 0);
                            composer3.endReplaceGroup();
                            java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, composer3, i7);
                            java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_plaid_exit_friction_description, composer3, i7);
                            java.lang.String stringResource32 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, composer3, i7);
                            java.lang.String stringResource42 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, composer3, i7);
                            com.paypal.pds.core.Icon.Warning warning3 = com.paypal.pds.core.Icon.Warning.INSTANCE;
                            changedInstance4 = composer3.changedInstance(bankSharedViewModel5);
                            rememberedValue6 = composer3.rememberedValue();
                            if (!changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$WEeISmyS2tX3NZBwcmde_PK9Ch4(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue6);
                            }
                            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue6;
                            rememberedValue7 = composer3.rememberedValue();
                            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$jzlUTgkmM6PbsfIs_57WLaLlNz0(androidx.compose.runtime.MutableState.this);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue7);
                            }
                            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue7;
                            rememberedValue8 = composer3.rememberedValue();
                            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$65gUOIE1EKFuxVPW5Q63iu_ds3U(androidx.compose.runtime.MutableState.this);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue8);
                            }
                            composer2 = composer3;
                            com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel62 = bankSharedViewModel5;
                            com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController2, stringResource7, stringResource22, stringResource32, stringResource42, null, warning3, function06, function022, (kotlin.jvm.functions.Function0) rememberedValue8, composer2, com.paypal.pds.components.BottomSheetController.$stable | 907542528, 32);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            bankSharedViewModel3 = bankSharedViewModel62;
                        }
                    } else {
                        startRestartGroup.startReplaceGroup(1909054607);
                        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State state2 = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State) collectAsStateWithLifecycle4.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(state2, "");
                        com.plaid.link.PlaidHandler plaidHandler = ((com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success) state2).getPlaidHandler();
                        boolean changedInstance7 = startRestartGroup.changedInstance(rememberLauncherForActivityResult2);
                        boolean changedInstance8 = startRestartGroup.changedInstance(plaidHandler);
                        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$4$1 rememberedValue12 = startRestartGroup.rememberedValue();
                        if ((changedInstance7 | changedInstance8) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$4$1(rememberLauncherForActivityResult2, plaidHandler, null);
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(plaidHandler, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue12, startRestartGroup, i4);
                        startRestartGroup.endReplaceGroup();
                    }
                } else {
                    startRestartGroup.startReplaceGroup(1908362532);
                    com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State state3 = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State) collectAsStateWithLifecycle4.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(state3, "");
                    if (((com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading) state3).getShowFlowMessage()) {
                        startRestartGroup.startReplaceGroup(1908429988);
                        str = getLoaderMessage((com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType) collectAsStateWithLifecycle32.getValue(), startRestartGroup, i4);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1908493693);
                        startRestartGroup.endReplaceGroup();
                    }
                    com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen(str, null, new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1692903, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$q4C7X3mI9BjA6I1bYIU7yIgKjDI(androidx.compose.runtime.State.this, mutableState, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }, startRestartGroup, 54), 3, null), startRestartGroup, 0, 2);
                    startRestartGroup.endReplaceGroup();
                }
                bankSharedViewModel5 = bankSharedViewModel4;
                mutableState2 = mutableState;
                i7 = i4;
                composer3 = startRestartGroup;
                java.lang.String stringResource72 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, composer3, i7);
                java.lang.String stringResource222 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_plaid_exit_friction_description, composer3, i7);
                java.lang.String stringResource322 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, composer3, i7);
                java.lang.String stringResource422 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, composer3, i7);
                com.paypal.pds.core.Icon.Warning warning32 = com.paypal.pds.core.Icon.Warning.INSTANCE;
                changedInstance4 = composer3.changedInstance(bankSharedViewModel5);
                rememberedValue6 = composer3.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$WEeISmyS2tX3NZBwcmde_PK9Ch4(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                    }
                };
                composer3.updateRememberedValue(rememberedValue6);
                kotlin.jvm.functions.Function0 function062 = (kotlin.jvm.functions.Function0) rememberedValue6;
                rememberedValue7 = composer3.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlin.jvm.functions.Function0 function0222 = (kotlin.jvm.functions.Function0) rememberedValue7;
                rememberedValue8 = composer3.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                composer2 = composer3;
                com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel622 = bankSharedViewModel5;
                com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController2, stringResource72, stringResource222, stringResource322, stringResource422, null, warning32, function062, function0222, (kotlin.jvm.functions.Function0) rememberedValue8, composer2, com.paypal.pds.components.BottomSheetController.$stable | 907542528, 32);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                bankSharedViewModel3 = bankSharedViewModel622;
            }
            i4 = 0;
            i5 = i3;
            bankSharedViewModel4 = bankSharedViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            com.plaid.link.FastOpenPlaidLink fastOpenPlaidLink22 = new com.plaid.link.FastOpenPlaidLink();
            changedInstance = startRestartGroup.changedInstance(plaidViewModel);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$0rqIbPBv0XvVx2G0n9wKbGHEA3k(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.this, (com.plaid.link.result.LinkResult) obj3);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult22 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(fastOpenPlaidLink22, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
            int i922 = i5;
            final androidx.compose.runtime.State collectAsStateWithLifecycle42 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(plaidViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController22 = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
            androidx.compose.runtime.State collectAsStateWithLifecycle222 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(plaidViewModel.getNavigateToDestination(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 54, i4);
            com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo navigateTo22 = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo) collectAsStateWithLifecycle222.getValue();
            changed = startRestartGroup.changed(collectAsStateWithLifecycle222);
            if ((i922 & 14) == 4) {
            }
            changedInstance2 = startRestartGroup.changedInstance(bankSharedViewModel4);
            java.lang.Object rememberedValue922 = startRestartGroup.rememberedValue();
            if (((changed ? 1 : 0) | i6 | (changedInstance2 ? 1 : 0)) == 0) {
            }
            continuation = null;
            launchPlaidFlowKt$LaunchPlaidFlow$2$1 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$2$1(appNavigator, bankSharedViewModel4, collectAsStateWithLifecycle222, null);
            startRestartGroup.updateRememberedValue(launchPlaidFlowKt$LaunchPlaidFlow$2$1);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(navigateTo22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) launchPlaidFlowKt$LaunchPlaidFlow$2$1, startRestartGroup, i4);
            boolean booleanValue22 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            changedInstance3 = startRestartGroup.changedInstance(bottomSheetController22);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue5 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$LaunchPlaidFlow$3$1(bottomSheetController22, mutableState, continuation);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue22), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, i4);
            androidx.compose.runtime.State collectAsStateWithLifecycle322 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel4.getConfirmFlowType(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            state = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State) collectAsStateWithLifecycle42.getValue();
            if (!(state instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading)) {
            }
            bankSharedViewModel5 = bankSharedViewModel4;
            mutableState2 = mutableState;
            i7 = i4;
            composer3 = startRestartGroup;
            java.lang.String stringResource722 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, composer3, i7);
            java.lang.String stringResource2222 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_plaid_exit_friction_description, composer3, i7);
            java.lang.String stringResource3222 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, composer3, i7);
            java.lang.String stringResource4222 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, composer3, i7);
            com.paypal.pds.core.Icon.Warning warning322 = com.paypal.pds.core.Icon.Warning.INSTANCE;
            changedInstance4 = composer3.changedInstance(bankSharedViewModel5);
            rememberedValue6 = composer3.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.$r8$lambda$WEeISmyS2tX3NZBwcmde_PK9Ch4(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                }
            };
            composer3.updateRememberedValue(rememberedValue6);
            kotlin.jvm.functions.Function0 function0622 = (kotlin.jvm.functions.Function0) rememberedValue6;
            rememberedValue7 = composer3.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            kotlin.jvm.functions.Function0 function02222 = (kotlin.jvm.functions.Function0) rememberedValue7;
            rememberedValue8 = composer3.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            composer2 = composer3;
            com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel6222 = bankSharedViewModel5;
            com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController22, stringResource722, stringResource2222, stringResource3222, stringResource4222, null, warning322, function0622, function02222, (kotlin.jvm.functions.Function0) rememberedValue8, composer2, com.paypal.pds.components.BottomSheetController.$stable | 907542528, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            bankSharedViewModel3 = bankSharedViewModel6222;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            bankSharedViewModel3 = bankSharedViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.m20937$r8$lambda$8L1c3eID5C0lT921yEv4U1N6Mc(com.paypal.oslo.core.navigation.AppNavigator.this, plaidViewModel, bankSharedViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static final java.lang.String getLoaderMessage(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType confirmFlowType, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1305882410, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.getLoaderMessage (LaunchPlaidFlow.kt:230)");
        }
        int i2 = confirmFlowType == null ? -1 : com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.WhenMappings.$EnumSwitchMapping$0[confirmFlowType.ordinal()];
        if (i2 == -1) {
            composer.startReplaceGroup(-822532651);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_linking_your_bank, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 1) {
            composer.startReplaceGroup(-822542858);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_ibc_loader_message, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-822539716);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_reconsent_loader_message, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-822543809);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-822536416);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_ob_upgrade_loader_message_connecting_your_bank, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0rqIbPBv0XvVx2G0n9wKbGHEA3k(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel, com.plaid.link.result.LinkResult linkResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkResult, "");
        if (linkResult instanceof com.plaid.link.result.LinkSuccess) {
            plaidViewModel.successHandler(((com.plaid.link.result.LinkSuccess) linkResult).getMetadata());
        } else if (linkResult instanceof com.plaid.link.result.LinkExit) {
            plaidViewModel.exitHandler();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$65gUOIE1EKFuxVPW5Q63iu_ds3U(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8L1c3eID5C0l-T921yEv4U1N6Mc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20937$r8$lambda$8L1c3eID5C0lT921yEv4U1N6Mc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LaunchPlaidFlow(appNavigator, plaidViewModel, bankSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F42ZvHujTqyazxQeVhVQISp_lq0(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel) {
        bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error("Plaid Launch Init failed.", (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SrxCxhRb857nHQPj3Op1Ro-kJGQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20938$r8$lambda$SrxCxhRb857nHQPj3Op1RokJGQ(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WEeISmyS2tX3NZBwcmde_PK9Ch4(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel) {
        bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XCFhsAQFBPKrdd9sbmOlTXKcePw(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel) {
        plaidViewModel.retry();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZNF5VpbKlsy6Hnyy3n4mPene2Sc(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jzlUTgkmM6PbsfIs_57WLaLlNz0(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q4C7X3mI9BjA6I1bYIU7yIgKjDI(androidx.compose.runtime.State state, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1692903, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlow.<anonymous> (LaunchPlaidFlow.kt:164)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State state2 = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State) state.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(state2, "");
            if (((com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading) state2).getShouldShowClose()) {
                composer.startReplaceGroup(1106421205);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.m20938$r8$lambda$SrxCxhRb857nHQPj3Op1RokJGQ(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarTrailingElementKt.WalletTopBarClose((kotlin.jvm.functions.Function0) rememberedValue, composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1106563433);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo access$LaunchPlaidFlow$lambda$6(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.RECONNECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.UPGRADE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
