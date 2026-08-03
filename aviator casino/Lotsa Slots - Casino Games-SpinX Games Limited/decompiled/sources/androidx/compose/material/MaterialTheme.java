package androidx.compose.material;

/* compiled from: MaterialTheme.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/MaterialTheme;", "", "()V", "colors", "Landroidx/compose/material/Colors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;", "shapes", "Landroidx/compose/material/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;", "typography", "Landroidx/compose/material/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialTheme {
    public static final int $stable = 0;
    public static final androidx.compose.material.MaterialTheme INSTANCE = new androidx.compose.material.MaterialTheme();

    private MaterialTheme() {
    }

    public final androidx.compose.material.Colors getColors(androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -1462282791, "C102@4462L7:MaterialTheme.kt#jmzs0o");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Colors> localColors = androidx.compose.material.ColorsKt.getLocalColors();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localColors);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.material.Colors colors = (androidx.compose.material.Colors) consume;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return colors;
    }

    public final androidx.compose.material.Typography getTypography(androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -1630198856, "C112@4763L7:MaterialTheme.kt#jmzs0o");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Typography> localTypography = androidx.compose.material.TypographyKt.getLocalTypography();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localTypography);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.material.Typography typography = (androidx.compose.material.Typography) consume;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return typography;
    }

    public final androidx.compose.material.Shapes getShapes(androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -1586253541, "C120@4971L7:MaterialTheme.kt#jmzs0o");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Shapes> localShapes = androidx.compose.material.ShapesKt.getLocalShapes();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localShapes);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.material.Shapes shapes = (androidx.compose.material.Shapes) consume;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return shapes;
    }
}
