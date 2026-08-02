package com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a'\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"CurrencyPickerButtonTag", "", "CurrencyPickerComponent", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CashAndCryptoPicker", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createCashPickerItem", "Lcom/paypal/oslo/core/commonui/components/CurrencyPickerItem;", "defaultLabel", "contentDescription", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/commonui/components/CurrencyPickerItem;", "createCryptoPickerItem", "SingleCurrencyPicker", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerCallbacks;Landroidx/compose/runtime/Composer;I)V", "CurrencyDisplayOnly", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;Landroidx/compose/runtime/Composer;I)V", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyPickerComponentKt {
    public static final java.lang.String CurrencyPickerButtonTag = "currency_picker_button";

    public static final void CurrencyPickerComponent(final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerConfig currencyPickerConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2114688478);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(currencyPickerConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(currencyPickerData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(currencyPickerCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2114688478, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponent (CurrencyPickerComponent.kt:68)");
            }
            int i5 = com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt.WhenMappings.$EnumSwitchMapping$0[currencyPickerConfig.getMode().ordinal()];
            if (i5 == 1) {
                startRestartGroup.startReplaceGroup(696104140);
                Camera2StreamConfigurationMap(currencyPickerData, currencyPickerCallbacks, modifier, startRestartGroup, (i3 >> 3) & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
                startRestartGroup.endReplaceGroup();
            } else if (i5 == 2) {
                startRestartGroup.startReplaceGroup(696106819);
                getHighSpeedVideoSizes(currencyPickerData, currencyPickerCallbacks, startRestartGroup, (i3 >> 3) & 126);
                startRestartGroup.endReplaceGroup();
            } else if (i5 == 3 || i5 == 4) {
                startRestartGroup.startReplaceGroup(696111127);
                getHighResolutionOutputSizeshNQ4ISI(currencyPickerData, startRestartGroup, (i3 >> 3) & 14);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 5) {
                    startRestartGroup.startReplaceGroup(696102308);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(696113090);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt.$r8$lambda$lMradAXl8DPTqn4bCmgLoSHtJtk(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerConfig.this, currencyPickerData, currencyPickerCallbacks, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1115039822);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(currencyPickerData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(currencyPickerCallbacks) ? 32 : 16;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(1115039822, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CashAndCryptoPicker (CurrencyPickerComponent.kt:91)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_currency_picker_cash, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_currency_picker_crypto, startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_currency_picker_fiat_description, startRestartGroup, 0);
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_currency_picker_crypto_description, startRestartGroup, 0);
                final int i5 = currencyPickerData.getActiveCurrencyType() == com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH ? 0 : 1;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, "currency_picker_button");
                int i6 = i3 & 14;
                com.paypal.oslo.core.commonui.components.CurrencyPickerItem Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(currencyPickerData, stringResource, stringResource3, startRestartGroup, i6);
                com.paypal.oslo.core.commonui.components.CurrencyPickerItem highSpeedVideoSizes = getHighSpeedVideoSizes(currencyPickerData, stringResource2, stringResource4, startRestartGroup, i6);
                boolean changed = startRestartGroup.changed(i5);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt.$r8$lambda$YK0QnlVtLNSlqO3APig912K5Mjo(i5, currencyPickerCallbacks, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.commonui.components.CurrencyPickerKt.CurrencyPicker(Camera2StreamConfigurationMap, highSpeedVideoSizes, testTag, i5, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, com.paypal.oslo.core.commonui.components.CurrencyPickerItem.$stable | (com.paypal.oslo.core.commonui.components.CurrencyPickerItem.$stable << 3), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt.$r8$lambda$T8UmZwpWDKxxfWl20_xO6nJqjLc(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData.this, currencyPickerCallbacks, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    private static final com.paypal.oslo.core.commonui.components.CurrencyPickerItem Camera2StreamConfigurationMap(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1210567489, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.createCashPickerItem (CurrencyPickerComponent.kt:137)");
        }
        boolean z = currencyPickerData.getActiveCurrencyType() == com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH && currencyPickerData.getPrimaryCurrency() != null;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount primaryCurrency = currencyPickerData.getPrimaryCurrency();
        androidx.compose.ui.graphics.painter.Painter painter = null;
        java.lang.String symbol = primaryCurrency != null ? com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getSymbol(primaryCurrency) : null;
        if (z && symbol != null) {
            str = symbol;
        }
        if (z) {
            composer.startReplaceGroup(824835989);
            java.lang.String primaryCurrencyCountryCode = currencyPickerData.getPrimaryCurrencyCountryCode();
            if (primaryCurrencyCountryCode == null) {
                primaryCurrencyCountryCode = "";
            }
            painter = com.paypal.pds.core.FlagKt.rememberFlagPainter(primaryCurrencyCountryCode, com.paypal.pds.core.FlagSize.XSmall.INSTANCE, composer, com.paypal.pds.core.FlagSize.XSmall.$stable << 3, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(825010023);
            composer.endReplaceGroup();
        }
        com.paypal.oslo.core.commonui.components.CurrencyPickerItem currencyPickerItem = new com.paypal.oslo.core.commonui.components.CurrencyPickerItem(str, painter, str2, true);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return currencyPickerItem;
    }

    private static final com.paypal.oslo.core.commonui.components.CurrencyPickerItem getHighSpeedVideoSizes(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(79815921, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.createCryptoPickerItem (CurrencyPickerComponent.kt:171)");
        }
        boolean z = currencyPickerData.getActiveCurrencyType() == com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO && currencyPickerData.getSecondaryCurrency() != null;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount secondaryCurrency = currencyPickerData.getSecondaryCurrency();
        com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter = null;
        java.lang.String symbol = secondaryCurrency != null ? com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getSymbol(secondaryCurrency) : null;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount secondaryCurrency2 = currencyPickerData.getSecondaryCurrency();
        java.lang.String name2 = (secondaryCurrency2 == null || (crypto = secondaryCurrency2.getCrypto()) == null) ? null : crypto.getName();
        if (z && symbol != null) {
            str = symbol;
        }
        if (z) {
            composer.startReplaceGroup(-1615192269);
            if (name2 == null) {
                name2 = "";
            }
            asyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(com.paypal.oslo.feature.moneymovement.ui.shared.utils.CryptoLogoUtilsKt.cryptoLogoUrl(name2), null, null, null, null, composer, 0, 30);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1615095115);
            composer.endReplaceGroup();
        }
        com.paypal.oslo.core.commonui.components.CurrencyPickerItem currencyPickerItem = new com.paypal.oslo.core.commonui.components.CurrencyPickerItem(str, asyncImagePainter, str2, true);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return currencyPickerItem;
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1164775641);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(currencyPickerData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(currencyPickerCallbacks) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1164775641, i2, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.SingleCurrencyPicker (CurrencyPickerComponent.kt:200)");
            }
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount primaryCurrency = currencyPickerData.getPrimaryCurrency();
            java.lang.String symbol = primaryCurrency != null ? com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getSymbol(primaryCurrency) : null;
            if (symbol == null) {
                symbol = "";
            }
            java.lang.String str = symbol;
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt.$r8$lambda$D0biwT209TsWlzJL3gOmdt28EgU(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.AvatarButtonKt.AvatarButton((kotlin.jvm.functions.Function0) rememberedValue, str, com.paypal.oslo.feature.moneymovement.ui.shared.utils.CurrencyPainterKt.rememberCurrencyPainter(currencyPickerData.getPrimaryCurrency(), currencyPickerData.getPrimaryCurrencyCountryCode(), startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "currency_picker_button"), null, false, false, null, startRestartGroup, (androidx.compose.ui.graphics.painter.Painter.$stable << 6) | 3072, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt.$r8$lambda$Ssv3nJfEQq_e3Ce5mPcZPHhAPBg(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData.this, currencyPickerCallbacks, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(808159964);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(currencyPickerData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(808159964, i2, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyDisplayOnly (CurrencyPickerComponent.kt:219)");
            }
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount primaryCurrency = currencyPickerData.getPrimaryCurrency();
            java.lang.String symbol = primaryCurrency != null ? com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getSymbol(primaryCurrency) : null;
            if (symbol == null) {
                symbol = "";
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.feature.moneymovement.ui.shared.utils.CurrencyPainterKt.rememberCurrencyPainter(currencyPickerData.getPrimaryCurrency(), currencyPickerData.getPrimaryCurrencyCountryCode(), startRestartGroup, 0), null, 2, null), null, com.paypal.pds.components.AvatarSize.XSmall.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.XSmall.$stable << 6, 58);
            java.lang.String str = symbol;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt.$r8$lambda$qPslxc4v_6s4viD00imrAXR7DMg(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D0biwT209TsWlzJL3gOmdt28EgU(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks) {
        currencyPickerCallbacks.onCurrencyClick();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ssv3nJfEQq_e3Ce5mPcZPHhAPBg(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(currencyPickerData, currencyPickerCallbacks, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T8UmZwpWDKxxfWl20_xO6nJqjLc(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(currencyPickerData, currencyPickerCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YK0QnlVtLNSlqO3APig912K5Mjo(int i, com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks, int i2) {
        if (i2 != i) {
            currencyPickerCallbacks.onCurrencyTypeChange(i2 == 0 ? com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH : com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO);
        } else {
            currencyPickerCallbacks.onCurrencyClick();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lMradAXl8DPTqn4bCmgLoSHtJtk(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerConfig currencyPickerConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CurrencyPickerComponent(currencyPickerConfig, currencyPickerData, currencyPickerCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qPslxc4v_6s4viD00imrAXR7DMg(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(currencyPickerData, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.CASH_AND_CRYPTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.SINGLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.DISPLAY_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.CROSS_BORDER_DISPLAY_ONLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.NONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
