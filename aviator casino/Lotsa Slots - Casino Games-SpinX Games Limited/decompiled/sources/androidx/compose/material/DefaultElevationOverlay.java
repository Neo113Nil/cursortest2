package androidx.compose.material;

/* compiled from: ElevationOverlay.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "()V", "apply", "Landroidx/compose/ui/graphics/Color;", "color", "elevation", "Landroidx/compose/ui/unit/Dp;", "apply-7g2Lkgo", "(JFLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultElevationOverlay implements androidx.compose.material.ElevationOverlay {
    public static final androidx.compose.material.DefaultElevationOverlay INSTANCE = new androidx.compose.material.DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    /* renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo1349apply7g2Lkgo(long j, float f, androidx.compose.runtime.Composer composer, int i) {
        long m1383calculateForegroundColorCLU3JFs;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -1687113661, "C(apply)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)69@2742L6,71@2841L42:ElevationOverlay.kt#jmzs0o");
        androidx.compose.material.Colors colors = androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6);
        if (androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) > 0 && !colors.isLight()) {
            m1383calculateForegroundColorCLU3JFs = androidx.compose.material.ElevationOverlayKt.m1383calculateForegroundColorCLU3JFs(j, f, composer, (i & 112) | (i & 14));
            j = androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(m1383calculateForegroundColorCLU3JFs, j);
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return j;
    }
}
