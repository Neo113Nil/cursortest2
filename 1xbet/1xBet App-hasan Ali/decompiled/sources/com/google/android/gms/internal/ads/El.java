package com.google.android.gms.internal.ads;

import Q2.C0387u0;

/* loaded from: classes.dex */
public final class El extends AbstractBinderC0654Oc {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Gl f8585k;

    public El(Gl gl) {
        this.f8585k = gl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void f() {
        Gl gl = this.f8585k;
        C1529ro c1529ro = gl.f9252b;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onRewardedAdLoaded";
        c1529ro.r(c1324n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void q(C0387u0 c0387u0) {
        Gl gl = this.f8585k;
        C1529ro c1529ro = gl.f9252b;
        int i = c0387u0.f5058k;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onRewardedAdFailedToLoad";
        c1324n6.f14581n = Integer.valueOf(i);
        c1529ro.r(c1324n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void x(int i) {
        Gl gl = this.f8585k;
        C1529ro c1529ro = gl.f9252b;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onRewardedAdFailedToLoad";
        c1324n6.f14581n = Integer.valueOf(i);
        c1529ro.r(c1324n6);
    }
}
