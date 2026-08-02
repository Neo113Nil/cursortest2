package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/material3/MaterialTheme;", "", "<init>", "()V", "Landroidx/compose/material3/ColorScheme;", "getColorScheme", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;", "colorScheme", "Landroidx/compose/material3/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;", "typography", "Landroidx/compose/material3/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;", "shapes", "Landroidx/compose/material3/MotionScheme;", "getMotionScheme", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/MotionScheme;", "motionScheme", "Landroidx/compose/runtime/CompositionLocal;", "getLocalMotionScheme$material3", "()Landroidx/compose/runtime/CompositionLocal;", "LocalMotionScheme"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialTheme {
    public static final int $stable = 0;
    public static final androidx.compose.material3.MaterialTheme INSTANCE = new androidx.compose.material3.MaterialTheme();

    private MaterialTheme() {
    }

    public final androidx.compose.material3.ColorScheme getColorScheme(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-561618718, i, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
        }
        androidx.compose.material3.ColorScheme colorScheme = (androidx.compose.material3.ColorScheme) composer.consume(androidx.compose.material3.ColorSchemeKt.getLocalColorScheme());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return colorScheme;
    }

    public final androidx.compose.material3.Typography getTypography(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-942794935, i, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
        }
        androidx.compose.material3.Typography typography = (androidx.compose.material3.Typography) composer.consume(androidx.compose.material3.TypographyKt.getLocalTypography());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return typography;
    }

    public final androidx.compose.material3.Shapes getShapes(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(419509830, i, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:137)");
        }
        androidx.compose.material3.Shapes shapes = (androidx.compose.material3.Shapes) composer.consume(androidx.compose.material3.ShapesKt.getLocalShapes());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return shapes;
    }

    public final androidx.compose.material3.MotionScheme getMotionScheme(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-506613891, i, -1, "androidx.compose.material3.MaterialTheme.<get-motionScheme> (MaterialTheme.kt:141)");
        }
        androidx.compose.material3.MotionScheme motionScheme = (androidx.compose.material3.MotionScheme) composer.consume(getLocalMotionScheme$material3());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return motionScheme;
    }

    public final androidx.compose.runtime.CompositionLocal<androidx.compose.material3.MotionScheme> getLocalMotionScheme$material3() {
        androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal;
        providableCompositionLocal = androidx.compose.material3.MaterialThemeKt.Camera2StreamConfigurationMap;
        return providableCompositionLocal;
    }
}
