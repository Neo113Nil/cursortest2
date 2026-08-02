package com.paypal.oslo.feature.wallet.banks.ui.finicity;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"FinicityFlowScreen", "", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/banks/ui/finicity/FinicityFlowUiState;", "isExitFrictionShown", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FinicityFlowScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinicityFlowScreen(final com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        java.lang.Object rememberedValue;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        java.lang.Object rememberedValue2;
        final androidx.compose.runtime.MutableState mutableState;
        boolean changedInstance;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        boolean changedInstance2;
        java.lang.Object rememberedValue5;
        boolean changedInstance3;
        boolean z;
        java.lang.Object rememberedValue6;
        com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState finicityFlowUiState;
        com.paypal.pds.components.BottomSheetController bottomSheetController2;
        int i6;
        final androidx.compose.runtime.MutableState mutableState2;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        androidx.compose.runtime.Composer composer3;
        boolean changedInstance4;
        java.lang.Object rememberedValue7;
        java.lang.Object rememberedValue8;
        java.lang.Object rememberedValue9;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finicityFlowViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(541202628);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(finicityFlowViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                bankSharedViewModel2 = bankSharedViewModel;
                if (startRestartGroup.changedInstance(bankSharedViewModel2)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                bankSharedViewModel2 = bankSharedViewModel;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            bankSharedViewModel2 = bankSharedViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
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
                i3 &= -897;
                i5 = 1;
                bankSharedViewModel2 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(541202628, i3, -1, "com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreen (FinicityFlowScreen.kt:56)");
                }
                final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(finicityFlowViewModel.getUiState(), null, startRestartGroup, i4, i5);
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                android.app.Activity activity = !(context instanceof android.app.Activity) ? (android.app.Activity) context : null;
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
                changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$1$1(bottomSheetController, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i4);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.$r8$lambda$s74B5FN5F45L3FCSayIP52vF3wU(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 54, i4);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(finicityFlowViewModel);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$3$1(finicityFlowViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance3 = startRestartGroup.changedInstance(finicityFlowViewModel);
                z = (i3 & 112) != 32;
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!(changedInstance3 | z) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1(finicityFlowViewModel, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                finicityFlowUiState = (com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState) collectAsState.getValue();
                if (finicityFlowUiState instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl) {
                    if (finicityFlowUiState instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error) {
                        startRestartGroup.startReplaceGroup(-336724087);
                        com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong, startRestartGroup, 0);
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again, startRestartGroup, 0);
                        boolean changedInstance5 = startRestartGroup.changedInstance(bankSharedViewModel2);
                        boolean changed = startRestartGroup.changed(collectAsState);
                        java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                        if ((changedInstance5 | changed) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.$r8$lambda$lBYQQ29hqYB0DmcIlFz1VbjxQ0A(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, collectAsState);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue10;
                        boolean changedInstance6 = startRestartGroup.changedInstance(finicityFlowViewModel);
                        java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                        if (changedInstance6 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$7$1(finicityFlowViewModel);
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        }
                        bottomSheetController2 = bottomSheetController;
                        com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(warning, stringResource, "", stringResource2, false, null, false, function0, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue11), startRestartGroup, 390, 112);
                        startRestartGroup.endReplaceGroup();
                        mutableState2 = mutableState;
                        bankSharedViewModel3 = bankSharedViewModel2;
                        composer3 = startRestartGroup;
                        i6 = 0;
                    } else {
                        bottomSheetController2 = bottomSheetController;
                        if (finicityFlowUiState instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading) {
                            startRestartGroup.startReplaceGroup(-336098228);
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_loader_one_second, startRestartGroup, 0);
                            com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState finicityFlowUiState2 = (com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState) collectAsState.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(finicityFlowUiState2, "");
                            java.lang.String bankLogoUrl = ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Loading) finicityFlowUiState2).getBankLogoUrl();
                            java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                            if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.$r8$lambda$6IFCC2L7vNlKDg6m9kxvZ8GFX3k(androidx.compose.runtime.MutableState.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue12);
                            }
                            com.paypal.oslo.feature.wallet.common.PartnerConnectionLoaderScreenKt.PartnerConnectionLoaderScreen(stringResource3, bankLogoUrl, null, false, (kotlin.jvm.functions.Function0) rememberedValue12, startRestartGroup, 24576, 12);
                            startRestartGroup.endReplaceGroup();
                            mutableState2 = mutableState;
                            bankSharedViewModel3 = bankSharedViewModel2;
                            i6 = 0;
                            composer3 = startRestartGroup;
                        } else {
                            i6 = 0;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(finicityFlowUiState, com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ManualAddBankExitFriction.INSTANCE)) {
                                startRestartGroup.startReplaceGroup(404766787);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(-335738225);
                            mutableState2 = mutableState;
                            bankSharedViewModel3 = bankSharedViewModel2;
                            composer3 = startRestartGroup;
                            com.paypal.oslo.feature.wallet.banks.ui.exitfriction.BankNotLinkedScreenKt.BankNotLinkedScreen(appNavigator, new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE), bankSharedViewModel2, startRestartGroup, ((i3 >> 3) & 14) | (i3 & 896), 0);
                            composer3.endReplaceGroup();
                        }
                    }
                } else {
                    startRestartGroup.startReplaceGroup(-337112889);
                    com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState finicityFlowUiState3 = (com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState) collectAsState.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(finicityFlowUiState3, "");
                    java.lang.String url = ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl) finicityFlowUiState3).getUrl();
                    boolean changedInstance7 = startRestartGroup.changedInstance(activity);
                    boolean changedInstance8 = startRestartGroup.changedInstance(finicityFlowViewModel);
                    boolean changed2 = startRestartGroup.changed(url);
                    java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                    if ((changedInstance7 | changedInstance8 | changed2) || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$5$1(activity, finicityFlowViewModel, url, null);
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(url, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue13, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    mutableState2 = mutableState;
                    composer3 = startRestartGroup;
                    i6 = 0;
                    bottomSheetController2 = bottomSheetController;
                    bankSharedViewModel3 = bankSharedViewModel2;
                }
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, composer3, i6);
                java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_plaid_exit_friction_description, composer3, i6);
                java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, composer3, i6);
                java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, composer3, i6);
                changedInstance4 = composer3.changedInstance(bankSharedViewModel3);
                rememberedValue7 = composer3.rememberedValue();
                if (!changedInstance4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.$r8$lambda$QpFCk_vgAippMX2dLEf1LMHnJxA(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue7;
                rememberedValue8 = composer3.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.$r8$lambda$sPRjzxKu15B274zoII7aChcTWWA(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue8;
                rememberedValue9 = composer3.rememberedValue();
                if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.$r8$lambda$trMzAfHwcrpc3kATm12BSsNbC8Q(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue9);
                }
                composer2 = composer3;
                bankSharedViewModel2 = bankSharedViewModel3;
                com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController2, stringResource4, stringResource5, stringResource6, stringResource7, null, null, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue9, composer2, com.paypal.pds.components.BottomSheetController.$stable | 905969664, 96);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 0;
            i5 = 1;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            final androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(finicityFlowViewModel.getUiState(), null, startRestartGroup, i4, i5);
            android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            if (!(context2 instanceof android.app.Activity)) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            boolean booleanValue2 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$1$1(bottomSheetController, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i4);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 54, i4);
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            changedInstance2 = startRestartGroup.changedInstance(finicityFlowViewModel);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$3$1(finicityFlowViewModel, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            changedInstance3 = startRestartGroup.changedInstance(finicityFlowViewModel);
            if ((i3 & 112) != 32) {
            }
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!(changedInstance3 | z)) {
            }
            rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1(finicityFlowViewModel, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
            finicityFlowUiState = (com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState) collectAsState2.getValue();
            if (finicityFlowUiState instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.ConnectUrl) {
            }
            java.lang.String stringResource42 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, composer3, i6);
            java.lang.String stringResource52 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_plaid_exit_friction_description, composer3, i6);
            java.lang.String stringResource62 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, composer3, i6);
            java.lang.String stringResource72 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, composer3, i6);
            changedInstance4 = composer3.changedInstance(bankSharedViewModel3);
            rememberedValue7 = composer3.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.$r8$lambda$QpFCk_vgAippMX2dLEf1LMHnJxA(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                }
            };
            composer3.updateRememberedValue(rememberedValue7);
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue7;
            rememberedValue8 = composer3.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) rememberedValue8;
            rememberedValue9 = composer3.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            composer2 = composer3;
            bankSharedViewModel2 = bankSharedViewModel3;
            com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController2, stringResource42, stringResource52, stringResource62, stringResource72, null, null, function022, function032, (kotlin.jvm.functions.Function0) rememberedValue9, composer2, com.paypal.pds.components.BottomSheetController.$stable | 905969664, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4 = bankSharedViewModel2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.m20908$r8$lambda$CJJ5Gq7kjO7aLGr_gMCTxzU8q4(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.this, appNavigator, bankSharedViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6IFCC2L7vNlKDg6m9kxvZ8GFX3k(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CJJ5Gq7kj-O7aLGr_gMCTxzU8q4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20908$r8$lambda$CJJ5Gq7kjO7aLGr_gMCTxzU8q4(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FinicityFlowScreen(finicityFlowViewModel, appNavigator, bankSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QpFCk_vgAippMX2dLEf1LMHnJxA(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel) {
        bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lBYQQ29hqYB0DmcIlFz1VbjxQ0A(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.State state) {
        com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState finicityFlowUiState = (com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState) state.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(finicityFlowUiState, "");
        bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowUiState.Error) finicityFlowUiState).getMessage(), (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s74B5FN5F45L3FCSayIP52vF3wU(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sPRjzxKu15B274zoII7aChcTWWA(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$trMzAfHwcrpc3kATm12BSsNbC8Q(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }
}
