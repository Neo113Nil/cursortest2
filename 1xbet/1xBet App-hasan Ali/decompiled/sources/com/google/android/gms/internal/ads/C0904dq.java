package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import Q2.InterfaceC0374n0;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.dq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904dq implements Ph, InterfaceC1031gi, InterfaceC1487qq, S2.m, InterfaceC1209ki, Th, Vi {

    /* renamed from: k, reason: collision with root package name */
    public final C1085hr f13174k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f13175l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f13176m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f13177n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f13178o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f13179p = new AtomicReference();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f13180q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    public C0904dq f13181r = null;

    public C0904dq(C1085hr c1085hr) {
        this.f13174k = c1085hr;
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void E() {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.E();
            return;
        }
        Object obj = this.f13177n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1189k6) obj).a();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // S2.m
    public final void N2() {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.N2();
            return;
        }
        Object obj = this.f13179p.get();
        if (obj != null) {
            try {
                ((S2.m) obj).N2();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        AtomicReference atomicReference = this.f13177n;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC1189k6) obj2).c();
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
            ((InterfaceC1189k6) obj3).b();
        } catch (RemoteException e8) {
            U2.j.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // S2.m
    public final void Q1() {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.Q1();
        } else {
            AbstractC1803xs.p(this.f13179p, new Oi(25));
        }
    }

    @Override // S2.m
    public final void Z2() {
    }

    public final void a() {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.a();
            return;
        }
        Dp dp = this.f13174k.f13810a;
        if (dp != null) {
            C1245lH c1245lH = (C1245lH) dp.f8377l;
            synchronized (c1245lH) {
                c1245lH.f14376k = 1;
                c1245lH.h();
            }
        }
        if (this.f13176m.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj = this.f13177n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1189k6) obj).p();
        } catch (RemoteException e6) {
            U2.j.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public final void b(BinderC0571Cg binderC0571Cg) {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.b(binderC0571Cg);
            return;
        }
        Object obj = this.f13175l.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1101i6) obj).n0(binderC0571Cg);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // S2.m
    public final void d1(int i) {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.d1(i);
            return;
        }
        Object obj = this.f13179p.get();
        if (obj == null) {
            return;
        }
        try {
            ((S2.m) obj).d1(i);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1031gi
    public final void f() {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.f();
        } else {
            AbstractC1803xs.p(this.f13178o, new Oi(26));
        }
    }

    @Override // S2.m
    public final void h1() {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.h1();
        } else {
            AbstractC1803xs.p(this.f13179p, new Oi(27));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1209ki
    public final void j(Q2.b1 b1Var) {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.j(b1Var);
            return;
        }
        Object obj = this.f13180q.get();
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

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.l0(c0387u0);
            return;
        }
        AtomicReference atomicReference = this.f13175l;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC1101i6) obj).e2(c0387u0);
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC1101i6) obj2).z(c0387u0.f5058k);
        } catch (RemoteException e6) {
            U2.j.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Th
    public final void q(C0387u0 c0387u0) {
        C0904dq c0904dq = this.f13181r;
        if (c0904dq != null) {
            c0904dq.q(c0387u0);
            return;
        }
        Object obj = this.f13177n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1189k6) obj).a0(c0387u0);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // S2.m
    public final void t1() {
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void u() {
    }
}
