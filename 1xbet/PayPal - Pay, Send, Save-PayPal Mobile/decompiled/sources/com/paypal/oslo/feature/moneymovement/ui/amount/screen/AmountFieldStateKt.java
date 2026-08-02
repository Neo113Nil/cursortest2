package com.paypal.oslo.feature.moneymovement.ui.amount.screen;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "initialText", "externalText", "Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;", "rememberAmountFieldState", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/AmountFieldState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AmountFieldStateKt {
    public static final com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState rememberAmountFieldState(java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1774649768, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.screen.rememberAmountFieldState (AmountFieldState.kt:91)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState(str);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState amountFieldState = (com.paypal.oslo.feature.moneymovement.ui.amount.screen.AmountFieldState) rememberedValue;
        amountFieldState.syncFromExternal(str2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return amountFieldState;
    }
}
