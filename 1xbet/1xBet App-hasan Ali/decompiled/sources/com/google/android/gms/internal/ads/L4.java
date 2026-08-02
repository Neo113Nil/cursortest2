package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class L4 implements N4 {

    /* renamed from: B, reason: collision with root package name */
    public static L4 f10305B;

    /* renamed from: A, reason: collision with root package name */
    public final int f10306A;

    /* renamed from: k, reason: collision with root package name */
    public final Context f10307k;

    /* renamed from: l, reason: collision with root package name */
    public final C0901dm f10308l;

    /* renamed from: m, reason: collision with root package name */
    public final C1894zt f10309m;

    /* renamed from: n, reason: collision with root package name */
    public final Bt f10310n;

    /* renamed from: o, reason: collision with root package name */
    public final C0742a5 f10311o;

    /* renamed from: p, reason: collision with root package name */
    public final P.W f10312p;

    /* renamed from: q, reason: collision with root package name */
    public final ExecutorService f10313q;

    /* renamed from: r, reason: collision with root package name */
    public final C1543s1 f10314r;

    /* renamed from: t, reason: collision with root package name */
    public final C1233l5 f10316t;

    /* renamed from: u, reason: collision with root package name */
    public final C1721w f10317u;

    /* renamed from: v, reason: collision with root package name */
    public final C1529ro f10318v;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f10321y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f10322z;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f10319w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Object f10320x = new Object();

    /* renamed from: s, reason: collision with root package name */
    public final CountDownLatch f10315s = new CountDownLatch(1);

    public L4(Context context, P.W w5, C0901dm c0901dm, C1894zt c1894zt, Bt bt, C0742a5 c0742a5, ExecutorService executorService, C1543s1 c1543s1, int i, C1233l5 c1233l5, C1721w c1721w, C1529ro c1529ro) {
        this.f10322z = false;
        this.f10307k = context;
        this.f10312p = w5;
        this.f10308l = c0901dm;
        this.f10309m = c1894zt;
        this.f10310n = bt;
        this.f10311o = c0742a5;
        this.f10313q = executorService;
        this.f10306A = i;
        this.f10316t = c1233l5;
        this.f10317u = c1721w;
        this.f10318v = c1529ro;
        this.f10322z = false;
        this.f10314r = new C1543s1(c1543s1);
    }

    public static void j(L4 l42) {
        String str;
        String str2;
        int length;
        boolean d5;
        long currentTimeMillis = System.currentTimeMillis();
        C0375o n5 = l42.n();
        if (n5 != null) {
            str = ((B5) n5.f5042l).E();
            str2 = ((B5) n5.f5042l).D();
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                C1849yt g5 = AbstractC0952et.g(l42.f10307k, l42.f10306A, str, str2, l42.f10312p);
                byte[] bArr = g5.f16498l;
                if (bArr == null || (length = bArr.length) == 0) {
                    l42.f10312p.h(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        C1733wB r5 = AbstractC1823yB.r(bArr, 0, length);
                        GB gb = GB.f9177a;
                        C1285mC c1285mC = C1285mC.f14484c;
                        C1862z5 w5 = C1862z5.w(r5, GB.f9178b);
                        if (!w5.x().E().isEmpty() && !w5.x().D().isEmpty() && w5.y().c().length != 0) {
                            C0375o n6 = l42.n();
                            if (n6 != null) {
                                B5 b5 = (B5) n6.f5042l;
                                if (w5.x().E().equals(b5.E())) {
                                    if (!w5.x().D().equals(b5.D())) {
                                    }
                                }
                            }
                            C1543s1 c1543s1 = l42.f10314r;
                            int i = g5.f16499m;
                            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8856l2)).booleanValue()) {
                                d5 = l42.f10308l.d(w5, c1543s1);
                            } else if (i == 3) {
                                d5 = l42.f10309m.b(w5);
                            } else {
                                if (i == 4) {
                                    d5 = l42.f10309m.c(w5, c1543s1);
                                }
                                l42.f10312p.h(4009, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (d5) {
                                C0375o n7 = l42.n();
                                if (n7 != null) {
                                    if (l42.f10310n.c(n7)) {
                                        l42.f10322z = true;
                                    }
                                    l42.f10319w = System.currentTimeMillis() / 1000;
                                }
                            }
                            l42.f10312p.h(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        l42.f10312p.h(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        l42.f10312p.h(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (Throwable th) {
                l42.f10315s.countDown();
                throw th;
            }
        } catch (XB e3) {
            l42.f10312p.g(4002, System.currentTimeMillis() - currentTimeMillis, e3);
        }
        l42.f10315s.countDown();
    }

    public static synchronized L4 m(Context context, ExecutorService executorService, C0863ct c0863ct, boolean z3) {
        L4 l42;
        synchronized (L4.class) {
            try {
                if (f10305B == null) {
                    P.W f = P.W.f(context, executorService, z3);
                    A7 a7 = F7.f8869n3;
                    Q2.r rVar = Q2.r.f5053d;
                    U4 m5 = ((Boolean) rVar.f5056c.a(a7)).booleanValue() ? U4.m(context) : null;
                    C1233l5 a5 = ((Boolean) rVar.f5056c.a(F7.f8875o3)).booleanValue() ? C1233l5.a(context, executorService) : null;
                    C1721w c1721w = ((Boolean) rVar.f5056c.a(F7.f8674D2)).booleanValue() ? new C1721w() : null;
                    C1529ro c1529ro = ((Boolean) rVar.f5056c.a(F7.f8712K2)).booleanValue() ? new C1529ro(5) : null;
                    C0375o P5 = C0375o.P(context, executorService, f, c0863ct);
                    Z4 z42 = new Z4(context);
                    C0742a5 c0742a5 = new C0742a5(c0863ct, P5, new ViewOnAttachStateChangeListenerC1143j5(context, z42), z42, m5, a5, c1721w, c1529ro);
                    int u5 = AbstractC1400ot.u(context, f);
                    C1543s1 c1543s1 = new C1543s1(3);
                    L4 l43 = new L4(context, f, new C0901dm(context, u5), new C1894zt(context, u5, new Qt(4, f), ((Boolean) rVar.f5056c.a(F7.f8868n2)).booleanValue()), new Bt(context, c0742a5, f, c1543s1), c0742a5, executorService, c1543s1, u5, a5, c1721w, c1529ro);
                    f10305B = l43;
                    l43.k();
                    f10305B.l();
                }
                l42 = f10305B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l42;
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void a(MotionEvent motionEvent) {
        C1071hd a5 = this.f10310n.a();
        if (a5 != null) {
            try {
                a5.z(motionEvent);
            } catch (At e3) {
                this.f10312p.g(e3.f7737k, -1L, e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void b(View view) {
        this.f10311o.f12634c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String c(Context context) {
        String F5;
        C1233l5 c1233l5 = this.f10316t;
        if (c1233l5 != null && c1233l5.f14321d) {
            c1233l5.f14319b = System.currentTimeMillis();
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8674D2)).booleanValue()) {
            C1721w c1721w = this.f10317u;
            c1721w.f16074b = c1721w.f16073a;
            c1721w.f16073a = SystemClock.uptimeMillis();
        }
        l();
        C1071hd a5 = this.f10310n.a();
        if (a5 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (a5) {
            HashMap a6 = ((C0742a5) a5.f13763n).a();
            a6.put("f", "q");
            a6.put("ctx", context);
            a6.put("aid", null);
            F5 = C1071hd.F(a5.G(a6));
        }
        this.f10312p.j(5001, System.currentTimeMillis() - currentTimeMillis, null, F5, null);
        return F5;
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void d(StackTraceElement[] stackTraceElementArr) {
        C1529ro c1529ro = this.f10318v;
        if (c1529ro != null) {
            c1529ro.f15382l = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String e(Context context, View view, Activity activity) {
        String F5;
        C1233l5 c1233l5 = this.f10316t;
        if (c1233l5 != null && c1233l5.f14321d) {
            c1233l5.f14319b = System.currentTimeMillis();
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8674D2)).booleanValue()) {
            this.f10317u.b(context, view);
        }
        l();
        C1071hd a5 = this.f10310n.a();
        if (a5 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (a5) {
            C0742a5 c0742a5 = (C0742a5) a5.f13763n;
            HashMap b3 = c0742a5.b();
            C1529ro c1529ro = c0742a5.f12638h;
            if (c1529ro != null) {
                List list = (List) c1529ro.f15382l;
                c1529ro.f15382l = Collections.EMPTY_LIST;
                b3.put("vst", list);
            }
            b3.put("f", "v");
            b3.put("ctx", context);
            b3.put("aid", null);
            b3.put("view", view);
            b3.put("act", activity);
            F5 = C1071hd.F(a5.G(b3));
        }
        this.f10312p.j(5002, System.currentTimeMillis() - currentTimeMillis, null, F5, null);
        return F5;
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String f(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String h(Context context, String str, View view, Activity activity) {
        String F5;
        C1233l5 c1233l5 = this.f10316t;
        if (c1233l5 != null && c1233l5.f14321d) {
            c1233l5.f14319b = System.currentTimeMillis();
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8674D2)).booleanValue()) {
            C1721w c1721w = this.f10317u;
            c1721w.f16079h = c1721w.f16078g;
            c1721w.f16078g = SystemClock.uptimeMillis();
        }
        l();
        C1071hd a5 = this.f10310n.a();
        if (a5 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (a5) {
            C0742a5 c0742a5 = (C0742a5) a5.f13763n;
            HashMap b3 = c0742a5.b();
            ViewOnAttachStateChangeListenerC1143j5 viewOnAttachStateChangeListenerC1143j5 = c0742a5.f12634c;
            if (viewOnAttachStateChangeListenerC1143j5.f14073v <= -2) {
                WeakReference weakReference = viewOnAttachStateChangeListenerC1143j5.f14069r;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    viewOnAttachStateChangeListenerC1143j5.f14073v = -3L;
                }
            }
            b3.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC1143j5.f14073v));
            b3.put("f", "c");
            b3.put("ctx", context);
            b3.put("cs", str);
            b3.put("aid", null);
            b3.put("view", view);
            b3.put("act", activity);
            F5 = C1071hd.F(a5.G(b3));
        }
        this.f10312p.j(5000, System.currentTimeMillis() - currentTimeMillis, null, F5, null);
        return F5;
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void i(int i, int i5, int i6) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Ab)).booleanValue() || (displayMetrics = this.f10307k.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f5 = displayMetrics.density;
        float f6 = i5;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * f5, f6 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        a(obtain);
        obtain.recycle();
        float f7 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * f7, f6 * f7, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        a(obtain2);
        obtain2.recycle();
        float f8 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i6, 1, f * f8, f6 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        a(obtain3);
        obtain3.recycle();
    }

    public final synchronized void k() {
        long currentTimeMillis = System.currentTimeMillis();
        C0375o n5 = n();
        if (n5 == null) {
            this.f10312p.h(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f10310n.c(n5)) {
            this.f10322z = true;
            this.f10315s.countDown();
        }
    }

    public final void l() {
        if (this.f10321y) {
            return;
        }
        synchronized (this.f10320x) {
            try {
                if (!this.f10321y) {
                    if ((System.currentTimeMillis() / 1000) - this.f10319w < 3600) {
                        return;
                    }
                    C0375o b3 = this.f10310n.b();
                    if (b3 == null || ((B5) b3.f5042l).x() - (System.currentTimeMillis() / 1000) < 3600) {
                        int i = this.f10306A - 1;
                        if (i == 2 || i == 4 || i == 5 || i == 6 || i == 7) {
                            this.f10313q.execute(new K4(0, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final C0375o n() {
        int i = this.f10306A - 1;
        if (i == 2 || i == 4 || i == 5 || i == 6 || i == 7) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8856l2)).booleanValue()) {
                C1894zt c1894zt = this.f10309m;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (C1894zt.f16781p) {
                    try {
                        B5 g5 = c1894zt.g(1);
                        if (g5 == null) {
                            c1894zt.f(4022, currentTimeMillis);
                            return null;
                        }
                        File d5 = c1894zt.d(g5.E());
                        File file = new File(d5, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(d5, "pcam");
                        }
                        File file2 = new File(d5, "pcbc");
                        File file3 = new File(d5, "pcopt");
                        c1894zt.f(5016, currentTimeMillis);
                        return new C0375o(g5, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C0901dm c0901dm = this.f10308l;
            B5 e3 = c0901dm.e(1);
            if (e3 != null) {
                String E5 = e3.E();
                File D5 = AbstractC0952et.D(E5, "pcam.jar", c0901dm.i());
                if (!D5.exists()) {
                    D5 = AbstractC0952et.D(E5, "pcam", c0901dm.i());
                }
                return new C0375o(e3, D5, AbstractC0952et.D(E5, "pcbc", c0901dm.i()), AbstractC0952et.D(E5, "pcopt", c0901dm.i()));
            }
        }
        return null;
    }
}
