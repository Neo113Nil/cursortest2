package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class Xn extends Vn {

    /* renamed from: a, reason: collision with root package name */
    public final C0554Af f12237a;

    /* renamed from: b, reason: collision with root package name */
    public final Gh f12238b;

    /* renamed from: c, reason: collision with root package name */
    public final C1529ro f12239c;

    /* renamed from: d, reason: collision with root package name */
    public final Gi f12240d;

    /* renamed from: e, reason: collision with root package name */
    public final C1390oj f12241e;
    public final C1344ni f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f12242g;

    /* renamed from: h, reason: collision with root package name */
    public final C1838yi f12243h;
    public final C0769ao i;

    /* renamed from: j, reason: collision with root package name */
    public final C1528rn f12244j;

    public Xn(C0554Af c0554Af, Gh gh, C1529ro c1529ro, Gi gi, C1390oj c1390oj, C1344ni c1344ni, FrameLayout frameLayout, C1838yi c1838yi, C0769ao c0769ao, C1528rn c1528rn) {
        this.f12237a = c0554Af;
        this.f12238b = gh;
        this.f12239c = c1529ro;
        this.f12240d = gi;
        this.f12241e = c1390oj;
        this.f = c1344ni;
        this.f12242g = frameLayout;
        this.f12243h = c1838yi;
        this.i = c0769ao;
        this.f12244j = c1528rn;
    }

    @Override // com.google.android.gms.internal.ads.Vn
    public final Cr c(Wq wq, Bundle bundle, Lq lq, Sq sq) {
        Gh gh = this.f12238b;
        gh.f9207b = wq;
        gh.f9208c = bundle;
        gh.f9210e = new C0905dr(sq, lq, this.i, 12, false);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8932y3)).booleanValue()) {
            gh.f = this.f12244j;
        }
        C0554Af c0554Af = this.f12237a.f7646b;
        Gh gh2 = new Gh(gh);
        C0709Wb c0709Wb = new C0709Wb(15, this.f, this.f12243h);
        Mt mt = new Mt(15, this.f12242g);
        Gi gi = this.f12240d;
        AbstractC1400ot.L(Gi.class, gi);
        C1529ro c1529ro = this.f12239c;
        AbstractC1400ot.L(C1529ro.class, c1529ro);
        Qt qt = new Qt(23);
        C1390oj c1390oj = this.f12241e;
        AbstractC1400ot.L(C1390oj.class, c1390oj);
        C1253lh c1253lh = (C1253lh) new C0594Ff(c0554Af, mt, c1390oj, new Oi(13), gi, gh2, qt, c1529ro, c0709Wb, null, null).f8972H0.d();
        return c1253lh.a(c1253lh.b());
    }
}
