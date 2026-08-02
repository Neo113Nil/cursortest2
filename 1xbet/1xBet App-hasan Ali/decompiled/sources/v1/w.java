package v1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import k4.AbstractC2036a;
import w1.C2542a;

/* loaded from: classes.dex */
public final class w extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final v f20385b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f20388e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f20384a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f20386c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f20387d = 1.0f;

    public w(v vVar) {
        AbstractC2036a.o("rasterizer cannot be null", vVar);
        this.f20385b = vVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i5, float f, int i6, int i7, int i8, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i5, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f20388e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f20388e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
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
            canvas.drawRect(f, i6, f + this.f20386c, i8, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        k.a().getClass();
        float f5 = i7;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        v vVar = this.f20385b;
        m2.g gVar = vVar.f20382b;
        Typeface typeface = (Typeface) gVar.f17997o;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) gVar.f17995m, vVar.f20381a * 2, 2, f, f5, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i5, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f20384a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        v vVar = this.f20385b;
        this.f20387d = abs / (vVar.b().a(14) != 0 ? ((ByteBuffer) r8.f6158n).getShort(r1 + r8.f6155k) : (short) 0);
        C2542a b3 = vVar.b();
        int a5 = b3.a(14);
        if (a5 != 0) {
            ((ByteBuffer) b3.f6158n).getShort(a5 + b3.f6155k);
        }
        short s2 = (short) ((vVar.b().a(12) != 0 ? ((ByteBuffer) r5.f6158n).getShort(r7 + r5.f6155k) : (short) 0) * this.f20387d);
        this.f20386c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
