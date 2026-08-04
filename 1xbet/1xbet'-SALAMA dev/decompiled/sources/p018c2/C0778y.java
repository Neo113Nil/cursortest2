package p018c2;

import A1.C0022h0;
import A1.P0;
import A1.Q0;
import A1.R0;
import android.util.Pair;
import p146u2.U;
import p146u2.r;
import p151v2.a;
import p151v2.t;

/* JADX INFO: renamed from: c2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0778y extends AbstractC0764j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0755a f10417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q0 f10419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final P0 f10420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0776w f10421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0775v f10422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10425s;

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    public C0778y(AbstractC0755a abstractC0755a, boolean z4) {
        boolean z7;
        this.f10417k = abstractC0755a;
        if (z4) {
            abstractC0755a.getClass();
            if (abstractC0755a instanceof C0771q) {
                z7 = false;
            } else {
                z7 = true;
            }
        } else {
            z7 = false;
        }
        this.f10418l = z7;
        this.f10419m = new Q0();
        this.f10420n = new P0();
        R0 r0F = abstractC0755a.f();
        if (r0F == null) {
            this.f10421o = new C0776w(new C0777x(abstractC0755a.g()), Q0.f200I, C0776w.f10413e);
        } else {
            this.f10421o = new C0776w(r0F, null, null);
            this.f10425s = true;
        }
    }

    @Override // p018c2.AbstractC0755a
    public final C0022h0 g() {
        return this.f10417k.g();
    }

    @Override // p018c2.AbstractC0755a
    public final void j(U u4) {
        this.j = u4;
        this.f10366i = t.m(null);
        if (this.f10418l) {
            return;
        }
        this.f10423q = true;
        t(null, this.f10417k);
    }

    @Override // p018c2.AbstractC0755a
    public final void l(B b7) {
        C0775v c0775v = (C0775v) b7;
        if (c0775v.f10410e != null) {
            AbstractC0755a abstractC0755a = c0775v.f10409d;
            abstractC0755a.getClass();
            abstractC0755a.l(c0775v.f10410e);
        }
        if (b7 == this.f10422p) {
            this.f10422p = null;
        }
    }

    @Override // p018c2.AbstractC0764j, p018c2.AbstractC0755a
    public final void n() {
        this.f10424r = false;
        this.f10423q = false;
        super.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p018c2.AbstractC0764j
    public final D q(C0769o c0769o, D d7) {
        Object obj = d7.f10161a;
        Object obj2 = this.f10421o.f10415d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0776w.f10413e;
        }
        return d7.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p018c2.AbstractC0764j
    public final void s(C0769o c0769o, R0 r7) {
        long j;
        C0776w c0776w;
        D dB;
        C0776w c0776w2;
        C0775v c0775v;
        long j3;
        B bA;
        if (this.f10424r) {
            C0776w c0776w3 = this.f10421o;
            this.f10421o = new C0776w(r7, c0776w3.f10414c, c0776w3.f10415d);
            C0775v c0775v2 = this.f10422p;
            if (c0775v2 != null) {
                v(c0775v2.f10412x);
            }
        } else {
            boolean zP = r7.p();
            Object obj = C0776w.f10413e;
            if (!zP) {
                Q0 q1 = this.f10419m;
                r7.n(0, q1);
                long j7 = q1.f206D;
                Object obj2 = q1.f211a;
                C0775v c0775v3 = this.f10422p;
                if (c0775v3 != null) {
                    C0776w c0776w4 = this.f10421o;
                    Object obj3 = c0775v3.f10406a.f10161a;
                    P0 p5 = this.f10420n;
                    c0776w4.g(obj3, p5);
                    long j8 = p5.f190e + c0775v3.f10407b;
                    this.f10421o.m(0, q1, 0L);
                    if (j8 != q1.f206D) {
                        j = j8;
                    } else {
                        j = j7;
                    }
                } else {
                    j = j7;
                }
                Pair pairI = r7.i(this.f10419m, this.f10420n, 0, j);
                Object obj4 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.f10425s) {
                    C0776w c0776w5 = this.f10421o;
                    c0776w = new C0776w(r7, c0776w5.f10414c, c0776w5.f10415d);
                } else {
                    c0776w = new C0776w(r7, obj2, obj4);
                }
                this.f10421o = c0776w;
                C0775v c0775v4 = this.f10422p;
                if (c0775v4 != null) {
                    v(jLongValue);
                    D d7 = c0775v4.f10406a;
                    Object obj5 = this.f10421o.f10415d;
                    Object obj6 = d7.f10161a;
                    if (obj5 != null && obj6.equals(obj)) {
                        obj6 = this.f10421o.f10415d;
                    }
                    dB = d7.b(obj6);
                }
                this.f10425s = true;
                this.f10424r = true;
                k(this.f10421o);
                if (dB != null) {
                    c0775v = this.f10422p;
                    c0775v.getClass();
                    j3 = c0775v.f10412x;
                    if (j3 == -9223372036854775807L) {
                        j3 = c0775v.f10407b;
                    }
                    AbstractC0755a abstractC0755a = c0775v.f10409d;
                    abstractC0755a.getClass();
                    bA = abstractC0755a.a(dB, c0775v.f10408c, j3);
                    c0775v.f10410e = bA;
                    if (c0775v.f10411f != null) {
                        bA.p(c0775v, j3);
                    }
                }
            }
            if (this.f10425s) {
                C0776w c0776w6 = this.f10421o;
                c0776w2 = new C0776w(r7, c0776w6.f10414c, c0776w6.f10415d);
            } else {
                c0776w2 = new C0776w(r7, Q0.f200I, obj);
            }
            this.f10421o = c0776w2;
        }
        dB = null;
        this.f10425s = true;
        this.f10424r = true;
        k(this.f10421o);
        if (dB != null) {
            c0775v = this.f10422p;
            c0775v.getClass();
            j3 = c0775v.f10412x;
            if (j3 == -9223372036854775807L) {
                j3 = c0775v.f10407b;
            }
            AbstractC0755a abstractC0755a2 = c0775v.f10409d;
            abstractC0755a2.getClass();
            bA = abstractC0755a2.a(dB, c0775v.f10408c, j3);
            c0775v.f10410e = bA;
            if (c0775v.f10411f != null) {
                bA.p(c0775v, j3);
            }
        }
    }

    @Override // p018c2.AbstractC0755a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final C0775v a(D d7, r rVar, long j) {
        C0775v c0775v = new C0775v(d7, rVar, j);
        a.h(c0775v.f10409d == null);
        AbstractC0755a abstractC0755a = this.f10417k;
        c0775v.f10409d = abstractC0755a;
        if (this.f10424r) {
            Object obj = this.f10421o.f10415d;
            Object obj2 = d7.f10161a;
            if (obj != null && obj2.equals(C0776w.f10413e)) {
                obj2 = this.f10421o.f10415d;
            }
            D dB = d7.b(obj2);
            long j3 = c0775v.f10412x;
            if (j3 != -9223372036854775807L) {
                j = j3;
            }
            AbstractC0755a abstractC0755a2 = c0775v.f10409d;
            abstractC0755a2.getClass();
            B bA = abstractC0755a2.a(dB, rVar, j);
            c0775v.f10410e = bA;
            if (c0775v.f10411f != null) {
                bA.p(c0775v, j);
            }
        } else {
            this.f10422p = c0775v;
            if (!this.f10423q) {
                this.f10423q = true;
                t(null, abstractC0755a);
            }
        }
        return c0775v;
    }

    public final void v(long j) {
        C0775v c0775v = this.f10422p;
        int iB = this.f10421o.b(c0775v.f10406a.f10161a);
        if (iB == -1) {
            return;
        }
        C0776w c0776w = this.f10421o;
        P0 p5 = this.f10420n;
        c0776w.f(iB, p5, false);
        long j3 = p5.f189d;
        if (j3 != -9223372036854775807L && j >= j3) {
            j = Math.max(0L, j3 - 1);
        }
        c0775v.f10412x = j;
    }

    @Override // p018c2.AbstractC0764j, p018c2.AbstractC0755a
    public final void h() {
    }
}
