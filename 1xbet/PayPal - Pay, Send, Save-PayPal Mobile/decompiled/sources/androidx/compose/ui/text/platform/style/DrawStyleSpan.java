package androidx.compose.ui.text.platform.style;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/platform/style/DrawStyleSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DrawStyleSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public static final int $stable = 8;
    private final androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle;

    public DrawStyleSpan(androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    public final androidx.compose.ui.graphics.drawscope.DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        if (textPaint != null) {
            androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle = this.drawStyle;
            if (kotlin.jvm.internal.Intrinsics.areEqual(drawStyle, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE)) {
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                return;
            }
            if (!(drawStyle instanceof androidx.compose.ui.graphics.drawscope.Stroke)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            textPaint.setStyle(android.graphics.Paint.Style.STROKE);
            textPaint.setStrokeWidth(((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getWidth());
            textPaint.setStrokeMiter(((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getMiter());
            textPaint.setStrokeJoin(androidx.compose.ui.text.platform.style.DrawStyleSpan_androidKt.m8306toAndroidJoinWw9F2mQ(((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getJoin()));
            textPaint.setStrokeCap(androidx.compose.ui.text.platform.style.DrawStyleSpan_androidKt.m8305toAndroidCapBeK7IIE(((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getCap()));
            androidx.compose.ui.graphics.PathEffect pathEffect = ((androidx.compose.ui.graphics.drawscope.Stroke) this.drawStyle).getPathEffect();
            textPaint.setPathEffect(pathEffect != null ? androidx.compose.ui.graphics.AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
        }
    }
}
