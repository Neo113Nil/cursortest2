package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import Q2.InterfaceC0347a;
import Q2.InterfaceC0374n0;
import Q2.InterfaceC0392x;
import android.os.RemoteException;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Eo implements K2.d, InterfaceC1434pi, InterfaceC0808bi, Ph, Vh, InterfaceC0347a, Mh, InterfaceC1209ki, Th, Vi {

    /* renamed from: s, reason: collision with root package name */
    public final C1482ql f8603s;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f8595k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f8596l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f8597m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f8598n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f8599o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f8600p = new AtomicBoolean(true);

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f8601q = new AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f8602r = new AtomicBoolean(false);

    /* renamed from: t, reason: collision with root package name */
    public final ArrayBlockingQueue f8604t = new ArrayBlockingQueue(((Integer) Q2.r.f5053d.f5056c.a(F7.w8)).intValue());

    public Eo(C1482ql c1482ql) {
        this.f8603s = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
        this.f8600p.set(true);
        this.f8602r.set(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void E() {
        Object obj;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.pa)).booleanValue() && (obj = this.f8595k.get()) != null) {
            try {
                ((InterfaceC0392x) obj).p();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f8599o.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((Q2.W) obj2).a();
        } catch (RemoteException e6) {
            U2.j.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void a() {
        Object obj = this.f8595k.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC0392x) obj).g();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void c() {
    }

    public final synchronized InterfaceC0392x d() {
        return (InterfaceC0392x) this.f8595k.get();
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void i() {
        AbstractC1803xs.p(this.f8595k, new Oi(23));
        AbstractC1803xs.p(this.f8599o, new Oi(24));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1209ki
    public final void j(Q2.b1 b1Var) {
        Object obj = this.f8597m.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC0374n0) obj).X2(b1Var);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final synchronized void j0() {
        Object obj = this.f8595k.get();
        if (obj != null) {
            try {
                try {
                    ((InterfaceC0392x) obj).e();
                } catch (NullPointerException e3) {
                    U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e3);
                }
            } catch (RemoteException e5) {
                U2.j.k("#007 Could not call remote method.", e5);
            }
        }
        Object obj2 = this.f8598n.get();
        if (obj2 != null) {
            try {
                ((Q2.A) obj2).p();
            } catch (RemoteException e6) {
                U2.j.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        this.f8602r.set(true);
        o();
    }

    public final void k(Q2.Q q5) {
        this.f8596l.set(q5);
        this.f8601q.set(true);
        o();
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        AtomicReference atomicReference = this.f8595k;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC0392x) obj).q(c0387u0);
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC0392x) obj2).x(c0387u0.f5058k);
            } catch (RemoteException e6) {
                U2.j.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj3 = this.f8598n.get();
        if (obj3 != null) {
            try {
                ((Q2.A) obj3).e1(c0387u0);
            } catch (RemoteException e8) {
                U2.j.k("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        this.f8600p.set(false);
        this.f8604t.clear();
    }

    public final void o() {
        if (this.f8601q.get() && this.f8602r.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.f8604t;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f8596l.get();
                if (obj != null) {
                    try {
                        ((Q2.Q) obj).T1((String) pair.first, (String) pair.second);
                    } catch (RemoteException e3) {
                        U2.j.k("#007 Could not call remote method.", e3);
                    } catch (NullPointerException e5) {
                        U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f8600p.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void p() {
        Object obj = this.f8595k.get();
        if (obj != null) {
            try {
                ((InterfaceC0392x) obj).h();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        AtomicReference atomicReference = this.f8599o;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((Q2.W) obj2).c();
            } catch (RemoteException e6) {
                U2.j.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((Q2.W) obj3).b();
        } catch (RemoteException e8) {
            U2.j.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Th
    public final void q(C0387u0 c0387u0) {
        Object obj = this.f8599o.get();
        if (obj == null) {
            return;
        }
        try {
            ((Q2.W) obj).a0(c0387u0);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        AbstractC1803xs.p(this.f8595k, new Oi(22));
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void u() {
        Object obj = this.f8595k.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC0392x) obj).k();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // K2.d
    public final synchronized void w(String str, String str2) {
        if (!this.f8600p.get()) {
            Object obj = this.f8596l.get();
            if (obj != null) {
                try {
                    ((Q2.Q) obj).T1(str, str2);
                } catch (RemoteException e3) {
                    U2.j.k("#007 Could not call remote method.", e3);
                } catch (NullPointerException e5) {
                    U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
                }
            }
            return;
        }
        if (!this.f8604t.offer(new Pair(str, str2))) {
            U2.j.d("The queue for app events is full, dropping the new event.");
            C1482ql c1482ql = this.f8603s;
            if (c1482ql != null) {
                C1390oj a5 = c1482ql.a();
                a5.k("action", "dae_action");
                a5.k("dae_name", str);
                a5.k("dae_data", str2);
                a5.q();
            }
        }
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        Object obj;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.pa)).booleanValue() || (obj = this.f8595k.get()) == null) {
            return;
        }
        try {
            ((InterfaceC0392x) obj).p();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void C(BinderC1652uc binderC1652uc, String str, String str2) {
    }
}
