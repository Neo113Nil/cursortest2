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
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.Z;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzdqv;
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
import p083l4.s;
import p098n4.C0934g;
import p098n4.C0940m;
import p155w1.F0;
import p155w1.P2;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3289d;

    public /* synthetic */ q(int i7) {
        this.f3286a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void a() {
        boolean z4;
        Exception e7;
        A5.o oVar = (A5.o) this.f3287b;
        A5.p pVar = (A5.p) this.f3288c;
        p019c5.c cVar = (p019c5.c) this.f3289d;
        byte b7 = 0;
        try {
            try {
                cVar.f10445b.f10437e = (Map) ((Map) oVar.f677b).get(RRWebOptionsEvent.EVENT_TAG);
                p019c5.a aVar = cVar.f10445b;
                z4 = ((Map) aVar.f10437e).containsKey("resetOnError") && ((Map) aVar.f10437e).get("resetOnError").equals("true");
                try {
                    String str = oVar.f676a;
                    switch (str.hashCode()) {
                        case -1335458389:
                            if (!str.equals("delete")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case -358737930:
                            if (!str.equals("deleteAll")) {
                                b7 = -1;
                            } else {
                                b7 = 5;
                            }
                            break;
                        case 3496342:
                            if (!str.equals("read")) {
                                b7 = -1;
                            } else {
                                b7 = 1;
                            }
                            break;
                        case 113399775:
                            if (!str.equals("write")) {
                                b7 = -1;
                            }
                            break;
                        case 208013248:
                            if (!str.equals("containsKey")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        case 1080375339:
                            if (!str.equals("readAll")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 0) {
                        String strA = p019c5.c.a(cVar, oVar);
                        String str2 = (String) ((Map) oVar.f677b).get("value");
                        if (str2 == null) {
                            pVar.error("null", null, null);
                            return;
                        } else {
                            cVar.f10445b.v(strA, str2);
                            pVar.success(null);
                            return;
                        }
                    }
                    if (b7 == 1) {
                        String strA2 = p019c5.c.a(cVar, oVar);
                        p019c5.a aVar2 = cVar.f10445b;
                        aVar2.c();
                        if (!((SharedPreferences) aVar2.f10438f).contains(strA2)) {
                            pVar.success(null);
                            return;
                        }
                        p019c5.a aVar3 = cVar.f10445b;
                        aVar3.c();
                        String string = ((SharedPreferences) aVar3.f10438f).getString(strA2, null);
                        if (!aVar3.k()) {
                            string = aVar3.b(string);
                        }
                        pVar.success(string);
                        return;
                    }
                    if (b7 == 2) {
                        pVar.success(cVar.f10445b.q());
                        return;
                    }
                    if (b7 == 3) {
                        String strA3 = p019c5.c.a(cVar, oVar);
                        p019c5.a aVar4 = cVar.f10445b;
                        aVar4.c();
                        pVar.success(Boolean.valueOf(((SharedPreferences) aVar4.f10438f).contains(strA3)));
                        return;
                    }
                    if (b7 == 4) {
                        String strA4 = p019c5.c.a(cVar, oVar);
                        p019c5.a aVar5 = cVar.f10445b;
                        aVar5.c();
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) aVar5.f10438f).edit();
                        editorEdit.remove(strA4);
                        editorEdit.apply();
                        pVar.success(null);
                        return;
                    }
                    if (b7 != 5) {
                        pVar.notImplemented();
                        return;
                    }
                    p019c5.a aVar6 = cVar.f10445b;
                    aVar6.c();
                    SharedPreferences.Editor editorEdit2 = ((SharedPreferences) aVar6.f10438f).edit();
                    editorEdit2.clear();
                    if (!aVar6.k()) {
                        F0 f7 = (F0) aVar6.f10440h;
                        editorEdit2.putString("FlutterSecureSAlgorithmKey", ((p027d5.a) f7.f17381d).name());
                        editorEdit2.putString("FlutterSecureSAlgorithmStorage", ((p027d5.c) f7.f17382e).name());
                    }
                    editorEdit2.apply();
                    pVar.success(null);
                } catch (Exception e8) {
                    e7 = e8;
                    if (!z4) {
                        StringWriter stringWriter = new StringWriter();
                        e7.printStackTrace(new PrintWriter(stringWriter));
                        pVar.error("Exception encountered", oVar.f676a, stringWriter.toString());
                        return;
                    }
                    try {
                        p019c5.a aVar7 = cVar.f10445b;
                        aVar7.c();
                        SharedPreferences.Editor editorEdit3 = ((SharedPreferences) aVar7.f10438f).edit();
                        editorEdit3.clear();
                        if (!aVar7.k()) {
                            F0 f8 = (F0) aVar7.f10440h;
                            editorEdit3.putString("FlutterSecureSAlgorithmKey", ((p027d5.a) f8.f17381d).name());
                            editorEdit3.putString("FlutterSecureSAlgorithmStorage", ((p027d5.c) f8.f17382e).name());
                        }
                        editorEdit3.apply();
                        pVar.success("Data has been reset");
                    } catch (Exception e9) {
                        StringWriter stringWriter2 = new StringWriter();
                        e9.printStackTrace(new PrintWriter(stringWriter2));
                        pVar.error("Exception encountered", oVar.f676a, stringWriter2.toString());
                    }
                }
            } catch (FileNotFoundException e10) {
                Log.i("Creating sharedPrefs", e10.getLocalizedMessage());
            }
        } catch (Exception e11) {
            z4 = false;
            e7 = e11;
        }
    }

    private final void b() {
        p103o1.k kVar = (p103o1.k) this.f3288c;
        p031e1.m mVar = (p031e1.m) this.f3289d;
        try {
            ((p103o1.k) this.f3287b).get();
            p023d1.n.d().b(p031e1.m.f12556K, "Starting work for " + mVar.f12571e.f15224c, new Throwable[0]);
            I3.b bVarStartWork = mVar.f12572f.startWork();
            mVar.f12565I = bVarStartWork;
            kVar.k(bVarStartWork);
        } catch (Throwable th) {
            kVar.j(th);
        }
    }

    private final void c() {
        String str = (String) this.f3288c;
        p031e1.m mVar = (p031e1.m) this.f3289d;
        try {
            try {
                p023d1.m mVar2 = (p023d1.m) ((p103o1.k) this.f3287b).get();
                if (mVar2 == null) {
                    p023d1.n.d().c(p031e1.m.f12556K, mVar.f12571e.f15224c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                } else {
                    p023d1.n.d().b(p031e1.m.f12556K, String.format("%s returned a %s result.", mVar.f12571e.f15224c, mVar2), new Throwable[0]);
                    mVar.f12574y = mVar2;
                }
            } catch (InterruptedException e7) {
                e = e7;
                p023d1.n.d().c(p031e1.m.f12556K, str + " failed because it threw an exception/error", e);
            } catch (CancellationException e8) {
                p023d1.n.d().e(p031e1.m.f12556K, str + " was cancelled", e8);
            } catch (ExecutionException e9) {
                e = e9;
                p023d1.n.d().c(p031e1.m.f12556K, str + " failed because it threw an exception/error", e);
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
            p023d1.n.d().b(ConstraintProxyUpdateReceiver.f9878a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
            p096n1.f.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            p096n1.f.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            p096n1.f.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            p096n1.f.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            pendingResult.finish();
        }
    }

    private final void e() {
        p028d6.k kVar = (p028d6.k) this.f3289d;
        C0940m c0940m = (C0940m) kVar.f12447b;
        C0934g c0934g = (C0934g) kVar.f12448c;
        p120q4.j jVar = (p120q4.j) ((p120q4.e) this.f3288c).f15864b;
        s sVar = c0940m.f15455c;
        ArrayList arrayListL = c0934g.l();
        v4.r rVar = (v4.r) this.f3287b;
        Object objU = rVar.u(true);
        F0 f7 = new F0(c0940m, c0934g, (Iterable) rVar, (Object) jVar, 17);
        sVar.f14989G = true;
        if (sVar.a()) {
            sVar.n("o", arrayListL, objU, f7);
        } else {
            sVar.f15001m.add(new p083l4.n("o", arrayListL, objU, f7));
        }
        sVar.c();
    }

    private final void f() {
        synchronized (p064i5.k.f14061f) {
            p064i5.k.a((p064i5.k) this.f3289d, (p064i5.d) this.f3287b);
        }
        ((A5.p) this.f3288c).success(null);
    }

    private final void g() {
        p088m1.i iVarL = ((WorkDatabase) this.f3287b).n().l((String) this.f3288c);
        if (iVarL == null || !iVarL.b()) {
            return;
        }
        synchronized (((p080l1.a) this.f3289d).f14869c) {
            ((p080l1.a) this.f3289d).f14872f.put((String) this.f3288c, iVarL);
            ((p080l1.a) this.f3289d).f14873x.add(iVarL);
            p080l1.a aVar = (p080l1.a) this.f3289d;
            aVar.f14874y.b(aVar.f14873x);
        }
    }

    /* JADX WARN: Code duplicated, block: B:282:0x070f  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        boolean zAcceptThirdPartyCookies;
        X5.m mVar;
        X5.l lVar;
        Socket socketH;
        boolean z4;
        SSLSession session;
        Socket socket;
        int i7;
        C0165x c0165x;
        int i8;
        int i9;
        int i10;
        q qVar = this;
        Object obj = null;
        boolean zBooleanValue = true;
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
                    objCall = ((M.b) qVar.f3287b).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) qVar.f3289d).post(new y0(13, (M.c) qVar.f3288c, objCall));
                return;
            case 2:
                Q q7 = E2.o.f1952C.f1959e;
                C0375a c0375a = (C0375a) qVar.f3287b;
                Context context = c0375a.f5460a;
                CookieManager cookieManagerH = q7.h();
                boolean zAcceptThirdPartyCookies2 = cookieManagerH != null ? cookieManagerH.acceptThirdPartyCookies(c0375a.f5461b) : false;
                Bundle bundle = (Bundle) qVar.f3288c;
                bundle.putBoolean("accept_3p_cookie", zAcceptThirdPartyCookies2);
                R2.a.a(c0375a.f5460a, new p167y2.i((p167y2.h) new p167y2.h(6).a(bundle, AdMobAdapter.class)), (y) qVar.f3289d);
                return;
            case 3:
                Object obj2 = qVar.f3288c;
                boolean z7 = obj2 instanceof WebView;
                G g3 = (G) qVar.f3287b;
                if (z7) {
                    Context context2 = g3.f5425c;
                    CookieManager cookieManagerH2 = E2.o.f1952C.f1959e.h();
                    if (cookieManagerH2 == null) {
                        zAcceptThirdPartyCookies = false;
                    } else {
                        zAcceptThirdPartyCookies = cookieManagerH2.acceptThirdPartyCookies((WebView) obj2);
                    }
                } else {
                    zAcceptThirdPartyCookies = false;
                }
                HashMap map = g3.f5423a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                I i11 = (I) map.get(boolValueOf);
                Pair pair = (Pair) qVar.f3289d;
                if (i11 != null) {
                    E2.o.f1952C.j.getClass();
                    if (i11.f5436c > System.currentTimeMillis()) {
                        g3.d(i11, pair, true);
                        return;
                    }
                }
                HashMap map2 = g3.f5424b;
                List arrayList = (List) map2.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(boolValueOf, arrayList);
                }
                arrayList.add(pair);
                return;
            case 4:
                zzdqv zzdqvVar = (zzdqv) qVar.f3287b;
                ConcurrentHashMap concurrentHashMapZzc = zzdqvVar.zzc();
                String str = (String) qVar.f3288c;
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str)) {
                    concurrentHashMapZzc.put("action", str);
                }
                int i12 = 0;
                while (true) {
                    Pair[] pairArr = (Pair[]) qVar.f3289d;
                    if (i12 >= pairArr.length) {
                        zzdqvVar.zzg(concurrentHashMapZzc);
                        return;
                    }
                    Pair pair2 = pairArr[i12];
                    String str2 = (String) pair2.first;
                    String str3 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        concurrentHashMapZzc.put(str2, str3);
                    }
                    i12++;
                }
                break;
            case 5:
                new zzbtf((Context) qVar.f3287b, EnumC1058b.BANNER, ((p167y2.i) qVar.f3288c).f18160a, null).zzb((R2.b) qVar.f3289d);
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
                Q0 q1 = (Q0) qVar.f3289d;
                C c3 = q1.f6977u;
                t tVar = (t) qVar.f3287b;
                Executor executor = q1.f6967k;
                EnumC0446m enumC0446m = (EnumC0446m) qVar.f3288c;
                c3.getClass();
                p113p3.f.k(executor, "executor");
                p113p3.f.k(enumC0446m, "source");
                B b7 = new B(tVar, executor);
                if (((EnumC0446m) c3.f6749a) != enumC0446m) {
                    executor.execute(tVar);
                    return;
                } else {
                    ((ArrayList) c3.f6750b).add(b7);
                    return;
                }
            case 10:
                I0 i13 = (I0) qVar.f3289d;
                Q0 q8 = i13.f6823e;
                if (i13 != q8.f6930A) {
                    return;
                }
                L l7 = (L) qVar.f3287b;
                q8.f6931B = l7;
                q8.f6937H.i(l7);
                EnumC0446m enumC0446m2 = EnumC0446m.f6554e;
                EnumC0446m enumC0446m3 = (EnumC0446m) qVar.f3288c;
                if (enumC0446m3 != enumC0446m2) {
                    i13.f6823e.f6947R.m(2, "Entering {0} state with picker: {1}", enumC0446m3, l7);
                    i13.f6823e.f6977u.b(enumC0446m3);
                    return;
                }
                return;
            case 11:
                try {
                    ((CountDownLatch) qVar.f3287b).await();
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
                N6.i iVar = new N6.i(new X5.k());
                try {
                    try {
                        X5.m mVar2 = (X5.m) qVar.f3289d;
                        C0458z c0458z = mVar2.f7578N;
                        if (c0458z == null) {
                            socketH = mVar2.f7565A.createSocket(mVar2.f7580a.getAddress(), ((X5.m) qVar.f3289d).f7580a.getPort());
                        } else {
                            InetSocketAddress inetSocketAddress = c0458z.f6596a;
                            if (inetSocketAddress == null) {
                                throw new m0(l0.f6543m.g("Unsupported SocketAddress implementation " + ((X5.m) qVar.f3289d).f7578N.f6596a.getClass()));
                            }
                            socketH = X5.m.h(mVar2, c0458z.f6597b, inetSocketAddress, c0458z.f6598c, c0458z.f6599d);
                        }
                        X5.m mVar3 = (X5.m) qVar.f3289d;
                        SSLSocketFactory sSLSocketFactory = mVar3.f7566B;
                        if (sSLSocketFactory != null) {
                            String host = mVar3.f7581b;
                            URI uriA = AbstractC0494d0.a(host);
                            if (uriA.getHost() != null) {
                                host = uriA.getHost();
                            }
                            SSLSocket sSLSocketA = X5.s.a(sSLSocketFactory, socketH, host, ((X5.m) qVar.f3289d).l(), ((X5.m) qVar.f3289d).f7569E);
                            session = sSLSocketA.getSession();
                            z4 = true;
                            socket = sSLSocketA;
                        } else {
                            z4 = true;
                            session = null;
                            socket = socketH;
                        }
                        socket.setTcpNoDelay(z4);
                        N6.i iVar2 = new N6.i(Q0.a.Y(socket));
                        try {
                            ((X5.c) qVar.f3288c).a(Q0.a.W(socket), socket);
                            X5.m mVar4 = (X5.m) qVar.f3289d;
                            C0435b c0435b = mVar4.f7599u;
                            c0435b.getClass();
                            P2 p5 = new P2(c0435b);
                            p5.P(AbstractC0438e.f6489a, socket.getRemoteSocketAddress());
                            p5.P(AbstractC0438e.f6490b, socket.getLocalSocketAddress());
                            p5.P(AbstractC0438e.f6491c, session);
                            p5.P(Z1.f7103a, session == null ? i0.f6507a : i0.f6508b);
                            mVar4.f7599u = p5.b();
                            X5.m mVar5 = (X5.m) qVar.f3289d;
                            mVar5.f7586g.getClass();
                            mVar5.f7598t = new X5.l(mVar5, new Z5.g(iVar2));
                            synchronized (((X5.m) qVar.f3289d).f7589k) {
                                try {
                                    ((X5.m) qVar.f3289d).getClass();
                                    if (session != null) {
                                        X5.m mVar6 = (X5.m) qVar.f3289d;
                                        new C0443j(session);
                                        mVar6.getClass();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            return;
                        } catch (m0 e7) {
                            e = e7;
                            iVar = iVar2;
                            ((X5.m) qVar.f3289d).s(0, Z5.a.INTERNAL_ERROR, e.f6556a);
                            mVar = (X5.m) qVar.f3289d;
                            mVar.f7586g.getClass();
                            lVar = new X5.l(mVar, new Z5.g(iVar));
                            mVar.f7598t = lVar;
                            return;
                        } catch (Exception e8) {
                            e = e8;
                            iVar = iVar2;
                            ((X5.m) qVar.f3289d).p(e);
                            mVar = (X5.m) qVar.f3289d;
                            mVar.f7586g.getClass();
                            lVar = new X5.l(mVar, new Z5.g(iVar));
                            mVar.f7598t = lVar;
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = iVar2;
                            X5.m mVar7 = (X5.m) qVar.f3289d;
                            mVar7.f7586g.getClass();
                            mVar7.f7598t = new X5.l(mVar7, new Z5.g(iVar));
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (m0 e9) {
                    e = e9;
                } catch (Exception e10) {
                    e = e10;
                }
                break;
            case 12:
                a();
                return;
            case 13:
                Z z8 = (Z) qVar.f3289d;
                int i14 = z8.f11158b;
                LifecycleCallback lifecycleCallback = (LifecycleCallback) qVar.f3287b;
                if (i14 > 0) {
                    Bundle bundle2 = z8.f11159c;
                    lifecycleCallback.onCreate(bundle2 != null ? bundle2.getBundle((String) qVar.f3288c) : null);
                }
                if (z8.f11158b >= 2) {
                    lifecycleCallback.onStart();
                }
                if (z8.f11158b >= 3) {
                    lifecycleCallback.onResume();
                }
                if (z8.f11158b >= 4) {
                    lifecycleCallback.onStop();
                }
                if (z8.f11158b >= 5) {
                    lifecycleCallback.onDestroy();
                    return;
                }
                return;
            case 14:
                a0 a0Var = (a0) qVar.f3289d;
                int i15 = a0Var.f11166k0;
                LifecycleCallback lifecycleCallback2 = (LifecycleCallback) qVar.f3287b;
                if (i15 > 0) {
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
                p028d6.t tVar2 = (p028d6.t) qVar.f3289d;
                tVar2.f12485l = Long.valueOf(tVar2.f12483i.d());
                for (p028d6.l lVar2 : ((HashMap) ((p028d6.t) qVar.f3289d).f12480f.f12456b).values()) {
                    p028d6.k kVar = lVar2.f12451c;
                    ((AtomicLong) kVar.f12447b).set(0L);
                    ((AtomicLong) kVar.f12448c).set(0L);
                    p028d6.k kVar2 = lVar2.f12450b;
                    lVar2.f12450b = lVar2.f12451c;
                    lVar2.f12451c = kVar2;
                }
                p028d6.o oVar = (p028d6.o) qVar.f3287b;
                AbstractC0438e abstractC0438e = (AbstractC0438e) qVar.f3288c;
                C0165x c0165x2 = AbstractC0167z.f2083b;
                C0164w c0164w = new C0164w();
                if (oVar.f12464e != null) {
                    c0164w.b(new p028d6.n(oVar, abstractC0438e, 1));
                }
                if (oVar.f12465f != null) {
                    i7 = 0;
                    c0164w.b(new p028d6.n(oVar, abstractC0438e, 0));
                } else {
                    i7 = 0;
                }
                C0165x c0165xListIterator = c0164w.d().listIterator(i7);
                while (c0165xListIterator.hasNext()) {
                    p028d6.n nVar = (p028d6.n) c0165xListIterator.next();
                    p028d6.t tVar3 = (p028d6.t) qVar.f3289d;
                    p028d6.m mVar8 = tVar3.f12480f;
                    long jLongValue = tVar3.f12485l.longValue();
                    switch (nVar.f12457a) {
                        case 0:
                            c0165x = c0165xListIterator;
                            p028d6.o oVar2 = nVar.f12458b;
                            ArrayList<p028d6.l> arrayListH = p028d6.t.h(mVar8, ((Integer) oVar2.f12465f.f14683d).intValue());
                            int size = arrayListH.size();
                            p072k1.g gVar = oVar2.f12465f;
                            if (size >= ((Integer) gVar.f14682c).intValue() && arrayListH.size() != 0) {
                                for (p028d6.l lVar3 : arrayListH) {
                                    if (mVar8.d() >= oVar2.f12463d.intValue()) {
                                        break;
                                    } else if (lVar3.c() >= ((Integer) gVar.f14683d).intValue()) {
                                        if (((AtomicLong) lVar3.f12451c.f12448c).get() / lVar3.c() > ((double) ((Integer) gVar.f14680a).intValue()) / 100.0d) {
                                            nVar.f12459c.m(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", lVar3, Double.valueOf(((AtomicLong) lVar3.f12451c.f12448c).get() / lVar3.c()));
                                            if (new Random().nextInt(100) < ((Integer) gVar.f14681b).intValue()) {
                                                lVar3.b(jLongValue);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            p028d6.o oVar3 = nVar.f12458b;
                            ArrayList<p028d6.l> arrayListH2 = p028d6.t.h(mVar8, ((Integer) oVar3.f12464e.f17382e).intValue());
                            int size2 = arrayListH2.size();
                            F0 f7 = oVar3.f12464e;
                            if (size2 >= ((Integer) f7.f17381d).intValue() && arrayListH2.size() != 0) {
                                ArrayList arrayList2 = new ArrayList();
                                for (p028d6.l lVar4 : arrayListH2) {
                                    arrayList2.add(Double.valueOf(((AtomicLong) lVar4.f12451c.f12447b).get() / lVar4.c()));
                                    mVar8 = mVar8;
                                }
                                p028d6.m mVar9 = mVar8;
                                Iterator it = arrayList2.iterator();
                                double d7 = 0.0d;
                                double dDoubleValue = 0.0d;
                                while (it.hasNext()) {
                                    dDoubleValue = ((Double) it.next()).doubleValue() + dDoubleValue;
                                }
                                double size3 = dDoubleValue / ((double) arrayList2.size());
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    double dDoubleValue2 = ((Double) it2.next()).doubleValue() - size3;
                                    d7 = (dDoubleValue2 * dDoubleValue2) + d7;
                                }
                                double dSqrt = Math.sqrt(d7 / ((double) arrayList2.size()));
                                double dIntValue = size3 - (((double) (((Integer) f7.f17379b).intValue() / 1000.0f)) * dSqrt);
                                Iterator it3 = arrayListH2.iterator();
                                while (it3.hasNext()) {
                                    p028d6.l lVar5 = (p028d6.l) it3.next();
                                    Iterator it4 = it3;
                                    if (mVar9.d() < oVar3.f12463d.intValue()) {
                                        C0165x c0165x3 = c0165xListIterator;
                                        if (((AtomicLong) lVar5.f12451c.f12447b).get() / lVar5.c() < dIntValue) {
                                            nVar.f12459c.m(1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", lVar5, Double.valueOf(((AtomicLong) lVar5.f12451c.f12447b).get() / lVar5.c()), Double.valueOf(size3), Double.valueOf(dSqrt), Double.valueOf(dIntValue));
                                            if (new Random().nextInt(100) < ((Integer) f7.f17380c).intValue()) {
                                                lVar5.b(jLongValue);
                                            }
                                        }
                                        c0165xListIterator = c0165x3;
                                        it3 = it4;
                                    }
                                }
                            }
                            c0165x = c0165xListIterator;
                            break;
                    }
                    qVar = this;
                    c0165xListIterator = c0165x;
                }
                p028d6.t tVar4 = (p028d6.t) qVar.f3289d;
                p028d6.m mVar10 = tVar4.f12480f;
                Long l8 = tVar4.f12485l;
                for (p028d6.l lVar6 : ((HashMap) mVar10.f12456b).values()) {
                    if (!lVar6.d()) {
                        int i16 = lVar6.f12453e;
                        lVar6.f12453e = i16 == 0 ? 0 : i16 - 1;
                    }
                    if (lVar6.d()) {
                        if (l8.longValue() > Math.min(lVar6.f12449a.f12461b.longValue() * ((long) lVar6.f12453e), Math.max(lVar6.f12449a.f12461b.longValue(), lVar6.f12449a.f12462c.longValue())) + lVar6.f12452d.longValue()) {
                            lVar6.e();
                        }
                    }
                }
                return;
            case 16:
                try {
                    zBooleanValue = ((Boolean) ((p103o1.k) qVar.f3289d).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused3) {
                }
                ((p031e1.b) qVar.f3287b).b((String) qVar.f3288c, zBooleanValue);
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
                ((p031e1.l) qVar.f3287b).f12555z.g((String) qVar.f3288c, (android.support.v4.media.session.t) qVar.f3289d);
                return;
            default:
                I4.j jVar = (I4.j) qVar.f3289d;
                Iterator it5 = ((p122r.i) ((p117q0.s) jVar.f3681e).f15787e.keySet()).iterator();
                while (true) {
                    p122r.h hVar = (p122r.h) it5;
                    if (!hVar.hasNext()) {
                        return;
                    }
                    IBinder iBinder = (IBinder) hVar.next();
                    p117q0.s sVar = (p117q0.s) jVar.f3681e;
                    p117q0.h hVar2 = (p117q0.h) sVar.f15787e.getOrDefault(iBinder, obj);
                    HashMap map3 = hVar2.f15749e;
                    String str4 = (String) qVar.f3288c;
                    List<O.b> list = (List) map3.get(str4);
                    if (list != null) {
                        for (O.b bVar : list) {
                            Bundle bundle4 = (Bundle) bVar.f4825b;
                            Bundle bundle5 = (Bundle) qVar.f3287b;
                            int i17 = bundle5 == null ? -1 : bundle5.getInt("android.media.browse.extra.PAGE", -1);
                            int i18 = bundle4 == null ? -1 : bundle4.getInt("android.media.browse.extra.PAGE", -1);
                            int i19 = bundle5 == null ? -1 : bundle5.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            int i20 = bundle4 == null ? -1 : bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            int i21 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                            if (i17 == -1 || i19 == -1) {
                                i8 = Integer.MAX_VALUE;
                                i9 = 0;
                            } else {
                                i9 = i17 * i19;
                                i8 = (i19 + i9) - 1;
                            }
                            if (i18 == -1 || i20 == -1) {
                                i10 = 0;
                            } else {
                                int i22 = i20 * i18;
                                i21 = (i20 + i22) - 1;
                                i10 = i22;
                            }
                            if (i8 >= i10 && i21 >= i9) {
                                sVar.e(str4, hVar2, (Bundle) bVar.f4825b, bundle5);
                            }
                        }
                    }
                    obj = null;
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
