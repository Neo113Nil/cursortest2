package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/pds/components/textinput/VisualTransformation;", "visualTransformation", "Lkotlin/Function1;", "", "", "onValueChange", "Lcom/paypal/pds/components/textinput/MaskedInputTransformation;", "rememberMaskedInputTransformation", "(Lcom/paypal/pds/components/textinput/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/textinput/MaskedInputTransformation;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaskedInputTransformationKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "rememberMaskedInputTransformation is no longer needed. Input filtering is handled automatically when using VisualTransformation.Number or VisualTransformation.PhoneWithDialingCode with TextInput.")
    public static final com.paypal.pds.components.textinput.MaskedInputTransformation rememberMaskedInputTransformation(com.paypal.pds.components.textinput.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualTransformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1266338067, i, -1, "com.paypal.pds.components.textinput.rememberMaskedInputTransformation (MaskedInputTransformation.kt:127)");
        }
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(visualTransformation)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(function1)) && (i & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.pds.components.textinput.MaskedInputTransformation(visualTransformation, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.textinput.MaskedInputTransformation maskedInputTransformation = (com.paypal.pds.components.textinput.MaskedInputTransformation) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return maskedInputTransformation;
    }
}
