package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/paypal/pds/core/IndicationCreator;", "LocalIndicationCreator", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalIndicationCreator", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PDSIndicationKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.pds.core.IndicationCreator> LocalIndicationCreator = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.core.PDSIndicationKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            com.paypal.pds.core.IndicationCreator indicationCreator;
            indicationCreator = com.paypal.pds.core.IndicationCreator.Ripple.INSTANCE;
            return indicationCreator;
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.pds.core.IndicationCreator> getLocalIndicationCreator() {
        return LocalIndicationCreator;
    }
}
