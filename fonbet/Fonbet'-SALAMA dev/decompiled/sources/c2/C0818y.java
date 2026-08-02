package c2;

import A1.C0022h0;
import A1.P0;
import A1.Q0;
import A1.R0;
import android.util.Pair;
import v2.AbstractC1664a;

/* renamed from: c2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818y extends AbstractC0804j {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0795a f10417k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10418l;

    /* renamed from: m, reason: collision with root package name */
    public final Q0 f10419m;

    /* renamed from: n, reason: collision with root package name */
    public final P0 f10420n;

    /* renamed from: o, reason: collision with root package name */
    public C0816w f10421o;

    /* renamed from: p, reason: collision with root package name */
    public C0815v f10422p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10423q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10424r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10425s;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0818y(AbstractC0795a abstractC0795a, boolean z4) {
        boolean z7;
        R0 f7;
        this.f10417k = abstractC0795a;
        if (z4) {
            abstractC0795a.getClass();
            if (!(abstractC0795a instanceof C0811q)) {
                z7 = true;
                this.f10418l = z7;
                this.f10419m = new Q0();
                this.f10420n = new P0();
                f7 = abstractC0795a.f();
                if (f7 != null) {
                    this.f10421o = new C0816w(new C0817x(abstractC0795a.g()), Q0.f200I, C0816w.f10413e);
                    return;
                } else {
                    this.f10421o = new C0816w(f7, null, null);
                    this.f10425s = true;
                    return;
                }
            }
        }
        z7 = false;
        this.f10418l = z7;
        this.f10419m = new Q0();
        this.f10420n = new P0();
        f7 = abstractC0795a.f();
        if (f7 != null) {
        }
    }

    @Override // c2.AbstractC0795a
    public final C0022h0 g() {
        return this.f10417k.g();
    }

    @Override // c2.AbstractC0795a
    public final void j(u2.U u4) {
        this.j = u4;
        this.f10366i = v2.t.m(null);
        if (this.f10418l) {
            return;
        }
        this.f10423q = true;
        t(null, this.f10417k);
    }

    @Override // c2.AbstractC0795a
    public final void l(InterfaceC0794B interfaceC0794B) {
        C0815v c0815v = (C0815v) interfaceC0794B;
        if (c0815v.f10410e != null) {
            AbstractC0795a abstractC0795a = c0815v.f10409d;
            abstractC0795a.getClass();
            abstractC0795a.l(c0815v.f10410e);
        }
        if (interfaceC0794B == this.f10422p) {
            this.f10422p = null;
        }
    }

    @Override // c2.AbstractC0804j, c2.AbstractC0795a
    public final void n() {
        this.f10424r = false;
        this.f10423q = false;
        super.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c2.AbstractC0804j
    public final D q(C0809o c0809o, D d7) {
        Object obj = d7.f10161a;
        Object obj2 = this.f10421o.f10415d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0816w.f10413e;
        }
        return d7.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cd  */
    @Override // c2.AbstractC0804j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C0809o c0809o, R0 r02) {
        long j;
        C0816w c0816w;
        C0815v c0815v;
        D b7;
        C0816w c0816w2;
        if (this.f10424r) {
            C0816w c0816w3 = this.f10421o;
            this.f10421o = new C0816w(r02, c0816w3.f10414c, c0816w3.f10415d);
            C0815v c0815v2 = this.f10422p;
            if (c0815v2 != null) {
                v(c0815v2.f10412x);
            }
        } else {
            boolean p5 = r02.p();
            Object obj = C0816w.f10413e;
            if (p5) {
                if (this.f10425s) {
                    C0816w c0816w4 = this.f10421o;
                    c0816w2 = new C0816w(r02, c0816w4.f10414c, c0816w4.f10415d);
                } else {
                    c0816w2 = new C0816w(r02, Q0.f200I, obj);
                }
                this.f10421o = c0816w2;
            } else {
                Q0 q02 = this.f10419m;
                r02.n(0, q02);
                long j3 = q02.f206D;
                Object obj2 = q02.f211a;
                C0815v c0815v3 = this.f10422p;
                if (c0815v3 != null) {
                    C0816w c0816w5 = this.f10421o;
                    Object obj3 = c0815v3.f10406a.f10161a;
                    P0 p02 = this.f10420n;
                    c0816w5.g(obj3, p02);
                    long j7 = p02.f190e + c0815v3.f10407b;
                    this.f10421o.m(0, q02, 0L);
                    if (j7 != q02.f206D) {
                        j = j7;
                        Pair i7 = r02.i(this.f10419m, this.f10420n, 0, j);
                        Object obj4 = i7.first;
                        long longValue = ((Long) i7.second).longValue();
                        if (this.f10425s) {
                            c0816w = new C0816w(r02, obj2, obj4);
                        } else {
                            C0816w c0816w6 = this.f10421o;
                            c0816w = new C0816w(r02, c0816w6.f10414c, c0816w6.f10415d);
                        }
                        this.f10421o = c0816w;
                        c0815v = this.f10422p;
                        if (c0815v != null) {
                            v(longValue);
                            D d7 = c0815v.f10406a;
                            Object obj5 = this.f10421o.f10415d;
                            Object obj6 = d7.f10161a;
                            if (obj5 != null && obj6.equals(obj)) {
                                obj6 = this.f10421o.f10415d;
                            }
                            b7 = d7.b(obj6);
                            this.f10425s = true;
                            this.f10424r = true;
                            k(this.f10421o);
                            if (b7 == null) {
                                C0815v c0815v4 = this.f10422p;
                                c0815v4.getClass();
                                long j8 = c0815v4.f10412x;
                                if (j8 == -9223372036854775807L) {
                                    j8 = c0815v4.f10407b;
                                }
                                AbstractC0795a abstractC0795a = c0815v4.f10409d;
                                abstractC0795a.getClass();
                                InterfaceC0794B a2 = abstractC0795a.a(b7, c0815v4.f10408c, j8);
                                c0815v4.f10410e = a2;
                                if (c0815v4.f10411f != null) {
                                    a2.p(c0815v4, j8);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                j = j3;
                Pair i72 = r02.i(this.f10419m, this.f10420n, 0, j);
                Object obj42 = i72.first;
                long longValue2 = ((Long) i72.second).longValue();
                if (this.f10425s) {
                }
                this.f10421o = c0816w;
                c0815v = this.f10422p;
                if (c0815v != null) {
                }
            }
        }
        b7 = null;
        this.f10425s = true;
        this.f10424r = true;
        k(this.f10421o);
        if (b7 == null) {
        }
    }

    @Override // c2.AbstractC0795a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final C0815v a(D d7, u2.r rVar, long j) {
        C0815v c0815v = new C0815v(d7, rVar, j);
        AbstractC1664a.h(c0815v.f10409d == null);
        AbstractC0795a abstractC0795a = this.f10417k;
        c0815v.f10409d = abstractC0795a;
        if (this.f10424r) {
            Object obj = this.f10421o.f10415d;
            Object obj2 = d7.f10161a;
            if (obj != null && obj2.equals(C0816w.f10413e)) {
                obj2 = this.f10421o.f10415d;
            }
            D b7 = d7.b(obj2);
            long j3 = c0815v.f10412x;
            if (j3 != -9223372036854775807L) {
                j = j3;
            }
            AbstractC0795a abstractC0795a2 = c0815v.f10409d;
            abstractC0795a2.getClass();
            InterfaceC0794B a2 = abstractC0795a2.a(b7, rVar, j);
            c0815v.f10410e = a2;
            if (c0815v.f10411f != null) {
                a2.p(c0815v, j);
            }
        } else {
            this.f10422p = c0815v;
            if (!this.f10423q) {
                this.f10423q = true;
                t(null, abstractC0795a);
            }
        }
        return c0815v;
    }

    public final void v(long j) {
        C0815v c0815v = this.f10422p;
        int b7 = this.f10421o.b(c0815v.f10406a.f10161a);
        if (b7 == -1) {
            return;
        }
        C0816w c0816w = this.f10421o;
        P0 p02 = this.f10420n;
        c0816w.f(b7, p02, false);
        long j3 = p02.f189d;
        if (j3 != -9223372036854775807L && j >= j3) {
            j = Math.max(0L, j3 - 1);
        }
        c0815v.f10412x = j;
    }

    @Override // c2.AbstractC0804j, c2.AbstractC0795a
    public final void h() {
    }
}
