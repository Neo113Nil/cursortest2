package Q2;

import P.C0328y0;
import P.InterfaceC0298j;
import a0.C0446b;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.view.View;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.C1390oj;
import com.google.android.gms.internal.ads.C1500r3;
import com.google.android.gms.internal.ads.C1725w3;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.K3;
import com.google.android.gms.internal.ads.P5;
import com.google.android.gms.internal.ads.U4;
import i4.InterfaceC2015a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k4.AbstractC2036a;
import r.C2322H;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f4902a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4903b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4904c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4905d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4906e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4907g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4908h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f4909j;

    /* renamed from: k, reason: collision with root package name */
    public Object f4910k;

    public C0(K3 k32, C1390oj c1390oj) {
        U4 u42 = new U4(new Handler(Looper.getMainLooper()));
        this.f4902a = new AtomicInteger();
        this.f4903b = new HashSet();
        this.f4904c = new PriorityBlockingQueue();
        this.f4905d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.f4909j = new ArrayList();
        this.f4906e = k32;
        this.f = c1390oj;
        this.f4907g = new C1725w3[4];
        this.f4910k = u42;
    }

    public static a1 f(Context context, J2.i[] iVarArr) {
        for (J2.i iVar : iVarArr) {
            if (iVar.equals(J2.i.f2713k)) {
                return new a1("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        a1 a1Var = new a1(context, iVarArr);
        a1Var.f4983t = false;
        return a1Var;
    }

    public void a() {
        this.f4902a = null;
        this.f4903b = null;
        R.e eVar = (R.e) this.f4904c;
        eVar.h();
        ((C2322H) this.f4905d).b();
        this.f4906e = eVar;
        ((R.e) this.f).h();
        ((R.e) this.f4907g).h();
        this.f4908h = null;
        this.i = null;
        this.f4909j = null;
    }

    public void b() {
        Set set = (Set) this.f4902a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                P.G0 g02 = (P.G0) it.next();
                it.remove();
                g02.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void c() {
        Set set = (Set) this.f4902a;
        if (set == null) {
            return;
        }
        this.f4910k = null;
        R.e eVar = (R.e) this.f;
        if (eVar.f5108m != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C2322H c2322h = (C2322H) this.f4908h;
                int i = eVar.f5108m;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = eVar.f5106k[i];
                    try {
                        if (obj instanceof P.H0) {
                            P.G0 g02 = ((P.H0) obj).f4319a;
                            set.remove(g02);
                            g02.e();
                        }
                        if (obj instanceof InterfaceC0298j) {
                            if (c2322h == null || !c2322h.c(obj)) {
                                ((InterfaceC0298j) obj).h();
                            } else {
                                ((InterfaceC0298j) obj).g();
                            }
                        }
                    } catch (Throwable th) {
                        C0446b c0446b = (C0446b) this.f4903b;
                        if (c0446b != null) {
                            AbstractC2036a.Y(th, new C0328y0(4, c0446b, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        R.e eVar2 = (R.e) this.f4904c;
        if (eVar2.f5108m != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f4902a;
                if (set2 != null) {
                    Object[] objArr = eVar2.f5106k;
                    int i5 = eVar2.f5108m;
                    for (int i6 = 0; i6 < i5; i6++) {
                        P.H0 h02 = (P.H0) objArr[i6];
                        P.G0 g03 = h02.f4319a;
                        set2.remove(g03);
                        try {
                            g03.a();
                        } catch (Throwable th2) {
                            C0446b c0446b2 = (C0446b) this.f4903b;
                            if (c0446b2 != null) {
                                AbstractC2036a.Y(th2, new C0328y0(4, c0446b2, h02));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void d(P.H0 h02) {
        if (((C2322H) this.f4905d).c(h02)) {
            ((C2322H) this.f4905d).k(h02);
            if (!((R.e) this.f4906e).k(h02)) {
                R.e eVar = (R.e) this.f4904c;
                if (!eVar.k(h02)) {
                    Object[] objArr = eVar.f5106k;
                    int i = eVar.f5108m;
                    for (int i5 = 0; i5 < i; i5++) {
                        P.G0 g02 = ((P.H0) objArr[i5]).f4319a;
                        if (g02 instanceof X.g) {
                            ((X.g) g02).getClass();
                            throw null;
                        }
                    }
                }
            }
            Set set = (Set) this.f4902a;
            if (set == null) {
                return;
            } else {
                set.add(h02.f4319a);
            }
        }
        C2322H c2322h = (C2322H) this.f4910k;
        if (c2322h == null || !c2322h.c(h02)) {
            ((R.e) this.f).c(h02);
        }
    }

    public void e(Set set, C0446b c0446b) {
        a();
        this.f4902a = set;
        this.f4903b = c0446b;
    }

    public void g(A3 a32) {
        a32.f7526r = this;
        synchronized (((HashSet) this.f4903b)) {
            ((HashSet) this.f4903b).add(a32);
        }
        a32.f7525q = Integer.valueOf(((AtomicInteger) this.f4902a).incrementAndGet());
        a32.d("add-to-queue");
        h();
        ((PriorityBlockingQueue) this.f4904c).add(a32);
    }

    public void h() {
        synchronized (((ArrayList) this.f4909j)) {
            try {
                Iterator it = ((ArrayList) this.f4909j).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        C1500r3 c1500r3 = (C1500r3) this.f4908h;
        if (c1500r3 != null) {
            c1500r3.f15262n = true;
            c1500r3.interrupt();
        }
        C1725w3[] c1725w3Arr = (C1725w3[]) this.f4907g;
        for (int i = 0; i < 4; i++) {
            C1725w3 c1725w3 = c1725w3Arr[i];
            if (c1725w3 != null) {
                c1725w3.f16093n = true;
                c1725w3.interrupt();
            }
        }
        C1500r3 c1500r32 = new C1500r3((PriorityBlockingQueue) this.f4904c, (PriorityBlockingQueue) this.f4905d, (K3) this.f4906e, (U4) this.f4910k);
        this.f4908h = c1500r32;
        c1500r32.start();
        for (int i5 = 0; i5 < 4; i5++) {
            C1725w3 c1725w32 = new C1725w3((PriorityBlockingQueue) this.f4905d, (C1390oj) this.f, (K3) this.f4906e, (U4) this.f4910k);
            ((C1725w3[]) this.f4907g)[i5] = c1725w32;
            c1725w32.start();
        }
    }

    public void j(A0 a02) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            K k5 = (K) this.i;
            J2.l lVar = (J2.l) this.f4910k;
            if (k5 == null) {
                if (((J2.i[]) this.f4907g) == null || ((String) this.f4909j) == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = lVar.getContext();
                a1 f = f(context, (J2.i[]) this.f4907g);
                K k6 = "search_v2".equals(f.f4974k) ? (K) new C0363i(C0379q.f.f5049b, context, f, (String) this.f4909j).d(context, false) : (K) new C0359g(C0379q.f.f5049b, context, f, (String) this.f4909j, (BinderC0610Ia) this.f4902a).d(context, false);
                this.i = k6;
                k6.O0(new U0((B0) this.f4905d));
                InterfaceC0347a interfaceC0347a = (InterfaceC0347a) this.f4906e;
                if (interfaceC0347a != null) {
                    ((K) this.i).H2(new BinderC0373n(interfaceC0347a));
                }
                K2.d dVar = (K2.d) this.f4908h;
                if (dVar != null) {
                    ((K) this.i).h3(new P5(dVar));
                }
                ((K) this.i).G1(new Q0());
                ((K) this.i).m3(false);
                K k7 = (K) this.i;
                if (k7 != null) {
                    try {
                        InterfaceC2360a m5 = k7.m();
                        if (m5 != null) {
                            if (((Boolean) AbstractC0968f8.f.s()).booleanValue()) {
                                if (((Boolean) r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                                    U2.e.f5861b.post(new D3.h(10, this, m5, false));
                                }
                            }
                            lVar.addView((View) BinderC2361b.t1(m5));
                        }
                    } catch (RemoteException e3) {
                        U2.j.k("#007 Could not call remote method.", e3);
                    }
                }
            }
            if (a02 != null) {
                a02.f4898j = currentTimeMillis;
            }
            K k8 = (K) this.i;
            if (k8 == null) {
                throw null;
            }
            Z0 z02 = (Z0) this.f4903b;
            Context context2 = lVar.getContext();
            z02.getClass();
            k8.v0(Z0.a(context2, a02));
        } catch (RemoteException e5) {
            U2.j.k("#007 Could not call remote method.", e5);
        }
    }

    public void k(InterfaceC0347a interfaceC0347a) {
        try {
            this.f4906e = interfaceC0347a;
            K k5 = (K) this.i;
            if (k5 != null) {
                k5.H2(interfaceC0347a != null ? new BinderC0373n(interfaceC0347a) : null);
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    public C0(J2.l lVar) {
        Z0 z02 = Z0.f4973k;
        this.f4902a = new BinderC0610Ia();
        this.f4904c = new v3.g(5);
        this.f4905d = new B0(this);
        this.f4910k = lVar;
        this.f4903b = z02;
        this.i = null;
        new AtomicBoolean(false);
    }

    public C0() {
        R.e eVar = new R.e(new P.H0[16]);
        this.f4904c = eVar;
        int i = r.P.f18958a;
        this.f4905d = new C2322H();
        this.f4906e = eVar;
        this.f = new R.e(new Object[16]);
        this.f4907g = new R.e(new InterfaceC2015a[16]);
    }
}
