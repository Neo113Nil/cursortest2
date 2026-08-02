package E4;

import A1.C0043s0;
import B4.T;
import B4.U;
import G4.C0272e;
import G4.C0279l;
import G4.C0288v;
import G4.X;
import w1.C1726n0;
import w1.C1759x1;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final B4.K f2248a;

    /* renamed from: b, reason: collision with root package name */
    public final I4.j f2249b = new I4.j(1);

    /* renamed from: c, reason: collision with root package name */
    public P6.b f2250c;

    /* renamed from: d, reason: collision with root package name */
    public C0279l f2251d;

    /* renamed from: e, reason: collision with root package name */
    public H f2252e;

    /* renamed from: f, reason: collision with root package name */
    public C0043s0 f2253f;

    /* renamed from: g, reason: collision with root package name */
    public v2.n f2254g;

    /* renamed from: h, reason: collision with root package name */
    public C0272e f2255h;

    /* renamed from: i, reason: collision with root package name */
    public X f2256i;

    public z(B4.K k7) {
        this.f2248a = k7;
    }

    public X a(C1726n0 c1726n0) {
        return null;
    }

    public C0272e b(C1726n0 c1726n0) {
        return null;
    }

    public P6.b c(C1726n0 c1726n0) {
        T t7 = this.f2248a.f1109e;
        if (t7 != null && (t7 instanceof U)) {
        }
        C0288v c0288v = new C0288v();
        c0288v.f3037i = new C1759x1(c0288v);
        return c0288v;
    }

    public final C0279l d() {
        C0279l c0279l = this.f2251d;
        p3.f.P(c0279l, "localStore not initialized yet", new Object[0]);
        return c0279l;
    }

    public final H e() {
        H h6 = this.f2252e;
        p3.f.P(h6, "syncEngine not initialized yet", new Object[0]);
        return h6;
    }
}
