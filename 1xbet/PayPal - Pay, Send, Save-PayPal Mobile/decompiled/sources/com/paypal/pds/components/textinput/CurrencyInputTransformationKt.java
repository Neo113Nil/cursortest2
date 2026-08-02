package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "", "", "onValueChange", "Lcom/paypal/pds/components/textinput/CurrencyInputTransformation;", "rememberCurrencyInputTransformation", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/textinput/CurrencyInputTransformation;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyInputTransformationKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "rememberCurrencyInputTransformation is no longer needed. Input filtering is now handled automatically by TextInput when using VisualTransformation.Currency.")
    public static final com.paypal.pds.components.textinput.CurrencyInputTransformation rememberCurrencyInputTransformation(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(955237978, i, -1, "com.paypal.pds.components.textinput.rememberCurrencyInputTransformation (CurrencyInputTransformation.kt:78)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(function1)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.pds.components.textinput.CurrencyInputTransformation(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.textinput.CurrencyInputTransformation currencyInputTransformation = (com.paypal.pds.components.textinput.CurrencyInputTransformation) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return currencyInputTransformation;
    }
}
