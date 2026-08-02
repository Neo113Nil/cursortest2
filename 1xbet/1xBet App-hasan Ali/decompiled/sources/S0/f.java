package S0;

import P.AbstractC0329z;
import P.H;
import a.AbstractC0444a;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import h0.C1991e;
import i0.F;
import i0.I;
import i0.M;
import i0.p;
import i4.InterfaceC2015a;
import k0.AbstractC2024d;
import k0.C2027g;
import k0.C2028h;

/* loaded from: classes.dex */
public final class f extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public J2.b f5268a;

    /* renamed from: b, reason: collision with root package name */
    public V0.l f5269b;

    /* renamed from: c, reason: collision with root package name */
    public int f5270c;

    /* renamed from: d, reason: collision with root package name */
    public I f5271d;

    /* renamed from: e, reason: collision with root package name */
    public p f5272e;
    public F f;

    /* renamed from: g, reason: collision with root package name */
    public H f5273g;

    /* renamed from: h, reason: collision with root package name */
    public C1991e f5274h;
    public AbstractC2024d i;

    public final J2.b a() {
        J2.b bVar = this.f5268a;
        if (bVar != null) {
            return bVar;
        }
        J2.b bVar2 = new J2.b(this);
        this.f5268a = bVar2;
        return bVar2;
    }

    public final void b(int i) {
        if (i == this.f5270c) {
            return;
        }
        a().d(i);
        this.f5270c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : h0.C1991e.a(r1.f17204a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final F f, final long j5, float f5) {
        if (f == null) {
            this.f5273g = null;
            this.f = null;
            this.f5274h = null;
            setShader(null);
            return;
        }
        if (f instanceof M) {
            d(AbstractC0444a.T(f5, ((M) f).f17262e));
            return;
        }
        if (!(f instanceof i0.H)) {
            throw new D2.e();
        }
        if (kotlin.jvm.internal.l.a(this.f, f)) {
            C1991e c1991e = this.f5274h;
        }
        if (j5 != 9205357640488583168L) {
            this.f = f;
            this.f5274h = new C1991e(j5);
            this.f5273g = AbstractC0329z.o(new InterfaceC2015a() { // from class: S0.e
                @Override // i4.InterfaceC2015a
                public final Object invoke() {
                    return ((i0.H) F.this).B(j5);
                }
            });
        }
        J2.b a5 = a();
        H h3 = this.f5273g;
        a5.h(h3 != null ? (Shader) h3.getValue() : null);
        this.f5272e = null;
        k.b(this, f5);
    }

    public final void d(long j5) {
        p pVar = this.f5272e;
        if (pVar == null ? false : p.c(pVar.f17295a, j5)) {
            return;
        }
        if (j5 != 16) {
            this.f5272e = new p(j5);
            setColor(F.u(j5));
            this.f5273g = null;
            this.f = null;
            this.f5274h = null;
            setShader(null);
        }
    }

    public final void e(AbstractC2024d abstractC2024d) {
        if (abstractC2024d == null || kotlin.jvm.internal.l.a(this.i, abstractC2024d)) {
            return;
        }
        this.i = abstractC2024d;
        if (abstractC2024d.equals(C2027g.f17547b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC2024d instanceof C2028h)) {
            throw new D2.e();
        }
        a().l(1);
        C2028h c2028h = (C2028h) abstractC2024d;
        a().k(c2028h.f17548b);
        ((Paint) a().f2696c).setStrokeMiter(c2028h.f17549c);
        a().j(c2028h.f17551e);
        a().i(c2028h.f17550d);
        ((Paint) a().f2696c).setPathEffect(null);
    }

    public final void f(I i) {
        if (i == null || kotlin.jvm.internal.l.a(this.f5271d, i)) {
            return;
        }
        this.f5271d = i;
        if (i.equals(I.f17244d)) {
            clearShadowLayer();
            return;
        }
        I i5 = this.f5271d;
        float f = i5.f17247c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (i5.f17246b >> 32)), Float.intBitsToFloat((int) (this.f5271d.f17246b & 4294967295L)), F.u(this.f5271d.f17245a));
    }

    public final void g(V0.l lVar) {
        if (lVar == null || kotlin.jvm.internal.l.a(this.f5269b, lVar)) {
            return;
        }
        this.f5269b = lVar;
        int i = lVar.f5947a;
        setUnderlineText((i | 1) == i);
        V0.l lVar2 = this.f5269b;
        lVar2.getClass();
        int i5 = lVar2.f5947a;
        setStrikeThruText((i5 | 2) == i5);
    }
}
