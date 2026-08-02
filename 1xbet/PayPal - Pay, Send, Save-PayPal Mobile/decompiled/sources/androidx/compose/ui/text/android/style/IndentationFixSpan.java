package androidx.compose.ui.text.android.style;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJw\u0010\u001a\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/text/android/style/IndentationFixSpan;", "Landroid/text/style/LeadingMarginSpan;", "<init>", "()V", "", "firstLine", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "baseline", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "", "text", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "first", "Landroid/text/Layout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IndentationFixSpan implements android.text.style.LeadingMarginSpan {
    public static final int $stable = 0;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean firstLine) {
        return 0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int left, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(start)) != layout.getLineCount() - 1 || !androidx.compose.ui.text.android.TextLayout_androidKt.isLineEllipsized(layout, lineForOffset)) {
            return;
        }
        float ellipsizedLeftPadding = androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt.getEllipsizedLeftPadding(layout, lineForOffset, paint) + androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt.getEllipsizedRightPadding(layout, lineForOffset, paint);
        if (ellipsizedLeftPadding == 0.0f) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(canvas);
        canvas.translate(ellipsizedLeftPadding, 0.0f);
    }
}
