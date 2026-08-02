package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u001a[\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u001a\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0011"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawMultiParagraph-7AXcY_I", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "drawMultiParagraph", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m8283drawMultiParagraph7AXcY_I(androidx.compose.ui.text.MultiParagraph multiParagraph, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text().size() <= 1) {
            getHighSpeedVideoFpsRangesFor(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle, i);
        } else if (brush instanceof androidx.compose.ui.graphics.SolidColor) {
            getHighSpeedVideoFpsRangesFor(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle, i);
        } else {
            if (!(brush instanceof androidx.compose.ui.graphics.ShaderBrush)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.util.List<androidx.compose.ui.text.ParagraphInfo> paragraphInfoList$ui_text = multiParagraph.getParagraphInfoList$ui_text();
            int size = paragraphInfoList$ui_text.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                androidx.compose.ui.text.ParagraphInfo paragraphInfo = paragraphInfoList$ui_text.get(i2);
                f3 += paragraphInfo.getParagraph().getHeight();
                f2 = java.lang.Math.max(f2, paragraphInfo.getParagraph().getWidth());
            }
            android.graphics.Shader mo5965createShaderuvyYCjk = ((androidx.compose.ui.graphics.ShaderBrush) brush).mo5965createShaderuvyYCjk(androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L)));
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            mo5965createShaderuvyYCjk.getLocalMatrix(matrix);
            java.util.List<androidx.compose.ui.text.ParagraphInfo> paragraphInfoList$ui_text2 = multiParagraph.getParagraphInfoList$ui_text();
            int size2 = paragraphInfoList$ui_text2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                androidx.compose.ui.text.ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text2.get(i3);
                paragraphInfo2.getParagraph().mo7842painthn5TExg(canvas, androidx.compose.ui.graphics.BrushKt.ShaderBrush(mo5965createShaderuvyYCjk), f, shadow, textDecoration, drawStyle, i);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                mo5965createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.MultiParagraph multiParagraph, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i) {
        java.util.List<androidx.compose.ui.text.ParagraphInfo> paragraphInfoList$ui_text = multiParagraph.getParagraphInfoList$ui_text();
        int size = paragraphInfoList$ui_text.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = paragraphInfoList$ui_text.get(i2);
            paragraphInfo.getParagraph().mo7842painthn5TExg(canvas, brush, f, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
