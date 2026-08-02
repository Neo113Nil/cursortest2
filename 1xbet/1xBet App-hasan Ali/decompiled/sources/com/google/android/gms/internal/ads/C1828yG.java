package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1828yG implements InterfaceC1200kH {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1200kH f16426a;

    /* renamed from: b, reason: collision with root package name */
    public final C1292mb f16427b;

    public C1828yG(InterfaceC1200kH interfaceC1200kH, C1292mb c1292mb) {
        this.f16426a = interfaceC1200kH;
        this.f16427b = c1292mb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final int a(int i) {
        return this.f16426a.a(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final int b(int i) {
        return this.f16426a.b(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final C1407p c() {
        return this.f16427b.f14498d[this.f16426a.d()];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final int d() {
        return this.f16426a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1828yG)) {
            return false;
        }
        C1828yG c1828yG = (C1828yG) obj;
        return this.f16426a.equals(c1828yG.f16426a) && this.f16427b.equals(c1828yG.f16427b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final C1292mb f() {
        return this.f16427b;
    }

    public final int hashCode() {
        return this.f16426a.hashCode() + ((this.f16427b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final int j() {
        return this.f16426a.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final C1407p x(int i) {
        return this.f16427b.f14498d[this.f16426a.a(i)];
    }
}
