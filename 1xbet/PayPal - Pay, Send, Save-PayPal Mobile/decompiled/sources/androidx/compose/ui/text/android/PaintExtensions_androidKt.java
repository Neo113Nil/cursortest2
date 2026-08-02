package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0010\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0015\u001a\u00020\n*\u00020\r2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroid/text/TextPaint;", "", "text", "", "startInclusive", "endExclusive", "Landroid/graphics/Rect;", "getCharSequenceBounds", "(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;", "p0", "", "getHighSpeedVideoSizes", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroid/graphics/Paint;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "getStringBounds", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;", "p1", "p2", "p3", "getHighSpeedVideoFpsRanges", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaintExtensions_androidKt {
    public static final android.graphics.Rect getCharSequenceBounds(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (androidx.compose.ui.text.android.SpannedExtensions_androidKt.hasSpan(spanned, android.text.style.MetricAffectingSpan.class, i, i2)) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    getHighSpeedVideoFpsRanges(textPaint2, charSequence, i, nextSpanTransition, rect2);
                    getHighSpeedVideoSizes(rect, rect2);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        return getStringBounds(textPaint, charSequence, i, i2);
    }

    private static final void getHighSpeedVideoSizes(android.graphics.Rect rect, android.graphics.Rect rect2) {
        rect.right += rect2.width();
        rect.top = java.lang.Math.min(rect.top, rect2.top);
        rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
    }

    public static final android.graphics.Rect getStringBounds(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2) {
        android.graphics.Rect rect = new android.graphics.Rect();
        getHighSpeedVideoFpsRanges(paint, charSequence, i, i2, rect);
        return rect;
    }

    private static final void getHighSpeedVideoFpsRanges(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.text.android.Paint29.getHighSpeedVideoSizes(paint, charSequence, i, i2, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
        }
    }
}
