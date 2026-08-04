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
import com.google.android.gms.common.internal.C0815k;
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
import p145u1.h;
import p145u1.j;
import p145u1.k;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC0998i1;
import p155w1.C0968b;
import p155w1.C0972c;
import p155w1.C0976d;
import p155w1.C0988g;
import p155w1.C0992h;
import p155w1.C1000j;
import p155w1.C1004k;
import p155w1.C1008l;
import p155w1.C1009l0;
import p155w1.C1011l2;
import p155w1.C1012m;
import p155w1.C1013m0;
import p155w1.C1016n;
import p155w1.C1017n0;
import p155w1.C1020o;
import p155w1.C1024p;
import p155w1.C1028q;
import p155w1.C1046w0;
import p155w1.C1050x1;
import p155w1.H2;
import p155w1.K0;
import p155w1.L;
import p155w1.T;
import p155w1.T0;
import p155w1.W0;
import p155w1.r;

/* JADX INFO: loaded from: classes.dex */
public class e implements p159w5.c, q, p164x5.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p145u1.a f17081f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static p096n1.e f17082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static j f17083y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static d f17084z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f17086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A5.j f17087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A5.j f17088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A5.j f17089e;

    public static void b(String str, Map map) {
        if (p145u1.b.a()) {
            r.i().h(str, 2, map, true, false, null);
        }
    }

    public static void c() {
        p145u1.a aVar = new p145u1.a();
        aVar.f16542a = false;
        aVar.f16543b = 5;
        aVar.f16544c = 10000L;
        aVar.f16545d = true;
        aVar.f16546e = true;
        aVar.f16547f = false;
        aVar.f16548g = false;
        aVar.f16549h = 0;
        aVar.f16550i = new ArrayList();
        aVar.f16551k = false;
        f17081f = aVar;
        aVar.f16552l = true;
        aVar.f16547f = true;
    }

    public static void d(String str) {
        if (p145u1.b.a()) {
            if (TextUtils.isEmpty(str)) {
                AbstractC0997i0.q("Crash breadcrumb cannot be empty.");
                return;
            }
            r rVarI = r.i();
            if (r.f17846z.get()) {
                rVarI.d(new C0988g(str, 0));
            } else {
                AbstractC0997i0.o(2, "Invalid call to logBreadcrumb. Flurry is not initialized");
            }
        }
    }

    public static void f(String str) {
        long j = Long.parseLong(str);
        p145u1.a aVar = f17081f;
        if (j >= 5000) {
            aVar.f16544c = j;
        } else {
            aVar.getClass();
        }
    }

    public final void a(String str) {
        C1011l2 c1011l2;
        r rVarI = r.i();
        rVarI.getClass();
        if (r.f17846z.get()) {
            rVarI.d(new C1028q("flutter-flurry-sdk", "3.3.0", (Map) null));
        } else {
            AbstractC0997i0.o(2, "Invalid call to addOrigin. Flurry is not initialized");
        }
        p145u1.a aVar = f17081f;
        Context context = this.f17085a;
        aVar.getClass();
        if (p145u1.b.a()) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("API key not specified");
            }
            AbstractC0998i1.f17749c = context.getApplicationContext();
            C0815k.a().f11318c = str;
            r rVarI2 = r.i();
            boolean z4 = aVar.f16542a;
            int i7 = aVar.f16543b;
            long j = aVar.f16544c;
            boolean z7 = aVar.f16545d;
            boolean z8 = aVar.f16546e;
            boolean z9 = aVar.f16547f;
            boolean z10 = aVar.f16548g;
            int i8 = aVar.f16549h;
            ArrayList arrayList = aVar.f16550i;
            p145u1.d dVar = aVar.j;
            boolean z11 = aVar.f16551k;
            boolean z12 = aVar.f16552l;
            AtomicBoolean atomicBoolean = r.f17846z;
            if (atomicBoolean.get()) {
                AbstractC0997i0.o(2, "Invalid call to Init. Flurry is already initialized");
                return;
            }
            AbstractC0997i0.o(2, "Initializing Flurry SDK");
            if (atomicBoolean.get()) {
                AbstractC0997i0.o(2, "Overridden call to register. Flurry is already initialized");
            }
            rVarI2.getClass();
            C1050x1.z();
            rVarI2.d(new com.flurry.android.marketing.messaging.notification.b(2, context, arrayList, false));
            synchronized (C1011l2.class) {
                try {
                    if (C1011l2.f17778p == null) {
                        C1011l2.f17778p = new C1011l2();
                    }
                    c1011l2 = C1011l2.f17778p;
                } catch (Throwable th) {
                    throw th;
                }
            }
            H2 h2A = H2.a();
            if (h2A != null) {
                h2A.f17403a.i(c1011l2.f17785g);
                h2A.f17404b.i(c1011l2.f17786h);
                h2A.f17405c.i(c1011l2.f17783e);
                h2A.f17406d.i(c1011l2.f17784f);
                h2A.f17407e.i(c1011l2.f17788k);
                h2A.f17408f.i(c1011l2.f17781c);
                h2A.f17409g.i(c1011l2.f17782d);
                h2A.f17410h.i(c1011l2.j);
                h2A.f17411i.i(c1011l2.f17779a);
                h2A.j.i(c1011l2.f17787i);
                h2A.f17412k.i(c1011l2.f17780b);
                h2A.f17413l.i(c1011l2.f17789l);
                h2A.f17415n.i(c1011l2.f17790m);
                h2A.f17416o.i(c1011l2.f17791n);
                h2A.f17417p.i(c1011l2.f17792o);
            }
            C0815k c0815kA = C0815k.a();
            if (TextUtils.isEmpty(c0815kA.f11317b)) {
                c0815kA.f11317b = c0815kA.f11318c;
            }
            H2.a().f17411i.k();
            T t7 = H2.a().f17403a;
            t7.f17538A = z9;
            if (!z9) {
                AbstractC0997i0.o(5, "Location analytics report is disabled, please enable it to improve your Flurry analytics metrics.");
            }
            t7.d(new C1008l(t7, 2));
            H2.a().f17408f.f17866B = z7;
            if (dVar != null) {
                H2.a().f17413l.h(dVar);
            }
            if (z4) {
                AbstractC0997i0.f17744f = false;
            } else {
                AbstractC0997i0.f17744f = true;
            }
            AbstractC0997i0.f17745g = i7;
            rVarI2.d(new C0972c(j, 0));
            rVarI2.d(new C1024p(z8, z10));
            rVarI2.d(new C1004k(i8, context));
            rVarI2.d(new C1016n(z11, 1));
            atomicBoolean.set(true);
            if (z12) {
                AbstractC0997i0.o(2, "Force start session");
                if (context.getApplicationContext() instanceof Activity) {
                    AbstractC0997i0.o(3, "Activity's session is controlled by Flurry SDK");
                } else if (atomicBoolean.get()) {
                    rVarI2.d(new C1020o(1));
                } else {
                    AbstractC0997i0.o(2, "Invalid call to onStartSession. Flurry is not initialized");
                }
            }
        }
    }

    public final void e() {
        if (!AbstractC0997i0.k(16)) {
            AbstractC0997i0.q(String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
            return;
        }
        T0 t0A = T0.a();
        if (!t0A.f17548f || t0A.f17551i) {
            return;
        }
        t0A.f17551i = true;
        t0A.b(AbstractC0998i1.f17749c, "fl.fully.drawn.time", "fl.fully.drawn.runtime.memory", "fl.fully.drawn.system.memory");
        if (t0A.f17550h) {
            t0A.c();
        }
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        this.f17085a = bVar.f18081a;
        f fVar = bVar.f18083c;
        s sVar = new s(fVar, "flurry_flutter_plugin");
        this.f17086b = sVar;
        sVar.b(this);
        A5.j jVar = new A5.j(fVar, "flurry_flutter_plugin_event_config");
        this.f17087c = jVar;
        jVar.a(new b(0));
        A5.j jVar2 = new A5.j(fVar, "flurry_flutter_plugin_event_messaging");
        this.f17088d = jVar2;
        jVar2.a(new b(1));
        A5.j jVar3 = new A5.j(fVar, "flurry_flutter_plugin_event_ps");
        this.f17089e = jVar3;
        jVar3.a(new b(2));
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        this.f17086b.b(null);
        this.f17087c.a(null);
        this.f17088d.a(null);
        this.f17089e.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:667:0x0f2c  */
    @Override // A5.q
    public final void onMethodCall(o oVar, A5.r rVar) {
        StackTraceElement[] stackTraceElementArr;
        String str = oVar.f676a;
        str.getClass();
        String strValueOf = null;
        int iH = 1;
        int iE = 0;
        switch (str) {
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
                String str2 = (String) oVar.a("eventId");
                String str3 = (String) oVar.a("timedId");
                if (p145u1.b.a()) {
                    r rVarI = r.i();
                    rVarI.getClass();
                    iH = rVarI.h(str2, 2, Collections.emptyMap(), true, true, str3);
                }
                ((p) rVar).success(Integer.valueOf(p136t.e.e(iH)));
                return;
            case "activateConfig":
                p145u1.c cVarG = p145u1.c.g();
                cVarG.getClass();
                if (r.f17846z.get()) {
                    ((C1046w0) cVarG.f16597b).k(null);
                    return;
                } else {
                    AbstractC0997i0.q("Flurry SDK must be initialized before activating config");
                    return;
                }
            case "logBreadcrumb":
                d((String) oVar.a("crashBreadcrumb"));
                return;
            case "setVersionName":
                String str4 = (String) oVar.a("versionName");
                if (p145u1.b.a()) {
                    r rVarI2 = r.i();
                    if (r.f17846z.get()) {
                        rVarI2.d(new C0988g(str4, 4));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setVersionName. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withAppVersion":
                Log.w("FlurryFlutterPlugin", "iOS only. For Android, please also call Flurry.setVersionName().");
                return;
            case "logTimedEvent":
                ((p) rVar).success(Integer.valueOf(p136t.e.e(p145u1.b.a() ? r.i().h((String) oVar.a("eventId"), 2, Collections.emptyMap(), ((Boolean) oVar.a("timed")).booleanValue(), true, null) : 1)));
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
                String str5 = (String) oVar.a("eventId");
                Map map = (Map) oVar.a("parameters");
                boolean zBooleanValue = ((Boolean) oVar.a("timed")).booleanValue();
                if (p145u1.b.a()) {
                    if (str5 == null) {
                        AbstractC0997i0.q("String eventId passed to logEvent was null.");
                    } else {
                        if (map == null) {
                            AbstractC0997i0.o(4, "String parameters passed to logEvent was null.");
                        }
                        iH = r.i().h(str5, 2, map, zBooleanValue, true, null);
                    }
                }
                ((p) rVar).success(Integer.valueOf(p136t.e.e(iH)));
                return;
            case "setIAPReportingEnabled":
                Log.w("FlurryFlutterPlugin", "setIAPReportingEnabled is not supported on Android. Please use LogPayment instead.");
                return;
            case "onError":
                p145u1.b.b((String) oVar.a("errorId"), (String) oVar.a("message"), (String) oVar.a("errorClass"));
                return;
            case "logResourceLogger":
                String str6 = (String) oVar.a("id");
                p096n1.e eVar = f17082x;
                if (eVar != null) {
                    AbstractC0997i0.f();
                    if ((AbstractC0997i0.f17742d & 4) == 4) {
                        AbstractC0997i0.f();
                        if ((AbstractC0997i0.f17742d & 4) == 4) {
                            long jNanoTime = System.nanoTime();
                            W0 w7 = (W0) eVar.f15314b;
                            long j = (long) ((jNanoTime - w7.f17574a) / 1000000.0d);
                            HashMap mapM = p031e1.k.m("fl.id", str6);
                            mapM.put("fl.resource.time", Long.toString(j));
                            Runtime runtime = Runtime.getRuntime();
                            long jFreeMemory = (runtime.totalMemory() - runtime.freeMemory()) - w7.f17575b;
                            if (jFreeMemory < 0) {
                                jFreeMemory = 0;
                            }
                            mapM.put("fl.resource.runtime.memory", Long.toString(jFreeMemory));
                            Context context = AbstractC0998i1.f17749c;
                            if (context != null) {
                                ActivityManager.MemoryInfo memoryInfoA = AbstractC0997i0.a(context);
                                long j3 = (memoryInfoA.totalMem - memoryInfoA.availMem) - w7.f17576c;
                                mapM.put("fl.resource.system.memory", Long.toString(j3 >= 0 ? j3 : 0L));
                            }
                            AbstractC0997i0.o(4, "Logging parameters: ".concat(String.valueOf(mapM)));
                            r.i().j("Flurry.ResourceLog", 6, mapM);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case "setCrashReporting":
                boolean zBooleanValue2 = ((Boolean) oVar.a("crashReporting")).booleanValue();
                if (p145u1.b.a()) {
                    r rVarI3 = r.i();
                    if (r.f17846z.get()) {
                        rVarI3.d(new C1016n(zBooleanValue2, 2));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setCaptureUncaughtExceptions. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withSslPinningEnabled":
                f17081f.f16548g = ((Boolean) oVar.a("sslPinningEnabled")).booleanValue();
                return;
            case "logStandardEvent":
                int iIntValue = ((Integer) oVar.a("id")).intValue();
                Map map2 = (Map) oVar.a("flurryParam");
                Map map3 = (Map) oVar.a("userParam");
                if (iIntValue >= 0) {
                    h[] hVarArr = a.f17075a;
                    if (iIntValue >= hVarArr.length) {
                        L.k(iIntValue, "Standard event ID is out of range: ", "FlurryFlutterPlugin");
                    } else {
                        h hVar = hVarArr[iIntValue];
                        HashMap map4 = new HashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            int iIntValue2 = ((Integer) entry.getKey()).intValue();
                            if (iIntValue2 >= 0) {
                                Object[] objArr = a.f17076b;
                                if (iIntValue2 < objArr.length) {
                                    map4.put(objArr[iIntValue2], (String) entry.getValue());
                                }
                            }
                            L.k(iIntValue2, "Standard event parameter ID is out of range: ", "FlurryFlutterPlugin");
                        }
                        for (Map.Entry entry2 : map3.entrySet()) {
                            map4.put(entry2.getKey(), (String) entry2.getValue());
                        }
                        if (p145u1.b.a()) {
                            if (hVar == null) {
                                AbstractC0997i0.q("Event passed to logEvent was null.");
                            } else {
                                r rVarI4 = r.i();
                                if (r.f17846z.get()) {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    HashMap map5 = new HashMap();
                                    HashSet hashSet = new HashSet(Arrays.asList(hVar.f16705b));
                                    HashSet hashSet2 = new HashSet(Arrays.asList(hVar.f16706c));
                                    for (Map.Entry entry3 : map4.entrySet()) {
                                        Object key = entry3.getKey();
                                        if (key instanceof p145u1.e) {
                                            p145u1.e eVar2 = (p145u1.e) key;
                                            if (hashSet.contains(eVar2)) {
                                                hashSet.remove(eVar2);
                                            } else if (hashSet2.contains(eVar2)) {
                                                hashSet2.remove(eVar2);
                                            } else {
                                                AbstractC0997i0.o(5, "Log " + hVar.toString() + " event - not a mandatory nor recommended parameter: " + eVar2);
                                            }
                                            map5.put(eVar2.f16599a, (String) entry3.getValue());
                                        } else if (key instanceof String) {
                                            map5.put((String) key, (String) entry3.getValue());
                                        }
                                    }
                                    int i7 = map5.size() <= 10 ? 2 : 4;
                                    if (!hashSet.isEmpty()) {
                                        AbstractC0997i0.q("Log " + hVar.toString() + " event - Missing mandatory parameters: " + hashSet);
                                        i7 = 8;
                                    }
                                    if (!hashSet2.isEmpty()) {
                                        AbstractC0997i0.o(5, "Log " + hVar.toString() + " event - Missing recommended parameters: " + hashSet2);
                                    }
                                    rVarI4.d(new C0968b(hVar, map5, jCurrentTimeMillis, jElapsedRealtime));
                                    iH = i7;
                                } else {
                                    AbstractC0997i0.o(2, "Invalid call to logEvent. Flurry is not initialized");
                                }
                            }
                        }
                        iE = p136t.e.e(iH);
                    }
                } else {
                    L.k(iIntValue, "Standard event ID is out of range: ", "FlurryFlutterPlugin");
                }
                ((p) rVar).success(Integer.valueOf(iE));
                return;
            case "logTimedEventIdWithParameters":
                String str7 = (String) oVar.a("eventId");
                Map map6 = (Map) oVar.a("parameters");
                String str8 = (String) oVar.a("timedId");
                if (p145u1.b.a()) {
                    if (str7 == null) {
                        AbstractC0997i0.q("String eventId passed to logEvent was null.");
                    } else {
                        if (map6 == null) {
                            AbstractC0997i0.o(4, "String parameters passed to logEvent was null.");
                        }
                        iH = r.i().h(str7, 2, map6, true, true, str8);
                    }
                }
                ((p) rVar).success(Integer.valueOf(p136t.e.e(iH)));
                return;
            case "setReportLocation":
                boolean zBooleanValue3 = ((Boolean) oVar.a("reportLocation")).booleanValue();
                if (p145u1.b.a()) {
                    r rVarI5 = r.i();
                    if (r.f17846z.get()) {
                        rVarI5.d(new C1016n(zBooleanValue3, 5));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setReportLocation. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withIncludeBackgroundSessionsInMetrics":
                f17081f.f16546e = ((Boolean) oVar.a("includeBackgroundSessionsInMetrics")).booleanValue();
                return;
            case "willHandleMessage":
                boolean zBooleanValue4 = ((Boolean) oVar.a("willHandle")).booleanValue();
                synchronized (C1013m0.f17797c) {
                    C1013m0.f17798d = zBooleanValue4;
                    C1013m0.f17799e = true;
                    C1013m0.f17797c.notifyAll();
                    break;
                }
                return;
            case "setAge":
                int i8 = Integer.parseInt((String) oVar.a("ageStr"));
                if (p145u1.b.a()) {
                    r rVarI6 = r.i();
                    if (r.f17846z.get()) {
                        rVarI6.d(new C0992h(i8));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setAge. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "getAgentVersion":
                r.i();
                C1017n0.a();
                ((p) rVar).success(345);
                return;
            case "onErrorWithParameters":
                String str9 = (String) oVar.a("errorId");
                String str10 = (String) oVar.a("message");
                String str11 = (String) oVar.a("errorClass");
                Map map7 = (Map) oVar.a("parameters");
                if (p145u1.b.a()) {
                    if (TextUtils.isEmpty(str9)) {
                        AbstractC0997i0.q("String errorId passed to onError was empty.");
                        return;
                    }
                    if (TextUtils.isEmpty(str10)) {
                        AbstractC0997i0.q("String message passed to onError was empty.");
                        return;
                    }
                    if (TextUtils.isEmpty(str11)) {
                        AbstractC0997i0.q("String errorClass passed to onError was empty.");
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
                    r.i().k(str9, str10, str11, map7, stackTraceElementArr);
                    return;
                }
                return;
            case "setDataSaleOptOut":
                boolean zBooleanValue5 = ((Boolean) oVar.a("isOptOut")).booleanValue();
                if (p145u1.b.a()) {
                    r rVarI7 = r.i();
                    if (r.f17846z.get()) {
                        rVarI7.d(new C1016n(zBooleanValue5, 0));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setDataSaleOptOut. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withMessaging":
                Log.i("FlurryFlutterPlugin", "To customize Flurry Push for Android, please duplicate Builder setup in your FlutterApplication class.");
                C1013m0 c1013m0 = new C1013m0(25);
                FlurryMarketingOptions.Builder builder = new FlurryMarketingOptions.Builder().setupMessagingWithAutoIntegration();
                HandlerThread handlerThread = new HandlerThread("FlurryHandlerThread");
                handlerThread.start();
                FlurryMarketingModule flurryMarketingModule = new FlurryMarketingModule(builder.withFlurryMessagingListener(c1013m0, new Handler(handlerThread.getLooper())).build());
                p145u1.a aVar = f17081f;
                aVar.getClass();
                if (!K0.f17437d.contains(FlurryMarketingModule.class.getCanonicalName())) {
                    throw new IllegalArgumentException(p031e1.k.h(new StringBuilder("The Flurry module you have registered is invalid: "), FlurryMarketingModule.class));
                }
                aVar.f16550i.add(flurryMarketingModule);
                return;
            case "openPrivacyDashboard":
                Context context2 = this.f17085a;
                if (context2 == null) {
                    Log.w("FlurryFlutterPlugin", "Application Context is not available to open Privacy Dashboard.");
                    return;
                }
                I4.j jVar = new I4.j(context2, new C1009l0(25));
                if (p145u1.b.a()) {
                    r.i().d(new C1008l(jVar, 0));
                    return;
                }
                return;
            case "startResourceLogger":
                p096n1.e eVar3 = new p096n1.e(21);
                AbstractC0997i0.f();
                W0 w8 = new W0();
                w8.f17574a = System.nanoTime();
                Runtime runtime2 = Runtime.getRuntime();
                w8.f17575b = runtime2.totalMemory() - runtime2.freeMemory();
                Context context3 = AbstractC0998i1.f17749c;
                if (context3 != null) {
                    ActivityManager.MemoryInfo memoryInfoA2 = AbstractC0997i0.a(context3);
                    w8.f17576c = memoryInfoA2.totalMem - memoryInfoA2.availMem;
                }
                eVar3.f15314b = w8;
                f17082x = eVar3;
                return;
            case "setContinueSessionMillis":
                long j7 = Long.parseLong((String) oVar.a("sessionMillisStr"));
                if (p145u1.b.a()) {
                    if (j7 < 5000) {
                        j7 = 5000;
                    }
                    r rVarI8 = r.i();
                    if (r.f17846z.get()) {
                        rVarI8.d(new C0972c(j7, 1));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setContinueSessionMillis. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withCrashReporting":
                f17081f.f16545d = ((Boolean) oVar.a("crashReporting")).booleanValue();
                return;
            case "setLogLevel":
                int i9 = Integer.parseInt((String) oVar.a("logLevelStr"));
                if (p145u1.b.a()) {
                    r.i();
                    if (r.f17846z.get()) {
                        AbstractC0997i0.f17745g = i9;
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setLogLevel. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "flagUserProperty":
                String str12 = (String) oVar.a("propertyName");
                if (p145u1.b.a()) {
                    r rVarI9 = r.i();
                    if (r.f17846z.get()) {
                        rVarI9.d(new C0988g(str12, 3));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to UserProperties.flag. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "addOrigin":
                String str13 = (String) oVar.a("originName");
                String str14 = (String) oVar.a("originVersion");
                r rVarI10 = r.i();
                rVarI10.getClass();
                if (r.f17846z.get()) {
                    rVarI10.d(new C1028q(str13, str14, (Map) null));
                    return;
                } else {
                    AbstractC0997i0.o(2, "Invalid call to addOrigin. Flurry is not initialized");
                    return;
                }
            case "withReportLocation":
                f17081f.f16547f = ((Boolean) oVar.a("reportLocation")).booleanValue();
                return;
            case "endTimedEventIdWithParameters":
                String str15 = (String) oVar.a("eventId");
                Map map8 = (Map) oVar.a("parameters");
                String str16 = (String) oVar.a("timedId");
                if (p145u1.b.a()) {
                    r.i().h(str15, 2, map8, true, false, str16);
                    return;
                }
                return;
            case "addUserPropertyValue":
                String str17 = (String) oVar.a("propertyName");
                String str18 = (String) oVar.a("propertyValue");
                if (p145u1.b.a()) {
                    r rVarI11 = r.i();
                    if (r.f17846z.get()) {
                        rVarI11.d(new C1000j(3, str17, str18));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to UserProperties.add. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "addOriginWithParameters":
                String str19 = (String) oVar.a("originName");
                String str20 = (String) oVar.a("originVersion");
                Map map9 = (Map) oVar.a("originParameters");
                if (p145u1.b.a()) {
                    r rVarI12 = r.i();
                    rVarI12.getClass();
                    if (r.f17846z.get()) {
                        rVarI12.d(new C1028q(str19, str20, map9));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to addOrigin. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "removeUserPropertyValues":
                String str21 = (String) oVar.a("propertyName");
                List list = (List) oVar.a("propertyValues");
                if (p145u1.b.a()) {
                    r rVarI13 = r.i();
                    if (r.f17846z.get()) {
                        rVarI13.d(new C1012m(str21, list, 2));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to UserProperties.remove. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "fetchConfig":
                p145u1.c cVarG2 = p145u1.c.g();
                cVarG2.getClass();
                if (r.f17846z.get()) {
                    ((C1046w0) cVarG2.f16597b).m();
                    return;
                } else {
                    AbstractC0997i0.q("Flurry SDK must be initialized before fetching config");
                    return;
                }
            case "logEventWithParameters":
                String str22 = (String) oVar.a("eventId");
                Map map10 = (Map) oVar.a("parameters");
                if (p145u1.b.a()) {
                    if (str22 == null) {
                        AbstractC0997i0.q("String eventId passed to logEvent was null.");
                    } else {
                        if (map10 == null) {
                            AbstractC0997i0.o(4, "String parameters passed to logEvent was null.");
                        }
                        iH = r.i().h(str22, 2, map10, false, false, null);
                    }
                }
                ((p) rVar).success(Integer.valueOf(p136t.e.e(iH)));
                return;
            case "withLogLevel":
                f17081f.f16543b = Integer.parseInt((String) oVar.a("logLevelStr"));
                return;
            case "setGender":
                String str23 = (String) oVar.a("gender");
                if (str23 != null) {
                    if (str23.equals("f")) {
                        p145u1.b.d((byte) 0);
                        return;
                    } else {
                        p145u1.b.d((byte) 1);
                        return;
                    }
                }
                return;
            case "setSslPinningEnabled":
                boolean zBooleanValue6 = ((Boolean) oVar.a("sslPinningEnabled")).booleanValue();
                if (p145u1.b.a()) {
                    r rVarI14 = r.i();
                    if (r.f17846z.get()) {
                        rVarI14.d(new C1016n(zBooleanValue6, 4));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setSslPinningEnabled. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withDataSaleOptOut":
                f17081f.f16551k = ((Boolean) oVar.a("isOptOut")).booleanValue();
                return;
            case "setUserPropertyValues":
                String str24 = (String) oVar.a("propertyName");
                List list2 = (List) oVar.a("propertyValues");
                if (p145u1.b.a()) {
                    r rVarI15 = r.i();
                    if (r.f17846z.get()) {
                        rVarI15.d(new C1012m(str24, list2, 0));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to UserProperties.set. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "getSessionId":
                if (p145u1.b.a()) {
                    r.i();
                    if (r.f17846z.get()) {
                        strValueOf = String.valueOf(H2.a().f17412k.f17728A.get());
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to getSessionId. Flurry is not initialized");
                    }
                }
                ((p) rVar).success(strValueOf);
                return;
            case "setUserId":
                String str25 = (String) oVar.a("userId");
                if (p145u1.b.a()) {
                    r rVarI16 = r.i();
                    if (r.f17846z.get()) {
                        rVarI16.d(new C0988g(str25, 1));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setUserId. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "removeUserProperty":
                String str26 = (String) oVar.a("propertyName");
                if (p145u1.b.a()) {
                    r rVarI17 = r.i();
                    if (r.f17846z.get()) {
                        rVarI17.d(new C0988g(str26, 2));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to UserProperties.remove. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "getReleaseVersion":
                r.i();
                ((p) rVar).success((String) C1017n0.a().f17813d);
                return;
            case "setSessionOrigin":
                String str27 = (String) oVar.a("originName");
                String str28 = (String) oVar.a("deepLink");
                if (p145u1.b.a()) {
                    if (TextUtils.isEmpty(str27)) {
                        AbstractC0997i0.q("String originName passed to setSessionOrigin was empty.");
                        return;
                    }
                    r rVarI18 = r.i();
                    if (r.f17846z.get()) {
                        rVarI18.d(new C1000j(0, str27, str28));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setSessionOrigin. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "setLogEnabled":
                boolean zBooleanValue7 = ((Boolean) oVar.a("enableLog")).booleanValue();
                if (p145u1.b.a()) {
                    r.i();
                    if (!r.f17846z.get()) {
                        AbstractC0997i0.o(2, "Invalid call to setLogEnabled. Flurry is not initialized");
                        return;
                    } else if (zBooleanValue7) {
                        AbstractC0997i0.f17744f = false;
                        return;
                    } else {
                        AbstractC0997i0.f17744f = true;
                        return;
                    }
                }
                return;
            case "setIncludeBackgroundSessionsInMetrics":
                boolean zBooleanValue8 = ((Boolean) oVar.a("includeBackgroundSessionsInMetrics")).booleanValue();
                if (p145u1.b.a()) {
                    r rVarI19 = r.i();
                    if (r.f17846z.get()) {
                        rVarI19.d(new C1016n(zBooleanValue8, 3));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to setIncludeBackgroundSessionsInMetrics. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "endTimedEvent":
                String str29 = (String) oVar.a("eventId");
                if (p145u1.b.a()) {
                    r.i().h(str29, 2, Collections.emptyMap(), true, false, null);
                    return;
                }
                return;
            case "setGppConsent":
                String str30 = (String) oVar.a("gppString");
                HashSet hashSet3 = new HashSet((List) oVar.a("gppSectionIds"));
                synchronized (p145u1.b.class) {
                    if (p145u1.b.a()) {
                        if (TextUtils.isEmpty(str30)) {
                            AbstractC0997i0.q("GPP string is invalid.");
                            return;
                        }
                        if (hashSet3.isEmpty()) {
                            AbstractC0997i0.q("GPP section Ids is empty.");
                            return;
                        }
                        r.i();
                        p145u1.d dVar = new p145u1.d(str30, hashSet3);
                        if (r.f17846z.get()) {
                            H2.a().f17413l.h(dVar);
                        } else {
                            AbstractC0997i0.o(2, "Invalid call to updateFlurryConsent. Flurry is not initialized");
                        }
                        return;
                    }
                    return;
                }
            case "getPlatformVersion":
                ((p) rVar).success("Android " + Build.VERSION.RELEASE);
                return;
            case "getPublisherData":
                if (k.f16711c == null) {
                    k.f16711c = k.a().d(k.f16712d);
                }
                ((p) rVar).success(k.f16711c);
                return;
            case "logPayment":
                String str31 = (String) oVar.a("productName");
                String str32 = (String) oVar.a("productId");
                int iIntValue3 = ((Integer) oVar.a(DiscardedEvent.JsonKeys.QUANTITY)).intValue();
                double dDoubleValue = ((Double) oVar.a("price")).doubleValue();
                String str33 = (String) oVar.a("currency");
                String str34 = (String) oVar.a("transactionId");
                Map map11 = (Map) oVar.a("parameters");
                if (p145u1.b.a()) {
                    r rVarI20 = r.i();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    HashMap map12 = new HashMap();
                    if (map11 != null) {
                        map12.putAll(map11);
                    }
                    rVarI20.d(new C0976d(str31, str32, iIntValue3, dDoubleValue, str33, str34, map12, jCurrentTimeMillis2, jElapsedRealtime2));
                    iH = 2;
                }
                ((p) rVar).success(Integer.valueOf(p136t.e.e(iH)));
                return;
            case "removeUserPropertyValue":
                String str35 = (String) oVar.a("propertyName");
                String str36 = (String) oVar.a("propertyValue");
                if (p145u1.b.a()) {
                    r rVarI21 = r.i();
                    if (r.f17846z.get()) {
                        rVarI21.d(new C1000j(4, str35, str36));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to UserProperties.remove. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "setUserPropertyValue":
                p145u1.b.c((String) oVar.a("propertyName"), (String) oVar.a("propertyValue"));
                return;
            case "deleteData":
                if (p145u1.b.a()) {
                    r rVarI22 = r.i();
                    if (r.f17846z.get()) {
                        rVarI22.d(new C1020o(0));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to deleteData. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withLogEnabled":
                f17081f.f16542a = ((Boolean) oVar.a("enableLog")).booleanValue();
                return;
            case "endTimedEventId":
                String str37 = (String) oVar.a("eventId");
                String str38 = (String) oVar.a("timedId");
                if (p145u1.b.a()) {
                    r rVarI23 = r.i();
                    rVarI23.getClass();
                    rVarI23.h(str37, 2, Collections.emptyMap(), true, false, str38);
                    return;
                }
                return;
            case "getConfigString":
                ((p) rVar).success(p145u1.c.g().i((String) oVar.a("key"), (String) oVar.a("defaultValue")));
                return;
            case "addSessionProperty":
                String str39 = (String) oVar.a("name");
                String str40 = (String) oVar.a("value");
                if (p145u1.b.a()) {
                    if (TextUtils.isEmpty(str39)) {
                        AbstractC0997i0.q("Session property name was empty");
                        return;
                    }
                    r rVarI24 = r.i();
                    if (r.f17846z.get()) {
                        rVarI24.d(new C1000j(1, str39, str40));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to addSessionProperty. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "addUserPropertyValues":
                String str41 = (String) oVar.a("propertyName");
                List list3 = (List) oVar.a("propertyValues");
                if (p145u1.b.a()) {
                    r rVarI25 = r.i();
                    if (r.f17846z.get()) {
                        rVarI25.d(new C1012m(str41, list3, 1));
                        return;
                    } else {
                        AbstractC0997i0.o(2, "Invalid call to UserProperties.add. Flurry is not initialized");
                        return;
                    }
                }
                return;
            case "withPerformanceMetrics":
                f17081f.f16549h = ((Integer) oVar.a("performanceMetrics")).intValue();
                return;
            case "logEvent":
                ((p) rVar).success(Integer.valueOf(p136t.e.e(p145u1.b.a() ? r.i().h((String) oVar.a("eventId"), 2, Collections.emptyMap(), false, false, null) : 1)));
                return;
            case "withGppConsent":
                String str42 = (String) oVar.a("gppString");
                List list4 = (List) oVar.a("gppSectionIds");
                p145u1.a aVar2 = f17081f;
                HashSet hashSet4 = new HashSet(list4);
                aVar2.getClass();
                if (TextUtils.isEmpty(str42)) {
                    AbstractC0997i0.q("GPP string is invalid.");
                    return;
                } else if (hashSet4.isEmpty()) {
                    AbstractC0997i0.q("GPP section Ids is empty.");
                    return;
                } else {
                    aVar2.j = new p145u1.d(str42, hashSet4);
                    return;
                }
            case "isPublisherDataFetched":
                ((p) rVar).success(Boolean.valueOf(k.f16710b));
                return;
            default:
                ((p) rVar).notImplemented();
                return;
        }
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // p164x5.a
    public final void onAttachedToActivity(p164x5.b bVar) {
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(p164x5.b bVar) {
    }
}
