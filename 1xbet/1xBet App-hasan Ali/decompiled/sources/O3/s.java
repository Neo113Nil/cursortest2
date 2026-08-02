package O3;

import K0.C0196a;
import M.AbstractC0232c;
import M.g0;
import M.u0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import android.app.Activity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import game.betting133.sports1xbet.R;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import x0.O;
import z.AbstractC2685I;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.AbstractC2716r;
import z.C2681E;
import z.C2686J;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f4101a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final long f4102b = V3.a.f5969H;

    /* renamed from: c, reason: collision with root package name */
    public static final long f4103c = V3.a.f5970I;

    /* renamed from: d, reason: collision with root package name */
    public static final long f4104d = V3.a.J;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4105e = V3.a.f5963B;
    public static final long f = V3.a.f5982m;

    public final void a(String str, C0315s c0315s, int i) {
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-287956132);
        int i5 = i | (c0315s2.f(str) ? 4 : 2);
        if ((i5 & 19) == 18 && c0315s2.B()) {
            c0315s2.S();
        } else {
            b0.p b3 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f), 140), f4104d, D.e.a(8));
            O e3 = AbstractC2710l.e(b0.c.f7141o, false);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, b3);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, C2752i.f21833e, e3);
            AbstractC0329z.y(c0315s2, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h);
            }
            AbstractC0329z.y(c0315s2, C2752i.f21831c, c5);
            u0.b(str, null, f4105e, AbstractC2036a.H(18), O0.l.f4030p, 0L, new V0.k(3), 0L, 0, false, 0, 0, null, c0315s, (i5 & 14) | 200064, 0, 130514);
            c0315s2 = c0315s;
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new o(i, 0, this, str);
        }
    }

    public final void b(String str, InterfaceC2015a interfaceC2015a, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(-1948217208);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(str) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(interfaceC2015a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(this) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.p c5 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f), 44);
            D.d a5 = D.e.a(10);
            C2681E c2681e = AbstractC0232c.f3301a;
            g0.a(interfaceC2015a, c5, false, a5, AbstractC0232c.a(f, V3.a.f5963B, c0315s), null, null, X.e.d(-1415504232, new r(0, str), c0315s), c0315s, ((i5 >> 3) & 14) | 805306416, 484);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new B1.c(this, str, interfaceC2015a, i, 2);
        }
    }

    public final void c(q qVar, C0315s c0315s, int i) {
        int i5;
        C0315s c0315s2 = c0315s;
        c0315s2.Z(1410566123);
        if ((i & 6) == 0) {
            i5 = i | (c0315s2.f(qVar) ? 4 : 2);
        } else {
            i5 = i;
        }
        if ((i5 & 3) == 2 && c0315s2.B()) {
            c0315s2.S();
        } else {
            b0.g gVar = b0.c.f7147u;
            b0.m mVar = b0.m.f7161k;
            C2686J a5 = AbstractC2685I.a(AbstractC2706h.f21534a, gVar, c0315s2, 48);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, mVar);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s2, c2751h, a5);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s2, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s2, c2751h4, c5);
            AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.i(10));
            b0.p C5 = AbstractC2107A.C(mVar, 1.0f);
            C2717s a6 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s2, 0);
            int p6 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l6 = c0315s2.l();
            b0.p c6 = b0.a.c(c0315s2, C5);
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, c2751h, a6);
            AbstractC0329z.y(c0315s2, c2751h2, l6);
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s2, p6, c2751h3);
            }
            AbstractC0329z.y(c0315s2, c2751h4, c6);
            long j5 = V3.a.f5963B;
            long H5 = AbstractC2036a.H(15);
            O0.l lVar = O0.l.f4030p;
            u0.b(qVar.f4094a, null, j5, H5, lVar, 0L, null, 0L, 0, false, 0, 0, null, c0315s, 199680, 0, 131026);
            u0.b(qVar.f4095b, null, f4102b, AbstractC2036a.H(12), null, 0L, null, 0L, 0, false, 0, 0, null, c0315s, 3456, 0, 131058);
            c0315s.q(true);
            u0.b(qVar.f4096c, androidx.compose.foundation.layout.b.g(androidx.compose.foundation.a.b(mVar, f4103c, D.e.a(4)), 6, 2), j5, AbstractC2036a.H(10), lVar, 0L, null, 0L, 0, false, 0, 0, null, c0315s, 199680, 0, 131024);
            c0315s2 = c0315s;
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new p(i, 0, this, qVar);
        }
    }

    public final void d(q qVar, InterfaceC2015a interfaceC2015a, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(-948708327);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(qVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(interfaceC2015a) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p b3 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
            D.d a5 = D.e.a(16);
            D.d dVar = R3.j.f5218a;
            kotlin.jvm.internal.l.f("<this>", b3);
            b0.p f5 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.a.d(androidx.compose.foundation.a.b(AbstractC0444a.n(b3, a5), V3.a.f5990u, a5), false, null, interfaceC2015a, 7), 12);
            C2717s a6 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s, 0);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, f5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, a6);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            s sVar = f4101a;
            sVar.c(qVar, c0315s, (i5 & 14) | 48);
            float f6 = 10;
            AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f6));
            sVar.a(qVar.f4097d, c0315s, 48);
            AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f6));
            sVar.b(qVar.f4098e, interfaceC2015a, c0315s, (i5 & 112) | 384);
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new B1.c(this, qVar, interfaceC2015a, i, 1);
        }
    }

    public final void e(int i, C0315s c0315s) {
        c0315s.Z(-1817967937);
        if ((i & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            Object j5 = c0315s.j(AndroidCompositionLocals_androidKt.f6943b);
            Activity activity = j5 instanceof Activity ? (Activity) j5 : null;
            q qVar = new q(G4.l.M(R.string.static_ad_tile_title, c0315s), G4.l.M(R.string.static_ad_tile_description, c0315s), G4.l.M(R.string.static_ad_tile_badge, c0315s), G4.l.M(R.string.static_ad_tile_body, c0315s), G4.l.M(R.string.static_ad_tile_button, c0315s));
            c0315s.X(714372083);
            boolean h3 = c0315s.h(activity);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new n(activity, 0);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            d(qVar, (InterfaceC2015a) M5, c0315s, 384);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0196a(i, 1, this);
        }
    }
}
