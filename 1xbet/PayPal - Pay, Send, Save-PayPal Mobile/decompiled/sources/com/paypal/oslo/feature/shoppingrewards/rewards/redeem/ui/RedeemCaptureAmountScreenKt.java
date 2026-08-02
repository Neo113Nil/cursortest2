package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a/\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"redeemAmountErrorMessage", "", "amount", "availablePoints", "", "RedeemCaptureAmountScreen", "", "state", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyCapture;", "viewModel", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;", "amountScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyCapture;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemCaptureAmountScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RedeemCaptureAmountScreen(final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture readyCapture, final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        java.lang.String str2;
        int i4;
        java.lang.String stringResource;
        int i5;
        java.lang.String stringResource2;
        java.lang.String str3;
        com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig copy;
        java.lang.String stringResource3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyCapture, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1140715933);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(readyCapture) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(redeemViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(amountScreenComponents) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1140715933, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreen (RedeemCaptureAmountScreen.kt:74)");
                }
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_points, startRestartGroup, 0), readyCapture.getAmount());
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat2 = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(readyCapture.getCurrencyCode(), readyCapture.getConvertedAmount());
                java.lang.String amount = readyCapture.getAmount();
                int availablePoints = readyCapture.getAvailablePoints();
                java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(amount);
                if ((intOrNull == null || intOrNull.intValue() == 0) && amount.length() > 0) {
                    str = "Enter an amount of 1 or more";
                } else {
                    java.lang.Integer intOrNull2 = kotlin.text.StringsKt.toIntOrNull(amount);
                    if ((intOrNull2 != null ? intOrNull2.intValue() : 0) > availablePoints) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Enter an amount of ");
                        sb.append(availablePoints);
                        sb.append(" or less");
                        str = sb.toString();
                    } else {
                        str2 = null;
                        com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData crossBorderHeroCurrencyData = new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData(fiat, null, fiat2, "US", false, false, false, str2, 114, null);
                        java.lang.String exchangeRateDisplayText = readyCapture.getExchangeRateDisplayText();
                        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_spend, new java.lang.Object[]{java.lang.Integer.valueOf(readyCapture.getAvailablePoints())}, startRestartGroup, 0);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(exchangeRateDisplayText);
                        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                        sb2.append(stringResource4);
                        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData(null, null, crossBorderHeroCurrencyData, null, sb2.toString());
                        com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData(readyCapture.getAmount(), false, null, null, null, null, 62, null);
                        i4 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.WhenMappings.$EnumSwitchMapping$0[readyCapture.getRedeemType().ordinal()];
                        if (i4 != 1 || i4 == 2) {
                            startRestartGroup.startReplaceGroup(1011399788);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_cta_title, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (i4 != 3) {
                                startRestartGroup.startReplaceGroup(1011397318);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(1011404589);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_donate_cta_title, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        java.lang.String str4 = stringResource;
                        int availablePoints2 = readyCapture.getAvailablePoints();
                        java.lang.Integer intOrNull3 = kotlin.text.StringsKt.toIntOrNull(readyCapture.getAmount());
                        int intValue = intOrNull3 == null ? intOrNull3.intValue() : 0;
                        boolean z = intValue <= 0 && intValue <= availablePoints2;
                        startRestartGroup.startReplaceGroup(1011412197);
                        java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_terms_link_text, startRestartGroup, 0);
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("{link-terms}");
                        sb3.append(stringResource5);
                        sb3.append("{/link-terms}");
                        java.lang.String obj = sb3.toString();
                        i5 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.WhenMappings.$EnumSwitchMapping$0[readyCapture.getRedeemType().ordinal()];
                        if (i5 != 1) {
                            startRestartGroup.startReplaceGroup(1594614203);
                            stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_balance_terms, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else if (i5 == 2) {
                            startRestartGroup.startReplaceGroup(1594618043);
                            stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_savings_terms, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (i5 != 3) {
                                startRestartGroup.startReplaceGroup(1594612286);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(1594621847);
                            startRestartGroup.endReplaceGroup();
                            str3 = obj;
                            startRestartGroup.endReplaceGroup();
                            com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData = new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData(heroCurrencySectionData, keyboardData, new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData(str4, z, null, false, null, false, false, false, false, null, null, null, str3, null, 12284, null));
                            com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig heroCurrencySectionConfig = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode.CROSS_BORDER, null, new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.CROSS_BORDER_DISPLAY_ONLY), new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyConfig(false, false, false, false, false, false, true, com.paypal.pds.core.Icon.Trophy.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_points, startRestartGroup, 0), 43, null), 2, null);
                            com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig wholeNumbersOnly = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig.INSTANCE.wholeNumbersOnly();
                            copy = r16.copy((r20 & 1) != 0 ? r16.primaryButtonStyle : null, (r20 & 2) != 0 ? r16.showSecondaryButton : false, (r20 & 4) != 0 ? r16.secondaryButtonStyle : null, (r20 & 8) != 0 ? r16.showTertiaryButton : false, (r20 & 16) != 0 ? r16.tertiaryButtonStyle : null, (r20 & 32) != 0 ? r16.buttonSize : null, (r20 & 64) != 0 ? r16.layoutDirection : null, (r20 & 128) != 0 ? r16.showDisclaimer : true, (r20 & 256) != 0 ? com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary().showFooterNote : false);
                            com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig = new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig(heroCurrencySectionConfig, wholeNumbersOnly, copy);
                            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1 redeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1(redeemViewModel);
                            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-456788957, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.m19476$r8$lambda$mEyf0N1w0UsQ1zC2FFvPjmtTk(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54), null, startRestartGroup, 196614, 94);
                            if (readyCapture.getRedeemType() == com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION) {
                                startRestartGroup.startReplaceGroup(2109924654);
                                stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_charity_details_donation_amount, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(2110088737);
                                stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_balance_header, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                            androidx.compose.ui.Modifier modifier5 = modifier4;
                            composer2 = startRestartGroup;
                            com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents.ComposeDefaultImpls.AmountScreen$default(amountScreenConfig, amountScreenData, redeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null)), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), amountScreenComponents, startRestartGroup, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig.$stable | (com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData.$stable << 3) | ((i3 << 6) & 57344), 0);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        }
                        str3 = stringResource2;
                        startRestartGroup.endReplaceGroup();
                        com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData2 = new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData(heroCurrencySectionData, keyboardData, new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData(str4, z, null, false, null, false, false, false, false, null, null, null, str3, null, 12284, null));
                        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig heroCurrencySectionConfig2 = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode.CROSS_BORDER, null, new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.CROSS_BORDER_DISPLAY_ONLY), new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyConfig(false, false, false, false, false, false, true, com.paypal.pds.core.Icon.Trophy.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_points, startRestartGroup, 0), 43, null), 2, null);
                        com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig wholeNumbersOnly2 = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig.INSTANCE.wholeNumbersOnly();
                        copy = r16.copy((r20 & 1) != 0 ? r16.primaryButtonStyle : null, (r20 & 2) != 0 ? r16.showSecondaryButton : false, (r20 & 4) != 0 ? r16.secondaryButtonStyle : null, (r20 & 8) != 0 ? r16.showTertiaryButton : false, (r20 & 16) != 0 ? r16.tertiaryButtonStyle : null, (r20 & 32) != 0 ? r16.buttonSize : null, (r20 & 64) != 0 ? r16.layoutDirection : null, (r20 & 128) != 0 ? r16.showDisclaimer : true, (r20 & 256) != 0 ? com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary().showFooterNote : false);
                        com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig2 = new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig(heroCurrencySectionConfig2, wholeNumbersOnly2, copy);
                        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1 redeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$12 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1(redeemViewModel);
                        androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-456788957, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.m19476$r8$lambda$mEyf0N1w0UsQ1zC2FFvPjmtTk(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), null, startRestartGroup, 196614, 94);
                        if (readyCapture.getRedeemType() == com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION) {
                        }
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                        androidx.compose.ui.Modifier modifier52 = modifier4;
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents.ComposeDefaultImpls.AmountScreen$default(amountScreenConfig2, amountScreenData2, redeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$12, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null)), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), amountScreenComponents, startRestartGroup, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig.$stable | (com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData.$stable << 3) | ((i3 << 6) & 57344), 0);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
                str2 = str;
                com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData crossBorderHeroCurrencyData2 = new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData(fiat, null, fiat2, "US", false, false, false, str2, 114, null);
                java.lang.String exchangeRateDisplayText2 = readyCapture.getExchangeRateDisplayText();
                java.lang.String stringResource42 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_spend, new java.lang.Object[]{java.lang.Integer.valueOf(readyCapture.getAvailablePoints())}, startRestartGroup, 0);
                java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                sb22.append(exchangeRateDisplayText2);
                sb22.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                sb22.append(stringResource42);
                com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData2 = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData(null, null, crossBorderHeroCurrencyData2, null, sb22.toString());
                com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData2 = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData(readyCapture.getAmount(), false, null, null, null, null, 62, null);
                i4 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.WhenMappings.$EnumSwitchMapping$0[readyCapture.getRedeemType().ordinal()];
                if (i4 != 1) {
                }
                startRestartGroup.startReplaceGroup(1011399788);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_cta_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
                java.lang.String str42 = stringResource;
                int availablePoints22 = readyCapture.getAvailablePoints();
                java.lang.Integer intOrNull32 = kotlin.text.StringsKt.toIntOrNull(readyCapture.getAmount());
                if (intOrNull32 == null) {
                }
                if (intValue <= 0) {
                }
                startRestartGroup.startReplaceGroup(1011412197);
                java.lang.String stringResource52 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_terms_link_text, startRestartGroup, 0);
                java.lang.StringBuilder sb32 = new java.lang.StringBuilder("{link-terms}");
                sb32.append(stringResource52);
                sb32.append("{/link-terms}");
                java.lang.String obj2 = sb32.toString();
                i5 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.WhenMappings.$EnumSwitchMapping$0[readyCapture.getRedeemType().ordinal()];
                if (i5 != 1) {
                }
                str3 = stringResource2;
                startRestartGroup.endReplaceGroup();
                com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData22 = new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData(heroCurrencySectionData2, keyboardData2, new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData(str42, z, null, false, null, false, false, false, false, null, null, null, str3, null, 12284, null));
                com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig heroCurrencySectionConfig22 = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode.CROSS_BORDER, null, new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.CROSS_BORDER_DISPLAY_ONLY), new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyConfig(false, false, false, false, false, false, true, com.paypal.pds.core.Icon.Trophy.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_amount_points, startRestartGroup, 0), 43, null), 2, null);
                com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig wholeNumbersOnly22 = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig.INSTANCE.wholeNumbersOnly();
                copy = r16.copy((r20 & 1) != 0 ? r16.primaryButtonStyle : null, (r20 & 2) != 0 ? r16.showSecondaryButton : false, (r20 & 4) != 0 ? r16.secondaryButtonStyle : null, (r20 & 8) != 0 ? r16.showTertiaryButton : false, (r20 & 16) != 0 ? r16.tertiaryButtonStyle : null, (r20 & 32) != 0 ? r16.buttonSize : null, (r20 & 64) != 0 ? r16.layoutDirection : null, (r20 & 128) != 0 ? r16.showDisclaimer : true, (r20 & 256) != 0 ? com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary().showFooterNote : false);
                com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig22 = new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig(heroCurrencySectionConfig22, wholeNumbersOnly22, copy);
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1 redeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$122 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1(redeemViewModel);
                androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy22 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance22 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-456788957, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj22, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.m19476$r8$lambda$mEyf0N1w0UsQ1zC2FFvPjmtTk(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, (androidx.compose.runtime.Composer) obj22, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 196614, 94);
                if (readyCapture.getRedeemType() == com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION) {
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                androidx.compose.ui.Modifier modifier522 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents.ComposeDefaultImpls.AmountScreen$default(amountScreenConfig22, amountScreenData22, redeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$122, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance22, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null)), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), amountScreenComponents, startRestartGroup, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig.$stable | (com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData.$stable << 3) | ((i3 << 6) & 57344), 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier522;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.$r8$lambda$VeYUQs7x6cloKZqCrxpxohRMxg8(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture.this, redeemViewModel, amountScreenComponents, modifier3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VeYUQs7x6cloKZqCrxpxohRMxg8(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture readyCapture, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RedeemCaptureAmountScreen(readyCapture, redeemViewModel, amountScreenComponents, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mE-yf0N1w0Us-Q1zC2FFvPjmtTk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19476$r8$lambda$mEyf0N1w0UsQ1zC2FFvPjmtTk(final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-456788957, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreen.<anonymous>.<anonymous> (RedeemCaptureAmountScreen.kt:181)");
            }
            boolean changedInstance = composer.changedInstance(redeemViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt.$r8$lambda$oWcCFoAIieijuJromfqbrLsiRMY(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$oWcCFoAIieijuJromfqbrLsiRMY(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        redeemViewModel.onDismiss();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
