package p046g0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p097n3.a;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f13068b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f13067a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13069c = 1.0f;

    public u(n nVar) {
        a.i(nVar, "metadata cannot be null");
        this.f13068b = nVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        j.a().getClass();
        n nVar = this.f13068b;
        F0 f8 = nVar.f13044b;
        Typeface typeface = (Typeface) f8.f17382e;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) f8.f17380c, nVar.f13043a * 2, 2, f7, i10, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f13067a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        n nVar = this.f13068b;
        p052h0.a aVarC = nVar.c();
        int iA = aVarC.a(14);
        this.f13069c = fAbs / (iA != 0 ? ((ByteBuffer) aVarC.f5028d).getShort(iA + aVarC.f5025a) : (short) 0);
        p052h0.a aVarC2 = nVar.c();
        int iA2 = aVarC2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarC2.f5028d).getShort(iA2 + aVarC2.f5025a);
        }
        p052h0.a aVarC3 = nVar.c();
        int iA3 = aVarC3.a(12);
        short s7 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarC3.f5028d).getShort(iA3 + aVarC3.f5025a) : (short) 0) * this.f13069c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s7;
    }
}
