package com.paypal.oslo.feature.moneymovement.ui.amount.screen;

@kotlin.Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001ak\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002\u001a+\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010#H\u0003¢\u0006\u0002\u0010$¨\u0006%²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020'X\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010 X\u008a\u0084\u0002²\u0006\u0016\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010#X\u008a\u0084\u0002"}, d2 = {"MMPAmountScreen", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenCallbacks;", "actionButtonGroup", "Lcom/paypal/oslo/feature/moneymovement/ui/amount/component/actionbuttongroup/ActionButtonGroup;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenData;Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenCallbacks;Lcom/paypal/oslo/feature/moneymovement/ui/amount/component/actionbuttongroup/ActionButtonGroup;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AmountKeyboardSection", "isStandardMode", "", "isCrossBorderPrimaryFocused", "standardFieldState", "Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;", "primaryFieldState", "secondaryFieldState", "keyboardCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "amountInputCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;", "crossBorderCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyCallbacks;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenData;ZZLcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "withCrossBorderFocus", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;", "isPrimaryFocused", "rememberFocusTrackingCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionCallbacks;", "delegate", "onCrossBorderFocusChange", "Lkotlin/Function1;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionCallbacks;", "money-movement_prodRelease", "heroSectionHeight", "", "keyboardHeight", "currentDelegate", "currentFocusChange"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MMPAmountScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MMPAmountScreen(final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks amountScreenCallbacks, final com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup actionButtonGroup, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.String obj3;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount secondaryAmount;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount primaryAmount;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroup, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1575720264);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(amountScreenConfig) : startRestartGroup.changedInstance(amountScreenConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(amountScreenData) : startRestartGroup.changedInstance(amountScreenData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(amountScreenCallbacks) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroup) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1575720264, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreen (MMPAmountScreen.kt:88)");
                }
                boolean z = amountScreenData.getHeroCurrencySectionData().getAmountInputData() != null;
                com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData crossBorderData = amountScreenData.getHeroCurrencySectionData().getCrossBorderData();
                com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData = amountScreenData.getHeroCurrencySectionData().getAmountInputData();
                if (amountInputData == null || (amount = amountInputData.getAmount()) == null || (obj = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getQuantity(amount)) == null) {
                    obj = java.math.BigDecimal.ZERO.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                }
                if (crossBorderData == null || (primaryAmount = crossBorderData.getPrimaryAmount()) == null || (obj2 = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getQuantity(primaryAmount)) == null) {
                    obj2 = java.math.BigDecimal.ZERO.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                }
                if (crossBorderData == null || (secondaryAmount = crossBorderData.getSecondaryAmount()) == null || (obj3 = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.getQuantity(secondaryAmount)) == null) {
                    obj3 = java.math.BigDecimal.ZERO.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                }
                final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState rememberAmountFieldState = com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldStateKt.rememberAmountFieldState(obj, obj, startRestartGroup, 0);
                final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState rememberAmountFieldState2 = com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldStateKt.rememberAmountFieldState(obj2, obj2, startRestartGroup, 0);
                final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState rememberAmountFieldState3 = com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldStateKt.rememberAmountFieldState(obj3, obj3, startRestartGroup, 0);
                boolean isPrimaryFocused = crossBorderData != null ? crossBorderData.isPrimaryFocused() : true;
                boolean changed = startRestartGroup.changed(isPrimaryFocused);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(isPrimaryFocused), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks heroCurrencySectionCallbacks = amountScreenCallbacks.getHeroCurrencySectionCallbacks();
                boolean changed2 = startRestartGroup.changed(mutableState);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.$r8$lambda$NiEIh1mIOnwY_2opcRwhdXJ7nTk(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj4).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1019974943, 0, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.screen.rememberFocusTrackingCallbacks (MMPAmountScreen.kt:347)");
                }
                androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(heroCurrencySectionCallbacks, startRestartGroup, 0);
                androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, 0);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1(rememberUpdatedState, rememberUpdatedState2);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1 mMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1 = (com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1) rememberedValue3;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                final com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1 mMPAmountScreenKt$rememberFocusTrackingCallbacks$1$12 = mMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1;
                com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks = amountScreenCallbacks.getKeyboardCallbacks();
                if (keyboardCallbacks == null) {
                    keyboardCallbacks = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.create$default(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.INSTANCE, null, null, null, null, null, null, null, 127, null);
                }
                final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks2 = keyboardCallbacks;
                final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks = mMPAmountScreenKt$rememberFocusTrackingCallbacks$1$12.getAmountInputCallbacks();
                final com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderCallbacks = mMPAmountScreenKt$rememberFocusTrackingCallbacks$1$12.getCrossBorderCallbacks();
                final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(modifier3), 0.0f, 1, null), com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountScreenTestTags.ROOT);
                androidx.compose.foundation.ScrollState scrollState = rememberScrollState;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2018343333, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.$r8$lambda$cjJKFXx9Kqdq4MFcxtArarWm5lw(com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup.this, amountScreenConfig, amountScreenData, amountScreenCallbacks, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                }, startRestartGroup, 54);
                final boolean z2 = z;
                kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.m15653$r8$lambda$a_Dg1Y5bDNFCplXnU76KHz83UM(androidx.compose.foundation.ScrollState.this, amountScreenConfig, amountScreenData, mMPAmountScreenKt$rememberFocusTrackingCallbacks$1$12, rememberAmountFieldState, rememberAmountFieldState2, rememberAmountFieldState3, z2, keyboardCallbacks2, amountInputCallbacks, crossBorderCallbacks, mutableState, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                };
                composer2 = startRestartGroup;
                com.paypal.pds.components.DockKt.Dock(testTag, scrollState, null, rememberComposableLambda, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1584379652, true, function2, composer2, 54), composer2, 27648, 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.m15654$r8$lambda$nbBEhuhYFQH4bpY8QFVaKkwD1w(com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig.this, amountScreenData, amountScreenCallbacks, actionButtonGroup, modifier2, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, final boolean z, final boolean z2, final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState2, final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState3, final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, final com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderHeroCurrencyCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.text.input.TextFieldValue textFieldValue;
        boolean z3;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(505992910);
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(amountScreenConfig) : startRestartGroup.changedInstance(amountScreenConfig) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? startRestartGroup.changed(amountScreenData) : startRestartGroup.changedInstance(amountScreenData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(amountFieldState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changed(amountFieldState2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(amountFieldState3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(keyboardCallbacks) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changed(amountInputCallbacks) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(crossBorderHeroCurrencyCallbacks) ? 536870912 : 268435456;
        }
        int i7 = i3 & 1024;
        if (i7 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(505992910, i4, i5, "com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountKeyboardSection (MMPAmountScreen.kt:242)");
            }
            final com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData crossBorderData = amountScreenData.getHeroCurrencySectionData().getCrossBorderData();
            if (z) {
                startRestartGroup.startReplaceGroup(-1299827143);
                com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig = amountScreenConfig.getKeyboardConfig();
                androidx.compose.ui.text.input.TextFieldValue textFieldValue2 = amountFieldState.getTextFieldValue();
                java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount> preselectedAmountValues = amountScreenData.getKeyboardData().getPreselectedAmountValues();
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount selectedChipAmount = amountScreenData.getKeyboardData().getSelectedChipAmount();
                boolean z4 = (i4 & 57344) == 16384;
                boolean z5 = (i4 & 112) == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(amountScreenData));
                z3 = (234881024 & i4) == 67108864;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z4 | z5 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.$r8$lambda$20cv3p71YomP_arXoSICu5VIuZQ(com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState.this, amountScreenData, amountInputCallbacks, (androidx.compose.ui.text.input.TextFieldValue) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.MMPAmountKeyboard(keyboardConfig, textFieldValue2, keyboardCallbacks, companion, preselectedAmountValues, selectedChipAmount, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i4 >> 15) & 896) | ((i5 << 9) & 7168), 0);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-1299039929);
                if (z2) {
                    textFieldValue = amountFieldState2.getTextFieldValue();
                } else {
                    textFieldValue = amountFieldState3.getTextFieldValue();
                }
                com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig2 = amountScreenConfig.getKeyboardConfig();
                java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount> preselectedAmountValues2 = amountScreenData.getKeyboardData().getPreselectedAmountValues();
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount selectedChipAmount2 = amountScreenData.getKeyboardData().getSelectedChipAmount();
                boolean z6 = (i4 & 7168) == 2048;
                boolean z7 = (458752 & i4) == 131072;
                boolean changed = startRestartGroup.changed(crossBorderData);
                boolean changedInstance = startRestartGroup.changedInstance(crossBorderHeroCurrencyCallbacks);
                int i8 = i4;
                z3 = (i4 & 3670016) == 1048576;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (((z6 | z7 | changed | changedInstance) || z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i6 = i8;
                    composer2 = startRestartGroup;
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.$r8$lambda$ZVy8aEhDV_eN45gVzVGCfOJkDYY(z2, amountFieldState2, crossBorderData, amountFieldState3, crossBorderHeroCurrencyCallbacks, (androidx.compose.ui.text.input.TextFieldValue) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                } else {
                    i6 = i8;
                    composer2 = startRestartGroup;
                }
                com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.MMPAmountKeyboard(keyboardConfig2, textFieldValue, keyboardCallbacks, companion, preselectedAmountValues2, selectedChipAmount2, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, ((i6 >> 15) & 896) | ((i5 << 9) & 7168), 0);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.ui.Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.m15652$r8$lambda$Nbm3wOORuFmV89JsOsYPtX__Ds(com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig.this, amountScreenData, z, z2, amountFieldState, amountFieldState2, amountFieldState3, keyboardCallbacks, amountInputCallbacks, crossBorderHeroCurrencyCallbacks, modifier3, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1a0W8cqmokErvn1SJs8LGc15b-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15650$r8$lambda$1a0W8cqmokErvn1SJs8LGc15b0(androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.ui.unit.IntSize intSize) {
        mutableIntState.setIntValue((int) (intSize.m8776unboximpl() & 4294967295L));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$20cv3p71YomP_arXoSICu5VIuZQ(com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        amountFieldState.update(textFieldValue);
        com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData = amountScreenData.getHeroCurrencySectionData().getAmountInputData();
        if (amountInputData != null) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount withUpdatedQuantity = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.withUpdatedQuantity(amountInputData.getAmount(), textFieldValue.getText());
            if (amountInputCallbacks != null) {
                amountInputCallbacks.onAmountChange(withUpdatedQuantity);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$CLE9zi4-BBmuhWB9pKC4D2r9buM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15651$r8$lambda$CLE9zi4BBmuhWB9pKC4D2r9buM(androidx.compose.foundation.ScrollState scrollState, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks heroCurrencySectionCallbacks, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState2, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState3, boolean z, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderHeroCurrencyCallbacks, androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData copy;
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData copy$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxWithConstraintsScope, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-916528274, i2, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreen.<anonymous>.<anonymous> (MMPAmountScreen.kt:157)");
            }
            float mo1623getMaxHeightD9Ej5fM = boxWithConstraintsScope.mo1623getMaxHeightD9Ej5fM();
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                composer.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                composer.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableIntState mutableIntState2 = (androidx.compose.runtime.MutableIntState) rememberedValue2;
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            float m8615unboximpl = ((androidx.compose.ui.unit.Dp) kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(mo1623getMaxHeightD9Ej5fM - density.mo1415toDpu2uoSUM((mutableIntState.getIntValue() + mutableIntState2.getIntValue()) + density.mo1412roundToPx0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing64())))), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSize80()))).m8615unboximpl();
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig heroCurrencySectionConfig = amountScreenConfig.getHeroCurrencySectionConfig();
            com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData = amountScreenData.getHeroCurrencySectionData();
            androidx.compose.runtime.MutableState mutableState2 = mutableState;
            boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
            com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData crossBorderData = heroCurrencySectionData.getCrossBorderData();
            if (crossBorderData == null) {
                copy$default = heroCurrencySectionData;
            } else {
                copy = crossBorderData.copy((r18 & 1) != 0 ? crossBorderData.primaryAmount : null, (r18 & 2) != 0 ? crossBorderData.primaryCountryCode : null, (r18 & 4) != 0 ? crossBorderData.secondaryAmount : null, (r18 & 8) != 0 ? crossBorderData.secondaryCountryCode : null, (r18 & 16) != 0 ? crossBorderData.isSecondaryLoading : false, (r18 & 32) != 0 ? crossBorderData.isPrimaryFocused : booleanValue, (r18 & 64) != 0 ? crossBorderData.isSecondaryFocused : !booleanValue, (r18 & 128) != 0 ? crossBorderData.errorMessage : null);
                copy$default = com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData.copy$default(heroCurrencySectionData, null, null, copy, null, null, 27, null);
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.m15650$r8$lambda$1a0W8cqmokErvn1SJs8LGc15b0(androidx.compose.runtime.MutableIntState.this, (androidx.compose.ui.unit.IntSize) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.moneymovement.ui.amount.component.herocurrencysection.HeroCurrencySectionKt.HeroCurrencySection(heroCurrencySectionConfig, copy$default, heroCurrencySectionCallbacks, androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m1708paddingVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3), amountFieldState, amountFieldState2, amountFieldState3, composer, 0, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, m8615unboximpl), composer, 0);
            boolean booleanValue2 = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.$r8$lambda$ST6vQ4wGZ0BXaIK18izUwF1ckgw(androidx.compose.runtime.MutableIntState.this, (androidx.compose.ui.unit.IntSize) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            Camera2StreamConfigurationMap(amountScreenConfig, amountScreenData, z, booleanValue2, amountFieldState, amountFieldState2, amountFieldState3, keyboardCallbacks, amountInputCallbacks, crossBorderHeroCurrencyCallbacks, androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(companion, (kotlin.jvm.functions.Function1) rememberedValue4), composer, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig.$stable | (com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData.$stable << 3), 6, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Nbm3wOORuFmV89JsOsYPtX_-_Ds, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15652$r8$lambda$Nbm3wOORuFmV89JsOsYPtX__Ds(com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, boolean z, boolean z2, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState2, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState3, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderHeroCurrencyCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        Camera2StreamConfigurationMap(amountScreenConfig, amountScreenData, z, z2, amountFieldState, amountFieldState2, amountFieldState3, keyboardCallbacks, amountInputCallbacks, crossBorderHeroCurrencyCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NiEIh1mIOnwY_2opcRwhdXJ7nTk(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ST6vQ4wGZ0BXaIK18izUwF1ckgw(androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.ui.unit.IntSize intSize) {
        mutableIntState.setIntValue((int) (intSize.m8776unboximpl() & 4294967295L));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZVy8aEhDV_eN45gVzVGCfOJkDYY(boolean z, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData crossBorderHeroCurrencyData, com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState2, com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderHeroCurrencyCallbacks, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        if (z) {
            amountFieldState.update(textFieldValue);
            if (crossBorderHeroCurrencyData != null) {
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount withUpdatedQuantity = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.withUpdatedQuantity(crossBorderHeroCurrencyData.getPrimaryAmount(), textFieldValue.getText());
                if (crossBorderHeroCurrencyCallbacks != null) {
                    crossBorderHeroCurrencyCallbacks.onPrimaryAmountChange(withUpdatedQuantity);
                }
            }
        } else {
            amountFieldState2.update(textFieldValue);
            if (crossBorderHeroCurrencyData != null) {
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount withUpdatedQuantity2 = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.withUpdatedQuantity(crossBorderHeroCurrencyData.getSecondaryAmount(), textFieldValue.getText());
                if (crossBorderHeroCurrencyCallbacks != null) {
                    crossBorderHeroCurrencyCallbacks.onSecondaryAmountChange(withUpdatedQuantity2);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$a_Dg1Y5bDNFC-plXnU76KHz83UM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15653$r8$lambda$a_Dg1Y5bDNFCplXnU76KHz83UM(final androidx.compose.foundation.ScrollState scrollState, final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks heroCurrencySectionCallbacks, final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState, final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState2, final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState3, final boolean z, final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, final com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderHeroCurrencyCallbacks, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1584379652, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreen.<anonymous> (MMPAmountScreen.kt:156)");
            }
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-916528274, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.m15651$r8$lambda$CLE9zi4BBmuhWB9pKC4D2r9buM(androidx.compose.foundation.ScrollState.this, amountScreenConfig, amountScreenData, heroCurrencySectionCallbacks, amountFieldState, amountFieldState2, amountFieldState3, z, keyboardCallbacks, amountInputCallbacks, crossBorderHeroCurrencyCallbacks, mutableState, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, composer, 54), composer, 3072, 7);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cjJKFXx9Kqdq4MFcxtArarWm5lw(com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup actionButtonGroup, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks amountScreenCallbacks, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2018343333, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreen.<anonymous> (MMPAmountScreen.kt:146)");
            }
            com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig = amountScreenConfig.getActionButtonGroupConfig();
            com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData = amountScreenData.getActionButtonGroupData();
            com.paypal.oslo.feature.moneymovement.ui.amount.screen.NoOpActionButtonGroupCallbacks actionButtonGroupCallbacks = amountScreenCallbacks.getActionButtonGroupCallbacks();
            if (actionButtonGroupCallbacks == null) {
                actionButtonGroupCallbacks = com.paypal.oslo.feature.moneymovement.ui.amount.screen.NoOpActionButtonGroupCallbacks.INSTANCE;
            }
            actionButtonGroup.Content(actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), null, composer, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nbBEhuhYFQH4bpY8QFVaK-kwD1w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15654$r8$lambda$nbBEhuhYFQH4bpY8QFVaKkwD1w(com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks amountScreenCallbacks, com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup actionButtonGroup, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MMPAmountScreen(amountScreenConfig, amountScreenData, amountScreenCallbacks, actionButtonGroup, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks access$rememberFocusTrackingCallbacks$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks) state.getValue();
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$rememberFocusTrackingCallbacks$lambda$1(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function1) state.getValue();
    }
}
