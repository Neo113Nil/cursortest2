package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "Camera2StreamConfigurationMap", "(JFLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ElevationOverlay;", "LocalElevationOverlay", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalElevationOverlay", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAbsoluteElevation", "getLocalAbsoluteElevation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ElevationOverlayKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> LocalElevationOverlay = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ElevationOverlayKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.material.ElevationOverlay highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ElevationOverlayKt.getHighResolutionOutputSizeshNQ4ISI();
            return highResolutionOutputSizeshNQ4ISI;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> LocalAbsoluteElevation = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ElevationOverlayKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.ui.unit.Dp highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.material.ElevationOverlayKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    }, 1, null);

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> getLocalElevationOverlay() {
        return LocalElevationOverlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material.ElevationOverlay getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.compose.material.DefaultElevationOverlay.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Camera2StreamConfigurationMap(long j, float f, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
        }
        long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j, composer, i & 14), ((((float) java.lang.Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m5995copywmQWz5c$default;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> getLocalAbsoluteElevation() {
        return LocalAbsoluteElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.Dp getHighSpeedVideoSizes() {
        return androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
    }
}
