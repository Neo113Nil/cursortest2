package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352nq implements InterfaceC1311mu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0905dr f14715b;

    public /* synthetic */ C1352nq(C0905dr c0905dr, int i) {
        this.f14714a = i;
        this.f14715b = c0905dr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.f14714a) {
            case 0:
                U2.j.g("", (C1797xm) obj);
                T2.G.m("Failed to get a cache key, reverting to legacy flow.");
                C0905dr c0905dr = this.f14715b;
                C1397oq c1397oq = new C1397oq(null, c0905dr.F());
                c0905dr.f13188n = c1397oq;
                return c1397oq;
            default:
                C1428pc c1428pc = (C1428pc) obj;
                C1397oq c1397oq2 = new C1397oq(c1428pc, new C1532rr(c1428pc.f15004t));
                this.f14715b.f13188n = c1397oq2;
                return c1397oq2;
        }
    }
}
