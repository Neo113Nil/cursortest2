package O3;

import A.C0003c;
import M.AbstractC0251w;
import M.C0249u;
import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import S3.X;
import S3.g0;
import game.betting133.sports1xbet.aqua_network.AquaClubSheet;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaPhaseBoard;
import game.betting133.sports1xbet.aqua_network.AquaRosterDigest;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import u2.AbstractC2490e;
import u2.C2486a;
import u2.C2487b;
import u2.C2488c;
import u2.C2489d;
import u2.w;
import v.AbstractC2527w;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.C2686J;
import z.C2687K;
import z.C2703e;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class r implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4099k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4100l;

    public /* synthetic */ r(int i, Object obj) {
        this.f4099k = i;
        this.f4100l = obj;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f4099k) {
            case 0:
                C0315s c0315s = (C0315s) obj2;
                int intValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Button", (C2687K) obj);
                if ((intValue & 17) == 16 && c0315s.B()) {
                    c0315s.S();
                } else {
                    u0.b((String) this.f4100l, null, 0L, AbstractC2036a.H(15), O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, null, c0315s, 199680, 0, 131030);
                }
                return W3.o.f6046a;
            case 1:
                C0315s c0315s2 = (C0315s) obj2;
                int intValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C0003c) obj);
                if ((intValue2 & 17) == 16 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    p0.a(androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f), R3.j.f5218a, V3.a.f5962A, 2, 10, AbstractC2527w.a(1, i0.p.b(0.3f, V3.a.f5995z)), X.e.d(467393506, new P.r(4, (AquaMatchCard) this.f4100l), c0315s2), c0315s2, 14377398, 8);
                }
                return W3.o.f6046a;
            case 2:
                C0315s c0315s3 = (C0315s) obj2;
                int intValue3 = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C0003c) obj);
                if ((intValue3 & 17) == 16 && c0315s3.B()) {
                    c0315s3.S();
                } else {
                    p0.a(androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f), R3.j.f5218a, V3.a.f5962A, 2, 10, AbstractC2527w.a(1, i0.p.b(0.3f, V3.a.f5995z)), X.e.d(-1456396566, new P.r(5, (AquaPhaseBoard) this.f4100l), c0315s3), c0315s3, 14377398, 8);
                }
                return W3.o.f6046a;
            case 3:
                C0315s c0315s4 = (C0315s) obj2;
                int intValue4 = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C0003c) obj);
                if ((intValue4 & 17) == 16 && c0315s4.B()) {
                    c0315s4.S();
                } else {
                    p0.a(androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f), R3.j.f5218a, V3.a.f5962A, 4, 10, AbstractC2527w.a(1, i0.p.b(0.45f, V3.a.f5995z)), X.e.d(1911383906, new X((AquaClubSheet) this.f4100l, 1), c0315s4), c0315s4, 14377398, 8);
                }
                return W3.o.f6046a;
            case 4:
                C0315s c0315s5 = (C0315s) obj2;
                int intValue5 = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C0003c) obj);
                if ((intValue5 & 17) == 16 && c0315s5.B()) {
                    c0315s5.S();
                } else {
                    b0.m mVar = b0.m.f7161k;
                    float f = 4;
                    b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.b(mVar, 1.0f), 0.0f, f, 1);
                    m mVar2 = AbstractC2706h.f21538e;
                    b0.g gVar = b0.c.f7147u;
                    C2686J a5 = AbstractC2685I.a(mVar2, gVar, c0315s5, 54);
                    int p5 = AbstractC0329z.p(c0315s5);
                    InterfaceC0314r0 l5 = c0315s5.l();
                    b0.p c5 = b0.a.c(c0315s5, h3);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s5.b0();
                    if (c0315s5.f4530S) {
                        c0315s5.k(c2768z);
                    } else {
                        c0315s5.l0();
                    }
                    C2751h c2751h = C2752i.f21833e;
                    AbstractC0329z.y(c0315s5, c2751h, a5);
                    C2751h c2751h2 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s5, c2751h2, l5);
                    C2751h c2751h3 = C2752i.f;
                    if (c0315s5.f4530S || !kotlin.jvm.internal.l.a(c0315s5.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s5, p5, c2751h3);
                    }
                    C2751h c2751h4 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s5, c2751h4, c5);
                    C2686J r5 = L1.a.r(6, gVar, c0315s5, 54);
                    int p6 = AbstractC0329z.p(c0315s5);
                    InterfaceC0314r0 l6 = c0315s5.l();
                    b0.p c6 = b0.a.c(c0315s5, mVar);
                    c0315s5.b0();
                    if (c0315s5.f4530S) {
                        c0315s5.k(c2768z);
                    } else {
                        c0315s5.l0();
                    }
                    AbstractC0329z.y(c0315s5, c2751h, r5);
                    AbstractC0329z.y(c0315s5, c2751h2, l6);
                    if (c0315s5.f4530S || !kotlin.jvm.internal.l.a(c0315s5.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s5, p6, c2751h3);
                    }
                    AbstractC0329z.y(c0315s5, c2751h4, c6);
                    D.d a6 = D.e.a(f);
                    long j5 = V3.a.f;
                    b0.p f5 = androidx.compose.foundation.layout.c.f(mVar, 28);
                    long j6 = V3.a.f5975d;
                    p0.a(f5, a6, j5, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.4f, j6)), g0.f5490a, c0315s5, 14156166, 56);
                    u0.b("Players", null, ((C0249u) c0315s5.j(AbstractC0251w.f3578a)).f3539o, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s5.j(w0.f3580a)).i, c0315s5, 196614, 0, 65498);
                    c0315s5.q(true);
                    C2686J a7 = AbstractC2685I.a(new C2703e(f), gVar, c0315s5, 54);
                    int p7 = AbstractC0329z.p(c0315s5);
                    InterfaceC0314r0 l7 = c0315s5.l();
                    b0.p c7 = b0.a.c(c0315s5, mVar);
                    c0315s5.b0();
                    if (c0315s5.f4530S) {
                        c0315s5.k(c2768z);
                    } else {
                        c0315s5.l0();
                    }
                    AbstractC0329z.y(c0315s5, c2751h, a7);
                    AbstractC0329z.y(c0315s5, c2751h2, l7);
                    if (c0315s5.f4530S || !kotlin.jvm.internal.l.a(c0315s5.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s5, p7, c2751h3);
                    }
                    AbstractC0329z.y(c0315s5, c2751h4, c7);
                    R3.j.b(AbstractC2036a.y(), null, j6, 12, c0315s5, 3456);
                    R3.j.c(String.valueOf(((AquaRosterDigest) this.f4100l).getRoster_par_Members().size()), null, j6, 0L, c0315s5, 384, 10);
                    c0315s5.q(true);
                    c0315s5.q(true);
                }
                return W3.o.f6046a;
            default:
                w wVar = (w) obj;
                C0315s c0315s6 = (C0315s) obj2;
                int intValue6 = ((Number) obj3).intValue();
                if ((intValue6 & 14) == 0) {
                    intValue6 |= c0315s6.f(wVar) ? 4 : 2;
                }
                if ((intValue6 & 91) == 18 && c0315s6.B()) {
                    c0315s6.S();
                } else {
                    AbstractC2490e abstractC2490e = (AbstractC2490e) wVar.f20048b.f20020z.getValue();
                    if (abstractC2490e instanceof C2488c) {
                        c0315s6.Y(1739512213);
                        R3.s.f5245a.e(wVar, abstractC2490e, c0315s6, Integer.valueOf((intValue6 & 14) | 64));
                        c0315s6.q(false);
                    } else {
                        if (abstractC2490e instanceof C2489d) {
                            c0315s6.Y(1739605461);
                            c0315s6.q(false);
                        } else if (abstractC2490e instanceof C2487b) {
                            c0315s6.Y(1739696601);
                            ((X.d) this.f4100l).e(wVar, abstractC2490e, c0315s6, Integer.valueOf((intValue6 & 14) | 64));
                            c0315s6.q(false);
                        } else {
                            if (!(abstractC2490e instanceof C2486a)) {
                                c0315s6.Y(-82435959);
                                c0315s6.q(false);
                                throw new D2.e();
                            }
                            c0315s6.Y(1739782316);
                            c0315s6.q(false);
                        }
                        u2.n.b(wVar, null, null, null, null, 0.0f, false, c0315s6, intValue6 & 14);
                    }
                }
                return W3.o.f6046a;
        }
    }

    public r(X.d dVar) {
        this.f4099k = 5;
        X.d dVar2 = R3.s.f5245a;
        this.f4100l = dVar;
    }
}
