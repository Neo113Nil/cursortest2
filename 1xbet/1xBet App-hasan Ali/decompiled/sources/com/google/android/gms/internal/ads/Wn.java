package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Wn extends Vn {

    /* renamed from: a, reason: collision with root package name */
    public final C0554Af f12082a;

    /* renamed from: b, reason: collision with root package name */
    public final Gh f12083b;

    /* renamed from: c, reason: collision with root package name */
    public final Gi f12084c;

    /* renamed from: d, reason: collision with root package name */
    public final C0769ao f12085d;

    /* renamed from: e, reason: collision with root package name */
    public final C1528rn f12086e;

    public Wn(C0554Af c0554Af, Gh gh, Gi gi, C0769ao c0769ao, C1528rn c1528rn) {
        this.f12082a = c0554Af;
        this.f12083b = gh;
        this.f12084c = gi;
        this.f12085d = c0769ao;
        this.f12086e = c1528rn;
    }

    @Override // com.google.android.gms.internal.ads.Vn
    public final Cr c(Wq wq, Bundle bundle, Lq lq, Sq sq) {
        Gh gh = this.f12083b;
        gh.f9207b = wq;
        gh.f9208c = bundle;
        gh.f9210e = new C0905dr(sq, lq, this.f12085d, 12, false);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8932y3)).booleanValue()) {
            gh.f = this.f12086e;
        }
        C0554Af c0554Af = this.f12082a.f7646b;
        Gh gh2 = new Gh(gh);
        Gi gi = this.f12084c;
        AbstractC1400ot.L(Gi.class, gi);
        C1253lh d5 = new C0578Df(c0554Af, new Oi(13), gi, gh2, new Qt(23), null, null).d();
        return d5.a(d5.b());
    }
}
