package com.google.android.gms.internal.ads;

import Q2.C0387u0;

/* loaded from: classes.dex */
public final class Fl extends AbstractBinderC0626Kc {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Gl f9110k;

    public Fl(Gl gl) {
        this.f9110k = gl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void J0(C0387u0 c0387u0) {
        Gl gl = this.f9110k;
        C1529ro c1529ro = gl.f9252b;
        int i = c0387u0.f5058k;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onRewardedAdFailedToShow";
        c1324n6.f14581n = Integer.valueOf(i);
        c1529ro.r(c1324n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void b() {
        Gl gl = this.f9110k;
        C1529ro c1529ro = gl.f9252b;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onAdClicked";
        c1529ro.r(c1324n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void c() {
        Gl gl = this.f9110k;
        C1529ro c1529ro = gl.f9252b;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onAdImpression";
        c1529ro.r(c1324n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void f() {
        Gl gl = this.f9110k;
        C1529ro c1529ro = gl.f9252b;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onRewardedAdClosed";
        c1529ro.r(c1324n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void f0(int i) {
        Gl gl = this.f9110k;
        C1529ro c1529ro = gl.f9252b;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onRewardedAdFailedToShow";
        c1324n6.f14581n = Integer.valueOf(i);
        c1529ro.r(c1324n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void h() {
        Gl gl = this.f9110k;
        C1529ro c1529ro = gl.f9252b;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onRewardedAdOpened";
        c1529ro.r(c1324n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void z1(InterfaceC0591Fc interfaceC0591Fc) {
        Gl gl = this.f9110k;
        C1529ro c1529ro = gl.f9252b;
        C1324n6 c1324n6 = new C1324n6("rewarded");
        c1324n6.f14578k = Long.valueOf(gl.f9251a);
        c1324n6.f14580m = "onUserEarnedReward";
        c1324n6.f14582o = interfaceC0591Fc.c();
        c1324n6.f14583p = Integer.valueOf(interfaceC0591Fc.b());
        c1529ro.r(c1324n6);
    }
}
