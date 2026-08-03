package androidx.compose.ui.text;

/* compiled from: AndroidParagraph.android.kt */
@kotlin.Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bg\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016B%\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0019JJ\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r2\b\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r2\u0006\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\rH\u0002J,\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\b\b\u0001\u0010`\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010f\u001a\u00020<2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010g\u001a\u00020<2\u0006\u0010e\u001a\u00020\rH\u0016J\u0018\u0010h\u001a\u00020(2\u0006\u0010e\u001a\u00020\r2\u0006\u0010i\u001a\u00020\u000fH\u0016J\u0015\u0010j\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\blJ\u0015\u0010m\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0015\u0010p\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\bqJ\u0018\u0010r\u001a\u00020\r2\u0006\u0010k\u001a\u00020\r2\u0006\u0010s\u001a\u00020\u000fH\u0016J\u0010\u0010t\u001a\u00020\r2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010u\u001a\u00020\r2\u0006\u0010v\u001a\u00020(H\u0016J\u0010\u0010w\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010x\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010y\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010z\u001a\u00020\r2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010{\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010|\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u001c\u0010}\u001a\u00020\r2\u0006\u0010~\u001a\u00020\u007fH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020d2\u0006\u0010e\u001a\u00020\rH\u0016J\u001c\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\r2\u0007\u0010\u0086\u0001\u001a\u00020\rH\u0016J\u001f\u0010M\u001a\u00020]2\u0006\u0010e\u001a\u00020\rH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\rH\u0016J\u0013\u0010\u008a\u0001\u001a\u00020[2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0002J`\u0010\u008a\u0001\u001a\u00020[2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020(2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001JA\u0010\u008a\u0001\u001a\u00020[2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001JW\u0010\u008a\u0001\u001a\u00020[2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001b\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010¡\u0001*\u000200H\u0002¢\u0006\u0003\u0010£\u0001R\u001c\u0010\u001a\u001a\u00020\u001b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0014\u00107\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010*R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@8@X\u0081\u0004¢\u0006\f\u0012\u0004\bA\u0010\u001d\u001a\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020E8@X\u0081\u0004¢\u0006\f\u0012\u0004\bF\u0010\u001d\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010*R\u001b\u0010K\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bM\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¤\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "ellipsis", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "charSequence", "", "getCharSequence$ui_text_release$annotations", "()V", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getConstraints-msEJaDk", "()J", "J", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "getEllipsis", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "textLocale", "Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "width", "getWidth", "wordBoundary", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "getWordBoundary", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary$delegate", "Lkotlin/Lazy;", "constructTextLayout", "alignment", "justificationMode", com.helpshift.proactive.InAppViewConstants.ELLIPSIZE, "Landroid/text/TextUtils$TruncateAt;", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineAscent", "lineIndex", "getLineAscent$ui_text_release", "getLineBaseline", "getLineBaseline$ui_text_release", "getLineBottom", "getLineDescent", "getLineDescent$ui_text_release", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "getShaderBrushSpans", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraph implements androidx.compose.ui.text.Paragraph {
    public static final int $stable = 8;
    private final java.lang.CharSequence charSequence;
    private final long constraints;
    private final boolean ellipsis;
    private final androidx.compose.ui.text.android.TextLayout layout;
    private final int maxLines;
    private final androidx.compose.ui.text.platform.AndroidParagraphIntrinsics paragraphIntrinsics;
    private final java.util.List<androidx.compose.ui.geometry.Rect> placeholderRects;

    /* renamed from: wordBoundary$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy wordBoundary;

    /* compiled from: AndroidParagraph.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.text.style.ResolvedTextDirection.values().length];
            try {
                iArr[androidx.compose.ui.text.style.ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.text.style.ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, z, j);
    }

    public /* synthetic */ AndroidParagraph(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List list, java.util.List list2, int i, boolean z, long j, androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.unit.Density density, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, list, list2, i, z, j, resolver, density);
    }

    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j) {
        boolean shouldAttachIndentationFixSpan;
        java.lang.CharSequence charSequence;
        int m3822toLayoutAlignaXe7zB0;
        int m3824toLayoutHyphenationFrequency3fSNIE;
        int m3823toLayoutBreakStrategyxImikfE;
        int m3825toLayoutLineBreakStylehpcqdu8;
        int m3826toLayoutLineBreakWordStylewPN0Rpw;
        java.util.ArrayList arrayList;
        androidx.compose.ui.geometry.Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float f;
        float lineBaseline2;
        int numberOfLinesThatFitMaxHeight;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i;
        this.ellipsis = z;
        this.constraints = j;
        if (androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j) != 0 || androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j) != 0) {
            throw new java.lang.IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i < 1) {
            throw new java.lang.IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        androidx.compose.ui.text.TextStyle style = androidParagraphIntrinsics.getStyle();
        shouldAttachIndentationFixSpan = androidx.compose.ui.text.AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, z);
        if (shouldAttachIndentationFixSpan) {
            charSequence = androidx.compose.ui.text.AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence());
        } else {
            charSequence = androidParagraphIntrinsics.getCharSequence();
        }
        this.charSequence = charSequence;
        m3822toLayoutAlignaXe7zB0 = androidx.compose.ui.text.AndroidParagraph_androidKt.m3822toLayoutAlignaXe7zB0(style.m4005getTextAligne0LSkKk());
        boolean m4356equalsimpl0 = androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(style.m4005getTextAligne0LSkKk(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m4362getJustifye0LSkKk());
        m3824toLayoutHyphenationFrequency3fSNIE = androidx.compose.ui.text.AndroidParagraph_androidKt.m3824toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle().getHyphens());
        m3823toLayoutBreakStrategyxImikfE = androidx.compose.ui.text.AndroidParagraph_androidKt.m3823toLayoutBreakStrategyxImikfE(androidx.compose.ui.text.style.LineBreak.m4280getStrategyfcGXIks(style.m4002getLineBreakrAG3T2k()));
        m3825toLayoutLineBreakStylehpcqdu8 = androidx.compose.ui.text.AndroidParagraph_androidKt.m3825toLayoutLineBreakStylehpcqdu8(androidx.compose.ui.text.style.LineBreak.m4281getStrictnessusljTpc(style.m4002getLineBreakrAG3T2k()));
        m3826toLayoutLineBreakWordStylewPN0Rpw = androidx.compose.ui.text.AndroidParagraph_androidKt.m3826toLayoutLineBreakWordStylewPN0Rpw(androidx.compose.ui.text.style.LineBreak.m4282getWordBreakjp8hJ3c(style.m4002getLineBreakrAG3T2k()));
        android.text.TextUtils.TruncateAt truncateAt = z ? android.text.TextUtils.TruncateAt.END : null;
        androidx.compose.ui.text.android.TextLayout constructTextLayout = constructTextLayout(m3822toLayoutAlignaXe7zB0, m4356equalsimpl0 ? 1 : 0, truncateAt, i, m3824toLayoutHyphenationFrequency3fSNIE, m3823toLayoutBreakStrategyxImikfE, m3825toLayoutLineBreakStylehpcqdu8, m3826toLayoutLineBreakWordStylewPN0Rpw);
        if (z && constructTextLayout.getHeight() > androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) && i > 1) {
            numberOfLinesThatFitMaxHeight = androidx.compose.ui.text.AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(constructTextLayout, androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j));
            if (numberOfLinesThatFitMaxHeight >= 0 && numberOfLinesThatFitMaxHeight != i) {
                constructTextLayout = constructTextLayout(m3822toLayoutAlignaXe7zB0, m4356equalsimpl0 ? 1 : 0, truncateAt, kotlin.ranges.RangesKt.coerceAtLeast(numberOfLinesThatFitMaxHeight, 1), m3824toLayoutHyphenationFrequency3fSNIE, m3823toLayoutBreakStrategyxImikfE, m3825toLayoutLineBreakStylehpcqdu8, m3826toLayoutLineBreakWordStylewPN0Rpw);
            }
            this.layout = constructTextLayout;
        } else {
            this.layout = constructTextLayout;
        }
        getTextPaint$ui_text_release().m4224setBrush12SF9DM(style.getBrush(), androidx.compose.ui.geometry.SizeKt.Size(getWidth(), getHeight()), style.getAlpha());
        for (androidx.compose.ui.text.platform.style.ShaderBrushSpan shaderBrushSpan : getShaderBrushSpans(this.layout)) {
            shaderBrushSpan.m4243setSizeuvyYCjk(androidx.compose.ui.geometry.SizeKt.Size(getWidth(), getHeight()));
        }
        java.lang.CharSequence charSequence2 = this.charSequence;
        if (charSequence2 instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence2;
            java.lang.Object[] spans = spanned.getSpans(0, charSequence2.length(), androidx.compose.ui.text.android.style.PlaceholderSpan.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(spans.length);
            for (java.lang.Object obj : spans) {
                androidx.compose.ui.text.android.style.PlaceholderSpan placeholderSpan = (androidx.compose.ui.text.android.style.PlaceholderSpan) obj;
                int spanStart = spanned.getSpanStart(placeholderSpan);
                int spanEnd = spanned.getSpanEnd(placeholderSpan);
                int lineForOffset = this.layout.getLineForOffset(spanStart);
                boolean z2 = lineForOffset >= this.maxLines;
                boolean z3 = this.layout.getLineEllipsisCount(lineForOffset) > 0 && spanEnd > this.layout.getLineEllipsisOffset(lineForOffset);
                boolean z4 = spanEnd > this.layout.getLineEnd(lineForOffset);
                if (z3 || z4 || z2) {
                    rect = null;
                } else {
                    int i2 = androidx.compose.ui.text.AndroidParagraph.WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                    if (i2 == 1) {
                        horizontalPosition = getHorizontalPosition(spanStart, true);
                    } else {
                        if (i2 != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                    }
                    float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                    androidx.compose.ui.text.android.TextLayout textLayout = this.layout;
                    switch (placeholderSpan.getVerticalAlign()) {
                        case 0:
                            lineBaseline = textLayout.getLineBaseline(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new androidx.compose.ui.geometry.Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 1:
                            lineTop = textLayout.getLineTop(lineForOffset);
                            rect = new androidx.compose.ui.geometry.Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 2:
                            lineBaseline = textLayout.getLineBottom(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new androidx.compose.ui.geometry.Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 3:
                            lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                            rect = new androidx.compose.ui.geometry.Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 4:
                            f = placeholderSpan.getFontMetrics().ascent;
                            lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                            lineTop = f + lineBaseline2;
                            rect = new androidx.compose.ui.geometry.Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 5:
                            lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                            rect = new androidx.compose.ui.geometry.Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 6:
                            android.graphics.Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                            f = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                            lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                            lineTop = f + lineBaseline2;
                            rect = new androidx.compose.ui.geometry.Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        default:
                            throw new java.lang.IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList2.add(rect);
            }
            arrayList = arrayList2;
        } else {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        this.placeholderRects = arrayList;
        this.wordBoundary = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.ui.text.android.selection.WordBoundary>() { // from class: androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.text.android.selection.WordBoundary invoke() {
                androidx.compose.ui.text.android.TextLayout textLayout2;
                java.util.Locale textLocale$ui_text_release = androidx.compose.ui.text.AndroidParagraph.this.getTextLocale$ui_text_release();
                textLayout2 = androidx.compose.ui.text.AndroidParagraph.this.layout;
                return new androidx.compose.ui.text.android.selection.WordBoundary(textLocale$ui_text_release, textLayout2.getText());
            }
        });
    }

    public final androidx.compose.ui.text.platform.AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    private AndroidParagraph(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2, int i, boolean z, long j, androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.unit.Density density) {
        this(new androidx.compose.ui.text.platform.AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i, z, j, null);
    }

    /* renamed from: getCharSequence$ui_text_release, reason: from getter */
    public final java.lang.CharSequence getCharSequence() {
        return this.charSequence;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final java.util.Locale getTextLocale$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint().getTextLocale();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public java.util.List<androidx.compose.ui.geometry.Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final androidx.compose.ui.text.platform.AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float vertical) {
        return this.layout.getLineForVertical((int) vertical);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo3812getOffsetForPositionk4lQ0M(long position) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) androidx.compose.ui.geometry.Offset.m1872getYimpl(position)), androidx.compose.ui.geometry.Offset.m1871getXimpl(position));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public androidx.compose.ui.geometry.Rect getBoundingBox(int offset) {
        if (offset < 0 || offset >= this.charSequence.length()) {
            throw new java.lang.IllegalArgumentException(("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ')').toString());
        }
        android.graphics.RectF boundingBox = this.layout.getBoundingBox(offset);
        return new androidx.compose.ui.geometry.Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo3810fillBoundingBoxes8ffj60Q(long range, float[] array, int arrayStart) {
        this.layout.fillBoundingBoxes(androidx.compose.ui.text.TextRange.m3962getMinimpl(range), androidx.compose.ui.text.TextRange.m3961getMaximpl(range), array, arrayStart);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public androidx.compose.ui.graphics.Path getPathForRange(int start, int end) {
        if (start < 0 || start > end || end > this.charSequence.length()) {
            throw new java.lang.IllegalArgumentException(("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!").toString());
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(start, end, path);
        return androidx.compose.ui.graphics.AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public androidx.compose.ui.geometry.Rect getCursorRect(int offset) {
        if (offset < 0 || offset > this.charSequence.length()) {
            throw new java.lang.IllegalArgumentException(("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST).toString());
        }
        float primaryHorizontal$default = androidx.compose.ui.text.android.TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(offset);
        return new androidx.compose.ui.geometry.Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    private final androidx.compose.ui.text.android.selection.WordBoundary getWordBoundary() {
        return (androidx.compose.ui.text.android.selection.WordBoundary) this.wordBoundary.getValue();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo3813getWordBoundaryjx7JFs(int offset) {
        return androidx.compose.ui.text.TextRangeKt.TextRange(getWordBoundary().getWordStart(offset), getWordBoundary().getWordEnd(offset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int lineIndex) {
        return this.layout.getLineTop(lineIndex);
    }

    public final float getLineAscent$ui_text_release(int lineIndex) {
        return this.layout.getLineAscent(lineIndex);
    }

    public final float getLineBaseline$ui_text_release(int lineIndex) {
        return this.layout.getLineBaseline(lineIndex);
    }

    public final float getLineDescent$ui_text_release(int lineIndex) {
        return this.layout.getLineDescent(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int lineIndex) {
        return this.layout.getLineBottom(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int lineIndex) {
        return this.layout.getLineHeight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int lineIndex, boolean visibleEnd) {
        if (visibleEnd) {
            return this.layout.getLineVisibleEnd(lineIndex);
        }
        return this.layout.getLineEnd(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int lineIndex) {
        return this.layout.isLineEllipsized(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        if (usePrimaryDirection) {
            return androidx.compose.ui.text.android.TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        }
        return androidx.compose.ui.text.android.TextLayout.getSecondaryHorizontal$default(this.layout, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public androidx.compose.ui.text.style.ResolvedTextDirection getParagraphDirection(int offset) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(offset)) == 1 ? androidx.compose.ui.text.style.ResolvedTextDirection.Ltr : androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public androidx.compose.ui.text.style.ResolvedTextDirection getBidiRunDirection(int offset) {
        if (this.layout.isRtlCharAt(offset)) {
            return androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
        }
        return androidx.compose.ui.text.style.ResolvedTextDirection.Ltr;
    }

    private final androidx.compose.ui.text.platform.style.ShaderBrushSpan[] getShaderBrushSpans(androidx.compose.ui.text.android.TextLayout textLayout) {
        if (textLayout.getText() instanceof android.text.Spanned) {
            java.lang.CharSequence text = textLayout.getText();
            kotlin.jvm.internal.Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
            androidx.compose.ui.text.platform.style.ShaderBrushSpan[] shaderBrushSpanArr = (androidx.compose.ui.text.platform.style.ShaderBrushSpan[]) ((android.text.Spanned) text).getSpans(0, textLayout.getText().length(), androidx.compose.ui.text.platform.style.ShaderBrushSpan.class);
            return shaderBrushSpanArr.length == 0 ? new androidx.compose.ui.text.platform.style.ShaderBrushSpan[0] : shaderBrushSpanArr;
        }
        return new androidx.compose.ui.text.platform.style.ShaderBrushSpan[0];
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo3815paintRPmYEkk(androidx.compose.ui.graphics.Canvas canvas, long color, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration) {
        androidx.compose.ui.text.platform.AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4225setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public void mo3814paintLG529CI(androidx.compose.ui.graphics.Canvas canvas, long color, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int blendMode) {
        int m4222getBlendMode0nO6VwU = getTextPaint$ui_text_release().m4222getBlendMode0nO6VwU();
        androidx.compose.ui.text.platform.AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4225setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m4223setBlendModes9anfk8(blendMode);
        paint(canvas);
        getTextPaint$ui_text_release().m4223setBlendModes9anfk8(m4222getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo3816painthn5TExg(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Brush brush, float alpha, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int blendMode) {
        int m4222getBlendMode0nO6VwU = getTextPaint$ui_text_release().m4222getBlendMode0nO6VwU();
        androidx.compose.ui.text.platform.AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4224setBrush12SF9DM(brush, androidx.compose.ui.geometry.SizeKt.Size(getWidth(), getHeight()), alpha);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m4223setBlendModes9anfk8(blendMode);
        paint(canvas);
        getTextPaint$ui_text_release().m4223setBlendModes9anfk8(m4222getBlendMode0nO6VwU);
    }

    private final void paint(androidx.compose.ui.graphics.Canvas canvas) {
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    private final androidx.compose.ui.text.android.TextLayout constructTextLayout(int alignment, int justificationMode, android.text.TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle) {
        java.lang.CharSequence charSequence = this.charSequence;
        float width = getWidth();
        androidx.compose.ui.text.platform.AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        return new androidx.compose.ui.text.android.TextLayout(charSequence, width, textPaint$ui_text_release, alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }
}
