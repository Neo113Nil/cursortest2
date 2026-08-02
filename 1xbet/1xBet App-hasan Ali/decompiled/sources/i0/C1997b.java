package i0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import h0.C1989c;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1997b implements InterfaceC2009n {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f17266a = AbstractC1998c.f17269a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f17267b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f17268c;

    @Override // i0.InterfaceC2009n
    public final void a(C2001f c2001f, J2.b bVar) {
        this.f17266a.drawBitmap(F.i(c2001f), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) bVar.f2696c);
    }

    @Override // i0.InterfaceC2009n
    public final void b(float f, float f5) {
        this.f17266a.scale(f, f5);
    }

    @Override // i0.InterfaceC2009n
    public final void c(float f, float f5, float f6, float f7, float f8, float f9, J2.b bVar) {
        this.f17266a.drawRoundRect(f, f5, f6, f7, f8, f9, (Paint) bVar.f2696c);
    }

    @Override // i0.InterfaceC2009n
    public final void d(C2003h c2003h) {
        Canvas canvas = this.f17266a;
        if (!(c2003h instanceof C2003h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c2003h.f17279a, Region.Op.INTERSECT);
    }

    @Override // i0.InterfaceC2009n
    public final void e(long j5, long j6, J2.b bVar) {
        this.f17266a.drawLine(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), (Paint) bVar.f2696c);
    }

    @Override // i0.InterfaceC2009n
    public final void f(float f, float f5, float f6, float f7, int i) {
        this.f17266a.clipRect(f, f5, f6, f7, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // i0.InterfaceC2009n
    public final void g(float f, float f5) {
        this.f17266a.translate(f, f5);
    }

    @Override // i0.InterfaceC2009n
    public final void h() {
        this.f17266a.rotate(45.0f);
    }

    @Override // i0.InterfaceC2009n
    public final void i(C1989c c1989c, J2.b bVar) {
        Canvas canvas = this.f17266a;
        Paint paint = (Paint) bVar.f2696c;
        canvas.saveLayer(c1989c.f17193a, c1989c.f17194b, c1989c.f17195c, c1989c.f17196d, paint, 31);
    }

    @Override // i0.InterfaceC2009n
    public final void j() {
        this.f17266a.restore();
    }

    @Override // i0.InterfaceC2009n
    public final void k() {
        this.f17266a.save();
    }

    @Override // i0.InterfaceC2009n
    public final void l(C2001f c2001f, long j5, long j6, long j7, J2.b bVar) {
        if (this.f17267b == null) {
            this.f17267b = new Rect();
            this.f17268c = new Rect();
        }
        Canvas canvas = this.f17266a;
        Bitmap i = F.i(c2001f);
        Rect rect = this.f17267b;
        kotlin.jvm.internal.l.c(rect);
        int i5 = (int) (j5 >> 32);
        rect.left = i5;
        int i6 = (int) (j5 & 4294967295L);
        rect.top = i6;
        rect.right = i5 + ((int) (j6 >> 32));
        rect.bottom = i6 + ((int) (j6 & 4294967295L));
        Rect rect2 = this.f17268c;
        kotlin.jvm.internal.l.c(rect2);
        int i7 = (int) 0;
        rect2.left = i7;
        int i8 = (int) 0;
        rect2.top = i8;
        rect2.right = i7 + ((int) (j7 >> 32));
        rect2.bottom = i8 + ((int) (4294967295L & j7));
        canvas.drawBitmap(i, rect, rect2, (Paint) bVar.f2696c);
    }

    @Override // i0.InterfaceC2009n
    public final void m() {
        F.k(this.f17266a, false);
    }

    @Override // i0.InterfaceC2009n
    public final void n(C2003h c2003h, J2.b bVar) {
        Canvas canvas = this.f17266a;
        if (!(c2003h instanceof C2003h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c2003h.f17279a, (Paint) bVar.f2696c);
    }

    @Override // i0.InterfaceC2009n
    public final void o(float f, float f5, float f6, float f7, float f8, float f9, J2.b bVar) {
        this.f17266a.drawArc(f, f5, f6, f7, f8, f9, false, (Paint) bVar.f2696c);
    }

    @Override // i0.InterfaceC2009n
    public final void p(C1989c c1989c) {
        f(c1989c.f17193a, c1989c.f17194b, c1989c.f17195c, c1989c.f17196d, 1);
    }

    @Override // i0.InterfaceC2009n
    public final void q(float[] fArr) {
        if (F.l(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        F.n(matrix, fArr);
        this.f17266a.concat(matrix);
    }

    @Override // i0.InterfaceC2009n
    public final void r() {
        F.k(this.f17266a, true);
    }

    @Override // i0.InterfaceC2009n
    public final void s(float f, long j5, J2.b bVar) {
        this.f17266a.drawCircle(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), f, (Paint) bVar.f2696c);
    }

    @Override // i0.InterfaceC2009n
    public final void t(float f, float f5, float f6, float f7, J2.b bVar) {
        this.f17266a.drawRect(f, f5, f6, f7, (Paint) bVar.f2696c);
    }
}
