package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1346nk implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q2.a1 f14697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lq f14698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Nq f14699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14700e;
    public final /* synthetic */ String f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14701g;

    public /* synthetic */ C1346nk(Object obj, Q2.a1 a1Var, Lq lq, Nq nq, String str, String str2, int i) {
        this.f14696a = i;
        this.f14701g = obj;
        this.f14697b = a1Var;
        this.f14698c = lq;
        this.f14699d = nq;
        this.f14700e = str;
        this.f = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        switch (this.f14696a) {
            case 0:
                C1391ok c1391ok = (C1391ok) this.f14701g;
                Q2.a1 a1Var = this.f14697b;
                Lq lq = this.f14698c;
                Nq nq = this.f14699d;
                String str = this.f14700e;
                String str2 = this.f;
                InterfaceC0677Re a5 = c1391ok.f14836j.a(a1Var, lq, nq);
                C1548s6 c1548s6 = new C1548s6(a5);
                Lk lk = c1391ok.f14838l.f10808a;
                a5.I().w(lk, lk, lk, lk, lk, false, null, new P2.a(c1391ok.f14829a, null), null, null, c1391ok.f14841o, c1391ok.f14840n, c1391ok.f14839m, null, lk, null, null, null, null);
                a5.s0("/getNativeAdViewSignals", AbstractC1776x9.f16258s);
                a5.s0("/getNativeClickMeta", AbstractC1776x9.f16259t);
                C1028gf I5 = a5.I();
                synchronized (I5.f13616n) {
                    I5.f13600C = true;
                }
                a5.I().f13619q = new C0712We(c1548s6, 1);
                a5.S0(str, str2);
                return c1548s6;
            default:
                C1750wk c1750wk = (C1750wk) this.f14701g;
                InterfaceC0677Re a6 = c1750wk.f16146c.a(this.f14697b, this.f14698c, this.f14699d);
                C1548s6 c1548s62 = new C1548s6(a6);
                if (c1750wk.f16144a.f12096b != null) {
                    c1750wk.a(a6);
                    a6.K0(new C1586t(5, 0, 0));
                } else {
                    Lk lk2 = c1750wk.f16147d.f10808a;
                    a6.I().w(lk2, lk2, lk2, lk2, lk2, false, null, new P2.a(c1750wk.f16148e, null), null, null, c1750wk.f16150h, c1750wk.f16149g, c1750wk.f, null, lk2, null, null, null, null);
                    C1750wk.b(a6);
                }
                a6.I().f13619q = new C1570sk(c1750wk, a6, c1548s62, 1);
                a6.S0(this.f14700e, this.f);
                return c1548s62;
        }
    }
}
