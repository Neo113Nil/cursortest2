package v1;

import A5.f;
import A5.o;
import A5.p;
import A5.q;
import A5.s;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.flurry.android.marketing.FlurryMarketingModule;
import com.flurry.android.marketing.FlurryMarketingOptions;
import com.google.android.gms.common.internal.C0859k;
import io.sentry.clientreport.DiscardedEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.C1450e;
import u1.C1620a;
import u1.h;
import u1.j;
import u1.k;
import w1.AbstractC1706i0;
import w1.AbstractC1707i1;
import w1.C1677b;
import w1.C1681c;
import w1.C1685d;
import w1.C1697g;
import w1.C1701h;
import w1.C1709j;
import w1.C1713k;
import w1.C1717l;
import w1.C1718l0;
import w1.C1720l2;
import w1.C1721m;
import w1.C1722m0;
import w1.C1725n;
import w1.C1726n0;
import w1.C1729o;
import w1.C1733p;
import w1.C1737q;
import w1.C1755w0;
import w1.C1759x1;
import w1.H2;
import w1.K0;
import w1.L;
import w1.T;
import w1.T0;
import w1.W0;
import w1.r;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* loaded from: classes.dex */
public class e implements InterfaceC1783c, q, InterfaceC1789a {

    /* renamed from: f, reason: collision with root package name */
    public static C1620a f17075f;

    /* renamed from: x, reason: collision with root package name */
    public static C1450e f17076x;

    /* renamed from: y, reason: collision with root package name */
    public static j f17077y;

    /* renamed from: z, reason: collision with root package name */
    public static d f17078z;

    /* renamed from: a, reason: collision with root package name */
    public Context f17079a;

    /* renamed from: b, reason: collision with root package name */
    public s f17080b;

    /* renamed from: c, reason: collision with root package name */
    public A5.j f17081c;

    /* renamed from: d, reason: collision with root package name */
    public A5.j f17082d;

    /* renamed from: e, reason: collision with root package name */
    public A5.j f17083e;

    public static void b(String str, Map map) {
        if (u1.b.a()) {
            r.i().h(str, 2, map, true, false, null);
        }
    }

    public static void c() {
        C1620a c1620a = new C1620a();
        c1620a.f16536a = false;
        c1620a.f16537b = 5;
        c1620a.f16538c = 10000L;
        c1620a.f16539d = true;
        c1620a.f16540e = true;
        c1620a.f16541f = false;
        c1620a.f16542g = false;
        c1620a.f16543h = 0;
        c1620a.f16544i = new ArrayList();
        c1620a.f16545k = false;
        f17075f = c1620a;
        c1620a.f16546l = true;
        c1620a.f16541f = true;
    }

    public static void d(String str) {
        if (u1.b.a()) {
            if (TextUtils.isEmpty(str)) {
                AbstractC1706i0.q("Crash breadcrumb cannot be empty.");
                return;
            }
            r i7 = r.i();
            if (r.f17840z.get()) {
                i7.d(new C1697g(str, 0));
            } else {
                AbstractC1706i0.o(2, "Invalid call to logBreadcrumb. Flurry is not initialized");
            }
        }
    }

    public static void f(String str) {
        long parseLong = Long.parseLong(str);
        C1620a c1620a = f17075f;
        if (parseLong >= 5000) {
            c1620a.f16538c = parseLong;
        } else {
            c1620a.getClass();
        }
    }

