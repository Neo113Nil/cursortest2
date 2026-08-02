package com.google.android.gms.internal.ads;

import P.C0322v0;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import q.C2294i;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class K4 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10119k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f10120l;

    public /* synthetic */ K4(int i, Object obj) {
        this.f10119k = i;
        this.f10120l = obj;
    }

    private final void a() {
        boolean z3;
        if (((M4) this.f10120l).f10585b != null) {
            return;
        }
        synchronized (M4.f10581c) {
            if (((M4) this.f10120l).f10585b != null) {
                return;
            }
            boolean z5 = false;
            try {
                z3 = ((Boolean) F7.f8919w2.s()).booleanValue();
            } catch (IllegalStateException unused) {
                z3 = false;
            }
            if (z3) {
                try {
                    M4.f10582d = Ct.a(((M4) this.f10120l).f10584a.f13438a, "ADSHIELD");
                } catch (Throwable unused2) {
                }
            }
            z5 = z3;
            ((M4) this.f10120l).f10585b = Boolean.valueOf(z5);
            M4.f10581c.open();
        }
    }

    private final void b() {
        synchronized (((R5) this.f10120l).f11329m) {
            R5 r5 = (R5) this.f10120l;
            if (r5.f11330n && r5.f11331o) {
                r5.f11330n = false;
                U2.j.d("App went background");
                ArrayList arrayList = ((R5) this.f10120l).f11332p;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        ((S5) obj).A(false);
                    } catch (Exception e3) {
                        U2.j.g("", e3);
                    }
                }
            } else {
                U2.j.d("App is still foreground");
            }
        }
    }

    private final void c() {
        G3 g32 = (G3) this.f10120l;
        synchronized (g32) {
            try {
                D3.l lVar = (D3.l) g32.f9167n;
                if (lVar.f961l) {
                    I5 i5 = (I5) lVar.f962m;
                    byte[] bArr = (byte[]) g32.f9166m;
                    G5 g5 = (G5) i5;
                    Parcel N5 = g5.N();
                    N5.writeByteArray(bArr);
                    g5.d1(N5, 5);
                    G5 g52 = (G5) ((I5) ((D3.l) g32.f9167n).f962m);
                    Parcel N6 = g52.N();
                    N6.writeInt(0);
                    g52.d1(N6, 6);
                    I5 i52 = (I5) ((D3.l) g32.f9167n).f962m;
                    int i = g32.f9165l;
                    G5 g53 = (G5) i52;
                    Parcel N7 = g53.N();
                    N7.writeInt(i);
                    g53.d1(N7, 7);
                    G5 g54 = (G5) ((I5) ((D3.l) g32.f9167n).f962m);
                    Parcel N8 = g54.N();
                    N8.writeIntArray(null);
                    g54.d1(N8, 4);
                    G5 g55 = (G5) ((I5) ((D3.l) g32.f9167n).f962m);
                    g55.d1(g55.N(), 3);
                }
            } catch (RemoteException e3) {
                U2.j.e("Clearcut log failed", e3);
            }
        }
    }

    private final void d() {
        LinkedHashMap linkedHashMap;
        G7 g7 = (G7) this.f10120l;
        while (true) {
            try {
                L7 l7 = (L7) ((ArrayBlockingQueue) g7.f9170a).take();
                J7 a5 = l7.a();
                if (!TextUtils.isEmpty(a5.f9864k)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) g7.f9171b;
                    synchronized (l7.f10325c) {
                        P2.o.f4767B.f4774g.c();
                        linkedHashMap = l7.f10324b;
                    }
                    g7.r(g7.p(linkedHashMap2, linkedHashMap), a5);
                }
            } catch (InterruptedException e3) {
                U2.j.j("CsiReporter:reporter interrupted", e3);
                return;
            }
        }
    }

    private final void e() {
        Q2.r rVar;
        long longValue;
        long intValue;
        boolean booleanValue;
        Q2.r rVar2;
        long j5;
        long j6;
        long j7;
        long j8;
        C0553Ae c0553Ae = (C0553Ae) this.f10120l;
        String t5 = C0553Ae.t(c0553Ae.f7603o);
        try {
            A7 a7 = F7.f8660B;
            rVar = Q2.r.f5053d;
            longValue = ((Long) rVar.f5056c.a(a7)).longValue() * 1000;
            intValue = ((Integer) rVar.f5056c.a(F7.f8894s)).intValue();
            booleanValue = ((Boolean) rVar.f5056c.a(F7.f8741P1)).booleanValue();
        } catch (Exception e3) {
            U2.j.i("Failed to preload url " + c0553Ae.f7603o + " Exception: " + e3.getMessage());
            P2.o.f4767B.f4774g.h("VideoStreamExoPlayerCache.preload", e3);
            c0553Ae.i();
            c0553Ae.l(c0553Ae.f7603o, t5, "error", C0553Ae.u("error", e3));
        }
        synchronized (c0553Ae) {
            try {
                P2.o.f4767B.f4776j.getClass();
                if (System.currentTimeMillis() - c0553Ae.f7607s > longValue) {
                    throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                }
                if (c0553Ae.f7604p) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!c0553Ae.f7605q) {
                    ME me = c0553Ae.f7602n.f9557q;
                    if (!(me != null)) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long u12 = me.u1();
                    if (u12 > 0) {
                        long r1 = c0553Ae.f7602n.f9557q.r1();
                        if (r1 != c0553Ae.f7608t) {
                            boolean z3 = r1 > 0;
                            String str = c0553Ae.f7603o;
                            if (booleanValue) {
                                C0614Ie c0614Ie = c0553Ae.f7602n;
                                j8 = (c0614Ie.f9549C == null || !c0614Ie.f9549C.f8534y) ? c0614Ie.f9561u : 0L;
                            } else {
                                j8 = -1;
                            }
                            j5 = intValue;
                            j6 = u12;
                            long s2 = booleanValue ? c0553Ae.f7602n.s() : -1L;
                            j7 = r1;
                            rVar2 = rVar;
                            U2.e.f5861b.post(new RunnableC1475qe(c0553Ae, str, t5, j7, j6, j8, s2, booleanValue ? c0553Ae.f7602n.o() : -1L, z3, C0614Ie.f9545E.get(), C0614Ie.f9546F.get()));
                            c0553Ae.f7608t = j7;
                        } else {
                            rVar2 = rVar;
                            j5 = intValue;
                            j6 = u12;
                            j7 = r1;
                        }
                        if (j7 >= j6) {
                            U2.e.f5861b.post(new RunnableC1654ue(c0553Ae, c0553Ae.f7603o, t5, j6));
                        } else if (c0553Ae.f7602n.f9561u >= j5 && j7 > 0) {
                        }
                    } else {
                        rVar2 = rVar;
                    }
                    T2.L.f5672l.postDelayed(new K4(14, c0553Ae), ((Long) rVar2.f5056c.a(F7.f8665C)).longValue());
                    return;
                }
                P2.o.f4767B.f4792z.f14808k.remove(c0553Ae.f7606r);
            } finally {
            }
        }
    }

    private final void f() {
        C1837yh c1837yh = (C1837yh) this.f10120l;
        synchronized (c1837yh) {
            try {
                if (c1837yh.f16457o.isDone()) {
                    return;
                }
                c1837yh.f16457o.f(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void g() {
        Sh sh = (Sh) this.f10120l;
        synchronized (sh) {
            U2.j.f("Timeout waiting for show call succeed to be called.");
            sh.n0(new C1121ij("Timeout for show call succeed."));
            sh.f11576o = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String a5;
        int i = 1;
        switch (this.f10119k) {
            case 0:
                synchronized (((L4) this.f10120l).f10320x) {
                    if (((L4) this.f10120l).f10321y) {
                        return;
                    }
                    ((L4) this.f10120l).f10321y = true;
                    try {
                        L4.j((L4) this.f10120l);
                    } catch (Exception e3) {
                        ((L4) this.f10120l).f10312p.g(2023, -1L, e3);
                    }
                    synchronized (((L4) this.f10120l).f10320x) {
                        ((L4) this.f10120l).f10321y = false;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((ViewOnAttachStateChangeListenerC1143j5) this.f10120l).c();
                return;
            case 3:
                C1772x5 c1772x5 = (C1772x5) this.f10120l;
                try {
                    C0965f5 c0965f5 = c1772x5.f16221a;
                    DexClassLoader dexClassLoader = c0965f5.f13440c;
                    byte[] bArr = c0965f5.f13442e;
                    String str = c1772x5.f16222b;
                    c0965f5.f13441d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(C1543s1.y(str, bArr), "UTF-8"));
                    if (loadClass != null) {
                        C0965f5 c0965f52 = c1772x5.f16221a;
                        byte[] bArr2 = c0965f52.f13442e;
                        String str2 = c1772x5.f16223c;
                        c0965f52.f13441d.getClass();
                        c1772x5.f16224d = loadClass.getMethod(new String(C1543s1.y(str2, bArr2), "UTF-8"), c1772x5.f16225e);
                    }
                } catch (V4 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
                } catch (Throwable th) {
                    c1772x5.f.countDown();
                    throw th;
                }
                c1772x5.f.countDown();
                return;
            case 4:
                ((M5) this.f10120l).c(3);
                return;
            case 5:
                b();
                return;
            case 6:
                C1324n6.s((C1324n6) this.f10120l);
                return;
            case 7:
                c();
                return;
            case 8:
                d();
                return;
            case 9:
                P7 p7 = (P7) this.f10120l;
                Context context = p7.f11067c;
                if (p7.f != null || context == null || (a5 = C2294i.a(context)) == null) {
                    return;
                }
                p7.f18853a = context.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(a5)) {
                    intent.setPackage(a5);
                }
                context.bindService(intent, p7, 33);
                return;
            case 10:
                ((S7) this.f10120l).d();
                return;
            case 11:
                P9 p9 = (P9) this.f10120l;
                if (((C1414p6) p9.f11072l) == null) {
                    return;
                }
                ((C1414p6) p9.f11072l).l();
                Binder.flushPendingCommands();
                return;
            case 12:
                ((AbstractC0690Td) this.f10120l).x();
                return;
            case 13:
                P2.o.f4767B.f4792z.f14808k.remove((C1340ne) this.f10120l);
                return;
            case 14:
                e();
                return;
            case 15:
                C0733Ze c0733Ze = ((C1028gf) this.f10120l).f13613k;
                C0322v0 c0322v0 = c0733Ze.f12501k.f12872c0;
                c0322v0.f4567c = true;
                if (c0322v0.f4566b) {
                    c0322v0.b();
                }
                S2.d V4 = c0733Ze.f12501k.V();
                if (V4 != null) {
                    V4.f5308v.removeView(V4.f5302p);
                    V4.z3(true);
                    return;
                }
                return;
            case 16:
                int i5 = C1028gf.f13597R;
                G7 c5 = P2.o.f4767B.f4774g.c();
                HashSet hashSet = (HashSet) c5.f9175g;
                String str3 = (String) this.f10120l;
                if (hashSet.contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) c5.f9174e);
                linkedHashMap.put("ue", str3);
                c5.r(c5.p((LinkedHashMap) c5.f9171b, linkedHashMap), null);
                return;
            case 17:
                Oi oi = P2.o.f4767B.f4789w;
                C1893zs c1893zs = ((C1169jn) this.f10120l).f14142a;
                oi.getClass();
                Oi.p(new RunnableC0991fn(c1893zs, i));
                return;
            case 18:
                ((C1432pg) this.f10120l).f15016l.f15150d.a();
                return;
            case 19:
                ((C1432pg) this.f10120l).f15016l.f15150d.b();
                return;
            case 20:
                C0587Eg c0587Eg = (C0587Eg) this.f10120l;
                C0835c9 c0835c9 = c0587Eg.f8574o.f10214d;
                if (c0835c9 == null) {
                    return;
                }
                try {
                    Q2.K k5 = (Q2.K) c0587Eg.f8576q.d();
                    BinderC2361b binderC2361b = new BinderC2361b(c0587Eg.f8569j);
                    Parcel N5 = c0835c9.N();
                    F5.e(N5, k5);
                    F5.e(N5, binderC2361b);
                    c0835c9.d1(N5, 1);
                    return;
                } catch (RemoteException e5) {
                    U2.j.g("RemoteException when notifyAdLoad is called", e5);
                    return;
                }
            case C1639u7.zzm /* 21 */:
                Runnable runnable = (Runnable) ((AtomicReference) this.f10120l).getAndSet(null);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 22:
                ((C1075hh) this.f10120l).f13779c = false;
                return;
            case 23:
                C1612th c1612th = (C1612th) this.f10120l;
                AbstractC1668us.V(c1612th.f15704m);
                c1612th.f15709r = true;
                return;
            case 24:
                f();
                return;
            case 25:
                g();
                return;
            case 26:
                ((Jj) this.f10120l).s();
                return;
            case 27:
                Oj oj = (Oj) this.f10120l;
                if (oj.f10964q == null) {
                    View view = new View(oj.f10961n.getContext());
                    oj.f10964q = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (oj.f10961n != oj.f10964q.getParent()) {
                    oj.f10961n.addView(oj.f10964q);
                    return;
                }
                return;
            case 28:
                ViewTreeObserverOnGlobalLayoutListenerC1840yk viewTreeObserverOnGlobalLayoutListenerC1840yk = (ViewTreeObserverOnGlobalLayoutListenerC1840yk) this.f10120l;
                try {
                    viewTreeObserverOnGlobalLayoutListenerC1840yk.getClass();
                    m3.v.c("#008 Must be called on the main UI thread.");
                    viewTreeObserverOnGlobalLayoutListenerC1840yk.w3();
                    Cj cj = viewTreeObserverOnGlobalLayoutListenerC1840yk.f16467m;
                    if (cj != null) {
                        cj.x();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC1840yk.f16467m = null;
                    viewTreeObserverOnGlobalLayoutListenerC1840yk.f16465k = null;
                    viewTreeObserverOnGlobalLayoutListenerC1840yk.f16466l = null;
                    viewTreeObserverOnGlobalLayoutListenerC1840yk.f16468n = true;
                    return;
                } catch (RemoteException e6) {
                    U2.j.k("#007 Could not call remote method.", e6);
                    return;
                }
            default:
                String str4 = P2.o.f4767B.f4774g.d().t().f7598e;
                boolean isEmpty = TextUtils.isEmpty(str4);
                C0634Ld c0634Ld = (C0634Ld) this.f10120l;
                if (isEmpty) {
                    c0634Ld.c(new Exception());
                    return;
                } else {
                    c0634Ld.b(str4);
                    return;
                }
        }
    }
}
