package com.google.android.gms.internal.ads;

import Q2.C0387u0;

/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1130is extends AbstractBinderC1056h6 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Xw f14013k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q2.R0 f14014l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1174js f14015m;

    public BinderC1130is(C1174js c1174js, Xw xw, Q2.R0 r02) {
        this.f14013k = xw;
        this.f14014l = r02;
        this.f14015m = c1174js;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void e2(C0387u0 c0387u0) {
        U2.j.i("Failed to load app open ad with error parcel: " + c0387u0.b().toString() + " for ad unit: " + this.f14014l.f4935k);
        C1174js.i(this.f14015m, c0387u0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void n0(InterfaceC0966f6 interfaceC0966f6) {
        this.f14013k.f(interfaceC0966f6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void z(int i) {
    }
}
