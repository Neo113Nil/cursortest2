package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0001QBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J)\u0010'\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u00100R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b5\u00100R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010?8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010F\u001a\u0004\u0018\u00010\u00178\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u001bR\u0014\u0010L\u001a\u00020?8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010CR\u0011\u0010N\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bM\u00100R\u0011\u0010P\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bO\u00100"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "maxLines", "minLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "layoutIntrinsics", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/Constraints;", "p0", "p1", "Landroidx/compose/ui/text/MultiParagraph;", "getHighSpeedVideoSizes", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResult", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", com.visa.cbp.getEncExpo.warmup, "getMaxLines", "()I", "getMinLines", "Z", "getSoftWrap", "()Z", "getOverflow-gIe3tQ8", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "paragraphIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getParagraphIntrinsics$foundation", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setParagraphIntrinsics$foundation", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextDelegate {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.TextDelegate.Companion INSTANCE = new androidx.compose.foundation.text.TextDelegate.Companion(null);
    private final androidx.compose.ui.unit.Density density;
    private final androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
    private androidx.compose.ui.unit.LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private androidx.compose.ui.text.MultiParagraphIntrinsics paragraphIntrinsics;
    private final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> placeholders;
    private final boolean softWrap;
    private final androidx.compose.ui.text.TextStyle style;
    private final androidx.compose.ui.text.AnnotatedString text;

    private TextDelegate(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, int i, int i2, boolean z, int i3, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i;
        this.minLines = i2;
        this.softWrap = z;
        this.overflow = i3;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (i <= 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("no maxLines");
        }
        if (i2 <= 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("no minLines");
        }
        if (i2 <= i) {
            return;
        }
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("minLines greater than maxLines");
    }

    public final androidx.compose.ui.text.AnnotatedString getText() {
        return this.text;
    }

    public final androidx.compose.ui.text.TextStyle getStyle() {
        return this.style;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinLines() {
        return this.minLines;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public /* synthetic */ TextDelegate(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, int i, int i2, boolean z, int i3, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i4 & 4) != 0 ? Integer.MAX_VALUE : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : i3, density, resolver, (i4 & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, null);
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name and from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    /* renamed from: getParagraphIntrinsics$foundation, reason: from getter */
    public final androidx.compose.ui.text.MultiParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public final void setParagraphIntrinsics$foundation(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* renamed from: getIntrinsicsLayoutDirection$foundation, reason: from getter */
    public final androidx.compose.ui.unit.LayoutDirection getIntrinsicsLayoutDirection() {
        return this.intrinsicsLayoutDirection;
    }

    public final void setIntrinsicsLayoutDirection$foundation(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    private final androidx.compose.ui.text.MultiParagraphIntrinsics Camera2StreamConfigurationMap() {
        androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int getMinIntrinsicWidth() {
        return androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(Camera2StreamConfigurationMap().getMinIntrinsicWidth());
    }

    public final int getMaxIntrinsicWidth() {
        return androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(Camera2StreamConfigurationMap().getMaxIntrinsicWidth());
    }

    public final void layoutIntrinsics(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new androidx.compose.ui.text.MultiParagraphIntrinsics(this.text, androidx.compose.ui.text.TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    private final androidx.compose.ui.text.MultiParagraph getHighSpeedVideoSizes(long p0, androidx.compose.ui.unit.LayoutDirection p1) {
        layoutIntrinsics(p1);
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(p0);
        int m8554getMaxWidthimpl = ((this.softWrap || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(this.overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8())) && androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(p0)) ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(p0) : Integer.MAX_VALUE;
        int i = (this.softWrap || !androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(this.overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        if (m8556getMinWidthimpl != m8554getMaxWidthimpl) {
            m8554getMaxWidthimpl = kotlin.ranges.RangesKt.coerceIn(getMaxIntrinsicWidth(), m8556getMinWidthimpl, m8554getMaxWidthimpl);
        }
        return new androidx.compose.ui.text.MultiParagraph(Camera2StreamConfigurationMap(), androidx.compose.ui.unit.Constraints.INSTANCE.m8563fitPrioritizingWidthZbe2FdA(0, m8554getMaxWidthimpl, 0, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(p0)), i, this.overflow, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.TextLayoutResult m2098layoutNN6EwU$default(androidx.compose.foundation.text.TextDelegate textDelegate, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m2100layoutNN6EwU(j, layoutDirection, textLayoutResult);
    }

    /* renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final androidx.compose.ui.text.TextLayoutResult m2100layoutNN6EwU(long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextLayoutResult prevResult) {
        if (prevResult != null && androidx.compose.foundation.text.TextLayoutHelperKt.m2133canReuse7_7YC6M(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.m8010copyO0kMr_c(new androidx.compose.ui.text.TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().getPlaceholders(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (kotlin.jvm.internal.DefaultConstructorMarker) null), androidx.compose.ui.unit.ConstraintsKt.m8568constrain4WqzIAM(constraints, androidx.compose.ui.unit.IntSize.m8767constructorimpl((androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(prevResult.getMultiParagraph().getHeight()) & 4294967295L) | (androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(prevResult.getMultiParagraph().getWidth()) << 32))));
        }
        return new androidx.compose.ui.text.TextLayoutResult(new androidx.compose.ui.text.TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (kotlin.jvm.internal.DefaultConstructorMarker) null), getHighSpeedVideoSizes(constraints, layoutDirection), androidx.compose.ui.unit.ConstraintsKt.m8568constrain4WqzIAM(constraints, androidx.compose.ui.unit.IntSize.m8767constructorimpl((androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(r0.getHeight()) & 4294967295L) | (androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(r0.getWidth()) << 32))), null);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/TextLayoutResult;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void paint(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
            androidx.compose.ui.text.TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TextDelegate(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, int i, int i2, boolean z, int i3, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i, i2, z, i3, density, resolver, list);
    }
}
