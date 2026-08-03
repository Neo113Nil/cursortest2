package androidx.compose.material;

/* compiled from: ElevationOverlay.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"LocalAbsoluteElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalAbsoluteElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalElevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "getLocalElevationOverlay", "calculateForegroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "elevation", "calculateForegroundColor-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ElevationOverlayKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> LocalElevationOverlay = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.material.ElevationOverlay>() { // from class: androidx.compose.material.ElevationOverlayKt$LocalElevationOverlay$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.material.ElevationOverlay invoke() {
            return androidx.compose.material.DefaultElevationOverlay.INSTANCE;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> LocalAbsoluteElevation = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<androidx.compose.ui.unit.Dp>() { // from class: androidx.compose.material.ElevationOverlayKt$LocalAbsoluteElevation$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.Dp invoke() {
            return androidx.compose.ui.unit.Dp.m4476boximpl(m1384invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m1384invokeD9Ej5fM() {
            return androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
    }, 1, null);

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ElevationOverlay> getLocalElevationOverlay() {
        return LocalElevationOverlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateForegroundColor-CLU3JFs, reason: not valid java name */
    public static final long m1383calculateForegroundColorCLU3JFs(long j, float f, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 1613340891, "C(calculateForegroundColor)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)88@3446L32:ElevationOverlay.kt#jmzs0o");
        long m2112copywmQWz5c$default = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j, composer, i & 14), ((((float) java.lang.Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return m2112copywmQWz5c$default;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Dp> getLocalAbsoluteElevation() {
        return LocalAbsoluteElevation;
    }
}
