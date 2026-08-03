package androidx.compose.foundation.text.modifiers;

/* compiled from: MinLinesConstrainer.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "inputTextStyle", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getInputTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "lineHeightCache", "", "oneLineHeightCache", "resolvedStyle", "coerceMinLines", "Landroidx/compose/ui/unit/Constraints;", "inConstraints", "minLines", "", "coerceMinLines-Oh53vG4$foundation_release", "(JI)J", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MinLinesConstrainer {
    private static androidx.compose.foundation.text.modifiers.MinLinesConstrainer last;
    private final androidx.compose.ui.unit.Density density;
    private final androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
    private final androidx.compose.ui.text.TextStyle inputTextStyle;
    private final androidx.compose.ui.unit.LayoutDirection layoutDirection;
    private float lineHeightCache;
    private float oneLineHeightCache;
    private final androidx.compose.ui.text.TextStyle resolvedStyle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.modifiers.MinLinesConstrainer.Companion INSTANCE = new androidx.compose.foundation.text.modifiers.MinLinesConstrainer.Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MinLinesConstrainer(androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutDirection, textStyle, density, resolver);
    }

    private MinLinesConstrainer(androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection);
        this.lineHeightCache = Float.NaN;
        this.oneLineHeightCache = Float.NaN;
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

    /* compiled from: MinLinesConstrainer.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion;", "", "()V", "last", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "minMaxUtil", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "paramStyle", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.foundation.text.modifiers.MinLinesConstrainer from(androidx.compose.foundation.text.modifiers.MinLinesConstrainer minMaxUtil, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextStyle paramStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver) {
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && kotlin.jvm.internal.Intrinsics.areEqual(paramStyle, minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer = androidx.compose.foundation.text.modifiers.MinLinesConstrainer.last;
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && kotlin.jvm.internal.Intrinsics.areEqual(paramStyle, minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && fontFamilyResolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer2 = new androidx.compose.foundation.text.modifiers.MinLinesConstrainer(layoutDirection, androidx.compose.ui.text.TextStyleKt.resolveDefaults(paramStyle, layoutDirection), density, fontFamilyResolver, null);
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer.Companion companion = androidx.compose.foundation.text.modifiers.MinLinesConstrainer.INSTANCE;
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer.last = minLinesConstrainer2;
            return minLinesConstrainer2;
        }
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation_release, reason: not valid java name */
    public final long m973coerceMinLinesOh53vG4$foundation_release(long inConstraints, int minLines) {
        java.lang.String str;
        androidx.compose.ui.text.Paragraph m3855ParagraphUdtVg6A;
        java.lang.String str2;
        androidx.compose.ui.text.Paragraph m3855ParagraphUdtVg6A2;
        int m4425getMinHeightimpl;
        float f = this.oneLineHeightCache;
        float f2 = this.lineHeightCache;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            str = androidx.compose.foundation.text.modifiers.MinLinesConstrainerKt.EmptyTextReplacement;
            m3855ParagraphUdtVg6A = androidx.compose.ui.text.ParagraphKt.m3855ParagraphUdtVg6A(str, this.resolvedStyle, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (r22 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : 1, (r22 & 256) != 0 ? false : false);
            f = m3855ParagraphUdtVg6A.getHeight();
            str2 = androidx.compose.foundation.text.modifiers.MinLinesConstrainerKt.TwoLineTextReplacement;
            m3855ParagraphUdtVg6A2 = androidx.compose.ui.text.ParagraphKt.m3855ParagraphUdtVg6A(str2, this.resolvedStyle, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (r22 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : 2, (r22 & 256) != 0 ? false : false);
            f2 = m3855ParagraphUdtVg6A2.getHeight() - f;
            this.oneLineHeightCache = f;
            this.lineHeightCache = f2;
        }
        if (minLines != 1) {
            m4425getMinHeightimpl = kotlin.ranges.RangesKt.coerceAtMost(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.math.MathKt.roundToInt(f + (f2 * (minLines - 1))), 0), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(inConstraints));
        } else {
            m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(inConstraints);
        }
        return androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(inConstraints), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(inConstraints), m4425getMinHeightimpl, androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(inConstraints));
    }
}
