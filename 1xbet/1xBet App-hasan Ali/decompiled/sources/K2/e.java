package K2;

import D3.l;
import G.v;
import J2.h;
import U2.j;
import a3.BinderC0468l;
import a3.K;
import a3.o;
import a3.z;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.C0675Rc;
import com.google.android.gms.internal.ads.C0717Xc;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.C0844ca;
import com.google.android.gms.internal.ads.C0905dr;
import com.google.android.gms.internal.ads.C0992fo;
import com.google.android.gms.internal.ads.C1020gF;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.C1234l6;
import com.google.android.gms.internal.ads.C1369o6;
import com.google.android.gms.internal.ads.C1392ol;
import com.google.android.gms.internal.ads.C1394on;
import com.google.android.gms.internal.ads.C1414p6;
import com.google.android.gms.internal.ads.C1459q6;
import com.google.android.gms.internal.ads.C1503r6;
import com.google.android.gms.internal.ads.C1548s6;
import com.google.android.gms.internal.ads.C1557sF;
import com.google.android.gms.internal.ads.C1638u6;
import com.google.android.gms.internal.ads.C1683v6;
import com.google.android.gms.internal.ads.C1743wd;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.Hq;
import com.google.android.gms.internal.ads.Lq;
import com.google.android.gms.internal.ads.RunnableC1081hn;
import com.google.android.gms.internal.ads.Sq;
import com.google.android.gms.internal.ads.Wl;
import com.google.android.gms.internal.ads.Zl;
import f2.C1948f;
import f2.m;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.UUID;
import k0.C2023c;
import m.C2066d;
import m.MenuC2070h;
import m.MenuItemC2071i;
import m.ViewOnKeyListenerC2067e;
import n1.J;
import n1.O;
import o2.g;
import o2.i;
import p2.C2257o;
import q2.C2307j;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2883k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2884l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2885m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2886n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2887o;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2883k = i;
        this.f2885m = obj;
        this.f2884l = obj2;
        this.f2886n = obj3;
        this.f2887o = obj4;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f2885m;
        Hq hq = (Hq) this.f2884l;
        Handler handler = (Handler) this.f2886n;
        C1020gF c1020gF = (C1020gF) this.f2887o;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (hq != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC1081hn(16, hq, c1020gF));
            }
            synchronized (C1557sF.f15429Z) {
                try {
                    int i = C1557sF.f15431b0 - 1;
                    C1557sF.f15431b0 = i;
                    if (i == 0) {
                        C1557sF.f15430a0.shutdown();
                        C1557sF.f15430a0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (hq != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC1081hn(16, hq, c1020gF));
            }
            synchronized (C1557sF.f15429Z) {
                try {
                    int i5 = C1557sF.f15431b0 - 1;
                    C1557sF.f15431b0 = i5;
                    if (i5 == 0) {
                        C1557sF.f15430a0.shutdown();
                        C1557sF.f15430a0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean contains;
        C1369o6 c1369o6;
        i h3;
        switch (this.f2883k) {
            case 0:
                Activity activity = (Activity) this.f2885m;
                try {
                    new C0844ca(activity, (String) this.f2884l).c(((b) this.f2886n).f2711a, (O3.d) this.f2887o);
                    return;
                } catch (IllegalStateException e3) {
                    C0802bc.a(activity).b("AdManagerInterstitialAd.load", e3);
                    return;
                }
            case 1:
                Context context = (Context) this.f2885m;
                try {
                    new C1234l6(context, (String) this.f2884l, ((h) this.f2886n).f2711a, (Wl) this.f2887o).d();
                    return;
                } catch (IllegalStateException e5) {
                    C0802bc.a(context).b("AppOpenAd.load", e5);
                    return;
                }
            case 2:
                Context context2 = (Context) this.f2885m;
                try {
                    new C1234l6(context2, (String) this.f2884l, ((b) this.f2886n).f2711a, (O3.b) this.f2887o).d();
                    return;
                } catch (IllegalStateException e6) {
                    C0802bc.a(context2).b("AppOpenAdManager.load", e6);
                    return;
                }
            case 3:
                Context context3 = (Context) this.f2885m;
                try {
                    new C0844ca(context3, (String) this.f2884l).c(((h) this.f2886n).f2711a, (L2.a) this.f2887o);
                    return;
                } catch (IllegalStateException e7) {
                    C0802bc.a(context3).b("InterstitialAd.load", e7);
                    return;
                }
            case 4:
                o oVar = (o) this.f2885m;
                String str = (String) this.f2884l;
                BinderC0468l binderC0468l = (BinderC0468l) this.f2886n;
                C1743wd c1743wd = (C1743wd) this.f2887o;
                z zVar = oVar.f6598b;
                zVar.h();
                synchronized (zVar.f6644d) {
                    contains = zVar.f6641a.contains(str);
                }
                if (contains || oVar.b()) {
                    return;
                }
                binderC0468l.s3(new BinderC2361b(oVar.f6597a), c1743wd, null);
                return;
            case 5:
                K k5 = (K) this.f2885m;
                C1392ol c1392ol = (C1392ol) this.f2884l;
                k5.g(c1392ol, (ArrayDeque) this.f2886n, "to");
                k5.g(c1392ol, (ArrayDeque) this.f2887o, "of");
                return;
            case 6:
                C0905dr c0905dr = (C0905dr) this.f2885m;
                C1414p6 c1414p6 = (C1414p6) this.f2884l;
                C1548s6 c1548s6 = (C1548s6) this.f2887o;
                try {
                    C1503r6 c1503r6 = (C1503r6) c1414p6.t();
                    boolean A3 = c1414p6.A();
                    C1459q6 c1459q6 = (C1459q6) this.f2886n;
                    if (A3) {
                        Parcel N5 = c1503r6.N();
                        F5.c(N5, c1459q6);
                        Parcel Y4 = c1503r6.Y(N5, 2);
                        c1369o6 = (C1369o6) F5.a(Y4, C1369o6.CREATOR);
                        Y4.recycle();
                    } else {
                        Parcel N6 = c1503r6.N();
                        F5.c(N6, c1459q6);
                        Parcel Y5 = c1503r6.Y(N6, 1);
                        c1369o6 = (C1369o6) F5.a(Y5, C1369o6.CREATOR);
                        Y5.recycle();
                    }
                    if (!c1369o6.e()) {
                        c1548s6.c(new RuntimeException("No entry contents."));
                        l.m((l) c0905dr.f13188n);
                        return;
                    }
                    C1638u6 c1638u6 = new C1638u6(c0905dr, c1369o6.b());
                    int read = c1638u6.read();
                    if (read == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    c1638u6.unread(read);
                    c1548s6.b(new C1683v6(c1638u6, c1369o6.c(), c1369o6.g(), c1369o6.a(), c1369o6.f()));
                    return;
                } catch (RemoteException e8) {
                    e = e8;
                    j.g("Unable to obtain a cache service instance.", e);
                    c1548s6.c(e);
                    l.m((l) c0905dr.f13188n);
                    return;
                } catch (IOException e9) {
                    e = e9;
                    j.g("Unable to obtain a cache service instance.", e);
                    c1548s6.c(e);
                    l.m((l) c0905dr.f13188n);
                    return;
                }
            case 7:
                Object obj = ((C1071hd) this.f2885m).f13764o;
                C0992fo.c((Sq) this.f2884l, (Lq) this.f2886n, (C1394on) this.f2887o);
                return;
            case 8:
                a();
                return;
            case 9:
                Context context4 = (Context) this.f2885m;
                try {
                    new C0675Rc(context4, (String) this.f2884l).b(((h) this.f2886n).f2711a, (Zl) this.f2887o);
                    return;
                } catch (IllegalStateException e10) {
                    C0802bc.a(context4).b("RewardedAd.load", e10);
                    return;
                }
            case 10:
                Context context5 = (Context) this.f2885m;
                try {
                    new C0717Xc(context5, (String) this.f2884l).b(((h) this.f2886n).f2711a, (Zl) this.f2887o);
                    return;
                } catch (IllegalStateException e11) {
                    C0802bc.a(context5).b("RewardedInterstitialAd.load", e11);
                    return;
                }
            case 11:
                C2066d c2066d = (C2066d) this.f2885m;
                if (c2066d != null) {
                    C2023c c2023c = (C2023c) this.f2887o;
                    ((ViewOnKeyListenerC2067e) c2023c.f17544l).J = true;
                    c2066d.f17873b.c(false);
                    ((ViewOnKeyListenerC2067e) c2023c.f17544l).J = false;
                }
                MenuItemC2071i menuItemC2071i = (MenuItemC2071i) this.f2884l;
                if (menuItemC2071i.isEnabled() && menuItemC2071i.hasSubMenu()) {
                    ((MenuC2070h) this.f2886n).p(menuItemC2071i, null, 4);
                    return;
                }
                return;
            case 12:
                J.i((View) this.f2885m, (O) this.f2884l, (v) this.f2886n);
                ((ValueAnimator) this.f2887o).start();
                return;
            default:
                C2307j c2307j = (C2307j) this.f2886n;
                UUID uuid = (UUID) this.f2885m;
                String uuid2 = uuid.toString();
                m d5 = m.d();
                String str2 = C2257o.f18727c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                C1948f c1948f = (C1948f) this.f2884l;
                sb.append(c1948f);
                sb.append(")");
                d5.a(str2, sb.toString(), new Throwable[0]);
                C2257o c2257o = (C2257o) this.f2887o;
                WorkDatabase workDatabase = c2257o.f18728a;
                WorkDatabase workDatabase2 = c2257o.f18728a;
                workDatabase.c();
                try {
                    h3 = workDatabase2.n().h(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (h3 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (h3.f18634b == 2) {
                    g gVar = new g(uuid2, c1948f);
                    C1071hd m5 = workDatabase2.m();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) m5.f13761l;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((o2.b) m5.f13762m).e(gVar);
                        workDatabase_Impl.h();
                        workDatabase_Impl.f();
                    } catch (Throwable th) {
                        workDatabase_Impl.f();
                        throw th;
                    }
                } else {
                    m.d().h(str2, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.", new Throwable[0]);
                }
                c2307j.j(null);
                workDatabase2.h();
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z3) {
        this.f2883k = i;
        this.f2887o = obj;
        this.f2885m = obj2;
        this.f2884l = obj3;
        this.f2886n = obj4;
    }
}
