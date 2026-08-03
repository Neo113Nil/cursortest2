package androidx.compose.ui.text.platform.style;

/* compiled from: DrawStyleSpan.android.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0016\u0010\f\u001a\u00020\r*\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/platform/style/DrawStyleSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "toAndroidCap", "Landroid/graphics/Paint$Cap;", "Landroidx/compose/ui/graphics/StrokeCap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidJoin", "Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/StrokeJoin;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawStyleSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public static final int $stable = 8;
    private final androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle;

    public final androidx.compose.ui.graphics.drawscope.DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public DrawStyleSpan(androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        if (textPaint != null) {
            androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle = this.drawStyle;
            if (kotlin.jvm.internal.Intrinsics.areEqual(drawStyle, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE)) {
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof androidx.compose.ui.graphics.drawscope.Stroke) {
                textPaint.setStyle(android.graphics.Paint.Style.STROKE);
                textPaint.setStrokeWidth(((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(m4241toAndroidJoinWw9F2mQ(((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getJoin()));
                textPaint.setStrokeCap(m4240toAndroidCapBeK7IIE(((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getCap()));
                androidx.compose.ui.graphics.PathEffect pathEffect = ((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? androidx.compose.ui.graphics.AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
            }
        }
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    private final android.graphics.Paint.Join m4241toAndroidJoinWw9F2mQ(int i) {
        return androidx.compose.ui.graphics.StrokeJoin.m2480equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2485getMiterLxFBmk8()) ? android.graphics.Paint.Join.MITER : androidx.compose.ui.graphics.StrokeJoin.m2480equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2486getRoundLxFBmk8()) ? android.graphics.Paint.Join.ROUND : androidx.compose.ui.graphics.StrokeJoin.m2480equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2484getBevelLxFBmk8()) ? android.graphics.Paint.Join.BEVEL : android.graphics.Paint.Join.MITER;
    }

    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    private final android.graphics.Paint.Cap m4240toAndroidCapBeK7IIE(int i) {
        return androidx.compose.ui.graphics.StrokeCap.m2470equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw()) ? android.graphics.Paint.Cap.BUTT : androidx.compose.ui.graphics.StrokeCap.m2470equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2475getRoundKaPHkGw()) ? android.graphics.Paint.Cap.ROUND : androidx.compose.ui.graphics.StrokeCap.m2470equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2476getSquareKaPHkGw()) ? android.graphics.Paint.Cap.SQUARE : android.graphics.Paint.Cap.BUTT;
    }
}
