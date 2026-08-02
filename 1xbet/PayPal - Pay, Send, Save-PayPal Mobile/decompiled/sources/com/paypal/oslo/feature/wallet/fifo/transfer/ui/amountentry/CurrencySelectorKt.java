package com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "config", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "", "onCurrencySelect", "CurrencySelector", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p0", "p1", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "p2", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;Landroidx/compose/runtime/Composer;I)V", "", "TestTagCurrencySelectorText", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CurrencySelectorKt {
    public static final java.lang.String TestTagCurrencySelectorText = "currency_selector_text";

    public static final void CurrencySelector(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySelectorConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1783369046);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(currencySelectorConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1783369046, i3, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelector (CurrencySelector.kt:65)");
            }
            if (currencySelectorConfig.getAvailableCurrencies().size() > 1) {
                startRestartGroup.startReplaceGroup(-397955403);
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                boolean z = (i3 & 896) == 256;
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$CurrencySelector$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$CurrencySelector$1$1(function1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$CurrencySelector$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$CurrencySelector$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m21309invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21309invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                Camera2StreamConfigurationMap(currencySelectorConfig, appNavigator, rememberNavResultRequestId, startRestartGroup, i3 & 126);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-397494495);
                getHighSpeedVideoFpsRangesFor(currencySelectorConfig.getSelectedCurrency(), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt.m21306$r8$lambda$4t3_d6XMIGa4CQZsKsNv_HhWdU(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig.this, appNavigator, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.graphics.painter.ColorPainter rememberFlagPainter;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2038540607);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(currencySelectorConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2038540607, i2, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorButton (CurrencySelector.kt:99)");
            }
            java.lang.String currency = currencySelectorConfig.getSelectedCurrency().getCurrency();
            try {
                currency = java.util.Currency.getInstance(currency).getDisplayName();
            } catch (java.lang.IllegalArgumentException unused) {
            }
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Currency, ".concat(java.lang.String.valueOf(currency))), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 896) == 256;
            boolean changedInstance = startRestartGroup.changedInstance(currencySelectorConfig);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt.$r8$lambda$BaiTijYbwHLooIhCNSlfw3DOPNo(com.paypal.oslo.core.navigation.AppNavigator.this, str, currencySelectorConfig);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.String currency2 = currencySelectorConfig.getSelectedCurrency().getCurrency();
            java.lang.String countryCode = currencySelectorConfig.getSelectedCurrency().getCountryCode();
            if (countryCode != null) {
                startRestartGroup.startReplaceGroup(675201439);
                rememberFlagPainter = com.paypal.pds.core.FlagKt.rememberFlagPainter(countryCode, com.paypal.pds.core.FlagSize.Small.INSTANCE, startRestartGroup, com.paypal.pds.core.FlagSize.Small.$stable << 3, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(675201438);
                startRestartGroup.endReplaceGroup();
                rememberFlagPainter = null;
            }
            if (rememberFlagPainter == null) {
                rememberFlagPainter = new androidx.compose.ui.graphics.painter.ColorPainter(androidx.compose.ui.graphics.Color.INSTANCE.m6028getLightGray0d7_KjU(), null);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.AvatarButtonKt.AvatarButton(function0, currency2, rememberFlagPainter, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "amount_entry_currency_row"), null, false, false, value, startRestartGroup, (androidx.compose.ui.graphics.painter.Painter.$stable << 6) | 3072, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt.m21308$r8$lambda$dkAG0_K48C0JKiRt8Skq7qX2JU(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig.this, appNavigator, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str;
        androidx.compose.ui.graphics.painter.ColorPainter rememberFlagPainter;
        java.lang.String str2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(138958708);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(selectedCurrency) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(138958708, i2, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyDisplay (CurrencySelector.kt:136)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_currency_code, startRestartGroup, 0);
            if (selectedCurrency == null || (str = selectedCurrency.getCurrency()) == null) {
                str = stringResource;
            }
            try {
                str = java.util.Currency.getInstance(str).getDisplayName();
            } catch (java.lang.IllegalArgumentException unused) {
            }
            final java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Currency, ".concat(java.lang.String.valueOf(str))), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "amount_entry_currency_row");
            boolean changed = startRestartGroup.changed(value);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt.$r8$lambda$20bEjsAQZaumBEcjLwxO0kANeBY(value, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag, (kotlin.jvm.functions.Function1) rememberedValue);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            java.lang.String countryCode = selectedCurrency != null ? selectedCurrency.getCountryCode() : null;
            if (countryCode != null) {
                startRestartGroup.startReplaceGroup(-1481320280);
                rememberFlagPainter = com.paypal.pds.core.FlagKt.rememberFlagPainter(countryCode, com.paypal.pds.core.FlagSize.Small.INSTANCE, startRestartGroup, com.paypal.pds.core.FlagSize.Small.$stable << 3, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1481320281);
                startRestartGroup.endReplaceGroup();
                rememberFlagPainter = null;
            }
            if (rememberFlagPainter == null) {
                rememberFlagPainter = new androidx.compose.ui.graphics.painter.ColorPainter(androidx.compose.ui.graphics.Color.INSTANCE.m6028getLightGray0d7_KjU(), null);
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(rememberFlagPainter, null, 2, null), null, com.paypal.pds.components.AvatarSize.Small.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Small.$stable << 6, 58);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
            if (selectedCurrency == null || (str2 = selectedCurrency.getCurrency()) == null) {
                str2 = stringResource;
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagCurrencySelectorText), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt.$r8$lambda$6a2t2VYEqUC57dgQ4kaSxA7QaRs(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$20bEjsAQZaumBEcjLwxO0kANeBY(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4-t3_d6XMIGa4CQZsKsNv_HhWdU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21306$r8$lambda$4t3_d6XMIGa4CQZsKsNv_HhWdU(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        CurrencySelector(currencySelectorConfig, appNavigator, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6a2t2VYEqUC57dgQ4kaSxA7QaRs(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(selectedCurrency, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BaiTijYbwHLooIhCNSlfw3DOPNo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt.m21307$r8$lambda$DhPsdSlpRln2LAa2TxsWiWkL_4(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Dh-PsdSlpRln2LAa2TxsWiWkL_4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21307$r8$lambda$DhPsdSlpRln2LAa2TxsWiWkL_4(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination(currencySelectorConfig));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dkAG0_K48C-0JKiRt8Skq7qX2JU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21308$r8$lambda$dkAG0_K48C0JKiRt8Skq7qX2JU(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(currencySelectorConfig, appNavigator, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
