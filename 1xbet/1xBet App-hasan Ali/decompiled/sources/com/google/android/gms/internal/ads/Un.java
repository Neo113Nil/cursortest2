package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Un extends Vn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11812a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final C0554Af f11813b;

    /* renamed from: c, reason: collision with root package name */
    public final Gh f11814c;

    /* renamed from: d, reason: collision with root package name */
    public final Gi f11815d;

    /* renamed from: e, reason: collision with root package name */
    public final C0769ao f11816e;
    public final C1528rn f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11817g;

    public Un(C0554Af c0554Af, Gh gh, Gi gi, Tq tq, C0769ao c0769ao, C1528rn c1528rn) {
        this.f11813b = c0554Af;
        this.f11814c = gh;
        this.f11815d = gi;
        this.f11817g = tq;
        this.f11816e = c0769ao;
        this.f = c1528rn;
    }

    @Override // com.google.android.gms.internal.ads.Vn
    public final Cr c(Wq wq, Bundle bundle, Lq lq, Sq sq) {
        Tq tq;
        switch (this.f11812a) {
            case 0:
                Gh gh = this.f11814c;
                gh.f9207b = wq;
                gh.f9208c = bundle;
                gh.f9210e = new C0905dr(sq, lq, this.f11816e, 12, false);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8932y3)).booleanValue()) {
                    gh.f = this.f;
                }
                C0554Af c0554Af = this.f11813b.f7646b;
                Gh gh2 = new Gh(gh);
                Mt mt = new Mt(15, null);
                Gi gi = this.f11815d;
                AbstractC1400ot.L(Gi.class, gi);
                C1390oj c1390oj = (C1390oj) this.f11817g;
                AbstractC1400ot.L(C1390oj.class, c1390oj);
                C1253lh c1253lh = (C1253lh) new C1880zf(c0554Af, mt, c1390oj, new Oi(13), gi, gh2, new Qt(23), null, null).f16698m0.d();
                return c1253lh.a(c1253lh.b());
            case 1:
                Gh gh3 = this.f11814c;
                gh3.f9207b = wq;
                gh3.f9208c = bundle;
                gh3.f9210e = new C0905dr(sq, lq, this.f11816e, 12, false);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8932y3)).booleanValue()) {
                    gh3.f = this.f;
                }
                C0554Af c0554Af2 = this.f11813b.f7646b;
                Gh gh4 = new Gh(gh3);
                Gi gi2 = this.f11815d;
                AbstractC1400ot.L(Gi.class, gi2);
                C1529ro c1529ro = (C1529ro) this.f11817g;
                AbstractC1400ot.L(C1529ro.class, c1529ro);
                C1253lh c1253lh2 = (C1253lh) new C0622Jf(c0554Af2, new Oi(13), gi2, gh4, new Qt(23), c1529ro, null, null).f9936C0.d();
                return c1253lh2.a(c1253lh2.b());
            default:
                Gh gh5 = this.f11814c;
                gh5.f9207b = wq;
                gh5.f9208c = bundle;
                gh5.f9210e = new C0905dr(sq, lq, this.f11816e, 12, false);
                A7 a7 = F7.f8926x3;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && (tq = (Tq) this.f11817g) != null) {
                    gh5.f9209d = tq;
                }
                if (((Boolean) rVar.f5056c.a(F7.f8932y3)).booleanValue()) {
                    gh5.f = this.f;
                }
                C0554Af c0554Af3 = this.f11813b.f7646b;
                Gh gh6 = new Gh(gh5);
                Gi gi3 = this.f11815d;
                AbstractC1400ot.L(Gi.class, gi3);
                C1253lh d5 = new C0636Lf(c0554Af3, new Oi(13), gi3, gh6, new Qt(23), null, null).d();
                return d5.a(d5.b());
        }
    }

    public Un(C0554Af c0554Af, Gh gh, C1529ro c1529ro, Gi gi, C0769ao c0769ao, C1528rn c1528rn) {
        this.f11813b = c0554Af;
        this.f11814c = gh;
        this.f11817g = c1529ro;
        this.f11815d = gi;
        this.f11816e = c0769ao;
        this.f = c1528rn;
    }

    public Un(C0554Af c0554Af, C1390oj c1390oj, Gh gh, Gi gi, C0769ao c0769ao, C1528rn c1528rn) {
        this.f11813b = c0554Af;
        this.f11817g = c1390oj;
        this.f11814c = gh;
        this.f11815d = gi;
        this.f11816e = c0769ao;
        this.f = c1528rn;
    }
}
