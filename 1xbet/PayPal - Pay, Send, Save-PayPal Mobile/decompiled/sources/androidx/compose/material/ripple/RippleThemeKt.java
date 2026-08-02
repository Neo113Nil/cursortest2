package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\"&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\n"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ripple/RippleTheme;", "LocalRippleTheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRippleTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRippleTheme$annotations", "()V", "Landroidx/compose/material/ripple/RippleAlpha;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/material/ripple/RippleAlpha;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleThemeKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ripple.RippleTheme> LocalRippleTheme = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ripple.RippleThemeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.material.ripple.RippleTheme highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ripple.RippleThemeKt.getHighResolutionOutputSizeshNQ4ISI();
            return highResolutionOutputSizeshNQ4ISI;
        }
    });
    private static final androidx.compose.material.ripple.RippleAlpha getHighSpeedVideoFpsRanges = new androidx.compose.material.ripple.RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
    private static final androidx.compose.material.ripple.RippleAlpha Camera2StreamConfigurationMap = new androidx.compose.material.ripple.RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
    private static final androidx.compose.material.ripple.RippleAlpha getHighSpeedVideoFpsRangesFor = new androidx.compose.material.ripple.RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    public static /* synthetic */ void getLocalRippleTheme$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.ripple.RippleTheme> getLocalRippleTheme() {
        return LocalRippleTheme;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material.ripple.RippleTheme getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.compose.material.ripple.DebugRippleTheme.INSTANCE;
    }
}
