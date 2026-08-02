package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\rJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b&\u0010%J\u0015\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\u0015\u00102\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b3\u0010.J\u001d\u00107\u001a\u0002062\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n¢\u0006\u0004\b7\u00108J!\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u0011\u0010U\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0011\u0010Y\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bX\u0010TR\"\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0Z8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0011\u0010`\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b_\u0010@"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "layoutInput", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "lineIndex", "getLineStart", "(I)I", "", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "", "getLineTop", "(I)F", "getLineBaseline", "getLineBottom", "getLineLeft", "getLineRight", "offset", "getLineForOffset", "vertical", "getLineForVerticalPosition", "(F)I", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/TextLayoutInput;", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "Landroidx/compose/ui/text/MultiParagraph;", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", "J", "getSize-YbymL2g", "()J", "firstBaseline", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFirstBaseline", "()F", "lastBaseline", "getLastBaseline", "getDidOverflowHeight", "()Z", "didOverflowHeight", "getDidOverflowWidth", "didOverflowWidth", "getHasVisualOverflow", "hasVisualOverflow", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "getLineCount", "lineCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final androidx.compose.ui.text.TextLayoutInput layoutInput;
    private final androidx.compose.ui.text.MultiParagraph multiParagraph;
    private final java.util.List<androidx.compose.ui.geometry.Rect> placeholderRects;
    private final long size;

    private TextLayoutResult(androidx.compose.ui.text.TextLayoutInput textLayoutInput, androidx.compose.ui.text.MultiParagraph multiParagraph, long j) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    public final androidx.compose.ui.text.TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final androidx.compose.ui.text.MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & 4294967295L))) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final java.util.List<androidx.compose.ui.geometry.Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineStart(int lineIndex) {
        return this.multiParagraph.getLineStart(lineIndex);
    }

    public static /* synthetic */ int getLineEnd$default(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.getLineEnd(i, z);
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.getLineEnd(lineIndex, visibleEnd);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return this.multiParagraph.isLineEllipsized(lineIndex);
    }

    public final float getLineTop(int lineIndex) {
        return this.multiParagraph.getLineTop(lineIndex);
    }

    public final float getLineBaseline(int lineIndex) {
        return this.multiParagraph.getLineBaseline(lineIndex);
    }

    public final float getLineBottom(int lineIndex) {
        return this.multiParagraph.getLineBottom(lineIndex);
    }

    public final float getLineLeft(int lineIndex) {
        return this.multiParagraph.getLineLeft(lineIndex);
    }

    public final float getLineRight(int lineIndex) {
        return this.multiParagraph.getLineRight(lineIndex);
    }

    public final int getLineForOffset(int offset) {
        return this.multiParagraph.getLineForOffset(offset);
    }

    public final int getLineForVerticalPosition(float vertical) {
        return this.multiParagraph.getLineForVerticalPosition(vertical);
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.getHorizontalPosition(offset, usePrimaryDirection);
    }

    public final androidx.compose.ui.text.style.ResolvedTextDirection getParagraphDirection(int offset) {
        return this.multiParagraph.getParagraphDirection(offset);
    }

    public final androidx.compose.ui.text.style.ResolvedTextDirection getBidiRunDirection(int offset) {
        return this.multiParagraph.getBidiRunDirection(offset);
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m8011getOffsetForPositionk4lQ0M(long position) {
        return this.multiParagraph.m7878getOffsetForPositionk4lQ0M(position);
    }

    public final androidx.compose.ui.geometry.Rect getBoundingBox(int offset) {
        return this.multiParagraph.getBoundingBox(offset);
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m8013getWordBoundaryjx7JFs(int offset) {
        return this.multiParagraph.m7880getWordBoundaryjx7JFs(offset);
    }

    public final androidx.compose.ui.geometry.Rect getCursorRect(int offset) {
        return this.multiParagraph.getCursorRect(offset);
    }

    public final androidx.compose.ui.graphics.Path getPathForRange(int start, int end) {
        return this.multiParagraph.getPathForRange(start, end);
    }

    /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.TextLayoutResult m8009copyO0kMr_c$default(androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.text.TextLayoutInput textLayoutInput, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i & 2) != 0) {
            j = textLayoutResult.size;
        }
        return textLayoutResult.m8010copyO0kMr_c(textLayoutInput, j);
    }

    /* renamed from: copy-O0kMr_c, reason: not valid java name */
    public final androidx.compose.ui.text.TextLayoutResult m8010copyO0kMr_c(androidx.compose.ui.text.TextLayoutInput layoutInput, long size) {
        return new androidx.compose.ui.text.TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.TextLayoutResult)) {
            return false;
        }
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = (androidx.compose.ui.text.TextLayoutResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.layoutInput, textLayoutResult.layoutInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.multiParagraph, textLayoutResult.multiParagraph) && androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final int hashCode() {
        int hashCode = this.layoutInput.hashCode();
        int hashCode2 = this.multiParagraph.hashCode();
        int m8773hashCodeimpl = androidx.compose.ui.unit.IntSize.m8773hashCodeimpl(this.size);
        return (((((((((hashCode * 31) + hashCode2) * 31) + m8773hashCodeimpl) * 31) + java.lang.Float.hashCode(this.firstBaseline)) * 31) + java.lang.Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextLayoutResult(layoutInput=");
        sb.append(this.layoutInput);
        sb.append(", multiParagraph=");
        sb.append(this.multiParagraph);
        sb.append(", size=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.IntSize.m8775toStringimpl(this.size));
        sb.append(", firstBaseline=");
        sb.append(this.firstBaseline);
        sb.append(", lastBaseline=");
        sb.append(this.lastBaseline);
        sb.append(", placeholderRects=");
        sb.append(this.placeholderRects);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TextLayoutResult(androidx.compose.ui.text.TextLayoutInput textLayoutInput, androidx.compose.ui.text.MultiParagraph multiParagraph, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph, j);
    }
}
