package com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aÍ\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u001f\u001a)\u0010 \u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\"\u001a'\u0010#\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010$\u001a\r\u0010&\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010'\u001a\r\u0010(\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010'\u001a\r\u0010)\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010'\u001a\r\u0010*\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010'\"\u000e\u0010%\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, d2 = {"CryptoSellAmountEntryScreen", "", "viewModel", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/CryptoSellAmountEntryViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/CryptoSellAmountEntryViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoSellAmountEntryContent", "isLoading", "", "titleAssetDisplayName", "", "currentAmount", "currencyCode", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "maxSellableAmountFormatted", "exchangeRateFormatted", "amountError", "holdingsError", "showSellAllConfirmation", "isSellAllMode", "onAmountChange", "Lkotlin/Function1;", "onNavigateBack", "Lkotlin/Function0;", "onCtaClick", "onSellAllConfirm", "onSellAllDismiss", "onSellAllDialogNo", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "SellAmountError", "assetDisplayName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ConversionInfoSection", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewExchangeRate", "CryptoSellAmountEntryScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoSellAmountEntryScreenZeroPreview", "CryptoSellAmountEntryScreenErrorPreview", "CryptoSellAmountEntryScreenLoadingPreview", "cryptocurrency_prodRelease", "uiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellAmountEntryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSellAmountEntryScreen(final com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellAmountEntryViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-71373289);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(cryptoSellAmountEntryViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-71373289, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreen (CryptoSellAmountEntryScreen.kt:88)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(cryptoSellAmountEntryViewModel.getUiState(), null, startRestartGroup, 0, 1);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(cryptoSellAmountEntryViewModel);
                boolean z = (i3 & 112) == 32;
                com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$CryptoSellAmountEntryScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$CryptoSellAmountEntryScreen$1$1(cryptoSellAmountEntryViewModel, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                boolean isLoading = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).isLoading();
                java.lang.String titleAssetDisplayName = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getTitleAssetDisplayName();
                java.lang.String currentAmount = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getCurrentAmount();
                java.lang.String currencyCode = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getCurrencyCode();
                java.lang.String assetSymbol = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getAssetSymbol();
                java.lang.String maxSellableAmountFormatted = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getMaxSellableAmountFormatted();
                java.lang.String exchangeRateFormatted = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getExchangeRateFormatted();
                java.lang.String amountError = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getAmountError();
                java.lang.String holdingsError = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getHoldingsError();
                boolean showSellAllConfirmation = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).getShowSellAllConfirmation();
                boolean isSellAllMode = ((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) collectAsState.getValue()).isSellAllMode();
                boolean changedInstance2 = startRestartGroup.changedInstance(cryptoSellAmountEntryViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.m14042$r8$lambda$5EnlW1Mf50RGeHgujm_omH9xlM(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                boolean changedInstance3 = startRestartGroup.changedInstance(cryptoSellAmountEntryViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$RsYPOd0_q3pZyPaZNhU5wujF6FU(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean changedInstance4 = startRestartGroup.changedInstance(cryptoSellAmountEntryViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$Y_zbJHurjCf43IwxbC7fQ_dYDwI(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                boolean changedInstance5 = startRestartGroup.changedInstance(cryptoSellAmountEntryViewModel);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.m14044$r8$lambda$E9UHPoX0hYGwUWnfOuXm3DCsGA(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
                boolean changedInstance6 = startRestartGroup.changedInstance(cryptoSellAmountEntryViewModel);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$PcXKCs29rajAR24CYoseVeOnhs0(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue6;
                boolean changedInstance7 = startRestartGroup.changedInstance(cryptoSellAmountEntryViewModel);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.m14043$r8$lambda$BucaMtPz6HRKPatNZhdSb1mbfk(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                CryptoSellAmountEntryContent(isLoading, titleAssetDisplayName, currentAmount, currencyCode, assetSymbol, maxSellableAmountFormatted, exchangeRateFormatted, amountError, holdingsError, showSellAllConfirmation, isSellAllMode, function1, function0, function02, function03, function04, (kotlin.jvm.functions.Function0) rememberedValue7, modifier3, startRestartGroup, 0, (i3 << 15) & 29360128, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.m14045$r8$lambda$NuCghKUjHbEUU13QFyD_V2CDRw(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.this, appNavigator, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CryptoSellAmountEntryContent(final boolean z, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7, final java.lang.String str8, final boolean z2, final boolean z3, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        java.lang.String stringResource;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1662728);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(str4) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(str5) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(str6) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(str7) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changed(str8) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= startRestartGroup.changedInstance(function05) ? 1048576 : 524288;
        }
        int i7 = i3 & 131072;
        if (i7 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        int i8 = i5;
        if (!startRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (4793491 & i8) == 4793490) ? false : true, i6 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1662728, i6, i8, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryContent (CryptoSellAmountEntryScreen.kt:162)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(2005906541);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryTestTag.LOADING_STATE);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(2006366674);
                final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                boolean z4 = (29360128 & i6) == 8388608;
                boolean z5 = (234881024 & i6) == 67108864;
                boolean changed = startRestartGroup.changed(rememberScrollState);
                com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$CryptoSellAmountEntryContent$2$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((z4 | z5 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$CryptoSellAmountEntryContent$2$1(str7, str8, rememberScrollState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(str7, str8, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, (i6 >> 21) & 126);
                if (z3) {
                    startRestartGroup.startReplaceGroup(2006546226);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_action_sell_all, new java.lang.Object[]{str5}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(2006670288);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_next_button, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
                boolean z6 = (1879048192 & i6) == 536870912;
                boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$CryptoSellAmountEntryContent$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance | z6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$CryptoSellAmountEntryContent$3$1(z2, bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i6 >> 27) & 14);
                modifier3 = modifier4;
                final java.lang.String str9 = stringResource;
                composer2 = startRestartGroup;
                com.paypal.pds.components.DockKt.Dock(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), rememberScrollState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1765526367, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$7oq37ksznpDzTx2vHSvkWFboByE(str2, function1, z3, function02, str9, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-368884384, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.m14050$r8$lambda$bf_5NfYqlwX3BFfYXN7g73pIk(str, function0, rememberScrollState, str2, str3, str7, str8, str4, str5, str6, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), composer2, 27648, 4);
                if (z2) {
                    composer2.startReplaceGroup(2010650626);
                    java.lang.String str10 = !kotlin.text.StringsKt.isBlank(str) ? str : null;
                    if (str10 == null) {
                        str10 = str4;
                    }
                    com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.components.SellAllConfirmationBottomSheetKt.SellAllConfirmationBottomSheet(bottomSheetController, str10, function03, function05, function04, composer2, com.paypal.pds.components.BottomSheetController.$stable | ((i8 >> 6) & 896) | ((i8 >> 9) & 7168) | ((i8 >> 3) & 57344));
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(2010996586);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.m14049$r8$lambda$a978uu0sf_POFB0mzJUBf7h_k(z, str, str2, str3, str4, str5, str6, str7, str8, z2, z3, function1, function0, function02, function03, function04, function05, modifier2, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        final java.lang.String str4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1022356929);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1022356929, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.SellAmountError (CryptoSellAmountEntryScreen.kt:310)");
            }
            if (str != null) {
                startRestartGroup.startReplaceGroup(1062507600);
                str4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_trade_error_min_sell, new java.lang.Object[]{str, str3}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (str2 != null) {
                startRestartGroup.startReplaceGroup(1062513331);
                str4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_exceeds_holdings, new java.lang.Object[]{str2, str3}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1421665890);
                startRestartGroup.endReplaceGroup();
                str4 = null;
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(str4 != null, (androidx.compose.ui.Modifier) null, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1556503961, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$2dBsHFpVBHu26Pkoje_uoDQENaI(str4, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$fIcbJ0y1S05l2sslhf2noK5CMMA(str, str2, str3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final java.lang.String str2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-17469278);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-17469278, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.ConversionInfoSection (CryptoSellAmountEntryScreen.kt:341)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                if (!kotlin.text.StringsKt.isBlank(str)) {
                    startRestartGroup.startReplaceGroup(37076936);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_max_sellable, new java.lang.Object[]{str}, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "sell_amount_entry_max_label"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 432, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(37438582);
                    startRestartGroup.endReplaceGroup();
                }
                if (!kotlin.text.StringsKt.isBlank(str2)) {
                    startRestartGroup.startReplaceGroup(37507030);
                    modifier3 = modifier4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 384, 6, 1018);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    modifier3 = modifier4;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(37670710);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$Xe0mD7CekOVg7TQKkheDOOuHAu0(str, str2, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2dBsHFpVBHu26Pkoje_uoDQENaI(java.lang.String str, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1556503961, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.SellAmountError.<anonymous> (CryptoSellAmountEntryScreen.kt:326)");
        }
        com.paypal.pds.components.ContextualAlertKt.ContextualAlert(str == null ? "" : str, null, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, composer, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5EnlW1Mf50RGe-Hgujm_omH9xlM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14042$r8$lambda$5EnlW1Mf50RGeHgujm_omH9xlM(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        cryptoSellAmountEntryViewModel.handleEvent(new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.AmountChange(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7oq37ksznpDzTx2vHSvkWFboByE(java.lang.String str, kotlin.jvm.functions.Function1 function1, boolean z, kotlin.jvm.functions.Function0 function0, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1765526367, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryContent.<anonymous> (CryptoSellAmountEntryScreen.kt:206)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.components.CryptoSellAmountEntryDisclaimerTextKt.CryptoSellAmountEntryDisclaimerText(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), composer, 0, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
            com.paypal.oslo.core.commonui.components.NumericKeyboardKt.AmountKeyboard(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), 0, false, false, composer, 0, 56);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.pds.components.ButtonKt.Button(function0, str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryTestTag.NEXT_BUTTON), null, null, z ? com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE : com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1572864, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BucaMt-Pz6HRKPatNZhdSb1mbfk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14043$r8$lambda$BucaMtPz6HRKPatNZhdSb1mbfk(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel) {
        cryptoSellAmountEntryViewModel.handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.SellAllDialogNo.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$E9UHPoX0h-YGwUWnfOuXm3DCsGA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14044$r8$lambda$E9UHPoX0hYGwUWnfOuXm3DCsGA(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel) {
        cryptoSellAmountEntryViewModel.handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.SellAllConfirm.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GpHjKpuxK5QFXIS_7VRBtwOD4qk(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-171290789);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-171290789, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenPreview (CryptoSellAmountEntryScreen.kt:374)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("50", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$kShS38mAf7XoEdKUgaWuo2UnZ8E(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda5
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
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue7;
            composer2 = startRestartGroup;
            CryptoSellAmountEntryContent(false, "Bitcoin", str, "USD", "BTC", "$500.00", "1 BTC = $105,731.23", null, null, false, false, function1, function0, function02, function03, function04, function05, null, composer2, 920349750, 1797558, 131072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$GpHjKpuxK5QFXIS_7VRBtwOD4qk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IODdKociUKjU6shrzp3MRmMNTfU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N-uCghKUjHbEUU13QFyD_V2CDRw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14045$r8$lambda$NuCghKUjHbEUU13QFyD_V2CDRw(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoSellAmountEntryScreen(cryptoSellAmountEntryViewModel, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PcXKCs29rajAR24CYoseVeOnhs0(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel) {
        cryptoSellAmountEntryViewModel.handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.SellAllDismiss.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RsYPOd0_q3pZyPaZNhU5wujF6FU(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel) {
        cryptoSellAmountEntryViewModel.handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.BackButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UulAGW0MIS1nOnn_KW0SLYE3IjI(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2019080099);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2019080099, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenZeroPreview (CryptoSellAmountEntryScreen.kt:403)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$IODdKociUKjU6shrzp3MRmMNTfU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue6;
            composer2 = startRestartGroup;
            CryptoSellAmountEntryContent(false, "Bitcoin", "0", "USD", "BTC", com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PreviewConstants.SAMPLE_BALANCE, "1 BTC = $105,731.23", null, null, false, true, function1, function0, function02, function03, function04, function05, null, composer2, 920350134, 1797558, 131072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$UulAGW0MIS1nOnn_KW0SLYE3IjI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xe0mD7CekOVg7TQKkheDOOuHAu0(java.lang.String str, java.lang.String str2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(str, str2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y_zbJHurjCf43IwxbC7fQ_dYDwI(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel cryptoSellAmountEntryViewModel) {
        cryptoSellAmountEntryViewModel.handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEvent.CtaButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z_U_s2raLbXnPelwZ2OUnVwQtTo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$a978uu0sf_P-OF-B0mzJUBf7h_k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14049$r8$lambda$a978uu0sf_POFB0mzJUBf7h_k(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z2, boolean z3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, androidx.compose.ui.Modifier modifier, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        CryptoSellAmountEntryContent(z, str, str2, str3, str4, str5, str6, str7, str8, z2, z3, function1, function0, function02, function03, function04, function05, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bf_5NfYqlwX-3-BFfYXN7g73pIk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14050$r8$lambda$bf_5NfYqlwX3BFfYXN7g73pIk(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.ScrollState scrollState, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-368884384, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryContent.<anonymous> (CryptoSellAmountEntryScreen.kt:233)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String str9 = str;
            java.lang.String str10 = !kotlin.text.StringsKt.isBlank(str9) ? str : null;
            if (str10 == null) {
                composer.startReplaceGroup(-269191461);
                composer.endReplaceGroup();
                stringResource = null;
            } else {
                composer.startReplaceGroup(-269191460);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_title, new java.lang.Object[]{str10}, composer, 0);
                composer.endReplaceGroup();
            }
            if (stringResource == null) {
                stringResource = "";
            }
            com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(stringResource, new com.paypal.oslo.core.navigation.ui.NavigationBarButton(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_back_button, composer, 0)), null, 4, null), null, composer, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable, 2);
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1707paddingVpY3zN4);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.components.PayPalAmountDisplayKt.PayPalAmountDisplay(str2, str3, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
            java.lang.String str11 = kotlin.text.StringsKt.isBlank(str9) ? null : str;
            if (str11 == null) {
                str11 = str6;
            }
            getHighSpeedVideoFpsRangesFor(str4, str5, str11, composer, 0);
            if (str4 == null && str5 == null) {
                composer.startReplaceGroup(-708293289);
                getHighResolutionOutputSizeshNQ4ISI(str7, str8, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-707986730);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fIcbJ0y1S05l2sslhf2noK5CMMA(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(str, str2, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kShS38mAf7XoEdKUgaWuo2UnZ8E(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qCXc766Gvo6AfbwJzqdboD3RMJM(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(536985229);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(536985229, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenLoadingPreview (CryptoSellAmountEntryScreen.kt:457)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$z04UhUuGNzspxatrcw9fG9S8Oxo((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue6;
            composer2 = startRestartGroup;
            CryptoSellAmountEntryContent(true, "", "0", "USD", "BTC", "", "", null, null, false, false, function1, function0, function02, function03, function04, function05, null, composer2, 920350134, 1797558, 131072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$qCXc766Gvo6AfbwJzqdboD3RMJM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yyyH0IL4i9xZQBgmqpLMuiAgO9I(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-950234599);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-950234599, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenErrorPreview (CryptoSellAmountEntryScreen.kt:430)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$Z_U_s2raLbXnPelwZ2OUnVwQtTo((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue6;
            composer2 = startRestartGroup;
            CryptoSellAmountEntryContent(false, "Bitcoin", "0.50", "USD", "BTC", "$500.00", "1 BTC = $105,731.23", "$1.00", null, false, false, function1, function0, function02, function03, function04, function05, null, composer2, 920350134, 1797558, 131072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.$r8$lambda$yyyH0IL4i9xZQBgmqpLMuiAgO9I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z04UhUuGNzspxatrcw9fG9S8Oxo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
