package E;

import K0.C0196a;
import P.C0297i0;
import P.C0305m0;
import a.AbstractC0444a;
import h0.C1989c;

/* loaded from: classes.dex */
public final class B0 {
    public static final v3.g f;

    /* renamed from: a, reason: collision with root package name */
    public final C0297i0 f994a;

    /* renamed from: b, reason: collision with root package name */
    public final C0297i0 f995b = new C0297i0(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public C1989c f996c = C1989c.f17192e;

    /* renamed from: d, reason: collision with root package name */
    public long f997d = K0.N.f2801b;

    /* renamed from: e, reason: collision with root package name */
    public final C0305m0 f998e;

    static {
        A0 a02 = A0.f989l;
        C0099g c0099g = C0099g.f1154w;
        C0196a c0196a = new C0196a(a02);
        kotlin.jvm.internal.z.b(1, c0099g);
        f = new v3.g(13, c0196a, c0099g);
    }

    public B0(x.P p5, float f5) {
        this.f994a = new C0297i0(f5);
        this.f998e = new C0305m0(p5, P.Z.f4434p);
    }

    public final void a(x.P p5, C1989c c1989c, int i, int i5) {
        float f5 = i5 - i;
        this.f995b.i(f5);
        C1989c c1989c2 = this.f996c;
        float f6 = c1989c2.f17193a;
        float f7 = c1989c.f17193a;
        C0297i0 c0297i0 = this.f994a;
        float f8 = c1989c.f17194b;
        if (f7 != f6 || f8 != c1989c2.f17194b) {
            boolean z3 = p5 == x.P.f20695k;
            if (z3) {
                f7 = f8;
            }
            float f9 = z3 ? c1989c.f17196d : c1989c.f17195c;
            float h3 = c0297i0.h();
            float f10 = i;
            float f11 = h3 + f10;
            c0297i0.i(c0297i0.h() + ((f9 <= f11 && (f7 >= h3 || f9 - f7 <= f10)) ? (f7 >= h3 || f9 - f7 > f10) ? 0.0f : f7 - h3 : f9 - f11));
            this.f996c = c1989c;
        }
        c0297i0.i(AbstractC0444a.s(c0297i0.h(), 0.0f, f5));
    }
}
