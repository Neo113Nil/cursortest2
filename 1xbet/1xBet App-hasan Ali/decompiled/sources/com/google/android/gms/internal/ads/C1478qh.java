package com.google.android.gms.internal.ads;

import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478qh implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15152a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f15153b;

    /* renamed from: c, reason: collision with root package name */
    public final Hh f15154c;

    public C1478qh(Hh hh, CD cd) {
        this.f15152a = 2;
        this.f15154c = hh;
        this.f15153b = cd;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15152a) {
            case 0:
                return new C1433ph((C1567sh) this.f15153b.d(), this.f15154c.a());
            case 1:
                return new Qo(0, (C2308a) this.f15153b.d(), this.f15154c.a());
            default:
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                Wq a5 = this.f15154c.a();
                return new So(c0606Hd, a5, 0);
        }
    }

    public /* synthetic */ C1478qh(CD cd, Hh hh, int i) {
        this.f15152a = i;
        this.f15153b = cd;
        this.f15154c = hh;
    }
}
