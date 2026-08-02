package com.google.android.gms.internal.ads;

import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import Q2.InterfaceC0386u;
import Q2.InterfaceC0391w0;
import Q2.InterfaceC0392x;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Do extends Q2.J implements InterfaceC1254li {

    /* renamed from: k, reason: collision with root package name */
    public final Context f8367k;

    /* renamed from: l, reason: collision with root package name */
    public final C1128iq f8368l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8369m;

    /* renamed from: n, reason: collision with root package name */
    public final Eo f8370n;

    /* renamed from: o, reason: collision with root package name */
    public Q2.a1 f8371o;

    /* renamed from: p, reason: collision with root package name */
    public final Vq f8372p;

    /* renamed from: q, reason: collision with root package name */
    public final U2.a f8373q;

    /* renamed from: r, reason: collision with root package name */
    public final C1482ql f8374r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0579Dg f8375s;

    public Do(Context context, Q2.a1 a1Var, String str, C1128iq c1128iq, Eo eo, U2.a aVar, C1482ql c1482ql) {
        this.f8367k = context;
        this.f8368l = c1128iq;
        this.f8371o = a1Var;
        this.f8369m = str;
        this.f8370n = eo;
        this.f8372p = c1128iq.f14004k;
        this.f8373q = aVar;
        this.f8374r = c1482ql;
        c1128iq.f14002h.m1(this, c1128iq.f13997b);
    }

    @Override // Q2.K
    public final synchronized String A() {
        Ih ih;
        AbstractC0579Dg abstractC0579Dg = this.f8375s;
        if (abstractC0579Dg == null || (ih = abstractC0579Dg.f) == null) {
            return null;
        }
        return ih.f9590k;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // Q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void D() {
        AbstractC0579Dg abstractC0579Dg;
        try {
            if (((Boolean) AbstractC0968f8.f13460h.s()).booleanValue()) {
                A7 a7 = F7.Ha;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    if (this.f8373q.f5854m < ((Integer) rVar.f5056c.a(F7.Na)).intValue()) {
                    }
                    abstractC0579Dg = this.f8375s;
                    if (abstractC0579Dg == null) {
                        Xh xh = abstractC0579Dg.f12694c;
                        xh.getClass();
                        xh.n1(new C1864z7(null, false));
                        return;
                    }
                    return;
                }
            }
            m3.v.c("resume must be called on the main UI thread.");
            abstractC0579Dg = this.f8375s;
            if (abstractC0579Dg == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final synchronized void F1(Q2.V0 v02) {
        try {
            if (w3()) {
                m3.v.c("setVideoOptions must be called on the main UI thread.");
            }
            this.f8372p.f11946d = v02;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final void G1(InterfaceC0374n0 interfaceC0374n0) {
        if (w3()) {
            m3.v.c("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!interfaceC0374n0.c()) {
                this.f8374r.b();
            }
        } catch (RemoteException e3) {
            U2.j.e("Error in making CSI ping for reporting paid event callback", e3);
        }
        this.f8370n.f8597m.set(interfaceC0374n0);
    }

    @Override // Q2.K
    public final void H2(InterfaceC0386u interfaceC0386u) {
        if (w3()) {
            m3.v.c("setAdListener must be called on the main UI thread.");
        }
        Go go = this.f8368l.f14000e;
        synchronized (go) {
            go.f9265k = interfaceC0386u;
        }
    }

    @Override // Q2.K
    public final synchronized void N0(N7 n7) {
        m3.v.c("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f8368l.f14001g = n7;
    }

    @Override // Q2.K
    public final void O0(InterfaceC0392x interfaceC0392x) {
        if (w3()) {
            m3.v.c("setAdListener must be called on the main UI thread.");
        }
        this.f8370n.f8595k.set(interfaceC0392x);
    }

    @Override // Q2.K
    public final synchronized void P0(Q2.U u5) {
        m3.v.c("setCorrelationIdProvider must be called on the main UI thread");
        this.f8372p.f11961u = u5;
    }

    @Override // Q2.K
    public final void P2(InterfaceC1101i6 interfaceC1101i6) {
    }

    @Override // Q2.K
    public final synchronized boolean S2() {
        return this.f8368l.a();
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
        m3.v.c("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // Q2.K
    public final InterfaceC0392x e() {
        return this.f8370n.d();
    }

    @Override // Q2.K
    public final synchronized void e0() {
        m3.v.c("recordManualImpression must be called on the main UI thread.");
        AbstractC0579Dg abstractC0579Dg = this.f8375s;
        if (abstractC0579Dg != null) {
            abstractC0579Dg.h();
        }
    }

    @Override // Q2.K
    public final synchronized Q2.a1 f() {
        m3.v.c("getAdSize must be called on the main UI thread.");
        AbstractC0579Dg abstractC0579Dg = this.f8375s;
        if (abstractC0579Dg != null) {
            return AbstractC1668us.g(this.f8367k, Collections.singletonList(abstractC0579Dg.f()));
        }
        return this.f8372p.f11944b;
    }

    @Override // Q2.K
    public final Q2.Q h() {
        Q2.Q q5;
        Eo eo = this.f8370n;
        synchronized (eo) {
            q5 = (Q2.Q) eo.f8596l.get();
        }
        return q5;
    }

    @Override // Q2.K
    public final void h3(Q2.Q q5) {
        if (w3()) {
            m3.v.c("setAppEventListener must be called on the main UI thread.");
        }
        this.f8370n.k(q5);
    }

    @Override // Q2.K
    public final Bundle j() {
        m3.v.c("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // Q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void j1() {
        AbstractC0579Dg abstractC0579Dg;
        try {
            if (((Boolean) AbstractC0968f8.f13459g.s()).booleanValue()) {
                A7 a7 = F7.Ja;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    if (this.f8373q.f5854m < ((Integer) rVar.f5056c.a(F7.Na)).intValue()) {
                    }
                    abstractC0579Dg = this.f8375s;
                    if (abstractC0579Dg == null) {
                        Xh xh = abstractC0579Dg.f12694c;
                        xh.getClass();
                        xh.n1(new Ms(null, 1));
                        return;
                    }
                    return;
                }
            }
            m3.v.c("pause must be called on the main UI thread.");
            abstractC0579Dg = this.f8375s;
            if (abstractC0579Dg == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final synchronized InterfaceC0383s0 k() {
        AbstractC0579Dg abstractC0579Dg;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.q6)).booleanValue() && (abstractC0579Dg = this.f8375s) != null) {
            return abstractC0579Dg.f;
        }
        return null;
    }

    @Override // Q2.K
    public final InterfaceC2360a m() {
        if (w3()) {
            m3.v.c("getAdFrame must be called on the main UI thread.");
        }
        return new BinderC2361b(this.f8368l.f);
    }

    @Override // Q2.K
    public final synchronized void m3(boolean z3) {
        try {
            if (w3()) {
                m3.v.c("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f8372p.f11947e = z3;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final synchronized InterfaceC0391w0 o() {
        m3.v.c("getVideoController must be called from the main thread.");
        AbstractC0579Dg abstractC0579Dg = this.f8375s;
        if (abstractC0579Dg == null) {
            return null;
        }
        return abstractC0579Dg.e();
    }

    @Override // Q2.K
    public final synchronized boolean o2() {
        AbstractC0579Dg abstractC0579Dg = this.f8375s;
        if (abstractC0579Dg != null) {
            if (abstractC0579Dg.f12693b.f10520q0) {
                return true;
            }
        }
        return false;
    }

    @Override // Q2.K
    public final synchronized String t() {
        return this.f8369m;
    }

    @Override // Q2.K
    public final void u1() {
    }

    public final synchronized void u3(Q2.a1 a1Var) {
        Vq vq = this.f8372p;
        vq.f11944b = a1Var;
        vq.f11957q = this.f8371o.f4987x;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // Q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void v() {
        AbstractC0579Dg abstractC0579Dg;
        try {
            if (((Boolean) AbstractC0968f8.f13458e.s()).booleanValue()) {
                A7 a7 = F7.Ia;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    if (this.f8373q.f5854m < ((Integer) rVar.f5056c.a(F7.Na)).intValue()) {
                    }
                    abstractC0579Dg = this.f8375s;
                    if (abstractC0579Dg == null) {
                        Xh xh = abstractC0579Dg.f12694c;
                        xh.getClass();
                        xh.n1(new E7(null, 1));
                        return;
                    }
                    return;
                }
            }
            m3.v.c("destroy must be called on the main UI thread.");
            abstractC0579Dg = this.f8375s;
            if (abstractC0579Dg == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final synchronized boolean v0(Q2.X0 x02) {
        u3(this.f8371o);
        return v3(x02);
    }

    public final synchronized boolean v3(Q2.X0 x02) {
        try {
            if (w3()) {
                m3.v.c("loadAd must be called on the main UI thread.");
            }
            T2.L l5 = P2.o.f4767B.f4771c;
            if (!T2.L.g(this.f8367k) || x02.f4950C != null) {
                AbstractC1668us.o(this.f8367k, x02.f4962p);
                return this.f8368l.b(x02, this.f8369m, null, new Qt(25, this));
            }
            U2.j.f("Failed to load the ad because app ID is missing.");
            Eo eo = this.f8370n;
            if (eo != null) {
                eo.l0(AbstractC1803xs.I(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final synchronized String w() {
        Ih ih;
        AbstractC0579Dg abstractC0579Dg = this.f8375s;
        if (abstractC0579Dg == null || (ih = abstractC0579Dg.f) == null) {
            return null;
        }
        return ih.f9590k;
    }

    @Override // Q2.K
    public final synchronized void w0(Q2.a1 a1Var) {
        m3.v.c("setAdSize must be called on the main UI thread.");
        this.f8372p.f11944b = a1Var;
        this.f8371o = a1Var;
        AbstractC0579Dg abstractC0579Dg = this.f8375s;
        if (abstractC0579Dg != null) {
            abstractC0579Dg.i(this.f8368l.f, a1Var);
        }
    }

    public final boolean w3() {
        boolean z3;
        if (((Boolean) AbstractC0968f8.f.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                z3 = true;
                return this.f8373q.f5854m >= ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue() || !z3;
            }
        }
        z3 = false;
        if (this.f8373q.f5854m >= ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue()) {
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
