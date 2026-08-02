package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material.RadioButtonDefaults INSTANCE = new androidx.compose.material.RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    /* renamed from: colors-RGew2ao, reason: not valid java name */
    public final androidx.compose.material.RadioButtonColors m2708colorsRGew2ao(long j, long j2, long j3, androidx.compose.runtime.Composer composer, int i, int i2) {
        long m2564getSecondary0d7_KjU = (i2 & 1) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2564getSecondary0d7_KjU() : j;
        long m5995copywmQWz5c$default = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m5995copywmQWz5c$default2 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1370708026, i, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:161)");
        }
        boolean z = ((6 ^ (i & 14)) > 4 && composer.changed(m2564getSecondary0d7_KjU)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(m5995copywmQWz5c$default)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ 384) > 256 && composer.changed(m5995copywmQWz5c$default2)) || (i & 384) == 256;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.DefaultRadioButtonColors(m2564getSecondary0d7_KjU, m5995copywmQWz5c$default, m5995copywmQWz5c$default2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material.DefaultRadioButtonColors defaultRadioButtonColors = (androidx.compose.material.DefaultRadioButtonColors) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultRadioButtonColors;
    }
}
