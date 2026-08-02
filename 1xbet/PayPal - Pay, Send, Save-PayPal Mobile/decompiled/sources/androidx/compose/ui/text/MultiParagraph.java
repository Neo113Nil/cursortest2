package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011B[\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\n\u0010\u001eB[\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010!B[\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\"B[\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010#J9\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b-\u0010.JM\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b4\u00105JU\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u00020\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b9\u0010:J\u001d\u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u000f¢\u0006\u0004\bA\u0010BJ\u0015\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ%\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bO\u0010PJ\u0015\u0010S\u001a\u00020H2\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\bS\u0010TJ%\u0010[\u001a\u00020V2\u0006\u0010U\u001a\u00020N2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u0006¢\u0006\u0004\bY\u0010ZJ\u001d\u0010]\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\f¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\u00020_2\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\u00020_2\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\bb\u0010aJ\u0015\u0010e\u001a\u00020N2\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\bc\u0010dJ\u0015\u0010f\u001a\u00020H2\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\bf\u0010TJ\u0015\u0010g\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\bl\u0010kJ\u0015\u0010m\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\bm\u0010kJ\u0015\u0010n\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\bn\u0010kJ\u0015\u0010o\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\bo\u0010kJ\u0015\u0010p\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\bp\u0010kJ\u0015\u0010q\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\bq\u0010kJ\u0015\u0010r\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\br\u0010hJ\u001f\u0010t\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u00062\b\b\u0002\u0010s\u001a\u00020\f¢\u0006\u0004\bt\u0010uJ\u0015\u0010v\u001a\u00020\f2\u0006\u0010i\u001a\u00020\u0006¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020,2\u0006\u0010x\u001a\u00020\u0006H\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00020,2\u0006\u0010x\u001a\u00020\u0006H\u0002¢\u0006\u0004\b{\u0010zJ\u0017\u0010|\u001a\u00020,2\u0006\u0010x\u001a\u00020\u0006H\u0002¢\u0006\u0004\b|\u0010zR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010}\u001a\u0004\b~\u0010\u007fR\u001d\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0007\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010y\u001a\u00020\u00128CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b{\u0010\u0083\u0001R\u0014\u0010\u0086\u0001\u001a\u00020\u000f8G¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0014\u0010\u0088\u0001\u001a\u00020\u000f8G¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001f\u0010\u0089\u0001\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001d\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0010\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u0085\u0001R\u001f\u0010\u008f\u0001\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u008d\u0001\u001a\u0006\b\u0090\u0001\u0010\u0085\u0001R\u0014\u0010\u0092\u0001\u001a\u00020\u000f8G¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0085\u0001R\u0014\u0010\u0094\u0001\u001a\u00020\u000f8G¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0085\u0001R\u001f\u0010\u0095\u0001\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0080\u0001\u001a\u0006\b\u0096\u0001\u0010\u0082\u0001R'\u0010\u0097\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u00168\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u00168\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u0098\u0001\u001a\u0006\b\u009d\u0001\u0010\u009a\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "maxLines", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "ellipsis", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "width", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "offset", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "fillBoundingBoxes", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "(I)I", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBaseline", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "p0", "getHighSpeedVideoFpsRangesFor", "(I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", com.visa.cbp.getEncExpo.warmup, "getMaxLines", "()I", "()Landroidx/compose/ui/text/AnnotatedString;", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "didExceedMaxLines", "Z", "getDidExceedMaxLines", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getWidth", "height", "getHeight", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "lineCount", "getLineCount", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "getParagraphInfoList$ui_text"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    private MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2) {
        boolean z;
        int m8553getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) != 0 || androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) != 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> infoList$ui_text = multiParagraphIntrinsics.getInfoList$ui_text();
        int size = infoList$ui_text.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        int i5 = 0;
        while (i5 < size) {
            androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text.get(i5);
            androidx.compose.ui.text.ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
            if (androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(j)) {
                m8553getMaxHeightimpl = kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) - androidx.compose.ui.text.ParagraphKt.ceilToInt(f), i3);
            } else {
                m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
            }
            androidx.compose.ui.text.Paragraph m7901ParagraphczeNHc = androidx.compose.ui.text.ParagraphKt.m7901ParagraphczeNHc(intrinsics, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, m8554getMaxWidthimpl, 0, m8553getMaxHeightimpl, 5, null), this.maxLines - i4, i2);
            float height = f + m7901ParagraphczeNHc.getHeight();
            int lineCount = i4 + m7901ParagraphczeNHc.getLineCount();
            java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> list = infoList$ui_text;
            arrayList.add(new androidx.compose.ui.text.ParagraphInfo(m7901ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i4, lineCount, f, height));
            if (m7901ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i5 != kotlin.collections.CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text()))) {
                z = true;
                i4 = lineCount;
                f = height;
                break;
            } else {
                i5++;
                i4 = lineCount;
                f = height;
                i3 = 0;
                infoList$ui_text = list;
            }
        }
        z = false;
        this.height = f;
        this.lineCount = i4;
        this.didExceedMaxLines = z;
        this.paragraphInfoList = arrayList;
        this.width = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = (androidx.compose.ui.text.ParagraphInfo) arrayList.get(i6);
            java.util.List<androidx.compose.ui.geometry.Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i7 = 0; i7 < size3; i7++) {
                java.util.ArrayList arrayList4 = arrayList3;
                androidx.compose.ui.geometry.Rect rect = placeholderRects.get(i7);
                arrayList4.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, arrayList3);
        }
        java.util.ArrayList arrayList5 = arrayList2;
        if (arrayList5.size() < this.intrinsics.getPlaceholders().size()) {
            java.util.ArrayList arrayList6 = arrayList5;
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList5.size();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayList7.add(null);
            }
            arrayList5 = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList6, (java.lang.Iterable) arrayList7);
        }
        this.placeholderRects = arrayList5;
    }

    public final androidx.compose.ui.text.MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : i2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        this(multiParagraphIntrinsics, j, i, z ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8() : androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f) {
        this(multiParagraphIntrinsics, r8, i, z ? r0.m8501getEllipsisgIe3tQ8() : r0.m8500getClipgIe3tQ8(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        long Constraints$default = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, androidx.compose.ui.text.ParagraphKt.ceilToInt(f), 0, 0, 13, null);
        androidx.compose.ui.text.style.TextOverflow.Companion companion = androidx.compose.ui.text.style.TextOverflow.INSTANCE;
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, java.util.List list, int i, boolean z, float f, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) ((i2 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list), (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, density, resourceLoader);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @kotlin.ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, boolean z, float f, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader) {
        this(r7, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, androidx.compose.ui.text.ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z ? r0.m8501getEllipsisgIe3tQ8() : r0.m8500getClipgIe3tQ8(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics = new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyle, list, density, androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        androidx.compose.ui.text.style.TextOverflow.Companion companion = androidx.compose.ui.text.style.TextOverflow.INSTANCE;
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, float f, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f, density, resolver, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) ((i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list), (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, float f, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, boolean z) {
        this(r6, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, androidx.compose.ui.text.ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z ? r8.m8501getEllipsisgIe3tQ8() : r8.m8500getClipgIe3tQ8(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics = new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        androidx.compose.ui.text.style.TextOverflow.Companion companion = androidx.compose.ui.text.style.TextOverflow.INSTANCE;
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, boolean z) {
        this(r6, j, i, z ? r0.m8501getEllipsisgIe3tQ8() : r0.m8500getClipgIe3tQ8(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics = new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        androidx.compose.ui.text.style.TextOverflow.Companion companion = androidx.compose.ui.text.style.TextOverflow.INSTANCE;
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i3 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? Integer.MAX_VALUE : i, (i3 & 128) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : i2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, int i2) {
        this(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j, i, i2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private final androidx.compose.ui.text.AnnotatedString Camera2StreamConfigurationMap() {
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

    public final java.util.List<androidx.compose.ui.text.ParagraphInfo> getParagraphInfoList$ui_text() {
        return this.paragraphInfoList;
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m7875paintRPmYEkk$default(androidx.compose.ui.text.MultiParagraph multiParagraph, androidx.compose.ui.graphics.Canvas canvas, long j, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
        }
        multiParagraph.m7882paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m7882paintRPmYEkk(androidx.compose.ui.graphics.Canvas canvas, long color, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration decoration) {
        canvas.save();
        java.util.List<androidx.compose.ui.text.ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = list.get(i);
            androidx.compose.ui.text.Paragraph.m7886paintLG529CI$default(paragraphInfo.getParagraph(), canvas, color, shadow, decoration, null, 0, 48, null);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m7881paintLG529CI(androidx.compose.ui.graphics.Canvas canvas, long color, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration decoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int blendMode) {
        canvas.save();
        java.util.List<androidx.compose.ui.text.ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = list.get(i);
            paragraphInfo.getParagraph().mo7840paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m7883painthn5TExg(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Brush brush, float alpha, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration decoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int blendMode) {
        androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt.m8283drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final androidx.compose.ui.graphics.Path getPathForRange(final int start, final int end) {
        if (start < 0 || start > end || end > Camera2StreamConfigurationMap().getText().length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Start(");
            sb.append(start);
            sb.append(") or End(");
            sb.append(end);
            sb.append(") is out of range [0..");
            sb.append(Camera2StreamConfigurationMap().getText().length());
            sb.append("), or start > end!");
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        if (start == end) {
            return androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        final androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        androidx.compose.ui.text.MultiParagraphKt.m7885findParagraphsByRangeSbBc2M(this.paragraphInfoList, androidx.compose.ui.text.TextRangeKt.TextRange(start, end), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.ui.text.MultiParagraph.getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.Path.this, start, end, (androidx.compose.ui.text.ParagraphInfo) obj);
                return highSpeedVideoFpsRanges;
            }
        });
        return Path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.Path path, int i, int i2, androidx.compose.ui.text.ParagraphInfo paragraphInfo) {
        androidx.compose.ui.graphics.Path.m6262addPathUv8p0NA$default(path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i2))), 0L, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public final int getLineForVerticalPosition(float vertical) {
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical));
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartLineIndex();
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m7878getOffsetForPositionk4lQ0M(long position) {
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByY(this.paragraphInfoList, java.lang.Float.intBitsToFloat((int) (4294967295L & position))));
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartIndex();
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo7836getOffsetForPositionk4lQ0M(paragraphInfo.m7894toLocalMKHz9U(position)));
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m7879getRangeForRect86BmAI(androidx.compose.ui.geometry.Rect rect, int granularity, androidx.compose.ui.text.TextInclusionStrategy inclusionStrategy) {
        int findParagraphByY = androidx.compose.ui.text.MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(findParagraphByY).getBottom() >= rect.getBottom() || findParagraphByY == kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList)) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByY);
            return androidx.compose.ui.text.ParagraphInfo.m7892toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo7838getRangeForRect86BmAI(paragraphInfo.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int findParagraphByY2 = androidx.compose.ui.text.MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long m8044getZerod9O1mEE = androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        while (androidx.compose.ui.text.TextRange.m8032equalsimpl0(m8044getZerod9O1mEE, androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE()) && findParagraphByY <= findParagraphByY2) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(findParagraphByY);
            m8044getZerod9O1mEE = androidx.compose.ui.text.ParagraphInfo.m7892toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo7838getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
            findParagraphByY++;
        }
        if (androidx.compose.ui.text.TextRange.m8032equalsimpl0(m8044getZerod9O1mEE, androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE())) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        }
        long m8044getZerod9O1mEE2 = androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        while (androidx.compose.ui.text.TextRange.m8032equalsimpl0(m8044getZerod9O1mEE2, androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE()) && findParagraphByY <= findParagraphByY2) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(findParagraphByY2);
            m8044getZerod9O1mEE2 = androidx.compose.ui.text.ParagraphInfo.m7892toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo7838getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
            findParagraphByY2--;
        }
        return androidx.compose.ui.text.TextRange.m8032equalsimpl0(m8044getZerod9O1mEE2, androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE()) ? m8044getZerod9O1mEE : androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8039getStartimpl(m8044getZerod9O1mEE), androidx.compose.ui.text.TextRange.m8034getEndimpl(m8044getZerod9O1mEE2));
    }

    public final androidx.compose.ui.geometry.Rect getBoundingBox(int offset) {
        getHighSpeedVideoFpsRangesFor(offset);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m7877fillBoundingBoxes8ffj60Q(final long range, final float[] array, int arrayStart) {
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.TextRange.m8037getMinimpl(range));
        Camera2StreamConfigurationMap(androidx.compose.ui.text.TextRange.m8036getMaximpl(range));
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = arrayStart;
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        androidx.compose.ui.text.MultiParagraphKt.m7885findParagraphsByRangeSbBc2M(this.paragraphInfoList, range, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.ui.text.MultiParagraph.getHighSpeedVideoFpsRangesFor(range, array, intRef, floatRef, (androidx.compose.ui.text.ParagraphInfo) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
        return array;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(long j, float[] fArr, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.ui.text.ParagraphInfo paragraphInfo) {
        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > androidx.compose.ui.text.TextRange.m8037getMinimpl(j) ? paragraphInfo.getStartIndex() : androidx.compose.ui.text.TextRange.m8037getMinimpl(j)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < androidx.compose.ui.text.TextRange.m8036getMaximpl(j) ? paragraphInfo.getEndIndex() : androidx.compose.ui.text.TextRange.m8036getMaximpl(j)));
        paragraphInfo.getParagraph().mo7834fillBoundingBoxes8ffj60Q(TextRange, fArr, intRef.element);
        int m8035getLengthimpl = intRef.element + (androidx.compose.ui.text.TextRange.m8035getLengthimpl(TextRange) * 4);
        for (int i = intRef.element; i < m8035getLengthimpl; i += 4) {
            int i2 = i + 1;
            fArr[i2] = fArr[i2] + floatRef.element;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + floatRef.element;
        }
        intRef.element = m8035getLengthimpl;
        floatRef.element += paragraphInfo.getParagraph().getHeight();
        return kotlin.Unit.INSTANCE;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        int findParagraphByIndex;
        Camera2StreamConfigurationMap(offset);
        if (offset == Camera2StreamConfigurationMap().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    public final androidx.compose.ui.text.style.ResolvedTextDirection getParagraphDirection(int offset) {
        int findParagraphByIndex;
        Camera2StreamConfigurationMap(offset);
        if (offset == Camera2StreamConfigurationMap().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final androidx.compose.ui.text.style.ResolvedTextDirection getBidiRunDirection(int offset) {
        int findParagraphByIndex;
        Camera2StreamConfigurationMap(offset);
        if (offset == Camera2StreamConfigurationMap().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m7880getWordBoundaryjx7JFs(int offset) {
        int findParagraphByIndex;
        Camera2StreamConfigurationMap(offset);
        if (offset == Camera2StreamConfigurationMap().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.m7893toGlobalxdX6G0(paragraphInfo.getParagraph().mo7839getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)), false);
    }

    public final androidx.compose.ui.geometry.Rect getCursorRect(int offset) {
        int findParagraphByIndex;
        Camera2StreamConfigurationMap(offset);
        if (offset == Camera2StreamConfigurationMap().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForOffset(int offset) {
        int findParagraphByIndex;
        if (offset >= Camera2StreamConfigurationMap().length()) {
            findParagraphByIndex = kotlin.collections.CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            findParagraphByIndex = offset < 0 ? 0 : androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final float getLineLeft(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineTop(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineBaseline(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineBottom(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineHeight(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineWidth(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final int getLineStart(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
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
        getHighSpeedVideoFpsRanges(lineIndex);
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(lineIndex), visibleEnd));
    }

    public final boolean isLineEllipsized(int lineIndex) {
        getHighSpeedVideoFpsRanges(lineIndex);
        return this.paragraphInfoList.get(androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex)).getParagraph().isLineEllipsized(lineIndex);
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        if (p0 < 0 || p0 >= Camera2StreamConfigurationMap().getText().length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(Camera2StreamConfigurationMap().length());
            sb.append(')');
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    private final void Camera2StreamConfigurationMap(int p0) {
        if (p0 < 0 || p0 > Camera2StreamConfigurationMap().getText().length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(Camera2StreamConfigurationMap().length());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    private final void getHighSpeedVideoFpsRanges(int p0) {
        if (p0 < 0 || p0 >= this.lineCount) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("lineIndex(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(this.lineCount);
            sb.append(')');
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, i2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) list, i, z);
    }

    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, long j, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.util.List list, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) list, i, i2);
    }
}
