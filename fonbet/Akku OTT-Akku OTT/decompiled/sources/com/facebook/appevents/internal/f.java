package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.media3.exoplayer.analytics.X;
import com.facebook.G;
import com.facebook.S;
import com.facebook.appevents.RunnableC0696h;
import com.facebook.appevents.aam.e;
import com.facebook.internal.C0715k;
import com.facebook.internal.E;
import com.facebook.internal.p;
import com.facebook.internal.u;
import com.facebook.w;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nActivityLifecycleTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityLifecycleTracker.kt\ncom/facebook/appevents/internal/ActivityLifecycleTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1#2:270\n*E\n"})
/* loaded from: classes3.dex */
public final class f {
    public static final f a = new f();
    public static final String b;
    public static final ScheduledExecutorService c;
    public static final ScheduledExecutorService d;
    public static volatile ScheduledFuture<?> e;
    public static final Object f;
    public static final AtomicInteger g;
    public static volatile m h;
    public static final AtomicBoolean i;
    public static String j;
    public static long k;
    public static int l;
    public static WeakReference<Activity> m;
    public static String n;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            u.a aVar = u.Companion;
            String str = f.b;
            aVar.getClass();
            u.a.a(G.d, str, "onActivityCreated");
            int i = g.a;
            f.c.execute(new d());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            u.a aVar = u.Companion;
            String str = f.b;
            aVar.getClass();
            u.a.a(G.d, str, "onActivityDestroyed");
            f.a.getClass();
            com.facebook.appevents.codeless.b bVar = com.facebook.appevents.codeless.b.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.b.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                com.facebook.appevents.codeless.c a = com.facebook.appevents.codeless.c.Companion.a();
                a.getClass();
                if (com.facebook.internal.instrument.crashshield.a.b(a)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    a.e.remove(Integer.valueOf(activity.hashCode()));
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, a);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.codeless.b.class);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            u.a aVar = u.Companion;
            String str = f.b;
            aVar.getClass();
            u.a.a(G.d, str, "onActivityPaused");
            int i = g.a;
            f.a.getClass();
            AtomicInteger atomicInteger = f.g;
            if (atomicInteger.decrementAndGet() < 0) {
                atomicInteger.set(0);
            }
            f.a();
            final long currentTimeMillis = System.currentTimeMillis();
            final String k = E.k(activity);
            com.facebook.appevents.codeless.b bVar = com.facebook.appevents.codeless.b.a;
            if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.b.class)) {
                try {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (com.facebook.appevents.codeless.b.f.get()) {
                        com.facebook.appevents.codeless.c.Companion.a().c(activity);
                        com.facebook.appevents.codeless.g gVar = com.facebook.appevents.codeless.b.d;
                        if (gVar != null && !com.facebook.internal.instrument.crashshield.a.b(gVar)) {
                            try {
                                if (gVar.b.get() != null) {
                                    try {
                                        Timer timer = gVar.c;
                                        if (timer != null) {
                                            timer.cancel();
                                        }
                                        gVar.c = null;
                                    } catch (Exception unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, gVar);
                            }
                        }
                        SensorManager sensorManager = com.facebook.appevents.codeless.b.c;
                        if (sensorManager != null) {
                            sensorManager.unregisterListener(com.facebook.appevents.codeless.b.b);
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.codeless.b.class);
                }
            }
            f.c.execute(new Runnable() { // from class: com.facebook.appevents.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    final long j = currentTimeMillis;
                    final String activityName = k;
                    Intrinsics.checkNotNullParameter(activityName, "$activityName");
                    if (f.h == null) {
                        f.h = new m(Long.valueOf(j), null);
                    }
                    m mVar = f.h;
                    if (mVar != null) {
                        mVar.b = Long.valueOf(j);
                    }
                    if (f.g.get() <= 0) {
                        Runnable runnable = new Runnable() { // from class: com.facebook.appevents.internal.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                long j2 = j;
                                String activityName2 = activityName;
                                Intrinsics.checkNotNullParameter(activityName2, "$activityName");
                                if (f.h == null) {
                                    f.h = new m(Long.valueOf(j2), null);
                                }
                                if (f.g.get() <= 0) {
                                    n.c(activityName2, f.h, f.j);
                                    m.Companion.getClass();
                                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                                    edit.apply();
                                    o.Companion.getClass();
                                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                                    edit2.apply();
                                    f.h = null;
                                }
                                synchronized (f.f) {
                                    f.e = null;
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        };
                        synchronized (f.f) {
                            ScheduledExecutorService scheduledExecutorService = f.c;
                            f.a.getClass();
                            f.e = scheduledExecutorService.schedule(runnable, p.b(w.b()) == null ? 60 : r7.b, TimeUnit.SECONDS);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    long j2 = f.k;
                    long j3 = j2 > 0 ? (j - j2) / 1000 : 0L;
                    k kVar = k.a;
                    Context a = w.a();
                    com.facebook.internal.n k2 = p.k(w.b(), false);
                    if (k2 != null && k2.d && j3 > 0) {
                        com.facebook.appevents.p loggerImpl = new com.facebook.appevents.p(a, (String) null);
                        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
                        Bundle bundle = new Bundle(1);
                        bundle.putCharSequence("fb_aa_time_spent_view_name", activityName);
                        double d = j3;
                        if (S.c()) {
                            loggerImpl.d(bundle, "fb_aa_time_spent_on_view", d);
                        }
                    }
                    m mVar2 = f.h;
                    if (mVar2 != null) {
                        mVar2.a();
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            boolean contains$default;
            Intrinsics.checkNotNullParameter(activity, "activity");
            u.a aVar = u.Companion;
            String str = f.b;
            aVar.getClass();
            u.a.a(G.d, str, "onActivityResumed");
            int i = g.a;
            Intrinsics.checkNotNullParameter(activity, "activity");
            f.m = new WeakReference<>(activity);
            f.g.incrementAndGet();
            f.a.getClass();
            f.a();
            final long currentTimeMillis = System.currentTimeMillis();
            f.k = currentTimeMillis;
            final String k = E.k(activity);
            com.facebook.appevents.codeless.h hVar = com.facebook.appevents.codeless.b.b;
            com.facebook.appevents.codeless.b bVar = com.facebook.appevents.codeless.b.a;
            int i2 = 1;
            if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.b.class)) {
                try {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (com.facebook.appevents.codeless.b.f.get()) {
                        com.facebook.appevents.codeless.c.Companion.a().a(activity);
                        Context applicationContext = activity.getApplicationContext();
                        String b = w.b();
                        com.facebook.internal.n b2 = p.b(b);
                        if (b2 == null || !b2.g) {
                            bVar.getClass();
                            com.facebook.internal.instrument.crashshield.a.b(bVar);
                        } else {
                            SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                            if (sensorManager != null) {
                                com.facebook.appevents.codeless.b.c = sensorManager;
                                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                com.facebook.appevents.codeless.g gVar = new com.facebook.appevents.codeless.g(activity);
                                com.facebook.appevents.codeless.b.d = gVar;
                                X x = new X(i2, b2, b);
                                hVar.getClass();
                                if (!com.facebook.internal.instrument.crashshield.a.b(hVar)) {
                                    try {
                                        hVar.a = x;
                                    } catch (Throwable th) {
                                        com.facebook.internal.instrument.crashshield.a.a(th, hVar);
                                    }
                                }
                                sensorManager.registerListener(hVar, defaultSensor, 2);
                                if (b2.g) {
                                    gVar.c();
                                }
                            }
                        }
                        bVar.getClass();
                        com.facebook.internal.instrument.crashshield.a.b(bVar);
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.codeless.b.class);
                }
            }
            com.facebook.appevents.aam.b bVar2 = com.facebook.appevents.aam.b.a;
            if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.aam.b.class)) {
                try {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    try {
                        if (com.facebook.appevents.aam.b.b) {
                            com.facebook.appevents.aam.d.Companion.getClass();
                            if (!new HashSet(com.facebook.appevents.aam.d.a()).isEmpty()) {
                                com.facebook.appevents.aam.e.Companion.getClass();
                                e.a.b(activity);
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Throwable th3) {
                    com.facebook.internal.instrument.crashshield.a.a(th3, com.facebook.appevents.aam.b.class);
                }
            }
            com.facebook.appevents.suggestedevents.e.d(activity);
            String str2 = f.n;
            if (str2 != null) {
                contains$default = StringsKt__StringsKt.contains$default(str2, "ProxyBillingActivity", false, 2, (Object) null);
                if (contains$default && !Intrinsics.areEqual(k, "ProxyBillingActivity")) {
                    f.d.execute(new com.facebook.appevents.internal.a(0));
                }
            }
            final Context applicationContext2 = activity.getApplicationContext();
            f.c.execute(new Runnable() { // from class: com.facebook.appevents.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    m mVar;
                    long j = currentTimeMillis;
                    String activityName = k;
                    Context appContext = applicationContext2;
                    Intrinsics.checkNotNullParameter(activityName, "$activityName");
                    m mVar2 = f.h;
                    Long l = mVar2 != null ? mVar2.b : null;
                    if (f.h == null) {
                        f.h = new m(Long.valueOf(j), null);
                        String str3 = f.j;
                        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                        n.a(appContext, activityName, str3);
                    } else if (l != null) {
                        long longValue = j - l.longValue();
                        f.a.getClass();
                        if (longValue > (p.b(w.b()) == null ? 60 : r4.b) * 1000) {
                            n.c(activityName, f.h, f.j);
                            String str4 = f.j;
                            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                            n.a(appContext, activityName, str4);
                            f.h = new m(Long.valueOf(j), null);
                        } else if (longValue > 1000 && (mVar = f.h) != null) {
                            mVar.d++;
                        }
                    }
                    m mVar3 = f.h;
                    if (mVar3 != null) {
                        mVar3.b = Long.valueOf(j);
                    }
                    m mVar4 = f.h;
                    if (mVar4 != null) {
                        mVar4.a();
                    }
                }
            });
            f.n = k;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            u.a aVar = u.Companion;
            String str = f.b;
            aVar.getClass();
            u.a.a(G.d, str, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            f.l++;
            u.a aVar = u.Companion;
            String str = f.b;
            aVar.getClass();
            u.a.a(G.d, str, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            u.a aVar = u.Companion;
            String str = f.b;
            aVar.getClass();
            u.a.a(G.d, str, "onActivityStopped");
            com.facebook.appevents.l.Companion.getClass();
            com.facebook.appevents.p.Companion.getClass();
            String str2 = com.facebook.appevents.j.a;
            if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.j.class)) {
                try {
                    com.facebook.appevents.j.d.execute(new RunnableC0696h());
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.j.class);
                }
            }
            f.l--;
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        b = canonicalName;
        c = Executors.newSingleThreadScheduledExecutor();
        d = Executors.newSingleThreadScheduledExecutor();
        f = new Object();
        g = new AtomicInteger(0);
        i = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f) {
            try {
                if (e != null && (scheduledFuture = e) != null) {
                    scheduledFuture.cancel(false);
                }
                e = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JvmStatic
    public static final UUID b() {
        m mVar;
        if (h == null || (mVar = h) == null) {
            return null;
        }
        return mVar.c;
    }

    @JvmStatic
    public static final void c(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (i.compareAndSet(false, true)) {
            C0715k.a(new androidx.browser.browseractions.a(), C0715k.b.CodelessEvents);
            j = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }
}
