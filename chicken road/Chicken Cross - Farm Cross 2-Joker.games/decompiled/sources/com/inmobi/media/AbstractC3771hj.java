package com.inmobi.media;

import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.hj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3771hj {
    public static Jc b;

    /* renamed from: a, reason: collision with root package name */
    public static final Ac f7147a = Ac.c;
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final C3742gj d = new C3742gj();
    public static final ReentrantLock e = new ReentrantLock();
    public static final Function1 f = new Function1() { // from class: com.inmobi.media.hj$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AbstractC3771hj.a((C3698f3) obj);
        }
    };
    public static final ReferenceQueue g = new ReferenceQueue();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();
    public static final AtomicBoolean i = new AtomicBoolean(false);

    public static final Unit a(C3698f3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.f7098a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                case 151:
                case 152:
                    Map map = it.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = it.c.get("data");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        a((Ca) obj);
                        break;
                    }
                    break;
                default:
                    String str = "unwanted event received - " + i2;
                    break;
            }
        } else {
            a(i2);
            c.set(false);
            ((C4214xd) AbstractC3914mk.f.getValue()).a(f);
            b = null;
        }
        return Unit.INSTANCE;
    }

    public static void b() {
        if (b != null) {
            return;
        }
        ReentrantLock reentrantLock = e;
        if (reentrantLock.tryLock()) {
            try {
                if (b == null && c.get()) {
                    Context context = AbstractC3914mk.f7252a;
                    if (context != null) {
                        J4 j4 = AbstractC4260z4.f7518a;
                        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                        TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getLoggingConfig();
                        b = new Jc(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * 1000, loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    Jc jc = b;
                    if (jc != null) {
                        AbstractC3621ca.a(jc);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                e.unlock();
                throw th;
            }
        }
    }

    public static final void c() {
        while (c.get()) {
            a();
        }
    }

    public static void a(Object obj, Y9 y9) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        try {
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            if (((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (y9 != null) {
                    ((Z9) y9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (y9 != null) {
                    h.put(new PhantomReference(obj, g), new Pair(obj.toString(), new WeakReference(y9)));
                    if (i.getAndSet(true)) {
                        return;
                    }
                    CoroutineScope coroutineScope = Sc.f6848a;
                    Runnable runnable = new Runnable() { // from class: com.inmobi.media.hj$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC3771hj.c();
                        }
                    };
                    Intrinsics.checkNotNullParameter("RemoteLoggerComponent", "tag");
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    try {
                        BuildersKt__Builders_commonKt.launch$default(Sc.f6848a, null, null, new Oc(runnable, null), 3, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e2) {
            Lazy lazy = Ba.f6473a;
            U9.a(e2);
        }
    }

    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static Z9 a(String logType, String placementType) {
        Intrinsics.checkNotNullParameter(logType, "logType");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            try {
                b();
                J4 j4 = AbstractC4260z4.f7518a;
                Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getLoggingConfig();
                double b2 = b(logType, placementType, loggingConfig);
                Ac logLevel = a(logType, placementType, loggingConfig);
                boolean z = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * 1000;
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(logLevel, "logLevel");
                return new Z9(context, b2, logLevel, z, maxNoOfEntries, expiry);
            } catch (Exception e2) {
                Lazy lazy = Ba.f6473a;
                U9.a(e2);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Ac a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Bc.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return Bc.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Bc.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return Bc.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Bc.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return Bc.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return Bc.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Bc.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return Bc.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return Bc.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f7147a;
    }

    public static void a() {
        WeakReference weakReference;
        Y9 y9;
        Reference remove = g.remove();
        ConcurrentHashMap concurrentHashMap = h;
        if (CollectionsKt.contains(concurrentHashMap.keySet(), remove)) {
            Pair pair = (Pair) concurrentHashMap.get(remove);
            if (pair != null && (weakReference = (WeakReference) pair.getSecond()) != null && (y9 = (Y9) weakReference.get()) != null) {
                ((Z9) y9).a("ReferenceTracker", " reference " + pair.getFirst() + " reference is GCed.");
            }
            TypeIntrinsics.asMutableMap(concurrentHashMap).remove(remove);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) ((Pair) entry.getValue()).getSecond()).get() == null) {
                h.remove(entry.getKey());
            }
        }
    }

    public static void a(Ca incident) {
        Intrinsics.checkNotNullParameter(incident, "incident");
        boolean z = incident instanceof C4124u5;
        if (!z && !(incident instanceof C3892lq)) {
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
            J4 j42 = AbstractC4260z4.f7518a;
            if (((CrashConfig) j42.a(CrashConfig.class)).getAnr().getAppExitReason().getReportToLogs() && (incident instanceof T1)) {
                Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
                Ka ka = new Ka(((CrashConfig) j42.a(CrashConfig.class)).getAnr().getAppExitReason().getIncompleteLogThresholdTime());
                String message = incident.f6546a;
                String str = incident.b;
                String exitData = str == null ? "" : str;
                int i2 = ((T1) incident).g;
                long j = incident.c;
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(exitData, "exitData");
                CoroutineScope coroutineScope = Sc.f6848a;
                Rc.a(new Ja(ka, j, message, i2, exitData, null));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3621ca.f7044a;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mc.f6715a;
        Iterator it = Lc.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new C3743gk((C3685ej) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C3743gk c3743gk = (C3743gk) it2.next();
            Ac logLevel = Ac.c;
            String str2 = incident.f6546a;
            long j2 = incident.c;
            String str3 = incident.b;
            if (str3 == null) {
                str3 = "";
            }
            String message2 = "TYPE - " + str2 + ", TIMESTAMP - " + j2 + ", PAYLOAD - " + str3;
            c3743gk.getClass();
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("LOGGER CRASH", "tag");
            Intrinsics.checkNotNullParameter(message2, "message");
            c3743gk.f7126a.a(logLevel, "LOGGER CRASH", message2);
            if (z) {
                c3743gk.f7126a.b();
            }
        }
    }

    public static void a(int i2) {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3621ca.f7044a;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mc.f6715a;
        Iterator it = Lc.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new C3743gk((C3685ej) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C3743gk c3743gk = (C3743gk) it2.next();
            Ac logLevel = Ac.c;
            String message = "SYSTEM SHUTDOWN RECEIVED - " + i2;
            c3743gk.getClass();
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("LOGGER CRASH", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            c3743gk.f7126a.a(logLevel, "LOGGER CRASH", message);
            c3743gk.f7126a.b();
        }
        c.set(false);
        ((C4214xd) AbstractC3914mk.f.getValue()).a(f);
        b = null;
    }
}
