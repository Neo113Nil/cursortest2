package androidx.compose.ui.text;

/* compiled from: MultiParagraph.kt */
@kotlin.Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nBY\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017BY\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u001aBY\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u001dB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u001eJ*\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020>2\b\b\u0001\u0010B\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u000e\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0005J\u000e\u0010H\u001a\u00020:2\u0006\u0010G\u001a\u00020\u0005J\u000e\u0010I\u001a\u00020:2\u0006\u0010G\u001a\u00020\u0005J\u0016\u0010J\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u0005J\u0018\u0010N\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00052\b\b\u0002\u0010O\u001a\u00020\u0007J\u000e\u0010P\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u0005J\u000e\u0010Q\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\tJ\u000e\u0010S\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u0005J\u000e\u0010T\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u0005J\u000e\u0010U\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u0005J\u000e\u0010V\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u0005J\u000e\u0010W\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u0005J\u000e\u0010X\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u0005J\u0018\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020[ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J\u000e\u0010^\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0005J\u0016\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u00052\u0006\u0010b\u001a\u00020\u0005J\u001b\u0010c\u001a\u00020@2\u0006\u0010G\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ\u000e\u0010f\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0005JX\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\b\b\u0002\u0010m\u001a\u00020\t2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010o2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010q2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010s2\b\b\u0002\u0010t\u001a\u00020uø\u0001\u0000¢\u0006\u0004\bv\u0010wJ<\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\b\b\u0002\u0010x\u001a\u00020y2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010o2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010qH\u0007ø\u0001\u0000¢\u0006\u0004\bz\u0010{JP\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\b\b\u0002\u0010x\u001a\u00020y2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010o2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010q2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010s2\b\b\u0002\u0010t\u001a\u00020uø\u0001\u0000¢\u0006\u0004\b|\u0010}J\u0010\u0010~\u001a\u00020h2\u0006\u0010G\u001a\u00020\u0005H\u0002J\u0010\u0010\u007f\u001a\u00020h2\u0006\u0010G\u001a\u00020\u0005H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020h2\u0006\u0010M\u001a\u00020\u0005H\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010-\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u00103\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010&R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u0010¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "ellipsis", "", "width", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "lastBaseline", "getLastBaseline", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "paragraphInfoList", "Landroidx/compose/ui/text/ParagraphInfo;", "getParagraphInfoList$ui_text_release", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "getWidth", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final androidx.compose.ui.text.MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final java.util.List<androidx.compose.ui.text.ParagraphInfo> paragraphInfoList;
    private final java.util.List<androidx.compose.ui.geometry.Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) list, i, z);
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    private MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        boolean z2;
        int m4423getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j) != 0 || androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j) != 0) {
            throw new java.lang.IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (i3 < size) {
            androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i3);
            androidx.compose.ui.text.ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
            if (androidx.compose.ui.unit.Constraints.m4419getHasBoundedHeightimpl(j)) {
                m4423getMaxHeightimpl = kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - androidx.compose.ui.text.ParagraphKt.ceilToInt(f), i2);
            } else {
                m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
            }
            androidx.compose.ui.text.Paragraph m3857Paragraph_EkL_Y = androidx.compose.ui.text.ParagraphKt.m3857Paragraph_EkL_Y(intrinsics, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, m4424getMaxWidthimpl, 0, m4423getMaxHeightimpl, 5, null), this.maxLines - i4, z);
            float height = f + m3857Paragraph_EkL_Y.getHeight();
            int lineCount = i4 + m3857Paragraph_EkL_Y.getLineCount();
            java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> list = infoList$ui_text_release;
            arrayList.add(new androidx.compose.ui.text.ParagraphInfo(m3857Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i4, lineCount, f, height));
            if (m3857Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.maxLines && i3 != kotlin.collections.CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release()))) {
                z2 = true;
                i4 = lineCount;
                f = height;
                break;
            } else {
                i3++;
                i4 = lineCount;
                f = height;
                i2 = 0;
                infoList$ui_text_release = list;
            }
        }
        z2 = false;
        this.height = f;
        this.lineCount = i4;
        this.didExceedMaxLines = z2;
        this.paragraphInfoList = arrayList;
        this.width = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = (androidx.compose.ui.text.ParagraphInfo) arrayList.get(i5);
            java.util.List<androidx.compose.ui.geometry.Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i6 = 0; i6 < size3; i6++) {
                java.util.ArrayList arrayList4 = arrayList3;
                androidx.compose.ui.geometry.Rect rect = placeholderRects.get(i6);
                arrayList4.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, arrayList3);
        }
        java.util.ArrayList arrayList5 = arrayList2;
        if (arrayList5.size() < this.intrinsics.getPlaceholders().size()) {
            java.util.ArrayList arrayList6 = arrayList5;
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList5.size();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList7.add(null);
            }
            arrayList5 = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList6, (java.lang.Iterable) arrayList7);
        }
        this.placeholderRects = arrayList5;
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, null);
    }

    public final androidx.compose.ui.text.MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    @kotlin.Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f) {
        this(multiParagraphIntrinsics, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, androidx.compose.ui.text.ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z, null);
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, java.util.List list, int i, boolean z, float f, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) ((i2 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list), (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, density, resourceLoader);
    }

    @kotlin.Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @kotlin.ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, boolean z, float f, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader) {
        this(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyle, list, density, androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, androidx.compose.ui.text.ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z, null);
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, float f, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f, density, resolver, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) ((i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list), (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z);
    }

    @kotlin.Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, float f, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, boolean z) {
        this(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, androidx.compose.ui.text.ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z, null);
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z, null);
    }

    private MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, boolean z) {
        this(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j, i, z, null);
    }

    private final androidx.compose.ui.text.AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = (androidx.compose.ui.text.ParagraphInfo) kotlin.collections.CollectionsKt.last((java.util.List) this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final java.util.List<androidx.compose.ui.geometry.Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final java.util.List<androidx.compose.ui.text.ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m3838paintRPmYEkk$default(androidx.compose.ui.text.MultiParagraph multiParagraph, androidx.compose.ui.graphics.Canvas canvas, long j, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU();
        }
        multiParagraph.m3844paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m3844paintRPmYEkk(androidx.compose.ui.graphics.Canvas canvas, long color, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration decoration) {
        canvas.save();
        java.util.List<androidx.compose.ui.text.ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = list.get(i);
            paragraphInfo.getParagraph().mo3815paintRPmYEkk(canvas, color, shadow, decoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m3843paintLG529CI(androidx.compose.ui.graphics.Canvas canvas, long color, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration decoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int blendMode) {
        canvas.save();
        java.util.List<androidx.compose.ui.text.ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = list.get(i);
            paragraphInfo.getParagraph().mo3814paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m3845painthn5TExg(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Brush brush, float alpha, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration decoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int blendMode) {
        androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt.m4212drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final androidx.compose.ui.graphics.Path getPathForRange(final int start, final int end) {
        if (start >= 0 && start <= end && end <= getAnnotatedString().getText().length()) {
            if (start == end) {
                return androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
            }
            final androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
            androidx.compose.ui.text.MultiParagraphKt.m3846findParagraphsByRangeSbBc2M(this.paragraphInfoList, androidx.compose.ui.text.TextRangeKt.TextRange(start, end), new kotlin.jvm.functions.Function1<androidx.compose.ui.text.ParagraphInfo, kotlin.Unit>() { // from class: androidx.compose.ui.text.MultiParagraph$getPathForRange$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.ParagraphInfo paragraphInfo) {
                    invoke2(paragraphInfo);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.text.ParagraphInfo paragraphInfo) {
                    androidx.compose.ui.graphics.Path.CC.m2392addPathUv8p0NA$default(androidx.compose.ui.graphics.Path.this, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(start), paragraphInfo.toLocalIndex(end))), 0L, 2, null);
                }
            });
            return Path;
        }
        throw new java.lang.IllegalArgumentException(("Start(" + start + ") or End(" + end + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
    }

    public final int getLineForVerticalPosition(float vertical) {
        int lastIndex;
        if (vertical <= 0.0f) {
            lastIndex = 0;
        } else {
            lastIndex = vertical >= this.height ? kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList) : androidx.compose.ui.text.MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(lastIndex);
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartLineIndex();
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m3841getOffsetForPositionk4lQ0M(long position) {
        int lastIndex;
        if (androidx.compose.ui.geometry.Offset.m1872getYimpl(position) <= 0.0f) {
            lastIndex = 0;
        } else {
            lastIndex = androidx.compose.ui.geometry.Offset.m1872getYimpl(position) >= this.height ? kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList) : androidx.compose.ui.text.MultiParagraphKt.findParagraphByY(this.paragraphInfoList, androidx.compose.ui.geometry.Offset.m1872getYimpl(position));
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(lastIndex);
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartIndex();
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo3812getOffsetForPositionk4lQ0M(paragraphInfo.m3854toLocalMKHz9U(position)));
    }

    public final androidx.compose.ui.geometry.Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m3840fillBoundingBoxes8ffj60Q(final long range, final float[] array, int arrayStart) {
        requireIndexInRange(androidx.compose.ui.text.TextRange.m3962getMinimpl(range));
        requireIndexInRangeInclusiveEnd(androidx.compose.ui.text.TextRange.m3961getMaximpl(range));
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = arrayStart;
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        androidx.compose.ui.text.MultiParagraphKt.m3846findParagraphsByRangeSbBc2M(this.paragraphInfoList, range, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.ParagraphInfo, kotlin.Unit>() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.ParagraphInfo paragraphInfo) {
                invoke2(paragraphInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.text.ParagraphInfo paragraphInfo) {
                long j = range;
                float[] fArr = array;
                kotlin.jvm.internal.Ref.IntRef intRef2 = intRef;
                kotlin.jvm.internal.Ref.FloatRef floatRef2 = floatRef;
                long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > androidx.compose.ui.text.TextRange.m3962getMinimpl(j) ? paragraphInfo.getStartIndex() : androidx.compose.ui.text.TextRange.m3962getMinimpl(j)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < androidx.compose.ui.text.TextRange.m3961getMaximpl(j) ? paragraphInfo.getEndIndex() : androidx.compose.ui.text.TextRange.m3961getMaximpl(j)));
                paragraphInfo.getParagraph().mo3810fillBoundingBoxes8ffj60Q(TextRange, fArr, intRef2.element);
                int m3960getLengthimpl = intRef2.element + (androidx.compose.ui.text.TextRange.m3960getLengthimpl(TextRange) * 4);
                for (int i = intRef2.element; i < m3960getLengthimpl; i += 4) {
                    int i2 = i + 1;
                    fArr[i2] = fArr[i2] + floatRef2.element;
                    int i3 = i + 3;
                    fArr[i3] = fArr[i3] + floatRef2.element;
                }
                intRef2.element = m3960getLengthimpl;
                floatRef2.element += paragraphInfo.getParagraph().getHeight();
            }
        });
        return array;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    public final androidx.compose.ui.text.style.ResolvedTextDirection getParagraphDirection(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final androidx.compose.ui.text.style.ResolvedTextDirection getBidiRunDirection(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m3842getWordBoundaryjx7JFs(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.m3853toGlobalGEjPoXI(paragraphInfo.getParagraph().mo3813getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)));
    }

    public final androidx.compose.ui.geometry.Rect getCursorRect(int offset) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(offset);
        if (offset == getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForOffset(int offset) {
        int findParagraphByIndex;
        if (offset >= getAnnotatedString().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = offset < 0 ? 0 : androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final float getLineLeft(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineTop(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineBottom(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineHeight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineWidth(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final int getLineStart(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public static /* synthetic */ int getLineEnd$default(androidx.compose.ui.text.MultiParagraph multiParagraph, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i, z);
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        requireLineIndexInRange(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(lineIndex), visibleEnd));
    }

    public final boolean isLineEllipsized(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        return this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex)).getParagraph().isLineEllipsized(lineIndex);
    }

    private final void requireIndexInRange(int offset) {
        if (offset < 0 || offset >= getAnnotatedString().getText().length()) {
            throw new java.lang.IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int offset) {
        if (offset < 0 || offset > getAnnotatedString().getText().length()) {
            throw new java.lang.IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST).toString());
        }
    }

    private final void requireLineIndexInRange(int lineIndex) {
        if (lineIndex < 0 || lineIndex >= this.lineCount) {
            throw new java.lang.IllegalArgumentException(("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')').toString());
        }
    }
}
