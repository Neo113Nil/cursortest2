package S3;

import M.AbstractC0251w;
import M.C0249u;
import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import o4.AbstractC2227e;
import v.AbstractC2527w;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: S3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405h implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5491k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f5494n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2201e f5495o;

    public /* synthetic */ C0405h(long j5, String str, String str2, C2201e c2201e, int i) {
        this.f5491k = i;
        this.f5492l = j5;
        this.f5493m = str;
        this.f5494n = str2;
        this.f5495o = c2201e;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        W3.o oVar = W3.o.f6046a;
        C2201e c2201e = this.f5495o;
        b0.m mVar = b0.m.f7161k;
        int i5 = 1;
        int i6 = 3;
        switch (this.f5491k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s.B()) {
                    b0.f fVar = b0.c.f7149w;
                    float f = 4;
                    b0.p g5 = androidx.compose.foundation.layout.b.g(mVar, f, 10);
                    C2700b c2700b = AbstractC2706h.f21534a;
                    C2717s a5 = AbstractC2716r.a(new C2703e(f), fVar, c0315s, 54);
                    int p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l5 = c0315s.l();
                    b0.p c5 = b0.a.c(c0315s, g5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21833e, a5);
                    AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                    C2751h c2751h = C2752i.f;
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s, p5, c2751h);
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
                    D.d a6 = D.e.a(f);
                    long j5 = this.f5492l;
                    p0.a(androidx.compose.foundation.layout.c.f(mVar, 22), a6, i0.p.b(0.15f, j5), 0.0f, 0.0f, null, X.e.d(1737388702, new C0404g(c2201e, j5, i), c0315s), c0315s, 12582918, 120);
                    K0.O o5 = ((v0) c0315s.j(w0.f3580a)).f3570g;
                    u0.b(this.f5493m, null, j5, AbstractC2036a.H(18), O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, o5, c0315s, 199680, 0, 65490);
                    R3.j.c(this.f5494n, null, V3.a.f, V3.a.f5975d, c0315s, 3456, 2);
                    c0315s.q(true);
                    break;
                } else {
                    c0315s.S();
                    break;
                }
            case 1:
                C0315s c0315s2 = (C0315s) obj;
                if ((3 & ((Number) obj2).intValue()) != 2 || !c0315s2.B()) {
                    b0.f fVar2 = b0.c.f7149w;
                    b0.p f5 = androidx.compose.foundation.layout.b.f(mVar, 12);
                    C2700b c2700b2 = AbstractC2706h.f21534a;
                    C2717s a7 = AbstractC2716r.a(new C2703e(6), fVar2, c0315s2, 54);
                    int p6 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l6 = c0315s2.l();
                    b0.p c6 = b0.a.c(c0315s2, f5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21833e, a7);
                    AbstractC0329z.y(c0315s2, C2752i.f21832d, l6);
                    C2751h c2751h2 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s2, p6, c2751h2);
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21831c, c6);
                    D.d a8 = D.e.a(4);
                    long j6 = this.f5492l;
                    p0.a(androidx.compose.foundation.layout.c.f(mVar, 24), a8, i0.p.b(0.2f, j6), 0.0f, 0.0f, null, X.e.d(1887354653, new C0404g(c2201e, j6, i5), c0315s2), c0315s2, 12582918, 120);
                    R3.j.c(AbstractC2227e.P0(this.f5493m, 12), null, j6, 0L, c0315s2, 0, 10);
                    c0315s2.X(-386975182);
                    String str = this.f5494n;
                    if (str != null) {
                        u0.b(str, null, ((C0249u) c0315s2.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(w0.f3580a)).f3574l, c0315s2, 0, 0, 65530);
                    }
                    c0315s2.q(false);
                    c0315s2.q(true);
                    break;
                } else {
                    c0315s2.S();
                    break;
                }
                break;
            default:
                C0315s c0315s3 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s3.B()) {
                    b0.p f6 = androidx.compose.foundation.layout.b.f(mVar, 12);
                    C2717s a9 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7149w, c0315s3, 48);
                    int p7 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l7 = c0315s3.l();
                    b0.p c7 = b0.a.c(c0315s3, f6);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z3 = C2752i.f21830b;
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21833e, a9);
                    AbstractC0329z.y(c0315s3, C2752i.f21832d, l7);
                    C2751h c2751h3 = C2752i.f;
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s3, p7, c2751h3);
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21831c, c7);
                    D.d dVar = D.e.f920a;
                    long j7 = V3.a.f;
                    b0.p f7 = androidx.compose.foundation.layout.c.f(mVar, 32);
                    long j8 = this.f5492l;
                    p0.a(f7, dVar, j7, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.5f, j8)), X.e.d(193730378, new C0404g(c2201e, j8, i6), c0315s3), c0315s3, 12583302, 56);
                    AbstractC2701c.b(c0315s3, androidx.compose.foundation.layout.c.c(mVar, 6));
                    u0.b(this.f5493m, null, j8, AbstractC2036a.H(16), O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, null, c0315s3, 199680, 0, 131026);
                    u0.b(this.f5494n, null, ((C0249u) c0315s3.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s3.j(w0.f3580a)).f3577o, c0315s3, 0, 0, 65530);
                    c0315s3.q(true);
                    break;
                } else {
                    c0315s3.S();
                    break;
                }
                break;
        }
        return oVar;
    }
}
