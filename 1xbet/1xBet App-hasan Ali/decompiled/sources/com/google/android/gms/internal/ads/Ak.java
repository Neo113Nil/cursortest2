package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ak implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7704a;

    /* renamed from: b, reason: collision with root package name */
    public final C1119ih f7705b;

    /* renamed from: c, reason: collision with root package name */
    public final C1168jm f7706c;

    /* renamed from: d, reason: collision with root package name */
    public final C0650Nf f7707d;

    public /* synthetic */ Ak(C1119ih c1119ih, C1168jm c1168jm, C0650Nf c0650Nf, int i) {
        this.f7704a = i;
        this.f7705b = c1119ih;
        this.f7706c = c1168jm;
        this.f7707d = c0650Nf;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f7704a) {
            case 0:
                return new BinderC1885zk((String) this.f7705b.f13965b.f13188n, (Cj) this.f7706c.d(), this.f7707d.a());
            default:
                return new Bk((String) this.f7705b.f13965b.f13188n, (Cj) this.f7706c.d(), this.f7707d.a());
        }
    }
}
