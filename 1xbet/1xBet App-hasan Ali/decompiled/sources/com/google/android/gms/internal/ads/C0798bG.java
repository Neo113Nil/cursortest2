package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798bG implements InterfaceC1558sG, InterfaceC1513rG {

    /* renamed from: k, reason: collision with root package name */
    public final C1244lG f12796k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1513rG f12797l;

    /* renamed from: m, reason: collision with root package name */
    public C0753aG[] f12798m = new C0753aG[0];

    /* renamed from: n, reason: collision with root package name */
    public long f12799n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f12800o;

    public C0798bG(C1244lG c1244lG, long j5) {
        this.f12796k = c1244lG;
        this.f12800o = j5;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void a(long j5) {
        this.f12796k.a(j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r3) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j5) {
        this.f12799n = -9223372036854775807L;
        boolean z3 = false;
        for (C0753aG c0753aG : this.f12798m) {
            if (c0753aG != null) {
                c0753aG.f12653b = false;
            }
        }
        long b3 = this.f12796k.b(j5);
        if (b3 != j5) {
            if (b3 >= 0) {
                long j6 = this.f12800o;
                if (j6 != Long.MIN_VALUE) {
                }
            }
            AbstractC1668us.a0(z3);
            return b3;
        }
        z3 = true;
        AbstractC1668us.a0(z3);
        return b3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r14 > r2) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(InterfaceC1200kH[] interfaceC1200kHArr, boolean[] zArr, NG[] ngArr, boolean[] zArr2, long j5) {
        int length = ngArr.length;
        this.f12798m = new C0753aG[length];
        NG[] ngArr2 = new NG[length];
        int i = 0;
        while (true) {
            NG ng = null;
            if (i >= ngArr.length) {
                break;
            }
            C0753aG[] c0753aGArr = this.f12798m;
            C0753aG c0753aG = (C0753aG) ngArr[i];
            c0753aGArr[i] = c0753aG;
            if (c0753aG != null) {
                ng = c0753aG.f12652a;
            }
            ngArr2[i] = ng;
            i++;
        }
        long c5 = this.f12796k.c(interfaceC1200kHArr, zArr, ngArr2, zArr2, j5);
        long j6 = (o() && j5 == 0) ? 0L : j5;
        this.f12799n = -9223372036854775807L;
        boolean z3 = true;
        if (c5 != j6) {
            if (c5 >= 0) {
                long j7 = this.f12800o;
                if (j7 != Long.MIN_VALUE) {
                }
            }
            z3 = false;
        }
        AbstractC1668us.a0(z3);
        for (int i5 = 0; i5 < ngArr.length; i5++) {
            NG ng2 = ngArr2[i5];
            if (ng2 == null) {
                this.f12798m[i5] = null;
            } else {
                C0753aG[] c0753aGArr2 = this.f12798m;
                C0753aG c0753aG2 = c0753aGArr2[i5];
                if (c0753aG2 == null || c0753aG2.f12652a != ng2) {
                    c0753aGArr2[i5] = new C0753aG(this, ng2);
                }
            }
            ngArr[i5] = this.f12798m[i5];
        }
        return c5;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long d() {
        long d5 = this.f12796k.d();
        if (d5 != Long.MIN_VALUE) {
            long j5 = this.f12800o;
            if (j5 == Long.MIN_VALUE || d5 < j5) {
                return d5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void e(long j5) {
        this.f12796k.e(j5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void f(InterfaceC1513rG interfaceC1513rG, long j5) {
        this.f12797l = interfaceC1513rG;
        this.f12796k.f(this, j5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final TG g() {
        return this.f12796k.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final /* bridge */ /* synthetic */ void h(OG og) {
        InterfaceC1513rG interfaceC1513rG = this.f12797l;
        interfaceC1513rG.getClass();
        interfaceC1513rG.h(this);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long i() {
        long i = this.f12796k.i();
        if (i != Long.MIN_VALUE) {
            long j5 = this.f12800o;
            if (j5 == Long.MIN_VALUE || i < j5) {
                return i;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long j() {
        if (o()) {
            long j5 = this.f12799n;
            this.f12799n = -9223372036854775807L;
            long j6 = j();
            return j6 != -9223372036854775807L ? j6 : j5;
        }
        long j7 = this.f12796k.j();
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC1668us.a0(j7 >= 0);
        long j8 = this.f12800o;
        AbstractC1668us.a0(j8 == Long.MIN_VALUE || j7 <= j8);
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void k() {
        this.f12796k.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long l(long j5, LE le) {
        if (j5 == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(le.f10331a, j5));
        long j6 = this.f12800o;
        long j7 = j6 == Long.MIN_VALUE ? Long.MAX_VALUE : j6 - j5;
        long j8 = le.f10332b;
        long max2 = Math.max(0L, Math.min(j8, j7));
        if (max != le.f10331a || max2 != j8) {
            le = new LE(max, max2);
        }
        return this.f12796k.l(j5, le);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean m(C1511rE c1511rE) {
        return this.f12796k.m(c1511rE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final void n(InterfaceC1558sG interfaceC1558sG) {
        InterfaceC1513rG interfaceC1513rG = this.f12797l;
        interfaceC1513rG.getClass();
        interfaceC1513rG.n(this);
    }

    public final boolean o() {
        return this.f12799n != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean r() {
        return this.f12796k.r();
    }
}
