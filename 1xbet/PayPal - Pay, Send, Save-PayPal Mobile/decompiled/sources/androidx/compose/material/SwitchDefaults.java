package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material.SwitchDefaults INSTANCE = new androidx.compose.material.SwitchDefaults();

    private SwitchDefaults() {
    }

    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final androidx.compose.material.SwitchColors m2778colorsSQMK_m0(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, androidx.compose.runtime.Composer composer, int i, int i2, int i3) {
        long j9;
        long j10;
        long j11;
        int i4;
        long j12;
        long j13;
        long j14;
        long m2565getSecondaryVariant0d7_KjU = (i3 & 1) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2565getSecondaryVariant0d7_KjU() : j;
        long j15 = (i3 & 2) != 0 ? m2565getSecondaryVariant0d7_KjU : j2;
        float f3 = (i3 & 4) != 0 ? 0.54f : f;
        long m2566getSurface0d7_KjU = (i3 & 8) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU() : j3;
        long m2561getOnSurface0d7_KjU = (i3 & 16) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2561getOnSurface0d7_KjU() : j4;
        float f4 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            j9 = m2565getSecondaryVariant0d7_KjU;
            j10 = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2565getSecondaryVariant0d7_KjU, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU());
        } else {
            j9 = m2565getSecondaryVariant0d7_KjU;
            j10 = j5;
        }
        if ((i3 & 128) != 0) {
            i4 = 6;
            j11 = j10;
            j12 = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j15, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU());
        } else {
            j11 = j10;
            i4 = 6;
            j12 = j6;
        }
        if ((i3 & 256) != 0) {
            long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2566getSurface0d7_KjU, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, i4), 0.0f, 0.0f, 0.0f, 14, null);
            i4 = 6;
            j13 = m2566getSurface0d7_KjU;
            j14 = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(m5995copywmQWz5c$default, androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU());
        } else {
            j13 = m2566getSurface0d7_KjU;
            j14 = j7;
        }
        long m6041compositeOverOWjLjI = (i3 & 512) != 0 ? androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2561getOnSurface0d7_KjU, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, i4), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m2566getSurface0d7_KjU()) : j8;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1032127534, i, i2, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:341)");
        }
        androidx.compose.material.DefaultSwitchColors defaultSwitchColors = new androidx.compose.material.DefaultSwitchColors(j9, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j15, f3, 0.0f, 0.0f, 0.0f, 14, null), j13, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2561getOnSurface0d7_KjU, f4, 0.0f, 0.0f, 0.0f, 14, null), j11, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j12, f3, 0.0f, 0.0f, 0.0f, 14, null), j14, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m6041compositeOverOWjLjI, f4, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultSwitchColors;
    }
}
