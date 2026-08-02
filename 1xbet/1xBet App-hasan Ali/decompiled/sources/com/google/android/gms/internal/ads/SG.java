package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class SG implements InterfaceC1558sG, InterfaceC1513rG {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1558sG f11529k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11530l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC1513rG f11531m;

    public SG(InterfaceC1558sG interfaceC1558sG, long j5) {
        this.f11529k = interfaceC1558sG;
        this.f11530l = j5;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void a(long j5) {
        this.f11529k.a(j5 - this.f11530l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long b(long j5) {
        InterfaceC1558sG interfaceC1558sG = this.f11529k;
        long j6 = this.f11530l;
        return interfaceC1558sG.b(j5 - j6) + j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long c(InterfaceC1200kH[] interfaceC1200kHArr, boolean[] zArr, NG[] ngArr, boolean[] zArr2, long j5) {
        NG[] ngArr2 = new NG[ngArr.length];
        int i = 0;
        while (true) {
            NG ng = null;
            if (i >= ngArr.length) {
                break;
            }
            RG rg = (RG) ngArr[i];
            if (rg != null) {
                ng = rg.f11420a;
            }
            ngArr2[i] = ng;
            i++;
        }
        long j6 = this.f11530l;
        long c5 = this.f11529k.c(interfaceC1200kHArr, zArr, ngArr2, zArr2, j5 - j6);
        for (int i5 = 0; i5 < ngArr.length; i5++) {
            NG ng2 = ngArr2[i5];
            if (ng2 == null) {
                ngArr[i5] = null;
            } else {
                NG ng3 = ngArr[i5];
                if (ng3 == null || ((RG) ng3).f11420a != ng2) {
                    ngArr[i5] = new RG(ng2, j6);
                }
            }
        }
        return c5 + j6;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long d() {
        long d5 = this.f11529k.d();
        if (d5 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d5 + this.f11530l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void e(long j5) {
        this.f11529k.e(j5 - this.f11530l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void f(InterfaceC1513rG interfaceC1513rG, long j5) {
        this.f11531m = interfaceC1513rG;
        this.f11529k.f(this, j5 - this.f11530l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final TG g() {
        return this.f11529k.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final /* bridge */ /* synthetic */ void h(OG og) {
        InterfaceC1513rG interfaceC1513rG = this.f11531m;
        interfaceC1513rG.getClass();
        interfaceC1513rG.h(this);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long i() {
        long i = this.f11529k.i();
        if (i == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return i + this.f11530l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long j() {
        long j5 = this.f11529k.j();
        if (j5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j5 + this.f11530l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void k() {
        this.f11529k.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long l(long j5, LE le) {
        InterfaceC1558sG interfaceC1558sG = this.f11529k;
        long j6 = this.f11530l;
        return interfaceC1558sG.l(j5 - j6, le) + j6;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean m(C1511rE c1511rE) {
        C1467qE c1467qE = new C1467qE();
        c1467qE.f15114b = c1511rE.f15284b;
        c1467qE.f15115c = c1511rE.f15285c;
        c1467qE.f15113a = c1511rE.f15283a - this.f11530l;
        return this.f11529k.m(new C1511rE(c1467qE));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final void n(InterfaceC1558sG interfaceC1558sG) {
        InterfaceC1513rG interfaceC1513rG = this.f11531m;
        interfaceC1513rG.getClass();
        interfaceC1513rG.n(this);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean r() {
        return this.f11529k.r();
    }
}
