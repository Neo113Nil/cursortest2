package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import Q2.InterfaceC0391w0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.InterfaceC2093c;
import org.json.JSONObject;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class U4 implements InterfaceC2093c, InterfaceC0641Md, W2.c, Jw, Ei, Cif, A8, InterfaceC1728w6, InterfaceC1887zm, InterfaceC0735Zg, InterfaceC1165jj, Jo, InterfaceC1576sq {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11721k;

    /* renamed from: l, reason: collision with root package name */
    public Object f11722l;

    public /* synthetic */ U4(int i, Object obj) {
        this.f11721k = i;
        this.f11722l = obj;
    }

    private final void e() {
        synchronized (((Ho) this.f11722l)) {
            ((Ho) this.f11722l).f9486t = null;
        }
    }

    private final /* bridge */ /* synthetic */ void l(AbstractC0762ah abstractC0762ah) {
        C0898dj c0898dj = (C0898dj) abstractC0762ah;
        synchronized (((Ho) this.f11722l)) {
            ((Ho) this.f11722l).f9486t = c0898dj;
            c0898dj.a();
        }
    }

    public static U4 m(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        U4 u42 = new U4(0);
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new D2.g(1, u42));
                return u42;
            } catch (RuntimeException unused) {
                synchronized (U4.class) {
                    u42.f11722l = null;
                }
            }
        }
        return u42;
    }

    @Override // m3.InterfaceC2093c
    public void Y(j3.b bVar) {
        synchronized (((C1324n6) this.f11722l).f14580m) {
            C1324n6 c1324n6 = (C1324n6) this.f11722l;
            c1324n6.f14583p = null;
            if (((C1414p6) c1324n6.f14581n) != null) {
                c1324n6.f14581n = null;
            }
            c1324n6.f14580m.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.A8
    /* renamed from: a */
    public JSONObject mo17a() {
        return null;
    }

    public void b(J2.c cVar, long j5, Optional optional, Optional optional2) {
        C1390oj a5 = ((C1482ql) this.f11722l).a();
        a5.k("plaac_ts", Long.toString(j5));
        a5.k("ad_format", cVar.name());
        a5.k("action", "is_ad_available");
        optional.ifPresent(new C1354ns(0, a5));
        optional2.ifPresent(new C1354ns(1, a5));
        a5.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1728w6
    public void c(C1594t7 c1594t7) {
        switch (this.f11721k) {
            case 19:
                C1863z6 c1863z6 = (C1863z6) ((C1639u7) c1594t7.f10141l).F().l();
                C1280m7 c1280m7 = (C1280m7) ((C1639u7) c1594t7.f10141l).F().y().l();
                String str = ((Nq) ((Sq) this.f11722l).f11596b.f13762m).f10823b;
                c1280m7.e();
                C1325n7.w((C1325n7) c1280m7.f10141l, str);
                c1863z6.e();
                A6.x((A6) c1863z6.f10141l, (C1325n7) c1280m7.b());
                c1594t7.e();
                C1639u7.y((C1639u7) c1594t7.f10141l, (A6) c1863z6.b());
                break;
            default:
                C1415p7 c1415p7 = (C1415p7) ((C1639u7) c1594t7.f10141l).G().l();
                P6 p6 = (P6) this.f11722l;
                c1415p7.e();
                C1460q7.x((C1460q7) c1415p7.f10141l, p6);
                c1594t7.e();
                C1639u7.A((C1639u7) c1594t7.f10141l, (C1460q7) c1415p7.b());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.A8
    public JSONObject d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1576sq
    public C0570Cf g(InterfaceC1531rq interfaceC1531rq) {
        return ((Fq) this.f11722l).b(interfaceC1531rq);
    }

    @Override // com.google.android.gms.internal.ads.Jo
    public void h(AbstractC0762ah abstractC0762ah) {
        switch (this.f11721k) {
            case 24:
                l(abstractC0762ah);
                return;
            default:
                C0563Bg c0563Bg = (C0563Bg) abstractC0762ah;
                synchronized (((BinderC1084hq) this.f11722l)) {
                    try {
                        C0563Bg c0563Bg2 = ((BinderC1084hq) this.f11722l).f13809u;
                        if (c0563Bg2 != null) {
                            c0563Bg2.b();
                        }
                        BinderC1084hq binderC1084hq = (BinderC1084hq) this.f11722l;
                        binderC1084hq.f13809u = c0563Bg;
                        InterfaceC0677Re interfaceC0677Re = c0563Bg.f7855j;
                        if (interfaceC0677Re != null) {
                            interfaceC0677Re.D0(binderC1084hq);
                        }
                        BinderC1084hq binderC1084hq2 = (BinderC1084hq) this.f11722l;
                        binderC1084hq2.f13804p.b(new BinderC0571Cg(c0563Bg, binderC1084hq2, binderC1084hq2.f13804p, binderC1084hq2.f13806r));
                        c0563Bg.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.A8
    public void i() {
        Cj cj = ((Ck) this.f11722l).f8078n;
        if (cj != null) {
            cj.e("_videoMediaView");
        }
    }

    public void j(A3 a32, P.W w5, Kw kw) {
        synchronized (a32.f7523o) {
            a32.f7527s = true;
        }
        a32.d("post-response");
        ((ExecutorC1590t3) this.f11722l).f15631l.post(new RunnableC1362o(a32, w5, kw, 1));
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        switch (this.f11721k) {
            case 14:
                ((Qh) obj).q((C0387u0) this.f11722l);
                break;
            case 15:
                ((InterfaceC1209ki) obj).j((Q2.b1) this.f11722l);
                break;
            case 16:
                ((Bi) obj).o((C0789b7) this.f11722l);
                break;
            default:
                Cr cr = (Cr) this.f11722l;
                ((Hr) obj).y(cr.f8092l);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public void n(String str, int i, String str2, boolean z3) {
        ((C1548s6) this.f11722l).d();
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void mo14o(Object obj) {
        ((C1253lh) this.f11722l).f.o0(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1887zm
    public E3.a p(C1428pc c1428pc) {
        C1572sm c1572sm = (C1572sm) this.f11722l;
        synchronized (c1572sm.f15169l) {
            try {
                int i = c1572sm.f15599r;
                if (i != 1 && i != 2) {
                    return AbstractC1400ot.Z(new C1797xm(2));
                }
                if (c1572sm.f15170m) {
                    return c1572sm.f15168k;
                }
                c1572sm.f15599r = 2;
                c1572sm.f15170m = true;
                c1572sm.f15172o = c1428pc;
                c1572sm.f15173p.n();
                C0634Ld c0634Ld = c1572sm.f15168k;
                c0634Ld.f10334k.a(new RunnableC1527rm(c1572sm, 0), AbstractC0613Id.f9544g);
                return c1572sm.f15168k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(EnumMap enumMap, long j5) {
        C1390oj a5 = ((C1482ql) this.f11722l).a();
        a5.k("action", "start_preload");
        a5.k("sp_ts", Long.toString(j5));
        for (J2.c cVar : enumMap.keySet()) {
            String valueOf = String.valueOf(cVar.name().toLowerCase(Locale.ENGLISH));
            a5.k(valueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(cVar)).intValue()));
        }
        a5.q();
    }

    public void r(J2.c cVar, Optional optional, String str, long j5, Optional optional2) {
        C1390oj a5 = ((C1482ql) this.f11722l).a();
        a5.k(str, Long.toString(j5));
        a5.k("ad_format", cVar == null ? "unknown" : cVar.name());
        optional.ifPresent(new C1354ns(2, a5));
        optional2.ifPresent(new C1354ns(3, a5));
        a5.q();
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        ((C1253lh) this.f11722l).f.o0(false);
    }

    @Override // W2.c
    public void w(J2.b bVar) {
        switch (this.f11721k) {
            case 9:
                try {
                    ((InterfaceC1114ib) this.f11722l).q(bVar.m());
                    break;
                } catch (RemoteException e3) {
                    U2.j.g("", e3);
                    return;
                }
            default:
                try {
                    ((InterfaceC1337nb) this.f11722l).q(bVar.m());
                    break;
                } catch (RemoteException e5) {
                    U2.j.g("", e5);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
        Object obj = ((C1394on) this.f11722l).f14849b;
        try {
            ((C0950er) obj).b(z3);
            try {
                ((C0950er) obj).f13363a.G0(new BinderC2361b(context));
            } catch (Throwable th) {
                throw new Yq(th);
            }
        } catch (Yq e3) {
            throw new C1121ij(e3.getCause());
        }
    }

    public U4(Handler handler) {
        this.f11721k = 2;
        this.f11722l = new ExecutorC1590t3(handler, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0735Zg
    /* renamed from: a */
    public InterfaceC0391w0 mo15a() {
        try {
            return ((C0950er) this.f11722l).f13363a.g();
        } catch (Throwable th) {
            throw new Yq(th);
        }
    }

    public U4(int i) {
        this.f11721k = i;
        switch (i) {
            case 11:
                this.f11722l = new AtomicBoolean(false);
                break;
        }
    }

    public U4(Context context, Executor executor) {
        this.f11721k = 3;
        RunnableFutureC0823bx runnableFutureC0823bx = new RunnableFutureC0823bx(new S4(0, context));
        executor.execute(runnableFutureC0823bx);
        this.f11722l = runnableFutureC0823bx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0641Md
    /* renamed from: a, reason: collision with other method in class */
    public void mo16a() {
        switch (this.f11721k) {
            case 7:
                ((C1471qa) this.f11722l).f15123d.t();
                return;
            case 8:
                ((C0634Ld) this.f11722l).c(new C1650ua("Cannot get Javascript Engine"));
                return;
            case 24:
                e();
                return;
            default:
                synchronized (((BinderC1084hq) this.f11722l)) {
                    ((BinderC1084hq) this.f11722l).f13809u = null;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        ((java.util.ArrayList) r6.f11722l).add(new com.google.android.gms.internal.ads.J8(r5));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public U4(E8 e8) {
        IBinder iBinder;
        this.f11721k = 5;
        this.f11722l = new ArrayList();
        try {
            e8.f();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
        }
        try {
            ArrayList g5 = e8.g();
            int size = g5.size();
            int i = 0;
            while (i < size) {
                Object obj = g5.get(i);
                i++;
                I8 i8 = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    i8 = queryLocalInterface instanceof I8 ? (I8) queryLocalInterface : new H8(iBinder);
                }
            }
        } catch (RemoteException e5) {
            U2.j.g("", e5);
        }
    }

    public /* synthetic */ U4(C0554Af c0554Af, Context context, String str, Q2.a1 a1Var) {
        this.f11721k = 12;
        ED a5 = ED.a(context);
        ED a6 = ED.a(a1Var);
        ED a7 = ED.a(str);
        CD b3 = CD.b(new C1796xl(c0554Af.f7688x, 11));
        CD b5 = CD.b(new C1796xl(c0554Af.f7619F0, 18));
        this.f11722l = CD.b(new a3.r(a5, a6, a7, CD.b(new a3.y(a5, c0554Af.f7648c, c0554Af.f7610A, b3, b5, 19)), b3, b5, c0554Af.f7660j, c0554Af.f7613C, c0554Af.f7688x));
    }

    @Override // com.google.android.gms.internal.ads.A8
    public void f(MotionEvent motionEvent) {
    }
}
