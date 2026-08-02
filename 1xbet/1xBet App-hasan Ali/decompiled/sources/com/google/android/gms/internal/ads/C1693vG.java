package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1693vG implements InterfaceC1883zi {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16001k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1872zF f16002l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1199kG f16003m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1469qG f16004n;

    public /* synthetic */ C1693vG(C1872zF c1872zF, C1199kG c1199kG, C1469qG c1469qG, int i) {
        this.f16001k = i;
        this.f16002l = c1872zF;
        this.f16003m = c1199kG;
        this.f16004n = c1469qG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1883zi, com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public final void mo11k(Object obj) {
        switch (this.f16001k) {
            case 0:
                ((InterfaceC1783xG) obj).a(0, this.f16002l.f16578a, this.f16003m, this.f16004n);
                break;
            case 1:
                ((InterfaceC1783xG) obj).c(0, this.f16002l.f16578a, this.f16003m, this.f16004n);
                break;
            default:
                ((InterfaceC1783xG) obj).b(0, this.f16002l.f16578a, this.f16003m, this.f16004n);
                break;
        }
    }
}
