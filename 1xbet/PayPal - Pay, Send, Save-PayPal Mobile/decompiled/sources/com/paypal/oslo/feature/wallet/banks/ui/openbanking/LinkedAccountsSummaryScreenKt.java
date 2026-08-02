package com.paypal.oslo.feature.wallet.banks.ui.openbanking;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000e\u001a \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"LinkedAccountsSummaryScreen", "", "linkedAccounts", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;", "nonLinkedAccounts", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "bankName", "", "bankLogoBase64", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "failedLinkedAccountsErrorViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel;", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel;Landroidx/compose/runtime/Composer;II)V", "toBankAccountResult", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/LinkedBankAccount;", "wallet_prodRelease", "shouldShowSuccessScreen", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkedAccountsSummaryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0431  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkedAccountsSummaryScreen(final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list, final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2, final java.lang.String str, final java.lang.String str2, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel failedLinkedAccountsErrorViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel failedLinkedAccountsErrorViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel failedLinkedAccountsErrorViewModel3;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel5;
        int i3;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel failedLinkedAccountsErrorViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer composer3;
        int i4;
        int i5;
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error error;
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success success;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel6;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel7;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel failedLinkedAccountsErrorViewModel5;
        final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error error2;
        androidx.view.viewmodel.CreationExtras withCreationCallback;
        java.lang.String stringResource;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-600812932);
        int i7 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                bankSharedViewModel2 = bankSharedViewModel;
                if (startRestartGroup.changedInstance(bankSharedViewModel2)) {
                    i6 = 16384;
                    i7 |= i6;
                }
            } else {
                bankSharedViewModel2 = bankSharedViewModel;
            }
            i6 = 8192;
            i7 |= i6;
        } else {
            bankSharedViewModel2 = bankSharedViewModel;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i7 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            failedLinkedAccountsErrorViewModel2 = failedLinkedAccountsErrorViewModel;
            i7 |= startRestartGroup.changedInstance(failedLinkedAccountsErrorViewModel2) ? 131072 : 65536;
            if (!startRestartGroup.shouldExecute((74899 & i7) == 74898, i7 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 16) != 0) {
                        java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                        androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, startRestartGroup, 0);
                        if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        bankSharedViewModel4 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i7 &= -57345;
                        z = true;
                    } else {
                        z = true;
                        bankSharedViewModel4 = bankSharedViewModel2;
                    }
                    if (i8 != 0) {
                        bankSharedViewModel5 = bankSharedViewModel4;
                        i3 = i7;
                        failedLinkedAccountsErrorViewModel4 = null;
                    } else {
                        bankSharedViewModel5 = bankSharedViewModel4;
                        i3 = i7;
                        failedLinkedAccountsErrorViewModel4 = failedLinkedAccountsErrorViewModel2;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                    }
                    i3 = i7;
                    failedLinkedAccountsErrorViewModel4 = failedLinkedAccountsErrorViewModel2;
                    z = true;
                    bankSharedViewModel5 = bankSharedViewModel2;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-600812932, i3, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreen (LinkedAccountsSummaryScreen.kt:60)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel5.getShouldShowSuccessScreen(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list3 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult linkedBankAccountResult : list3) {
                        arrayList.add(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount(linkedBankAccountResult.getBankAccountId(), linkedBankAccountResult.getType().name(), linkedBankAccountResult.getLastNChars(), str));
                    }
                    rememberedValue = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success(arrayList, "", (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    composer3 = startRestartGroup;
                    composer3.updateRememberedValue(rememberedValue);
                } else {
                    composer3 = startRestartGroup;
                }
                final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success success2 = (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success) rememberedValue;
                java.lang.Object rememberedValue2 = composer3.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(kotlin.collections.CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt.$r8$lambda$kBaHrw_j1ZrSOZTRFZmCw4onwpM((com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult) obj);
                        }
                    }, 31, null), "", false, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    composer3.updateRememberedValue(rememberedValue2);
                }
                final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error error3 = (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) rememberedValue2;
                boolean changedInstance = composer3.changedInstance(list);
                boolean changedInstance2 = composer3.changedInstance(bankSharedViewModel5);
                boolean changedInstance3 = composer3.changedInstance(success2);
                java.lang.Object rememberedValue3 = composer3.rememberedValue();
                if ((changedInstance | changedInstance2 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt.$r8$lambda$jmpxb8iQMCeYrL9tk4Dmq4qgCYo(list, bankSharedViewModel5, success2, error3);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue3);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(z, (kotlin.jvm.functions.Function0) rememberedValue3, composer3, 6, 0);
                boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue();
                boolean changed = composer3.changed(collectAsStateWithLifecycle);
                boolean changedInstance4 = composer3.changedInstance(list);
                boolean changedInstance5 = composer3.changedInstance(bankSharedViewModel5);
                boolean changedInstance6 = composer3.changedInstance(success2);
                java.lang.Object rememberedValue4 = composer3.rememberedValue();
                if ((((changed | changedInstance4) || changedInstance5) || changedInstance6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i4 = i3;
                    i5 = 0;
                    error = error3;
                    success = success2;
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$LinkedAccountsSummaryScreen$2$1(list, bankSharedViewModel5, success2, error3, collectAsStateWithLifecycle, null);
                    composer3.updateRememberedValue(rememberedValue4);
                } else {
                    i4 = i3;
                    error = error3;
                    success = success2;
                    i5 = 0;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer3, i5);
                if (((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue()) {
                    composer3.startReplaceGroup(-1687726405);
                    if (!list.isEmpty()) {
                        composer3.startReplaceGroup(-1687707619);
                        if (list.size() == 1) {
                            composer3.startReplaceGroup(-1687674294);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_linked_accounts_with_failure_single, composer3, i5);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1687512257);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_linked_accounts_with_failure_multiple, new java.lang.Object[]{java.lang.Integer.valueOf(list.size())}, composer3, i5);
                            composer3.endReplaceGroup();
                        }
                        boolean changedInstance7 = composer3.changedInstance(bankSharedViewModel5);
                        final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success success3 = success;
                        boolean changedInstance8 = composer3.changedInstance(success3);
                        java.lang.Object rememberedValue5 = composer3.rememberedValue();
                        if ((changedInstance7 | changedInstance8) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt.$r8$lambda$yeoTGFIzdTyIo3dWjEo9Daf88Gk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, success3);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                        boolean changedInstance9 = composer3.changedInstance(bankSharedViewModel5);
                        boolean changedInstance10 = composer3.changedInstance(success3);
                        java.lang.Object rememberedValue6 = composer3.rememberedValue();
                        if ((changedInstance9 | changedInstance10) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt.$r8$lambda$hazMK_Ix_ou74oXvdmoiCw2yDiE(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, success3);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue6);
                        }
                        int i9 = i4 << 9;
                        androidx.compose.runtime.Composer composer4 = composer3;
                        com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.LinkedAccountsSuccessScreen(stringResource, str, str2, list, list2, function0, (kotlin.jvm.functions.Function0) rememberedValue6, composer3, ((i4 >> 3) & 1008) | (i9 & 7168) | (i9 & 57344));
                        composer4.endReplaceGroup();
                        composer2 = composer4;
                        bankSharedViewModel6 = bankSharedViewModel5;
                    } else {
                        composer3.startReplaceGroup(-1686827405);
                        if (failedLinkedAccountsErrorViewModel4 == null) {
                            composer3.startReplaceGroup(-1855518855);
                            boolean changedInstance11 = composer3.changedInstance(list2);
                            java.lang.Object rememberedValue7 = composer3.rememberedValue();
                            if (changedInstance11 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt.m20936$r8$lambda$mdKwceBJzsDiD5jkzOnnd2EpGE(list2, (com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.Factory) obj);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue7);
                            }
                            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue7;
                            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer3, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                            }
                            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer3, i5);
                            if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1);
                            } else {
                                withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1);
                            }
                            bankSharedViewModel7 = bankSharedViewModel5;
                            failedLinkedAccountsErrorViewModel5 = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory2, withCreationCallback, composer3, 0, 0);
                            composer3.endReplaceGroup();
                        } else {
                            bankSharedViewModel7 = bankSharedViewModel5;
                            composer3.startReplaceGroup(-1855520033);
                            composer3.endReplaceGroup();
                            failedLinkedAccountsErrorViewModel5 = failedLinkedAccountsErrorViewModel4;
                        }
                        boolean changedInstance12 = composer3.changedInstance(bankSharedViewModel7);
                        java.lang.Object rememberedValue8 = composer3.rememberedValue();
                        if (changedInstance12 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            error2 = error;
                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt.$r8$lambda$x7GJWkpeYHVzNR1ED4iLtINyHEg(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, error2);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue8);
                        } else {
                            error2 = error;
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue8;
                        boolean changedInstance13 = composer3.changedInstance(bankSharedViewModel7);
                        java.lang.Object rememberedValue9 = composer3.rememberedValue();
                        if (changedInstance13 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt.$r8$lambda$e71PwV26odom4sgGQSCA1DlEILg(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this, error2);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue9);
                        }
                        bankSharedViewModel6 = bankSharedViewModel7;
                        composer2 = composer3;
                        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.FailedLinkedAccountsErrorScreen(failedLinkedAccountsErrorViewModel5, function02, (kotlin.jvm.functions.Function0) rememberedValue9, str2, bankSharedViewModel7, null, composer3, i4 & 64512, 32);
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer3;
                    bankSharedViewModel6 = bankSharedViewModel5;
                    composer2.startReplaceGroup(-1686147482);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                bankSharedViewModel3 = bankSharedViewModel6;
                failedLinkedAccountsErrorViewModel3 = failedLinkedAccountsErrorViewModel4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                failedLinkedAccountsErrorViewModel3 = failedLinkedAccountsErrorViewModel2;
                bankSharedViewModel3 = bankSharedViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt.m20935$r8$lambda$QM8MfMz6bgCLgYLFSA__j4fvA(list, list2, str, str2, bankSharedViewModel3, failedLinkedAccountsErrorViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        failedLinkedAccountsErrorViewModel2 = failedLinkedAccountsErrorViewModel;
        if (!startRestartGroup.shouldExecute((74899 & i7) == 74898, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$QM8MfMz6bg-CLgYL-FSA__j4fvA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20935$r8$lambda$QM8MfMz6bgCLgYLFSA__j4fvA(java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel failedLinkedAccountsErrorViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkedAccountsSummaryScreen(list, list2, str, str2, bankSharedViewModel, failedLinkedAccountsErrorViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e71PwV26odom4sgGQSCA1DlEILg(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error error) {
        bankSharedViewModel.finishFlowWithResult(error);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hazMK_Ix_ou74oXvdmoiCw2yDiE(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success success) {
        bankSharedViewModel.finishFlowWithResult(success);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jmpxb8iQMCeYrL9tk4Dmq4qgCYo(java.util.List list, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success success, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error error) {
        if (!list.isEmpty()) {
            bankSharedViewModel.finishFlowWithResult(success);
        } else {
            bankSharedViewModel.finishFlowWithResult(error);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$kBaHrw_j1ZrSOZTRFZmCw4onwpM(com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult failedBankAccountResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedBankAccountResult, "");
        java.lang.String candidateId = failedBankAccountResult.getCandidateId();
        java.lang.String errorMessage = failedBankAccountResult.getErrorMessage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(candidateId);
        sb.append(" ");
        sb.append(errorMessage);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        return sb.toString();
    }

    /* renamed from: $r8$lambda$mdKwceBJzsD-iD5jkzOnnd2EpGE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel m20936$r8$lambda$mdKwceBJzsDiD5jkzOnnd2EpGE(java.util.List list, com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(list);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x7GJWkpeYHVzNR1ED4iLtINyHEg(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error error) {
        bankSharedViewModel.finishFlowWithResult(error);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yeoTGFIzdTyIo3dWjEo9Daf88Gk(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success success) {
        bankSharedViewModel.finishFlowWithResult(success);
        return kotlin.Unit.INSTANCE;
    }
}
