package com.google.android.gms.internal.ads;

import Q2.C0387u0;

/* renamed from: com.google.android.gms.internal.ads.ws, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1758ws extends AbstractBinderC0654Oc {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Xw f16176k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Iq f16177l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1174js f16178m;

    public BinderC1758ws(C1174js c1174js, Xw xw, Iq iq) {
        this.f16176k = xw;
        this.f16177l = iq;
        this.f16178m = c1174js;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void f() {
        this.f16176k.f(this.f16177l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void q(C0387u0 c0387u0) {
        String mVar = c0387u0.b().toString();
        C1174js c1174js = this.f16178m;
        U2.j.i("Failed to load rewarded ad with error: " + mVar + ", adUnitId: " + c1174js.f14177e.f4935k);
        C1174js.i(c1174js, c0387u0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void x(int i) {
    }
}
