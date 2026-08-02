package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010A\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020CH\u0002¢\u0006\u0004\bD\u00100J\u001d\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u0002082\u0006\u0010G\u001a\u000206¢\u0006\u0004\bH\u0010IJ)\u0010J\u001a\u0002082\u0006\u0010F\u001a\u0002082\u0006\u0010G\u001a\u0002062\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\bK\u0010LJ\u0016\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\r2\u0006\u0010G\u001a\u000206JE\u0010O\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u0002042\u0006\u0010G\u001a\u000206H\u0002J\u001f\u0010S\u001a\u00020!2\u0006\u0010F\u001a\u0002082\u0006\u0010G\u001a\u000206H\u0000¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\u000b2\u0006\u0010F\u001a\u0002082\u0006\u0010G\u001a\u000206H\u0002¢\u0006\u0004\bW\u0010IJ\b\u0010X\u001a\u00020\u001dH\u0002J\u0010\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010[\u001a\u00020\r2\u0006\u0010G\u001a\u000206J\u000e\u0010\\\u001a\u00020\r2\u0006\u0010G\u001a\u000206J\b\u0010]\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u00020,X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u00109\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010;\u001a\u00020<8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b=\u0010>\u001a\u0004\b?\u0010.\"\u0004\b@\u00100¨\u0006^"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "text", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", com.visa.cbp.getEncExpo.warmup, "lastDensity", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "J", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/unit/Density;", "density", "getDensity$foundation", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation", "(Landroidx/compose/ui/unit/Density;)V", "observeFontChanges", "", "getObserveFontChanges$foundation", "()Lkotlin/Unit;", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation", "(Landroidx/compose/ui/text/Paragraph;)V", "didOverflow", "getDidOverflow$foundation", "()Z", "setDidOverflow$foundation", "(Z)V", "layoutSize", "Landroidx/compose/ui/unit/IntSize;", "getLayoutSize-YbymL2g$foundation", "()J", "setLayoutSize-ozmzZPI$foundation", "(J)V", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "prevConstraints", "Landroidx/compose/ui/unit/Constraints;", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "historyFlag", "", "getHistoryFlag$foundation$annotations", "()V", "getHistoryFlag$foundation", "setHistoryFlag$foundation", "recordHistory", "op", "Landroidx/compose/foundation/text/modifiers/LayoutCacheOperation;", "recordHistory-4ETZmGE", "layoutWithConstraints", "constraints", "layoutDirection", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "useMinLinesConstrainer", "useMinLinesConstrainer-euUD3Qg", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;)J", "intrinsicHeight", "width", "update", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "setLayoutDirection", "layoutText", "layoutText-K40F9xA$foundation", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", "newLayoutWillBeDifferent", "newLayoutWillBeDifferent-K40F9xA", "markDirty", "slowCreateTextLayoutResultOrNull", "Landroidx/compose/ui/text/TextLayoutResult;", "minIntrinsicWidth", "maxIntrinsicWidth", "toString", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private androidx.compose.ui.unit.LayoutDirection Camera2StreamConfigurationMap;
    private androidx.compose.ui.unit.Density density;
    private boolean didOverflow;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRanges;
    private androidx.compose.ui.text.font.FontFamily.Resolver getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private androidx.compose.foundation.text.modifiers.MinLinesConstrainer getInputFormats;
    private int getInputSizeshNQ4ISI;
    private androidx.compose.ui.text.ParagraphIntrinsics getOutputFormats;
    private int getOutputMinFrameDuration;
    private long getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizes;
    private androidx.compose.ui.text.TextStyle getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private long historyFlag;
    private long layoutSize;
    private androidx.compose.ui.text.Paragraph paragraph;

    public static /* synthetic */ void getHistoryFlag$foundation$annotations() {
    }

    private ParagraphLayoutCache(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.getOutputSizes = str;
        this.getOutputSizeshNQ4ISI = textStyle;
        this.getHighSpeedVideoFpsRangesFor = resolver;
        this.getOutputMinFrameDuration = i;
        this.getOutputStallDuration = z;
        this.getInputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizesFor = i3;
        this.getHighSpeedVideoFpsRanges = androidx.compose.foundation.text.modifiers.InlineDensity.INSTANCE.m2330getUnspecifiedL26CHvs();
        this.layoutSize = androidx.compose.ui.unit.IntSize.m8767constructorimpl(0L);
        this.getOutputMinFrameDurationlomOqCM = androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(0, 0);
        this.getHighSpeedVideoSizes = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i4 & 8) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, null);
    }

    /* renamed from: getDensity$foundation, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation(androidx.compose.ui.unit.Density density) {
        androidx.compose.ui.unit.Density density2 = this.density;
        long m2322constructorimpl = density != null ? androidx.compose.foundation.text.modifiers.InlineDensity.m2322constructorimpl(density) : androidx.compose.foundation.text.modifiers.InlineDensity.INSTANCE.m2330getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.getHighSpeedVideoFpsRanges = m2322constructorimpl;
        } else if (density == null || !androidx.compose.foundation.text.modifiers.InlineDensity.m2324equalsimpl0(this.getHighSpeedVideoFpsRanges, m2322constructorimpl)) {
            this.density = density;
            this.getHighSpeedVideoFpsRanges = m2322constructorimpl;
            Camera2StreamConfigurationMap(androidx.compose.foundation.text.modifiers.LayoutCacheOperation.INSTANCE.m2338getMarkDirtyDensityDEKiAbY());
            getHighSpeedVideoFpsRanges();
        }
    }

    public final kotlin.Unit getObserveFontChanges$foundation() {
        androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics = this.getOutputFormats;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getParagraph$foundation, reason: from getter */
    public final androidx.compose.ui.text.Paragraph getParagraph() {
        return this.paragraph;
    }

    public final void setParagraph$foundation(androidx.compose.ui.text.Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    /* renamed from: getDidOverflow$foundation, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    public final void setDidOverflow$foundation(boolean z) {
        this.didOverflow = z;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation, reason: not valid java name and from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation, reason: not valid java name */
    public final void m2357setLayoutSizeozmzZPI$foundation(long j) {
        this.layoutSize = j;
    }

    /* renamed from: getHistoryFlag$foundation, reason: from getter */
    public final long getHistoryFlag() {
        return this.historyFlag;
    }

    public final void setHistoryFlag$foundation(long j) {
        this.historyFlag = j;
    }

    private final void Camera2StreamConfigurationMap(long j) {
        this.historyFlag = j | (this.historyFlag << 2);
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m2356layoutWithConstraintsK40F9xA(long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        Camera2StreamConfigurationMap(androidx.compose.foundation.text.modifiers.LayoutCacheOperation.INSTANCE.m2337getLayoutWithConstraintsDEKiAbY());
        boolean z = true;
        if (this.getHighSpeedVideoSizesFor > 1) {
            constraints = getHighSpeedVideoSizes(this, constraints, layoutDirection);
        }
        boolean z2 = false;
        if (!getHighSpeedVideoFpsRanges(constraints, layoutDirection)) {
            if (!androidx.compose.ui.unit.Constraints.m8548equalsimpl0(constraints, this.getOutputMinFrameDurationlomOqCM)) {
                androidx.compose.ui.text.Paragraph paragraph = this.paragraph;
                kotlin.jvm.internal.Intrinsics.checkNotNull(paragraph);
                this.layoutSize = androidx.compose.ui.unit.ConstraintsKt.m8568constrain4WqzIAM(constraints, androidx.compose.ui.unit.IntSize.m8767constructorimpl((androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(java.lang.Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())) << 32) | (androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(paragraph.getHeight()) & 4294967295L)));
                if (androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(this.getOutputMinFrameDuration, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8()) || (((int) (r6 >> 32)) >= paragraph.getWidth() && ((int) (4294967295L & r6)) >= paragraph.getHeight())) {
                    z = false;
                }
                this.didOverflow = z;
                this.getOutputMinFrameDurationlomOqCM = constraints;
            }
            return false;
        }
        androidx.compose.ui.text.Paragraph m2355layoutTextK40F9xA$foundation = m2355layoutTextK40F9xA$foundation(constraints, layoutDirection);
        this.getOutputMinFrameDurationlomOqCM = constraints;
        this.layoutSize = androidx.compose.ui.unit.ConstraintsKt.m8568constrain4WqzIAM(constraints, androidx.compose.ui.unit.IntSize.m8767constructorimpl((androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m2355layoutTextK40F9xA$foundation.getWidth()) << 32) | (androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m2355layoutTextK40F9xA$foundation.getHeight()) & 4294967295L)));
        if (!androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(this.getOutputMinFrameDuration, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8()) && (((int) (r12 >> 32)) < m2355layoutTextK40F9xA$foundation.getWidth() || ((int) (r12 & 4294967295L)) < m2355layoutTextK40F9xA$foundation.getHeight())) {
            z2 = true;
        }
        this.didOverflow = z2;
        this.paragraph = m2355layoutTextK40F9xA$foundation;
        return true;
    }

    private static /* synthetic */ long getHighSpeedVideoSizes(androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCache, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return paragraphLayoutCache.getHighResolutionOutputSizeshNQ4ISI(j, layoutDirection, paragraphLayoutCache.getOutputSizeshNQ4ISI);
    }

    private final long getHighResolutionOutputSizeshNQ4ISI(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextStyle textStyle) {
        androidx.compose.foundation.text.modifiers.MinLinesConstrainer.Companion companion = androidx.compose.foundation.text.modifiers.MinLinesConstrainer.INSTANCE;
        androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer = this.getInputFormats;
        androidx.compose.ui.unit.Density density = this.density;
        kotlin.jvm.internal.Intrinsics.checkNotNull(density);
        androidx.compose.foundation.text.modifiers.MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.getHighSpeedVideoFpsRangesFor);
        this.getInputFormats = from;
        return from.m2345coerceMinLinesOh53vG4$foundation(j, this.getHighSpeedVideoSizesFor);
    }

    public final int intrinsicHeight(int width, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = this.getHighSpeedVideoSizes;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (width == i && i != -1) {
            return i2;
        }
        long Constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE);
        if (this.getHighSpeedVideoSizesFor > 1) {
            Constraints = getHighSpeedVideoSizes(this, Constraints, layoutDirection);
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m2355layoutTextK40F9xA$foundation(Constraints, layoutDirection).getHeight()), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(Constraints));
        this.getHighSpeedVideoSizes = width;
        this.getHighResolutionOutputSizeshNQ4ISI = coerceAtLeast;
        return coerceAtLeast;
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m2358updateL6sJoHM(java.lang.String text, androidx.compose.ui.text.TextStyle style, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.getOutputSizes = text;
        this.getOutputSizeshNQ4ISI = style;
        this.getHighSpeedVideoFpsRangesFor = fontFamilyResolver;
        this.getOutputMinFrameDuration = overflow;
        this.getOutputStallDuration = softWrap;
        this.getInputSizeshNQ4ISI = maxLines;
        this.getHighSpeedVideoSizesFor = minLines;
        Camera2StreamConfigurationMap(androidx.compose.foundation.text.modifiers.LayoutCacheOperation.INSTANCE.m2339getMarkDirtyNodeDEKiAbY());
        getHighSpeedVideoFpsRanges();
    }

    private final androidx.compose.ui.text.ParagraphIntrinsics getHighSpeedVideoSizes(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics = this.getOutputFormats;
        if (paragraphIntrinsics == null || layoutDirection != this.Camera2StreamConfigurationMap || paragraphIntrinsics.getHasStaleResolvedFonts()) {
            this.Camera2StreamConfigurationMap = layoutDirection;
            java.lang.String str = this.getOutputSizes;
            androidx.compose.ui.text.TextStyle resolveDefaults = androidx.compose.ui.text.TextStyleKt.resolveDefaults(this.getOutputSizeshNQ4ISI, layoutDirection);
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            androidx.compose.ui.unit.Density density = this.density;
            kotlin.jvm.internal.Intrinsics.checkNotNull(density);
            paragraphIntrinsics = androidx.compose.ui.text.ParagraphIntrinsicsKt.ParagraphIntrinsics(str, resolveDefaults, (java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>>) emptyList, density, this.getHighSpeedVideoFpsRangesFor, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) kotlin.collections.CollectionsKt.emptyList());
        }
        this.getOutputFormats = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    /* renamed from: layoutText-K40F9xA$foundation, reason: not valid java name */
    public final androidx.compose.ui.text.Paragraph m2355layoutTextK40F9xA$foundation(long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.text.ParagraphIntrinsics highSpeedVideoSizes = getHighSpeedVideoSizes(layoutDirection);
        return androidx.compose.ui.text.ParagraphKt.m7901ParagraphczeNHc(highSpeedVideoSizes, androidx.compose.foundation.text.modifiers.LayoutUtilsKt.m2341finalConstraintstfFHcEY(constraints, this.getOutputStallDuration, this.getOutputMinFrameDuration, highSpeedVideoSizes.getMaxIntrinsicWidth()), androidx.compose.foundation.text.modifiers.LayoutUtilsKt.m2342finalMaxLinesxdlQI24(this.getOutputStallDuration, this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI), this.getOutputMinFrameDuration);
    }

    private final boolean getHighSpeedVideoFpsRanges(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics;
        androidx.compose.ui.text.Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.getOutputFormats) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.Camera2StreamConfigurationMap) {
            return true;
        }
        if (androidx.compose.ui.unit.Constraints.m8548equalsimpl0(j, this.getOutputMinFrameDurationlomOqCM)) {
            return false;
        }
        return androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) != androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(this.getOutputMinFrameDurationlomOqCM) || androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) != androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(this.getOutputMinFrameDurationlomOqCM) || ((float) androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final void getHighSpeedVideoFpsRanges() {
        this.paragraph = null;
        this.getOutputFormats = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getOutputMinFrameDurationlomOqCM = androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(0, 0);
        this.layoutSize = androidx.compose.ui.unit.IntSize.m8767constructorimpl(0L);
        this.didOverflow = false;
    }

    public final androidx.compose.ui.text.TextLayoutResult slowCreateTextLayoutResultOrNull(androidx.compose.ui.text.TextStyle style) {
        androidx.compose.ui.unit.Density density;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = this.Camera2StreamConfigurationMap;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(this.getOutputSizes, null, 2, null);
        if (this.paragraph == null || this.getOutputFormats == null) {
            return null;
        }
        long m8543constructorimpl = androidx.compose.ui.unit.Constraints.m8543constructorimpl(this.getOutputMinFrameDurationlomOqCM & androidx.compose.ui.unit.ConstraintsKt.MaxDimensionsAndFocusMask);
        return new androidx.compose.ui.text.TextLayoutResult(new androidx.compose.ui.text.TextLayoutInput(annotatedString, style, kotlin.collections.CollectionsKt.emptyList(), this.getInputSizeshNQ4ISI, this.getOutputStallDuration, this.getOutputMinFrameDuration, density, layoutDirection, this.getHighSpeedVideoFpsRangesFor, m8543constructorimpl, (kotlin.jvm.internal.DefaultConstructorMarker) null), new androidx.compose.ui.text.MultiParagraph(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, style, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) kotlin.collections.CollectionsKt.emptyList(), density, this.getHighSpeedVideoFpsRangesFor), m8543constructorimpl, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, (kotlin.jvm.internal.DefaultConstructorMarker) null), this.layoutSize, null);
    }

    public final int minIntrinsicWidth(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(getHighSpeedVideoSizes(layoutDirection).getMinIntrinsicWidth());
    }

    public final int maxIntrinsicWidth(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(getHighSpeedVideoSizes(layoutDirection).getMaxIntrinsicWidth());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((java.lang.Object) androidx.compose.foundation.text.modifiers.InlineDensity.m2328toStringimpl(this.getHighSpeedVideoFpsRanges));
        sb.append(", history=");
        sb.append(this.historyFlag);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    public /* synthetic */ ParagraphLayoutCache(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.font.FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i, z, i2, i3);
    }
}
