package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006JK\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0005*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u00020\u0015¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/CheckboxDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/CheckboxColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "colors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CheckboxColors;", "defaultCheckboxColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultCheckboxColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CheckboxColors;", "StrokeWidth", "Landroidx/compose/ui/unit/Dp;", "getStrokeWidth-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.CheckboxDefaults INSTANCE = new androidx.compose.material3.CheckboxDefaults();
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);

    private CheckboxDefaults() {
    }

    public final androidx.compose.material3.CheckboxColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-9530498, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:315)");
        }
        androidx.compose.material3.CheckboxColors defaultCheckboxColors$material3 = getDefaultCheckboxColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors$material3;
    }

    /* renamed from: colors-5tl4gsc, reason: not valid java name */
    public final androidx.compose.material3.CheckboxColors m2992colors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, androidx.compose.runtime.Composer composer, int i, int i2) {
        long m6032getUnspecified0d7_KjU = (i2 & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j;
        long m6032getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j2;
        long m6032getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j3;
        long m6032getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4;
        long m6032getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j5;
        long m6032getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j6;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-89536160, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:341)");
        }
        androidx.compose.material3.CheckboxColors m2979copy2qZNXz8 = getDefaultCheckboxColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2979copy2qZNXz8(m6032getUnspecified0d7_KjU3, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), m6032getUnspecified0d7_KjU, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), m6032getUnspecified0d7_KjU4, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), m6032getUnspecified0d7_KjU6, m6032getUnspecified0d7_KjU, m6032getUnspecified0d7_KjU2, m6032getUnspecified0d7_KjU4, m6032getUnspecified0d7_KjU5, m6032getUnspecified0d7_KjU6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m2979copy2qZNXz8;
    }

    public final androidx.compose.material3.CheckboxColors getDefaultCheckboxColors$material3(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.CheckboxColors defaultCheckboxColorsCached = colorScheme.getDefaultCheckboxColorsCached();
        if (defaultCheckboxColorsCached != null) {
            return defaultCheckboxColorsCached;
        }
        androidx.compose.material3.CheckboxColors checkboxColors = new androidx.compose.material3.CheckboxColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getSelectedIconColor()), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getSelectedContainerColor()), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getSelectedContainerColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getUnselectedOutlineColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCheckboxColorsCached$material3(checkboxColors);
        return checkboxColors;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m2993getStrokeWidthD9Ej5fM() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
