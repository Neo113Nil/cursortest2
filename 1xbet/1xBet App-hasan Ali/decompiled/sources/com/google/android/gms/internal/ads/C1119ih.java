package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1119ih implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13964a;

    /* renamed from: b, reason: collision with root package name */
    public final C0905dr f13965b;

    public /* synthetic */ C1119ih(C0905dr c0905dr, int i) {
        this.f13964a = i;
        this.f13965b = c0905dr;
    }

    public Lq a() {
        Lq lq = (Lq) this.f13965b.f13187m;
        AbstractC1400ot.D(lq);
        return lq;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f13964a) {
            case 0:
                Lq lq = (Lq) this.f13965b.f13187m;
                AbstractC1400ot.D(lq);
                return lq;
            case 1:
                return (String) this.f13965b.f13188n;
            case 2:
                return this.f13965b.r();
            default:
                Sq sq = (Sq) this.f13965b.f13186l;
                AbstractC1400ot.D(sq);
                return sq;
        }
    }
}
