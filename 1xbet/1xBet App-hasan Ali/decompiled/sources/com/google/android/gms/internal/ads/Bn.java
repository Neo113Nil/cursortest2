package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class Bn implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7879a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f7880b;

    /* renamed from: c, reason: collision with root package name */
    public final ED f7881c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f7882d;

    public /* synthetic */ Bn(CD cd, CD cd2, ED ed, int i) {
        this.f7879a = i;
        this.f7880b = cd;
        this.f7882d = cd2;
        this.f7881c = ed;
    }

    private final InterfaceC1621tq b() {
        C0552Ad c0552Ad;
        Context context = (Context) this.f7881c.f8474a;
        C1085hr c1085hr = (C1085hr) this.f7880b.d();
        C1622tr c1622tr = (C1622tr) this.f7882d.d();
        A7 a7 = F7.U5;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            c0552Ad = P2.o.f4767B.f4774g.d().t();
        } else {
            T2.I d5 = P2.o.f4767B.f4774g.d();
            synchronized (d5.f5644a) {
                c0552Ad = d5.f5655n;
            }
        }
        boolean z3 = false;
        if (c0552Ad != null && c0552Ad.f7601j) {
            z3 = true;
        }
        if (((Integer) rVar.f5056c.a(F7.k6)).intValue() > 0) {
            if (!((Boolean) rVar.f5056c.a(F7.T5)).booleanValue() || z3) {
                C1577sr a5 = c1622tr.a(EnumC1308mr.f14542m, context, c1085hr, new Dp(1, new C1529ro(29)));
                C0709Wb c0709Wb = new C0709Wb(new Qt(27));
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                C0905dr c0905dr = a5.f15606a;
                return new C1324n6(c0709Wb, new C0905dr(c0905dr, c0606Hd), a5.f15607b, ((C1353nr) c0905dr.f13187m).f14722q, c0606Hd);
            }
        }
        return new Qt(27);
    }

    public InterfaceC1621tq a() {
        C0552Ad c0552Ad;
        switch (this.f7879a) {
            case 4:
                return b();
            default:
                Context context = (Context) this.f7881c.f8474a;
                C1085hr c1085hr = (C1085hr) this.f7880b.d();
                C1622tr c1622tr = (C1622tr) this.f7882d.d();
                A7 a7 = F7.U5;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    c0552Ad = P2.o.f4767B.f4774g.d().t();
                } else {
                    T2.I d5 = P2.o.f4767B.f4774g.d();
                    synchronized (d5.f5644a) {
                        c0552Ad = d5.f5655n;
                    }
                }
                boolean z3 = false;
                if (c0552Ad != null && c0552Ad.f7601j) {
                    z3 = true;
                }
                if (((Integer) rVar.f5056c.a(F7.W5)).intValue() > 0) {
                    if (!((Boolean) rVar.f5056c.a(F7.T5)).booleanValue() || z3) {
                        C1577sr a5 = c1622tr.a(EnumC1308mr.f14540k, context, c1085hr, new Dp(1, new C1529ro(29)));
                        C0709Wb c0709Wb = new C0709Wb(new Qt(27));
                        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                        C0905dr c0905dr = a5.f15606a;
                        return new C1324n6(c0709Wb, new C0905dr(c0905dr, c0606Hd), a5.f15607b, ((C1353nr) c0905dr.f13187m).f14722q, c0606Hd);
                    }
                }
                return new Qt(27);
        }
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f7879a) {
        }
        return a();
    }

    public /* synthetic */ Bn(CD cd, ED ed, CD cd2, int i) {
        this.f7879a = i;
        this.f7880b = cd;
        this.f7881c = ed;
        this.f7882d = cd2;
    }

    public /* synthetic */ Bn(ED ed, CD cd, CD cd2, int i) {
        this.f7879a = i;
        this.f7881c = ed;
        this.f7880b = cd;
        this.f7882d = cd2;
    }
}
