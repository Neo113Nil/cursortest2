package S2;

import A0.J0;
import a3.C0457a;
import a3.CallableC0463g;
import a3.F;
import a3.H;
import a3.x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import c3.AbstractC0539a;
import com.google.android.gms.internal.ads.C0709Wb;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.InterfaceC0677Re;
import g2.C1978b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import n2.C2185a;
import p2.AbstractC2249g;
import q2.C2307j;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5346k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5347l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5348m;

    /* renamed from: n, reason: collision with root package name */
    public Object f5349n;

    public /* synthetic */ q(int i) {
        this.f5346k = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z3 = true;
        boolean z5 = false;
        z5 = false;
        switch (this.f5346k) {
            case 0:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) ((r) this.f5347l).f5353n;
                if (interfaceC0677Re != null) {
                    interfaceC0677Re.a((String) this.f5348m, (HashMap) this.f5349n);
                    return;
                }
                return;
            case 1:
                C0457a c0457a = (C0457a) this.f5347l;
                P2.o.f4767B.f4773e.getClass();
                CookieManager f = Q1.j.f();
                boolean acceptThirdPartyCookies = f != null ? f.acceptThirdPartyCookies(c0457a.f6518b) : false;
                Bundle bundle = (Bundle) this.f5348m;
                bundle.putBoolean("accept_3p_cookie", acceptThirdPartyCookies);
                J0.p(c0457a.f6517a, new J2.h((J2.g) new J2.g(0).a(bundle)), (x) this.f5349n);
                return;
            case 2:
                F f5 = (F) this.f5347l;
                f5.getClass();
                Object obj2 = this.f5348m;
                if (obj2 instanceof WebView) {
                    P2.o.f4767B.f4773e.getClass();
                    CookieManager f6 = Q1.j.f();
                    if (f6 != null) {
                        z5 = f6.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap hashMap = f5.f6482a;
                Boolean valueOf = Boolean.valueOf(z5);
                H h3 = (H) hashMap.get(valueOf);
                Pair pair = (Pair) this.f5349n;
                if (h3 != null) {
                    P2.o.f4767B.f4776j.getClass();
                    if (h3.f6494c > System.currentTimeMillis()) {
                        f5.d(h3, pair, true);
                        return;
                    }
                }
                HashMap hashMap2 = f5.f6483b;
                List list = (List) hashMap2.get(valueOf);
                if (list == null) {
                    list = new ArrayList();
                    hashMap2.put(valueOf, list);
                }
                list.add(pair);
                return;
            case 3:
                C1616tl c1616tl = (C1616tl) this.f5347l;
                c1616tl.getClass();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c1616tl.f15714a);
                String str = (String) this.f5348m;
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str)) {
                    concurrentHashMap.put("action", str);
                }
                int i = 0;
                while (true) {
                    Pair[] pairArr = (Pair[]) this.f5349n;
                    if (i >= pairArr.length) {
                        c1616tl.b(concurrentHashMap, false);
                        return;
                    }
                    Pair pair2 = pairArr[i];
                    String str2 = (String) pair2.first;
                    String str3 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        concurrentHashMap.put(str2, str3);
                    }
                    i++;
                }
                break;
            case 4:
                new C0709Wb(z5 ? 1 : 0, (Context) this.f5347l, ((J2.h) this.f5348m).f2711a).q((AbstractC0539a) this.f5349n);
                return;
            case 5:
                try {
                    z3 = ((Boolean) ((C2307j) this.f5349n).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((C1978b) this.f5347l).a((String) this.f5348m, z3);
                return;
            case 6:
                C2307j c2307j = (C2307j) this.f5348m;
                g2.m mVar = (g2.m) this.f5349n;
                try {
                    ((C2307j) this.f5347l).get();
                    f2.m.d().a(g2.m.f17137D, "Starting work for " + mVar.f17145o.f18635c, new Throwable[0]);
                    E3.a startWork = mVar.f17146p.startWork();
                    mVar.f17139B = startWork;
                    c2307j.l(startWork);
                    return;
                } catch (Throwable th) {
                    c2307j.k(th);
                    return;
                }
            case 7:
                String str4 = (String) this.f5348m;
                g2.m mVar2 = (g2.m) this.f5349n;
                try {
                    try {
                        f2.l lVar = (f2.l) ((C2307j) this.f5347l).get();
                        if (lVar == null) {
                            f2.m.d().b(g2.m.f17137D, mVar2.f17145o.f18635c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            f2.m.d().a(g2.m.f17137D, String.format("%s returned a %s result.", mVar2.f17145o.f18635c, lVar), new Throwable[0]);
                            mVar2.f17148r = lVar;
                        }
                    } catch (Throwable th2) {
                        mVar2.b();
                        throw th2;
                    }
                } catch (InterruptedException e3) {
                    e = e3;
                    f2.m.d().b(g2.m.f17137D, str4 + " failed because it threw an exception/error", e);
                } catch (CancellationException e5) {
                    f2.m.d().e(g2.m.f17137D, str4 + " was cancelled", e5);
                } catch (ExecutionException e6) {
                    e = e6;
                    f2.m.d().b(g2.m.f17137D, str4 + " failed because it threw an exception/error", e);
                }
                mVar2.b();
                return;
            case 8:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f5349n;
                Context context = (Context) this.f5348m;
                Intent intent = (Intent) this.f5347l;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    f2.m.d().a(ConstraintProxyUpdateReceiver.f7108a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    AbstractC2249g.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    AbstractC2249g.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    AbstractC2249g.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    AbstractC2249g.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 9:
                try {
                    obj = ((CallableC0463g) this.f5347l).call();
                } catch (Exception unused2) {
                    obj = null;
                }
                ((Handler) this.f5349n).post(new D3.h(18, (k1.f) this.f5348m, obj, z5));
                return;
            case 10:
                o2.i h4 = ((WorkDatabase) this.f5347l).n().h((String) this.f5348m);
                if (h4 == null || !h4.b()) {
                    return;
                }
                synchronized (((C2185a) this.f5349n).f18461m) {
                    ((C2185a) this.f5349n).f18464p.put((String) this.f5348m, h4);
                    ((C2185a) this.f5349n).f18465q.add(h4);
                    C2185a c2185a = (C2185a) this.f5349n;
                    c2185a.f18466r.c(c2185a.f18465q);
                }
                return;
            default:
                ((g2.l) this.f5347l).f17133p.h((String) this.f5348m, (v3.e) this.f5349n);
                return;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i) {
        this.f5346k = i;
        this.f5347l = obj;
        this.f5348m = obj2;
        this.f5349n = obj3;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i, boolean z3) {
        this.f5346k = i;
        this.f5349n = obj;
        this.f5347l = obj2;
        this.f5348m = obj3;
    }
}
