package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340ne extends J2.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0677Re f14661b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1744we f14662c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14663d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f14664e;

    public C1340ne(InterfaceC0677Re interfaceC0677Re, AbstractC1744we abstractC1744we, String str, String[] strArr) {
        super(1);
        this.f14661b = interfaceC0677Re;
        this.f14662c = abstractC1744we;
        this.f14663d = str;
        this.f14664e = strArr;
        P2.o.f4767B.f4792z.f14808k.add(this);
    }

    @Override // J2.a
    public final void k() {
        try {
            this.f14662c.r(this.f14663d, this.f14664e);
        } finally {
            T2.L.f5672l.post(new K4(13, this));
        }
    }

    @Override // J2.a
    public final E3.a l() {
        return (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8773V1)).booleanValue() && (this.f14662c instanceof C0553Ae)) ? AbstractC0613Id.f.d(new S4(2, this)) : super.l();
    }
}
