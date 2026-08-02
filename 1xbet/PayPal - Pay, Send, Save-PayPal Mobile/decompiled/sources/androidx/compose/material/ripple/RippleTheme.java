package androidx.compose.material.ripple;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material/ripple/RippleTheme;", "", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "defaultColor", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RippleTheme {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.ripple.RippleTheme.Companion INSTANCE = androidx.compose.material.ripple.RippleTheme.Companion.getHighSpeedVideoSizes;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    /* renamed from: defaultColor-WaAFU9c */
    long mo2852defaultColorWaAFU9c(androidx.compose.runtime.Composer composer, int i);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    androidx.compose.material.ripple.RippleAlpha rippleAlpha(androidx.compose.runtime.Composer composer, int i);

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/material/ripple/RippleTheme$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "", "lightTheme", "defaultRippleColor-5vOe2sY", "(JZ)J", "defaultRippleColor", "Landroidx/compose/material/ripple/RippleAlpha;", "defaultRippleAlpha-DxMtmZc", "(JZ)Landroidx/compose/material/ripple/RippleAlpha;", "defaultRippleAlpha"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.material.ripple.RippleTheme.Companion getHighSpeedVideoSizes = new androidx.compose.material.ripple.RippleTheme.Companion();

        private Companion() {
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "The default ripple color varies between design system versions: this function technically implements the default used by the material library, but is not used by the material3 library. To remove confusion and link the defaults more strongly to the design system library, these default values have been moved to the material and material3 libraries. For material, use RippleDefaults#rippleColor. For material3, use content color directly.")
        /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m2866defaultRippleColor5vOe2sY(long contentColor, boolean lightTheme) {
            return (lightTheme || ((double) androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(contentColor)) >= 0.5d) ? contentColor : androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "The default ripple alpha varies between design system versions: this function technically implements the default used by the material library, but is not used by the material3 library. To remove confusion and link the defaults more strongly to the design system library, these default values have been moved to the material and material3 libraries. For material, use RippleDefaults#rippleAlpha. For material3, use RippleDefaults#RippleAlpha.")
        /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final androidx.compose.material.ripple.RippleAlpha m2865defaultRippleAlphaDxMtmZc(long contentColor, boolean lightTheme) {
            androidx.compose.material.ripple.RippleAlpha rippleAlpha;
            androidx.compose.material.ripple.RippleAlpha rippleAlpha2;
            androidx.compose.material.ripple.RippleAlpha rippleAlpha3;
            if (!lightTheme) {
                rippleAlpha = androidx.compose.material.ripple.RippleThemeKt.getHighSpeedVideoFpsRangesFor;
                return rippleAlpha;
            }
            if (androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(contentColor) > 0.5d) {
                rippleAlpha3 = androidx.compose.material.ripple.RippleThemeKt.getHighSpeedVideoFpsRanges;
                return rippleAlpha3;
            }
            rippleAlpha2 = androidx.compose.material.ripple.RippleThemeKt.Camera2StreamConfigurationMap;
            return rippleAlpha2;
        }
    }
}
