package com.paypal.android.threeds.ui.theme;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\"\u0010\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"DarkColorPalette", "Landroidx/compose/material/Colors;", "LightColorPalette", "ThreedsAndroidTheme", "", "darkTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "three-ds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThemeKt {
    private static final androidx.compose.material.Colors getHighResolutionOutputSizeshNQ4ISI;
    private static final androidx.compose.material.Colors getHighSpeedVideoSizes;

    static {
        long colorPrimaryDark = com.paypal.android.threeds.ui.theme.ColorKt.getColorPrimaryDark();
        long colorPrimaryVariantDark = com.paypal.android.threeds.ui.theme.ColorKt.getColorPrimaryVariantDark();
        long colorOnPrimary = com.paypal.android.threeds.ui.theme.ColorKt.getColorOnPrimary();
        long colorSecondary = com.paypal.android.threeds.ui.theme.ColorKt.getColorSecondary();
        long colorSecondaryVariant = com.paypal.android.threeds.ui.theme.ColorKt.getColorSecondaryVariant();
        long colorOnSecondary = com.paypal.android.threeds.ui.theme.ColorKt.getColorOnSecondary();
        getHighResolutionOutputSizeshNQ4ISI = androidx.compose.material.ColorsKt.m2582darkColors2qZNXz8$default(colorPrimaryDark, colorPrimaryVariantDark, colorSecondary, colorSecondaryVariant, com.paypal.android.threeds.ui.theme.ColorKt.getColorBackgroundDark(), com.paypal.android.threeds.ui.theme.ColorKt.getColorSurface(), 0L, colorOnPrimary, colorOnSecondary, com.paypal.android.threeds.ui.theme.ColorKt.getColorOnBackgroundDark(), com.paypal.android.threeds.ui.theme.ColorKt.getColorOnPrimary(), 0L, 2112, null);
        long colorPrimary = com.paypal.android.threeds.ui.theme.ColorKt.getColorPrimary();
        long colorPrimaryVariant = com.paypal.android.threeds.ui.theme.ColorKt.getColorPrimaryVariant();
        long colorOnPrimary2 = com.paypal.android.threeds.ui.theme.ColorKt.getColorOnPrimary();
        long colorSecondary2 = com.paypal.android.threeds.ui.theme.ColorKt.getColorSecondary();
        long colorSecondaryVariant2 = com.paypal.android.threeds.ui.theme.ColorKt.getColorSecondaryVariant();
        long colorOnSecondary2 = com.paypal.android.threeds.ui.theme.ColorKt.getColorOnSecondary();
        getHighSpeedVideoSizes = androidx.compose.material.ColorsKt.m2584lightColors2qZNXz8$default(colorPrimary, colorPrimaryVariant, colorSecondary2, colorSecondaryVariant2, com.paypal.android.threeds.ui.theme.ColorKt.getColorBackgroundLight(), com.paypal.android.threeds.ui.theme.ColorKt.getColorSurface(), 0L, colorOnPrimary2, colorOnSecondary2, com.paypal.android.threeds.ui.theme.ColorKt.getColorOnBackgroundLight(), com.paypal.android.threeds.ui.theme.ColorKt.getColorOnPrimary(), 0L, 2112, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if ((r12 & 1) != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThreedsAndroidTheme(final boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-282828942);
        if ((i & 48) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if (startRestartGroup.shouldExecute((i3 & 17) != 16, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    z = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-282828942, i3, -1, "com.paypal.android.threeds.ui.theme.ThreedsAndroidTheme (Theme.kt:50)");
                }
                androidx.compose.material.MaterialThemeKt.MaterialTheme(getHighSpeedVideoSizes, com.paypal.android.threeds.ui.theme.TypeKt.getTypography(), com.paypal.android.threeds.ui.theme.ShapeKt.getShapes(), function2, startRestartGroup, ((i3 << 6) & 7168) | 438, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.theme.ThemeKt.$r8$lambda$5KwfG9gTOZWMsjjffGmEEobKJdA(z, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5KwfG9gTOZWMsjjffGmEEobKJdA(boolean z, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ThreedsAndroidTheme(z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
