package R3;

import M.G;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import i0.M;
import java.util.ArrayList;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.C2205i;
import o0.C2206j;
import o0.C2208l;
import o0.C2209m;
import o0.C2212p;
import o0.C2213q;
import o0.z;
import r0.AbstractC2346c;
import t3.AbstractC2425d;
import x0.O;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class p implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final p f5238l = new p(0);

    /* renamed from: m, reason: collision with root package name */
    public static final p f5239m = new p(1);

    /* renamed from: n, reason: collision with root package name */
    public static final p f5240n = new p(2);

    /* renamed from: o, reason: collision with root package name */
    public static final p f5241o = new p(3);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5242k;

    public /* synthetic */ p(int i) {
        this.f5242k = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        b0.m mVar = b0.m.f7161k;
        W3.o oVar = W3.o.f6046a;
        switch (this.f5242k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s.B()) {
                    O e3 = AbstractC2710l.e(b0.c.f7141o, false);
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
                    C2201e c2201e = AbstractC2425d.f;
                    if (c2201e == null) {
                        C2200d c2200d = new C2200d("Filled.SignalWifiStatusbarConnectedNoInternet4", false);
                        int i = z.f18603a;
                        long j5 = i0.p.f17289b;
                        M m5 = new M(j5);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C2209m(12.0f, 4.0f));
                        arrayList.add(new C2206j(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f));
                        arrayList.add(new C2208l(12.0f, 21.0f));
                        arrayList.add(new C2213q(5.0f, -5.01f));
                        arrayList.add(new o0.t(8.0f));
                        arrayList.add(new C2212p(5.92f));
                        arrayList.add(new C2206j(19.97f, 5.51f, 16.16f, 4.0f, 12.0f, 4.0f));
                        C2205i c2205i = C2205i.f18558b;
                        arrayList.add(c2205i);
                        C2200d.a(c2200d, arrayList, m5);
                        M m6 = new M(j5);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new C2209m(19.0f, 18.0f));
                        arrayList2.add(new C2212p(2.0f));
                        arrayList2.add(new o0.s(2.0f));
                        arrayList2.add(new C2212p(-2.0f));
                        arrayList2.add(c2205i);
                        C2200d.a(c2200d, arrayList2, m6);
                        M m7 = new M(j5);
                        ArrayList arrayList3 = new ArrayList(32);
                        arrayList3.add(new C2209m(19.0f, 10.0f));
                        arrayList3.add(new C2212p(2.0f));
                        arrayList3.add(new o0.s(6.0f));
                        arrayList3.add(new C2212p(-2.0f));
                        arrayList3.add(c2205i);
                        C2200d.a(c2200d, arrayList3, m7);
                        c2201e = c2200d.b();
                        AbstractC2425d.f = c2201e;
                    }
                    G.a(c2201e, null, androidx.compose.foundation.layout.c.f(mVar, 36), V3.a.f5975d, c0315s, 3504, 0);
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
                    C2201e c2201e2 = G4.d.f1991a;
                    if (c2201e2 == null) {
                        C2200d c2200d2 = new C2200d("AutoMirrored.Filled.ArrowBack", true);
                        int i5 = z.f18603a;
                        M m8 = new M(i0.p.f17289b);
                        C2202f c2202f = new C2202f(0);
                        c2202f.m(20.0f, 11.0f);
                        c2202f.i(7.83f);
                        c2202f.l(5.59f, -5.59f);
                        c2202f.k(12.0f, 4.0f);
                        c2202f.l(-8.0f, 8.0f);
                        c2202f.l(8.0f, 8.0f);
                        c2202f.l(1.41f, -1.41f);
                        c2202f.k(7.83f, 13.0f);
                        c2202f.i(20.0f);
                        c2202f.r(-2.0f);
                        c2202f.e();
                        C2200d.a(c2200d2, c2202f.f18548a, m8);
                        c2201e2 = c2200d2.b();
                        G4.d.f1991a = c2201e2;
                    }
                    G.a(c2201e2, "Back", null, V3.a.f5975d, c0315s2, 3120, 4);
                    break;
                } else {
                    c0315s2.S();
                    break;
                }
                break;
            case 2:
                C0315s c0315s3 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s3.B()) {
                    O e5 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p6 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l6 = c0315s3.l();
                    b0.p c6 = b0.a.c(c0315s3, mVar);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z2);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21833e, e5);
                    AbstractC0329z.y(c0315s3, C2752i.f21832d, l6);
                    C2751h c2751h2 = C2752i.f;
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s3, p6, c2751h2);
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21831c, c6);
                    G.a(AbstractC2346c.u(), null, androidx.compose.foundation.layout.c.f(mVar, 18), V3.a.f5975d, c0315s3, 3504, 0);
                    c0315s3.q(true);
                    break;
                } else {
                    c0315s3.S();
                    break;
                }
                break;
            default:
                C0315s c0315s4 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s4.B()) {
                    O e6 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p7 = AbstractC0329z.p(c0315s4);
                    InterfaceC0314r0 l7 = c0315s4.l();
                    b0.p c7 = b0.a.c(c0315s4, mVar);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z3 = C2752i.f21830b;
                    c0315s4.b0();
                    if (c0315s4.f4530S) {
                        c0315s4.k(c2768z3);
                    } else {
                        c0315s4.l0();
                    }
                    AbstractC0329z.y(c0315s4, C2752i.f21833e, e6);
                    AbstractC0329z.y(c0315s4, C2752i.f21832d, l7);
                    C2751h c2751h3 = C2752i.f;
                    if (c0315s4.f4530S || !kotlin.jvm.internal.l.a(c0315s4.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s4, p7, c2751h3);
                    }
                    AbstractC0329z.y(c0315s4, C2752i.f21831c, c7);
                    C2201e c2201e3 = AbstractC0444a.f6359c;
                    if (c2201e3 == null) {
                        C2200d c2200d3 = new C2200d("Filled.Inbox", false);
                        int i6 = z.f18603a;
                        M m9 = new M(i0.p.f17289b);
                        C2202f c2202f2 = new C2202f(0);
                        c2202f2.m(19.0f, 3.0f);
                        c2202f2.k(4.99f, 3.0f);
                        c2202f2.g(-1.11f, 0.0f, -1.98f, 0.89f, -1.98f, 2.0f);
                        c2202f2.k(3.0f, 19.0f);
                        c2202f2.g(0.0f, 1.1f, 0.88f, 2.0f, 1.99f, 2.0f);
                        c2202f2.k(19.0f, 21.0f);
                        c2202f2.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c2202f2.k(21.0f, 5.0f);
                        c2202f2.g(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
                        c2202f2.e();
                        c2202f2.m(19.0f, 15.0f);
                        c2202f2.j(-4.0f);
                        c2202f2.g(0.0f, 1.66f, -1.35f, 3.0f, -3.0f, 3.0f);
                        c2202f2.o(-3.0f, -1.34f, -3.0f, -3.0f);
                        c2202f2.k(4.99f, 15.0f);
                        c2202f2.k(4.99f, 5.0f);
                        c2202f2.k(19.0f, 5.0f);
                        c2202f2.r(10.0f);
                        c2202f2.e();
                        C2200d.a(c2200d3, c2202f2.f18548a, m9);
                        c2201e3 = c2200d3.b();
                        AbstractC0444a.f6359c = c2201e3;
                    }
                    G.a(c2201e3, null, androidx.compose.foundation.layout.c.f(mVar, 24), V3.a.f5975d, c0315s4, 3504, 0);
                    c0315s4.q(true);
                    break;
                } else {
                    c0315s4.S();
                    break;
                }
                break;
        }
        return oVar;
    }
}
