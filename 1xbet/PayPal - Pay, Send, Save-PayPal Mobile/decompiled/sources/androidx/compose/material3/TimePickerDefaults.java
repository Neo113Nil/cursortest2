package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J\u009b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0018\u001a\u00020\u0005*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/compose/material3/TimePickerDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/TimePickerColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TimePickerColors;", "clockDialColor", "Landroidx/compose/ui/graphics/Color;", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "colors-u3YEpmA", "(JJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TimePickerColors;", "defaultTimePickerColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultTimePickerColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TimePickerColors;", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType-sDNSZnc", "(Landroidx/compose/runtime/Composer;I)I", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimePickerDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.TimePickerDefaults INSTANCE = new androidx.compose.material3.TimePickerDefaults();

    private TimePickerDefaults() {
    }

    public final androidx.compose.material3.TimePickerColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2085808058, i, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:284)");
        }
        androidx.compose.material3.TimePickerColors defaultTimePickerColors$material3 = getDefaultTimePickerColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultTimePickerColors$material3;
    }

    /* renamed from: colors-u3YEpmA, reason: not valid java name */
    public final androidx.compose.material3.TimePickerColors m4009colorsu3YEpmA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, androidx.compose.runtime.Composer composer, int i, int i2, int i3) {
        long j15;
        long j16;
        long m6032getUnspecified0d7_KjU = (i3 & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j;
        long m6032getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j2;
        long m6032getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j3;
        long m6032getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4;
        long m6032getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j5;
        long m6032getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j6;
        long m6032getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j7;
        long m6032getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j8;
        long m6032getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j9;
        long m6032getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j10;
        long m6032getUnspecified0d7_KjU11 = (i3 & 1024) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j11;
        long m6032getUnspecified0d7_KjU12 = (i3 & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j12;
        long m6032getUnspecified0d7_KjU13 = (i3 & 4096) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j13;
        long m6032getUnspecified0d7_KjU14 = (i3 & 8192) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j14;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            j16 = m6032getUnspecified0d7_KjU13;
            j15 = m6032getUnspecified0d7_KjU7;
            androidx.compose.runtime.ComposerKt.traceEventStart(-646352288, i, i2, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:331)");
        } else {
            j15 = m6032getUnspecified0d7_KjU7;
            j16 = m6032getUnspecified0d7_KjU13;
        }
        androidx.compose.material3.TimePickerColors m3990copydVHXu7A = getDefaultTimePickerColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3990copydVHXu7A(m6032getUnspecified0d7_KjU, m6032getUnspecified0d7_KjU4, m6032getUnspecified0d7_KjU5, m6032getUnspecified0d7_KjU6, m6032getUnspecified0d7_KjU2, m6032getUnspecified0d7_KjU3, j15, m6032getUnspecified0d7_KjU8, m6032getUnspecified0d7_KjU9, m6032getUnspecified0d7_KjU10, m6032getUnspecified0d7_KjU11, m6032getUnspecified0d7_KjU12, j16, m6032getUnspecified0d7_KjU14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3990copydVHXu7A;
    }

    public final androidx.compose.material3.TimePickerColors getDefaultTimePickerColors$material3(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.TimePickerColors defaultTimePickerColorsCached = colorScheme.getDefaultTimePickerColorsCached();
        if (defaultTimePickerColorsCached != null) {
            return defaultTimePickerColorsCached;
        }
        androidx.compose.material3.TimePickerColors timePickerColors = new androidx.compose.material3.TimePickerColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getClockDialColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getClockDialSelectorHandleContainerColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getContainerColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getPeriodSelectorOutlineColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getClockDialSelectedLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getClockDialUnselectedLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getPeriodSelectorSelectedContainerColor()), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getPeriodSelectorSelectedLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getPeriodSelectorUnselectedLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getTimeSelectorSelectedContainerColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getTimeSelectorUnselectedContainerColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getTimeSelectorSelectedLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.getTimeSelectorUnselectedLabelTextColor()), null);
        colorScheme.setDefaultTimePickerColorsCached$material3(timePickerColors);
        return timePickerColors;
    }

    /* renamed from: layoutType-sDNSZnc, reason: not valid java name */
    public final int m4010layoutTypesDNSZnc(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(517161502, i, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:381)");
        }
        int defaultTimePickerLayoutType = androidx.compose.material3.TimePickerKt.getDefaultTimePickerLayoutType(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultTimePickerLayoutType;
    }
}
