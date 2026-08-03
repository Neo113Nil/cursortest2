package androidx.compose.ui.text;

/* compiled from: TextPainter.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextPainter {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.TextPainter INSTANCE = new androidx.compose.ui.text.TextPainter();

    private TextPainter() {
    }

    public final void paint(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        long m2139getBlack0d7_KjU;
        boolean z = textLayoutResult.getHasVisualOverflow() && !androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4411getVisiblegIe3tQ8());
        if (z) {
            androidx.compose.ui.geometry.Rect m1911Recttz77jQw = androidx.compose.ui.geometry.RectKt.m1911Recttz77jQw(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(textLayoutResult.getSize()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(textLayoutResult.getSize())));
            canvas.save();
            androidx.compose.ui.graphics.Canvas.CC.m2087clipRectmtrdDE$default(canvas, m1911Recttz77jQw, 0, 2, null);
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
            if (brush == null) {
                if (spanStyle.getTextForegroundStyle() != androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE) {
                    m2139getBlack0d7_KjU = spanStyle.getTextForegroundStyle().mo4258getColor0d7_KjU();
                } else {
                    m2139getBlack0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU();
                }
                textLayoutResult.getMultiParagraph().m3843paintLG529CI(canvas, (r14 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : m2139getBlack0d7_KjU, (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : 0);
            } else {
                textLayoutResult.getMultiParagraph().m3845painthn5TExg(canvas, brush, (r17 & 4) != 0 ? Float.NaN : spanStyle.getTextForegroundStyle() != androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE ? spanStyle.getTextForegroundStyle().getAlpha() : 1.0f, (r17 & 8) != 0 ? null : shadow2, (r17 & 16) != 0 ? null : textDecoration2, (r17 & 32) != 0 ? null : drawStyle2, (r17 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : 0);
            }
        } finally {
            if (z) {
                canvas.restore();
            }
        }
    }
}
