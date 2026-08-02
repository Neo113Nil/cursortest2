package com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/ssnitincomponent/TaxInputWidgetState;", "rememberTaxInputWidgetState", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/mosaic/ui/components/ssnitincomponent/TaxInputWidgetState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxInputWidgetStateKt {
    public static final com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState rememberTaxInputWidgetState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(410124581, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.rememberTaxInputWidgetState (TaxInputWidgetState.kt:39)");
        }
        com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(composer, 0);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState(rememberDropdownState);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState taxInputWidgetState = (com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return taxInputWidgetState;
    }
}
