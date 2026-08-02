package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.ro, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1529ro implements J3, InterfaceC1161jf, InterfaceC0648Nd, W2.c, Xu, Jw, Ei, InterfaceC1887zm, Ar, InterfaceC0735Zg, Cif, P2.d, Jo, InterfaceC1621tq {

    /* renamed from: m, reason: collision with root package name */
    public static C1529ro f15380m;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15381k;

    /* renamed from: l, reason: collision with root package name */
    public Object f15382l;

    public /* synthetic */ C1529ro(int i, Object obj) {
        this.f15381k = i;
        this.f15382l = obj;
    }

    @Override // com.google.android.gms.internal.ads.J3
    public File a() {
        return (File) this.f15382l;
    }

    @Override // P2.d
    public void d() {
        ((Kh) ((C0608Hf) this.f15382l).f9419E.d()).z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public /* bridge */ /* synthetic */ E3.a e(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq) {
        return g(c1390oj, interfaceC1576sq, null);
    }

    public E3.a g(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq, InterfaceC0588Eh interfaceC0588Eh) {
        C0570Cf g5 = interfaceC1576sq.g((InterfaceC1531rq) c1390oj.f14828m);
        C1666uq c1666uq = new C1666uq();
        switch (g5.f8039a) {
            case 0:
                g5.f8041c = c1666uq;
                break;
            default:
                g5.f8041c = c1666uq;
                break;
        }
        InterfaceC0588Eh interfaceC0588Eh2 = (InterfaceC0588Eh) g5.c();
        this.f15382l = interfaceC0588Eh2;
        C1253lh d5 = interfaceC0588Eh2.d();
        C1398or c1398or = new C1398or();
        Hw r5 = Hw.r(d5.b());
        C0565Ca c0565Ca = new C0565Ca(11, c1398or, d5);
        Ew ew = Ew.f8627k;
        return AbstractC1400ot.h0(AbstractC1400ot.j0(r5, c0565Ca, ew), new C1383oc(7, c1398or), ew);
    }

    @Override // com.google.android.gms.internal.ads.Jo
    public void h(AbstractC0762ah abstractC0762ah) {
        synchronized (((C0905dr) this.f15382l)) {
            ((C0905dr) this.f15382l).f13188n = abstractC0762ah.f;
            abstractC0762ah.a();
        }
    }

    @Override // P2.d
    public void i() {
        C0608Hf c0608Hf = (C0608Hf) this.f15382l;
        ((Uh) c0608Hf.f9415A.d()).i();
        ((Wi) c0608Hf.f9421G.d()).i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public /* synthetic */ Object j() {
        return (InterfaceC0588Eh) this.f15382l;
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        Xm.f((SQLiteDatabase) obj, (U2.m) this.f15382l);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List m(G3 g32) {
        String str;
        int i;
        List list;
        C1617tm c1617tm = new C1617tm((byte[]) g32.f9167n);
        ArrayList arrayList = (C1761wv) this.f15382l;
        while (c1617tm.o() > 0) {
            int v4 = c1617tm.v();
            int v5 = c1617tm.f15725b + c1617tm.v();
            if (v4 == 134) {
                arrayList = new ArrayList();
                int v6 = c1617tm.v() & 31;
                for (int i5 = 0; i5 < v6; i5++) {
                    String b3 = c1617tm.b(3, StandardCharsets.UTF_8);
                    int v7 = c1617tm.v();
                    boolean z3 = (v7 & 128) != 0;
                    if (z3) {
                        i = v7 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte v8 = (byte) c1617tm.v();
                    c1617tm.k(1);
                    if (z3) {
                        int i6 = v8 & 64;
                        byte[] bArr = AbstractC1120ii.f13966a;
                        list = Collections.singletonList(i6 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C1649uH c1649uH = new C1649uH();
                    c1649uH.c(str);
                    c1649uH.f15842d = b3;
                    c1649uH.f15836F = i;
                    c1649uH.f15851o = list;
                    arrayList.add(new C1407p(c1649uH));
                }
            }
            c1617tm.j(v5);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public void n(String str, int i, String str2, boolean z3) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f15382l;
        interfaceC0677Re.N0();
        interfaceC0677Re.I().T0();
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        C0634Ld c0634Ld;
        switch (this.f15381k) {
            case 13:
                String str = (String) obj;
                C1342ng c1342ng = (C1342ng) this.f15382l;
                Zq zq = c1342ng.f14672r;
                Lq lq = c1342ng.f14670p;
                zq.b(true == P2.o.f4767B.f4774g.a(c1342ng.f14665k) ? 2 : 1, c1342ng.f14671q.b(c1342ng.f14669o, lq, false, "", str, lq.f10493c));
                return;
            case 14:
                ((C1253lh) this.f15382l).f.k(true);
                return;
            case 19:
                Cj cj = (Cj) this.f15382l;
                cj.f8059k.p((InterfaceC0677Re) obj);
                Gj gj = cj.f8059k;
                synchronized (gj) {
                    c0634Ld = gj.f9237n;
                }
                C1169jn y5 = cj.y("Google", true);
                if (y5 != null && c0634Ld != null) {
                    c0634Ld.b(y5);
                    return;
                } else {
                    if (c0634Ld != null) {
                        c0634Ld.cancel(false);
                        return;
                    }
                    return;
                }
            case 20:
                ((InterfaceC0677Re) obj).a("sendMessageToNativeJs", (Map) this.f15382l);
                return;
            default:
                ((C1707vm) this.f15382l).f16039c.B0((Sq) obj);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1887zm
    public E3.a p(C1428pc c1428pc) {
        return ((Gm) ((AD) ((C0905dr) this.f15382l).f13188n).d()).u3(c1428pc, Binder.getCallingUid());
    }

    public void q(long j5) {
        C1324n6 c1324n6 = new C1324n6("creation");
        c1324n6.f14578k = Long.valueOf(j5);
        c1324n6.f14580m = "nativeObjectNotCreated";
        r(c1324n6);
    }

    public void r(C1324n6 c1324n6) {
        String b3 = C1324n6.b(c1324n6);
        U2.j.h("Dispatching AFMA event on publisher webview: ".concat(b3));
        I9 i9 = (I9) this.f15382l;
        Parcel N5 = i9.N();
        N5.writeString(b3);
        i9.d1(N5, 1);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        switch (this.f15381k) {
            case 13:
                break;
            case 14:
                ((C1253lh) this.f15382l).f.k(false);
                break;
            case 19:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.a5)).booleanValue()) {
                    P2.o.f4767B.f4774g.h("omid native display exp", th);
                    break;
                }
                break;
        }
    }

    @Override // W2.c
    public void w(J2.b bVar) {
        try {
            ((InterfaceC1202kb) this.f15382l).q(bVar.m());
        } catch (RemoteException e3) {
            U2.j.g("", e3);
        }
    }

    public /* synthetic */ C1529ro(Oi oi, InterfaceC0677Re interfaceC0677Re) {
        this.f15381k = 26;
        this.f15382l = interfaceC0677Re;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0735Zg
    /* renamed from: a */
    public InterfaceC0391w0 mo15a() {
        try {
            return ((InterfaceC1427pb) ((C1394on) this.f15382l).f14849b).b();
        } catch (RemoteException e3) {
            throw new Yq(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0648Nd, com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        switch (this.f15381k) {
            case 8:
                C1068ha c1068ha = (C1068ha) obj;
                T2.G.m("Getting a new session for JS Engine.");
                c1068ha.getClass();
                ((C0634Ld) ((C1471qa) this.f15382l).f474a).b(new C1605ta(c1068ha));
                break;
            case 15:
                ((Qh) obj).n0((C1121ij) this.f15382l);
                break;
            case 16:
                ((InterfaceC1434pi) obj).B0((Sq) this.f15382l);
                break;
            case 17:
                ((Bi) obj).L0((C0789b7) this.f15382l);
                break;
            default:
                ((L5) obj).z0((K5) this.f15382l);
                break;
        }
    }

    public C1529ro(int i) {
        this.f15381k = i;
        switch (i) {
            case 9:
                this.f15382l = new AtomicBoolean(false);
                break;
            case 29:
                break;
            default:
                this.f15382l = Collections.EMPTY_LIST;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Xu
    /* renamed from: a */
    public InterfaceC1402ov mo19a() {
        return new C0953eu((byte[]) this.f15382l);
    }

    public C1529ro(E8 e8) {
        this.f15381k = 11;
        this.f15382l = new ArrayList();
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
                I8 u32 = obj instanceof IBinder ? BinderC1865z8.u3((IBinder) obj) : null;
                if (u32 != null) {
                    ((ArrayList) this.f15382l).add(new C1390oj(u32));
                }
            }
        } catch (RemoteException e5) {
            U2.j.g("", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1161jf, com.google.android.gms.internal.ads.Jo, com.google.android.gms.internal.ads.InterfaceC1452q
    /* renamed from: a */
    public void mo10a() {
        switch (this.f15381k) {
            case 7:
                P2.o.f4767B.f4776j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                C1201ka c1201ka = (C1201ka) this.f15382l;
                long j5 = c1201ka.f14241c;
                Long valueOf = Long.valueOf(currentTimeMillis - j5);
                ArrayList arrayList = c1201ka.f14240b;
                arrayList.add(valueOf);
                T2.G.m("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                T2.L.f5672l.postDelayed(new RunnableC1246la(c1201ka.f14239a, c1201ka.f14242d, c1201ka.f14243e, arrayList, j5, 0), (long) ((Integer) Q2.r.f5053d.f5056c.a(F7.f8802b)).intValue());
                return;
            default:
                synchronized (((C0905dr) this.f15382l)) {
                }
                return;
        }
    }

    public C1529ro(U8 u8) {
        Context context;
        this.f15381k = 6;
        this.f15382l = u8;
        try {
            context = (Context) BinderC2361b.t1(u8.g());
        } catch (RemoteException | NullPointerException e3) {
            U2.j.g("", e3);
            context = null;
        }
        if (context != null) {
            try {
                ((U8) this.f15382l).T(new BinderC2361b(new M2.b(context)));
            } catch (RemoteException e5) {
                U2.j.g("", e5);
            }
        }
    }

    private final void b(Throwable th) {
    }

    private final void c(Throwable th) {
    }

    private final void f(Throwable th) {
    }

    @Override // P2.d
    public void l(View view) {
    }
}
