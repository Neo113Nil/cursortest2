package z0;

/* renamed from: z0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2735K {

    /* renamed from: a, reason: collision with root package name */
    public final C2731G f21650a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21651b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21652c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21654e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21655g;

    /* renamed from: h, reason: collision with root package name */
    public int f21656h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21657j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21658k;

    /* renamed from: l, reason: collision with root package name */
    public int f21659l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21660m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21661n;

    /* renamed from: o, reason: collision with root package name */
    public int f21662o;

    /* renamed from: q, reason: collision with root package name */
    public U f21664q;

    /* renamed from: d, reason: collision with root package name */
    public EnumC2727C f21653d = EnumC2727C.f21589o;

    /* renamed from: p, reason: collision with root package name */
    public final Y f21663p = new Y(this);

    public C2735K(C2731G c2731g) {
        this.f21650a = c2731g;
    }

    public final e0 a() {
        return this.f21650a.f21612O.f21769d;
    }

    public final void b() {
        EnumC2727C enumC2727C = this.f21650a.f21613P.f21653d;
        EnumC2727C enumC2727C2 = EnumC2727C.f21587m;
        EnumC2727C enumC2727C3 = EnumC2727C.f21588n;
        if (enumC2727C == enumC2727C2 || enumC2727C == enumC2727C3) {
            if (this.f21663p.J) {
                g(true);
            } else {
                f(true);
            }
        }
        if (enumC2727C == enumC2727C3) {
            U u5 = this.f21664q;
            if (u5 == null || !u5.f21705D) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j5) {
        U u5 = this.f21664q;
        if (u5 != null) {
            EnumC2727C enumC2727C = EnumC2727C.f21586l;
            C2735K c2735k = u5.f21709p;
            c2735k.f21653d = enumC2727C;
            c2735k.f21654e = false;
            C2731G c2731g = c2735k.f21650a;
            p0 snapshotObserver = ((A0.F) AbstractC2734J.a(c2731g)).getSnapshotObserver();
            S s2 = new S(u5, j5);
            snapshotObserver.getClass();
            if (c2731g.f21630q != null) {
                snapshotObserver.a(c2731g, snapshotObserver.f21844b, s2);
            } else {
                snapshotObserver.a(c2731g, snapshotObserver.f21845c, s2);
            }
            c2735k.f = true;
            c2735k.f21655g = true;
            boolean r5 = AbstractC2749f.r(c2731g);
            Y y5 = c2735k.f21663p;
            if (r5) {
                y5.f21736E = true;
                y5.f21737F = true;
            } else {
                y5.f21735D = true;
            }
            c2735k.f21653d = EnumC2727C.f21589o;
        }
    }

    public final void d(int i) {
        int i5 = this.f21659l;
        this.f21659l = i;
        if ((i5 == 0) != (i == 0)) {
            C2731G u5 = this.f21650a.u();
            C2735K c2735k = u5 != null ? u5.f21613P : null;
            if (c2735k != null) {
                if (i == 0) {
                    c2735k.d(c2735k.f21659l - 1);
                } else {
                    c2735k.d(c2735k.f21659l + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i5 = this.f21662o;
        this.f21662o = i;
        if ((i5 == 0) != (i == 0)) {
            C2731G u5 = this.f21650a.u();
            C2735K c2735k = u5 != null ? u5.f21613P : null;
            if (c2735k != null) {
                if (i == 0) {
                    c2735k.e(c2735k.f21662o - 1);
                } else {
                    c2735k.e(c2735k.f21662o + 1);
                }
            }
        }
    }

    public final void f(boolean z3) {
        if (this.f21658k != z3) {
            this.f21658k = z3;
            if (z3 && !this.f21657j) {
                d(this.f21659l + 1);
            } else {
                if (z3 || this.f21657j) {
                    return;
                }
                d(this.f21659l - 1);
            }
        }
    }

    public final void g(boolean z3) {
        if (this.f21657j != z3) {
            this.f21657j = z3;
            if (z3 && !this.f21658k) {
                d(this.f21659l + 1);
            } else {
                if (z3 || this.f21658k) {
                    return;
                }
                d(this.f21659l - 1);
            }
        }
    }

    public final void h(boolean z3) {
        if (this.f21661n != z3) {
            this.f21661n = z3;
            if (z3 && !this.f21660m) {
                e(this.f21662o + 1);
            } else {
                if (z3 || this.f21660m) {
                    return;
                }
                e(this.f21662o - 1);
            }
        }
    }

    public final void i(boolean z3) {
        if (this.f21660m != z3) {
            this.f21660m = z3;
            if (z3 && !this.f21661n) {
                e(this.f21662o + 1);
            } else {
                if (z3 || this.f21661n) {
                    return;
                }
                e(this.f21662o - 1);
            }
        }
    }

    public final void j() {
        Y y5 = this.f21663p;
        Object obj = y5.f21732A;
        C2731G c2731g = this.f21650a;
        C2735K c2735k = y5.f21750p;
        if ((obj != null || c2735k.a().k() != null) && y5.f21760z) {
            y5.f21760z = false;
            y5.f21732A = c2735k.a().k();
            C2731G u5 = c2731g.u();
            if (u5 != null) {
                C2731G.W(u5, false, 7);
            }
        }
        U u6 = this.f21664q;
        if (u6 != null) {
            Object obj2 = u6.f21707F;
            C2735K c2735k2 = u6.f21709p;
            if (obj2 == null) {
                AbstractC2740P G02 = c2735k2.a().G0();
                kotlin.jvm.internal.l.c(G02);
                if (G02.f21691y.k() == null) {
                    return;
                }
            }
            if (u6.f21706E) {
                u6.f21706E = false;
                AbstractC2740P G03 = c2735k2.a().G0();
                kotlin.jvm.internal.l.c(G03);
                u6.f21707F = G03.f21691y.k();
                if (AbstractC2749f.r(c2731g)) {
                    C2731G u7 = c2731g.u();
                    if (u7 != null) {
                        C2731G.W(u7, false, 7);
                        return;
                    }
                    return;
                }
                C2731G u8 = c2731g.u();
                if (u8 != null) {
                    C2731G.U(u8, false, 7);
                }
            }
        }
    }
}
