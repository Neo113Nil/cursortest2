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
import P.e1;
import java.util.ArrayList;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.C2205i;
import o0.C2208l;
import o0.C2209m;
import o0.C2213q;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import v.AbstractC2527w;
import z.AbstractC2685I;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.AbstractC2716r;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class b0 implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f5444l = new b0(0);

    /* renamed from: m, reason: collision with root package name */
    public static final b0 f5445m = new b0(1);

    /* renamed from: n, reason: collision with root package name */
    public static final b0 f5446n = new b0(2);

    /* renamed from: o, reason: collision with root package name */
    public static final b0 f5447o = new b0(3);

    /* renamed from: p, reason: collision with root package name */
    public static final b0 f5448p = new b0(4);

    /* renamed from: q, reason: collision with root package name */
    public static final b0 f5449q = new b0(5);

    /* renamed from: r, reason: collision with root package name */
    public static final b0 f5450r = new b0(6);

    /* renamed from: s, reason: collision with root package name */
    public static final b0 f5451s = new b0(7);

    /* renamed from: t, reason: collision with root package name */
    public static final b0 f5452t = new b0(8);

    /* renamed from: u, reason: collision with root package name */
    public static final b0 f5453u = new b0(9);

    /* renamed from: v, reason: collision with root package name */
    public static final b0 f5454v = new b0(10);

    /* renamed from: w, reason: collision with root package name */
    public static final b0 f5455w = new b0(11);

    /* renamed from: x, reason: collision with root package name */
    public static final b0 f5456x = new b0(12);

    /* renamed from: y, reason: collision with root package name */
    public static final b0 f5457y = new b0(13);

    /* renamed from: z, reason: collision with root package name */
    public static final b0 f5458z = new b0(14);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5459k;

    public /* synthetic */ b0(int i) {
        this.f5459k = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        b0.m mVar = b0.m.f7161k;
        W3.o oVar = W3.o.f6046a;
        switch (this.f5459k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s.B()) {
                    x0.O e3 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l5 = c0315s.l();
                    b0.p c5 = b0.a.c(c0315s, mVar);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
                    AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                    C2751h c2751h = C2752i.f;
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s, p5, c2751h);
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
                    C2201e c2201e = N4.b.f3796d;
                    if (c2201e == null) {
                        C2200d c2200d = new C2200d("Filled.RocketLaunch", false);
                        int i = o0.z.f18603a;
                        i0.M m5 = new i0.M(i0.p.f17289b);
                        C2202f c2202f = new C2202f(0);
                        c2202f.m(9.19f, 6.35f);
                        c2202f.g(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
                        c2202f.k(2.0f, 10.69f);
                        c2202f.l(4.05f, -4.05f);
                        c2202f.g(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f);
                        c2202f.k(9.19f, 6.35f);
                        c2202f.k(9.19f, 6.35f);
                        c2202f.e();
                        c2202f.m(11.17f, 17.0f);
                        c2202f.g(0.0f, 0.0f, 3.74f, -1.55f, 5.89f, -3.7f);
                        c2202f.g(5.4f, -5.4f, 4.5f, -9.62f, 4.21f, -10.57f);
                        c2202f.g(-0.95f, -0.3f, -5.17f, -1.19f, -10.57f, 4.21f);
                        c2202f.f(8.55f, 9.09f, 7.0f, 12.83f, 7.0f, 12.83f);
                        c2202f.k(11.17f, 17.0f);
                        c2202f.e();
                        c2202f.m(17.65f, 14.81f);
                        c2202f.g(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
                        c2202f.k(13.31f, 22.0f);
                        c2202f.l(4.05f, -4.05f);
                        c2202f.g(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
                        c2202f.k(17.65f, 14.81f);
                        c2202f.k(17.65f, 14.81f);
                        c2202f.e();
                        c2202f.m(9.0f, 18.0f);
                        c2202f.g(0.0f, 0.83f, -0.34f, 1.58f, -0.88f, 2.12f);
                        c2202f.f(6.94f, 21.3f, 2.0f, 22.0f, 2.0f, 22.0f);
                        c2202f.o(0.7f, -4.94f, 1.88f, -6.12f);
                        c2202f.f(4.42f, 15.34f, 5.17f, 15.0f, 6.0f, 15.0f);
                        c2202f.f(7.66f, 15.0f, 9.0f, 16.34f, 9.0f, 18.0f);
                        c2202f.e();
                        c2202f.m(13.0f, 9.0f);
                        c2202f.g(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
                        c2202f.o(2.0f, 0.9f, 2.0f, 2.0f);
                        c2202f.o(-0.9f, 2.0f, -2.0f, 2.0f);
                        c2202f.n(13.0f, 10.1f, 13.0f, 9.0f);
                        c2202f.e();
                        C2200d.a(c2200d, c2202f.f18548a, m5);
                        c2201e = c2200d.b();
                        N4.b.f3796d = c2201e;
                    }
                    M.G.a(c2201e, null, androidx.compose.foundation.layout.c.f(mVar, 28), V3.a.f5975d, c0315s, 3504, 0);
                    c0315s.q(true);
                    break;
                } else {
                    c0315s.S();
                    break;
                }
                break;
            case 1:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s2.B()) {
                    b0.p f = androidx.compose.foundation.layout.b.f(mVar, 16);
                    b0.g gVar = b0.c.f7147u;
                    C2686J a5 = AbstractC2685I.a(AbstractC2706h.f21534a, gVar, c0315s2, 48);
                    int p6 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l6 = c0315s2.l();
                    b0.p c6 = b0.a.c(c0315s2, f);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    C2751h c2751h2 = C2752i.f21833e;
                    AbstractC0329z.y(c0315s2, c2751h2, a5);
                    C2751h c2751h3 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s2, c2751h3, l6);
                    C2751h c2751h4 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s2, p6, c2751h4);
                    }
                    C2751h c2751h5 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s2, c2751h5, c6);
                    D.d dVar = R3.j.f5219b;
                    long j5 = V3.a.f;
                    b0.p f5 = androidx.compose.foundation.layout.c.f(mVar, 56);
                    long j6 = V3.a.f5975d;
                    p0.a(f5, dVar, j5, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.5f, j6)), c0.f5464a, c0315s2, 14156214, 56);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.i(14));
                    b0.p C5 = AbstractC2107A.C(mVar, 1.0f);
                    C2717s a6 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s2, 0);
                    int p7 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l7 = c0315s2.l();
                    b0.p c7 = b0.a.c(c0315s2, C5);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h2, a6);
                    AbstractC0329z.y(c0315s2, c2751h3, l7);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s2, p7, c2751h4);
                    }
                    AbstractC0329z.y(c0315s2, c2751h5, c7);
                    C2686J r5 = L1.a.r(6, gVar, c0315s2, 54);
                    int p8 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l8 = c0315s2.l();
                    b0.p c8 = b0.a.c(c0315s2, mVar);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h2, r5);
                    AbstractC0329z.y(c0315s2, c2751h3, l8);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p8))) {
                        AbstractC2107A.y(p8, c0315s2, p8, c2751h4);
                    }
                    AbstractC0329z.y(c0315s2, c2751h5, c8);
                    R3.j.c("STEP 02 • EXPLORE", null, j6, 0L, c0315s2, 390, 10);
                    R3.j.b(AbstractC2036a.y(), null, V3.a.f5985p, 12, c0315s2, 3456);
                    c0315s2.q(true);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, 4));
                    e1 e1Var = w0.f3580a;
                    K0.O o5 = ((v0) c0315s2.j(e1Var)).f3571h;
                    O0.l lVar = O0.l.f4030p;
                    e1 e1Var2 = AbstractC0251w.f3578a;
                    u0.b("Explore Leagues & Fixtures", null, ((C0249u) c0315s2.j(e1Var2)).f3539o, 0L, lVar, 0L, null, 0L, 0, false, 0, 0, o5, c0315s2, 196614, 0, 65498);
                    u0.b("Live scores, match centers, squads & player cards", null, ((C0249u) c0315s2.j(e1Var2)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(e1Var)).f3574l, c0315s2, 6, 0, 65530);
                    c0315s2.q(true);
                    M.G.a(G4.d.s(), null, androidx.compose.foundation.layout.c.f(mVar, 28), j6, c0315s2, 3504, 0);
                    c0315s2.q(true);
                    break;
                } else {
                    c0315s2.S();
                    break;
                }
                break;
            case 2:
                C0315s c0315s3 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s3.B()) {
                    b0.p f6 = androidx.compose.foundation.layout.b.f(mVar, 10);
                    b0.g gVar2 = b0.c.f7147u;
                    C2700b c2700b = AbstractC2706h.f21534a;
                    C2686J r6 = L1.a.r(6, gVar2, c0315s3, 54);
                    int p9 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l9 = c0315s3.l();
                    b0.p c9 = b0.a.c(c0315s3, f6);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z3 = C2752i.f21830b;
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21833e, r6);
                    AbstractC0329z.y(c0315s3, C2752i.f21832d, l9);
                    C2751h c2751h6 = C2752i.f;
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p9))) {
                        AbstractC2107A.y(p9, c0315s3, p9, c2751h6);
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21831c, c9);
                    C2201e D5 = AbstractC2349a.D();
                    long j7 = V3.a.f5975d;
                    R3.j.b(D5, null, j7, 16, c0315s3, 3456);
                    u0.b("Secure & Fast", null, j7, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s3.j(w0.f3580a)).f3577o, c0315s3, 196998, 0, 65498);
                    c0315s3.q(true);
                    break;
                } else {
                    c0315s3.S();
                    break;
                }
            case 3:
                C0315s c0315s4 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s4.B()) {
                    b0.p f7 = androidx.compose.foundation.layout.b.f(mVar, 10);
                    b0.g gVar3 = b0.c.f7147u;
                    C2700b c2700b2 = AbstractC2706h.f21534a;
                    C2686J r7 = L1.a.r(6, gVar3, c0315s4, 54);
                    int p10 = AbstractC0329z.p(c0315s4);
                    InterfaceC0314r0 l10 = c0315s4.l();
                    b0.p c10 = b0.a.c(c0315s4, f7);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z4 = C2752i.f21830b;
                    c0315s4.b0();
                    if (c0315s4.f4530S) {
                        c0315s4.k(c2768z4);
                    } else {
                        c0315s4.l0();
                    }
                    AbstractC0329z.y(c0315s4, C2752i.f21833e, r7);
                    AbstractC0329z.y(c0315s4, C2752i.f21832d, l10);
                    C2751h c2751h7 = C2752i.f;
                    if (c0315s4.f4530S || !kotlin.jvm.internal.l.a(c0315s4.M(), Integer.valueOf(p10))) {
                        AbstractC2107A.y(p10, c0315s4, p10, c2751h7);
                    }
                    AbstractC0329z.y(c0315s4, C2752i.f21831c, c10);
                    C2201e c2201e2 = AbstractC2349a.f19097e;
                    if (c2201e2 == null) {
                        C2200d c2200d2 = new C2200d("Filled.Notifications", false);
                        int i5 = o0.z.f18603a;
                        i0.M m6 = new i0.M(i0.p.f17289b);
                        C2202f c2202f2 = new C2202f(0);
                        c2202f2.m(12.0f, 22.0f);
                        c2202f2.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c2202f2.j(-4.0f);
                        c2202f2.g(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        c2202f2.e();
                        c2202f2.m(18.0f, 16.0f);
                        c2202f2.r(-5.0f);
                        c2202f2.g(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
                        c2202f2.k(13.5f, 4.0f);
                        c2202f2.g(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                        c2202f2.o(-1.5f, 0.67f, -1.5f, 1.5f);
                        c2202f2.r(0.68f);
                        c2202f2.f(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
                        c2202f2.r(5.0f);
                        c2202f2.l(-2.0f, 2.0f);
                        c2202f2.r(1.0f);
                        c2202f2.j(16.0f);
                        c2202f2.r(-1.0f);
                        c2202f2.l(-2.0f, -2.0f);
                        c2202f2.e();
                        C2200d.a(c2200d2, c2202f2.f18548a, m6);
                        c2201e2 = c2200d2.b();
                        AbstractC2349a.f19097e = c2201e2;
                    }
                    C2201e c2201e3 = c2201e2;
                    long j8 = V3.a.f5975d;
                    R3.j.b(c2201e3, null, j8, 16, c0315s4, 3456);
                    u0.b("Live Alerts", null, j8, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s4.j(w0.f3580a)).f3577o, c0315s4, 196998, 0, 65498);
                    c0315s4.q(true);
                    break;
                } else {
                    c0315s4.S();
                    break;
                }
                break;
            case 4:
                C0315s c0315s5 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s5.B()) {
                    c0315s5.S();
                    break;
                }
                break;
            case 5:
                C0315s c0315s6 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s6.B()) {
                    c0315s6.S();
                    break;
                }
                break;
            case 6:
                C0315s c0315s7 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s7.B()) {
                    b0.p f8 = androidx.compose.foundation.layout.b.f(mVar, 20);
                    C2717s a7 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7149w, c0315s7, 48);
                    int p11 = AbstractC0329z.p(c0315s7);
                    InterfaceC0314r0 l11 = c0315s7.l();
                    b0.p c11 = b0.a.c(c0315s7, f8);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z5 = C2752i.f21830b;
                    c0315s7.b0();
                    if (c0315s7.f4530S) {
                        c0315s7.k(c2768z5);
                    } else {
                        c0315s7.l0();
                    }
                    C2751h c2751h8 = C2752i.f21833e;
                    AbstractC0329z.y(c0315s7, c2751h8, a7);
                    C2751h c2751h9 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s7, c2751h9, l11);
                    C2751h c2751h10 = C2752i.f;
                    if (c0315s7.f4530S || !kotlin.jvm.internal.l.a(c0315s7.M(), Integer.valueOf(p11))) {
                        AbstractC2107A.y(p11, c0315s7, p11, c2751h10);
                    }
                    C2751h c2751h11 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s7, c2751h11, c11);
                    float f9 = 8;
                    C2703e c2703e = new C2703e(f9);
                    b0.g gVar4 = b0.c.f7147u;
                    C2686J a8 = AbstractC2685I.a(c2703e, gVar4, c0315s7, 54);
                    int p12 = AbstractC0329z.p(c0315s7);
                    InterfaceC0314r0 l12 = c0315s7.l();
                    b0.p c12 = b0.a.c(c0315s7, mVar);
                    c0315s7.b0();
                    if (c0315s7.f4530S) {
                        c0315s7.k(c2768z5);
                    } else {
                        c0315s7.l0();
                    }
                    AbstractC0329z.y(c0315s7, c2751h8, a8);
                    AbstractC0329z.y(c0315s7, c2751h9, l12);
                    if (c0315s7.f4530S || !kotlin.jvm.internal.l.a(c0315s7.M(), Integer.valueOf(p12))) {
                        AbstractC2107A.y(p12, c0315s7, p12, c2751h10);
                    }
                    AbstractC0329z.y(c0315s7, c2751h11, c12);
                    D.d dVar2 = D.e.f920a;
                    long j9 = V3.a.f;
                    b0.p f10 = androidx.compose.foundation.layout.c.f(mVar, f9);
                    float f11 = 1;
                    long j10 = V3.a.f5975d;
                    p0.a(f10, dVar2, j9, 0.0f, 0.0f, AbstractC2527w.a(f11, j10), c0.f5468e, c0315s7, 14156166, 56);
                    R3.j.c("STEP 01 • START", null, j10, 0L, c0315s7, 390, 10);
                    p0.a(androidx.compose.foundation.layout.c.f(mVar, f9), dVar2, j9, 0.0f, 0.0f, AbstractC2527w.a(f11, j10), c0.f, c0315s7, 14156166, 56);
                    c0315s7.q(true);
                    AbstractC2701c.b(c0315s7, androidx.compose.foundation.layout.c.c(mVar, 12));
                    e1 e1Var3 = w0.f3580a;
                    u0.b("GOLD MATCH CENTER", null, j10, 0L, O0.l.f4031q, AbstractC2036a.H(2), new V0.k(3), 0L, 0, false, 0, 0, ((v0) c0315s7.j(e1Var3)).f3569e, c0315s7, 12779910, 0, 64858);
                    AbstractC2701c.b(c0315s7, androidx.compose.foundation.layout.c.c(mVar, 6));
                    u0.b("Leagues • Live Fixtures • Squads • Player Cards", null, ((C0249u) c0315s7.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, new V0.k(3), 0L, 0, false, 0, 0, ((v0) c0315s7.j(e1Var3)).f3574l, c0315s7, 6, 0, 65018);
                    AbstractC2701c.b(c0315s7, androidx.compose.foundation.layout.c.c(mVar, 10));
                    R3.j.f(androidx.compose.foundation.layout.b.h(mVar, 40, 0.0f, 2), c0315s7, 6, 0);
                    AbstractC2701c.b(c0315s7, androidx.compose.foundation.layout.c.c(mVar, f9));
                    C2686J a9 = AbstractC2685I.a(new C2703e(f9), gVar4, c0315s7, 54);
                    int p13 = AbstractC0329z.p(c0315s7);
                    InterfaceC0314r0 l13 = c0315s7.l();
                    b0.p c13 = b0.a.c(c0315s7, mVar);
                    c0315s7.b0();
                    if (c0315s7.f4530S) {
                        c0315s7.k(c2768z5);
                    } else {
                        c0315s7.l0();
                    }
                    AbstractC0329z.y(c0315s7, c2751h8, a9);
                    AbstractC0329z.y(c0315s7, c2751h9, l13);
                    if (c0315s7.f4530S || !kotlin.jvm.internal.l.a(c0315s7.M(), Integer.valueOf(p13))) {
                        AbstractC2107A.y(p13, c0315s7, p13, c2751h10);
                    }
                    AbstractC0329z.y(c0315s7, c2751h11, c13);
                    R3.j.c("⚡ LIVE", null, j10, 0L, c0315s7, 390, 10);
                    R3.j.c("⭐ TOP", null, V3.a.f5978h, 0L, c0315s7, 390, 10);
                    R3.j.c("🏆 PRO", null, j9, j10, c0315s7, 3462, 2);
                    c0315s7.q(true);
                    c0315s7.q(true);
                    break;
                } else {
                    c0315s7.S();
                    break;
                }
                break;
            case 7:
                C0315s c0315s8 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s8.B()) {
                    x0.O e5 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p14 = AbstractC0329z.p(c0315s8);
                    InterfaceC0314r0 l14 = c0315s8.l();
                    b0.p c14 = b0.a.c(c0315s8, mVar);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z6 = C2752i.f21830b;
                    c0315s8.b0();
                    if (c0315s8.f4530S) {
                        c0315s8.k(c2768z6);
                    } else {
                        c0315s8.l0();
                    }
                    AbstractC0329z.y(c0315s8, C2752i.f21833e, e5);
                    AbstractC0329z.y(c0315s8, C2752i.f21832d, l14);
                    C2751h c2751h12 = C2752i.f;
                    if (c0315s8.f4530S || !kotlin.jvm.internal.l.a(c0315s8.M(), Integer.valueOf(p14))) {
                        AbstractC2107A.y(p14, c0315s8, p14, c2751h12);
                    }
                    AbstractC0329z.y(c0315s8, C2752i.f21831c, c14);
                    M.G.a(AbstractC2346c.n(), null, androidx.compose.foundation.layout.c.f(mVar, 26), V3.a.f5975d, c0315s8, 3504, 0);
                    c0315s8.q(true);
                    break;
                } else {
                    c0315s8.S();
                    break;
                }
                break;
            case 8:
                C0315s c0315s9 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s9.B()) {
                    x0.O e6 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p15 = AbstractC0329z.p(c0315s9);
                    InterfaceC0314r0 l15 = c0315s9.l();
                    b0.p c15 = b0.a.c(c0315s9, mVar);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z7 = C2752i.f21830b;
                    c0315s9.b0();
                    if (c0315s9.f4530S) {
                        c0315s9.k(c2768z7);
                    } else {
                        c0315s9.l0();
                    }
                    AbstractC0329z.y(c0315s9, C2752i.f21833e, e6);
                    AbstractC0329z.y(c0315s9, C2752i.f21832d, l15);
                    C2751h c2751h13 = C2752i.f;
                    if (c0315s9.f4530S || !kotlin.jvm.internal.l.a(c0315s9.M(), Integer.valueOf(p15))) {
                        AbstractC2107A.y(p15, c0315s9, p15, c2751h13);
                    }
                    AbstractC0329z.y(c0315s9, C2752i.f21831c, c15);
                    M.G.a(G4.d.u(), null, androidx.compose.foundation.layout.c.f(mVar, 16), V3.a.f5975d, c0315s9, 3504, 0);
                    c0315s9.q(true);
                    break;
                } else {
                    c0315s9.S();
                    break;
                }
                break;
            case 9:
                C0315s c0315s10 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s10.B()) {
                    u0.b("Search by name or country", null, V3.a.K, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0315s10, 390, 0, 131066);
                    break;
                } else {
                    c0315s10.S();
                    break;
                }
            case 10:
                C0315s c0315s11 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s11.B()) {
                    M.G.a(AbstractC2036a.F(), null, null, V3.a.f5975d, c0315s11, 3120, 4);
                    break;
                } else {
                    c0315s11.S();
                    break;
                }
                break;
            case 11:
                C0315s c0315s12 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s12.B()) {
                    C2201e c2201e4 = G4.l.f2010b;
                    if (c2201e4 == null) {
                        C2200d c2200d3 = new C2200d("Filled.Close", false);
                        int i6 = o0.z.f18603a;
                        i0.M m7 = new i0.M(i0.p.f17289b);
                        C2202f c2202f3 = new C2202f(0);
                        c2202f3.m(19.0f, 6.41f);
                        c2202f3.k(17.59f, 5.0f);
                        c2202f3.k(12.0f, 10.59f);
                        c2202f3.k(6.41f, 5.0f);
                        c2202f3.k(5.0f, 6.41f);
                        c2202f3.k(10.59f, 12.0f);
                        c2202f3.k(5.0f, 17.59f);
                        c2202f3.k(6.41f, 19.0f);
                        c2202f3.k(12.0f, 13.41f);
                        c2202f3.k(17.59f, 19.0f);
                        c2202f3.k(19.0f, 17.59f);
                        c2202f3.k(13.41f, 12.0f);
                        c2202f3.e();
                        C2200d.a(c2200d3, c2202f3.f18548a, m7);
                        c2201e4 = c2200d3.b();
                        G4.l.f2010b = c2201e4;
                    }
                    M.G.a(c2201e4, "Clear", null, V3.a.f5975d, c0315s12, 3120, 4);
                    break;
                } else {
                    c0315s12.S();
                    break;
                }
            case 12:
                C0315s c0315s13 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s13.B()) {
                    x0.O e7 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p16 = AbstractC0329z.p(c0315s13);
                    InterfaceC0314r0 l16 = c0315s13.l();
                    b0.p c16 = b0.a.c(c0315s13, mVar);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z8 = C2752i.f21830b;
                    c0315s13.b0();
                    if (c0315s13.f4530S) {
                        c0315s13.k(c2768z8);
                    } else {
                        c0315s13.l0();
                    }
                    AbstractC0329z.y(c0315s13, C2752i.f21833e, e7);
                    AbstractC0329z.y(c0315s13, C2752i.f21832d, l16);
                    C2751h c2751h14 = C2752i.f;
                    if (c0315s13.f4530S || !kotlin.jvm.internal.l.a(c0315s13.M(), Integer.valueOf(p16))) {
                        AbstractC2107A.y(p16, c0315s13, p16, c2751h14);
                    }
                    AbstractC0329z.y(c0315s13, C2752i.f21831c, c16);
                    M.G.a(G4.d.s(), null, null, V3.a.f5975d, c0315s13, 3120, 4);
                    c0315s13.q(true);
                    break;
                } else {
                    c0315s13.S();
                    break;
                }
                break;
            case 13:
                C0315s c0315s14 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s14.B()) {
                    C2201e c2201e5 = G4.l.f2009a;
                    if (c2201e5 == null) {
                        C2200d c2200d4 = new C2200d("AutoMirrored.Filled.KeyboardArrowLeft", true);
                        int i7 = o0.z.f18603a;
                        i0.M m8 = new i0.M(i0.p.f17289b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C2209m(15.41f, 16.59f));
                        arrayList.add(new C2208l(10.83f, 12.0f));
                        arrayList.add(new C2213q(4.58f, -4.59f));
                        arrayList.add(new C2208l(14.0f, 6.0f));
                        arrayList.add(new C2213q(-6.0f, 6.0f));
                        arrayList.add(new C2213q(6.0f, 6.0f));
                        arrayList.add(new C2213q(1.41f, -1.41f));
                        arrayList.add(C2205i.f18558b);
                        C2200d.a(c2200d4, arrayList, m8);
                        c2201e5 = c2200d4.b();
                        G4.l.f2009a = c2201e5;
                    }
                    M.G.a(c2201e5, "Previous", null, V3.a.f5975d, c0315s14, 3120, 4);
                    break;
                } else {
                    c0315s14.S();
                    break;
                }
                break;
            default:
                C0315s c0315s15 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s15.B()) {
                    C2201e c2201e6 = N4.b.f3793a;
                    if (c2201e6 == null) {
                        C2200d c2200d5 = new C2200d("AutoMirrored.Filled.KeyboardArrowRight", true);
                        int i8 = o0.z.f18603a;
                        i0.M m9 = new i0.M(i0.p.f17289b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new C2209m(8.59f, 16.59f));
                        arrayList2.add(new C2208l(13.17f, 12.0f));
                        arrayList2.add(new C2208l(8.59f, 7.41f));
                        arrayList2.add(new C2208l(10.0f, 6.0f));
                        arrayList2.add(new C2213q(6.0f, 6.0f));
                        arrayList2.add(new C2213q(-6.0f, 6.0f));
                        arrayList2.add(new C2213q(-1.41f, -1.41f));
                        arrayList2.add(C2205i.f18558b);
                        C2200d.a(c2200d5, arrayList2, m9);
                        c2201e6 = c2200d5.b();
                        N4.b.f3793a = c2201e6;
                    }
                    M.G.a(c2201e6, "Next", null, V3.a.f5975d, c0315s15, 3120, 4);
                    break;
                } else {
                    c0315s15.S();
                    break;
                }
        }
        return oVar;
    }
}
