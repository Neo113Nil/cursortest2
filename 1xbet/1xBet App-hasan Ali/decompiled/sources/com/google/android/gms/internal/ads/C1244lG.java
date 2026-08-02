package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244lG implements InterfaceC1558sG, InterfaceC1513rG {

    /* renamed from: k, reason: collision with root package name */
    public final C1603tG f14369k;

    /* renamed from: l, reason: collision with root package name */
    public final long f14370l;

    /* renamed from: m, reason: collision with root package name */
    public ZF f14371m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC1558sG f14372n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1513rG f14373o;

    /* renamed from: p, reason: collision with root package name */
    public long f14374p = -9223372036854775807L;

    /* renamed from: q, reason: collision with root package name */
    public final C1425pH f14375q;

    public C1244lG(C1603tG c1603tG, C1425pH c1425pH, long j5) {
        this.f14369k = c1603tG;
        this.f14375q = c1425pH;
        this.f14370l = j5;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void a(long j5) {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        interfaceC1558sG.a(j5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long b(long j5) {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        return interfaceC1558sG.b(j5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long c(InterfaceC1200kH[] interfaceC1200kHArr, boolean[] zArr, NG[] ngArr, boolean[] zArr2, long j5) {
        long j6 = this.f14374p;
        long j7 = (j6 == -9223372036854775807L || j5 != this.f14370l) ? j5 : j6;
        this.f14374p = -9223372036854775807L;
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        return interfaceC1558sG.c(interfaceC1200kHArr, zArr, ngArr, zArr2, j7);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long d() {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        return interfaceC1558sG.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void e(long j5) {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        interfaceC1558sG.e(j5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void f(InterfaceC1513rG interfaceC1513rG, long j5) {
        this.f14373o = interfaceC1513rG;
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        if (interfaceC1558sG != null) {
            long j6 = this.f14374p;
            if (j6 == -9223372036854775807L) {
                j6 = this.f14370l;
            }
            interfaceC1558sG.f(this, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final TG g() {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        return interfaceC1558sG.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final /* bridge */ /* synthetic */ void h(OG og) {
        InterfaceC1513rG interfaceC1513rG = this.f14373o;
        int i = AbstractC1260lo.f14419a;
        interfaceC1513rG.h(this);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long i() {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        return interfaceC1558sG.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long j() {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        return interfaceC1558sG.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void k() {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        if (interfaceC1558sG != null) {
            interfaceC1558sG.k();
            return;
        }
        ZF zf = this.f14371m;
        if (zf != null) {
            zf.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long l(long j5, LE le) {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        int i = AbstractC1260lo.f14419a;
        return interfaceC1558sG.l(j5, le);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean m(C1511rE c1511rE) {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        return interfaceC1558sG != null && interfaceC1558sG.m(c1511rE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final void n(InterfaceC1558sG interfaceC1558sG) {
        InterfaceC1513rG interfaceC1513rG = this.f14373o;
        int i = AbstractC1260lo.f14419a;
        interfaceC1513rG.n(this);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean r() {
        InterfaceC1558sG interfaceC1558sG = this.f14372n;
        return interfaceC1558sG != null && interfaceC1558sG.r();
    }
}
