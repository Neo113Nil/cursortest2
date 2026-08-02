package com.google.android.gms.internal.ads;

import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import Q2.InterfaceC0386u;
import Q2.InterfaceC0391w0;
import Q2.InterfaceC0392x;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Ao extends Q2.J {

    /* renamed from: k, reason: collision with root package name */
    public final Context f7719k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0392x f7720l;

    /* renamed from: m, reason: collision with root package name */
    public final Wq f7721m;

    /* renamed from: n, reason: collision with root package name */
    public final C0587Eg f7722n;

    /* renamed from: o, reason: collision with root package name */
    public final FrameLayout f7723o;

    /* renamed from: p, reason: collision with root package name */
    public final C1482ql f7724p;

    public Ao(Context context, InterfaceC0392x interfaceC0392x, Wq wq, C0587Eg c0587Eg, C1482ql c1482ql) {
        this.f7719k = context;
        this.f7720l = interfaceC0392x;
        this.f7721m = wq;
        this.f7722n = c0587Eg;
        this.f7724p = c1482ql;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        T2.L l5 = P2.o.f4767B.f4771c;
        frameLayout.addView(c0587Eg.f8570k, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(f().f4976m);
        frameLayout.setMinimumWidth(f().f4979p);
        this.f7723o = frameLayout;
    }

    @Override // Q2.K
    public final String A() {
        return this.f7722n.f.f9590k;
    }

    @Override // Q2.K
    public final void D() {
        m3.v.c("destroy must be called on the main UI thread.");
        Xh xh = this.f7722n.f12694c;
        xh.getClass();
        xh.n1(new C1864z7(null, false));
    }

    @Override // Q2.K
    public final void F1(Q2.V0 v02) {
        U2.j.h("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Q2.K
    public final void G1(InterfaceC0374n0 interfaceC0374n0) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.eb)).booleanValue()) {
            U2.j.h("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        Eo eo = this.f7721m.f12097c;
        if (eo != null) {
            try {
                if (!interfaceC0374n0.c()) {
                    this.f7724p.b();
                }
            } catch (RemoteException e3) {
                U2.j.e("Error in making CSI ping for reporting paid event callback", e3);
            }
            eo.f8597m.set(interfaceC0374n0);
        }
    }

    @Override // Q2.K
    public final void H2(InterfaceC0386u interfaceC0386u) {
        U2.j.h("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Q2.K
    public final void N0(N7 n7) {
        U2.j.h("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Q2.K
    public final void O0(InterfaceC0392x interfaceC0392x) {
        U2.j.h("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Q2.K
    public final void P0(Q2.U u5) {
        U2.j.h("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Q2.K
    public final void P2(InterfaceC1101i6 interfaceC1101i6) {
    }

    @Override // Q2.K
    public final boolean S2() {
        return false;
    }

    @Override // Q2.K
    public final void U1(boolean z3) {
    }

    @Override // Q2.K
    public final boolean X() {
        return false;
    }

    @Override // Q2.K
    public final void c0() {
        U2.j.h("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Q2.K
    public final InterfaceC0392x e() {
        return this.f7720l;
    }

    @Override // Q2.K
    public final void e0() {
        this.f7722n.h();
    }

    @Override // Q2.K
    public final Q2.a1 f() {
        m3.v.c("getAdSize must be called on the main UI thread.");
        return AbstractC1668us.g(this.f7719k, Collections.singletonList(this.f7722n.f()));
    }

    @Override // Q2.K
    public final Q2.Q h() {
        return this.f7721m.f12106n;
    }

    @Override // Q2.K
    public final void h3(Q2.Q q5) {
        Eo eo = this.f7721m.f12097c;
        if (eo != null) {
            eo.k(q5);
        }
    }

    @Override // Q2.K
    public final Bundle j() {
        U2.j.h("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // Q2.K
    public final void j1() {
        m3.v.c("destroy must be called on the main UI thread.");
        Xh xh = this.f7722n.f12694c;
        xh.getClass();
        xh.n1(new Ms(null, 1));
    }

    @Override // Q2.K
    public final InterfaceC0383s0 k() {
        return this.f7722n.f;
    }

    @Override // Q2.K
    public final InterfaceC2360a m() {
        return new BinderC2361b(this.f7723o);
    }

    @Override // Q2.K
    public final void m3(boolean z3) {
        U2.j.h("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Q2.K
    public final InterfaceC0391w0 o() {
        return this.f7722n.e();
    }

    @Override // Q2.K
    public final boolean o2() {
        C0587Eg c0587Eg = this.f7722n;
        return c0587Eg != null && c0587Eg.f12693b.f10520q0;
    }

    @Override // Q2.K
    public final String t() {
        return this.f7721m.f;
    }

    @Override // Q2.K
    public final void u1() {
    }

    @Override // Q2.K
    public final void v() {
        m3.v.c("destroy must be called on the main UI thread.");
        Xh xh = this.f7722n.f12694c;
        xh.getClass();
        xh.n1(new E7(null, 1));
    }

    @Override // Q2.K
    public final boolean v0(Q2.X0 x02) {
        U2.j.h("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // Q2.K
    public final String w() {
        return this.f7722n.f.f9590k;
    }

    @Override // Q2.K
    public final void w0(Q2.a1 a1Var) {
        m3.v.c("setAdSize must be called on the main UI thread.");
        C0587Eg c0587Eg = this.f7722n;
        if (c0587Eg != null) {
            c0587Eg.i(this.f7723o, a1Var);
        }
    }

    @Override // Q2.K
    public final void G() {
    }

    @Override // Q2.K
    public final void P() {
    }

    @Override // Q2.K
    public final void R() {
    }

    @Override // Q2.K
    public final void Z() {
    }

    @Override // Q2.K
    public final void d0() {
    }

    @Override // Q2.K
    public final void K1(Q2.d1 d1Var) {
    }

    @Override // Q2.K
    public final void X0(Q2.W w5) {
    }

    @Override // Q2.K
    public final void b3(C1832yc c1832yc) {
    }

    @Override // Q2.K
    public final void n3(InterfaceC2360a interfaceC2360a) {
    }

    @Override // Q2.K
    public final void b2(Q2.X0 x02, Q2.A a5) {
    }
}
