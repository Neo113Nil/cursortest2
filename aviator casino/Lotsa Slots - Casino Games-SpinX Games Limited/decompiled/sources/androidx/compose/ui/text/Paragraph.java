package androidx.compose.ui.text;

/* compiled from: Paragraph.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J,\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000fH&J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u000fH&J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u000fH&J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0003H&J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u001a\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u0003H&J\u0010\u00101\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH&J\u0010\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u0007H&J\u0010\u00104\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00105\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00106\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00107\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00108\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00109\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u001a\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<H&ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000fH&J\u0018\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000fH&J\u001d\u0010D\u001a\u00020 2\u0006\u0010(\u001a\u00020\u000fH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u000fH&JZ\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020\u00072\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\b\b\u0002\u0010T\u001a\u00020UH&ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ<\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020J2\b\b\u0002\u0010X\u001a\u00020Y2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010QH&ø\u0001\u0000¢\u0006\u0004\bZ\u0010[JR\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020J2\b\b\u0002\u0010X\u001a\u00020Y2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\b\b\u0002\u0010T\u001a\u00020UH&ø\u0001\u0000¢\u0006\u0004\b\\\u0010]R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\t\u0082\u0001\u0001^ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006_À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "didExceedMaxLines", "", "getDidExceedMaxLines", "()Z", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "lineCount", "", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "minIntrinsicWidth", "getMinIntrinsicWidth", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "width", "getWidth", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/text/AndroidParagraph;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Paragraph {
    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo3810fillBoundingBoxes8ffj60Q(long range, float[] array, int arrayStart);

    androidx.compose.ui.text.style.ResolvedTextDirection getBidiRunDirection(int offset);

    androidx.compose.ui.geometry.Rect getBoundingBox(int offset);

    androidx.compose.ui.geometry.Rect getCursorRect(int offset);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int offset, boolean usePrimaryDirection);

    float getLastBaseline();

    float getLineBottom(int lineIndex);

    int getLineCount();

    int getLineEnd(int lineIndex, boolean visibleEnd);

    int getLineForOffset(int offset);

    int getLineForVerticalPosition(float vertical);

    float getLineHeight(int lineIndex);

    float getLineLeft(int lineIndex);

    float getLineRight(int lineIndex);

    int getLineStart(int lineIndex);

    float getLineTop(int lineIndex);

    float getLineWidth(int lineIndex);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    int mo3812getOffsetForPositionk4lQ0M(long position);

    androidx.compose.ui.text.style.ResolvedTextDirection getParagraphDirection(int offset);

    androidx.compose.ui.graphics.Path getPathForRange(int start, int end);

    java.util.List<androidx.compose.ui.geometry.Rect> getPlaceholderRects();

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo3813getWordBoundaryjx7JFs(int offset);

    boolean isLineEllipsized(int lineIndex);

    /* renamed from: paint-LG529CI */
    void mo3814paintLG529CI(androidx.compose.ui.graphics.Canvas canvas, long color, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int blendMode);

    /* renamed from: paint-RPmYEkk */
    void mo3815paintRPmYEkk(androidx.compose.ui.graphics.Canvas canvas, long color, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo3816painthn5TExg(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Brush brush, float alpha, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int blendMode);

    /* compiled from: Paragraph.android.kt */
    /* renamed from: androidx.compose.ui.text.Paragraph$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ int getLineEnd$default(androidx.compose.ui.text.Paragraph paragraph, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            return paragraph.getLineEnd(i, z);
        }

        /* renamed from: paint-LG529CI$default, reason: not valid java name */
        public static /* synthetic */ void m3847paintLG529CI$default(androidx.compose.ui.text.Paragraph paragraph, androidx.compose.ui.graphics.Canvas canvas, long j, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
            }
            paragraph.mo3814paintLG529CI(canvas, (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : j, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration, (i2 & 16) == 0 ? drawStyle : null, (i2 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
        public static /* synthetic */ void m3848paintRPmYEkk$default(androidx.compose.ui.text.Paragraph paragraph, androidx.compose.ui.graphics.Canvas canvas, long j, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
            }
            if ((i & 2) != 0) {
                j = androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU();
            }
            paragraph.mo3815paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
        }

        /* renamed from: paint-hn5TExg$default, reason: not valid java name */
        public static /* synthetic */ void m3849painthn5TExg$default(androidx.compose.ui.text.Paragraph paragraph, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
            }
            paragraph.mo3816painthn5TExg(canvas, brush, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? null : shadow, (i2 & 16) != 0 ? null : textDecoration, (i2 & 32) != 0 ? null : drawStyle, (i2 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }
    }

    /* compiled from: Paragraph.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }
}
