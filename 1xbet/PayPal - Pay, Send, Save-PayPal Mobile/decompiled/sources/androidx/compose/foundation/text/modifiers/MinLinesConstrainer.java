package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\""}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextStyle;", "inputTextStyle", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/unit/Constraints;", "inConstraints", "", "minLines", "coerceMinLines-Oh53vG4$foundation", "(JI)J", "coerceMinLines", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/text/TextStyle;", "getInputTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getHighResolutionOutputSizeshNQ4ISI", "", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MinLinesConstrainer {
    private static androidx.compose.foundation.text.modifiers.MinLinesConstrainer getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.unit.Density density;
    private final androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
    private final androidx.compose.ui.text.TextStyle getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.ui.text.TextStyle inputTextStyle;
    private final androidx.compose.ui.unit.LayoutDirection layoutDirection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.modifiers.MinLinesConstrainer.Companion INSTANCE = new androidx.compose.foundation.text.modifiers.MinLinesConstrainer.Companion(null);
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRangesFor = Float.NaN;
    private float getHighSpeedVideoSizes = Float.NaN;

    public MinLinesConstrainer(androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection);
    }

    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final androidx.compose.ui.text.TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "minMaxUtil", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextStyle;", "paramStyle", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "from", "(Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.text.modifiers.MinLinesConstrainer from(androidx.compose.foundation.text.modifiers.MinLinesConstrainer minMaxUtil, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextStyle paramStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver) {
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.text.TextStyleKt.resolveDefaults(paramStyle, layoutDirection), minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer = androidx.compose.foundation.text.modifiers.MinLinesConstrainer.getHighSpeedVideoFpsRanges;
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.text.TextStyleKt.resolveDefaults(paramStyle, layoutDirection), minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && fontFamilyResolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer2 = new androidx.compose.foundation.text.modifiers.MinLinesConstrainer(layoutDirection, androidx.compose.ui.text.TextStyleKt.resolveDefaults(paramStyle, layoutDirection), androidx.compose.ui.unit.DensityKt.Density(density.getDensity(), density.getFontScale()), fontFamilyResolver);
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer.Companion companion = androidx.compose.foundation.text.modifiers.MinLinesConstrainer.INSTANCE;
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer.getHighSpeedVideoFpsRanges = minLinesConstrainer2;
            return minLinesConstrainer2;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation, reason: not valid java name */
    public final long m2345coerceMinLinesOh53vG4$foundation(long inConstraints, int minLines) {
        java.lang.String str;
        androidx.compose.ui.text.Paragraph m7897ParagraphUl8oQg4;
        java.lang.String str2;
        androidx.compose.ui.text.Paragraph m7897ParagraphUl8oQg42;
        int m8555getMinHeightimpl;
        float f = this.getHighSpeedVideoSizes;
        float f2 = this.getHighSpeedVideoFpsRangesFor;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            str = androidx.compose.foundation.text.modifiers.MinLinesConstrainerKt.getHighSpeedVideoFpsRanges;
            m7897ParagraphUl8oQg4 = androidx.compose.ui.text.ParagraphKt.m7897ParagraphUl8oQg4(str, this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (r22 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : 1, (r22 & 256) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8());
            f = m7897ParagraphUl8oQg4.getHeight();
            str2 = androidx.compose.foundation.text.modifiers.MinLinesConstrainerKt.Camera2StreamConfigurationMap;
            m7897ParagraphUl8oQg42 = androidx.compose.ui.text.ParagraphKt.m7897ParagraphUl8oQg4(str2, this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (r22 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : 2, (r22 & 256) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8());
            f2 = m7897ParagraphUl8oQg42.getHeight() - f;
            this.getHighSpeedVideoSizes = f;
            this.getHighSpeedVideoFpsRangesFor = f2;
        }
        if (minLines != 1) {
            m8555getMinHeightimpl = kotlin.ranges.RangesKt.coerceAtMost(kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.round(f + (f2 * (minLines - 1))), 0), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(inConstraints));
        } else {
            m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(inConstraints);
        }
        return androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(inConstraints), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(inConstraints), m8555getMinHeightimpl, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(inConstraints));
    }
}
