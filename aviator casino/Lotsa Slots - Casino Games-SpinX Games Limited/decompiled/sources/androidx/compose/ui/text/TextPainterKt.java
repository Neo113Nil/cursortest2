package androidx.compose.ui.text;

/* compiled from: TextPainter.kt */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001af\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001ah\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0080\u0001\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aj\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020/2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a&\u00102\u001a\u000203*\u00020\u00062\u0006\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "size", "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextPainterKt {
    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m3943drawTextJFhB2K4(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.text.TextMeasurer textMeasurer, androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextStyle textStyle, int i, boolean z, int i2, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, long j2, int i3) {
        androidx.compose.ui.text.TextLayoutResult m3940measurexDpz5zY$default = androidx.compose.ui.text.TextMeasurer.m3940measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i, z, i2, list, m3951textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        androidx.compose.ui.graphics.drawscope.DrawTransform transform = drawContext.getTransform();
        transform.translate(androidx.compose.ui.geometry.Offset.m1871getXimpl(j), androidx.compose.ui.geometry.Offset.m1872getYimpl(j));
        clip(transform, m3940measurexDpz5zY$default);
        m3940measurexDpz5zY$default.getMultiParagraph().m3843paintLG529CI(drawScope.getDrawContext().getCanvas(), (r14 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : 0L, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? null : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i3);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m3947drawTextTPWCCtM(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.text.TextMeasurer textMeasurer, java.lang.String str, long j, androidx.compose.ui.text.TextStyle textStyle, int i, boolean z, int i2, long j2, int i3) {
        androidx.compose.ui.text.TextLayoutResult m3940measurexDpz5zY$default = androidx.compose.ui.text.TextMeasurer.m3940measurexDpz5zY$default(textMeasurer, new androidx.compose.ui.text.AnnotatedString(str, null, null, 6, null), textStyle, i, z, i2, null, m3951textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        androidx.compose.ui.graphics.drawscope.DrawTransform transform = drawContext.getTransform();
        transform.translate(androidx.compose.ui.geometry.Offset.m1871getXimpl(j), androidx.compose.ui.geometry.Offset.m1872getYimpl(j));
        clip(transform, m3940measurexDpz5zY$default);
        m3940measurexDpz5zY$default.getMultiParagraph().m3843paintLG529CI(drawScope.getDrawContext().getCanvas(), (r14 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : 0L, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? null : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i3);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m3949drawTextd8rzKo(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.text.TextLayoutResult textLayoutResult, long j, long j2, float f, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i) {
        androidx.compose.ui.graphics.Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        androidx.compose.ui.text.style.TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        androidx.compose.ui.graphics.drawscope.DrawTransform transform = drawContext.getTransform();
        transform.translate(androidx.compose.ui.geometry.Offset.m1871getXimpl(j2), androidx.compose.ui.geometry.Offset.m1872getYimpl(j2));
        clip(transform, textLayoutResult);
        androidx.compose.ui.graphics.Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null && j == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            textLayoutResult.getMultiParagraph().m3845painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !java.lang.Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
        } else {
            textLayoutResult.getMultiParagraph().m3843paintLG529CI(drawScope.getDrawContext().getCanvas(), androidx.compose.ui.text.style.TextDrawStyleKt.m4380modulateDxMtmZc(j != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() ? j : textLayoutResult.getLayoutInput().getStyle().m3994getColor0d7_KjU(), f), shadow2, textDecoration2, drawStyle2, i);
        }
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m3945drawTextLVfH_YU(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.graphics.Brush brush, long j, float f, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i) {
        androidx.compose.ui.graphics.Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        androidx.compose.ui.text.style.TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        androidx.compose.ui.graphics.drawscope.DrawTransform transform = drawContext.getTransform();
        transform.translate(androidx.compose.ui.geometry.Offset.m1871getXimpl(j), androidx.compose.ui.geometry.Offset.m1872getYimpl(j));
        clip(transform, textLayoutResult);
        textLayoutResult.getMultiParagraph().m3845painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !java.lang.Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    private static final void clip(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4411getVisiblegIe3tQ8())) {
            return;
        }
        androidx.compose.ui.graphics.drawscope.DrawTransform.CC.m2727clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(textLayoutResult.getSize()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(textLayoutResult.getSize()), 0, 16, null);
    }

    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m3951textLayoutConstraintsv_w8tDc(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2) {
        int roundToInt;
        int i;
        int roundToInt2;
        int i2 = 0;
        if (j == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc() || java.lang.Float.isNaN(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j))) {
            roundToInt = kotlin.math.MathKt.roundToInt((float) java.lang.Math.ceil(androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc()) - androidx.compose.ui.geometry.Offset.m1871getXimpl(j2)));
            i = 0;
        } else {
            i = kotlin.math.MathKt.roundToInt((float) java.lang.Math.ceil(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j)));
            roundToInt = i;
        }
        if (j == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc() || java.lang.Float.isNaN(androidx.compose.ui.geometry.Size.m1937getHeightimpl(j))) {
            roundToInt2 = kotlin.math.MathKt.roundToInt((float) java.lang.Math.ceil(androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawScope.mo2592getSizeNHjbRc()) - androidx.compose.ui.geometry.Offset.m1872getYimpl(j2)));
        } else {
            i2 = kotlin.math.MathKt.roundToInt((float) java.lang.Math.ceil(androidx.compose.ui.geometry.Size.m1937getHeightimpl(j)));
            roundToInt2 = i2;
        }
        return androidx.compose.ui.unit.ConstraintsKt.Constraints(i, roundToInt, i2, roundToInt2);
    }
}
