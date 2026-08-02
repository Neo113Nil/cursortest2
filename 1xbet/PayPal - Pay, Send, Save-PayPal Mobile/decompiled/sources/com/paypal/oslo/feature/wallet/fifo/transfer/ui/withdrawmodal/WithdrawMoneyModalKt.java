package com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a9\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\r\u0010\u0013\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"WithdrawOptionsListTag", "", "WithdrawMoneyModal", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawModalViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawModalViewModel;Landroidx/compose/runtime/Composer;II)V", "WithdrawMoneyOptions", "uiState", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState;", "onItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionsModel;", "onRetry", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "WithdrawMoneyOptionsPreview", "(Landroidx/compose/runtime/Composer;I)V", "WithdrawMoneyOptionsLoadingPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WithdrawMoneyModalKt {
    public static final java.lang.String WithdrawOptionsListTag = "withdraw_options_list";

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WithdrawMoneyModal(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        final com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel3;
        boolean changedInstance;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$WithdrawMoneyModal$1$1 rememberedValue;
        int i5;
        java.lang.Object rememberedValue2;
        boolean changedInstance2;
        java.lang.Object rememberedValue3;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1812052167);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                withdrawModalViewModel2 = withdrawModalViewModel;
                if (startRestartGroup.changedInstance(withdrawModalViewModel2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                withdrawModalViewModel2 = withdrawModalViewModel;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            withdrawModalViewModel2 = withdrawModalViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
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
                    i4 = 1;
                    i7 &= -113;
                    withdrawModalViewModel3 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1812052167, i7, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModal (WithdrawMoneyModal.kt:68)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(withdrawModalViewModel3.getState(), null, startRestartGroup, 0, i4);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(withdrawModalViewModel3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$WithdrawMoneyModal$1$1(withdrawModalViewModel3, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState withdrawalModalState = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState) collectAsState.getValue();
                    i5 = (i7 & 14) == 4 ? i4 : 0;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (i5 == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$gtkj2yROVPQe3HW9o83i2RplDjc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    changedInstance2 = startRestartGroup.changedInstance(withdrawModalViewModel3);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.m21366$r8$lambda$8MbIo9yA4jWJfnd12nb9InzDAA(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    WithdrawMoneyOptions(withdrawalModalState, function1, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    withdrawModalViewModel2 = withdrawModalViewModel3;
                }
                i4 = 1;
                withdrawModalViewModel3 = withdrawModalViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(withdrawModalViewModel3.getState(), null, startRestartGroup, 0, i4);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(withdrawModalViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$WithdrawMoneyModal$1$1(withdrawModalViewModel3, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState withdrawalModalState2 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState) collectAsState2.getValue();
                if ((i7 & 14) == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (i5 == 0) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$gtkj2yROVPQe3HW9o83i2RplDjc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                changedInstance2 = startRestartGroup.changedInstance(withdrawModalViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.m21366$r8$lambda$8MbIo9yA4jWJfnd12nb9InzDAA(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                WithdrawMoneyOptions(withdrawalModalState2, function12, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                withdrawModalViewModel2 = withdrawModalViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                    withdrawModalViewModel3 = withdrawModalViewModel2;
                    i4 = 1;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(withdrawModalViewModel3.getState(), null, startRestartGroup, 0, i4);
                    kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(withdrawModalViewModel3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$WithdrawMoneyModal$1$1(withdrawModalViewModel3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState withdrawalModalState22 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState) collectAsState22.getValue();
                    if ((i7 & 14) == 4) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (i5 == 0) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$gtkj2yROVPQe3HW9o83i2RplDjc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    changedInstance2 = startRestartGroup.changedInstance(withdrawModalViewModel3);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.m21366$r8$lambda$8MbIo9yA4jWJfnd12nb9InzDAA(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    WithdrawMoneyOptions(withdrawalModalState22, function122, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    withdrawModalViewModel2 = withdrawModalViewModel3;
                }
                i4 = 1;
                withdrawModalViewModel3 = withdrawModalViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState222 = androidx.compose.runtime.SnapshotStateKt.collectAsState(withdrawModalViewModel3.getState(), null, startRestartGroup, 0, i4);
                kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(withdrawModalViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$WithdrawMoneyModal$1$1(withdrawModalViewModel3, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState withdrawalModalState222 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState) collectAsState222.getValue();
                if ((i7 & 14) == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (i5 == 0) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$gtkj2yROVPQe3HW9o83i2RplDjc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function1 function1222 = (kotlin.jvm.functions.Function1) rememberedValue2;
                changedInstance2 = startRestartGroup.changedInstance(withdrawModalViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.m21366$r8$lambda$8MbIo9yA4jWJfnd12nb9InzDAA(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                WithdrawMoneyOptions(withdrawalModalState222, function1222, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                withdrawModalViewModel2 = withdrawModalViewModel3;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$t9ARxDaCgyOYK4scM3W6SIkDBvE(com.paypal.oslo.core.navigation.AppNavigator.this, withdrawModalViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WithdrawMoneyOptions(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState withdrawalModalState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalModalState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1843643607);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changed(withdrawalModalState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function03 = function02;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1843643607, i3, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyOptions (WithdrawMoneyModal.kt:107)");
                }
                if (withdrawalModalState instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loading) {
                    startRestartGroup.startReplaceGroup(-54784223);
                    com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen("", androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, true, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), false, null, startRestartGroup, 390, 8);
                    startRestartGroup.endReplaceGroup();
                    function04 = function03;
                } else if (withdrawalModalState instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded) {
                    startRestartGroup.startReplaceGroup(-54476827);
                    startRestartGroup.startReplaceGroup(-2079965864);
                    java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel> withdrawMoneyOptions = ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded) withdrawalModalState).getWithdrawMoneyOptions();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withdrawMoneyOptions, 10));
                    int i5 = 0;
                    for (java.lang.Object obj : withdrawMoneyOptions) {
                        if (i5 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel withdrawMoneyOptionsModel = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel) obj;
                        arrayList.add(new com.paypal.pds.components.ListItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(withdrawMoneyOptionsModel.getContent(), startRestartGroup, 0), null, null, null, true, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1126515460, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.m21368$r8$lambda$zqHqK9YPkLJo2Za1mSN1gaGU(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), null, null, null, null, null, 8046, null));
                        i5++;
                    }
                    final java.util.ArrayList arrayList2 = arrayList;
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), WithdrawOptionsListTag);
                    boolean changedInstance = startRestartGroup.changedInstance(arrayList2);
                    boolean z2 = (i3 & 112) == 32;
                    z = (i3 & 14) == 4;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z2 | changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$0U2HeZBnPWZI9j0AV9sioInv2fQ(arrayList2, function1, withdrawalModalState, (com.paypal.pds.components.ListItem) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    function04 = function03;
                    com.paypal.pds.components.ListKt.List(arrayList2, testTag, null, null, null, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 0, 0, 1532);
                    startRestartGroup.endReplaceGroup();
                } else {
                    function04 = function03;
                    if (withdrawalModalState instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Error) {
                        startRestartGroup.startReplaceGroup(-53503737);
                        com.paypal.pds.core.Icon.Alert alert = com.paypal.pds.core.Icon.Alert.INSTANCE;
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_error_title, startRestartGroup, 0);
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_error_description, startRestartGroup, 0);
                        java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again, startRestartGroup, 0);
                        com.paypal.pds.core.Icon.Alert alert2 = alert;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        z = (i3 & 896) == 256;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$JEZvQlbE9RpLWVOWhSYKOv4eZSE(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(alert2, stringResource, stringResource2, stringResource3, false, null, false, function05, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 14180358, 32);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-2079979975);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function02 = function04;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function02;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$2LcrsoAF7pK9TFGwX7ZBTDTFmUI(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.this, function1, function06, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$00Y_Zm75681pqyaxjvtw6CVyRME(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1039210407);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1039210407, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyOptionsLoadingPreview (WithdrawMoneyModal.kt:227)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loading loading = com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$skdRSmfuHTEOTVFlxp4ja5xFKsw((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            WithdrawMoneyOptions(loading, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$00Y_Zm75681pqyaxjvtw6CVyRME(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0U2HeZBnPWZI9j0AV9sioInv2fQ(java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState withdrawalModalState, com.paypal.pds.components.ListItem listItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        function1.invoke(((com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded) withdrawalModalState).getWithdrawMoneyOptions().get(list.indexOf(listItem)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2LcrsoAF7pK9TFGwX7ZBTDTFmUI(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState withdrawalModalState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WithdrawMoneyOptions(withdrawalModalState, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8MbIo-9yA4jWJfnd12nb9InzDAA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21366$r8$lambda$8MbIo9yA4jWJfnd12nb9InzDAA(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel) {
        withdrawModalViewModel.getWithdrawEligibility();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FUQtwCaQIco4WtoXR2sytdR3xDc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IiIbVOYAwMByrUwk3CSYB8JsawU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1283861719);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1283861719, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyOptionsPreview (WithdrawMoneyModal.kt:200)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded loaded = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loaded(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel[]{new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel(com.paypal.pds.core.Icon.Bank.INSTANCE, "Withdraw Money", com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_money_bank, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType.TRANSFER_TO_FI), new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel(com.paypal.pds.core.Icon.Safe.INSTANCE, "Money", com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_paypal_savings, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType.SAVINGS)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.m21367$r8$lambda$gTOooEQodWDZnq2xqikjqvlYZU((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            WithdrawMoneyOptions(loaded, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$IiIbVOYAwMByrUwk3CSYB8JsawU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JEZvQlbE9RpLWVOWhSYKOv4eZSE(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gTOooEQodWDZnq2xqikj-qvlYZU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21367$r8$lambda$gTOooEQodWDZnq2xqikjqvlYZU(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel withdrawMoneyOptionsModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyOptionsModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gtkj2yROVPQe3HW9o83i2RplDjc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel withdrawMoneyOptionsModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyOptionsModel, "");
        int i = com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.WhenMappings.$EnumSwitchMapping$0[withdrawMoneyOptionsModel.getType().ordinal()];
        if (i == 1) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$FUQtwCaQIco4WtoXR2sytdR3xDc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.$r8$lambda$mFcMDvfNVYXjL46HCSwvxeMWSAQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mFcMDvfNVYXjL46HCSwvxeMWSAQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.savings.api.navigation.SavingsHubDestination(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$skdRSmfuHTEOTVFlxp4ja5xFKsw(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel withdrawMoneyOptionsModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyOptionsModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t9ARxDaCgyOYK4scM3W6SIkDBvE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WithdrawMoneyModal(appNavigator, withdrawModalViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zqHqK9YPkL-Jo2Z-a1mS-N1gaGU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21368$r8$lambda$zqHqK9YPkLJo2Za1mSN1gaGU(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel withdrawMoneyOptionsModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1126515460, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyOptions.<anonymous>.<anonymous> (WithdrawMoneyModal.kt:126)");
            }
            com.paypal.pds.components.IconKt.Icon(withdrawMoneyOptionsModel.getIcon(), withdrawMoneyOptionsModel.getIconDescription(), null, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 24576, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType.TRANSFER_TO_FI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
