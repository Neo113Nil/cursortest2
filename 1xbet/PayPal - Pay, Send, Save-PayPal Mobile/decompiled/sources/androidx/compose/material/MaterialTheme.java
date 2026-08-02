package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/material/MaterialTheme;", "", "<init>", "()V", "Landroidx/compose/material/Colors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/material/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;", "typography", "Landroidx/compose/material/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;", "shapes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialTheme {
    public static final int $stable = 0;
    public static final androidx.compose.material.MaterialTheme INSTANCE = new androidx.compose.material.MaterialTheme();

    private MaterialTheme() {
    }

    public final androidx.compose.material.Colors getColors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1462282791, i, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
        }
        androidx.compose.material.Colors colors = (androidx.compose.material.Colors) composer.consume(androidx.compose.material.ColorsKt.getLocalColors());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return colors;
    }

    public final androidx.compose.material.Typography getTypography(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1630198856, i, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:105)");
        }
        androidx.compose.material.Typography typography = (androidx.compose.material.Typography) composer.consume(androidx.compose.material.TypographyKt.getLocalTypography());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return typography;
    }

    public final androidx.compose.material.Shapes getShapes(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1586253541, i, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:109)");
        }
        androidx.compose.material.Shapes shapes = (androidx.compose.material.Shapes) composer.consume(androidx.compose.material.ShapesKt.getLocalShapes());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return shapes;
    }
}
