package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import t3.C2424c;

/* renamed from: com.google.android.gms.internal.ads.kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204kd {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f14244a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f14245b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public String f14246c = null;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f14247d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f14248e = new AtomicInteger(-1);
    public final AtomicReference f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f14249g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f14250h = new ConcurrentHashMap(9);
    public final Object i;

    public C1204kd() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.i = new Object();
    }

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean g(Context context) {
        A7 a7 = F7.f8860m0;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            int a5 = C2424c.a(context, ModuleDescriptor.MODULE_ID);
            A7 a72 = F7.f8866n0;
            D7 d7 = rVar.f5056c;
            if (a5 >= ((Integer) d7.a(a72)).intValue()) {
                if (!((Boolean) d7.a(F7.f8872o0)).booleanValue()) {
                    return true;
                }
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String a(Context context) {
        Object h3;
        if (e(context) && (h3 = h(context, "generateEventId")) != null) {
            return h3.toString();
        }
        return null;
    }

    public final String b(Context context) {
        if (e(context)) {
            A7 a7 = F7.f8848k0;
            Q2.r rVar = Q2.r.f5053d;
            long longValue = ((Long) rVar.f5056c.a(a7)).longValue();
            if (longValue < 0) {
                return (String) h(context, "getAppInstanceId");
            }
            AtomicReference atomicReference = this.f14244a;
            if (atomicReference.get() == null) {
                A7 a72 = F7.f8854l0;
                D7 d7 = rVar.f5056c;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) d7.a(a72)).intValue(), ((Integer) d7.a(a72)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC1159jd(0));
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && (atomicReference.get() == null || atomicReference.get() == null)) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new A4(3, this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String c(Context context) {
        if (!e(context)) {
            return null;
        }
        synchronized (this.f14245b) {
            try {
                String str = this.f14246c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) h(context, "getGmpAppId");
                this.f14246c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Context context, String str, String str2, String str3, int i) {
        if (e(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            k(context, "_ar", str, bundle);
            T2.G.m("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final boolean e(Context context) {
        int c5;
        A7 a7 = F7.f8820e0;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && !this.f14247d.get()) {
            if (!((Boolean) rVar.f5056c.a(F7.f8878p0)).booleanValue()) {
                AtomicInteger atomicInteger = this.f14248e;
                if (atomicInteger.get() == -1) {
                    U2.e eVar = C0379q.f.f5048a;
                    j3.f fVar = j3.f.f17514b;
                    if (fVar.c(context, 12451000) != 0 && ((c5 = fVar.c(context, 12451000)) == 0 || c5 == 2)) {
                        U2.j.i("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object h(Context context, String str) {
        AtomicReference atomicReference = this.f;
        if (!m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            l(str, true);
            return null;
        }
    }

    public final Method i(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.f14250h;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            l(str, false);
            return null;
        }
    }

    public final void j(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f;
        if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.f14250h;
            Method method = (Method) concurrentHashMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, method);
                } catch (Exception unused) {
                    l(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(atomicReference.get(), str);
                T2.G.m("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                l(str2, false);
            }
        }
    }

    public final void k(Context context, String str, String str2, Bundle bundle) {
        if (e(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e3) {
                U2.j.g("Invalid event ID: ".concat(String.valueOf(str2)), e3);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f;
            if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.f14250h;
                Method method = (Method) concurrentHashMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        l("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    l("logEventInternal", true);
                }
            }
        }
    }

    public final void l(String str, boolean z3) {
        AtomicBoolean atomicBoolean = this.f14247d;
        if (atomicBoolean.get()) {
            return;
        }
        U2.j.i("Invoke Firebase method " + str + " error.");
        if (z3) {
            U2.j.i("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    public final boolean m(Context context, String str, AtomicReference atomicReference, boolean z3) {
        if (atomicReference.get() == null) {
            try {
                Object invoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                while (!atomicReference.compareAndSet(null, invoke) && (atomicReference.get() == null || atomicReference.get() == null)) {
                }
            } catch (Exception unused) {
                l("getInstance", z3);
                return false;
            }
        }
        return true;
    }
}
