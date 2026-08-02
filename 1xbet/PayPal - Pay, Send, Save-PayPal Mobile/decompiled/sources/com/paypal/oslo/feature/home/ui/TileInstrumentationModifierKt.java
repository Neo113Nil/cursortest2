package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "instrumentation", "instrument", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TileInstrumentationModifierKt {
    public static final androidx.compose.ui.Modifier instrument(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier context;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2124641180, i, -1, "com.paypal.oslo.feature.home.ui.instrument (TileInstrumentationModifier.kt:26)");
        }
        if (tileInstrumentation != null && (context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(modifier, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(tileInstrumentation.getComponentName(), 0, java.lang.Integer.valueOf(tileInstrumentation.getPosition()), null, 10, null)), kotlin.collections.CollectionsKt.listOf(tileInstrumentation.getContext()))) != null) {
            modifier = context;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return modifier;
    }
}
