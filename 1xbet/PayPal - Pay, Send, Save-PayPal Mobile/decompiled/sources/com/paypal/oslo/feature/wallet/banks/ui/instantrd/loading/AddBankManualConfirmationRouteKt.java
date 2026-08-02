package com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002"}, d2 = {"AddBankManualConfirmationRoute", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "bankAccountId", "", "modifier", "Landroidx/compose/ui/Modifier;", "initialDetails", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease", "rtpDepositState", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState;", "navigateTo", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddBankManualConfirmationRouteKt {
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0307, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0264, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03c2, code lost:
    
        if (r9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x045d, code lost:
    
        if (r13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddBankManualConfirmationRoute(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails2;
        com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel2;
        final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails3;
        final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.coroutines.Continuation continuation;
        int i5;
        com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel4;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final com.paypal.pds.components.BottomSheetController bottomSheetController;
        int i6;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails5;
        ?? r15;
        final kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2058393100);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                bankAccountDetails2 = bankAccountDetails;
                i3 |= startRestartGroup.changedInstance(bankAccountDetails2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        instantRDLoadingViewModel2 = instantRDLoadingViewModel;
                        if (startRestartGroup.changedInstance(instantRDLoadingViewModel2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        instantRDLoadingViewModel2 = instantRDLoadingViewModel;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    instantRDLoadingViewModel2 = instantRDLoadingViewModel;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                        bankAccountDetails4 = bankAccountDetails2;
                        continuation = null;
                        instantRDLoadingViewModel4 = instantRDLoadingViewModel2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails6 = i4 != 0 ? null : bankAccountDetails2;
                        if ((i2 & 16) != 0) {
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
                            continuation = null;
                            i5 = i3 & (-57345);
                            instantRDLoadingViewModel4 = (com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        } else {
                            continuation = null;
                            i5 = i3;
                            instantRDLoadingViewModel4 = instantRDLoadingViewModel2;
                        }
                        modifier3 = modifier4;
                        bankAccountDetails4 = bankAccountDetails6;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2058393100, i5, -1, "com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRoute (AddBankManualConfirmationRoute.kt:60)");
                    }
                    int i9 = i5;
                    final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel5 = instantRDLoadingViewModel4;
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(instantRDLoadingViewModel4.getRtpDepositState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(instantRDLoadingViewModel5.getNavigateTo(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.pds.components.BottomSheetController();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
                    com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo navigateTo = (com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo) collectAsStateWithLifecycle2.getValue();
                    boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
                    boolean z = (i9 & 14) == 4;
                    boolean changedInstance = startRestartGroup.changedInstance(instantRDLoadingViewModel5);
                    com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((z | changed | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1(appNavigator, instantRDLoadingViewModel5, collectAsStateWithLifecycle2, continuation);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(navigateTo, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                    boolean changedInstance2 = startRestartGroup.changedInstance(instantRDLoadingViewModel5);
                    int i10 = i9 & 112;
                    boolean z2 = i10 == 32;
                    boolean changedInstance3 = startRestartGroup.changedInstance(bankAccountDetails4);
                    com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changedInstance2 | z2 | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$2$1(instantRDLoadingViewModel5, str, bankAccountDetails4, continuation);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i9 >> 3) & 14);
                    com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState rtpDepositState = (com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState) collectAsStateWithLifecycle.getValue();
                    if (!(rtpDepositState instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Failed)) {
                        bottomSheetController = bottomSheetController2;
                        final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails7 = bankAccountDetails4;
                        i6 = 1;
                        if (!(rtpDepositState instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Error)) {
                            bankAccountDetails5 = bankAccountDetails7;
                            r15 = 0;
                            r15 = 0;
                            if (rtpDepositState instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Polling) {
                                startRestartGroup.startReplaceGroup(-1951554974);
                                coroutineScope = coroutineScope2;
                                boolean changedInstance4 = startRestartGroup.changedInstance(coroutineScope);
                                boolean changedInstance5 = startRestartGroup.changedInstance(bottomSheetController);
                                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if ((changedInstance4 | changedInstance5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.m20913$r8$lambda$dEXbwtS2sJgEDlwYX6187mfHic(kotlinx.coroutines.CoroutineScope.this, bottomSheetController);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, 6, 0);
                                boolean changedInstance6 = startRestartGroup.changedInstance(coroutineScope);
                                boolean changedInstance7 = startRestartGroup.changedInstance(bottomSheetController);
                                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if ((changedInstance6 | changedInstance7) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.$r8$lambda$WVvUw3rlcQnSLEiYXd2QXaih3cA(kotlinx.coroutines.CoroutineScope.this, bottomSheetController);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt.AddBankLoaderScreen(modifier3, null, true, (kotlin.jvm.functions.Function0) rememberedValue6, null, startRestartGroup, ((i9 >> 6) & 14) | 384, 18);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                coroutineScope = coroutineScope2;
                                startRestartGroup.startReplaceGroup(-1864056624);
                                startRestartGroup.endReplaceGroup();
                            }
                        } else {
                            startRestartGroup.startReplaceGroup(-1952189947);
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 48, 1);
                            com.paypal.pds.core.Icon.Alert alert = com.paypal.pds.core.Icon.Alert.INSTANCE;
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong, startRestartGroup, 0);
                            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again, startRestartGroup, 0);
                            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue8;
                            boolean changedInstance8 = startRestartGroup.changedInstance(instantRDLoadingViewModel5);
                            boolean z3 = i10 == 32;
                            boolean changedInstance9 = startRestartGroup.changedInstance(bankAccountDetails7);
                            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (!(z3 | changedInstance8 | changedInstance9)) {
                                obj = rememberedValue9;
                            }
                            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.$r8$lambda$_mOyBtUkfuH69MVEU3UAgTk28CQ(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.this, str, bankAccountDetails7);
                                }
                            };
                            startRestartGroup.updateRememberedValue(function02);
                            obj = function02;
                            bankAccountDetails5 = bankAccountDetails7;
                            com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(alert, stringResource, "", stringResource2, false, null, false, function0, (kotlin.jvm.functions.Function0) obj, startRestartGroup, 12607878, 96);
                            startRestartGroup.endReplaceGroup();
                            r15 = 0;
                            coroutineScope = coroutineScope2;
                        }
                    } else {
                        startRestartGroup.startReplaceGroup(-1952827183);
                        java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                        if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue10, startRestartGroup, 48, 1);
                        com.paypal.pds.core.Icon.Alert alert2 = com.paypal.pds.core.Icon.Alert.INSTANCE;
                        java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_rtp_bank_not_activated, startRestartGroup, 0);
                        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_rtp_check_number_try_again, startRestartGroup, 0);
                        java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_ok, startRestartGroup, 0);
                        java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                        if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        }
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue11;
                        boolean changedInstance10 = startRestartGroup.changedInstance(instantRDLoadingViewModel5);
                        boolean z4 = i10 == 32;
                        boolean changedInstance11 = startRestartGroup.changedInstance(bankAccountDetails4);
                        java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                        if (!(z4 | changedInstance10 | changedInstance11)) {
                            obj4 = rememberedValue12;
                        }
                        kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.m20912$r8$lambda$__UW_Z_VbXBV8zfke7bYs4oWNc(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.this, str, bankAccountDetails4);
                            }
                        };
                        startRestartGroup.updateRememberedValue(function04);
                        obj4 = function04;
                        kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) obj4;
                        bottomSheetController = bottomSheetController2;
                        com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(alert2, stringResource3, stringResource4, stringResource5, false, null, false, function03, function05, startRestartGroup, 12607494, 96);
                        startRestartGroup.endReplaceGroup();
                        i6 = 1;
                        coroutineScope = coroutineScope2;
                        bankAccountDetails5 = bankAccountDetails4;
                        r15 = 0;
                    }
                    boolean changedInstance12 = startRestartGroup.changedInstance(coroutineScope);
                    boolean changedInstance13 = startRestartGroup.changedInstance(bottomSheetController);
                    java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                    if (!(changedInstance12 | changedInstance13)) {
                        obj2 = rememberedValue13;
                    }
                    kotlin.jvm.functions.Function0 function06 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.$r8$lambda$JOus0X28nAupiXDM36hchncs8s0(kotlinx.coroutines.CoroutineScope.this, bottomSheetController);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function06);
                    obj2 = function06;
                    final kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) obj2;
                    if (bottomSheetController.getVisible()) {
                        startRestartGroup.startReplaceGroup(-1950980792);
                        boolean changed2 = startRestartGroup.changed(function07);
                        java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.m20909$r8$lambda$VOgePadMuKvcWvkYq39ZlF7I_g(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue14);
                        }
                        androidx.view.compose.BackHandlerKt.BackHandler(r15, (kotlin.jvm.functions.Function0) rememberedValue14, startRestartGroup, r15, i6);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1950927782);
                        boolean changedInstance14 = startRestartGroup.changedInstance(coroutineScope);
                        boolean changedInstance15 = startRestartGroup.changedInstance(bottomSheetController);
                        java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                        if ((changedInstance14 | changedInstance15) || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.m20911$r8$lambda$GESF1f7w9Ndc3urGevHQnbvLBY(kotlinx.coroutines.CoroutineScope.this, bottomSheetController);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue15);
                        }
                        androidx.view.compose.BackHandlerKt.BackHandler(r15, (kotlin.jvm.functions.Function0) rememberedValue15, startRestartGroup, r15, i6);
                        startRestartGroup.endReplaceGroup();
                    }
                    java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, startRestartGroup, r15);
                    java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_manual_add_bank_confirmation_description, startRestartGroup, r15);
                    java.lang.String stringResource8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, startRestartGroup, r15);
                    java.lang.String stringResource9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, startRestartGroup, r15);
                    boolean changedInstance16 = startRestartGroup.changedInstance(coroutineScope);
                    boolean changedInstance17 = startRestartGroup.changedInstance(bottomSheetController);
                    boolean changedInstance18 = startRestartGroup.changedInstance(instantRDLoadingViewModel5);
                    java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                    if (!(changedInstance16 | changedInstance17 | changedInstance18)) {
                        obj3 = rememberedValue16;
                    }
                    kotlin.jvm.functions.Function0 function08 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.$r8$lambda$CKdb3iHPrRnesWFiq9VZSMJzXYI(kotlinx.coroutines.CoroutineScope.this, instantRDLoadingViewModel5, bottomSheetController);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function08);
                    obj3 = function08;
                    com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController, stringResource6, stringResource7, stringResource8, stringResource9, null, null, (kotlin.jvm.functions.Function0) obj3, function07, function07, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 96);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    instantRDLoadingViewModel3 = instantRDLoadingViewModel5;
                    modifier2 = modifier3;
                    bankAccountDetails3 = bankAccountDetails5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    bankAccountDetails3 = bankAccountDetails2;
                    instantRDLoadingViewModel3 = instantRDLoadingViewModel2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                            return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.m20914$r8$lambda$q4gxBDlQOlXdJkmaFMAu3mFRlU(com.paypal.oslo.core.navigation.AppNavigator.this, str, modifier5, bankAccountDetails3, instantRDLoadingViewModel3, i, i2, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            bankAccountDetails2 = bankAccountDetails;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        bankAccountDetails2 = bankAccountDetails;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$-VOgePadMuKvcWvkYq39ZlF7I_g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20909$r8$lambda$VOgePadMuKvcWvkYq39ZlF7I_g(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CKdb3iHPrRnesWFiq9VZSMJzXYI(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$13$1$1(bottomSheetController, null), 3, null);
        instantRDLoadingViewModel.cancelFlow();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GESF1f7w9Ndc3urGevH-QnbvLBY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20911$r8$lambda$GESF1f7w9Ndc3urGevHQnbvLBY(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$12$1$1(bottomSheetController, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JOus0X28nAupiXDM36hchncs8s0(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$dismissModal$1$1$1(bottomSheetController, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WVvUw3rlcQnSLEiYXd2QXaih3cA(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$10$1$1(bottomSheetController, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$__UW_Z_VbXBV8zfke7bYs4-oWNc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20912$r8$lambda$__UW_Z_VbXBV8zfke7bYs4oWNc(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
        instantRDLoadingViewModel.startPolling(str, bankAccountDetails);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_mOyBtUkfuH69MVEU3UAgTk28CQ(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
        instantRDLoadingViewModel.startPolling(str, bankAccountDetails);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dEXbwtS2sJgED-lwYX6187mfHic, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20913$r8$lambda$dEXbwtS2sJgEDlwYX6187mfHic(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$9$1$1(bottomSheetController, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$q4gxBDlQOlXdJkmaFMAu3m-FRlU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20914$r8$lambda$q4gxBDlQOlXdJkmaFMAu3mFRlU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddBankManualConfirmationRoute(appNavigator, str, modifier, bankAccountDetails, instantRDLoadingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo access$AddBankManualConfirmationRoute$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo) state.getValue();
    }
}
