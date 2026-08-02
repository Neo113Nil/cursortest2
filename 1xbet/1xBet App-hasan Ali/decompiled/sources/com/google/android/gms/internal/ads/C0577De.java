package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.De, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577De implements InterfaceC1422pE {

    /* renamed from: a, reason: collision with root package name */
    public final C1425pH f8208a = new C1425pH();

    /* renamed from: b, reason: collision with root package name */
    public long f8209b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    public long f8210c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    public long f8211d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public long f8212e = 5000000;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8213g;

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final boolean a(C1377oE c1377oE) {
        int i;
        long j5 = c1377oE.f14787b;
        boolean z3 = true;
        char c5 = j5 > this.f8210c ? (char) 0 : j5 < this.f8209b ? (char) 2 : (char) 1;
        C1425pH c1425pH = this.f8208a;
        synchronized (c1425pH) {
            i = c1425pH.f14989b * 65536;
        }
        int i5 = this.f;
        if (c5 != 2 && (c5 != 1 || !this.f8213g || i >= i5)) {
            z3 = false;
        }
        this.f8213g = z3;
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final void b(ZE ze) {
        this.f = 0;
        this.f8213g = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final void c(ZE ze) {
        this.f = 0;
        this.f8213g = false;
        C1425pH c1425pH = this.f8208a;
        synchronized (c1425pH) {
            c1425pH.a(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final long d() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final /* synthetic */ boolean e() {
        JB.l("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final void f(C1377oE c1377oE, InterfaceC1200kH[] interfaceC1200kHArr) {
        int i;
        this.f = 0;
        for (InterfaceC1200kH interfaceC1200kH : interfaceC1200kHArr) {
            if (interfaceC1200kH != null) {
                int i5 = this.f;
                int i6 = interfaceC1200kH.f().f14497c;
                if (i6 == 0) {
                    i = 144310272;
                } else if (i6 == 1) {
                    i = 13107200;
                } else if (i6 != 2) {
                    i = 131072;
                    if (i6 != 3 && i6 != 5 && i6 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.f = i5 + i;
            }
        }
        this.f8208a.a(this.f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final boolean g(C1377oE c1377oE) {
        long j5 = c1377oE.f14789d ? this.f8212e : this.f8211d;
        return j5 <= 0 || c1377oE.f14787b >= j5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final void h(ZE ze) {
        this.f = 0;
        this.f8213g = false;
        C1425pH c1425pH = this.f8208a;
        synchronized (c1425pH) {
            c1425pH.a(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final C1425pH k() {
        return this.f8208a;
    }
}
