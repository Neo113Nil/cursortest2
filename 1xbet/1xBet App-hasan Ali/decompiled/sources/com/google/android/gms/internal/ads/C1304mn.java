package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304mn implements InterfaceC1259ln {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1259ln f14535a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1311mu f14536b;

    public C1304mn(InterfaceC1259ln interfaceC1259ln, InterfaceC1311mu interfaceC1311mu) {
        this.f14535a = interfaceC1259ln;
        this.f14536b = interfaceC1311mu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        return this.f14535a.a(sq, lq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        return AbstractC1400ot.h0(this.f14535a.b(sq, lq), this.f14536b, AbstractC0613Id.f9539a);
    }
}
