package androidx.compose.material;

/* compiled from: MaterialTextSelectionColors.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", com.helpshift.proactive.InAppViewConstants.TEXT_COLOR, "backgroundColor", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", "foreground", com.helpshift.proactive.InAppViewConstants.BACKGROUND, "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    public static final androidx.compose.foundation.text.selection.TextSelectionColors rememberTextSelectionColors(androidx.compose.material.Colors colors, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberTextSelectionColors)45@1902L6,47@1930L384:MaterialTextSelectionColors.kt#jmzs0o");
        long m1315getPrimary0d7_KjU = colors.m1315getPrimary0d7_KjU();
        long m1308getBackground0d7_KjU = colors.m1308getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "*43@1845L7");
        long m1332contentColorFor4WTKRHQ = androidx.compose.material.ColorsKt.m1332contentColorFor4WTKRHQ(colors, m1308getBackground0d7_KjU);
        if (m1332contentColorFor4WTKRHQ == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localContentColor);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            m1332contentColorFor4WTKRHQ = ((androidx.compose.ui.graphics.Color) consume).m2123unboximpl();
        }
        composer.endReplaceableGroup();
        long m2112copywmQWz5c$default = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m1332contentColorFor4WTKRHQ, androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        androidx.compose.ui.graphics.Color m2103boximpl = androidx.compose.ui.graphics.Color.m2103boximpl(m1315getPrimary0d7_KjU);
        androidx.compose.ui.graphics.Color m2103boximpl2 = androidx.compose.ui.graphics.Color.m2103boximpl(m1308getBackground0d7_KjU);
        androidx.compose.ui.graphics.Color m2103boximpl3 = androidx.compose.ui.graphics.Color.m2103boximpl(m2112copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(m2103boximpl) | composer.changed(m2103boximpl2) | composer.changed(m2103boximpl3);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.text.selection.TextSelectionColors(colors.m1315getPrimary0d7_KjU(), m1421calculateSelectionBackgroundColorysEtTa8(m1315getPrimary0d7_KjU, m2112copywmQWz5c$default, m1308getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.text.selection.TextSelectionColors textSelectionColors = (androidx.compose.foundation.text.selection.TextSelectionColors) rememberedValue;
        composer.endReplaceableGroup();
        return textSelectionColors;
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1421calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float m1418binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float m1420calculateContrastRationb2GgbA = m1420calculateContrastRationb2GgbA(j, DefaultSelectionBackgroundAlpha, j2, j3);
        float m1420calculateContrastRationb2GgbA2 = m1420calculateContrastRationb2GgbA(j, 0.2f, j2, j3);
        if (m1420calculateContrastRationb2GgbA >= DesiredContrastRatio) {
            m1418binarySearchForAccessibleSelectionColorAlphaysEtTa8 = DefaultSelectionBackgroundAlpha;
        } else {
            m1418binarySearchForAccessibleSelectionColorAlphaysEtTa8 = m1420calculateContrastRationb2GgbA2 < DesiredContrastRatio ? 0.2f : m1418binarySearchForAccessibleSelectionColorAlphaysEtTa8(j, j2, j3);
        }
        return androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(j, m1418binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1418binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = DefaultSelectionBackgroundAlpha;
        float f3 = DefaultSelectionBackgroundAlpha;
        for (int i = 0; i < 7; i++) {
            float m1420calculateContrastRationb2GgbA = (m1420calculateContrastRationb2GgbA(j, f2, j2, j3) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m1420calculateContrastRationb2GgbA && m1420calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m1420calculateContrastRationb2GgbA < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1420calculateContrastRationb2GgbA(long j, float f, long j2, long j3) {
        long m2158compositeOverOWjLjI = androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m1419calculateContrastRatioOWjLjI(androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(j2, m2158compositeOverOWjLjI), m2158compositeOverOWjLjI);
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1419calculateContrastRatioOWjLjI(long j, long j2) {
        float m2165luminance8_81llA = androidx.compose.ui.graphics.ColorKt.m2165luminance8_81llA(j) + 0.05f;
        float m2165luminance8_81llA2 = androidx.compose.ui.graphics.ColorKt.m2165luminance8_81llA(j2) + 0.05f;
        return java.lang.Math.max(m2165luminance8_81llA, m2165luminance8_81llA2) / java.lang.Math.min(m2165luminance8_81llA, m2165luminance8_81llA2);
    }
}
