package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0609Hg implements InterfaceC1613ti {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9449k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f9450l;

    public /* synthetic */ C0609Hg(int i, Object obj) {
        this.f9449k = i;
        this.f9450l = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1613ti
    public final void i() {
        S2.d V4;
        switch (this.f9449k) {
            case 0:
                ((C1344ni) this.f9450l).i();
                break;
            default:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f9450l;
                if (interfaceC0677Re != null && (V4 = interfaceC0677Re.V()) != null) {
                    V4.a();
                    break;
                }
                break;
        }
    }
}
