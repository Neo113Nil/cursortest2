package H;

import A0.C0040k0;
import E.D0;
import E.W;
import H0.i;
import H0.j;
import H0.s;
import H0.u;
import K0.C0197b;
import K0.C0203h;
import K0.F;
import K0.G;
import K0.O;
import K0.v;
import L0.k;
import W0.m;
import a.AbstractC0444a;
import b0.o;
import i0.I;
import i0.InterfaceC2009n;
import i0.p;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.AbstractC2024d;
import k0.C2027g;
import kotlin.jvm.internal.l;
import m4.InterfaceC2105h;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import x0.AbstractC2617c;
import x0.C2628n;
import x0.N;
import x0.P;
import x0.Q;
import x0.Z;
import z0.AbstractC2739O;
import z0.AbstractC2749f;
import z0.C2733I;
import z0.InterfaceC2757n;
import z0.InterfaceC2765w;
import z0.v0;

/* loaded from: classes.dex */
public final class g extends o implements InterfaceC2765w, InterfaceC2757n, v0 {

    /* renamed from: A, reason: collision with root package name */
    public O0.d f2051A;

    /* renamed from: B, reason: collision with root package name */
    public int f2052B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2053C;

    /* renamed from: D, reason: collision with root package name */
    public int f2054D;

    /* renamed from: E, reason: collision with root package name */
    public int f2055E;

    /* renamed from: F, reason: collision with root package name */
    public Map f2056F;

    /* renamed from: G, reason: collision with root package name */
    public d f2057G;

    /* renamed from: H, reason: collision with root package name */
    public f f2058H;

    /* renamed from: I, reason: collision with root package name */
    public e f2059I;

    /* renamed from: y, reason: collision with root package name */
    public String f2060y;

