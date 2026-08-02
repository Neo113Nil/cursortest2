package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0396z;
import Q2.C0387u0;

/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1264ls extends AbstractBinderC0396z {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Xw f14443k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Ho f14444l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1174js f14445m;

    public BinderC1264ls(C1174js c1174js, Xw xw, Ho ho) {
        this.f14443k = xw;
        this.f14444l = ho;
        this.f14445m = c1174js;
    }

    @Override // Q2.A
    public final void e1(C0387u0 c0387u0) {
        String mVar = c0387u0.b().toString();
        C1174js c1174js = this.f14445m;
        U2.j.i("Failed to load interstitial ad with error: " + mVar + " for ad unit: " + c1174js.f14177e.f4935k);
        C1174js.i(c1174js, c0387u0);
    }

    @Override // Q2.A
    public final void p() {
        this.f14443k.f(this.f14444l);
    }
}
