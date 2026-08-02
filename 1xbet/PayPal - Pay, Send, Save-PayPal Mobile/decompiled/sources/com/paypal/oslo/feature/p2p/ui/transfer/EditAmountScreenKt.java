package com.paypal.oslo.feature.p2p.ui.transfer;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"EditAmountScreen", "", "initialAmount", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "onDoneClick", "Lkotlin/Function1;", "onCurrencyPickerClick", "Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;", "transferViewModel", "Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;", "amountScreenComponentsOverride", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Landroidx/compose/runtime/Composer;II)V", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditAmountScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008c  */
    /* JADX WARN: Type inference failed for: r12v13, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditAmountScreen(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> function12, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> function13;
        com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel2;
        int i4;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents2;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> function14;
        final com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel3;
        final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> function15;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents4;
        boolean z;
        com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel4;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> function16;
        com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel5;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents5;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r12;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-97986699);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function13 = function12;
            i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    transferViewModel2 = transferViewModel;
                    if (startRestartGroup.changedInstance(transferViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    transferViewModel2 = transferViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                transferViewModel2 = transferViewModel;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                amountScreenComponents2 = amountScreenComponents;
                i3 |= startRestartGroup.changedInstance(amountScreenComponents2) ? 131072 : 65536;
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.transfer.EditAmountScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.p2p.ui.transfer.EditAmountScreenKt.m17449$r8$lambda$13BehpMTmGGtaBq6l1VMmahwhk((com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function15 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function15 = function13;
                        }
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
                            amountScreenComponents4 = null;
                            z = false;
                            transferViewModel4 = (com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            i3 &= -57345;
                        } else {
                            amountScreenComponents4 = null;
                            z = false;
                            transferViewModel4 = transferViewModel2;
                        }
                        i5 = i3;
                        function16 = function15;
                        transferViewModel5 = transferViewModel4;
                        if (i4 != 0) {
                            amountScreenComponents5 = amountScreenComponents4;
                            r12 = amountScreenComponents4;
                        } else {
                            amountScreenComponents5 = amountScreenComponents2;
                            r12 = amountScreenComponents4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        function16 = function13;
                        amountScreenComponents5 = amountScreenComponents2;
                        r12 = 0;
                        z = false;
                        i5 = i3;
                        transferViewModel5 = transferViewModel2;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-97986699, i5, -1, "com.paypal.oslo.feature.p2p.ui.transfer.EditAmountScreen (EditAmountScreen.kt:45)");
                    }
                    if ((i5 & 112) == 32) {
                        z = true;
                    }
                    boolean changedInstance = startRestartGroup.changedInstance(transferViewModel5);
                    com.paypal.oslo.feature.p2p.ui.transfer.EditAmountScreenKt$EditAmountScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.p2p.ui.transfer.EditAmountScreenKt$EditAmountScreen$2$1(str2, transferViewModel5, r12);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i5 >> 3) & 14);
                    int i8 = i5 >> 9;
                    com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel6 = transferViewModel5;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.TransferScreen(null, transferViewModel5, true, str, false, true, null, null, function1, null, function16, amountScreenComponents5, null, composer2, ((i5 << 18) & 234881024) | ((i5 << 9) & 7168) | (i8 & 112) | 221568, ((i5 >> 12) & 112) | (i8 & 14), 4801);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function14 = function16;
                    amountScreenComponents3 = amountScreenComponents5;
                    transferViewModel3 = transferViewModel6;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function14 = function13;
                    transferViewModel3 = transferViewModel2;
                    amountScreenComponents3 = amountScreenComponents2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.transfer.EditAmountScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.transfer.EditAmountScreenKt.$r8$lambda$YO4wqPPP2clDj8RSJ0OV79RjTEw(str, str2, function1, function14, transferViewModel3, amountScreenComponents3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            amountScreenComponents2 = amountScreenComponents;
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function13 = function12;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        amountScreenComponents2 = amountScreenComponents;
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$13BehpMTmGGt-aBq6l1VMmahwhk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17449$r8$lambda$13BehpMTmGGtaBq6l1VMmahwhk(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerDestination, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YO4wqPPP2clDj8RSJ0OV79RjTEw(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EditAmountScreen(str, str2, function1, function12, transferViewModel, amountScreenComponents, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
