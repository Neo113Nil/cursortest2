package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Hh implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9451a;

    /* renamed from: b, reason: collision with root package name */
    public final Gh f9452b;

    public /* synthetic */ Hh(Gh gh, int i) {
        this.f9451a = i;
        this.f9452b = gh;
    }

    public Wq a() {
        Wq wq = this.f9452b.f9207b;
        AbstractC1400ot.D(wq);
        return wq;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f9451a) {
            case 0:
                return this.f9452b.f9208c;
            case 1:
                return this.f9452b.f9210e;
            case 2:
                return Integer.valueOf(this.f9452b.f9211g);
            case 3:
                return this.f9452b.f9209d;
            case 4:
                Wq wq = this.f9452b.f9207b;
                AbstractC1400ot.D(wq);
                return wq;
            default:
                return this.f9452b.a();
        }
    }
}
