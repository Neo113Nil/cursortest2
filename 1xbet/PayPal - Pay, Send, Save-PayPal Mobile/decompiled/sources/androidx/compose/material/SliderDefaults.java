package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "InactiveTrackAlpha", "", "DisabledInactiveTrackAlpha", "DisabledActiveTrackAlpha", "TickAlpha", "DisabledTickAlpha", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;
    public static final androidx.compose.material.SliderDefaults INSTANCE = new androidx.compose.material.SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final androidx.compose.material.SliderColors m2724colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, androidx.compose.runtime.Composer composer, int i, int i2, int i3) {
        long j11;
        long m2562getPrimary0d7_KjU = (i3 & 1) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2562getPrimary0d7_KjU() : j;
        long m6041compositeOverOWjLjI = (i3 & 2) != 0 ? androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU()) : j2;
        long m2562getPrimary0d7_KjU2 = (i3 & 4) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2562getPrimary0d7_KjU() : j3;
        long m5995copywmQWz5c$default = (i3 & 8) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2562getPrimary0d7_KjU2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m5995copywmQWz5c$default2 = (i3 & 16) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m5995copywmQWz5c$default3 = (i3 & 32) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m5995copywmQWz5c$default2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m5995copywmQWz5c$default4 = (i3 & 64) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(m2562getPrimary0d7_KjU2, composer, (i >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m5995copywmQWz5c$default5 = (i3 & 128) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2562getPrimary0d7_KjU2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m5995copywmQWz5c$default6 = (i3 & 256) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m5995copywmQWz5c$default4, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m5995copywmQWz5c$default7 = (i3 & 512) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m5995copywmQWz5c$default3, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            j11 = m5995copywmQWz5c$default4;
            androidx.compose.runtime.ComposerKt.traceEventStart(436017687, i, i2, "androidx.compose.material.SliderDefaults.colors (Slider.kt:605)");
        } else {
            j11 = m5995copywmQWz5c$default4;
        }
        androidx.compose.material.DefaultSliderColors defaultSliderColors = new androidx.compose.material.DefaultSliderColors(m2562getPrimary0d7_KjU, m6041compositeOverOWjLjI, m2562getPrimary0d7_KjU2, m5995copywmQWz5c$default, m5995copywmQWz5c$default2, m5995copywmQWz5c$default3, j11, m5995copywmQWz5c$default5, m5995copywmQWz5c$default6, m5995copywmQWz5c$default7, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultSliderColors;
    }
}
