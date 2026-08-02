package com.google.android.gms.internal.ads;

import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import Q2.InterfaceC0386u;
import Q2.InterfaceC0391w0;
import Q2.InterfaceC0392x;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.hq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1084hq extends Q2.J implements S2.m, Z5 {

    /* renamed from: k, reason: collision with root package name */
    public final C0554Af f13799k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f13800l;

    /* renamed from: n, reason: collision with root package name */
    public final String f13802n;

    /* renamed from: o, reason: collision with root package name */
    public final C0949eq f13803o;

    /* renamed from: p, reason: collision with root package name */
    public final C0904dq f13804p;

    /* renamed from: q, reason: collision with root package name */
    public final U2.a f13805q;

    /* renamed from: r, reason: collision with root package name */
    public final C1482ql f13806r;

    /* renamed from: t, reason: collision with root package name */
    public C1836yg f13808t;

    /* renamed from: u, reason: collision with root package name */
    public C0563Bg f13809u;

    /* renamed from: m, reason: collision with root package name */
    public AtomicBoolean f13801m = new AtomicBoolean();

    /* renamed from: s, reason: collision with root package name */
    public long f13807s = -1;

    public BinderC1084hq(C0554Af c0554Af, Context context, String str, C0949eq c0949eq, C0904dq c0904dq, U2.a aVar, C1482ql c1482ql) {
        this.f13799k = c0554Af;
        this.f13800l = context;
        this.f13802n = str;
        this.f13803o = c0949eq;
        this.f13804p = c0904dq;
        this.f13805q = aVar;
        this.f13806r = c1482ql;
        c0904dq.f13179p.set(this);
    }

    @Override // Q2.K
    public final synchronized String A() {
        return null;
    }

    @Override // Q2.K
    public final synchronized void D() {
        m3.v.c("resume must be called on the main UI thread.");
    }

    @Override // Q2.K
    public final synchronized void F1(Q2.V0 v02) {
    }

    @Override // Q2.K
    public final void K1(Q2.d1 d1Var) {
        this.f13803o.i.i = d1Var;
    }

    @Override // Q2.K
    public final synchronized void N0(N7 n7) {
    }

    @Override // S2.m
    public final synchronized void N2() {
        if (this.f13809u != null) {
            P2.o oVar = P2.o.f4767B;
            oVar.f4776j.getClass();
            this.f13807s = SystemClock.elapsedRealtime();
            int i = this.f13809u.f7856k;
            if (i > 0) {
                C1836yg c1836yg = new C1836yg((ScheduledExecutorService) this.f13799k.f7650d.d(), oVar.f4776j);
                this.f13808t = c1836yg;
                c1836yg.b(i, new RunnableC0994fq(this, 1));
            }
        }
    }

    @Override // Q2.K
    public final synchronized void P0(Q2.U u5) {
    }

    @Override // Q2.K
    public final void P2(InterfaceC1101i6 interfaceC1101i6) {
        this.f13804p.f13175l.set(interfaceC1101i6);
    }

    @Override // S2.m
    public final void Q1() {
    }

    @Override // Q2.K
    public final synchronized boolean S2() {
        boolean z3;
        E3.a aVar = this.f13803o.f13362j;
        if (aVar != null) {
            z3 = aVar.isDone() ? false : true;
        }
        return z3;
    }

    @Override // Q2.K
    public final void U1(boolean z3) {
    }

    @Override // Q2.K
    public final boolean X() {
        return false;
    }

    @Override // S2.m
    public final void Z2() {
    }

    @Override // S2.m
    public final void d1(int i) {
        if (i == 0) {
            throw null;
        }
        int i5 = i - 1;
        if (i5 == 0) {
            u3(2);
            return;
        }
        if (i5 == 1) {
            u3(4);
        } else if (i5 != 2) {
            u3(6);
        } else {
            u3(3);
        }
    }

    @Override // Q2.K
    public final InterfaceC0392x e() {
        return null;
    }

    @Override // Q2.K
    public final synchronized void e0() {
    }

    @Override // Q2.K
    public final synchronized Q2.a1 f() {
        return null;
    }

    @Override // Q2.K
    public final Q2.Q h() {
        return null;
    }

    @Override // S2.m
    public final synchronized void h1() {
        C0563Bg c0563Bg = this.f13809u;
        if (c0563Bg != null) {
            P2.o.f4767B.f4776j.getClass();
            c0563Bg.d(1, SystemClock.elapsedRealtime() - this.f13807s);
        }
    }

    @Override // Q2.K
    public final Bundle j() {
        return new Bundle();
    }

    @Override // Q2.K
    public final synchronized void j1() {
        m3.v.c("pause must be called on the main UI thread.");
    }

    @Override // Q2.K
    public final synchronized InterfaceC0383s0 k() {
        return null;
    }

    @Override // Q2.K
    public final InterfaceC2360a m() {
        return null;
    }

    @Override // Q2.K
    public final synchronized void m3(boolean z3) {
    }

    @Override // Q2.K
    public final synchronized InterfaceC0391w0 o() {
        return null;
    }

    @Override // Q2.K
    public final synchronized boolean o2() {
        return false;
    }

    @Override // Q2.K
    public final synchronized String t() {
        return this.f13802n;
    }

    @Override // S2.m
    public final void t1() {
    }

    @Override // Q2.K
    public final synchronized void u1() {
    }

    public final synchronized void u3(int i) {
        try {
            if (this.f13801m.compareAndSet(false, true)) {
                this.f13804p.a();
                C1836yg c1836yg = this.f13808t;
                if (c1836yg != null) {
                    P2.o.f4767B.f.p(c1836yg);
                }
                if (this.f13809u != null) {
                    long j5 = -1;
                    if (this.f13807s != -1) {
                        P2.o.f4767B.f4776j.getClass();
                        j5 = SystemClock.elapsedRealtime() - this.f13807s;
                    }
                    this.f13809u.d(i, j5);
                }
                v();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final synchronized void v() {
        m3.v.c("destroy must be called on the main UI thread.");
        C0563Bg c0563Bg = this.f13809u;
        if (c0563Bg != null) {
            c0563Bg.b();
        }
    }

    @Override // Q2.K
    public final synchronized boolean v0(Q2.X0 x02) {
        boolean z3;
        try {
            if (!x02.f4959m.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) AbstractC0968f8.f13457d.s()).booleanValue()) {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                        z3 = true;
                        if (this.f13805q.f5854m >= ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue() || !z3) {
                            m3.v.c("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z3 = false;
                if (this.f13805q.f5854m >= ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue()) {
                }
                m3.v.c("loadAd must be called on the main UI thread.");
            }
            T2.L l5 = P2.o.f4767B.f4771c;
            if (T2.L.g(this.f13800l) && x02.f4950C == null) {
                U2.j.f("Failed to load the ad because app ID is missing.");
                this.f13804p.l0(AbstractC1803xs.I(4, null, null));
                return false;
            }
            if (S2()) {
                return false;
            }
            this.f13801m = new AtomicBoolean();
            return this.f13803o.a(x02, this.f13802n, new C1039gq(), new U4(25, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q2.K
    public final synchronized String w() {
        return null;
    }

    @Override // Q2.K
    public final synchronized void w0(Q2.a1 a1Var) {
        m3.v.c("setAdSize must be called on the main UI thread.");
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
    public final void c0() {
    }

    @Override // Q2.K
    public final void d0() {
    }

    @Override // Q2.K
    public final void G1(InterfaceC0374n0 interfaceC0374n0) {
    }

    @Override // Q2.K
    public final void H2(InterfaceC0386u interfaceC0386u) {
    }

    @Override // Q2.K
    public final void O0(InterfaceC0392x interfaceC0392x) {
    }

    @Override // Q2.K
    public final void X0(Q2.W w5) {
    }

    @Override // Q2.K
    public final void b3(C1832yc c1832yc) {
    }

    @Override // Q2.K
    public final void h3(Q2.Q q5) {
    }

    @Override // Q2.K
    public final void n3(InterfaceC2360a interfaceC2360a) {
    }

    @Override // Q2.K
    public final void b2(Q2.X0 x02, Q2.A a5) {
    }
}
