package O0;

import A.C0008h;
import A0.C0028g0;
import A0.C0058t;
import G1.C0145p;
import P.C0327y;
import P.EnumC0330z0;
import P.F0;
import P.InterfaceC0289e0;
import Q2.BinderC0382s;
import Q2.K;
import S3.C0416t;
import S3.C0417u;
import S3.C0418v;
import X3.AbstractC0441a;
import X3.C0442b;
import Z.r;
import Z.s;
import Z.v;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.C0844ca;
import com.google.android.gms.internal.ads.C1234l6;
import com.google.android.gms.internal.ads.F7;
import d.C1903c;
import d.C1905e;
import d4.C1917b;
import e.C1918a;
import game.betting133.sports1xbet.aqua_bootstrap.AquaLaunchBridgeActivity;
import i4.InterfaceC2015a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import o4.AbstractC2227e;
import p4.U;
import r.C2315A;
import r.C2322H;
import r3.AbstractC2349a;
import s4.M;
import w2.C2548f;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4015k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4016l;

    public /* synthetic */ e(int i, Object obj) {
        this.f4015k = i;
        this.f4016l = obj;
    }

    private final Object a(Object obj) {
        Z.f fVar = (Z.f) ((i4.c) this.f4016l).c((Z.j) obj);
        synchronized (Z.l.f6208c) {
            Z.l.f6209d = Z.l.f6209d.g(fVar.g());
        }
        return fVar;
    }

    private final Object d(Object obj) {
        s sVar = (s) this.f4016l;
        sVar.getClass();
        synchronized (sVar.f6235g) {
            r rVar = sVar.i;
            kotlin.jvm.internal.l.c(rVar);
            Object obj2 = rVar.f6221b;
            kotlin.jvm.internal.l.c(obj2);
            int i = rVar.f6223d;
            C2315A c2315a = rVar.f6222c;
            if (c2315a == null) {
                c2315a = new C2315A();
                rVar.f6222c = c2315a;
                rVar.f.m(obj2, c2315a);
            }
            rVar.c(obj, i, obj2, c2315a);
        }
        return W3.o.f6046a;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        Q3.d dVar;
        Q3.d dVar2;
        AquaLaunchBridgeActivity aquaLaunchBridgeActivity;
        int i = 0;
        switch (this.f4015k) {
            case 0:
                p pVar = (p) obj;
                return ((f) this.f4016l).a(new p(null, pVar.f4038b, pVar.f4039c, pVar.f4040d, pVar.f4041e)).f4042k;
            case 1:
                NativeAd nativeAd = (NativeAd) obj;
                kotlin.jvm.internal.l.f("freshCreative", nativeAd);
                ((InterfaceC0289e0) this.f4016l).setValue(nativeAd);
                return W3.o.f6046a;
            case 2:
                ((C0327y) this.f4016l).y(obj);
                return W3.o.f6046a;
            case 3:
                F0 f02 = (F0) this.f4016l;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (f02.f4291b) {
                    try {
                        U u5 = f02.f4292c;
                        if (u5 != null) {
                            M m5 = f02.f4307t;
                            EnumC0330z0 enumC0330z0 = EnumC0330z0.f4608l;
                            m5.getClass();
                            m5.j(null, enumC0330z0);
                            u5.d(cancellationException);
                            f02.f4304q = null;
                            u5.p(new O3.f(3, f02, th));
                        } else {
                            f02.f4293d = cancellationException;
                            M m6 = f02.f4307t;
                            EnumC0330z0 enumC0330z02 = EnumC0330z0.f4607k;
                            m6.getClass();
                            m6.j(null, enumC0330z02);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return W3.o.f6046a;
            case 4:
                if (obj instanceof v) {
                    ((v) obj).g(4);
                }
                ((C2322H) this.f4016l).a(obj);
                return W3.o.f6046a;
            case 5:
                ((Boolean) obj).getClass();
                int i5 = AquaLaunchBridgeActivity.J;
                String str = AbstractC2349a.f19098g;
                Q3.d.f5078l.getClass();
                kotlin.jvm.internal.l.f("rawFlag", str);
                C1917b c1917b = Q3.d.f5083q;
                c1917b.getClass();
                C0442b c0442b = new C0442b(0, c1917b);
                while (true) {
                    boolean hasNext = c0442b.hasNext();
                    dVar = Q3.d.f5081o;
                    if (hasNext) {
                        dVar2 = (Q3.d) c0442b.next();
                        if (kotlin.jvm.internal.l.a(dVar2.f5084k, str)) {
                        }
                    } else {
                        dVar2 = dVar;
                    }
                }
                Q3.d dVar3 = Q3.d.f5079m;
                AquaLaunchBridgeActivity aquaLaunchBridgeActivity2 = (AquaLaunchBridgeActivity) this.f4016l;
                if (dVar2 == dVar3) {
                    aquaLaunchBridgeActivity2.f17166G = true;
                    O3.e.c(aquaLaunchBridgeActivity2);
                }
                if (dVar2 == Q3.d.f5080n) {
                    aquaLaunchBridgeActivity = aquaLaunchBridgeActivity2;
                    C0058t c0058t = new C0058t(0, aquaLaunchBridgeActivity, AquaLaunchBridgeActivity.class, "enterGuideDmeanseckAndClose", "enterGuideDmeanseckAndClose()V", 0, 4);
                    String str2 = AbstractC2349a.f19098g;
                    boolean a5 = kotlin.jvm.internal.l.a(str2, "adMarkerQureka");
                    O3.a aVar = O3.a.f4047l;
                    O3.a aVar2 = a5 ? O3.a.f4046k : kotlin.jvm.internal.l.a(str2, "adMarkerAdx") ? aVar : O3.a.f4048m;
                    String obj2 = AbstractC2227e.Q0(AbstractC2349a.f19102l).toString();
                    if (aVar2 != aVar || obj2.length() == 0) {
                        c0058t.invoke();
                    } else {
                        K2.b bVar = new K2.b(new K2.a(0));
                        O3.b bVar2 = new O3.b(c0058t, aquaLaunchBridgeActivity);
                        m3.v.c("#008 Must be called on the main UI thread.");
                        F7.a(aquaLaunchBridgeActivity);
                        if (((Boolean) AbstractC0968f8.f13457d.s()).booleanValue()) {
                            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                                ExecutorService executorService = U2.c.f5860b;
                                K2.e eVar = new K2.e(aquaLaunchBridgeActivity, obj2, bVar, bVar2, 2);
                                aquaLaunchBridgeActivity = aquaLaunchBridgeActivity;
                                executorService.execute(eVar);
                            }
                        }
                        new C1234l6(aquaLaunchBridgeActivity, obj2, bVar.f2711a, bVar2).d();
                    }
                } else {
                    aquaLaunchBridgeActivity = aquaLaunchBridgeActivity2;
                }
                if (dVar2 == dVar) {
                    aquaLaunchBridgeActivity.j();
                }
                return W3.o.f6046a;
            case 6:
                C0008h c0008h = (C0008h) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", c0008h);
                C0416t c0416t = new C0416t(i);
                List list = (List) this.f4016l;
                c0008h.a(list.size(), new C0028g0(21, c0416t, list), new C0417u(i, list), new X.d(-632812321, new C0418v(i, list), true));
                return W3.o.f6046a;
            case 7:
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) obj;
                kotlin.jvm.internal.l.f("travelPlan", interfaceC2015a);
                Activity activity = (Activity) this.f4016l;
                String str3 = AbstractC2349a.f19098g;
                int ordinal = (kotlin.jvm.internal.l.a(str3, "adMarkerQureka") ? O3.a.f4046k : kotlin.jvm.internal.l.a(str3, "adMarkerAdx") ? O3.a.f4047l : O3.a.f4048m).ordinal();
                if (ordinal == 0) {
                    interfaceC2015a.invoke();
                    O3.e.c(activity);
                } else if (ordinal == 1) {
                    C0844ca c0844ca = O3.e.f4056a;
                    if (c0844ca == null) {
                        O3.e.a(activity);
                        interfaceC2015a.invoke();
                    } else {
                        O3.c cVar = new O3.c(activity, interfaceC2015a);
                        try {
                            K k5 = c0844ca.f12999c;
                            if (k5 != null) {
                                k5.X0(new BinderC0382s(cVar));
                            }
                        } catch (RemoteException e3) {
                            U2.j.k("#007 Could not call remote method.", e3);
                        }
                        c0844ca.b(activity);
                    }
                } else {
                    if (ordinal != 2) {
                        throw new D2.e();
                    }
                    interfaceC2015a.invoke();
                }
                return W3.o.f6046a;
            case 8:
                return obj == ((AbstractC0441a) this.f4016l) ? "(this Collection)" : String.valueOf(obj);
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("it", entry);
                X3.f fVar = (X3.f) this.f4016l;
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == fVar ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != fVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 10:
                Y.f fVar2 = ((Y.d) this.f4016l).f6109m;
                return Boolean.valueOf(fVar2 != null ? fVar2.c(obj) : true);
            case 11:
                return a(obj);
            case 12:
                return d(obj);
            case 13:
                C1905e c1905e = (C1905e) this.f4016l;
                ((C0145p) c1905e.f474a).d(true);
                ((C1918a) c1905e.f475b).f(true);
                return new C1903c((B1.g) obj, c1905e, i);
            default:
                ((C2548f) this.f4016l).f20518u = true;
                return W3.o.f6046a;
        }
    }
}