    /* renamed from: z, reason: collision with root package name */
    public O f2061z;

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, N n5, int i) {
        return z0(abstractC2739O).a(i, abstractC2739O.getLayoutDirection());
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, N n5, int i) {
        return W.k(z0(abstractC2739O).e(abstractC2739O.getLayoutDirection()).e());
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, N n5, int i) {
        return z0(abstractC2739O).a(i, abstractC2739O.getLayoutDirection());
    }

    @Override // z0.InterfaceC2765w
    public final P f(Q q5, N n5, long j5) {
        long j6;
        boolean z3;
        v vVar;
        int i;
        d z02 = z0(q5);
        m layoutDirection = q5.getLayoutDirection();
        if (z02.f2034g > 1) {
            b bVar = z02.f2039m;
            O o5 = z02.f2030b;
            W0.c cVar = z02.i;
            l.c(cVar);
            O0.d dVar = z02.f2031c;
            if ((bVar == null || layoutDirection != bVar.f2021a || !l.a(o5, bVar.f2022b) || cVar.c() != bVar.f2023c.c() || dVar != bVar.f2024d) && ((bVar = b.f2020h) == null || layoutDirection != bVar.f2021a || !l.a(o5, bVar.f2022b) || cVar.c() != bVar.f2023c.c() || dVar != bVar.f2024d)) {
                bVar = new b(layoutDirection, F.h(o5, layoutDirection), cVar, dVar);
                b.f2020h = bVar;
            }
            z02.f2039m = bVar;
            int i5 = z02.f2034g;
            float f = bVar.f2026g;
            float f5 = bVar.f;
            if (Float.isNaN(f) || Float.isNaN(f5)) {
                float b3 = F.a(c.f2027a, bVar.f2025e, W0.b.b(0, 0, 15), bVar.f2023c, bVar.f2024d, 1, 96).b();
                float b5 = F.a(c.f2028b, bVar.f2025e, W0.b.b(0, 0, 15), bVar.f2023c, bVar.f2024d, 2, 96).b() - b3;
                bVar.f2026g = b3;
                bVar.f = b5;
                f5 = b5;
                f = b3;
            }
            if (i5 != 1) {
                int round = Math.round((f5 * (i5 - 1)) + f);
                i = round >= 0 ? round : 0;
                int g5 = W0.a.g(j5);
                if (i > g5) {
                    i = g5;
                }
            } else {
                i = W0.a.i(j5);
            }
            j6 = W0.b.a(W0.a.j(j5), W0.a.h(j5), i, W0.a.g(j5));
        } else {
            j6 = j5;
        }
        C0197b c0197b = z02.f2036j;
        if (c0197b == null || (vVar = z02.f2040n) == null || vVar.c() || layoutDirection != z02.f2041o || (!W0.a.b(j6, z02.f2042p) && (W0.a.h(j6) != W0.a.h(z02.f2042p) || W0.a.g(j6) < c0197b.b() || c0197b.f2815d.f3017d))) {
            C0197b b6 = z02.b(j6, layoutDirection);
            z02.f2042p = j6;
            long d5 = W0.b.d(j6, AbstractC0444a.b(W.k(b6.d()), W.k(b6.b())));
            z02.f2038l = d5;
            z02.f2037k = z02.f2032d != 3 && (((float) ((int) (d5 >> 32))) < b6.d() || ((float) ((int) (d5 & 4294967295L))) < b6.b());
            z02.f2036j = b6;
            z3 = true;
        } else {
            if (!W0.a.b(j6, z02.f2042p)) {
                C0197b c0197b2 = z02.f2036j;
                l.c(c0197b2);
                long d6 = W0.b.d(j6, AbstractC0444a.b(W.k(Math.min(c0197b2.f2812a.f5262s.c(), c0197b2.d())), W.k(c0197b2.b())));
                z02.f2038l = d6;
                z02.f2037k = z02.f2032d != 3 && (((float) ((int) (d6 >> 32))) < c0197b2.d() || ((float) ((int) (d6 & 4294967295L))) < c0197b2.b());
                z02.f2042p = j6;
            }
            z3 = false;
        }
        v vVar2 = z02.f2040n;
        if (vVar2 != null) {
            vVar2.c();
        }
        C0197b c0197b3 = z02.f2036j;
        l.c(c0197b3);
        long j7 = z02.f2038l;
        if (z3) {
            AbstractC2749f.t(this, 2).P0();
            Map map = this.f2056F;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            C2628n c2628n = AbstractC2617c.f20985a;
            k kVar = c0197b3.f2815d;
            map.put(c2628n, Integer.valueOf(Math.round(kVar.d(0))));
            map.put(AbstractC2617c.f20986b, Integer.valueOf(Math.round(kVar.d(kVar.f3019g - 1))));
            this.f2056F = map;
        }
        int i6 = (int) (j7 >> 32);
        int i7 = (int) (j7 & 4294967295L);
        Z e3 = n5.e(AbstractC2349a.u(i6, i6, i7, i7));
        Map map2 = this.f2056F;
        l.c(map2);
        return q5.i(i6, i7, map2, new D0(e3, 1));
    }

    @Override // z0.InterfaceC2757n
    public final /* synthetic */ void f0() {
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        if (this.f7175x) {
            d z02 = z0(c2733i);
            C0197b c0197b = z02.f2036j;
            if (c0197b == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f2057G + ", textSubstitution=" + this.f2059I + ')').toString());
            }
            InterfaceC2009n v4 = c2733i.f21647k.f17540l.v();
            boolean z3 = z02.f2037k;
            if (z3) {
                long j5 = z02.f2038l;
                v4.k();
                v4.f(0.0f, 0.0f, (int) (j5 >> 32), (int) (j5 & 4294967295L), 1);
            }
            try {
                G g5 = this.f2061z.f2805a;
                V0.l lVar = g5.f2774m;
                if (lVar == null) {
                    lVar = V0.l.f5944b;
                }
                V0.l lVar2 = lVar;
                I i = g5.f2775n;
                if (i == null) {
                    i = I.f17244d;
                }
                I i5 = i;
                AbstractC2024d abstractC2024d = g5.f2776o;
                if (abstractC2024d == null) {
                    abstractC2024d = C2027g.f17547b;
                }
                AbstractC2024d abstractC2024d2 = abstractC2024d;
                i0.F d5 = g5.f2764a.d();
                if (d5 != null) {
                    c0197b.g(v4, d5, this.f2061z.f2805a.f2764a.a(), i5, lVar2, abstractC2024d2);
                } else {
                    long j6 = p.f17293g;
                    if (j6 == 16) {
                        j6 = this.f2061z.b() != 16 ? this.f2061z.b() : p.f17289b;
                    }
                    c0197b.f(v4, j6, i5, lVar2, abstractC2024d2);
                }
                if (z3) {
                    v4.j();
                }
            } catch (Throwable th) {
                if (z3) {
                    v4.j();
                }
                throw th;
            }
        }
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, N n5, int i) {
        return W.k(z0(abstractC2739O).e(abstractC2739O.getLayoutDirection()).b());
    }

    @Override // z0.v0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // z0.v0
    public final void j0(j jVar) {
        f fVar = this.f2058H;
        if (fVar == null) {
            fVar = new f(this, 0);
            this.f2058H = fVar;
        }
        C0203h c0203h = new C0203h(this.f2060y, null, 6);
        InterfaceC2105h[] interfaceC2105hArr = u.f2183a;
        jVar.f(s.f2144A, AbstractC2346c.A(c0203h));
        e eVar = this.f2059I;
        if (eVar != null) {
            boolean z3 = eVar.f2047c;
            H0.v vVar = s.f2146C;
            InterfaceC2105h[] interfaceC2105hArr2 = u.f2183a;
            InterfaceC2105h interfaceC2105h = interfaceC2105hArr2[16];
            vVar.a(jVar, Boolean.valueOf(z3));
            C0203h c0203h2 = new C0203h(eVar.f2046b, null, 6);
            H0.v vVar2 = s.f2145B;
            InterfaceC2105h interfaceC2105h2 = interfaceC2105hArr2[15];
            vVar2.a(jVar, c0203h2);
        }
        jVar.f(i.f2087k, new H0.a(null, new f(this, 1)));
        jVar.f(i.f2088l, new H0.a(null, new f(this, 2)));
        jVar.f(i.f2089m, new H0.a(null, new C0040k0(10, this)));
        u.a(jVar, fVar);
    }

    public final d y0() {
        if (this.f2057G == null) {
            this.f2057G = new d(this.f2060y, this.f2061z, this.f2051A, this.f2052B, this.f2053C, this.f2054D, this.f2055E);
        }
        d dVar = this.f2057G;
        l.c(dVar);
        return dVar;
    }

    public final d z0(W0.c cVar) {
        d dVar;
        e eVar = this.f2059I;
        if (eVar != null && eVar.f2047c && (dVar = eVar.f2048d) != null) {
            dVar.d(cVar);
            return dVar;
        }
        d y02 = y0();
        y02.d(cVar);
        return y02;
    }
}
