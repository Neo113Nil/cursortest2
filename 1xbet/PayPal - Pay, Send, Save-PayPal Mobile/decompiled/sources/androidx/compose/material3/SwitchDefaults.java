package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J¯\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\u0005*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u00020\u001f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/SwitchColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "colors-V1nXRL4", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "defaultSwitchColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultSwitchColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SwitchColors;", "IconSize", "Landroidx/compose/ui/unit/Dp;", "getIconSize-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.SwitchDefaults INSTANCE = new androidx.compose.material3.SwitchDefaults();
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);

    private SwitchDefaults() {
    }

    public final androidx.compose.material3.SwitchColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(435552781, i, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:306)");
        }
        androidx.compose.material3.SwitchColors defaultSwitchColors$material3 = getDefaultSwitchColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultSwitchColors$material3;
    }

    /* renamed from: colors-V1nXRL4, reason: not valid java name */
    public final androidx.compose.material3.SwitchColors m3861colorsV1nXRL4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, androidx.compose.runtime.Composer composer, int i, int i2, int i3) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        int i4;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long value = (i3 & 1) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j;
        long value2 = (i3 & 2) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j2;
        long m6031getTransparent0d7_KjU = (i3 & 4) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU() : j3;
        long value3 = (i3 & 8) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j4;
        long value4 = (i3 & 16) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j5;
        long value5 = (i3 & 32) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j6;
        long value6 = (i3 & 64) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j7;
        long value7 = (i3 & 128) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j8;
        if ((i3 & 256) != 0) {
            j18 = value5;
            j17 = value;
            j19 = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), composer, 6), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j17 = value;
            j18 = value5;
            j19 = j9;
        }
        long m6041compositeOverOWjLjI = (i3 & 512) != 0 ? androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), composer, 6), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface()) : j10;
        long m6031getTransparent0d7_KjU2 = (i3 & 1024) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU() : j11;
        if ((i3 & 2048) != 0) {
            j20 = m6041compositeOverOWjLjI;
            j21 = value2;
            j22 = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), composer, 6), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j20 = m6041compositeOverOWjLjI;
            j21 = value2;
            j22 = j12;
        }
        if ((i3 & 4096) != 0) {
            i4 = 6;
            j23 = j22;
            j24 = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), composer, 6), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j23 = j22;
            i4 = 6;
            j24 = j13;
        }
        if ((i3 & 8192) != 0) {
            long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), composer, i4), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            i4 = 6;
            j25 = j24;
            j26 = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(m5995copywmQWz5c$default, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j25 = j24;
            j26 = j14;
        }
        if ((i3 & 16384) != 0) {
            long m5995copywmQWz5c$default2 = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), composer, i4), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            i4 = 6;
            j27 = j26;
            j28 = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(m5995copywmQWz5c$default2, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface());
        } else {
            j27 = j26;
            j28 = j15;
        }
        long m6041compositeOverOWjLjI2 = (i3 & 32768) != 0 ? androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), composer, i4), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface()) : j16;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1937926421, i, i2, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:369)");
        }
        androidx.compose.material3.SwitchColors switchColors = new androidx.compose.material3.SwitchColors(j17, j21, m6031getTransparent0d7_KjU, value3, value4, j18, value6, value7, j19, j20, m6031getTransparent0d7_KjU2, j23, j25, j27, j28, m6041compositeOverOWjLjI2, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return switchColors;
    }

    public final androidx.compose.material3.SwitchColors getDefaultSwitchColors$material3(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.SwitchColors defaultSwitchColorsCached = colorScheme.getDefaultSwitchColorsCached();
        if (defaultSwitchColorsCached != null) {
            return defaultSwitchColorsCached;
        }
        androidx.compose.material3.SwitchColors switchColors = new androidx.compose.material3.SwitchColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getSelectedHandleColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getSelectedTrackColor()), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getSelectedIconColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getUnselectedHandleColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getUnselectedTrackColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getUnselectedIconColor()), androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedHandleColor()), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedTrackColor()), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedIconColor()), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor()), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor()), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor()), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedIconColor()), androidx.compose.material3.tokens.SwitchTokens.INSTANCE.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), null);
        colorScheme.setDefaultSwitchColorsCached$material3(switchColors);
        return switchColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3862getIconSizeD9Ej5fM() {
        return getHighSpeedVideoFpsRanges;
    }
}
