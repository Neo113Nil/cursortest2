package androidx.compose.ui.text;

/* compiled from: TextMeasurer.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u008a\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jt\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "defaultFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "defaultDensity", "Landroidx/compose/ui/unit/Density;", "defaultLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "cacheSize", "", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "textLayoutCache", "Landroidx/compose/ui/text/TextLayoutCache;", "measure", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextMeasurer {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.TextMeasurer.Companion INSTANCE = new androidx.compose.ui.text.TextMeasurer.Companion(null);
    private final int cacheSize;
    private final androidx.compose.ui.unit.Density defaultDensity;
    private final androidx.compose.ui.text.font.FontFamily.Resolver defaultFontFamilyResolver;
    private final androidx.compose.ui.unit.LayoutDirection defaultLayoutDirection;
    private final androidx.compose.ui.text.TextLayoutCache textLayoutCache;

    public TextMeasurer(androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, int i) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i;
        this.textLayoutCache = i > 0 ? new androidx.compose.ui.text.TextLayoutCache(i) : null;
    }

    public /* synthetic */ TextMeasurer(androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i2 & 8) != 0 ? androidx.compose.ui.text.TextMeasurerKt.DefaultCacheSize : i);
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.TextLayoutResult m3940measurexDpz5zY$default(androidx.compose.ui.text.TextMeasurer textMeasurer, androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, int i, boolean z, int i2, java.util.List list, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, boolean z2, int i3, java.lang.Object obj) {
        return textMeasurer.m3942measurexDpz5zY(annotatedString, (i3 & 2) != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle, (i3 & 4) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j, (i3 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i3 & 256) != 0 ? textMeasurer.defaultDensity : density, (i3 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i3 & 1024) != 0 ? false : z2);
    }

    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final androidx.compose.ui.text.TextLayoutResult m3942measurexDpz5zY(androidx.compose.ui.text.AnnotatedString text, androidx.compose.ui.text.TextStyle style, int overflow, boolean softWrap, int maxLines, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> placeholders, long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        androidx.compose.ui.text.TextLayoutCache textLayoutCache;
        androidx.compose.ui.text.TextLayoutInput textLayoutInput = new androidx.compose.ui.text.TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = (skipCache || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m3935copyO0kMr_c(textLayoutInput, androidx.compose.ui.unit.ConstraintsKt.m4435constrain4WqzIAM(constraints, androidx.compose.ui.unit.IntSizeKt.IntSize(androidx.compose.ui.text.ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), androidx.compose.ui.text.ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        androidx.compose.ui.text.TextLayoutResult layout = INSTANCE.layout(textLayoutInput);
        androidx.compose.ui.text.TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 == null) {
            return layout;
        }
        textLayoutCache2.put(textLayoutInput, layout);
        return layout;
    }

    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final androidx.compose.ui.text.TextLayoutResult m3941measurewNUYSr0(java.lang.String text, androidx.compose.ui.text.TextStyle style, int overflow, boolean softWrap, int maxLines, long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        return m3940measurexDpz5zY$default(this, new androidx.compose.ui.text.AnnotatedString(text, null, null, 6, null), style, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }

    /* compiled from: TextMeasurer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "()V", "layout", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.compose.ui.text.TextLayoutResult layout(androidx.compose.ui.text.TextLayoutInput textLayoutInput) {
            androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics = new androidx.compose.ui.text.MultiParagraphIntrinsics(textLayoutInput.getText(), androidx.compose.ui.text.TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int m4426getMinWidthimpl = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(textLayoutInput.getConstraints());
            int m4424getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(textLayoutInput.getOverflow(), androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8())) && androidx.compose.ui.unit.Constraints.m4420getHasBoundedWidthimpl(textLayoutInput.getConstraints())) ? androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(textLayoutInput.getConstraints()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(textLayoutInput.getOverflow(), androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8())) ? textLayoutInput.getMaxLines() : 1;
            if (m4426getMinWidthimpl != m4424getMaxWidthimpl) {
                m4424getMaxWidthimpl = kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.text.ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), m4426getMinWidthimpl, m4424getMaxWidthimpl);
            }
            return new androidx.compose.ui.text.TextLayoutResult(textLayoutInput, new androidx.compose.ui.text.MultiParagraph(multiParagraphIntrinsics, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, m4424getMaxWidthimpl, 0, androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(textLayoutInput.getConstraints()), 5, null), maxLines, androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(textLayoutInput.getOverflow(), androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8()), null), androidx.compose.ui.unit.ConstraintsKt.m4435constrain4WqzIAM(textLayoutInput.getConstraints(), androidx.compose.ui.unit.IntSizeKt.IntSize((int) java.lang.Math.ceil(r2.getWidth()), (int) java.lang.Math.ceil(r2.getHeight()))), null);
        }
    }
}
