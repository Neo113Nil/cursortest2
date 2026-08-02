package g0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import h0.C1175a;
import java.nio.ByteBuffer;
import n3.AbstractC1464a;
import w1.F0;

/* loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final n f13062b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f13061a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f13063c = 1.0f;

    public u(n nVar) {
        AbstractC1464a.i(nVar, "metadata cannot be null");
        this.f13062b = nVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        j.a().getClass();
        n nVar = this.f13062b;
        F0 f02 = nVar.f13038b;
        Typeface typeface = (Typeface) f02.f17376e;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) f02.f17374c, nVar.f13037a * 2, 2, f7, i10, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f13061a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        n nVar = this.f13062b;
        this.f13063c = abs / (nVar.c().a(14) != 0 ? ((ByteBuffer) r8.f5028d).getShort(r1 + r8.f5025a) : (short) 0);
        C1175a c3 = nVar.c();
        int a2 = c3.a(14);
        if (a2 != 0) {
            ((ByteBuffer) c3.f5028d).getShort(a2 + c3.f5025a);
        }
        short s7 = (short) ((nVar.c().a(12) != 0 ? ((ByteBuffer) r5.f5028d).getShort(r7 + r5.f5025a) : (short) 0) * this.f13063c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s7;
    }
}
