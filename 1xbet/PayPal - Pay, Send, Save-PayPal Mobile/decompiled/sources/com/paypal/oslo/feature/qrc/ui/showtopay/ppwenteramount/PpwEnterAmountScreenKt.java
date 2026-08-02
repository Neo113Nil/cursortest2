package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0013\u001ab\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, d2 = {"DefaultFxRate", "", "PpwEnterAmountScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "amountScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountViewModel;Landroidx/compose/runtime/Composer;II)V", "PpwEnterAmountContent", "uiModel", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiModel;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiModel;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createPpwAmountCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenCallbacks;", "onSenderAmountChanged", "", "onReceiverAmountChanged", "onPrimaryRowClicked", "Lkotlin/Function0;", "onSecondaryRowClicked", "onContinue", "isReceiverActive", "", "qrc_prodRelease", "uiState", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwEnterAmountScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PpwEnterAmountScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel ppwEnterAmountViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel ppwEnterAmountViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel ppwEnterAmountViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(573669574);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(amountScreenComponents) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    ppwEnterAmountViewModel2 = ppwEnterAmountViewModel;
                    if (startRestartGroup.changedInstance(ppwEnterAmountViewModel2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    ppwEnterAmountViewModel2 = ppwEnterAmountViewModel;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                ppwEnterAmountViewModel2 = ppwEnterAmountViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i6 = i3;
                    modifier3 = modifier2;
                    ppwEnterAmountViewModel3 = ppwEnterAmountViewModel2;
                    i4 = 0;
                    i5 = 1;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
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
                        androidx.view.viewmodel.CreationExtras creationExtras = empty;
                        i5 = 1;
                        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel ppwEnterAmountViewModel4 = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, creationExtras, startRestartGroup, 0, 0);
                        i6 = i3 & (-7169);
                        modifier3 = companion;
                        ppwEnterAmountViewModel3 = ppwEnterAmountViewModel4;
                        i4 = 0;
                    } else {
                        i4 = 0;
                        i5 = 1;
                        i6 = i3;
                        modifier3 = companion;
                        ppwEnterAmountViewModel3 = ppwEnterAmountViewModel2;
                    }
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(573669574, i6, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreen (PpwEnterAmountScreen.kt:98)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(ppwEnterAmountViewModel3.getUiState(), null, startRestartGroup, i4, i5);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_creating_qr, startRestartGroup, i4);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_desc_confirming_location, startRestartGroup, i4);
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                boolean changedInstance = startRestartGroup.changedInstance(ppwEnterAmountViewModel3);
                com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$1$1(ppwEnterAmountViewModel3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
                com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m17952invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m17952invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                boolean changedInstance2 = composer2.changedInstance(ppwEnterAmountViewModel3);
                boolean z = (i6 & 14) == 4;
                boolean changed = composer2.changed(rememberNavResultRequestId);
                boolean changed2 = composer2.changed(stringResource);
                boolean changed3 = composer2.changed(stringResource2);
                com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1 rememberedValue3 = composer2.rememberedValue();
                if ((changedInstance2 | z | changed | changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1(ppwEnterAmountViewModel3, appNavigator, rememberNavResultRequestId, stringResource, stringResource2, null);
                    composer2.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(ppwEnterAmountViewModel3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, (i6 >> 9) & 14);
                com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState ppwEnterAmountUiState = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState) collectAsState.getValue();
                if (ppwEnterAmountUiState instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content) {
                    composer2.startReplaceGroup(517739328);
                    com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel uiModel = ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content) ppwEnterAmountUiState).getUiModel();
                    boolean changedInstance3 = composer2.changedInstance(ppwEnterAmountViewModel3);
                    com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$3$1 rememberedValue4 = composer2.rememberedValue();
                    if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$3$1(ppwEnterAmountViewModel3);
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    getHighResolutionOutputSizeshNQ4ISI(uiModel, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue4), amountScreenComponents, modifier3, composer2, (i6 << 3) & 8064, 0);
                    composer2.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    ppwEnterAmountViewModel2 = ppwEnterAmountViewModel3;
                } else {
                    composer2.startReplaceGroup(1540719665);
                    composer2.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$eOs__vFtaVFNUAM55M8SGKzN64w(com.paypal.oslo.core.navigation.AppNavigator.this, amountScreenComponents, modifier2, ppwEnterAmountViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel ppwEnterAmountUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData;
        int i5;
        int i6;
        java.lang.Object obj;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-173221457);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(ppwEnterAmountUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(amountScreenComponents) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-173221457, i4, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountContent (PpwEnterAmountScreen.kt:162)");
                }
                boolean z = ppwEnterAmountUiModel.getActiveCurrency() == com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency.RECEIVER;
                com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData2 = new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData(new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData(null, new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData(null, null, ppwEnterAmountUiModel.getSenderCountryCode(), null, 11, null), new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(ppwEnterAmountUiModel.getSenderCurrencyCode(), ppwEnterAmountUiModel.getSenderAmount()), ppwEnterAmountUiModel.getSenderCountryCode(), com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(ppwEnterAmountUiModel.getReceiverCurrencyCode(), ppwEnterAmountUiModel.getReceiverAmount()), ppwEnterAmountUiModel.getReceiverCountryCode(), false, ppwEnterAmountUiModel.getActiveCurrency() == com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency.SENDER, z, null, 128, null), null, null, 25, null), com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData.INSTANCE.withInput(z ? ppwEnterAmountUiModel.getReceiverAmount() : ppwEnterAmountUiModel.getSenderAmount()), new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_button_create_qr, startRestartGroup, 0), ppwEnterAmountUiModel.getErrorMessage() == null, null, false, null, false, false, false, false, null, null, null, null, null, 16380, null));
                int i9 = i4 & 112;
                boolean z2 = i9 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$dnbbNRTEgUAhDhjP0YjBbwp9UDI(kotlin.jvm.functions.Function1.this, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                boolean z3 = i9 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$5PWEe8pzXDsclPtrAgB4Ti1TQcg(kotlin.jvm.functions.Function1.this, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue2;
                boolean z4 = i9 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$LV3iJdqDMTM5ljku8zZwHd0f07M(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean z5 = i9 == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$NQz0EywKRu_PqjGWuzgXdRQtACk(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                boolean z6 = i9 == 32;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$lboFTi6NG8y0UBIypn8hL476P3M(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks createPpwAmountCallbacks = createPpwAmountCallbacks(function12, function13, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue5, z);
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1559576011, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$gSwOBGyJFudDzwQvp6O8_RWrPgo(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1673186506, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$LMefNAapzk_dzhXa1QarDIqqLwQ(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 1769478, 30);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks heroCurrencySectionCallbacks = createPpwAmountCallbacks.getHeroCurrencySectionCallbacks();
                if (heroCurrencySectionCallbacks != null) {
                    startRestartGroup.startReplaceGroup(-1023966013);
                    final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig heroCurrencySectionConfig = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode.CROSS_BORDER, null, new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.CROSS_BORDER_DISPLAY_ONLY), new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyConfig(false, false, false, false, false, false, false, null, null, 505, null), 2, null);
                    android.content.res.Configuration configuration = new android.content.res.Configuration((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration()));
                    configuration.setLocale(new java.util.Locale("", ppwEnterAmountUiModel.getSenderCountryCode()));
                    amountScreenData = amountScreenData2;
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration().provides(configuration), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(628407484, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$tgdjYo0tWts5T1fnakuWL0XEdbg(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig.this, amountScreenData, heroCurrencySectionCallbacks, amountScreenComponents, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-1023966014);
                    startRestartGroup.endReplaceGroup();
                    amountScreenData = amountScreenData2;
                }
                startRestartGroup.endNode();
                java.lang.Integer errorMessage = ppwEnterAmountUiModel.getErrorMessage();
                if (errorMessage != null) {
                    startRestartGroup.startReplaceGroup(-1377900534);
                    i5 = 6;
                    i6 = 0;
                    com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(errorMessage.intValue(), startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 0);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-1377900535);
                    startRestartGroup.endReplaceGroup();
                    i6 = 0;
                    i5 = 6;
                }
                startRestartGroup.endNode();
                com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData3 = amountScreenData;
                int i10 = i5;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_txt_create_qr_for_exact_rate, new java.lang.Object[]{com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.getFxRateConversionText(ppwEnterAmountUiModel.getSenderCurrencyCode(), ppwEnterAmountUiModel.getReceiverCurrencyCode(), java.lang.Double.valueOf(6.95d))}, startRestartGroup, i6), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1000);
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), null, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ComposableSingletons$PpwEnterAmountScreenKt.INSTANCE.getLambda$994659841$qrc_prodRelease(), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306368, 502);
                com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks = createPpwAmountCallbacks.getKeyboardCallbacks();
                if (keyboardCallbacks != null) {
                    startRestartGroup.startReplaceGroup(-1184508751);
                    obj = null;
                    i7 = i4;
                    com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents.ComposeDefaultImpls.AmountKeyboard$default(new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig(false, false, 0, false, 15, null), amountScreenData3.getKeyboardData(), keyboardCallbacks, null, amountScreenComponents, startRestartGroup, ((i4 << 6) & 57344) | i10, 8);
                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-1184508752);
                    startRestartGroup.endReplaceGroup();
                    obj = null;
                    i7 = i4;
                }
                startRestartGroup.endNode();
                com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks = createPpwAmountCallbacks.getActionButtonGroupCallbacks();
                if (actionButtonGroupCallbacks != null) {
                    startRestartGroup.startReplaceGroup(-1874159832);
                    com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents.ComposeDefaultImpls.ActionButtonGroup$default(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary(), amountScreenData3.getActionButtonGroupData(), actionButtonGroupCallbacks, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24()), null, amountScreenComponents, startRestartGroup, (i7 << 9) & 458752, 16);
                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-1874159833);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$uj45BBqUBL3DCjrTssxkq81FOS8(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel.this, function1, amountScreenComponents, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks createPpwAmountCallbacks(final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        return new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks(z, function12, function1, function0, function02, function03) { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1
            private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1 actionButtonGroupCallbacks;
            private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1 heroCurrencySectionCallbacks;
            private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$keyboardCallbacks$1 keyboardCallbacks;

            /* JADX WARN: Type inference failed for: r6v0, types: [com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1] */
            {
                this.heroCurrencySectionCallbacks = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks(z, function12, function1, function0, function02) { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1
                    private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$amountInputCallbacks$1 amountInputCallbacks;
                    private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1 crossBorderCallbacks;
                    private final com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks currencyExchangeActionCallbacks;
                    private final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$currencyPickerCallbacks$1 currencyPickerCallbacks = new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$currencyPickerCallbacks$1
                        @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks
                        public final void onCurrencyClick() {
                        }

                        @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks
                        public final void onCurrencyTypeChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyType, "");
                        }
                    };

                    /* JADX WARN: Type inference failed for: r0v0, types: [com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$amountInputCallbacks$1] */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$currencyPickerCallbacks$1] */
                    /* JADX WARN: Type inference failed for: r2v2, types: [com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1] */
                    {
                        this.amountInputCallbacks = new com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$amountInputCallbacks$1
                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks
                            public final void onAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount) {
                                java.lang.String quantity;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
                                int i = com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$amountInputCallbacks$1.WhenMappings.$EnumSwitchMapping$0[amount.getType().ordinal()];
                                if (i == 1) {
                                    quantity = amount.requireFiat().getQuantity();
                                } else {
                                    if (i != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    quantity = amount.requireCrypto().getQuantity();
                                }
                                (z ? function12 : function1).invoke(quantity);
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks
                            public final void onTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
                                if (z) {
                                    function12.invoke(textFieldValue.getText());
                                } else {
                                    function1.invoke(textFieldValue.getText());
                                }
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                            public static final /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
                                    try {
                                        iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
                                    } catch (java.lang.NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
                                    } catch (java.lang.NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }
                        };
                        this.crossBorderCallbacks = new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1
                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onPrimaryCurrencyClick() {
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onSecondaryCurrencyClick() {
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onSwapClick() {
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onPrimaryAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount) {
                                java.lang.String quantity;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
                                int i = com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1.WhenMappings.$EnumSwitchMapping$0[amount.getType().ordinal()];
                                if (i == 1) {
                                    quantity = amount.requireFiat().getQuantity();
                                } else {
                                    if (i != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    quantity = amount.requireCrypto().getQuantity();
                                }
                                function1.invoke(quantity);
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onSecondaryAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount) {
                                java.lang.String quantity;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
                                int i = com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1.WhenMappings.$EnumSwitchMapping$0[amount.getType().ordinal()];
                                if (i == 1) {
                                    quantity = amount.requireFiat().getQuantity();
                                } else {
                                    if (i != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    quantity = amount.requireCrypto().getQuantity();
                                }
                                function12.invoke(quantity);
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onPrimaryRowClick() {
                                function0.invoke();
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onSecondaryRowClick() {
                                function02.invoke();
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onPrimaryTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
                                function1.invoke(textFieldValue.getText());
                            }

                            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
                            public final void onSecondaryTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
                                function12.invoke(textFieldValue.getText());
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                            public static final /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
                                    try {
                                        iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
                                    } catch (java.lang.NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
                                    } catch (java.lang.NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }
                        };
                    }

                    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
                    public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$amountInputCallbacks$1 getAmountInputCallbacks() {
                        return this.amountInputCallbacks;
                    }

                    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
                    public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$currencyPickerCallbacks$1 getCurrencyPickerCallbacks() {
                        return this.currencyPickerCallbacks;
                    }

                    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
                    public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1 getCrossBorderCallbacks() {
                        return this.crossBorderCallbacks;
                    }

                    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
                    public final com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks getCurrencyExchangeActionCallbacks() {
                        return this.currencyExchangeActionCallbacks;
                    }
                };
                this.keyboardCallbacks = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$keyboardCallbacks$1(z, function12, function1);
                this.actionButtonGroupCallbacks = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1(function03);
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks
            public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$heroCurrencySectionCallbacks$1 getHeroCurrencySectionCallbacks() {
                return this.heroCurrencySectionCallbacks;
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks
            public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$keyboardCallbacks$1 getKeyboardCallbacks() {
                return this.keyboardCallbacks;
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks
            public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1 getActionButtonGroupCallbacks() {
                return this.actionButtonGroupCallbacks;
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5785WeRffLDHxn0vFFMrZTqzO1U(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5PWEe8pzXDsclPtrAgB4Ti1TQcg(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LMefNAapzk_dzhXa1QarDIqqLwQ(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1673186506, i, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountContent.<anonymous>.<anonymous> (PpwEnterAmountScreen.kt:215)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$5785WeRffLDHxn0vFFMrZTqzO1U(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LV3iJdqDMTM5ljku8zZwHd0f07M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.PrimaryRowClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NQz0EywKRu_PqjGWuzgXdRQtACk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SecondaryRowClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dnbbNRTEgUAhDhjP0YjBbwp9UDI(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eOs__vFtaVFNUAM55M8SGKzN64w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel ppwEnterAmountViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PpwEnterAmountScreen(appNavigator, amountScreenComponents, modifier, ppwEnterAmountViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gSwOBGyJFudDzwQvp6O8_RWrPgo(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1559576011, i, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountContent.<anonymous>.<anonymous> (PpwEnterAmountScreen.kt:212)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.$r8$lambda$r9xlEtR1kbbNH23d5xDbkOqxIXQ(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lboFTi6NG8y0UBIypn8hL476P3M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ContinuePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r9xlEtR1kbbNH23d5xDbkOqxIXQ(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.BackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tgdjYo0tWts5T1fnakuWL0XEdbg(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig heroCurrencySectionConfig, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks heroCurrencySectionCallbacks, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(628407484, i, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PpwEnterAmountScreen.kt:252)");
            }
            com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents.ComposeDefaultImpls.HeroCurrencySection$default(heroCurrencySectionConfig, amountScreenData.getHeroCurrencySectionData(), heroCurrencySectionCallbacks, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), amountScreenComponents, composer, 3072, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uj45BBqUBL3DCjrTssxkq81FOS8(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel ppwEnterAmountUiModel, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(ppwEnterAmountUiModel, function1, amountScreenComponents, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
