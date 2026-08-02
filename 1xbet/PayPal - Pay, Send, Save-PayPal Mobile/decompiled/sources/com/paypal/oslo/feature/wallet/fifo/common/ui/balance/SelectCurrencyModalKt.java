package com.paypal.oslo.feature.wallet.fifo.common.ui.balance;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "selectCurrencySelectorConfig", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "", "onCurrencySelect", "SelectCurrencyModal", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "TestTagSelectCurrencyList", "Ljava/lang/String;", "TestTagSelectCurrencyFlag", "TestTagSelectCurrencyCheckmark"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectCurrencyModalKt {
    public static final java.lang.String TestTagSelectCurrencyCheckmark = "test_tag_currency_checkmark";
    public static final java.lang.String TestTagSelectCurrencyFlag = "test_tag_currency_flag";
    public static final java.lang.String TestTagSelectCurrencyList = "test_tag_select_currency_list";

    public static final void SelectCurrencyModal(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        java.lang.String currency;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySelectorConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(860738248);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(currencySelectorConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(860738248, i2, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModal (SelectCurrencyModal.kt:54)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency = currencySelectorConfig.getSelectedCurrency();
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_selected, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1759216029);
            java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency> availableCurrencies = currencySelectorConfig.getAvailableCurrencies();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(availableCurrencies, 10));
            for (final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency2 : availableCurrencies) {
                final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(selectedCurrency2.getCurrency(), selectedCurrency.getCurrency());
                java.lang.String currencySymbol$wallet_prodRelease = com.paypal.oslo.feature.wallet.fifo.common.util.CurrencyUtils.INSTANCE.getCurrencySymbol$wallet_prodRelease(selectedCurrency2.getCurrency());
                try {
                    currency = java.util.Currency.getInstance(selectedCurrency2.getCurrency()).getDisplayName();
                } catch (java.lang.IllegalArgumentException unused) {
                    currency = selectedCurrency2.getCurrency();
                }
                java.lang.String str = currency;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_available_amount, new java.lang.Object[]{currencySymbol$wallet_prodRelease, java.lang.Double.valueOf(selectedCurrency2.getAvailableBalance()), selectedCurrency2.getCurrency()}, startRestartGroup, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                arrayList.add(new com.paypal.pds.components.ListItem(str, stringResource2, null, null, false, false, areEqual ? com.paypal.oslo.feature.wallet.fifo.common.ui.balance.ComposableSingletons$SelectCurrencyModalKt.INSTANCE.getLambda$1678213597$wallet_prodRelease() : null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1959835205, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt.$r8$lambda$67fphKUhlxMtlSFipbgCMeif81w(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency.this, areEqual, stringResource, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, null, null, null, null, 7980, null));
            }
            final java.util.ArrayList arrayList2 = arrayList;
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), TestTagSelectCurrencyList);
            boolean changedInstance = startRestartGroup.changedInstance(arrayList2);
            boolean changedInstance2 = startRestartGroup.changedInstance(currencySelectorConfig);
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt.$r8$lambda$OGAZ9BtrbeGLuTYtzEtgLRJ2aaw(arrayList2, currencySelectorConfig, function1, (com.paypal.pds.components.ListItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ListKt.List(arrayList2, testTag, null, null, null, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 0, 0, 1532);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt.$r8$lambda$qx8VWIiAI8to7YsmpPfkoQA1gHM(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$67fphKUhlxMtlSFipbgCMeif81w(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency, boolean z, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1959835205, i, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModal.<anonymous>.<anonymous> (SelectCurrencyModal.kt:78)");
            }
            java.lang.String countryCode = selectedCurrency.getCountryCode();
            if (countryCode == null) {
                countryCode = "US";
            }
            androidx.compose.foundation.ImageKt.Image(com.paypal.pds.core.FlagKt.rememberFlagPainter(countryCode, com.paypal.pds.core.FlagSize.Small.INSTANCE, composer, com.paypal.pds.core.FlagSize.Small.$stable << 3, 0), z ? str : null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize32()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), TestTagSelectCurrencyFlag), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, composer, androidx.compose.ui.graphics.painter.Painter.$stable | 24576, 104);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9IISM30rSfXttgoudCwcmlTnBUc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-755211253);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-755211253, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalPreview (SelectCurrencyModal.kt:123)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency[]{new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency("USD", 130.0d, (java.lang.String) null, "", 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, 290.0d, (java.lang.String) null, "", 4, (kotlin.jvm.internal.DefaultConstructorMarker) null)}), new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency("USD", 130.0d, (java.lang.String) null, "", 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt.m21299$r8$lambda$SeVLMttrdLqEuHuzD2sp0fXFtg((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SelectCurrencyModal(currencySelectorConfig, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt.$r8$lambda$9IISM30rSfXttgoudCwcmlTnBUc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OGAZ9BtrbeGLuTYtzEtgLRJ2aaw(java.util.List list, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.ListItem listItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        function1.invoke(currencySelectorConfig.getAvailableCurrencies().get(list.indexOf(listItem)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SeVLMttrdLqEuHuzD2sp0fXF-tg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21299$r8$lambda$SeVLMttrdLqEuHuzD2sp0fXFtg(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qx8VWIiAI8to7YsmpPfkoQA1gHM(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        SelectCurrencyModal(currencySelectorConfig, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
