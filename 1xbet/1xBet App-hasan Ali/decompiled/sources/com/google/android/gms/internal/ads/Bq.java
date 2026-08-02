package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import Q2.InterfaceC0374n0;
import android.os.Parcel;
import android.os.RemoteException;
import d3.InterfaceC1915a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Bq implements InterfaceC1915a, InterfaceC0808bi, Ph, Mh, Th, InterfaceC1209ki, InterfaceC1487qq, Vi {

    /* renamed from: k, reason: collision with root package name */
    public final C1085hr f7893k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f7894l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f7895m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f7896n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f7897o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f7898p = new AtomicReference();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f7899q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReference f7900r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    public final Bq f7901s = null;

    public Bq(C1085hr c1085hr) {
        this.f7893k = c1085hr;
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void C(BinderC1652uc binderC1652uc, String str, String str2) {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.C(binderC1652uc, str, str2);
            return;
        }
        Object obj = this.f7896n.get();
        String str3 = binderC1652uc.f15866k;
        int i = binderC1652uc.f15867l;
        if (obj != null) {
            try {
                ((InterfaceC0633Lc) obj).z1(new BinderC0703Vc(str3, i));
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f7898p.get();
        if (obj2 != null) {
            try {
                C0668Qc c0668Qc = (C0668Qc) obj2;
                BinderC0703Vc binderC0703Vc = new BinderC0703Vc(str3, i);
                Parcel N5 = c0668Qc.N();
                F5.e(N5, binderC0703Vc);
                N5.writeString(str);
                N5.writeString(str2);
                c0668Qc.d1(N5, 2);
            } catch (RemoteException e6) {
                U2.j.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj3 = this.f7897o.get();
        if (obj3 != null) {
            try {
                C1832yc c1832yc = (C1832yc) obj3;
                Parcel N6 = c1832yc.N();
                F5.e(N6, binderC1652uc);
                c1832yc.d1(N6, 5);
            } catch (RemoteException e8) {
                U2.j.k("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj4 = this.f7899q.get();
        if (obj4 == null) {
            return;
        }
        try {
            C1742wc c1742wc = (C1742wc) obj4;
            Parcel N7 = c1742wc.N();
            F5.e(N7, binderC1652uc);
            N7.writeString(str);
            N7.writeString(str2);
            c1742wc.d1(N7, 2);
        } catch (RemoteException e10) {
            U2.j.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void E() {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.E();
        } else {
            AbstractC1803xs.p(this.f7896n, new Aq(0, (byte) 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void a() {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.a();
            return;
        }
        Object obj = this.f7897o.get();
        if (obj == null) {
            return;
        }
        try {
            C1832yc c1832yc = (C1832yc) obj;
            c1832yc.d1(c1832yc.N(), 6);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void b() {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.b();
            return;
        }
        Object obj = this.f7897o.get();
        if (obj == null) {
            return;
        }
        try {
            C1832yc c1832yc = (C1832yc) obj;
            c1832yc.d1(c1832yc.N(), 8);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void c() {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.c();
            return;
        }
        Object obj = this.f7897o.get();
        if (obj == null) {
            return;
        }
        try {
            C1832yc c1832yc = (C1832yc) obj;
            c1832yc.d1(c1832yc.N(), 3);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e5) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // d3.InterfaceC1915a
    public final void d() {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.d();
        } else {
            AbstractC1803xs.p(this.f7894l, new Oi(29));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void i() {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.i();
            return;
        }
        Dp dp = this.f7893k.f13810a;
        if (dp != null) {
            C1245lH c1245lH = (C1245lH) dp.f8377l;
            synchronized (c1245lH) {
                c1245lH.f14376k = 1;
                c1245lH.h();
            }
        }
        Object obj = this.f7896n.get();
        if (obj != null) {
            try {
                ((InterfaceC0633Lc) obj).f();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f7897o.get();
        if (obj2 == null) {
            return;
        }
        try {
            C1832yc c1832yc = (C1832yc) obj2;
            c1832yc.d1(c1832yc.N(), 4);
        } catch (RemoteException e6) {
            U2.j.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1209ki
    public final void j(Q2.b1 b1Var) {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.j(b1Var);
            return;
        }
        Object obj = this.f7900r.get();
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
    public final void j0() {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.j0();
            return;
        }
        Object obj = this.f7895m.get();
        if (obj != null) {
            try {
                ((InterfaceC0661Pc) obj).f();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f7897o.get();
        if (obj2 == null) {
            return;
        }
        try {
            C1832yc c1832yc = (C1832yc) obj2;
            c1832yc.d1(c1832yc.N(), 1);
        } catch (RemoteException e6) {
            U2.j.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.l0(c0387u0);
            return;
        }
        AtomicReference atomicReference = this.f7895m;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC0661Pc) obj).q(c0387u0);
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = atomicReference.get();
        int i = c0387u0.f5058k;
        if (obj2 != null) {
            try {
                ((InterfaceC0661Pc) obj2).x(i);
            } catch (RemoteException e6) {
                U2.j.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj3 = this.f7897o.get();
        if (obj3 == null) {
            return;
        }
        try {
            C1832yc c1832yc = (C1832yc) obj3;
            Parcel N5 = c1832yc.N();
            N5.writeInt(i);
            c1832yc.d1(N5, 7);
        } catch (RemoteException e8) {
            U2.j.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void p() {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.p();
            return;
        }
        AtomicReference atomicReference = this.f7896n;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC0633Lc) obj).h();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e5) {
                U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f7897o.get();
        if (obj2 != null) {
            try {
                C1832yc c1832yc = (C1832yc) obj2;
                c1832yc.d1(c1832yc.N(), 2);
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
            ((InterfaceC0633Lc) obj3).c();
        } catch (RemoteException e8) {
            U2.j.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Th
    public final void q(C0387u0 c0387u0) {
        Bq bq = this.f7901s;
        if (bq != null) {
            bq.q(c0387u0);
            return;
        }
        AtomicReference atomicReference = this.f7896n;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC0633Lc) obj).J0(c0387u0);
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
            ((InterfaceC0633Lc) obj2).f0(c0387u0.f5058k);
        } catch (RemoteException e6) {
            U2.j.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            U2.j.j("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void u() {
    }
}
