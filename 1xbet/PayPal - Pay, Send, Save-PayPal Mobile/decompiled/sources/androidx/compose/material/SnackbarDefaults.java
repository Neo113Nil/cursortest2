package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/compose/material/SnackbarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "getBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "backgroundColor", "getPrimaryActionColor", "primaryActionColor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnackbarDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material.SnackbarDefaults INSTANCE = new androidx.compose.material.SnackbarDefaults();

    private SnackbarDefaults() {
    }

    public final long getBackgroundColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1630911716, i, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:201)");
        }
        long m6041compositeOverOWjLjI = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m6041compositeOverOWjLjI;
    }

    public final long getPrimaryActionColor(androidx.compose.runtime.Composer composer, int i) {
        long m2563getPrimaryVariant0d7_KjU;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-810329402, i, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        androidx.compose.material.Colors colors = androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6);
        if (colors.isLight()) {
            m2563getPrimaryVariant0d7_KjU = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(colors.m2566getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colors.m2562getPrimary0d7_KjU());
        } else {
            m2563getPrimaryVariant0d7_KjU = colors.m2563getPrimaryVariant0d7_KjU();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m2563getPrimaryVariant0d7_KjU;
    }
}
