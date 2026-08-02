package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/Icon;", "Landroidx/compose/ui/graphics/painter/Painter;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "(Lcom/paypal/pds/core/Icon;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IconKt {
    public static final androidx.compose.ui.graphics.painter.Painter painter(com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-464582998, i, -1, "com.paypal.pds.core.painter (Icon.kt:758)");
        }
        androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(icon.getDrawableRes(), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return painterResource;
    }
}
