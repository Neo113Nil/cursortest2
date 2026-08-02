package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Pk implements H9 {

    /* renamed from: k, reason: collision with root package name */
    public final Yh f11101k;

    /* renamed from: l, reason: collision with root package name */
    public final C0575Dc f11102l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11103m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11104n;

    public Pk(Yh yh, Lq lq) {
        this.f11101k = yh;
        this.f11102l = lq.f10509l;
        this.f11103m = lq.f10505j;
        this.f11104n = lq.f10507k;
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void a() {
        this.f11101k.n1(new Jh(8));
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void p() {
        this.f11101k.n1(new Jh(7));
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void v0(C0575Dc c0575Dc) {
        int i;
        String str;
        C0575Dc c0575Dc2 = this.f11102l;
        if (c0575Dc2 != null) {
            c0575Dc = c0575Dc2;
        }
        if (c0575Dc != null) {
            str = c0575Dc.f8197k;
            i = c0575Dc.f8198l;
        } else {
            i = 1;
            str = "";
        }
        BinderC1652uc binderC1652uc = new BinderC1652uc(str, i);
        Yh yh = this.f11101k;
        yh.getClass();
        yh.n1(new C0905dr(binderC1652uc, this.f11103m, this.f11104n, 13, false));
    }
}
