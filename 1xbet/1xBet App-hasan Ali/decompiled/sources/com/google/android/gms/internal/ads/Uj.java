package com.google.android.gms.internal.ads;

import q3.C2308a;

/* loaded from: classes.dex */
public final class Uj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11783a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final CD f11784b;

    /* renamed from: c, reason: collision with root package name */
    public final C1614tj f11785c;

    public Uj(C1614tj c1614tj, CD cd) {
        this.f11785c = c1614tj;
        this.f11784b = cd;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f11783a) {
            case 0:
                Kk kk = (Kk) this.f11785c.f15711b.f12041m;
                AbstractC1400ot.D(kk);
                return new Tj(kk, (C2308a) this.f11784b.d());
            default:
                Wk wk = (Wk) this.f11784b.d();
                Kk kk2 = (Kk) this.f11785c.f15711b.f12041m;
                AbstractC1400ot.D(kk2);
                return new C0765ak(wk, kk2);
        }
    }

    public Uj(CD cd, C1614tj c1614tj) {
        this.f11784b = cd;
        this.f11785c = c1614tj;
    }
}