    public final void a(String str) {
        C1720l2 c1720l2;
        r i7 = r.i();
        i7.getClass();
        if (r.f17840z.get()) {
            i7.d(new C1737q("flutter-flurry-sdk", "3.3.0", (Map) null));
        } else {
            AbstractC1706i0.o(2, "Invalid call to addOrigin. Flurry is not initialized");
        }
        C1620a c1620a = f17075f;
        Context context = this.f17079a;
        c1620a.getClass();
        if (u1.b.a()) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("API key not specified");
            }
            AbstractC1707i1.f17743c = context.getApplicationContext();
            C0859k.a().f11318c = str;
            r i8 = r.i();
            boolean z4 = c1620a.f16536a;
            int i9 = c1620a.f16537b;
            long j = c1620a.f16538c;
            boolean z7 = c1620a.f16539d;
            boolean z8 = c1620a.f16540e;
            boolean z9 = c1620a.f16541f;
            boolean z10 = c1620a.f16542g;
            int i10 = c1620a.f16543h;
            ArrayList arrayList = c1620a.f16544i;
            u1.d dVar = c1620a.j;
            boolean z11 = c1620a.f16545k;
            boolean z12 = c1620a.f16546l;
            AtomicBoolean atomicBoolean = r.f17840z;
            if (atomicBoolean.get()) {
                AbstractC1706i0.o(2, "Invalid call to Init. Flurry is already initialized");
                return;
            }
            AbstractC1706i0.o(2, "Initializing Flurry SDK");
            if (atomicBoolean.get()) {
                AbstractC1706i0.o(2, "Overridden call to register. Flurry is already initialized");
            }
            i8.getClass();
            C1759x1.z();
            i8.d(new com.flurry.android.marketing.messaging.notification.b(2, context, arrayList, false));
            synchronized (C1720l2.class) {
                try {
                    if (C1720l2.f17772p == null) {
                        C1720l2.f17772p = new C1720l2();
                    }
                    c1720l2 = C1720l2.f17772p;
                } catch (Throwable th) {
                    throw th;
                }
            }
            H2 a2 = H2.a();
            if (a2 != null) {
                a2.f17397a.i(c1720l2.f17779g);
                a2.f17398b.i(c1720l2.f17780h);
                a2.f17399c.i(c1720l2.f17777e);
                a2.f17400d.i(c1720l2.f17778f);
                a2.f17401e.i(c1720l2.f17782k);
                a2.f17402f.i(c1720l2.f17775c);
                a2.f17403g.i(c1720l2.f17776d);
                a2.f17404h.i(c1720l2.j);
                a2.f17405i.i(c1720l2.f17773a);
                a2.j.i(c1720l2.f17781i);
                a2.f17406k.i(c1720l2.f17774b);
                a2.f17407l.i(c1720l2.f17783l);
                a2.f17409n.i(c1720l2.f17784m);
                a2.f17410o.i(c1720l2.f17785n);
                a2.f17411p.i(c1720l2.f17786o);
            }
            C0859k a4 = C0859k.a();
            if (TextUtils.isEmpty(a4.f11317b)) {
                a4.f11317b = a4.f11318c;
            }
            H2.a().f17405i.k();
            T t7 = H2.a().f17397a;
            t7.f17532A = z9;
            if (!z9) {
                AbstractC1706i0.o(5, "Location analytics report is disabled, please enable it to improve your Flurry analytics metrics.");
            }
            t7.d(new C1717l(t7, 2));
            H2.a().f17402f.f17860B = z7;
            if (dVar != null) {
                H2.a().f17407l.h(dVar);
            }
            if (z4) {
                AbstractC1706i0.f17738f = false;
            } else {
                AbstractC1706i0.f17738f = true;
            }
            AbstractC1706i0.f17739g = i9;
            i8.d(new C1681c(j, 0));
            i8.d(new C1733p(z8, z10));
            i8.d(new C1713k(i10, context));
            i8.d(new C1725n(z11, 1));
            atomicBoolean.set(true);
            if (z12) {
                AbstractC1706i0.o(2, "Force start session");
                if (context.getApplicationContext() instanceof Activity) {
                    AbstractC1706i0.o(3, "Activity's session is controlled by Flurry SDK");
                } else if (atomicBoolean.get()) {
                    i8.d(new C1729o(1));
                } else {
                    AbstractC1706i0.o(2, "Invalid call to onStartSession. Flurry is not initialized");
                }
            }
        }
    }

    public final void e() {
        if (!AbstractC1706i0.k(16)) {
            AbstractC1706i0.q(String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
            return;
        }
        T0 a2 = T0.a();
        if (!a2.f17542f || a2.f17545i) {
            return;
        }
        a2.f17545i = true;
        a2.b(AbstractC1707i1.f17743c, "fl.fully.drawn.time", "fl.fully.drawn.runtime.memory", "fl.fully.drawn.system.memory");
        if (a2.f17544h) {
            a2.c();
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        this.f17079a = c1782b.f18075a;
        f fVar = c1782b.f18077c;
        s sVar = new s(fVar, "flurry_flutter_plugin");
        this.f17080b = sVar;
        sVar.b(this);
        A5.j jVar = new A5.j(fVar, "flurry_flutter_plugin_event_config");
        this.f17081c = jVar;
        jVar.a(new b(0));
        A5.j jVar2 = new A5.j(fVar, "flurry_flutter_plugin_event_messaging");
        this.f17082d = jVar2;
        jVar2.a(new b(1));
        A5.j jVar3 = new A5.j(fVar, "flurry_flutter_plugin_event_ps");
        this.f17083e = jVar3;
        jVar3.a(new b(2));
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f17080b.b(null);
        this.f17081c.a(null);
        this.f17082d.a(null);
        this.f17083e.a(null);
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, A5.r rVar) {
        String str;
        int i7;
        int i8;
        StackTraceElement[] stackTraceElementArr;
        String str2 = oVar.f676a;
        str2.getClass();
        str = null;
        i8 = 0;
        switch (str2) {
            case "endTimedEventWithParameters":
                b((String) oVar.a("eventId"), (Map) oVar.a("parameters"));
                return;
            case "initializeFlurryBuilder":
                c();
                return;
            case "withContinueSessionMillis":
                f((String) oVar.a("sessionMillisStr"));
                return;
            case "reportFullyDrawn":
                e();
                return;
            case "logTimedEventId":
                String str3 = (String) oVar.a("eventId");
                String str4 = (String) oVar.a("timedId");
                if (u1.b.a()) {
                    r i9 = r.i();
                    i9.getClass();
                    i7 = i9.h(str3, 2, Collections.emptyMap(), true, true, str4);
                }
                ((p) rVar).success(Integer.valueOf(t.e.e(i7)));
                return;
            case "activateConfig":
                u1.c g3 = u1.c.g();
                g3.getClass();
                if (r.f17840z.get()) {
                    ((C1755w0) g3.f16591b).k(null);
                    return;
                } else {
                    AbstractC1706i0.q("Flurry SDK must be initialized before activating config");
                    return;
                }
            case "logBreadcrumb":
                d((String) oVar.a("crashBreadcrumb"));
                return;
            case "setVersionName":
                String str5 = (String) oVar.a("versionName");
                if (u1.b.a()) {
                    r i10 = r.i();
                    if (r.f17840z.get()) {
                        i10.d(new C1697g(str5, 4));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setVersionName. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withAppVersion":
                Log.w("FlurryFlutterPlugin", "iOS only. For Android, please also call Flurry.setVersionName().");
                return;
            case "logTimedEvent":
                ((p) rVar).success(Integer.valueOf(t.e.e(u1.b.a() ? r.i().h((String) oVar.a("eventId"), 2, Collections.emptyMap(), ((Boolean) oVar.a("timed")).booleanValue(), true, null) : 1)));
                return;
            case "registerConfigListener":
            case "setMessagingListener":
            case "registerPublisherDataListener":
                return;
            case "buildFlurryBuilder":
                a((String) oVar.a("apiKey"));
                return;
            case "fetchPublisherData":
                k.b();
                return;
            case "logTimedEventWithParameters":
                String str6 = (String) oVar.a("eventId");
                Map map = (Map) oVar.a("parameters");
                boolean booleanValue = ((Boolean) oVar.a("timed")).booleanValue();
                if (u1.b.a()) {
                    if (str6 == null) {
                        AbstractC1706i0.q("String eventId passed to logEvent was null.");
                    } else {
                        if (map == null) {
                            AbstractC1706i0.o(4, "String parameters passed to logEvent was null.");
                        }
                        i7 = r.i().h(str6, 2, map, booleanValue, true, null);
                    }
                }
                ((p) rVar).success(Integer.valueOf(t.e.e(i7)));
                return;
            case "setIAPReportingEnabled":
                Log.w("FlurryFlutterPlugin", "setIAPReportingEnabled is not supported on Android. Please use LogPayment instead.");
                return;
            case "onError":
                u1.b.b((String) oVar.a("errorId"), (String) oVar.a("message"), (String) oVar.a("errorClass"));
                return;
            case "logResourceLogger":
                String str7 = (String) oVar.a("id");
                C1450e c1450e = f17076x;
                if (c1450e != null) {
                    AbstractC1706i0.f();
                    if ((AbstractC1706i0.f17736d & 4) == 4) {
                        AbstractC1706i0.f();
                        if ((AbstractC1706i0.f17736d & 4) == 4) {
                            long nanoTime = System.nanoTime();
                            W0 w02 = (W0) c1450e.f15308b;
                            HashMap m7 = e1.k.m("fl.id", str7);
                            m7.put("fl.resource.time", Long.toString((long) ((nanoTime - w02.f17568a) / 1000000.0d)));
                            Runtime runtime = Runtime.getRuntime();
                            long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) - w02.f17569b;
                            if (freeMemory < 0) {
                                freeMemory = 0;
                            }
                            m7.put("fl.resource.runtime.memory", Long.toString(freeMemory));
                            Context context = AbstractC1707i1.f17743c;
                            if (context != null) {
                                ActivityManager.MemoryInfo a2 = AbstractC1706i0.a(context);
                                long j = (a2.totalMem - a2.availMem) - w02.f17570c;
                                m7.put("fl.resource.system.memory", Long.toString(j >= 0 ? j : 0L));
                            }
                            AbstractC1706i0.o(4, "Logging parameters: ".concat(String.valueOf(m7)));
                            r.i().j("Flurry.ResourceLog", 6, m7);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case "setCrashReporting":
                boolean booleanValue2 = ((Boolean) oVar.a("crashReporting")).booleanValue();
                if (u1.b.a()) {
                    r i11 = r.i();
                    if (r.f17840z.get()) {
                        i11.d(new C1725n(booleanValue2, 2));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setCaptureUncaughtExceptions. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withSslPinningEnabled":
                f17075f.f16542g = ((Boolean) oVar.a("sslPinningEnabled")).booleanValue();
                return;
            case "logStandardEvent":
                int intValue = ((Integer) oVar.a("id")).intValue();
                Map map2 = (Map) oVar.a("flurryParam");
                Map map3 = (Map) oVar.a("userParam");
                if (intValue >= 0) {
                    h[] hVarArr = a.f17069a;
                    if (intValue < hVarArr.length) {
                        h hVar = hVarArr[intValue];
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            int intValue2 = ((Integer) entry.getKey()).intValue();
                            if (intValue2 >= 0) {
                                Object[] objArr = a.f17070b;
                                if (intValue2 < objArr.length) {
                                    hashMap.put(objArr[intValue2], (String) entry.getValue());
                                }
                            }
                            L.k(intValue2, "Standard event parameter ID is out of range: ", "FlurryFlutterPlugin");
                        }
                        for (Map.Entry entry2 : map3.entrySet()) {
                            hashMap.put(entry2.getKey(), (String) entry2.getValue());
                        }
                        if (u1.b.a()) {
                            if (hVar == null) {
                                AbstractC1706i0.q("Event passed to logEvent was null.");
                            } else {
                                r i12 = r.i();
                                if (r.f17840z.get()) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    HashMap hashMap2 = new HashMap();
                                    HashSet hashSet = new HashSet(Arrays.asList(hVar.f16699b));
                                    HashSet hashSet2 = new HashSet(Arrays.asList(hVar.f16700c));
                                    for (Map.Entry entry3 : hashMap.entrySet()) {
                                        Object key = entry3.getKey();
                                        if (key instanceof u1.e) {
                                            u1.e eVar = (u1.e) key;
                                            if (hashSet.contains(eVar)) {
                                                hashSet.remove(eVar);
                                            } else if (hashSet2.contains(eVar)) {
                                                hashSet2.remove(eVar);
                                            } else {
                                                AbstractC1706i0.o(5, "Log " + hVar.toString() + " event - not a mandatory nor recommended parameter: " + eVar);
                                            }
                                            hashMap2.put(eVar.f16593a, (String) entry3.getValue());
                                        } else if (key instanceof String) {
                                            hashMap2.put((String) key, (String) entry3.getValue());
                                        }
                                    }
                                    int i13 = hashMap2.size() <= 10 ? 2 : 4;
                                    if (!hashSet.isEmpty()) {
                                        AbstractC1706i0.q("Log " + hVar.toString() + " event - Missing mandatory parameters: " + hashSet);
                                        i13 = 8;
                                    }
                                    if (!hashSet2.isEmpty()) {
                                        AbstractC1706i0.o(5, "Log " + hVar.toString() + " event - Missing recommended parameters: " + hashSet2);
                                    }
                                    i12.d(new C1677b(hVar, hashMap2, currentTimeMillis, elapsedRealtime));
                                    i7 = i13;
                                } else {
                                    AbstractC1706i0.o(2, "Invalid call to logEvent. Flurry is not initialized");
                                }
                            }
                        }
                        i8 = t.e.e(i7);
                        ((p) rVar).success(Integer.valueOf(i8));
                        return;
                    }
                }
                L.k(intValue, "Standard event ID is out of range: ", "FlurryFlutterPlugin");
                ((p) rVar).success(Integer.valueOf(i8));
                return;
            case "logTimedEventIdWithParameters":
                String str8 = (String) oVar.a("eventId");
                Map map4 = (Map) oVar.a("parameters");
                String str9 = (String) oVar.a("timedId");
                if (u1.b.a()) {
                    if (str8 == null) {
                        AbstractC1706i0.q("String eventId passed to logEvent was null.");
                    } else {
                        if (map4 == null) {
                            AbstractC1706i0.o(4, "String parameters passed to logEvent was null.");
                        }
                        i7 = r.i().h(str8, 2, map4, true, true, str9);
                    }
                }
                ((p) rVar).success(Integer.valueOf(t.e.e(i7)));
                return;
            case "setReportLocation":
                boolean booleanValue3 = ((Boolean) oVar.a("reportLocation")).booleanValue();
                if (u1.b.a()) {
                    r i14 = r.i();
                    if (r.f17840z.get()) {
                        i14.d(new C1725n(booleanValue3, 5));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setReportLocation. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withIncludeBackgroundSessionsInMetrics":
                f17075f.f16540e = ((Boolean) oVar.a("includeBackgroundSessionsInMetrics")).booleanValue();
                return;
            case "willHandleMessage":
                boolean booleanValue4 = ((Boolean) oVar.a("willHandle")).booleanValue();
                synchronized (C1722m0.f17791c) {
                    C1722m0.f17792d = booleanValue4;
                    C1722m0.f17793e = true;
                    C1722m0.f17791c.notifyAll();
                }
                return;
            case "setAge":
                int parseInt = Integer.parseInt((String) oVar.a("ageStr"));
                if (u1.b.a()) {
                    r i15 = r.i();
                    if (r.f17840z.get()) {
                        i15.d(new C1701h(parseInt));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setAge. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "getAgentVersion":
                r.i();
                C1726n0.a();
                ((p) rVar).success(345);
                return;
            case "onErrorWithParameters":
                String str10 = (String) oVar.a("errorId");
                String str11 = (String) oVar.a("message");
                String str12 = (String) oVar.a("errorClass");
                Map map5 = (Map) oVar.a("parameters");
                if (u1.b.a()) {
                    if (TextUtils.isEmpty(str10)) {
                        AbstractC1706i0.q("String errorId passed to onError was empty.");
                        return;
                    }
                    if (TextUtils.isEmpty(str11)) {
                        AbstractC1706i0.q("String message passed to onError was empty.");
                        return;
                    }
                    if (TextUtils.isEmpty(str12)) {
                        AbstractC1706i0.q("String errorClass passed to onError was empty.");
                        return;
                    }
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    if (stackTrace == null || stackTrace.length <= 4) {
                        stackTraceElementArr = stackTrace;
                    } else {
                        int length = stackTrace.length - 4;
                        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[length];
                        System.arraycopy(stackTrace, 4, stackTraceElementArr2, 0, length);
                        stackTraceElementArr = stackTraceElementArr2;
                    }
                    r.i().k(str10, str11, str12, map5, stackTraceElementArr);
                    return;
                }
                return;
            case "setDataSaleOptOut":
                boolean booleanValue5 = ((Boolean) oVar.a("isOptOut")).booleanValue();
                if (u1.b.a()) {
                    r i16 = r.i();
                    if (r.f17840z.get()) {
                        i16.d(new C1725n(booleanValue5, 0));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setDataSaleOptOut. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withMessaging":
                Log.i("FlurryFlutterPlugin", "To customize Flurry Push for Android, please duplicate Builder setup in your FlutterApplication class.");
                C1722m0 c1722m0 = new C1722m0(25);
                FlurryMarketingOptions.Builder builder = new FlurryMarketingOptions.Builder().setupMessagingWithAutoIntegration();
                HandlerThread handlerThread = new HandlerThread("FlurryHandlerThread");
                handlerThread.start();
                FlurryMarketingModule flurryMarketingModule = new FlurryMarketingModule(builder.withFlurryMessagingListener(c1722m0, new Handler(handlerThread.getLooper())).build());
                C1620a c1620a = f17075f;
                c1620a.getClass();
                if (!K0.f17431d.contains(FlurryMarketingModule.class.getCanonicalName())) {
                    throw new IllegalArgumentException(e1.k.h(new StringBuilder("The Flurry module you have registered is invalid: "), FlurryMarketingModule.class));
                }
                c1620a.f16544i.add(flurryMarketingModule);
                return;
            case "openPrivacyDashboard":
                Context context2 = this.f17079a;
                if (context2 == null) {
                    Log.w("FlurryFlutterPlugin", "Application Context is not available to open Privacy Dashboard.");
                    return;
                }
                I4.j jVar = new I4.j(context2, new C1718l0(25));
                if (u1.b.a()) {
                    r.i().d(new C1717l(jVar, 0));
                    return;
                }
                return;
            case "startResourceLogger":
                C1450e c1450e2 = new C1450e(21);
                AbstractC1706i0.f();
                W0 w03 = new W0();
                w03.f17568a = System.nanoTime();
                Runtime runtime2 = Runtime.getRuntime();
                w03.f17569b = runtime2.totalMemory() - runtime2.freeMemory();
                Context context3 = AbstractC1707i1.f17743c;
                if (context3 != null) {
                    ActivityManager.MemoryInfo a4 = AbstractC1706i0.a(context3);
                    w03.f17570c = a4.totalMem - a4.availMem;
                }
                c1450e2.f15308b = w03;
                f17076x = c1450e2;
                return;
            case "setContinueSessionMillis":
                long parseLong = Long.parseLong((String) oVar.a("sessionMillisStr"));
                if (u1.b.a()) {
                    if (parseLong < 5000) {
                        parseLong = 5000;
                    }
                    r i17 = r.i();
                    if (r.f17840z.get()) {
                        i17.d(new C1681c(parseLong, 1));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setContinueSessionMillis. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withCrashReporting":
                f17075f.f16539d = ((Boolean) oVar.a("crashReporting")).booleanValue();
                return;
            case "setLogLevel":
                int parseInt2 = Integer.parseInt((String) oVar.a("logLevelStr"));
                if (u1.b.a()) {
                    r.i();
                    if (r.f17840z.get()) {
                        AbstractC1706i0.f17739g = parseInt2;
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setLogLevel. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "flagUserProperty":
                String str13 = (String) oVar.a("propertyName");
                if (u1.b.a()) {
                    r i18 = r.i();
                    if (r.f17840z.get()) {
                        i18.d(new C1697g(str13, 3));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to UserProperties.flag. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "addOrigin":
                String str14 = (String) oVar.a("originName");
                String str15 = (String) oVar.a("originVersion");
                r i19 = r.i();
                i19.getClass();
                if (r.f17840z.get()) {
                    i19.d(new C1737q(str14, str15, (Map) null));
                    return;
                } else {
                    AbstractC1706i0.o(2, "Invalid call to addOrigin. Flurry is not initialized");
                    return;
                }
            case "withReportLocation":
                f17075f.f16541f = ((Boolean) oVar.a("reportLocation")).booleanValue();
                return;
            case "endTimedEventIdWithParameters":
                String str16 = (String) oVar.a("eventId");
                Map map6 = (Map) oVar.a("parameters");
                String str17 = (String) oVar.a("timedId");
                if (u1.b.a()) {
                    r.i().h(str16, 2, map6, true, false, str17);
                    return;
                }
                return;
            case "addUserPropertyValue":
                String str18 = (String) oVar.a("propertyName");
                String str19 = (String) oVar.a("propertyValue");
                if (u1.b.a()) {
                    r i20 = r.i();
                    if (r.f17840z.get()) {
                        i20.d(new C1709j(3, str18, str19));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to UserProperties.add. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "addOriginWithParameters":
                String str20 = (String) oVar.a("originName");
                String str21 = (String) oVar.a("originVersion");
                Map map7 = (Map) oVar.a("originParameters");
                if (u1.b.a()) {
                    r i21 = r.i();
                    i21.getClass();
                    if (r.f17840z.get()) {
                        i21.d(new C1737q(str20, str21, map7));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to addOrigin. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "removeUserPropertyValues":
                String str22 = (String) oVar.a("propertyName");
                List list = (List) oVar.a("propertyValues");
                if (u1.b.a()) {
                    r i22 = r.i();
                    if (r.f17840z.get()) {
                        i22.d(new C1721m(str22, list, 2));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to UserProperties.remove. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "fetchConfig":
                u1.c g7 = u1.c.g();
                g7.getClass();
                if (r.f17840z.get()) {
                    ((C1755w0) g7.f16591b).m();
                    return;
                } else {
                    AbstractC1706i0.q("Flurry SDK must be initialized before fetching config");
                    return;
                }
            case "logEventWithParameters":
                String str23 = (String) oVar.a("eventId");
                Map map8 = (Map) oVar.a("parameters");
                if (u1.b.a()) {
                    if (str23 == null) {
                        AbstractC1706i0.q("String eventId passed to logEvent was null.");
                    } else {
                        if (map8 == null) {
                            AbstractC1706i0.o(4, "String parameters passed to logEvent was null.");
                        }
                        i7 = r.i().h(str23, 2, map8, false, false, null);
                    }
                }
                ((p) rVar).success(Integer.valueOf(t.e.e(i7)));
                return;
            case "withLogLevel":
                f17075f.f16537b = Integer.parseInt((String) oVar.a("logLevelStr"));
                return;
            case "setGender":
                String str24 = (String) oVar.a("gender");
                if (str24 != null) {
                    if (str24.equals("f")) {
                        u1.b.d((byte) 0);
                        return;
                    } else {
                        u1.b.d((byte) 1);
                        return;
                    }
                }
                return;
            case "setSslPinningEnabled":
                boolean booleanValue6 = ((Boolean) oVar.a("sslPinningEnabled")).booleanValue();
                if (u1.b.a()) {
                    r i23 = r.i();
                    if (r.f17840z.get()) {
                        i23.d(new C1725n(booleanValue6, 4));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setSslPinningEnabled. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withDataSaleOptOut":
                f17075f.f16545k = ((Boolean) oVar.a("isOptOut")).booleanValue();
                return;
            case "setUserPropertyValues":
                String str25 = (String) oVar.a("propertyName");
                List list2 = (List) oVar.a("propertyValues");
                if (u1.b.a()) {
                    r i24 = r.i();
                    if (r.f17840z.get()) {
                        i24.d(new C1721m(str25, list2, 0));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to UserProperties.set. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "getSessionId":
                if (u1.b.a()) {
                    r.i();
                    if (r.f17840z.get()) {
                        str = String.valueOf(H2.a().f17406k.f17722A.get());
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to getSessionId. Flurry is not initialized");
                    }
                }
                ((p) rVar).success(str);
                return;
            case "setUserId":
                String str26 = (String) oVar.a("userId");
                if (u1.b.a()) {
                    r i25 = r.i();
                    if (r.f17840z.get()) {
                        i25.d(new C1697g(str26, 1));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setUserId. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "removeUserProperty":
                String str27 = (String) oVar.a("propertyName");
                if (u1.b.a()) {
                    r i26 = r.i();
                    if (r.f17840z.get()) {
                        i26.d(new C1697g(str27, 2));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to UserProperties.remove. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "getReleaseVersion":
                r.i();
                ((p) rVar).success((String) C1726n0.a().f17807d);
                return;
            case "setSessionOrigin":
                String str28 = (String) oVar.a("originName");
                String str29 = (String) oVar.a("deepLink");
                if (u1.b.a()) {
                    if (TextUtils.isEmpty(str28)) {
                        AbstractC1706i0.q("String originName passed to setSessionOrigin was empty.");
                        return;
                    }
                    r i27 = r.i();
                    if (r.f17840z.get()) {
                        i27.d(new C1709j(0, str28, str29));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setSessionOrigin. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "setLogEnabled":
                boolean booleanValue7 = ((Boolean) oVar.a("enableLog")).booleanValue();
                if (u1.b.a()) {
                    r.i();
                    if (!r.f17840z.get()) {
                        AbstractC1706i0.o(2, "Invalid call to setLogEnabled. Flurry is not initialized");
                        return;
                    } else if (booleanValue7) {
                        AbstractC1706i0.f17738f = false;
                        return;
                    } else {
                        AbstractC1706i0.f17738f = true;
                        return;
                    }
                }
                return;
            case "setIncludeBackgroundSessionsInMetrics":
                boolean booleanValue8 = ((Boolean) oVar.a("includeBackgroundSessionsInMetrics")).booleanValue();
                if (u1.b.a()) {
                    r i28 = r.i();
                    if (r.f17840z.get()) {
                        i28.d(new C1725n(booleanValue8, 3));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to setIncludeBackgroundSessionsInMetrics. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "endTimedEvent":
                String str30 = (String) oVar.a("eventId");
                if (u1.b.a()) {
                    r.i().h(str30, 2, Collections.emptyMap(), true, false, null);
                    return;
                }
                return;
            case "setGppConsent":
                String str31 = (String) oVar.a("gppString");
                HashSet hashSet3 = new HashSet((List) oVar.a("gppSectionIds"));
                synchronized (u1.b.class) {
                    if (u1.b.a()) {
                        if (TextUtils.isEmpty(str31)) {
                            AbstractC1706i0.q("GPP string is invalid.");
                            return;
                        }
                        if (hashSet3.isEmpty()) {
                            AbstractC1706i0.q("GPP section Ids is empty.");
                            return;
                        }
                        r.i();
                        u1.d dVar = new u1.d(str31, hashSet3);
                        if (r.f17840z.get()) {
                            H2.a().f17407l.h(dVar);
                        } else {
                            AbstractC1706i0.o(2, "Invalid call to updateFlurryConsent. Flurry is not initialized");
                        }
                        return;
                    }
                    return;
                }
            case "getPlatformVersion":
                ((p) rVar).success("Android " + Build.VERSION.RELEASE);
                return;
            case "getPublisherData":
                if (k.f16705c == null) {
                    k.f16705c = k.a().d(k.f16706d);
                }
                ((p) rVar).success(k.f16705c);
                return;
            case "logPayment":
                String str32 = (String) oVar.a("productName");
                String str33 = (String) oVar.a("productId");
                int intValue3 = ((Integer) oVar.a(DiscardedEvent.JsonKeys.QUANTITY)).intValue();
                double doubleValue = ((Double) oVar.a("price")).doubleValue();
                String str34 = (String) oVar.a("currency");
                String str35 = (String) oVar.a("transactionId");
                Map map9 = (Map) oVar.a("parameters");
                if (u1.b.a()) {
                    r i29 = r.i();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    HashMap hashMap3 = new HashMap();
                    if (map9 != null) {
                        hashMap3.putAll(map9);
                    }
                    i29.d(new C1685d(str32, str33, intValue3, doubleValue, str34, str35, hashMap3, currentTimeMillis2, elapsedRealtime2));
                    i7 = 2;
                }
                ((p) rVar).success(Integer.valueOf(t.e.e(i7)));
                return;
            case "removeUserPropertyValue":
                String str36 = (String) oVar.a("propertyName");
                String str37 = (String) oVar.a("propertyValue");
                if (u1.b.a()) {
                    r i30 = r.i();
                    if (r.f17840z.get()) {
                        i30.d(new C1709j(4, str36, str37));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to UserProperties.remove. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "setUserPropertyValue":
                u1.b.c((String) oVar.a("propertyName"), (String) oVar.a("propertyValue"));
                return;
            case "deleteData":
                if (u1.b.a()) {
                    r i31 = r.i();
                    if (r.f17840z.get()) {
                        i31.d(new C1729o(0));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to deleteData. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withLogEnabled":
                f17075f.f16536a = ((Boolean) oVar.a("enableLog")).booleanValue();
                return;
            case "endTimedEventId":
                String str38 = (String) oVar.a("eventId");
                String str39 = (String) oVar.a("timedId");
                if (u1.b.a()) {
                    r i32 = r.i();
                    i32.getClass();
                    i32.h(str38, 2, Collections.emptyMap(), true, false, str39);
                    return;
                }
                return;
            case "getConfigString":
                ((p) rVar).success(u1.c.g().i((String) oVar.a("key"), (String) oVar.a("defaultValue")));
                return;
            case "addSessionProperty":
                String str40 = (String) oVar.a("name");
                String str41 = (String) oVar.a("value");
                if (u1.b.a()) {
                    if (TextUtils.isEmpty(str40)) {
                        AbstractC1706i0.q("Session property name was empty");
                        return;
                    }
                    r i33 = r.i();
                    if (r.f17840z.get()) {
                        i33.d(new C1709j(1, str40, str41));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to addSessionProperty. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "addUserPropertyValues":
                String str42 = (String) oVar.a("propertyName");
                List list3 = (List) oVar.a("propertyValues");
                if (u1.b.a()) {
                    r i34 = r.i();
                    if (r.f17840z.get()) {
                        i34.d(new C1721m(str42, list3, 1));
                        return;
                    } else {
                        AbstractC1706i0.o(2, "Invalid call to UserProperties.add. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withPerformanceMetrics":
                f17075f.f16543h = ((Integer) oVar.a("performanceMetrics")).intValue();
                return;
            case "logEvent":
                ((p) rVar).success(Integer.valueOf(t.e.e(u1.b.a() ? r.i().h((String) oVar.a("eventId"), 2, Collections.emptyMap(), false, false, null) : 1)));
                return;
            case "withGppConsent":
                String str43 = (String) oVar.a("gppString");
                List list4 = (List) oVar.a("gppSectionIds");
                C1620a c1620a2 = f17075f;
                HashSet hashSet4 = new HashSet(list4);
                c1620a2.getClass();
                if (TextUtils.isEmpty(str43)) {
                    AbstractC1706i0.q("GPP string is invalid.");
                    return;
                } else if (hashSet4.isEmpty()) {
                    AbstractC1706i0.q("GPP section Ids is empty.");
                    return;
                } else {
                    c1620a2.j = new u1.d(str43, hashSet4);
                    return;
                }
            case "isPublisherDataFetched":
                ((p) rVar).success(Boolean.valueOf(k.f16704b));
                return;
            default:
                ((p) rVar).notImplemented();
                return;
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
    }
}
