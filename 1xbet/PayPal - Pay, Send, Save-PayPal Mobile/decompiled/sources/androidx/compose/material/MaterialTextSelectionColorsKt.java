package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "rememberTextSelectionColors", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/ui/graphics/Color;", "selectionColor", "textColor", "backgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "calculateSelectionBackgroundColor", "p0", "p1", "p2", "", "getHighSpeedVideoFpsRanges", "(JJJ)F", "p3", "getHighSpeedVideoFpsRangesFor", "(JFJJ)F", "foreground", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "calculateContrastRatio--OWjLjI", "(JJ)F", "calculateContrastRatio"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaterialTextSelectionColorsKt {
    public static final androidx.compose.foundation.text.selection.TextSelectionColors rememberTextSelectionColors(androidx.compose.material.Colors colors, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m2562getPrimary0d7_KjU = colors.m2562getPrimary0d7_KjU();
        long m2555getBackground0d7_KjU = colors.m2555getBackground0d7_KjU();
        composer.startReplaceGroup(-2060762245);
        long m2579contentColorFor4WTKRHQ = androidx.compose.material.ColorsKt.m2579contentColorFor4WTKRHQ(colors, m2555getBackground0d7_KjU);
        if (m2579contentColorFor4WTKRHQ == 16) {
            m2579contentColorFor4WTKRHQ = ((androidx.compose.ui.graphics.Color) composer.consume(androidx.compose.material.ContentColorKt.getLocalContentColor())).m6006unboximpl();
        }
        composer.endReplaceGroup();
        long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2579contentColorFor4WTKRHQ, androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        boolean changed = composer.changed(m2562getPrimary0d7_KjU);
        boolean changed2 = composer.changed(m2555getBackground0d7_KjU);
        boolean changed3 = composer.changed(m5995copywmQWz5c$default);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.text.selection.TextSelectionColors(colors.m2562getPrimary0d7_KjU(), m2654calculateSelectionBackgroundColorysEtTa8(m2562getPrimary0d7_KjU, m5995copywmQWz5c$default, m2555getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.text.selection.TextSelectionColors textSelectionColors = (androidx.compose.foundation.text.selection.TextSelectionColors) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return textSelectionColors;
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m2654calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float highSpeedVideoFpsRanges;
        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(j, 0.4f, j2, j3);
        float highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(j, 0.2f, j2, j3);
        if (highSpeedVideoFpsRangesFor >= 4.5f) {
            highSpeedVideoFpsRanges = 0.4f;
        } else {
            highSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor2 < 4.5f ? 0.2f : getHighSpeedVideoFpsRanges(j, j2, j3);
        }
        return androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j, highSpeedVideoFpsRanges, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private static final float getHighSpeedVideoFpsRanges(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float highSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRangesFor(j, f2, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= highSpeedVideoFpsRangesFor && highSpeedVideoFpsRangesFor <= 0.01f) {
                return f2;
            }
            if (highSpeedVideoFpsRangesFor < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    private static final float getHighSpeedVideoFpsRangesFor(long j, float f, long j2, long j3) {
        long m6041compositeOverOWjLjI = androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m2653calculateContrastRatioOWjLjI(androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(j2, m6041compositeOverOWjLjI), m6041compositeOverOWjLjI);
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m2653calculateContrastRatioOWjLjI(long j, long j2) {
        float m6047luminance8_81llA = androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(j) + 0.05f;
        float m6047luminance8_81llA2 = androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(j2) + 0.05f;
        return java.lang.Math.max(m6047luminance8_81llA, m6047luminance8_81llA2) / java.lang.Math.min(m6047luminance8_81llA, m6047luminance8_81llA2);
    }
}
