package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J7\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0005*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/RadioButtonDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/RadioButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "colors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RadioButtonColors;", "defaultRadioButtonColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultRadioButtonColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RadioButtonColors;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.RadioButtonDefaults INSTANCE = new androidx.compose.material3.RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    public final androidx.compose.material3.RadioButtonColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1191566130, i, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:135)");
        }
        androidx.compose.material3.RadioButtonColors defaultRadioButtonColors$material3 = getDefaultRadioButtonColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultRadioButtonColors$material3;
    }

    /* renamed from: colors-ro_MJ88, reason: not valid java name */
    public final androidx.compose.material3.RadioButtonColors m3632colorsro_MJ88(long j, long j2, long j3, long j4, androidx.compose.runtime.Composer composer, int i, int i2) {
        long m6032getUnspecified0d7_KjU = (i2 & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j;
        long m6032getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j2;
        long m6032getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j3;
        long m6032getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-351083046, i, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:155)");
        }
        androidx.compose.material3.RadioButtonColors m3627copyjRlVdoo = getDefaultRadioButtonColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3627copyjRlVdoo(m6032getUnspecified0d7_KjU, m6032getUnspecified0d7_KjU2, m6032getUnspecified0d7_KjU3, m6032getUnspecified0d7_KjU4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3627copyjRlVdoo;
    }

    public final androidx.compose.material3.RadioButtonColors getDefaultRadioButtonColors$material3(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.RadioButtonColors defaultRadioButtonColorsCached = colorScheme.getDefaultRadioButtonColorsCached();
        if (defaultRadioButtonColorsCached != null) {
            return defaultRadioButtonColorsCached;
        }
        androidx.compose.material3.RadioButtonColors radioButtonColors = new androidx.compose.material3.RadioButtonColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.RadioButtonTokens.INSTANCE.getSelectedIconColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.RadioButtonTokens.INSTANCE.getUnselectedIconColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.RadioButtonTokens.INSTANCE.getDisabledSelectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.RadioButtonTokens.INSTANCE.getDisabledUnselectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultRadioButtonColorsCached$material3(radioButtonColors);
        return radioButtonColors;
    }
}
