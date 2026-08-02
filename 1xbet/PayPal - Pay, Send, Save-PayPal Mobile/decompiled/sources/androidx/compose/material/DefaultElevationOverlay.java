package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "apply-7g2Lkgo", "(JFLandroidx/compose/runtime/Composer;I)J", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultElevationOverlay implements androidx.compose.material.ElevationOverlay {
    public static final androidx.compose.material.DefaultElevationOverlay INSTANCE = new androidx.compose.material.DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    /* renamed from: apply-7g2Lkgo, reason: not valid java name */
    public final long mo2597apply7g2Lkgo(long j, float f, androidx.compose.runtime.Composer composer, int i) {
        long Camera2StreamConfigurationMap;
        composer.startReplaceGroup(-1687113661);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1687113661, i, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        androidx.compose.material.Colors colors = androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6);
        if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) > 0 && !colors.isLight()) {
            composer.startReplaceGroup(-1095627978);
            Camera2StreamConfigurationMap = androidx.compose.material.ElevationOverlayKt.Camera2StreamConfigurationMap(j, f, composer, i & 126);
            j = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(Camera2StreamConfigurationMap, j);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1095489470);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }
}
