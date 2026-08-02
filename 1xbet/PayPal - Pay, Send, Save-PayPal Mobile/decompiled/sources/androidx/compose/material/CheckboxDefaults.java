package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material.CheckboxDefaults INSTANCE = new androidx.compose.material.CheckboxDefaults();

    private CheckboxDefaults() {
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final androidx.compose.material.CheckboxColors m2536colorszjMxDiM(long j, long j2, long j3, long j4, long j5, androidx.compose.runtime.Composer composer, int i, int i2) {
        long m2564getSecondary0d7_KjU = (i2 & 1) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2564getSecondary0d7_KjU() : j;
        long m5995copywmQWz5c$default = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2566getSurface0d7_KjU = (i2 & 4) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU() : j3;
        long m5995copywmQWz5c$default2 = (i2 & 8) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m5995copywmQWz5c$default3 = (i2 & 16) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2564getSecondary0d7_KjU, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(469524104, i, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:225)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(m2564getSecondary0d7_KjU)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(m5995copywmQWz5c$default)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ 384) > 256 && composer.changed(m2566getSurface0d7_KjU)) || (i & 384) == 256;
        long j6 = m5995copywmQWz5c$default;
        boolean z4 = (((i & 7168) ^ 3072) > 2048 && composer.changed(m5995copywmQWz5c$default2)) || (i & 3072) == 2048;
        boolean z5 = (((57344 & i) ^ 24576) > 16384 && composer.changed(m5995copywmQWz5c$default3)) || (i & 24576) == 16384;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z5 | z | z2 | z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            long j7 = m5995copywmQWz5c$default3;
            long j8 = m5995copywmQWz5c$default2;
            androidx.compose.material.DefaultCheckboxColors defaultCheckboxColors = new androidx.compose.material.DefaultCheckboxColors(m2566getSurface0d7_KjU, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2566getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m2564getSecondary0d7_KjU, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2564getSecondary0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j8, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j8, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j7, m2564getSecondary0d7_KjU, j6, j8, j7, null);
            composer.updateRememberedValue(defaultCheckboxColors);
            rememberedValue = defaultCheckboxColors;
        }
        androidx.compose.material.DefaultCheckboxColors defaultCheckboxColors2 = (androidx.compose.material.DefaultCheckboxColors) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors2;
    }
}
