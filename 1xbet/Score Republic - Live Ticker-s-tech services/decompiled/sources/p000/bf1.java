package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bf1 extends ReplacementSpan {

    /* JADX INFO: renamed from: k */
    public final af1 f851k;

    /* JADX INFO: renamed from: n */
    public TextPaint f854n;

    /* JADX INFO: renamed from: j */
    public final Paint.FontMetricsInt f850j = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: l */
    public short f852l = -1;

    /* JADX INFO: renamed from: m */
    public float f853m = 1.0f;

    public bf1(af1 af1Var) {
        hn0.m2313g(af1Var, "rasterizer cannot be null");
        this.f851k = af1Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f854n;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f854n = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f852l, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C0595pv.m3994a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        af1 af1Var = this.f851k;
        f71 f71Var = af1Var.f175b;
        Typeface typeface = (Typeface) f71Var.f2337n;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) f71Var.f2335l, af1Var.f174a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f850j;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        af1 af1Var = this.f851k;
        qp0 qp0VarM202b = af1Var.m202b();
        int iM3375a = qp0VarM202b.m3375a(14);
        this.f853m = fAbs / (iM3375a != 0 ? qp0VarM202b.f5024b.getShort(iM3375a + qp0VarM202b.f5023a) : (short) 0);
        qp0 qp0VarM202b2 = af1Var.m202b();
        int iM3375a2 = qp0VarM202b2.m3375a(14);
        if (iM3375a2 != 0) {
            qp0VarM202b2.f5024b.getShort(iM3375a2 + qp0VarM202b2.f5023a);
        }
        qp0 qp0VarM202b3 = af1Var.m202b();
        int iM3375a3 = qp0VarM202b3.m3375a(12);
        short s = (short) ((iM3375a3 != 0 ? qp0VarM202b3.f5024b.getShort(iM3375a3 + qp0VarM202b3.f5023a) : (short) 0) * this.f853m);
        this.f852l = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
