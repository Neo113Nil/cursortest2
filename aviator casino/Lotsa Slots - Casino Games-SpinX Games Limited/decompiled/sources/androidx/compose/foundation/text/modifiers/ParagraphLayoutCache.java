package androidx.compose.foundation.text.modifiers;

/* compiled from: ParagraphLayoutCache.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\u0016\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\"\u0010=\u001a\u0002012\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\u000b2\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\b\u0010D\u001a\u00020,H\u0002J\u000e\u0010E\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\u000e\u0010F\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\"\u0010G\u001a\u00020\u000b2\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010CJ\u0010\u0010I\u001a\u0002072\u0006\u0010<\u001a\u00020\u001fH\u0002J\u0010\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010\u0004\u001a\u00020\u0005JH\u0010L\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bM\u0010NR\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u00020!X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"R\"\u0010#\u001a\u00020$X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u0010\b\u001a\u00020\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\u000209X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "minLines", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "cachedIntrinsicHeight", "cachedIntrinsicHeightInputWidth", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "didOverflow", "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastDensity", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "J", "layoutSize", "Landroidx/compose/ui/unit/IntSize;", "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "observeFontChanges", "", "getObserveFontChanges$foundation_release", "()Lkotlin/Unit;", "I", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "prevConstraints", "Landroidx/compose/ui/unit/Constraints;", "intrinsicHeight", "width", "layoutDirection", "layoutText", "constraints", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", "layoutWithConstraints", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "markDirty", "maxIntrinsicWidth", "minIntrinsicWidth", "newLayoutWillBeDifferent", "newLayoutWillBeDifferent-K40F9xA", "setLayoutDirection", "slowCreateTextLayoutResultOrNull", "Landroidx/compose/ui/text/TextLayoutResult;", "update", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private androidx.compose.ui.unit.Density density;
    private boolean didOverflow;
    private androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
    private androidx.compose.ui.unit.LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private androidx.compose.foundation.text.modifiers.MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private androidx.compose.ui.text.Paragraph paragraph;
    private androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private androidx.compose.ui.text.TextStyle style;
    private java.lang.String text;

    public /* synthetic */ ParagraphLayoutCache(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i, z, i2, i3);
    }

    private ParagraphLayoutCache(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.lastDensity = androidx.compose.foundation.text.modifiers.InlineDensity.INSTANCE.m969getUnspecifiedL26CHvs();
        this.layoutSize = androidx.compose.ui.unit.IntSizeKt.IntSize(0, 0);
        this.prevConstraints = androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i4 & 8) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, null);
    }

    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation_release(androidx.compose.ui.unit.Density density) {
        androidx.compose.ui.unit.Density density2 = this.density;
        long m961constructorimpl = density != null ? androidx.compose.foundation.text.modifiers.InlineDensity.m961constructorimpl(density) : androidx.compose.foundation.text.modifiers.InlineDensity.INSTANCE.m969getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = m961constructorimpl;
        } else if (density == null || !androidx.compose.foundation.text.modifiers.InlineDensity.m963equalsimpl0(this.lastDensity, m961constructorimpl)) {
            this.density = density;
            this.lastDensity = m961constructorimpl;
            markDirty();
        }
    }

    public final kotlin.Unit getObserveFontChanges$foundation_release() {
        androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getParagraph$foundation_release, reason: from getter */
    public final androidx.compose.ui.text.Paragraph getParagraph() {
        return this.paragraph;
    }

    public final void setParagraph$foundation_release(androidx.compose.ui.text.Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    /* renamed from: getDidOverflow$foundation_release, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    public final void setDidOverflow$foundation_release(boolean z) {
        this.didOverflow = z;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m985setLayoutSizeozmzZPI$foundation_release(long j) {
        this.layoutSize = j;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m984layoutWithConstraintsK40F9xA(long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        boolean z = true;
        if (this.minLines > 1) {
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer.Companion companion = androidx.compose.foundation.text.modifiers.MinLinesConstrainer.INSTANCE;
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            androidx.compose.ui.text.TextStyle textStyle = this.style;
            androidx.compose.ui.unit.Density density = this.density;
            kotlin.jvm.internal.Intrinsics.checkNotNull(density);
            androidx.compose.foundation.text.modifiers.MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = from;
            constraints = from.m973coerceMinLinesOh53vG4$foundation_release(constraints, this.minLines);
        }
        boolean z2 = false;
        if (!m982newLayoutWillBeDifferentK40F9xA(constraints, layoutDirection)) {
            if (!androidx.compose.ui.unit.Constraints.m4417equalsimpl0(constraints, this.prevConstraints)) {
                androidx.compose.ui.text.Paragraph paragraph = this.paragraph;
                kotlin.jvm.internal.Intrinsics.checkNotNull(paragraph);
                this.layoutSize = androidx.compose.ui.unit.ConstraintsKt.m4435constrain4WqzIAM(constraints, androidx.compose.ui.unit.IntSizeKt.IntSize(androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(java.lang.Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())), androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(paragraph.getHeight())));
                if (androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(this.overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4411getVisiblegIe3tQ8()) || (androidx.compose.ui.unit.IntSize.m4652getWidthimpl(r3) >= paragraph.getWidth() && androidx.compose.ui.unit.IntSize.m4651getHeightimpl(r3) >= paragraph.getHeight())) {
                    z = false;
                }
                this.didOverflow = z;
                this.prevConstraints = constraints;
            }
            return false;
        }
        androidx.compose.ui.text.Paragraph m981layoutTextK40F9xA = m981layoutTextK40F9xA(constraints, layoutDirection);
        this.prevConstraints = constraints;
        this.layoutSize = androidx.compose.ui.unit.ConstraintsKt.m4435constrain4WqzIAM(constraints, androidx.compose.ui.unit.IntSizeKt.IntSize(androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m981layoutTextK40F9xA.getWidth()), androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m981layoutTextK40F9xA.getHeight())));
        if (!androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(this.overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4411getVisiblegIe3tQ8()) && (androidx.compose.ui.unit.IntSize.m4652getWidthimpl(r9) < m981layoutTextK40F9xA.getWidth() || androidx.compose.ui.unit.IntSize.m4651getHeightimpl(r9) < m981layoutTextK40F9xA.getHeight())) {
            z2 = true;
        }
        this.didOverflow = z2;
        this.paragraph = m981layoutTextK40F9xA;
        return true;
    }

    public final int intrinsicHeight(int width, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = this.cachedIntrinsicHeightInputWidth;
        int i2 = this.cachedIntrinsicHeight;
        if (width == i && i != -1) {
            return i2;
        }
        int ceilToIntPx = androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m981layoutTextK40F9xA(androidx.compose.ui.unit.ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m986updateL6sJoHM(java.lang.String text, androidx.compose.ui.text.TextStyle style, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        markDirty();
    }

    private final androidx.compose.ui.text.ParagraphIntrinsics setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            java.lang.String str = this.text;
            androidx.compose.ui.text.TextStyle resolveDefaults = androidx.compose.ui.text.TextStyleKt.resolveDefaults(this.style, layoutDirection);
            androidx.compose.ui.unit.Density density = this.density;
            kotlin.jvm.internal.Intrinsics.checkNotNull(density);
            paragraphIntrinsics = androidx.compose.ui.text.ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, resolveDefaults, (java.util.List) null, (java.util.List) null, density, this.fontFamilyResolver, 12, (java.lang.Object) null);
        }
        this.paragraphIntrinsics = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final androidx.compose.ui.text.Paragraph m981layoutTextK40F9xA(long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.text.ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return androidx.compose.ui.text.ParagraphKt.m3857Paragraph_EkL_Y(layoutDirection2, androidx.compose.foundation.text.modifiers.LayoutUtilsKt.m970finalConstraintstfFHcEY(constraints, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), androidx.compose.foundation.text.modifiers.LayoutUtilsKt.m971finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(this.overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8()));
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m982newLayoutWillBeDifferentK40F9xA(long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics;
        androidx.compose.ui.text.Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (androidx.compose.ui.unit.Constraints.m4417equalsimpl0(constraints, this.prevConstraints)) {
            return false;
        }
        return androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints) != androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(this.prevConstraints) || ((float) androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(0, 0);
        this.layoutSize = androidx.compose.ui.unit.IntSizeKt.IntSize(0, 0);
        this.didOverflow = false;
    }

    public final androidx.compose.ui.text.TextLayoutResult slowCreateTextLayoutResultOrNull(androidx.compose.ui.text.TextStyle style) {
        androidx.compose.ui.unit.Density density;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(this.prevConstraints, 0, 0, 0, 0, 10, null);
        return new androidx.compose.ui.text.TextLayoutResult(new androidx.compose.ui.text.TextLayoutInput(annotatedString, style, kotlin.collections.CollectionsKt.emptyList(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, m4415copyZbe2FdA$default, (kotlin.jvm.internal.DefaultConstructorMarker) null), new androidx.compose.ui.text.MultiParagraph(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, style, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) kotlin.collections.CollectionsKt.emptyList(), density, this.fontFamilyResolver), m4415copyZbe2FdA$default, this.maxLines, androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(this.overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8()), null), this.layoutSize, null);
    }

    public final int minIntrinsicWidth(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final int maxIntrinsicWidth(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }
}
