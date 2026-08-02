package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b)\u0010!J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b*\u0010!J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010!J\u0015\u0010,\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010!J\u0015\u0010-\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b/\u0010.J\u0015\u00100\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b0\u0010.J\u0015\u00101\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b3\u0010.J\u0015\u00104\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b4\u0010.J\u0015\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u0010.J\u001d\u00108\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0004¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\u000f¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\u000f¢\u0006\u0004\b>\u0010=J\u0015\u0010?\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b¢\u0006\u0004\b?\u0010.J\u0015\u0010@\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\b¢\u0006\u0004\b@\u00102J\u0015\u0010A\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\bA\u0010.J%\u0010G\u001a\u00020F2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bG\u0010HJ9\u0010N\u001a\u0004\u0018\u00010\u00182\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\b2\u0018\u0010M\u001a\u0014\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u000f0L¢\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020F2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010Q\u001a\u00020PH\u0000¢\u0006\u0004\bR\u0010SJ-\u0010W\u001a\u00020F2\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\b2\u0006\u0010Q\u001a\u00020P2\u0006\u0010V\u001a\u00020\b¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\u00020I2\u0006\u0010:\u001a\u00020\b¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020F2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u000fH\u0000¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010a\u001a\u0004\bb\u0010cR\u0016\u0010e\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010dR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010f\u001a\u0004\bg\u0010`R\u001a\u0010\u0011\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010f\u001a\u0004\bh\u0010`R\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\bj\u0010kR\u0011\u0010n\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0011\u0010p\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bo\u0010mR\u001a\u0010q\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010f\u001a\u0004\br\u0010`R\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0011\u0010y\u001a\u00020s8G¢\u0006\u0006\u001a\u0004\bw\u0010xR\u001e\u0010{\u001a\u00020z8\u0007¢\u0006\u0013\n\u0004\b{\u0010|\u0012\u0005\b\u007f\u0010\u0080\u0001\u001a\u0004\b}\u0010~R\u001f\u0010\u0081\u0001\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\u0085\u0001\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0082\u0001\u0012\u0006\b\u0087\u0001\u0010\u0080\u0001\u001a\u0006\b\u0086\u0001\u0010\u0084\u0001R'\u0010\u0088\u0001\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u0012\u0006\b\u008a\u0001\u0010\u0080\u0001\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u0014\u0010 \u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bv\u0010fR\u001a\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\u008e\u0001\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\be\u0010\u0082\u0001R!\u0010\u0096\u0001\u001a\f\u0012\u0005\u0012\u00030\u0094\u0001\u0018\u00010\u0093\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0095\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u0097\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0098\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u009a\u0001R\u0017\u0010\u009c\u0001\u001a\u00030\u0099\u00018CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bt\u0010\u009b\u0001R\u0014\u0010\u009f\u0001\u001a\u00020\u00028G¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0014\u0010¡\u0001\u001a\u00020\b8G¢\u0006\b\u001a\u0006\b \u0001\u0010\u0084\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "p0", "getHighSpeedVideoFpsRanges", "(I)F", "lineIndex", "getLineLeft", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "getLineEnd", "getLineVisibleEnd", "isLineEllipsized", "(I)Z", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", "(IF)I", "offset", "upstream", "getPrimaryHorizontal", "(IZ)F", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroid/graphics/Path;", "dest", "", "getSelectionPath", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "getRangeForRect", "(Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "", "array", "fillLineHorizontalBounds$ui_text", "(I[F)V", "startOffset", "endOffset", "arrayStart", "fillBoundingBoxes", "(II[FI)V", "getBoundingBox", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "paint", "(Landroid/graphics/Canvas;)V", "isFallbackLinespacingApplied$ui_text", "()Z", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "Landroid/text/TextUtils$TruncateAt;", "getHighSpeedVideoSizes", "Z", "getIncludePadding", "getFallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "didExceedMaxLines", "getDidExceedMaxLines", "Landroidx/compose/ui/text/android/selection/WordIterator;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/android/selection/WordIterator;", "getHighSpeedVideoFpsRangesFor", "getWordIterator", "()Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "Landroid/text/Layout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", com.visa.cbp.getEncExpo.warmup, "getLineCount", "()I", "topPadding", "getTopPadding$ui_text", "getTopPadding$ui_text$annotations", "bottomPadding", "getBottomPadding$ui_text", "getBottomPadding$ui_text$annotations", "getInputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Landroid/graphics/Paint$FontMetricsInt;", "getInputFormats", "Landroid/graphics/Paint$FontMetricsInt;", "getOutputMinFrameDuration", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "getHighSpeedVideoSizesFor", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/android/LayoutHelper;", "Landroidx/compose/ui/text/android/LayoutHelper;", "()Landroidx/compose/ui/text/android/LayoutHelper;", "getOutputSizeshNQ4ISI", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextLayout {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.text.android.selection.WordIterator getHighSpeedVideoFpsRangesFor;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.text.android.LayoutHelper getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.text.TextUtils.TruncateAt getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final android.graphics.Rect getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final android.graphics.Paint.FontMetricsInt getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.ui.text.android.style.LineHeightStyleSpan[] getHighSpeedVideoSizesFor;
    private final boolean includePadding;
    private final android.text.Layout layout;
    private final androidx.compose.ui.text.android.LayoutIntrinsics layoutIntrinsics;
    private final int lineCount;
    private final android.text.TextPaint textPaint;
    private final int topPadding;

    public static /* synthetic */ void getBottomPadding$ui_text$annotations() {
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ void getTopPadding$ui_text$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    public TextLayout(java.lang.CharSequence charSequence, float f, android.text.TextPaint textPaint, int i, android.text.TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, androidx.compose.ui.text.android.LayoutIntrinsics layoutIntrinsics) {
        boolean z3;
        boolean z4;
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.StaticLayout create;
        androidx.compose.ui.text.android.style.LineHeightStyleSpan[] highSpeedVideoFpsRangesFor;
        boolean z5;
        long Camera2StreamConfigurationMap;
        long VerticalPaddings;
        android.graphics.Paint.FontMetricsInt Camera2StreamConfigurationMap2;
        androidx.compose.ui.text.android.style.LineHeightStyleSpan lineHeightStyleSpan;
        androidx.compose.ui.text.android.style.LineHeightStyleSpan lineHeightStyleSpan2;
        this.textPaint = textPaint;
        this.getHighSpeedVideoSizes = truncateAt;
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics;
        this.getInputFormats = new android.graphics.Rect();
        int length = charSequence.length();
        android.text.TextDirectionHeuristic textDirectionHeuristic2 = androidx.compose.ui.text.android.TextLayout_androidKt.getTextDirectionHeuristic(i2);
        android.text.Layout.Alignment alignment = androidx.compose.ui.text.android.TextAlignmentAdapter.INSTANCE.get(i);
        boolean z6 = (charSequence instanceof android.text.Spanned) && ((android.text.Spanned) charSequence).nextSpanTransition(-1, length, androidx.compose.ui.text.android.style.BaselineShiftSpan.class) < length;
        android.os.Trace.beginSection("TextLayout:initLayout");
        try {
            android.text.BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d = f;
            int ceil = (int) java.lang.Math.ceil(d);
            if (boringMetrics != null && layoutIntrinsics.getMaxIntrinsicWidth() <= f && !z6) {
                this.getHighSpeedVideoFpsRanges = true;
                z3 = true;
                create = androidx.compose.ui.text.android.BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z, z2, truncateAt, ceil);
                textDirectionHeuristic = textDirectionHeuristic2;
                z4 = false;
            } else {
                z3 = true;
                this.getHighSpeedVideoFpsRanges = false;
                z4 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                create = androidx.compose.ui.text.android.StaticLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, 0, charSequence.length(), textDirectionHeuristic2, alignment, i3, truncateAt, (int) java.lang.Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            }
            this.layout = create;
            android.os.Trace.endSection();
            int min = java.lang.Math.min(create.getLineCount(), i3);
            this.lineCount = min;
            int i9 = min - 1;
            this.didExceedMaxLines = (min >= i3 && (create.getEllipsisCount(i9) > 0 || create.getLineEnd(i9) != charSequence.length())) ? z3 : z4;
            highSpeedVideoFpsRangesFor = androidx.compose.ui.text.android.TextLayout_androidKt.getHighSpeedVideoFpsRangesFor(this);
            this.getHighSpeedVideoSizesFor = highSpeedVideoFpsRangesFor;
            if (highSpeedVideoFpsRangesFor == null || (lineHeightStyleSpan2 = (androidx.compose.ui.text.android.style.LineHeightStyleSpan) kotlin.collections.ArraysKt.firstOrNull(highSpeedVideoFpsRangesFor)) == null) {
                z5 = z4;
            } else {
                z5 = (lineHeightStyleSpan2.getTrimFirstLineTop() && androidx.compose.ui.text.style.LineHeightStyle.Mode.m8416equalsimpl0(lineHeightStyleSpan2.getMode(), androidx.compose.ui.text.style.LineHeightStyle.Mode.INSTANCE.m8422getTightlzQqcRY())) ? z3 : z4;
            }
            boolean z7 = (highSpeedVideoFpsRangesFor == null || (lineHeightStyleSpan = (androidx.compose.ui.text.android.style.LineHeightStyleSpan) kotlin.collections.ArraysKt.firstOrNull(highSpeedVideoFpsRangesFor)) == null || !lineHeightStyleSpan.getTrimLastLineBottom() || !androidx.compose.ui.text.style.LineHeightStyle.Mode.m8416equalsimpl0(lineHeightStyleSpan.getMode(), androidx.compose.ui.text.style.LineHeightStyle.Mode.INSTANCE.m8422getTightlzQqcRY())) ? z4 : z3;
            if (!z5 || !z7) {
                Camera2StreamConfigurationMap = androidx.compose.ui.text.android.TextLayout_androidKt.Camera2StreamConfigurationMap(this);
                VerticalPaddings = androidx.compose.ui.text.android.TextLayout_androidKt.VerticalPaddings(z5 ? z4 : androidx.compose.ui.text.android.VerticalPaddings.m8092getTopPaddingimpl(Camera2StreamConfigurationMap), z7 ? z4 : androidx.compose.ui.text.android.VerticalPaddings.m8091getBottomPaddingimpl(Camera2StreamConfigurationMap));
            } else {
                VerticalPaddings = androidx.compose.ui.text.android.TextLayout_androidKt.Camera2StreamConfigurationMap;
            }
            long highResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor != null ? androidx.compose.ui.text.android.TextLayout_androidKt.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor) : androidx.compose.ui.text.android.TextLayout_androidKt.Camera2StreamConfigurationMap;
            this.topPadding = java.lang.Math.max(androidx.compose.ui.text.android.VerticalPaddings.m8092getTopPaddingimpl(VerticalPaddings), androidx.compose.ui.text.android.VerticalPaddings.m8092getTopPaddingimpl(highResolutionOutputSizeshNQ4ISI));
            this.bottomPadding = java.lang.Math.max(androidx.compose.ui.text.android.VerticalPaddings.m8091getBottomPaddingimpl(VerticalPaddings), androidx.compose.ui.text.android.VerticalPaddings.m8091getBottomPaddingimpl(highResolutionOutputSizeshNQ4ISI));
            Camera2StreamConfigurationMap2 = androidx.compose.ui.text.android.TextLayout_androidKt.Camera2StreamConfigurationMap(this, textPaint, textDirectionHeuristic, highSpeedVideoFpsRangesFor);
            this.getOutputFormats = Camera2StreamConfigurationMap2 != null ? Camera2StreamConfigurationMap2.bottom - ((int) getLineHeight(i9)) : z4;
            this.getOutputMinFrameDuration = Camera2StreamConfigurationMap2;
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(create, i9, null, 2, null);
            this.Camera2StreamConfigurationMap = androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(create, i9, null, 2, null);
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    public final android.text.TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final androidx.compose.ui.text.android.LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence charSequence, float f, android.text.TextPaint textPaint, int i, android.text.TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, androidx.compose.ui.text.android.LayoutIntrinsics layoutIntrinsics, int i9, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, f, textPaint, r7, r8, r9, (i9 & 64) != 0 ? 1.0f : f2, (i9 & 128) != 0 ? 0.0f : f3, (i9 & 256) != 0 ? false : z, (i9 & 512) != 0 ? true : z2, (i9 & 1024) != 0 ? Integer.MAX_VALUE : i3, (i9 & 2048) != 0 ? 0 : i4, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (32768 & i9) != 0 ? 0 : i8, (65536 & i9) != 0 ? null : iArr, (131072 & i9) != 0 ? null : iArr2, (i9 & 262144) != 0 ? new androidx.compose.ui.text.android.LayoutIntrinsics(charSequence, textPaint, r9) : layoutIntrinsics);
        int i10 = (i9 & 8) != 0 ? 0 : i;
        android.text.TextUtils.TruncateAt truncateAt2 = (i9 & 16) != 0 ? null : truncateAt;
        int i11 = (i9 & 32) != 0 ? 2 : i2;
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final androidx.compose.ui.text.android.selection.WordIterator getWordIterator() {
        androidx.compose.ui.text.android.selection.WordIterator wordIterator = this.getHighSpeedVideoFpsRangesFor;
        if (wordIterator != null) {
            return wordIterator;
        }
        androidx.compose.ui.text.android.selection.WordIterator wordIterator2 = new androidx.compose.ui.text.android.selection.WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.getHighSpeedVideoFpsRangesFor = wordIterator2;
        return wordIterator2;
    }

    public final android.text.Layout getLayout() {
        return this.layout;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    /* renamed from: getTopPadding$ui_text, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: getBottomPadding$ui_text, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    private final androidx.compose.ui.text.android.LayoutHelper Camera2StreamConfigurationMap() {
        androidx.compose.ui.text.android.LayoutHelper layoutHelper = this.getInputSizeshNQ4ISI;
        if (layoutHelper == null) {
            androidx.compose.ui.text.android.LayoutHelper layoutHelper2 = new androidx.compose.ui.text.android.LayoutHelper(this.layout);
            this.getInputSizeshNQ4ISI = layoutHelper2;
            return layoutHelper2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutHelper);
        return layoutHelper;
    }

    public final java.lang.CharSequence getText() {
        return this.layout.getText();
    }

    public final int getHeight() {
        int height;
        if (this.didExceedMaxLines) {
            height = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            height = this.layout.getHeight();
        }
        return height + this.topPadding + this.bottomPadding + this.getOutputFormats;
    }

    private final float getHighSpeedVideoFpsRanges(int p0) {
        if (p0 == this.lineCount - 1) {
            return this.getHighResolutionOutputSizeshNQ4ISI + this.Camera2StreamConfigurationMap;
        }
        return 0.0f;
    }

    public final float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.getHighResolutionOutputSizeshNQ4ISI : 0.0f);
    }

    public final float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.Camera2StreamConfigurationMap : 0.0f);
    }

    public final float getLineTop(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final float getLineBottom(int line) {
        if (line != this.lineCount - 1 || this.getOutputMinFrameDuration == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.getOutputMinFrameDuration.bottom;
    }

    public final float getLineAscent(int line) {
        int lineAscent;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        if (line == this.lineCount - 1 && (fontMetricsInt = this.getOutputMinFrameDuration) != null) {
            lineAscent = fontMetricsInt.ascent;
        } else {
            lineAscent = this.layout.getLineAscent(line);
        }
        return lineAscent;
    }

    public final float getLineBaseline(int line) {
        float lineBaseline;
        float f = this.topPadding;
        if (line == this.lineCount - 1 && this.getOutputMinFrameDuration != null) {
            lineBaseline = getLineTop(line) - this.getOutputMinFrameDuration.ascent;
        } else {
            lineBaseline = this.layout.getLineBaseline(line);
        }
        return f + lineBaseline;
    }

    public final float getLineDescent(int line) {
        int lineDescent;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        if (line == this.lineCount - 1 && (fontMetricsInt = this.getOutputMinFrameDuration) != null) {
            lineDescent = fontMetricsInt.descent;
        } else {
            lineDescent = this.layout.getLineDescent(line);
        }
        return lineDescent;
    }

    public final float getLineHeight(int lineIndex) {
        return getLineBottom(lineIndex) - getLineTop(lineIndex);
    }

    public final float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        if (androidx.compose.ui.text.android.TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex) && this.getHighSpeedVideoSizes == android.text.TextUtils.TruncateAt.END) {
            return this.layout.getText().length();
        }
        return this.layout.getLineEnd(lineIndex);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        if (androidx.compose.ui.text.android.TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex) && this.getHighSpeedVideoSizes == android.text.TextUtils.TruncateAt.END) {
            return this.layout.getLineStart(lineIndex) + this.layout.getEllipsisStart(lineIndex);
        }
        return Camera2StreamConfigurationMap().getLineVisibleEnd(lineIndex);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return androidx.compose.ui.text.android.TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal + (getHighSpeedVideoFpsRanges(line) * (-1.0f)));
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(androidx.compose.ui.text.android.TextLayout textLayout, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public final float getPrimaryHorizontal(int offset, boolean upstream) {
        return Camera2StreamConfigurationMap().getHorizontalPosition(offset, true, upstream) + getHighSpeedVideoFpsRanges(getLineForOffset(offset));
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(androidx.compose.ui.text.android.TextLayout textLayout, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    public final float getSecondaryHorizontal(int offset, boolean upstream) {
        return Camera2StreamConfigurationMap().getHorizontalPosition(offset, false, upstream) + getHighSpeedVideoFpsRanges(getLineForOffset(offset));
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final void getSelectionPath(int start, int end, android.graphics.Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    public final int[] getRangeForRect(android.graphics.RectF rect, int granularity, kotlin.jvm.functions.Function2<? super android.graphics.RectF, ? super android.graphics.RectF, java.lang.Boolean> inclusionStrategy) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.compose.ui.text.android.AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text(this, rect, granularity, inclusionStrategy);
        }
        return androidx.compose.ui.text.android.TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, Camera2StreamConfigurationMap(), rect, granularity, inclusionStrategy);
    }

    public final void fillLineHorizontalBounds$ui_text(int lineIndex, float[] array) {
        boolean z;
        int i;
        float highSpeedVideoFpsRangesFor;
        float highSpeedVideoFpsRangesFor2;
        int lineStart = getLineStart(lineIndex);
        int lineEnd = getLineEnd(lineIndex);
        if (array.length < (lineEnd - lineStart) * 2) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        androidx.compose.ui.text.android.HorizontalPositionCache horizontalPositionCache = new androidx.compose.ui.text.android.HorizontalPositionCache(this);
        if (getParagraphDirection(lineIndex) == 1) {
            z = true;
            i = 0;
        } else {
            z = false;
            i = 0;
        }
        while (lineStart < lineEnd) {
            boolean isRtlCharAt = isRtlCharAt(lineStart);
            if (z && !isRtlCharAt) {
                highSpeedVideoFpsRangesFor = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(lineStart, false, false, true);
                highSpeedVideoFpsRangesFor2 = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(lineStart + 1, true, true, true);
            } else if (z && isRtlCharAt) {
                highSpeedVideoFpsRangesFor2 = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(lineStart, false, false, false);
                highSpeedVideoFpsRangesFor = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(lineStart + 1, true, true, false);
            } else if (isRtlCharAt) {
                highSpeedVideoFpsRangesFor2 = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(lineStart, false, false, true);
                highSpeedVideoFpsRangesFor = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(lineStart + 1, true, true, true);
            } else {
                highSpeedVideoFpsRangesFor = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(lineStart, false, false, false);
                highSpeedVideoFpsRangesFor2 = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(lineStart + 1, true, true, false);
            }
            array[i] = highSpeedVideoFpsRangesFor;
            array[i + 1] = highSpeedVideoFpsRangesFor2;
            i += 2;
            lineStart++;
        }
    }

    public final void fillBoundingBoxes(int startOffset, int endOffset, float[] array, int arrayStart) {
        float highSpeedVideoFpsRangesFor;
        float highSpeedVideoFpsRangesFor2;
        androidx.compose.ui.text.android.TextLayout textLayout = this;
        int length = getText().length();
        if (startOffset < 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
        }
        if (startOffset >= length) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
        }
        if (endOffset <= startOffset) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (endOffset > length) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (array.length - arrayStart < (endOffset - startOffset) * 4) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(startOffset);
        int lineForOffset2 = textLayout.getLineForOffset(endOffset - 1);
        androidx.compose.ui.text.android.HorizontalPositionCache horizontalPositionCache = new androidx.compose.ui.text.android.HorizontalPositionCache(textLayout);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i = lineForOffset;
        int i2 = arrayStart;
        while (true) {
            int lineStart = textLayout.getLineStart(i);
            int lineEnd = textLayout.getLineEnd(i);
            int max = java.lang.Math.max(startOffset, lineStart);
            int min = java.lang.Math.min(endOffset, lineEnd);
            float lineTop = textLayout.getLineTop(i);
            float lineBottom = textLayout.getLineBottom(i);
            boolean z = false;
            boolean z2 = textLayout.getParagraphDirection(i) == 1;
            while (max < min) {
                boolean isRtlCharAt = textLayout.isRtlCharAt(max);
                if (z2 && !isRtlCharAt) {
                    highSpeedVideoFpsRangesFor = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(max, z, z, true);
                    highSpeedVideoFpsRangesFor2 = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(max + 1, true, true, true);
                    z = false;
                } else if (z2 && isRtlCharAt) {
                    z = false;
                    float highSpeedVideoFpsRangesFor3 = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(max, false, false, false);
                    highSpeedVideoFpsRangesFor = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(max + 1, true, true, false);
                    highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor3;
                } else {
                    z = false;
                    if (!z2 && isRtlCharAt) {
                        highSpeedVideoFpsRangesFor2 = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(max, false, false, true);
                        highSpeedVideoFpsRangesFor = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(max + 1, true, true, true);
                    } else {
                        highSpeedVideoFpsRangesFor = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(max, false, false, false);
                        highSpeedVideoFpsRangesFor2 = horizontalPositionCache.getHighSpeedVideoFpsRangesFor(max + 1, true, true, false);
                    }
                }
                array[i2] = highSpeedVideoFpsRangesFor;
                array[i2 + 1] = lineTop;
                array[i2 + 2] = highSpeedVideoFpsRangesFor2;
                array[i2 + 3] = lineBottom;
                i2 += 4;
                max++;
                textLayout = this;
            }
            if (i == lineForOffset2) {
                return;
            }
            i++;
            textLayout = this;
        }
    }

    public final android.graphics.RectF getBoundingBox(int offset) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(offset);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z = getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(offset, false);
                primaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            } else if (isRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(offset, false);
                primaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(offset, false);
                secondaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(offset, false);
            secondaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
        }
        return new android.graphics.RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final void paint(android.graphics.Canvas canvas) {
        if (canvas.getClipBounds(this.getInputFormats)) {
            int i = this.topPadding;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            java.lang.ThreadLocal<androidx.compose.ui.text.android.TextAndroidCanvas> sharedTextAndroidCanvas = androidx.compose.ui.text.android.TextLayout_androidKt.getSharedTextAndroidCanvas();
            androidx.compose.ui.text.android.TextAndroidCanvas textAndroidCanvas = sharedTextAndroidCanvas.get();
            if (textAndroidCanvas == null) {
                textAndroidCanvas = new androidx.compose.ui.text.android.TextAndroidCanvas();
                sharedTextAndroidCanvas.set(textAndroidCanvas);
            }
            androidx.compose.ui.text.android.TextAndroidCanvas textAndroidCanvas2 = textAndroidCanvas;
            textAndroidCanvas2.set_nativeCanvas$ui_text(canvas);
            try {
                this.layout.draw(textAndroidCanvas2);
                textAndroidCanvas2.set_nativeCanvas$ui_text(null);
                int i2 = this.topPadding;
                if (i2 != 0) {
                    canvas.translate(0.0f, i2 * (-1.0f));
                }
            } catch (java.lang.Throwable th) {
                textAndroidCanvas2.set_nativeCanvas$ui_text(null);
                throw th;
            }
        }
    }

    public final boolean isFallbackLinespacingApplied$ui_text() {
        if (this.getHighSpeedVideoFpsRanges) {
            androidx.compose.ui.text.android.BoringLayoutFactory boringLayoutFactory = androidx.compose.ui.text.android.BoringLayoutFactory.INSTANCE;
            android.text.Layout layout = this.layout;
            kotlin.jvm.internal.Intrinsics.checkNotNull(layout, "");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((android.text.BoringLayout) layout);
        }
        androidx.compose.ui.text.android.StaticLayoutFactory staticLayoutFactory = androidx.compose.ui.text.android.StaticLayoutFactory.INSTANCE;
        android.text.Layout layout2 = this.layout;
        kotlin.jvm.internal.Intrinsics.checkNotNull(layout2, "");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((android.text.StaticLayout) layout2, this.fallbackLineSpacing);
    }
}
