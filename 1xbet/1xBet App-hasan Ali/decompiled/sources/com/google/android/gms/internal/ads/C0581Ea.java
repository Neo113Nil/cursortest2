package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581Ea implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8511a;

    /* renamed from: b, reason: collision with root package name */
    public final E3.a f8512b;

    public /* synthetic */ C0581Ea(int i, E3.a aVar) {
        this.f8511a = i;
        this.f8512b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        switch (this.f8511a) {
            case 0:
                return AbstractC1400ot.j0(this.f8512b, new C0565Ca(1, this, obj), AbstractC0613Id.f9544g);
            default:
                return this.f8512b;
        }
    }
}
