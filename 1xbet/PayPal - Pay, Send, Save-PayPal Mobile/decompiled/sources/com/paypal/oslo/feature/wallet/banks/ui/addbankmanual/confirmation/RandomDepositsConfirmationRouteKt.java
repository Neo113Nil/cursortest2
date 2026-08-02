package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\nX\u008a\u008e\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002"}, d2 = {"MaxFailedAttempts", "", "LastAttemptThreshold", "RandomDepositsConfirmationRoute", "", "bankAccountDetails", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "shouldShowBack", "", "showInstantConfirmationLink", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;Lcom/paypal/oslo/core/navigation/AppNavigator;ZZLcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "toDomainReason", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$CancellationReason;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult$CancellationReason;", "toBankFlowNavResult", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult$Outcome;", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "failedAttempts", "showBanner", "navigateTo", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RandomDepositsConfirmationRouteKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RandomDepositsConfirmationRoute(final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, boolean z, boolean z2, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel2;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final boolean z5;
        final boolean z6;
        final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel3;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z7;
        boolean z8;
        int i6;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel4;
        final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel5;
        int i7;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4;
        int i8;
        androidx.compose.runtime.State state;
        androidx.compose.runtime.MutableIntState mutableIntState;
        androidx.compose.runtime.State state2;
        java.lang.String stringResource;
        java.lang.String str;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel6;
        int i9;
        int i10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-708273428);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bankAccountDetails) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i3 |= startRestartGroup.changed(z3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        confirmBankAccountViewModel2 = confirmBankAccountViewModel;
                        if (startRestartGroup.changedInstance(confirmBankAccountViewModel2)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        confirmBankAccountViewModel2 = confirmBankAccountViewModel;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    confirmBankAccountViewModel2 = confirmBankAccountViewModel;
                }
                if ((196608 & i) == 0) {
                    bankSharedViewModel2 = bankSharedViewModel;
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changedInstance(bankSharedViewModel2)) ? 131072 : 65536;
                } else {
                    bankSharedViewModel2 = bankSharedViewModel;
                }
                i5 = i3;
                if (startRestartGroup.shouldExecute((i5 & 74899) != 74898, i5 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        z7 = i11 != 0 ? false : z3;
                        z8 = i4 != 0 ? false : z4;
                        if ((i2 & 16) != 0) {
                            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                            }
                            i6 = i5 & (-57345);
                            confirmBankAccountViewModel4 = (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                        } else {
                            i6 = i5;
                            confirmBankAccountViewModel4 = confirmBankAccountViewModel2;
                        }
                        if ((i2 & 32) != 0) {
                            java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                            androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
                            confirmBankAccountViewModel5 = confirmBankAccountViewModel4;
                            bankSharedViewModel4 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, startRestartGroup, 0), viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                            i7 = i6 & (-458753);
                        } else {
                            confirmBankAccountViewModel5 = confirmBankAccountViewModel4;
                            i7 = i6;
                            bankSharedViewModel4 = bankSharedViewModel;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                        }
                        z7 = z3;
                        z8 = z4;
                        i7 = i5;
                        bankSharedViewModel4 = bankSharedViewModel2;
                        confirmBankAccountViewModel5 = confirmBankAccountViewModel2;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-708273428, i7, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRoute (RandomDepositsConfirmationRoute.kt:73)");
                    }
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmBankAccountViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel4.getAddFIAnalyticsContext(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                androidx.compose.runtime.MutableIntState mutableIntStateOf;
                                mutableIntStateOf = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                                return mutableIntStateOf;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.MutableIntState mutableIntState2 = (androidx.compose.runtime.MutableIntState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                    java.lang.Object[] objArr2 = new java.lang.Object[0];
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                androidx.compose.runtime.MutableState mutableStateOf$default;
                                mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                return mutableStateOf$default;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr2, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
                    java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                    androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmBankAccountViewModel5.getNavigateTo(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination = new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination((com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) collectAsStateWithLifecycle2.getValue(), new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(false, false, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig((com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination confirmBankDestination = new com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination((com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) collectAsStateWithLifecycle2.getValue(), new com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig(bankAccountDetails.getId(), bankAccountDetails.getType(), bankAccountDetails.getLastNChars(), com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC));
                    com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo navigateTo = (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo) collectAsStateWithLifecycle3.getValue();
                    boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle3);
                    int i12 = i7 & 112;
                    boolean z9 = i12 == 32;
                    boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
                    boolean changedInstance = startRestartGroup.changedInstance(confirmBankDestination);
                    boolean changedInstance2 = startRestartGroup.changedInstance(confirmBankAccountViewModel5);
                    int i13 = i7;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (((changed | z9 | changed2 | changedInstance) || changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i8 = i13;
                        state = collectAsStateWithLifecycle;
                        rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1(appNavigator, rememberNavResultRequestId, confirmBankAccountViewModel5, collectAsStateWithLifecycle3, confirmBankDestination, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        state = collectAsStateWithLifecycle;
                        i8 = i13;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(navigateTo, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                    com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState uiState = (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState) state.getValue();
                    androidx.compose.runtime.State state3 = state;
                    boolean changed3 = startRestartGroup.changed(state3);
                    boolean changedInstance3 = startRestartGroup.changedInstance(confirmBankAccountViewModel5);
                    boolean changedInstance4 = startRestartGroup.changedInstance(bankAccountDetails);
                    boolean changed4 = startRestartGroup.changed(mutableIntState2);
                    boolean changed5 = startRestartGroup.changed(mutableState);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (((changed3 | changedInstance3 | changedInstance4 | changed4) || changed5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        mutableIntState = mutableIntState2;
                        state2 = state3;
                        rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$2$1(confirmBankAccountViewModel5, bankAccountDetails, state3, mutableIntState2, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    } else {
                        mutableIntState = mutableIntState2;
                        state2 = state3;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(uiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                    androidx.compose.runtime.MutableIntState mutableIntState3 = mutableIntState;
                    if (mutableIntState3.getIntValue() >= 2) {
                        startRestartGroup.startReplaceGroup(1003797484);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposit_banner_title_one_attempt_left, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1003908340);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_confirm_error_banner, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    java.lang.String str2 = stringResource;
                    if (mutableIntState3.getIntValue() >= 3) {
                        startRestartGroup.startReplaceGroup(1004090682);
                        boolean changedInstance5 = startRestartGroup.changedInstance(confirmBankAccountViewModel5);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.m20799$r8$lambda$my1pXk7FRfaMF1RZSSYKTuEF7k(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, 0, 1);
                        com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_error_title, startRestartGroup, 0);
                        java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_error_description, startRestartGroup, 0);
                        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_error_button, startRestartGroup, 0);
                        java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again_later, startRestartGroup, 0);
                        boolean changedInstance6 = startRestartGroup.changedInstance(confirmBankAccountViewModel5);
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$4$1(confirmBankAccountViewModel5);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue6;
                        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel7 = confirmBankAccountViewModel5;
                        com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1051619061, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.m20796$r8$lambda$HVSSo0belXAvGm2uDyZ6okl6Ig(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), 3, null);
                        boolean z10 = i12 == 32;
                        boolean changedInstance7 = startRestartGroup.changedInstance(addBankDestination);
                        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if ((changedInstance7 | z10) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.$r8$lambda$4tDEsZIO4MP7M3sDa30Jlvzv8Yo(com.paypal.oslo.core.navigation.AppNavigator.this, addBankDestination);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        str = rememberNavResultRequestId;
                        com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(stringResource2, stringResource3, stringResource4, stringResource5, (kotlin.jvm.functions.Function0) rememberedValue7, (kotlin.jvm.functions.Function0) kFunction, walletTopBarConfig, warning, startRestartGroup, 12582912);
                        startRestartGroup.endReplaceGroup();
                        i9 = 0;
                        confirmBankAccountViewModel6 = confirmBankAccountViewModel7;
                        composer2 = startRestartGroup;
                    } else {
                        final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel8 = confirmBankAccountViewModel5;
                        str = rememberNavResultRequestId;
                        startRestartGroup.startReplaceGroup(1005419807);
                        boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
                        boolean z11 = ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState) state2.getValue()) instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Loading;
                        boolean changedInstance8 = startRestartGroup.changedInstance(confirmBankAccountViewModel8);
                        java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                        if (changedInstance8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$7$1(confirmBankAccountViewModel8);
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) rememberedValue8;
                        boolean changedInstance9 = startRestartGroup.changedInstance(confirmBankAccountViewModel8);
                        java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                        if (changedInstance9 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$8$1(confirmBankAccountViewModel8);
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        }
                        kotlin.reflect.KFunction kFunction3 = (kotlin.reflect.KFunction) rememberedValue9;
                        boolean changedInstance10 = startRestartGroup.changedInstance(confirmBankAccountViewModel8);
                        java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                        if (changedInstance10 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$9$1(confirmBankAccountViewModel8);
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        kotlin.reflect.KFunction kFunction4 = (kotlin.reflect.KFunction) rememberedValue10;
                        boolean changedInstance11 = startRestartGroup.changedInstance(confirmBankAccountViewModel8);
                        boolean changedInstance12 = startRestartGroup.changedInstance(bankAccountDetails);
                        java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                        if ((changedInstance11 | changedInstance12) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.$r8$lambda$DbQFNeCDFGhre1L25gcv_A4Yk8E(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.this, bankAccountDetails, (java.lang.String) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        }
                        int i14 = i8 << 18;
                        confirmBankAccountViewModel6 = confirmBankAccountViewModel8;
                        i9 = 0;
                        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.RandomDepositsConfirmationScreen(bankAccountDetails, (kotlin.jvm.functions.Function2) rememberedValue11, (kotlin.jvm.functions.Function0) kFunction2, (kotlin.jvm.functions.Function0) kFunction3, (kotlin.jvm.functions.Function0) kFunction4, booleanValue, str2, z11, z7, z8, startRestartGroup, (i8 & 14) | (234881024 & i14) | (i14 & 1879048192), 0);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                    }
                    boolean changedInstance13 = composer2.changedInstance(confirmBankAccountViewModel6);
                    java.lang.Object rememberedValue12 = composer2.rememberedValue();
                    if (changedInstance13 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$11$1(confirmBankAccountViewModel6, null);
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue12;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, i9);
                    java.lang.Object rememberedValue13 = composer2.rememberedValue();
                    if (rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$$inlined$NavResultEffect-rtGRyWw$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                return m20801invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                            }

                            /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                            public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20801invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str3) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str3);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue13, composer2, 3072);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    confirmBankAccountViewModel3 = confirmBankAccountViewModel6;
                    bankSharedViewModel3 = bankSharedViewModel4;
                    z5 = z7;
                    z6 = z8;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    z5 = z3;
                    z6 = z4;
                    confirmBankAccountViewModel3 = confirmBankAccountViewModel2;
                    bankSharedViewModel3 = bankSharedViewModel;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.m20797$r8$lambda$NHDMsRnEvWml8dJJrrWNqwn80c(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.this, appNavigator, z5, z6, confirmBankAccountViewModel3, bankSharedViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i3;
            if (startRestartGroup.shouldExecute((i5 & 74899) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 74899) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason toDomainReason(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.CancellationReason cancellationReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationReason, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(cancellationReason, com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE)) {
            return com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cancellationReason, com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE)) {
            return com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cancellationReason, com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE)) {
            return com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome toBankFlowNavResult(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Cancelled) {
            return new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(toDomainReason(((com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Cancelled) outcome).getReason()));
        }
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Error) {
            com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Error error = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Error) outcome;
            return new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(error.getErrorMessage(), error.getErrorCode(), false, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Success)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Success) outcome;
        return new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success(kotlin.collections.CollectionsKt.listOf(success.getConfirmedBankAccount()), success.getSuccessMessage(), (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: $r8$lambda$002sXDyO4TAq-d2E_Wfrg0irhM8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20794$r8$lambda$002sXDyO4TAqd2E_Wfrg0irhM8(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel) {
        confirmBankAccountViewModel.onFailure();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1xdDk-Ascb_f-WI_MTcv1PvVZKo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20795$r8$lambda$1xdDkAscb_fWI_MTcv1PvVZKo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4tDEsZIO4MP7M3sDa30Jlvzv8Yo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination) {
        boolean z;
        java.lang.Object last = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) appNavigator.getBackStack());
        while (true) {
            androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) last;
            z = navKey instanceof com.paypal.oslo.feature.wallet.api.navigation.BankDetailsDestination;
            if (z || (navKey instanceof com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen)) {
                break;
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.m20795$r8$lambda$1xdDkAscb_fWI_MTcv1PvVZKo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            last = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) appNavigator.getBackStack());
        }
        if (z) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.m20798$r8$lambda$k_0T_YsPVTBLmIV3U1OwekwZc(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DbQFNeCDFGhre1L25gcv_A4Yk8E(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.confirmBankAccount$default(confirmBankAccountViewModel, bankAccountDetails.getId(), str, str2, null, 8, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HVSSo0-belXAvGm2uDyZ6okl6Ig, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20796$r8$lambda$HVSSo0belXAvGm2uDyZ6okl6Ig(final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1051619061, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRoute.<anonymous> (RandomDepositsConfirmationRoute.kt:174)");
            }
            boolean changedInstance = composer.changedInstance(confirmBankAccountViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.m20794$r8$lambda$002sXDyO4TAqd2E_Wfrg0irhM8(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.this);
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

    /* renamed from: $r8$lambda$NHDMsRnEv-Wml8dJJrrWNqwn80c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20797$r8$lambda$NHDMsRnEvWml8dJJrrWNqwn80c(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, com.paypal.oslo.core.navigation.AppNavigator appNavigator, boolean z, boolean z2, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RandomDepositsConfirmationRoute(bankAccountDetails, appNavigator, z, z2, confirmBankAccountViewModel, bankSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$k-_0-T_YsPVTBLmIV3U1OwekwZc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20798$r8$lambda$k_0T_YsPVTBLmIV3U1OwekwZc(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(addBankDestination);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$my1pXk7-FRfaMF1RZSSYKTuEF7k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20799$r8$lambda$my1pXk7FRfaMF1RZSSYKTuEF7k(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel) {
        confirmBankAccountViewModel.onFailure();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState access$RandomDepositsConfirmationRoute$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState) state.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo access$RandomDepositsConfirmationRoute$lambda$8(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo) state.getValue();
    }
}
