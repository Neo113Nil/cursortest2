package com.google.android.gms.internal.ads;

import Q2.C0370l0;
import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Iq extends AbstractBinderC0605Hc {

    /* renamed from: l, reason: collision with root package name */
    public final Fq f9628l;

    /* renamed from: m, reason: collision with root package name */
    public final Bq f9629m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9630n;

    /* renamed from: o, reason: collision with root package name */
    public final Tq f9631o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f9632p;

    /* renamed from: q, reason: collision with root package name */
    public final U2.a f9633q;

    /* renamed from: r, reason: collision with root package name */
    public final Q4 f9634r;

    /* renamed from: s, reason: collision with root package name */
    public final C1482ql f9635s;

    /* renamed from: t, reason: collision with root package name */
    public Qk f9636t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9637u = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8683F0)).booleanValue();

    public Iq(String str, Fq fq, Context context, Bq bq, Tq tq, U2.a aVar, Q4 q42, C1482ql c1482ql) {
        this.f9630n = str;
        this.f9628l = fq;
        this.f9629m = bq;
        this.f9631o = tq;
        this.f9632p = context;
        this.f9633q = aVar;
        this.f9634r = q42;
        this.f9635s = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final synchronized void L0(InterfaceC2360a interfaceC2360a) {
        z2(interfaceC2360a, this.f9637u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final synchronized void U2(C0696Uc c0696Uc) {
        m3.v.c("#008 Must be called on the main UI thread.");
        Tq tq = this.f9631o;
        tq.f11693a = c0696Uc.f11769k;
        tq.f11694b = c0696Uc.f11770l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final synchronized void V1(Q2.X0 x02, InterfaceC0661Pc interfaceC0661Pc) {
        u3(x02, interfaceC0661Pc, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final void V2(InterfaceC0633Lc interfaceC0633Lc) {
        m3.v.c("#008 Must be called on the main UI thread.");
        this.f9629m.f7896n.set(interfaceC0633Lc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final synchronized String b() {
        Ih ih;
        Qk qk = this.f9636t;
        if (qk == null || (ih = qk.f) == null) {
            return null;
        }
        return ih.f9590k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final Bundle d() {
        m3.v.c("#008 Must be called on the main UI thread.");
        Qk qk = this.f9636t;
        return qk != null ? qk.b() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final synchronized void f1(Q2.X0 x02, InterfaceC0661Pc interfaceC0661Pc) {
        u3(x02, interfaceC0661Pc, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final InterfaceC0383s0 i() {
        Qk qk;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.q6)).booleanValue() && (qk = this.f9636t) != null) {
            return qk.f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final InterfaceC0591Fc j() {
        m3.v.c("#008 Must be called on the main UI thread.");
        Qk qk = this.f9636t;
        if (qk != null) {
            return qk.f11240q;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final boolean n() {
        m3.v.c("#008 Must be called on the main UI thread.");
        Qk qk = this.f9636t;
        return (qk == null || qk.f11243t) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final void p2(C0370l0 c0370l0) {
        Bq bq = this.f9629m;
        if (c0370l0 == null) {
            bq.f7894l.set(null);
        } else {
            bq.f7894l.set(new Gq(this, c0370l0, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final void q0(InterfaceC0374n0 interfaceC0374n0) {
        m3.v.c("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC0374n0.c()) {
                this.f9635s.b();
            }
        } catch (RemoteException e3) {
            U2.j.e("Error in making CSI ping for reporting paid event callback", e3);
        }
        this.f9629m.f7900r.set(interfaceC0374n0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final synchronized void t0(boolean z3) {
        m3.v.c("setImmersiveMode must be called on the main UI thread.");
        this.f9637u = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final void t2(C0668Qc c0668Qc) {
        m3.v.c("#008 Must be called on the main UI thread.");
        this.f9629m.f7898p.set(c0668Qc);
    }

    public final synchronized void u3(Q2.X0 x02, InterfaceC0661Pc interfaceC0661Pc, int i) {
        try {
            boolean z3 = false;
            if (!x02.f4959m.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) AbstractC0968f8.f13462k.s()).booleanValue()) {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                        z3 = true;
                    }
                }
                if (this.f9633q.f5854m < ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue() || !z3) {
                    m3.v.c("#008 Must be called on the main UI thread.");
                }
            }
            this.f9629m.f7895m.set(interfaceC0661Pc);
            T2.L l5 = P2.o.f4767B.f4771c;
            if (T2.L.g(this.f9632p) && x02.f4950C == null) {
                U2.j.f("Failed to load the ad because app ID is missing.");
                this.f9629m.l0(AbstractC1803xs.I(4, null, null));
                return;
            }
            if (this.f9636t != null) {
                return;
            }
            Cq cq = new Cq();
            Fq fq = this.f9628l;
            fq.f9133h.f11955o.f17003l = i;
            fq.a(x02, this.f9630n, cq, new Hq(0, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final synchronized void z2(InterfaceC2360a interfaceC2360a, boolean z3) {
        m3.v.c("#008 Must be called on the main UI thread.");
        if (this.f9636t == null) {
            U2.j.i("Rewarded can not be shown before loaded");
            this.f9629m.q(AbstractC1803xs.I(9, null, null));
            return;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8712K2)).booleanValue()) {
            this.f9634r.f11167b.d(new Throwable().getStackTrace());
        }
        this.f9636t.c((Activity) BinderC2361b.t1(interfaceC2360a), z3);
    }
}
