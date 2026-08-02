package com.google.android.gms.internal.ads;

import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import Q2.InterfaceC0386u;
import Q2.InterfaceC0391w0;
import Q2.InterfaceC0392x;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Ho extends Q2.J {

    /* renamed from: k, reason: collision with root package name */
    public final Q2.a1 f9477k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f9478l;

    /* renamed from: m, reason: collision with root package name */
    public final C1846yq f9479m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9480n;

    /* renamed from: o, reason: collision with root package name */
    public final U2.a f9481o;

    /* renamed from: p, reason: collision with root package name */
    public final Eo f9482p;

    /* renamed from: q, reason: collision with root package name */
    public final Bq f9483q;

    /* renamed from: r, reason: collision with root package name */
    public final Q4 f9484r;

    /* renamed from: s, reason: collision with root package name */
    public final C1482ql f9485s;

    /* renamed from: t, reason: collision with root package name */
    public C0898dj f9486t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9487u = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8683F0)).booleanValue();

    public Ho(Context context, Q2.a1 a1Var, String str, C1846yq c1846yq, Eo eo, Bq bq, U2.a aVar, Q4 q42, C1482ql c1482ql) {
        this.f9477k = a1Var;
        this.f9480n = str;
        this.f9478l = context;
        this.f9479m = c1846yq;
        this.f9482p = eo;
        this.f9483q = bq;
        this.f9481o = aVar;
        this.f9484r = q42;
        this.f9485s = c1482ql;
    }

    @Override // Q2.K
    public final synchronized String A() {
        Ih ih;
        C0898dj c0898dj = this.f9486t;
        if (c0898dj == null || (ih = c0898dj.f) == null) {
            return null;
        }
        return ih.f9590k;
    }

    @Override // Q2.K
    public final synchronized void D() {
        m3.v.c("resume must be called on the main UI thread.");
        C0898dj c0898dj = this.f9486t;
        if (c0898dj != null) {
            Xh xh = c0898dj.f12694c;
            xh.getClass();
            xh.n1(new C1864z7(null, false));
        }
    }

    @Override // Q2.K
    public final void G1(InterfaceC0374n0 interfaceC0374n0) {
        m3.v.c("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC0374n0.c()) {
                this.f9485s.b();
            }
        } catch (RemoteException e3) {
            U2.j.e("Error in making CSI ping for reporting paid event callback", e3);
        }
        this.f9482p.f8597m.set(interfaceC0374n0);
    }

    @Override // Q2.K
    public final synchronized void N0(N7 n7) {
        m3.v.c("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f9479m.f = n7;
    }

    @Override // Q2.K
    public final void O0(InterfaceC0392x interfaceC0392x) {
        m3.v.c("setAdListener must be called on the main UI thread.");
        this.f9482p.f8595k.set(interfaceC0392x);
    }

    @Override // Q2.K
    public final void P2(InterfaceC1101i6 interfaceC1101i6) {
    }

    @Override // Q2.K
    public final synchronized boolean S2() {
        return this.f9479m.a();
    }

    @Override // Q2.K
    public final synchronized void U1(boolean z3) {
        m3.v.c("setImmersiveMode must be called on the main UI thread.");
        this.f9487u = z3;
    }

    @Override // Q2.K
    public final synchronized boolean X() {
        m3.v.c("isLoaded must be called on the main UI thread.");
        return u3();
    }

    @Override // Q2.K
    public final void X0(Q2.W w5) {
        this.f9482p.f8599o.set(w5);
    }

    @Override // Q2.K
    public final void b2(Q2.X0 x02, Q2.A a5) {
        this.f9482p.f8598n.set(a5);
        v0(x02);
    }

    @Override // Q2.K
    public final void b3(C1832yc c1832yc) {
        this.f9483q.f7897o.set(c1832yc);
    }

    @Override // Q2.K
    public final void c0() {
        m3.v.c("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // Q2.K
    public final InterfaceC0392x e() {
        return this.f9482p.d();
    }

    @Override // Q2.K
    public final void e0() {
    }

    @Override // Q2.K
    public final Q2.a1 f() {
        return null;
    }

    @Override // Q2.K
    public final Q2.Q h() {
        Q2.Q q5;
        Eo eo = this.f9482p;
        synchronized (eo) {
            q5 = (Q2.Q) eo.f8596l.get();
        }
        return q5;
    }

    @Override // Q2.K
    public final void h3(Q2.Q q5) {
        m3.v.c("setAppEventListener must be called on the main UI thread.");
        this.f9482p.k(q5);
    }

    @Override // Q2.K
    public final Bundle j() {
        m3.v.c("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // Q2.K
    public final synchronized void j1() {
        m3.v.c("pause must be called on the main UI thread.");
        C0898dj c0898dj = this.f9486t;
        if (c0898dj != null) {
            Xh xh = c0898dj.f12694c;
            xh.getClass();
            xh.n1(new Ms(null, 1));
        }
    }

    @Override // Q2.K
    public final synchronized InterfaceC0383s0 k() {
        C0898dj c0898dj;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.q6)).booleanValue() && (c0898dj = this.f9486t) != null) {
            return c0898dj.f;
        }
        return null;
    }

    @Override // Q2.K
    public final InterfaceC2360a m() {
        return null;
    }

    @Override // Q2.K
    public final void m3(boolean z3) {
    }

    @Override // Q2.K
    public final synchronized void n3(InterfaceC2360a interfaceC2360a) {
        if (this.f9486t == null) {
            U2.j.i("Interstitial can not be shown before loaded.");
            this.f9482p.q(AbstractC1803xs.I(9, null, null));
            return;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8712K2)).booleanValue()) {
            this.f9484r.f11167b.d(new Throwable().getStackTrace());
        }
        this.f9486t.b((Activity) BinderC2361b.t1(interfaceC2360a), this.f9487u);
    }

    @Override // Q2.K
    public final InterfaceC0391w0 o() {
        return null;
    }

    @Override // Q2.K
    public final synchronized boolean o2() {
        return false;
    }

    @Override // Q2.K
    public final synchronized String t() {
        return this.f9480n;
    }

    @Override // Q2.K
    public final synchronized void u1() {
        m3.v.c("showInterstitial must be called on the main UI thread.");
        if (this.f9486t == null) {
            U2.j.i("Interstitial can not be shown before loaded.");
            this.f9482p.q(AbstractC1803xs.I(9, null, null));
        } else {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8712K2)).booleanValue()) {
                this.f9484r.f11167b.d(new Throwable().getStackTrace());
            }
            this.f9486t.b(null, this.f9487u);
        }
    }

    public final synchronized boolean u3() {
        C0898dj c0898dj = this.f9486t;
        if (c0898dj != null) {
            if (!c0898dj.f13145n.f14127l.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // Q2.K
    public final synchronized void v() {
        m3.v.c("destroy must be called on the main UI thread.");
        C0898dj c0898dj = this.f9486t;
        if (c0898dj != null) {
            Xh xh = c0898dj.f12694c;
            xh.getClass();
            xh.n1(new E7(null, 1));
        }
    }

    @Override // Q2.K
    public final synchronized boolean v0(Q2.X0 x02) {
        boolean z3;
        try {
            if (!x02.f4959m.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) AbstractC0968f8.i.s()).booleanValue()) {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                        z3 = true;
                        if (this.f9481o.f5854m >= ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue() || !z3) {
                            m3.v.c("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z3 = false;
                if (this.f9481o.f5854m >= ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue()) {
                }
                m3.v.c("loadAd must be called on the main UI thread.");
            }
            T2.L l5 = P2.o.f4767B.f4771c;
            if (T2.L.g(this.f9478l) && x02.f4950C == null) {
                U2.j.f("Failed to load the ad because app ID is missing.");
                Eo eo = this.f9482p;
                if (eo != null) {
                    eo.l0(AbstractC1803xs.I(4, null, null));
                }
            } else if (!u3()) {
                AbstractC1668us.o(this.f9478l, x02.f4962p);
                this.f9486t = null;
                return this.f9479m.b(x02, this.f9480n, new C1711vq(this.f9477k), new U4(24, this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final synchronized String w() {
        Ih ih;
        C0898dj c0898dj = this.f9486t;
        if (c0898dj == null || (ih = c0898dj.f) == null) {
            return null;
        }
        return ih.f9590k;
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
    public final void F1(Q2.V0 v02) {
    }

    @Override // Q2.K
    public final void H2(InterfaceC0386u interfaceC0386u) {
    }

    @Override // Q2.K
    public final void K1(Q2.d1 d1Var) {
    }

    @Override // Q2.K
    public final void P0(Q2.U u5) {
    }

    @Override // Q2.K
    public final void w0(Q2.a1 a1Var) {
    }
}
