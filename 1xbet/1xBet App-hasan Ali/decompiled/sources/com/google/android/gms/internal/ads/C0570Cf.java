package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570Cf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8039a;

    /* renamed from: b, reason: collision with root package name */
    public final C0554Af f8040b;

    /* renamed from: c, reason: collision with root package name */
    public C1666uq f8041c;

    /* renamed from: d, reason: collision with root package name */
    public C1217kq f8042d;

    /* renamed from: e, reason: collision with root package name */
    public Gi f8043e;
    public Gh f;

    public /* synthetic */ C0570Cf(C0554Af c0554Af, int i) {
        this.f8039a = i;
        this.f8040b = c0554Af;
    }

    public C0578Df a() {
        AbstractC1400ot.L(Gi.class, this.f8043e);
        AbstractC1400ot.L(Gh.class, this.f);
        return new C0578Df(this.f8040b, new Oi(13), this.f8043e, this.f, new Qt(23), this.f8041c, this.f8042d);
    }

    public C0636Lf b() {
        AbstractC1400ot.L(Gi.class, this.f8043e);
        AbstractC1400ot.L(Gh.class, this.f);
        return new C0636Lf(this.f8040b, new Oi(13), this.f8043e, this.f, new Qt(23), this.f8041c, this.f8042d);
    }

    public final /* bridge */ Object c() {
        switch (this.f8039a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
