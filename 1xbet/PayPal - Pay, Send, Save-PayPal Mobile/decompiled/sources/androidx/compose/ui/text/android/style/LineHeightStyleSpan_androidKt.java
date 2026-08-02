package androidx.compose.ui.text.android.style;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Paint$FontMetricsInt;", "", "lineHeight", "(Landroid/graphics/Paint$FontMetricsInt;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LineHeightStyleSpan_androidKt {
    public static final int lineHeight(android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
