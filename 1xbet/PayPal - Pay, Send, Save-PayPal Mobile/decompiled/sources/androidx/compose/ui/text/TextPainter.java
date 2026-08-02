package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/TextLayoutResult;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextPainter {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.TextPainter INSTANCE = new androidx.compose.ui.text.TextPainter();

    private TextPainter() {
    }

    public final void paint(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        long m6022getBlack0d7_KjU;
        boolean z = textLayoutResult.getHasVisualOverflow() && !androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8());
        if (z) {
            float size = (int) (textLayoutResult.getSize() >> 32);
            androidx.compose.ui.geometry.Rect m5792Recttz77jQw = androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits((int) (textLayoutResult.getSize() & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(size) << 32)));
            canvas.save();
            androidx.compose.ui.graphics.Canvas.m5969clipRectmtrdDE$default(canvas, m5792Recttz77jQw, 0, 2, null);
        }
        androidx.compose.ui.text.SpanStyle spanStyle = textLayoutResult.getLayoutInput().getStyle().getSpanStyle();
        androidx.compose.ui.text.style.TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = androidx.compose.ui.text.style.TextDecoration.INSTANCE.getNone();
        }
        androidx.compose.ui.text.style.TextDecoration textDecoration2 = textDecoration;
        androidx.compose.ui.graphics.Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = androidx.compose.ui.graphics.Shadow.INSTANCE.getNone();
        }
        androidx.compose.ui.graphics.Shadow shadow2 = shadow;
        androidx.compose.ui.graphics.drawscope.Fill drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = androidx.compose.ui.graphics.drawscope.Fill.INSTANCE;
        }
        androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle2 = drawStyle;
        try {
            androidx.compose.ui.graphics.Brush brush = spanStyle.getBrush();
            if (brush != null) {
                textLayoutResult.getMultiParagraph().m7883painthn5TExg(canvas, brush, (r17 & 4) != 0 ? Float.NaN : spanStyle.getTextForegroundStyle() != androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE ? spanStyle.getTextForegroundStyle().getGetHighResolutionOutputSizeshNQ4ISI() : 1.0f, (r17 & 8) != 0 ? null : shadow2, (r17 & 16) != 0 ? null : textDecoration2, (r17 & 32) != 0 ? null : drawStyle2, (r17 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6533getDefaultBlendMode0nO6VwU() : 0);
            } else {
                if (spanStyle.getTextForegroundStyle() != androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE) {
                    m6022getBlack0d7_KjU = spanStyle.getTextForegroundStyle().getGetHighResolutionOutputSizeshNQ4ISI();
                } else {
                    m6022getBlack0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
                }
                textLayoutResult.getMultiParagraph().m7881paintLG529CI(canvas, (r14 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : m6022getBlack0d7_KjU, (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6533getDefaultBlendMode0nO6VwU() : 0);
            }
            if (z) {
                canvas.restore();
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                canvas.restore();
            }
            throw th;
        }
    }
}
