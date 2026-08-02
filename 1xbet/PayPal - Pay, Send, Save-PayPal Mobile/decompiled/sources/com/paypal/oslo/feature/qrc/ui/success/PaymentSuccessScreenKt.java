package com.paypal.oslo.feature.qrc.ui.success;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a=\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"PaymentSuccessScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navArgs", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;", "successScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessViewModel;Landroidx/compose/runtime/Composer;II)V", "PaymentSuccessScreenContent", "uiModel", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessUiModel;", "onDonePress", "Lkotlin/Function0;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessUiModel;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "qrc_prodRelease", "uiState", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSuccessScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentSuccessScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs paymentSuccessNavArgs, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel paymentSuccessViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel paymentSuccessViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel paymentSuccessViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.ui.Modifier modifier4;
        final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel paymentSuccessViewModel4;
        ?? r5;
        boolean changedInstance;
        boolean z;
        com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$PaymentSuccessScreen$1$1 rememberedValue;
        boolean changedInstance2;
        boolean z2;
        com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$PaymentSuccessScreen$2$1 rememberedValue2;
        com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState paymentSuccessUiState;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSuccessNavArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-241882788);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(paymentSuccessNavArgs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(successScreenComponents) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    paymentSuccessViewModel2 = paymentSuccessViewModel;
                    if (startRestartGroup.changedInstance(paymentSuccessViewModel2)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    paymentSuccessViewModel2 = paymentSuccessViewModel;
                }
                i4 = 8192;
                i3 |= i4;
            } else {
                paymentSuccessViewModel2 = paymentSuccessViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    companion = modifier2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i3 &= -57345;
                        modifier4 = companion;
                        paymentSuccessViewModel4 = (com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        r5 = 0;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-241882788, i3, -1, "com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreen (PaymentSuccessScreen.kt:54)");
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(paymentSuccessViewModel4);
                        z = (i3 & 112) != 32 ? true : r5;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$PaymentSuccessScreen$1$1(paymentSuccessViewModel4, paymentSuccessNavArgs, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        changedInstance2 = startRestartGroup.changedInstance(paymentSuccessViewModel4);
                        int i6 = i3 & 14;
                        z2 = i6 != 4 ? true : r5;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!(changedInstance2 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$PaymentSuccessScreen$2$1(paymentSuccessViewModel4, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(paymentSuccessViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i3 >> 12) & 14);
                        paymentSuccessUiState = (com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(paymentSuccessViewModel4.getUiState(), null, startRestartGroup, r5, 1).getValue();
                        if (!(paymentSuccessUiState instanceof com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Initial)) {
                            startRestartGroup.startReplaceGroup(1025856048);
                            startRestartGroup.endReplaceGroup();
                            composer2 = startRestartGroup;
                        } else if (paymentSuccessUiState instanceof com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Content) {
                            startRestartGroup.startReplaceGroup(1025981195);
                            com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiModel uiModel = ((com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Content) paymentSuccessUiState).getUiModel();
                            boolean changedInstance3 = startRestartGroup.changedInstance(paymentSuccessViewModel4);
                            boolean z3 = i6 == 4 ? true : r5;
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if ((changedInstance3 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt.m17962$r8$lambda$NiHcgghfbtcXof0abU9HR7obaM(com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel.this, appNavigator);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            int i7 = i3 << 3;
                            composer2 = startRestartGroup;
                            PaymentSuccessScreenContent(appNavigator, uiModel, (kotlin.jvm.functions.Function0) rememberedValue3, successScreenComponents, modifier4, startRestartGroup, (i7 & 7168) | i6 | (i7 & 57344), 0);
                            composer2.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-521098911);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        paymentSuccessViewModel3 = paymentSuccessViewModel4;
                    }
                }
                r5 = 0;
                modifier4 = companion;
                paymentSuccessViewModel4 = paymentSuccessViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(paymentSuccessViewModel4);
                if ((i3 & 112) != 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z)) {
                }
                rememberedValue = new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$PaymentSuccessScreen$1$1(paymentSuccessViewModel4, paymentSuccessNavArgs, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                changedInstance2 = startRestartGroup.changedInstance(paymentSuccessViewModel4);
                int i62 = i3 & 14;
                if (i62 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | z2)) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$PaymentSuccessScreen$2$1(paymentSuccessViewModel4, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(paymentSuccessViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i3 >> 12) & 14);
                paymentSuccessUiState = (com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(paymentSuccessViewModel4.getUiState(), null, startRestartGroup, r5, 1).getValue();
                if (!(paymentSuccessUiState instanceof com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Initial)) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                paymentSuccessViewModel3 = paymentSuccessViewModel4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                paymentSuccessViewModel3 = paymentSuccessViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt.$r8$lambda$0dC1PPii2Zy43Db5aWPaXVAhgf4(com.paypal.oslo.core.navigation.AppNavigator.this, paymentSuccessNavArgs, successScreenComponents, modifier3, paymentSuccessViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentSuccessScreenContent(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiModel paymentSuccessUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSuccessUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(532646861);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(paymentSuccessUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(successScreenComponents) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(532646861, i4, -1, "com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenContent (PaymentSuccessScreen.kt:102)");
                }
                com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig = new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary(), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, false, false, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.TO, null, null, false, false, 247, null), true, true, false, false, false, 64, null);
                if (paymentSuccessUiModel.isPayPalWorld()) {
                    startRestartGroup.startReplaceGroup(-1820906697);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_success_txt_fxrate_includes_label, new java.lang.Object[]{com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.getFxRateConversionText(paymentSuccessUiModel.getSourceCurrency(), paymentSuccessUiModel.getCurrency(), paymentSuccessUiModel.getPpwFxRate())}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    str = stringResource;
                } else {
                    startRestartGroup.startReplaceGroup(-1820570347);
                    startRestartGroup.endReplaceGroup();
                    str = null;
                }
                com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData = new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData(new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_done, startRestartGroup, 0), false, null, false, null, false, false, false, false, null, null, null, null, null, 16382, null), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(com.paypal.oslo.feature.moneymovement.api.domain.Intent.PAID, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(java.lang.String.valueOf(paymentSuccessUiModel.getSourceCurrency()), java.lang.String.valueOf(paymentSuccessUiModel.getSourceAmount())), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(null, paymentSuccessUiModel.getMerchantName(), paymentSuccessUiModel.getMerchantInitials()), null, null, null, null, 120, null), str, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_success_txt_label_date_transaction_id_disclaimer, new java.lang.Object[]{paymentSuccessUiModel.getTransactionTimestamp(), paymentSuccessUiModel.getTransactionId()}, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_success_txt_activity_link, startRestartGroup, 0), "")), null, null, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(java.lang.String.valueOf(paymentSuccessUiModel.getSourceCurrency()), "0"), 96, null);
                com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion companion = com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.INSTANCE;
                com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks invoke$default = com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.INSTANCE, function0, null, null, null, null, null, 62, null);
                boolean z = (i4 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt.$r8$lambda$m5Ayqb5KtYMPamKkddzX_ojGfHc(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents.ComposeDefaultImpls.Content$default(mMPSuccessScreenConfig, mMPSuccessScreenData, companion.invoke(function0, invoke$default, (kotlin.jvm.functions.Function2) rememberedValue), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), successScreenComponents, startRestartGroup, (i4 << 3) & 57344, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt.$r8$lambda$wSpGUvS5gbj4R5e8mAYOxOI3lEg(com.paypal.oslo.core.navigation.AppNavigator.this, paymentSuccessUiModel, function0, successScreenComponents, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0dC1PPii2Zy43Db5aWPaXVAhgf4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs paymentSuccessNavArgs, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel paymentSuccessViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentSuccessScreen(appNavigator, paymentSuccessNavArgs, successScreenComponents, modifier, paymentSuccessViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1WgfnmjRJp5fOJQpgb3sLHXQtG8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.api.navigation.QrcFlow.class));
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NiHcgghfbtcXof0abU9HR7-obaM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17962$r8$lambda$NiHcgghfbtcXof0abU9HR7obaM(com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel paymentSuccessViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        paymentSuccessViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessEvent.ClosePressed.INSTANCE);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt.$r8$lambda$mhN9zXyMqDauH34vIuxaO6i9fMs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m5Ayqb5KtYMPamKkddzX_ojGfHc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt.$r8$lambda$1WgfnmjRJp5fOJQpgb3sLHXQtG8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mhN9zXyMqDauH34vIuxaO6i9fMs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.api.navigation.QrcFlow.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wSpGUvS5gbj4R5e8mAYOxOI3lEg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiModel paymentSuccessUiModel, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentSuccessScreenContent(appNavigator, paymentSuccessUiModel, function0, successScreenComponents, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
