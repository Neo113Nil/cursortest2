package I;

import E.F0;
import K0.C0203h;
import P0.C0331a;
import h0.C1989c;
import h0.C1991e;
import java.util.List;
import r0.AbstractC2346c;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final C0203h f2412a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2413b;

    /* renamed from: c, reason: collision with root package name */
    public final K0.L f2414c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.q f2415d;

    /* renamed from: e, reason: collision with root package name */
    public final V f2416e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public final C0203h f2417g;

    /* renamed from: h, reason: collision with root package name */
    public final P0.w f2418h;
    public final F0 i;

    public L(P0.w wVar, P0.q qVar, F0 f02, V v4) {
        C0203h c0203h = wVar.f4679a;
        K0.L l5 = f02 != null ? f02.f1029a : null;
        long j5 = wVar.f4680b;
        this.f2412a = c0203h;
        this.f2413b = j5;
        this.f2414c = l5;
        this.f2415d = qVar;
        this.f2416e = v4;
        this.f = j5;
        this.f2417g = c0203h;
        this.f2418h = wVar;
        this.i = f02;
    }

    public final List a(i4.c cVar) {
        if (!K0.N.b(this.f)) {
            return X3.n.O(new C0331a("", 0), new P0.v(K0.N.e(this.f), K0.N.e(this.f)));
        }
        P0.g gVar = (P0.g) cVar.c(this);
        if (gVar != null) {
            return AbstractC2346c.A(gVar);
        }
        return null;
    }

    public final Integer b() {
        K0.L l5 = this.f2414c;
        if (l5 == null) {
            return null;
        }
        int d5 = K0.N.d(this.f);
        P0.q qVar = this.f2415d;
        return Integer.valueOf(qVar.a(l5.d(l5.e(qVar.b(d5)), true)));
    }

    public final Integer c() {
        int length;
        K0.L l5 = this.f2414c;
        if (l5 == null) {
            return null;
        }
        int p5 = p();
        while (true) {
            C0203h c0203h = this.f2412a;
            if (p5 < c0203h.f2829l.length()) {
                int length2 = this.f2417g.f2829l.length() - 1;
                if (p5 <= length2) {
                    length2 = p5;
                }
                long k5 = l5.k(length2);
                int i = K0.N.f2802c;
                int i5 = (int) (k5 & 4294967295L);
                if (i5 > p5) {
                    length = this.f2415d.a(i5);
                    break;
                }
                p5++;
            } else {
                length = c0203h.f2829l.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int i;
        K0.L l5 = this.f2414c;
        if (l5 == null) {
            return null;
        }
        int p5 = p();
        while (true) {
            if (p5 <= 0) {
                i = 0;
                break;
            }
            int length = this.f2417g.f2829l.length() - 1;
            if (p5 <= length) {
                length = p5;
            }
            long k5 = l5.k(length);
            int i5 = K0.N.f2802c;
            int i6 = (int) (k5 >> 32);
            if (i6 < p5) {
                i = this.f2415d.a(i6);
                break;
            }
            p5--;
        }
        return Integer.valueOf(i);
    }

    public final boolean e() {
        K0.L l5 = this.f2414c;
        return (l5 != null ? l5.i(p()) : null) != V0.j.f5941l;
    }

    public final int f(K0.L l5, int i) {
        int p5 = p();
        V v4 = this.f2416e;
        if (v4.f2454a == null) {
            v4.f2454a = Float.valueOf(l5.c(p5).f17193a);
        }
        int e3 = l5.e(p5) + i;
        if (e3 < 0) {
            return 0;
        }
        K0.r rVar = l5.f2793b;
        if (e3 >= rVar.f) {
            return this.f2417g.f2829l.length();
        }
        float b3 = rVar.b(e3) - 1;
        Float f = v4.f2454a;
        kotlin.jvm.internal.l.c(f);
        float floatValue = f.floatValue();
        if ((e() && floatValue >= l5.g(e3)) || (!e() && floatValue <= l5.f(e3))) {
            return l5.d(e3, true);
        }
        return this.f2415d.a(rVar.e(G4.d.d(f.floatValue(), b3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(F0 f02, int i) {
        C1989c c1989c;
        InterfaceC2637x interfaceC2637x = f02.f1030b;
        if (interfaceC2637x != null) {
            InterfaceC2637x interfaceC2637x2 = f02.f1031c;
            c1989c = interfaceC2637x2 != null ? interfaceC2637x2.s(interfaceC2637x, true) : null;
        }
        c1989c = C1989c.f17192e;
        long j5 = this.f2418h.f4680b;
        int i5 = K0.N.f2802c;
        P0.q qVar = this.f2415d;
        int b3 = qVar.b((int) (j5 & 4294967295L));
        K0.L l5 = f02.f1029a;
        C1989c c5 = l5.c(b3);
        return qVar.a(l5.f2793b.e(G4.d.d(c5.f17193a, (C1991e.b(c1989c.b()) * i) + c5.f17194b)));
    }

    public final void h() {
        C0203h c0203h = this.f2417g;
        V v4 = this.f2416e;
        v4.f2454a = null;
        if (c0203h.f2829l.length() > 0) {
            if (e()) {
                v4.f2454a = null;
                if (c0203h.f2829l.length() > 0) {
                    String str = c0203h.f2829l;
                    long j5 = this.f;
                    int i = K0.N.f2802c;
                    int p5 = E.W.p(str, (int) (j5 & 4294967295L));
                    if (p5 != -1) {
                        o(p5, p5);
                        return;
                    }
                    return;
                }
                return;
            }
            v4.f2454a = null;
            if (c0203h.f2829l.length() > 0) {
                String str2 = c0203h.f2829l;
                long j6 = this.f;
                int i5 = K0.N.f2802c;
                int m5 = E.W.m(str2, (int) (j6 & 4294967295L));
                if (m5 != -1) {
                    o(m5, m5);
                }
            }
        }
    }

    public final void i() {
        this.f2416e.f2454a = null;
        C0203h c0203h = this.f2417g;
        if (c0203h.f2829l.length() > 0) {
            int d5 = K0.N.d(this.f);
            String str = c0203h.f2829l;
            int n5 = E.W.n(str, d5);
            if (n5 == K0.N.d(this.f) && n5 != str.length()) {
                n5 = E.W.n(str, n5 + 1);
            }
            o(n5, n5);
        }
    }

    public final void j() {
        this.f2416e.f2454a = null;
        C0203h c0203h = this.f2417g;
        if (c0203h.f2829l.length() > 0) {
            int e3 = K0.N.e(this.f);
            String str = c0203h.f2829l;
            int o5 = E.W.o(str, e3);
            if (o5 == K0.N.e(this.f) && o5 != 0) {
                o5 = E.W.o(str, o5 - 1);
            }
            o(o5, o5);
        }
    }

    public final void k() {
        C0203h c0203h = this.f2417g;
        V v4 = this.f2416e;
        v4.f2454a = null;
        if (c0203h.f2829l.length() > 0) {
            if (e()) {
                v4.f2454a = null;
                if (c0203h.f2829l.length() > 0) {
                    String str = c0203h.f2829l;
                    long j5 = this.f;
                    int i = K0.N.f2802c;
                    int m5 = E.W.m(str, (int) (j5 & 4294967295L));
                    if (m5 != -1) {
                        o(m5, m5);
                        return;
                    }
                    return;
                }
                return;
            }
            v4.f2454a = null;
            if (c0203h.f2829l.length() > 0) {
                String str2 = c0203h.f2829l;
                long j6 = this.f;
                int i5 = K0.N.f2802c;
                int p5 = E.W.p(str2, (int) (j6 & 4294967295L));
                if (p5 != -1) {
                    o(p5, p5);
                }
            }
        }
    }

    public final void l() {
        Integer b3;
        this.f2416e.f2454a = null;
        if (this.f2417g.f2829l.length() <= 0 || (b3 = b()) == null) {
            return;
        }
        int intValue = b3.intValue();
        o(intValue, intValue);
    }

    public final void m() {
        Integer num = null;
        this.f2416e.f2454a = null;
        if (this.f2417g.f2829l.length() > 0) {
            K0.L l5 = this.f2414c;
            if (l5 != null) {
                int e3 = K0.N.e(this.f);
                P0.q qVar = this.f2415d;
                num = Integer.valueOf(qVar.a(l5.h(l5.e(qVar.b(e3)))));
            }
            if (num != null) {
                int intValue = num.intValue();
                o(intValue, intValue);
            }
        }
    }

    public final void n() {
        if (this.f2417g.f2829l.length() > 0) {
            int i = K0.N.f2802c;
            this.f = K0.F.b((int) (this.f2413b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void o(int i, int i5) {
        this.f = K0.F.b(i, i5);
    }

    public final int p() {
        long j5 = this.f;
        int i = K0.N.f2802c;
        return this.f2415d.b((int) (j5 & 4294967295L));
    }
}
