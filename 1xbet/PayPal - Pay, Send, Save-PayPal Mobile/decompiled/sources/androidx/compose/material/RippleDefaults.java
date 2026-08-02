package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/material/RippleDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "", "lightTheme", "rippleColor-5vOe2sY", "(JZ)J", "rippleColor", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha-DxMtmZc", "(JZ)Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RippleDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material.RippleDefaults INSTANCE = new androidx.compose.material.RippleDefaults();

    private RippleDefaults() {
    }

    /* renamed from: rippleColor-5vOe2sY, reason: not valid java name */
    public final long m2711rippleColor5vOe2sY(long contentColor, boolean lightTheme) {
        return (lightTheme || ((double) androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(contentColor)) >= 0.5d) ? contentColor : androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU();
    }

    /* renamed from: rippleAlpha-DxMtmZc, reason: not valid java name */
    public final androidx.compose.material.ripple.RippleAlpha m2710rippleAlphaDxMtmZc(long contentColor, boolean lightTheme) {
        androidx.compose.material.ripple.RippleAlpha rippleAlpha;
        androidx.compose.material.ripple.RippleAlpha rippleAlpha2;
        androidx.compose.material.ripple.RippleAlpha rippleAlpha3;
        if (!lightTheme) {
            rippleAlpha = androidx.compose.material.RippleKt.Camera2StreamConfigurationMap;
            return rippleAlpha;
        }
        if (androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(contentColor) > 0.5d) {
            rippleAlpha3 = androidx.compose.material.RippleKt.getHighSpeedVideoFpsRanges;
            return rippleAlpha3;
        }
        rippleAlpha2 = androidx.compose.material.RippleKt.getHighSpeedVideoFpsRangesFor;
        return rippleAlpha2;
    }
}
