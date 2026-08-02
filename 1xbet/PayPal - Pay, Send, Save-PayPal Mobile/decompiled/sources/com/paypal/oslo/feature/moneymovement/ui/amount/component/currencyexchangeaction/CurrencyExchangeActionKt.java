package com.paypal.oslo.feature.moneymovement.ui.amount.component.currencyexchangeaction;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"CurrencyExchangeAction", "", "text", "", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencyexchangeaction/CurrencyExchangeActionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencyexchangeaction/CurrencyExchangeActionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyExchangeActionKt {
    public static final void CurrencyExchangeAction(final java.lang.String str, final com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks currencyExchangeActionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyExchangeActionCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(318784055);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(currencyExchangeActionCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(318784055, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.currencyexchangeaction.CurrencyExchangeAction (CurrencyExchangeAction.kt:34)");
            }
            com.paypal.pds.core.Icon.ArrowsUpDown arrowsUpDown = com.paypal.pds.core.Icon.ArrowsUpDown.INSTANCE;
            boolean z = (i3 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.currencyexchangeaction.CurrencyExchangeActionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.currencyexchangeaction.CurrencyExchangeActionKt.$r8$lambda$rC7yvAwaZns_hiuV6Px3idULqvo(com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.InlineButtonKt.InlineButton((kotlin.jvm.functions.Function0) rememberedValue, str, modifier, arrowsUpDown, null, false, startRestartGroup, ((i3 << 3) & 112) | 3072 | (i3 & 896), 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.currencyexchangeaction.CurrencyExchangeActionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.currencyexchangeaction.CurrencyExchangeActionKt.m15640$r8$lambda$3gSZvWk_MP6TvXmwdCWgTwSeFc(str, currencyExchangeActionCallbacks, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$3gSZvWk_MP6TvXmwdCWgTwSeF-c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15640$r8$lambda$3gSZvWk_MP6TvXmwdCWgTwSeFc(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks currencyExchangeActionCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CurrencyExchangeAction(str, currencyExchangeActionCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rC7yvAwaZns_hiuV6Px3idULqvo(com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks currencyExchangeActionCallbacks) {
        currencyExchangeActionCallbacks.onExchangeClick();
        return kotlin.Unit.INSTANCE;
    }
}
