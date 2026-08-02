package k0;

import W0.m;
import a.AbstractC0444a;
import android.graphics.Paint;
import android.graphics.Shader;
import i0.C2001f;
import i0.C2003h;
import i0.C2006k;
import i0.F;
import i0.InterfaceC2009n;
import i0.p;
import kotlin.jvm.internal.l;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2022b implements InterfaceC2025e {

    /* renamed from: k, reason: collision with root package name */
    public final C2021a f17539k;

    /* renamed from: l, reason: collision with root package name */
    public final v3.e f17540l;

    /* renamed from: m, reason: collision with root package name */
    public J2.b f17541m;

    /* renamed from: n, reason: collision with root package name */
    public J2.b f17542n;

    public C2022b() {
        W0.d dVar = AbstractC2024d.f17545a;
        m mVar = m.f6016k;
        C2026f c2026f = C2026f.f17546a;
        C2021a c2021a = new C2021a();
        c2021a.f17535a = dVar;
        c2021a.f17536b = mVar;
        c2021a.f17537c = c2026f;
        c2021a.f17538d = 0L;
        this.f17539k = c2021a;
        this.f17540l = new v3.e(this);
    }

    public static J2.b a(C2022b c2022b, long j5, AbstractC2024d abstractC2024d, int i) {
        J2.b f = c2022b.f(abstractC2024d);
        if (!p.c(F.c(((Paint) f.f2696c).getColor()), j5)) {
            f.e(j5);
        }
        if (((Shader) f.f2697d) != null) {
            f.h(null);
        }
        if (!l.a((C2006k) f.f2698e, null)) {
            f.f(null);
        }
        if (f.f2695b != i) {
            f.d(i);
        }
        if (((Paint) f.f2696c).isFilterBitmap()) {
            return f;
        }
        f.g(1);
        return f;
    }

    @Override // k0.InterfaceC2025e
    public final v3.e B() {
        return this.f17540l;
    }

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // k0.InterfaceC2025e
    public final void H(long j5, long j6, long j7, int i) {
        C2027g c2027g = C2027g.f17547b;
        int i5 = (int) (j6 >> 32);
        int i6 = (int) (j6 & 4294967295L);
        this.f17539k.f17537c.t(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6), Float.intBitsToFloat(i5) + Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i6), a(this, j5, c2027g, i));
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // k0.InterfaceC2025e
    public final void M(C2003h c2003h, F f, float f5, AbstractC2024d abstractC2024d, int i) {
        this.f17539k.f17537c.n(c2003h, b(f, abstractC2024d, f5, null, i, 1));
    }

    @Override // k0.InterfaceC2025e
    public final void N(long j5, float f, float f5, long j6, long j7, AbstractC2024d abstractC2024d) {
        int i = (int) (j6 >> 32);
        int i5 = (int) (j6 & 4294967295L);
        this.f17539k.f17537c.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i5), f, f5, a(this, j5, abstractC2024d, 3));
    }

    @Override // k0.InterfaceC2025e
    public final void P(long j5, long j6, long j7, float f, int i) {
        InterfaceC2009n interfaceC2009n = this.f17539k.f17537c;
        J2.b bVar = this.f17542n;
        if (bVar == null) {
            bVar = F.g();
            bVar.l(1);
            this.f17542n = bVar;
        }
        if (!p.c(F.c(((Paint) bVar.f2696c).getColor()), j5)) {
            bVar.e(j5);
        }
        if (((Shader) bVar.f2697d) != null) {
            bVar.h(null);
        }
        if (!l.a((C2006k) bVar.f2698e, null)) {
            bVar.f(null);
        }
        if (bVar.f2695b != 3) {
            bVar.d(3);
        }
        Paint paint = (Paint) bVar.f2696c;
        if (paint.getStrokeWidth() != f) {
            bVar.k(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) bVar.f2696c).setStrokeMiter(4.0f);
        }
        if (bVar.a() != i) {
            bVar.i(i);
        }
        if (bVar.b() != 0) {
            bVar.j(0);
        }
        if (!paint.isFilterBitmap()) {
            bVar.g(1);
        }
        interfaceC2009n.e(j6, j7, bVar);
    }

    @Override // k0.InterfaceC2025e
    public final long Q() {
        return AbstractC0444a.L(this.f17540l.A());
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    @Override // k0.InterfaceC2025e
    public final void a0(C2001f c2001f, long j5, long j6, long j7, float f, C2006k c2006k, int i) {
        this.f17539k.f17537c.l(c2001f, j5, j6, j7, b(null, C2027g.f17547b, f, c2006k, 3, i));
    }

    public final J2.b b(F f, AbstractC2024d abstractC2024d, float f5, C2006k c2006k, int i, int i5) {
        J2.b f6 = f(abstractC2024d);
        if (f != null) {
            f.h(f5, this.f17540l.A(), f6);
        } else {
            if (((Shader) f6.f2697d) != null) {
                f6.h(null);
            }
            long c5 = F.c(((Paint) f6.f2696c).getColor());
            long j5 = p.f17289b;
            if (!p.c(c5, j5)) {
                f6.e(j5);
            }
            if (((Paint) f6.f2696c).getAlpha() / 255.0f != f5) {
                f6.c(f5);
            }
        }
        if (!l.a((C2006k) f6.f2698e, c2006k)) {
            f6.f(c2006k);
        }
        if (f6.f2695b != i) {
            f6.d(i);
        }
        if (((Paint) f6.f2696c).isFilterBitmap() == i5) {
            return f6;
        }
        f6.g(i5);
        return f6;
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    @Override // W0.c
    public final float c() {
        return this.f17539k.f17535a.c();
    }

    @Override // k0.InterfaceC2025e
    public final long d() {
        return this.f17540l.A();
    }

    @Override // k0.InterfaceC2025e
    public final void d0(C2003h c2003h, long j5, AbstractC2024d abstractC2024d) {
        this.f17539k.f17537c.n(c2003h, a(this, j5, abstractC2024d, 3));
    }

    public final void e(C2001f c2001f, C2006k c2006k) {
        this.f17539k.f17537c.a(c2001f, b(null, C2027g.f17547b, 1.0f, c2006k, 3, 1));
    }

    public final J2.b f(AbstractC2024d abstractC2024d) {
        if (l.a(abstractC2024d, C2027g.f17547b)) {
            J2.b bVar = this.f17541m;
            if (bVar != null) {
                return bVar;
            }
            J2.b g5 = F.g();
            g5.l(0);
            this.f17541m = g5;
            return g5;
        }
        if (!(abstractC2024d instanceof C2028h)) {
            throw new D2.e();
        }
        J2.b bVar2 = this.f17542n;
        if (bVar2 == null) {
            bVar2 = F.g();
            bVar2.l(1);
            this.f17542n = bVar2;
        }
        Paint paint = (Paint) bVar2.f2696c;
        float strokeWidth = paint.getStrokeWidth();
        C2028h c2028h = (C2028h) abstractC2024d;
        float f = c2028h.f17548b;
        if (strokeWidth != f) {
            bVar2.k(f);
        }
        int a5 = bVar2.a();
        int i = c2028h.f17550d;
        if (a5 != i) {
            bVar2.i(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f5 = c2028h.f17549c;
        if (strokeMiter != f5) {
            ((Paint) bVar2.f2696c).setStrokeMiter(f5);
        }
        int b3 = bVar2.b();
        int i5 = c2028h.f17551e;
        if (b3 == i5) {
            return bVar2;
        }
        bVar2.j(i5);
        return bVar2;
    }

    @Override // k0.InterfaceC2025e
    public final m getLayoutDirection() {
        return this.f17539k.f17536b;
    }

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    @Override // W0.c
    public final float n() {
        return this.f17539k.f17535a.n();
    }

    @Override // k0.InterfaceC2025e
    public final void q(float f, long j5, long j6) {
        this.f17539k.f17537c.s(f, j6, a(this, j5, C2027g.f17547b, 3));
    }

    @Override // k0.InterfaceC2025e
    public final void w(long j5, long j6, long j7, long j8) {
        C2027g c2027g = C2027g.f17547b;
        int i = (int) (j6 >> 32);
        int i5 = (int) (j6 & 4294967295L);
        this.f17539k.f17537c.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), a(this, j5, c2027g, 3));
    }

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }
}
