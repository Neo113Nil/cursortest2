package H2;

import D6.y0;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import I2.Q;
import K4.t;
import P2.C0375a;
import P2.F;
import P2.G;
import P2.I;
import P2.y;
import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0435b;
import U5.C0443j;
import U5.C0458z;
import U5.EnumC0446m;
import U5.L;
import U5.b0;
import U5.i0;
import U5.l0;
import U5.m0;
import U5.p0;
import W5.AbstractC0494d0;
import W5.B;
import W5.C;
import W5.I0;
import W5.M0;
import W5.Q0;
import W5.Z1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import c5.C0820a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.Z;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzdqv;
import d5.EnumC0966a;
import d6.C0977k;
import d6.C0978l;
import d6.C0979m;
import d6.C0980n;
import d6.C0981o;
import d6.C0986t;
import e1.C0995b;
import i5.C1282d;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l1.C1377a;
import l4.C1403n;
import l4.s;
import n1.AbstractC1451f;
import n4.C1473g;
import n4.C1479m;
import o1.C1501k;
import w1.F0;
import w1.P2;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3286a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3287b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3288c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3289d;

    public /* synthetic */ q(int i7) {
        this.f3286a = i7;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153 A[Catch: Exception -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #0 {FileNotFoundException -> 0x005e, blocks: (B:3:0x0011, B:5:0x0030, B:9:0x0043, B:10:0x004d, B:20:0x00a0, B:23:0x00a5, B:25:0x00bb, B:26:0x00d5, B:28:0x00dd, B:30:0x00f9, B:32:0x0113, B:34:0x011e, B:36:0x0131, B:39:0x0149, B:41:0x0145, B:42:0x014e, B:44:0x0153, B:46:0x0165, B:48:0x016f, B:50:0x0051, B:53:0x0061, B:56:0x006b, B:59:0x0074, B:62:0x007e, B:65:0x0088), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0051 A[Catch: Exception -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #0 {FileNotFoundException -> 0x005e, blocks: (B:3:0x0011, B:5:0x0030, B:9:0x0043, B:10:0x004d, B:20:0x00a0, B:23:0x00a5, B:25:0x00bb, B:26:0x00d5, B:28:0x00dd, B:30:0x00f9, B:32:0x0113, B:34:0x011e, B:36:0x0131, B:39:0x0149, B:41:0x0145, B:42:0x014e, B:44:0x0153, B:46:0x0165, B:48:0x016f, B:50:0x0051, B:53:0x0061, B:56:0x006b, B:59:0x0074, B:62:0x007e, B:65:0x0088), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0061 A[Catch: Exception -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #0 {FileNotFoundException -> 0x005e, blocks: (B:3:0x0011, B:5:0x0030, B:9:0x0043, B:10:0x004d, B:20:0x00a0, B:23:0x00a5, B:25:0x00bb, B:26:0x00d5, B:28:0x00dd, B:30:0x00f9, B:32:0x0113, B:34:0x011e, B:36:0x0131, B:39:0x0149, B:41:0x0145, B:42:0x014e, B:44:0x0153, B:46:0x0165, B:48:0x016f, B:50:0x0051, B:53:0x0061, B:56:0x006b, B:59:0x0074, B:62:0x007e, B:65:0x0088), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006b A[Catch: Exception -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #0 {FileNotFoundException -> 0x005e, blocks: (B:3:0x0011, B:5:0x0030, B:9:0x0043, B:10:0x004d, B:20:0x00a0, B:23:0x00a5, B:25:0x00bb, B:26:0x00d5, B:28:0x00dd, B:30:0x00f9, B:32:0x0113, B:34:0x011e, B:36:0x0131, B:39:0x0149, B:41:0x0145, B:42:0x014e, B:44:0x0153, B:46:0x0165, B:48:0x016f, B:50:0x0051, B:53:0x0061, B:56:0x006b, B:59:0x0074, B:62:0x007e, B:65:0x0088), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0074 A[Catch: Exception -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #0 {FileNotFoundException -> 0x005e, blocks: (B:3:0x0011, B:5:0x0030, B:9:0x0043, B:10:0x004d, B:20:0x00a0, B:23:0x00a5, B:25:0x00bb, B:26:0x00d5, B:28:0x00dd, B:30:0x00f9, B:32:0x0113, B:34:0x011e, B:36:0x0131, B:39:0x0149, B:41:0x0145, B:42:0x014e, B:44:0x0153, B:46:0x0165, B:48:0x016f, B:50:0x0051, B:53:0x0061, B:56:0x006b, B:59:0x0074, B:62:0x007e, B:65:0x0088), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e A[Catch: Exception -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #0 {FileNotFoundException -> 0x005e, blocks: (B:3:0x0011, B:5:0x0030, B:9:0x0043, B:10:0x004d, B:20:0x00a0, B:23:0x00a5, B:25:0x00bb, B:26:0x00d5, B:28:0x00dd, B:30:0x00f9, B:32:0x0113, B:34:0x011e, B:36:0x0131, B:39:0x0149, B:41:0x0145, B:42:0x014e, B:44:0x0153, B:46:0x0165, B:48:0x016f, B:50:0x0051, B:53:0x0061, B:56:0x006b, B:59:0x0074, B:62:0x007e, B:65:0x0088), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0088 A[Catch: Exception -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #0 {FileNotFoundException -> 0x005e, blocks: (B:3:0x0011, B:5:0x0030, B:9:0x0043, B:10:0x004d, B:20:0x00a0, B:23:0x00a5, B:25:0x00bb, B:26:0x00d5, B:28:0x00dd, B:30:0x00f9, B:32:0x0113, B:34:0x011e, B:36:0x0131, B:39:0x0149, B:41:0x0145, B:42:0x014e, B:44:0x0153, B:46:0x0165, B:48:0x016f, B:50:0x0051, B:53:0x0061, B:56:0x006b, B:59:0x0074, B:62:0x007e, B:65:0x0088), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        boolean z4;
        Exception e7;
        String str;
        A5.o oVar = (A5.o) this.f3287b;
        A5.p pVar = (A5.p) this.f3288c;
        c5.c cVar = (c5.c) this.f3289d;
        char c3 = 0;
        try {
            try {
                cVar.f10445b.f10437e = (Map) ((Map) oVar.f677b).get(RRWebOptionsEvent.EVENT_TAG);
                C0820a c0820a = cVar.f10445b;
                try {
                    if (((Map) c0820a.f10437e).containsKey("resetOnError")) {
                        if (((Map) c0820a.f10437e).get("resetOnError").equals("true")) {
                            z4 = true;
                            str = oVar.f676a;
                            switch (str.hashCode()) {
                                case -1335458389:
                                    if (str.equals("delete")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -358737930:
                                    if (str.equals("deleteAll")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3496342:
                                    if (str.equals("read")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 113399775:
                                    if (str.equals("write")) {
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 208013248:
                                    if (str.equals("containsKey")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1080375339:
                                    if (str.equals("readAll")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            if (c3 != 0) {
                                String a2 = c5.c.a(cVar, oVar);
                                String str2 = (String) ((Map) oVar.f677b).get("value");
                                if (str2 == null) {
                                    pVar.error("null", null, null);
                                    return;
                                } else {
                                    cVar.f10445b.v(a2, str2);
                                    pVar.success(null);
                                    return;
                                }
                            }
                            if (c3 == 1) {
                                String a4 = c5.c.a(cVar, oVar);
                                C0820a c0820a2 = cVar.f10445b;
                                c0820a2.c();
                                if (!((SharedPreferences) c0820a2.f10438f).contains(a4)) {
                                    pVar.success(null);
                                    return;
                                }
                                C0820a c0820a3 = cVar.f10445b;
                                c0820a3.c();
                                String string = ((SharedPreferences) c0820a3.f10438f).getString(a4, null);
                                if (!c0820a3.k()) {
                                    string = c0820a3.b(string);
                                }
                                pVar.success(string);
                                return;
                            }
                            if (c3 == 2) {
                                pVar.success(cVar.f10445b.q());
                                return;
                            }
                            if (c3 == 3) {
                                String a7 = c5.c.a(cVar, oVar);
                                C0820a c0820a4 = cVar.f10445b;
                                c0820a4.c();
                                pVar.success(Boolean.valueOf(((SharedPreferences) c0820a4.f10438f).contains(a7)));
                                return;
                            }
                            if (c3 == 4) {
                                String a8 = c5.c.a(cVar, oVar);
                                C0820a c0820a5 = cVar.f10445b;
                                c0820a5.c();
                                SharedPreferences.Editor edit = ((SharedPreferences) c0820a5.f10438f).edit();
                                edit.remove(a8);
                                edit.apply();
                                pVar.success(null);
                                return;
                            }
                            if (c3 != 5) {
                                pVar.notImplemented();
                                return;
                            }
                            C0820a c0820a6 = cVar.f10445b;
                            c0820a6.c();
                            SharedPreferences.Editor edit2 = ((SharedPreferences) c0820a6.f10438f).edit();
                            edit2.clear();
                            if (!c0820a6.k()) {
                                F0 f02 = (F0) c0820a6.f10440h;
                                edit2.putString("FlutterSecureSAlgorithmKey", ((EnumC0966a) f02.f17375d).name());
                                edit2.putString("FlutterSecureSAlgorithmStorage", ((d5.c) f02.f17376e).name());
                            }
                            edit2.apply();
                            pVar.success(null);
                            return;
                        }
                    }
                    str = oVar.f676a;
                    switch (str.hashCode()) {
                        case -1335458389:
                            break;
                        case -358737930:
                            break;
                        case 3496342:
                            break;
                        case 113399775:
                            break;
                        case 208013248:
                            break;
                        case 1080375339:
                            break;
                    }
                    if (c3 != 0) {
                    }
                } catch (Exception e8) {
                    e7 = e8;
                    if (!z4) {
                        StringWriter stringWriter = new StringWriter();
                        e7.printStackTrace(new PrintWriter(stringWriter));
                        pVar.error("Exception encountered", oVar.f676a, stringWriter.toString());
                        return;
                    }
                    try {
                        C0820a c0820a7 = cVar.f10445b;
                        c0820a7.c();
                        SharedPreferences.Editor edit3 = ((SharedPreferences) c0820a7.f10438f).edit();
                        edit3.clear();
                        if (!c0820a7.k()) {
                            F0 f03 = (F0) c0820a7.f10440h;
                            edit3.putString("FlutterSecureSAlgorithmKey", ((EnumC0966a) f03.f17375d).name());
                            edit3.putString("FlutterSecureSAlgorithmStorage", ((d5.c) f03.f17376e).name());
                        }
                        edit3.apply();
                        pVar.success("Data has been reset");
                        return;
                    } catch (Exception e9) {
                        StringWriter stringWriter2 = new StringWriter();
                        e9.printStackTrace(new PrintWriter(stringWriter2));
                        pVar.error("Exception encountered", oVar.f676a, stringWriter2.toString());
                        return;
                    }
                }
                z4 = false;
            } catch (FileNotFoundException e10) {
                Log.i("Creating sharedPrefs", e10.getLocalizedMessage());
            }
        } catch (Exception e11) {
            z4 = false;
            e7 = e11;
        }
    }

    private final void b() {
        C1501k c1501k = (C1501k) this.f3288c;
        e1.m mVar = (e1.m) this.f3289d;
        try {
            ((C1501k) this.f3287b).get();
            d1.n.d().b(e1.m.f12550K, "Starting work for " + mVar.f12565e.f15218c, new Throwable[0]);
            I3.b startWork = mVar.f12566f.startWork();
            mVar.f12559I = startWork;
            c1501k.k(startWork);
        } catch (Throwable th) {
            c1501k.j(th);
        }
    }

    private final void c() {
        String str = (String) this.f3288c;
        e1.m mVar = (e1.m) this.f3289d;
        try {
            try {
                d1.m mVar2 = (d1.m) ((C1501k) this.f3287b).get();
                if (mVar2 == null) {
                    d1.n.d().c(e1.m.f12550K, mVar.f12565e.f15218c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                } else {
                    d1.n.d().b(e1.m.f12550K, String.format("%s returned a %s result.", mVar.f12565e.f15218c, mVar2), new Throwable[0]);
                    mVar.f12568y = mVar2;
                }
            } catch (InterruptedException e7) {
                e = e7;
                d1.n.d().c(e1.m.f12550K, str + " failed because it threw an exception/error", e);
            } catch (CancellationException e8) {
                d1.n.d().e(e1.m.f12550K, str + " was cancelled", e8);
            } catch (ExecutionException e9) {
                e = e9;
                d1.n.d().c(e1.m.f12550K, str + " failed because it threw an exception/error", e);
            }
            mVar.b();
        } catch (Throwable th) {
            mVar.b();
            throw th;
        }
    }

    private final void d() {
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f3289d;
        Context context = (Context) this.f3288c;
        Intent intent = (Intent) this.f3287b;
        try {
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            d1.n.d().b(ConstraintProxyUpdateReceiver.f9878a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
            AbstractC1451f.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            AbstractC1451f.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            AbstractC1451f.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            AbstractC1451f.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            pendingResult.finish();
        }
    }

    private final void e() {
        C0977k c0977k = (C0977k) this.f3289d;
        C1479m c1479m = (C1479m) c0977k.f12441b;
        C1473g c1473g = (C1473g) c0977k.f12442c;
        q4.j jVar = (q4.j) ((q4.e) this.f3288c).f15858b;
        s sVar = c1479m.f15449c;
        ArrayList l7 = c1473g.l();
        v4.r rVar = (v4.r) this.f3287b;
        Object u4 = rVar.u(true);
        F0 f02 = new F0(c1479m, c1473g, (Iterable) rVar, (Object) jVar, 17);
        sVar.f14983G = true;
        if (sVar.a()) {
            sVar.n("o", l7, u4, f02);
        } else {
            sVar.f14995m.add(new C1403n("o", l7, u4, f02));
        }
        sVar.c();
    }

    private final void f() {
        synchronized (i5.k.f14055f) {
            i5.k.a((i5.k) this.f3289d, (C1282d) this.f3287b);
        }
        ((A5.p) this.f3288c).success(null);
    }

    private final void g() {
        m1.i l7 = ((WorkDatabase) this.f3287b).n().l((String) this.f3288c);
        if (l7 == null || !l7.b()) {
            return;
        }
        synchronized (((C1377a) this.f3289d).f14863c) {
            ((C1377a) this.f3289d).f14866f.put((String) this.f3288c, l7);
            ((C1377a) this.f3289d).f14867x.add(l7);
            C1377a c1377a = (C1377a) this.f3289d;
            c1377a.f14868y.b(c1377a.f14867x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:323:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0757  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        boolean acceptThirdPartyCookies;
        I i7;
        List list;
        X5.m mVar;
        X5.l lVar;
        Socket socket;
        boolean z4;
        SSLSession sSLSession;
        Socket socket2;
        N6.i iVar;
        int i8;
        C0165x c0165x;
        int i9;
        int i10;
        int i11;
        q qVar = this;
        Object obj2 = null;
        boolean z7 = true;
        switch (qVar.f3286a) {
            case 0:
                zzceb zzcebVar = (zzceb) ((r) qVar.f3287b).f3294e;
                if (zzcebVar != null) {
                    zzcebVar.zzd((String) qVar.f3288c, (HashMap) qVar.f3289d);
                    return;
                }
                return;
            case 1:
                try {
                    obj = ((M.b) qVar.f3287b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) qVar.f3289d).post(new y0(13, (M.c) qVar.f3288c, obj));
                return;
            case 2:
                Q q7 = E2.o.f1952C.f1959e;
                C0375a c0375a = (C0375a) qVar.f3287b;
                Context context = c0375a.f5460a;
                CookieManager h6 = q7.h();
                boolean acceptThirdPartyCookies2 = h6 != null ? h6.acceptThirdPartyCookies(c0375a.f5461b) : false;
                Bundle bundle = (Bundle) qVar.f3288c;
                bundle.putBoolean("accept_3p_cookie", acceptThirdPartyCookies2);
                R2.a.a(c0375a.f5460a, new y2.i((y2.h) new y2.h(6).a(bundle, AdMobAdapter.class)), (y) qVar.f3289d);
                return;
            case 3:
                Object obj3 = qVar.f3288c;
                boolean z8 = obj3 instanceof WebView;
                G g3 = (G) qVar.f3287b;
                if (z8) {
                    Context context2 = g3.f5425c;
                    CookieManager h7 = E2.o.f1952C.f1959e.h();
                    if (h7 != null) {
                        acceptThirdPartyCookies = h7.acceptThirdPartyCookies((WebView) obj3);
                        HashMap hashMap = g3.f5423a;
                        Boolean valueOf = Boolean.valueOf(acceptThirdPartyCookies);
                        i7 = (I) hashMap.get(valueOf);
                        Pair pair = (Pair) qVar.f3289d;
                        if (i7 != null) {
                            E2.o.f1952C.j.getClass();
                            if (i7.f5436c > System.currentTimeMillis()) {
                                g3.d(i7, pair, true);
                                return;
                            }
                        }
                        HashMap hashMap2 = g3.f5424b;
                        list = (List) hashMap2.get(valueOf);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap2.put(valueOf, list);
                        }
                        list.add(pair);
                        return;
                    }
                }
                acceptThirdPartyCookies = false;
                HashMap hashMap3 = g3.f5423a;
                Boolean valueOf2 = Boolean.valueOf(acceptThirdPartyCookies);
                i7 = (I) hashMap3.get(valueOf2);
                Pair pair2 = (Pair) qVar.f3289d;
                if (i7 != null) {
                }
                HashMap hashMap22 = g3.f5424b;
                list = (List) hashMap22.get(valueOf2);
                if (list == null) {
                }
                list.add(pair2);
                return;
            case 4:
                zzdqv zzdqvVar = (zzdqv) qVar.f3287b;
                ConcurrentHashMap zzc = zzdqvVar.zzc();
                String str = (String) qVar.f3288c;
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str)) {
                    zzc.put("action", str);
                }
                int i12 = 0;
                while (true) {
                    Pair[] pairArr = (Pair[]) qVar.f3289d;
                    if (i12 >= pairArr.length) {
                        zzdqvVar.zzg(zzc);
                        return;
                    }
                    Pair pair3 = pairArr[i12];
                    String str2 = (String) pair3.first;
                    String str3 = (String) pair3.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        zzc.put(str2, str3);
                    }
                    i12++;
                }
                break;
            case 5:
                new zzbtf((Context) qVar.f3287b, EnumC1798b.BANNER, ((y2.i) qVar.f3288c).f18154a, null).zzb((R2.b) qVar.f3289d);
                return;
            case 6:
                ((p0) qVar.f3289d).execute((F) qVar.f3287b);
                return;
            case 7:
                ((M0) qVar.f3289d).f6869f.e((AbstractC0457y) qVar.f3287b, (b0) qVar.f3288c);
                return;
            case 8:
                ((W5.I) qVar.f3289d).f6819a.g((l0) qVar.f3287b, (b0) qVar.f3288c);
                return;
            case 9:
                Q0 q02 = (Q0) qVar.f3289d;
                C c3 = q02.f6977u;
                t tVar = (t) qVar.f3287b;
                Executor executor = q02.f6967k;
                EnumC0446m enumC0446m = (EnumC0446m) qVar.f3288c;
                c3.getClass();
                p3.f.k(executor, "executor");
                p3.f.k(enumC0446m, "source");
                B b7 = new B(tVar, executor);
                if (((EnumC0446m) c3.f6749a) != enumC0446m) {
                    executor.execute(tVar);
                    return;
                } else {
                    ((ArrayList) c3.f6750b).add(b7);
                    return;
                }
            case 10:
                I0 i02 = (I0) qVar.f3289d;
                Q0 q03 = i02.f6823e;
                if (i02 != q03.f6930A) {
                    return;
                }
                L l7 = (L) qVar.f3287b;
                q03.f6931B = l7;
                q03.f6937H.i(l7);
                EnumC0446m enumC0446m2 = EnumC0446m.f6554e;
                EnumC0446m enumC0446m3 = (EnumC0446m) qVar.f3288c;
                if (enumC0446m3 != enumC0446m2) {
                    i02.f6823e.f6947R.m(2, "Entering {0} state with picker: {1}", enumC0446m3, l7);
                    i02.f6823e.f6977u.b(enumC0446m3);
                    return;
                }
                return;
            case 11:
                try {
                    ((CountDownLatch) qVar.f3287b).await();
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
                N6.i iVar2 = new N6.i(new X5.k());
                try {
                    try {
                        X5.m mVar2 = (X5.m) qVar.f3289d;
                        C0458z c0458z = mVar2.f7578N;
                        if (c0458z == null) {
                            socket = mVar2.f7565A.createSocket(mVar2.f7580a.getAddress(), ((X5.m) qVar.f3289d).f7580a.getPort());
                        } else {
                            InetSocketAddress inetSocketAddress = c0458z.f6596a;
                            if (inetSocketAddress == null) {
                                throw new m0(l0.f6543m.g("Unsupported SocketAddress implementation " + ((X5.m) qVar.f3289d).f7578N.f6596a.getClass()));
                            }
                            socket = X5.m.h(mVar2, c0458z.f6597b, inetSocketAddress, c0458z.f6598c, c0458z.f6599d);
                        }
                        X5.m mVar3 = (X5.m) qVar.f3289d;
                        SSLSocketFactory sSLSocketFactory = mVar3.f7566B;
                        if (sSLSocketFactory != null) {
                            String str4 = mVar3.f7581b;
                            URI a2 = AbstractC0494d0.a(str4);
                            if (a2.getHost() != null) {
                                str4 = a2.getHost();
                            }
                            SSLSocket a4 = X5.s.a(sSLSocketFactory, socket, str4, ((X5.m) qVar.f3289d).l(), ((X5.m) qVar.f3289d).f7569E);
                            sSLSession = a4.getSession();
                            z4 = true;
                            socket2 = a4;
                        } else {
                            z4 = true;
                            sSLSession = null;
                            socket2 = socket;
                        }
                        socket2.setTcpNoDelay(z4);
                        iVar = new N6.i(Q0.a.Y(socket2));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (m0 e7) {
                    e = e7;
                } catch (Exception e8) {
                    e = e8;
                }
                try {
                    ((X5.c) qVar.f3288c).a(Q0.a.W(socket2), socket2);
                    X5.m mVar4 = (X5.m) qVar.f3289d;
                    C0435b c0435b = mVar4.f7599u;
                    c0435b.getClass();
                    P2 p22 = new P2(c0435b);
                    p22.P(AbstractC0438e.f6489a, socket2.getRemoteSocketAddress());
                    p22.P(AbstractC0438e.f6490b, socket2.getLocalSocketAddress());
                    p22.P(AbstractC0438e.f6491c, sSLSession);
                    p22.P(Z1.f7103a, sSLSession == null ? i0.f6507a : i0.f6508b);
                    mVar4.f7599u = p22.b();
                    X5.m mVar5 = (X5.m) qVar.f3289d;
                    mVar5.f7586g.getClass();
                    mVar5.f7598t = new X5.l(mVar5, new Z5.g(iVar));
                    synchronized (((X5.m) qVar.f3289d).f7589k) {
                        try {
                            ((X5.m) qVar.f3289d).getClass();
                            if (sSLSession != null) {
                                X5.m mVar6 = (X5.m) qVar.f3289d;
                                new C0443j(sSLSession);
                                mVar6.getClass();
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (m0 e9) {
                    e = e9;
                    iVar2 = iVar;
                    ((X5.m) qVar.f3289d).s(0, Z5.a.INTERNAL_ERROR, e.f6556a);
                    mVar = (X5.m) qVar.f3289d;
                    mVar.f7586g.getClass();
                    lVar = new X5.l(mVar, new Z5.g(iVar2));
                    mVar.f7598t = lVar;
                    return;
                } catch (Exception e10) {
                    e = e10;
                    iVar2 = iVar;
                    ((X5.m) qVar.f3289d).p(e);
                    mVar = (X5.m) qVar.f3289d;
                    mVar.f7586g.getClass();
                    lVar = new X5.l(mVar, new Z5.g(iVar2));
                    mVar.f7598t = lVar;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    iVar2 = iVar;
                    X5.m mVar7 = (X5.m) qVar.f3289d;
                    mVar7.f7586g.getClass();
                    mVar7.f7598t = new X5.l(mVar7, new Z5.g(iVar2));
                    throw th;
                }
            case 12:
                a();
                return;
            case 13:
                Z z9 = (Z) qVar.f3289d;
                int i13 = z9.f11158b;
                LifecycleCallback lifecycleCallback = (LifecycleCallback) qVar.f3287b;
                if (i13 > 0) {
                    Bundle bundle2 = z9.f11159c;
                    lifecycleCallback.onCreate(bundle2 != null ? bundle2.getBundle((String) qVar.f3288c) : null);
                }
                if (z9.f11158b >= 2) {
                    lifecycleCallback.onStart();
                }
                if (z9.f11158b >= 3) {
                    lifecycleCallback.onResume();
                }
                if (z9.f11158b >= 4) {
                    lifecycleCallback.onStop();
                }
                if (z9.f11158b >= 5) {
                    lifecycleCallback.onDestroy();
                    return;
                }
                return;
            case 14:
                a0 a0Var = (a0) qVar.f3289d;
                int i14 = a0Var.f11166k0;
                LifecycleCallback lifecycleCallback2 = (LifecycleCallback) qVar.f3287b;
                if (i14 > 0) {
                    Bundle bundle3 = a0Var.f11167l0;
                    lifecycleCallback2.onCreate(bundle3 != null ? bundle3.getBundle((String) qVar.f3288c) : null);
                }
                if (a0Var.f11166k0 >= 2) {
                    lifecycleCallback2.onStart();
                }
                if (a0Var.f11166k0 >= 3) {
                    lifecycleCallback2.onResume();
                }
                if (a0Var.f11166k0 >= 4) {
                    lifecycleCallback2.onStop();
                }
                if (a0Var.f11166k0 >= 5) {
                    lifecycleCallback2.onDestroy();
                    return;
                }
                return;
            case 15:
                C0986t c0986t = (C0986t) qVar.f3289d;
                c0986t.f12479l = Long.valueOf(c0986t.f12477i.d());
                for (C0978l c0978l : ((HashMap) ((C0986t) qVar.f3289d).f12474f.f12450b).values()) {
                    C0977k c0977k = c0978l.f12445c;
                    ((AtomicLong) c0977k.f12441b).set(0L);
                    ((AtomicLong) c0977k.f12442c).set(0L);
                    C0977k c0977k2 = c0978l.f12444b;
                    c0978l.f12444b = c0978l.f12445c;
                    c0978l.f12445c = c0977k2;
                }
                C0981o c0981o = (C0981o) qVar.f3287b;
                AbstractC0438e abstractC0438e = (AbstractC0438e) qVar.f3288c;
                C0165x c0165x2 = AbstractC0167z.f2083b;
                C0164w c0164w = new C0164w();
                if (c0981o.f12458e != null) {
                    c0164w.b(new C0980n(c0981o, abstractC0438e, 1));
                }
                if (c0981o.f12459f != null) {
                    i8 = 0;
                    c0164w.b(new C0980n(c0981o, abstractC0438e, 0));
                } else {
                    i8 = 0;
                }
                C0165x listIterator = c0164w.d().listIterator(i8);
                while (listIterator.hasNext()) {
                    C0980n c0980n = (C0980n) listIterator.next();
                    C0986t c0986t2 = (C0986t) qVar.f3289d;
                    C0979m c0979m = c0986t2.f12474f;
                    long longValue = c0986t2.f12479l.longValue();
                    switch (c0980n.f12451a) {
                        case 0:
                            c0165x = listIterator;
                            C0981o c0981o2 = c0980n.f12452b;
                            ArrayList h8 = C0986t.h(c0979m, ((Integer) c0981o2.f12459f.f14677d).intValue());
                            int size = h8.size();
                            k1.g gVar = c0981o2.f12459f;
                            if (size >= ((Integer) gVar.f14676c).intValue() && h8.size() != 0) {
                                Iterator it = h8.iterator();
                                while (it.hasNext()) {
                                    C0978l c0978l2 = (C0978l) it.next();
                                    if (c0979m.d() >= c0981o2.f12457d.intValue()) {
                                        break;
                                    } else if (c0978l2.c() >= ((Integer) gVar.f14677d).intValue()) {
                                        if (((AtomicLong) c0978l2.f12445c.f12442c).get() / c0978l2.c() > ((Integer) gVar.f14674a).intValue() / 100.0d) {
                                            c0980n.f12453c.m(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", c0978l2, Double.valueOf(((AtomicLong) c0978l2.f12445c.f12442c).get() / c0978l2.c()));
                                            if (new Random().nextInt(100) < ((Integer) gVar.f14675b).intValue()) {
                                                c0978l2.b(longValue);
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        default:
                            C0981o c0981o3 = c0980n.f12452b;
                            ArrayList h9 = C0986t.h(c0979m, ((Integer) c0981o3.f12458e.f17376e).intValue());
                            int size2 = h9.size();
                            F0 f02 = c0981o3.f12458e;
                            if (size2 >= ((Integer) f02.f17375d).intValue() && h9.size() != 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = h9.iterator();
                                while (it2.hasNext()) {
                                    C0978l c0978l3 = (C0978l) it2.next();
                                    arrayList.add(Double.valueOf(((AtomicLong) c0978l3.f12445c.f12441b).get() / c0978l3.c()));
                                    c0979m = c0979m;
                                }
                                C0979m c0979m2 = c0979m;
                                Iterator it3 = arrayList.iterator();
                                double d7 = 0.0d;
                                double d8 = 0.0d;
                                while (it3.hasNext()) {
                                    d8 = ((Double) it3.next()).doubleValue() + d8;
                                }
                                double size3 = d8 / arrayList.size();
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    double doubleValue = ((Double) it4.next()).doubleValue() - size3;
                                    d7 = (doubleValue * doubleValue) + d7;
                                }
                                double sqrt = Math.sqrt(d7 / arrayList.size());
                                double intValue = size3 - ((((Integer) f02.f17373b).intValue() / 1000.0f) * sqrt);
                                Iterator it5 = h9.iterator();
                                while (it5.hasNext()) {
                                    C0978l c0978l4 = (C0978l) it5.next();
                                    Iterator it6 = it5;
                                    if (c0979m2.d() < c0981o3.f12457d.intValue()) {
                                        C0165x c0165x3 = listIterator;
                                        if (((AtomicLong) c0978l4.f12445c.f12441b).get() / c0978l4.c() < intValue) {
                                            c0980n.f12453c.m(1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", c0978l4, Double.valueOf(((AtomicLong) c0978l4.f12445c.f12441b).get() / c0978l4.c()), Double.valueOf(size3), Double.valueOf(sqrt), Double.valueOf(intValue));
                                            if (new Random().nextInt(100) < ((Integer) f02.f17374c).intValue()) {
                                                c0978l4.b(longValue);
                                            }
                                        }
                                        listIterator = c0165x3;
                                        it5 = it6;
                                    }
                                }
                            }
                            c0165x = listIterator;
                            break;
                    }
                    qVar = this;
                    listIterator = c0165x;
                }
                C0986t c0986t3 = (C0986t) qVar.f3289d;
                C0979m c0979m3 = c0986t3.f12474f;
                Long l8 = c0986t3.f12479l;
                for (C0978l c0978l5 : ((HashMap) c0979m3.f12450b).values()) {
                    if (!c0978l5.d()) {
                        int i15 = c0978l5.f12447e;
                        c0978l5.f12447e = i15 == 0 ? 0 : i15 - 1;
                    }
                    if (c0978l5.d()) {
                        if (l8.longValue() > Math.min(c0978l5.f12443a.f12455b.longValue() * c0978l5.f12447e, Math.max(c0978l5.f12443a.f12455b.longValue(), c0978l5.f12443a.f12456c.longValue())) + c0978l5.f12446d.longValue()) {
                            c0978l5.e();
                        }
                    }
                }
                return;
            case 16:
                try {
                    z7 = ((Boolean) ((C1501k) qVar.f3289d).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused3) {
                }
                ((C0995b) qVar.f3287b).b((String) qVar.f3288c, z7);
                return;
            case 17:
                b();
                return;
            case 18:
                c();
                return;
            case 19:
                d();
                return;
            case 20:
                e();
                return;
            case zzbbd.zzt.zzm /* 21 */:
                f();
                return;
            case 22:
                g();
                return;
            case 23:
                ((e1.l) qVar.f3287b).f12549z.g((String) qVar.f3288c, (android.support.v4.media.session.t) qVar.f3289d);
                return;
            default:
                I4.j jVar = (I4.j) qVar.f3289d;
                Iterator it7 = ((r.i) ((q0.s) jVar.f3681e).f15781e.keySet()).iterator();
                while (true) {
                    r.h hVar = (r.h) it7;
                    if (!hVar.hasNext()) {
                        return;
                    }
                    IBinder iBinder = (IBinder) hVar.next();
                    q0.s sVar = (q0.s) jVar.f3681e;
                    q0.h hVar2 = (q0.h) sVar.f15781e.getOrDefault(iBinder, obj2);
                    HashMap hashMap4 = hVar2.f15743e;
                    String str5 = (String) qVar.f3288c;
                    List<O.b> list2 = (List) hashMap4.get(str5);
                    if (list2 != null) {
                        for (O.b bVar : list2) {
                            Bundle bundle4 = (Bundle) bVar.f4825b;
                            Bundle bundle5 = (Bundle) qVar.f3287b;
                            int i16 = bundle5 == null ? -1 : bundle5.getInt("android.media.browse.extra.PAGE", -1);
                            int i17 = bundle4 == null ? -1 : bundle4.getInt("android.media.browse.extra.PAGE", -1);
                            int i18 = bundle5 == null ? -1 : bundle5.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            int i19 = bundle4 == null ? -1 : bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            int i20 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                            if (i16 == -1 || i18 == -1) {
                                i9 = Integer.MAX_VALUE;
                                i10 = 0;
                            } else {
                                i10 = i16 * i18;
                                i9 = (i18 + i10) - 1;
                            }
                            if (i17 == -1 || i19 == -1) {
                                i11 = 0;
                            } else {
                                int i21 = i19 * i17;
                                i20 = (i19 + i21) - 1;
                                i11 = i21;
                            }
                            if (i9 >= i11 && i20 >= i10) {
                                sVar.e(str5, hVar2, (Bundle) bVar.f4825b, bundle5);
                            }
                        }
                    }
                    obj2 = null;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f3286a) {
            case 6:
                return ((Runnable) this.f3288c).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q(int i7, Object obj, Object obj2, Object obj3, boolean z4) {
        this.f3286a = i7;
        this.f3289d = obj;
        this.f3287b = obj2;
        this.f3288c = obj3;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i7) {
        this.f3286a = i7;
        this.f3287b = obj;
        this.f3288c = obj2;
        this.f3289d = obj3;
    }

    public q(I4.j jVar, String str, Bundle bundle) {
        this.f3286a = 24;
        this.f3289d = jVar;
        this.f3288c = str;
        this.f3287b = bundle;
    }
}
