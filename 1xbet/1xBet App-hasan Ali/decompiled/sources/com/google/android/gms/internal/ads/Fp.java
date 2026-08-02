package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final /* synthetic */ class Fp implements InterfaceC1852yw, InterfaceC1556sE {

    /* renamed from: k, reason: collision with root package name */
    public boolean f9121k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9122l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f9123m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f9124n;

    /* renamed from: o, reason: collision with root package name */
    public Object f9125o;

    /* renamed from: p, reason: collision with root package name */
    public Object f9126p;

    public /* synthetic */ Fp(Gp gp, String str, List list, Bundle bundle, boolean z3, boolean z5) {
        this.f9123m = gp;
        this.f9124n = str;
        this.f9125o = list;
        this.f9126p = bundle;
        this.f9121k = z3;
        this.f9122l = z5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public long a() {
        if (this.f9121k) {
            return ((NE) this.f9123m).a();
        }
        InterfaceC1556sE interfaceC1556sE = (InterfaceC1556sE) this.f9126p;
        interfaceC1556sE.getClass();
        return interfaceC1556sE.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public void b(Y7 y7) {
        InterfaceC1556sE interfaceC1556sE = (InterfaceC1556sE) this.f9126p;
        if (interfaceC1556sE != null) {
            interfaceC1556sE.b(y7);
            y7 = ((InterfaceC1556sE) this.f9126p).i();
        }
        ((NE) this.f9123m).b(y7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public boolean h() {
        if (this.f9121k) {
            return false;
        }
        InterfaceC1556sE interfaceC1556sE = (InterfaceC1556sE) this.f9126p;
        interfaceC1556sE.getClass();
        return interfaceC1556sE.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public Y7 i() {
        InterfaceC1556sE interfaceC1556sE = (InterfaceC1556sE) this.f9126p;
        return interfaceC1556sE != null ? interfaceC1556sE.i() : ((NE) this.f9123m).f10787n;
    }

    public Fp(C1332nE c1332nE) {
        this.f9124n = c1332nE;
        NE ne = new NE();
        ne.f10787n = Y7.f12279d;
        this.f9123m = ne;
        this.f9121k = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(7:5|6|7|8|(1:10)(1:47)|11|(2:13|(4:15|86|25|26)(1:34))(3:35|(1:37)|(2:39|(2:41|42)(2:43|44))(2:45|46))))|51|52|11|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0068, code lost:
    
        T2.G.n("Couldn't create RTB adapter : ", r0);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1852yw, com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E3.a mo12a() {
        InterfaceC1427pb interfaceC1427pb;
        InterfaceC1427pb a5;
        final Gp gp = (Gp) this.f9123m;
        String str = (String) this.f9124n;
        final List list = (List) this.f9125o;
        final Bundle bundle = (Bundle) this.f9126p;
        boolean z3 = this.f9121k;
        boolean z5 = this.f9122l;
        gp.getClass();
        final C0634Ld c0634Ld = new C0634Ld();
        if (z5) {
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8673D1)).booleanValue()) {
                C1664uo c1664uo = gp.f;
                c1664uo.getClass();
                try {
                    c1664uo.f15908a.put(str, c1664uo.f15909b.a(str));
                } catch (RemoteException e3) {
                    T2.G.n("Couldn't create RTB adapter : ", e3);
                }
                ConcurrentHashMap concurrentHashMap = gp.f.f15908a;
                a5 = concurrentHashMap.containsKey(str) ? (InterfaceC1427pb) concurrentHashMap.get(str) : null;
                interfaceC1427pb = a5;
                if (interfaceC1427pb != null) {
                    A7 a7 = F7.f8901t1;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        int i = BinderC1844yo.f16476o;
                        synchronized (BinderC1844yo.class) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("name", str);
                                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                                    if (((Boolean) rVar.f5056c.a(F7.f8936z1)).booleanValue()) {
                                        jSONObject.put("signal_error_code", 1);
                                    }
                                    c0634Ld.b(jSONObject);
                                } catch (JSONException unused) {
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return c0634Ld;
                    }
                    throw null;
                }
                P2.o.f4767B.f4776j.getClass();
                final BinderC1844yo binderC1844yo = new BinderC1844yo(str, interfaceC1427pb, c0634Ld, SystemClock.elapsedRealtime());
                A7 a72 = F7.f8930y1;
                Q2.r rVar2 = Q2.r.f5053d;
                if (((Boolean) rVar2.f5056c.a(a72)).booleanValue()) {
                    gp.f9268b.schedule(new RunnableC1303mm(4, binderC1844yo), ((Long) rVar2.f5056c.a(F7.r1)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (z3) {
                    if (((Boolean) rVar2.f5056c.a(F7.f8684F1)).booleanValue()) {
                        final InterfaceC1427pb interfaceC1427pb2 = interfaceC1427pb;
                        gp.f9267a.b(new Runnable() { // from class: com.google.android.gms.internal.ads.Ep
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC1427pb interfaceC1427pb3 = interfaceC1427pb2;
                                Bundle bundle2 = bundle;
                                List list2 = list;
                                BinderC1844yo binderC1844yo2 = binderC1844yo;
                                Gp gp2 = Gp.this;
                                gp2.getClass();
                                try {
                                    interfaceC1427pb3.B1(new BinderC2361b(gp2.f9270d), gp2.f9274j, bundle2, (Bundle) list2.get(0), gp2.f9271e.f12099e, binderC1844yo2);
                                } catch (RemoteException e5) {
                                    c0634Ld.c(e5);
                                }
                            }
                        });
                        return c0634Ld;
                    }
                    interfaceC1427pb.B1(new BinderC2361b(gp.f9270d), gp.f9274j, bundle, (Bundle) list.get(0), gp.f9271e.f12099e, binderC1844yo);
                    return c0634Ld;
                }
                binderC1844yo.j();
                return c0634Ld;
            }
        }
        a5 = gp.f9272g.a(str);
        interfaceC1427pb = a5;
        if (interfaceC1427pb != null) {
        }
    }
}
