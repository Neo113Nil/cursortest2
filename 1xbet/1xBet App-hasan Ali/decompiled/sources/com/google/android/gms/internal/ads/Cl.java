package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0390w;
import Q2.C0387u0;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class Cl extends AbstractBinderC0390w {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1529ro f8079k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Dl f8080l;

    public Cl(Dl dl, C1529ro c1529ro) {
        this.f8079k = c1529ro;
        this.f8080l = dl;
    }

    @Override // Q2.InterfaceC0392x
    public final void e() {
        long j5 = this.f8080l.f8360a;
        C1529ro c1529ro = this.f8079k;
        C1324n6 c1324n6 = new C1324n6("interstitial");
        c1324n6.f14578k = Long.valueOf(j5);
        c1324n6.f14580m = "onAdLoaded";
        c1529ro.r(c1324n6);
    }

    @Override // Q2.InterfaceC0392x
    public final void f() {
    }

    @Override // Q2.InterfaceC0392x
    public final void g() {
    }

    @Override // Q2.InterfaceC0392x
    public final void h() {
        long j5 = this.f8080l.f8360a;
        C1529ro c1529ro = this.f8079k;
        C1324n6 c1324n6 = new C1324n6("interstitial");
        c1324n6.f14578k = Long.valueOf(j5);
        c1324n6.f14580m = "onAdOpened";
        c1529ro.r(c1324n6);
    }

    @Override // Q2.InterfaceC0392x
    public final void j() {
        long j5 = this.f8080l.f8360a;
        C1529ro c1529ro = this.f8079k;
        C1324n6 c1324n6 = new C1324n6("interstitial");
        c1324n6.f14578k = Long.valueOf(j5);
        c1324n6.f14580m = "onAdClosed";
        c1529ro.r(c1324n6);
    }

    @Override // Q2.InterfaceC0392x
    public final void k() {
    }

    @Override // Q2.InterfaceC0392x
    public final void p() {
        long j5 = this.f8080l.f8360a;
        C1529ro c1529ro = this.f8079k;
        C1324n6 c1324n6 = new C1324n6("interstitial");
        c1324n6.f14578k = Long.valueOf(j5);
        c1324n6.f14580m = "onAdClicked";
        String b3 = C1324n6.b(c1324n6);
        I9 i9 = (I9) c1529ro.f15382l;
        Parcel N5 = i9.N();
        N5.writeString(b3);
        i9.d1(N5, 1);
    }

    @Override // Q2.InterfaceC0392x
    public final void q(C0387u0 c0387u0) {
        long j5 = this.f8080l.f8360a;
        int i = c0387u0.f5058k;
        C1529ro c1529ro = this.f8079k;
        C1324n6 c1324n6 = new C1324n6("interstitial");
        c1324n6.f14578k = Long.valueOf(j5);
        c1324n6.f14580m = "onAdFailedToLoad";
        c1324n6.f14581n = Integer.valueOf(i);
        c1529ro.r(c1324n6);
    }

    @Override // Q2.InterfaceC0392x
    public final void x(int i) {
        long j5 = this.f8080l.f8360a;
        C1529ro c1529ro = this.f8079k;
        C1324n6 c1324n6 = new C1324n6("interstitial");
        c1324n6.f14578k = Long.valueOf(j5);
        c1324n6.f14580m = "onAdFailedToLoad";
        c1324n6.f14581n = Integer.valueOf(i);
        c1529ro.r(c1324n6);
    }
}
