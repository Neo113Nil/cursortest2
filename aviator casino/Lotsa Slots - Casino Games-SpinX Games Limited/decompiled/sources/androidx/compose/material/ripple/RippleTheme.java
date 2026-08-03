package androidx.compose.material.ripple;

/* compiled from: RippleTheme.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0018\u0010\u0002\u001a\u00020\u0003H'ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0007H'¢\u0006\u0002\u0010\bø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material/ripple/RippleTheme;", "", "defaultColor", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RippleTheme {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.ripple.RippleTheme.Companion INSTANCE = androidx.compose.material.ripple.RippleTheme.Companion.$$INSTANCE;

    /* renamed from: defaultColor-WaAFU9c */
    long mo1417defaultColorWaAFU9c(androidx.compose.runtime.Composer composer, int i);

    androidx.compose.material.ripple.RippleAlpha rippleAlpha(androidx.compose.runtime.Composer composer, int i);

    /* compiled from: RippleTheme.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/ripple/RippleTheme$Companion;", "", "()V", "defaultRippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "lightTheme", "", "defaultRippleAlpha-DxMtmZc", "(JZ)Landroidx/compose/material/ripple/RippleAlpha;", "defaultRippleColor", "defaultRippleColor-5vOe2sY", "(JZ)J", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.material.ripple.RippleTheme.Companion $$INSTANCE = new androidx.compose.material.ripple.RippleTheme.Companion();

        private Companion() {
        }

        /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m1603defaultRippleColor5vOe2sY(long contentColor, boolean lightTheme) {
            return (lightTheme || ((double) androidx.compose.ui.graphics.ColorKt.m2165luminance8_81llA(contentColor)) >= 0.5d) ? contentColor : androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU();
        }

        /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final androidx.compose.material.ripple.RippleAlpha m1602defaultRippleAlphaDxMtmZc(long contentColor, boolean lightTheme) {
            androidx.compose.material.ripple.RippleAlpha rippleAlpha;
            androidx.compose.material.ripple.RippleAlpha rippleAlpha2;
            androidx.compose.material.ripple.RippleAlpha rippleAlpha3;
            if (!lightTheme) {
                rippleAlpha = androidx.compose.material.ripple.RippleThemeKt.DarkThemeRippleAlpha;
                return rippleAlpha;
            }
            if (androidx.compose.ui.graphics.ColorKt.m2165luminance8_81llA(contentColor) > 0.5d) {
                rippleAlpha3 = androidx.compose.material.ripple.RippleThemeKt.LightThemeHighContrastRippleAlpha;
                return rippleAlpha3;
            }
            rippleAlpha2 = androidx.compose.material.ripple.RippleThemeKt.LightThemeLowContrastRippleAlpha;
            return rippleAlpha2;
        }
    }
}
