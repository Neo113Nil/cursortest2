package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ri1 {

    /* JADX INFO: renamed from: n */
    public static volatile ScheduledExecutorService f6844n;

    /* JADX INFO: renamed from: o */
    public static final Object f6845o = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f6846a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f6847b;

    /* JADX INFO: renamed from: c */
    public int f6848c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f6849d;

    /* JADX INFO: renamed from: e */
    public long f6850e;

    /* JADX INFO: renamed from: f */
    public final HashSet f6851f;

    /* JADX INFO: renamed from: g */
    public boolean f6852g;

    /* JADX INFO: renamed from: h */
    public wt1 f6853h;

    /* JADX INFO: renamed from: i */
    public final wa0 f6854i;

    /* JADX INFO: renamed from: j */
    public final String f6855j;

    /* JADX INFO: renamed from: k */
    public final HashMap f6856k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f6857l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f6858m;

    public ri1(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f6846a = new Object();
        this.f6848c = 0;
        this.f6851f = new HashSet();
        this.f6852g = true;
        this.f6854i = wa0.f8472l;
        this.f6856k = new HashMap();
        this.f6857l = new AtomicInteger(0);
        p80.m3861f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f6853h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f6855j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f6855j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C0694sj(sb.toString(), 11);
        }
        this.f6847b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = sk1.f7136a;
        synchronized (sk1.class) {
            Boolean bool = sk1.f7138c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = xe1.m5635c(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                sk1.f7138c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i = ya1.f9257a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoM1501d = tk1.m4792a(context).m1501d(packageName, 0);
                    if (applicationInfoM1501d == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoM1501d.uid;
                        workSource = new WorkSource();
                        Method method2 = sk1.f7137b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method3 = sk1.f7136a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f6847b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f6844n;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f6845o) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f6844n;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f6844n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f6858m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m4353a() {
        this.f6857l.incrementAndGet();
        long jMin = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.f6846a) {
            try {
                if (!m4354b()) {
                    this.f6853h = wt1.f8667j;
                    this.f6847b.acquire();
                    this.f6854i.getClass();
                    SystemClock.elapsedRealtime();
                }
                int i = 1;
                this.f6848c++;
                if (this.f6852g) {
                    TextUtils.isEmpty(null);
                }
                uu1 uu1Var = (uu1) this.f6856k.get(null);
                if (uu1Var == null) {
                    uu1Var = new uu1();
                    this.f6856k.put(null, uu1Var);
                }
                uu1Var.f7910a++;
                this.f6854i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
                if (j > this.f6850e) {
                    this.f6850e = j;
                    ScheduledFuture scheduledFuture = this.f6849d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f6849d = this.f6858m.schedule(new cm1(i, this), jMin, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4354b() {
        boolean z;
        synchronized (this.f6846a) {
            z = this.f6848c > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m4355c() {
        if (this.f6857l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f6855j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f6846a) {
            try {
                if (this.f6852g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f6856k.containsKey(null)) {
                    uu1 uu1Var = (uu1) this.f6856k.get(null);
                    if (uu1Var != null) {
                        int i = uu1Var.f7910a - 1;
                        uu1Var.f7910a = i;
                        if (i == 0) {
                            this.f6856k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f6855j).concat(" counter does not exist"));
                }
                m4357e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4356d() {
        HashSet hashSet = this.f6851f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        dd0.m1158c();
    }

    /* JADX INFO: renamed from: e */
    public final void m4357e() {
        synchronized (this.f6846a) {
            try {
                if (m4354b()) {
                    if (this.f6852g) {
                        int i = this.f6848c - 1;
                        this.f6848c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f6848c = 0;
                    }
                    m4356d();
                    Iterator it = this.f6856k.values().iterator();
                    while (it.hasNext()) {
                        ((uu1) it.next()).f7910a = 0;
                    }
                    this.f6856k.clear();
                    ScheduledFuture scheduledFuture = this.f6849d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f6849d = null;
                        this.f6850e = 0L;
                    }
                    if (this.f6847b.isHeld()) {
                        try {
                            try {
                                this.f6847b.release();
                                if (this.f6853h != null) {
                                    this.f6853h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.f6855j).concat(" failed to release!"), e);
                                if (this.f6853h != null) {
                                    this.f6853h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f6853h != null) {
                                this.f6853h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f6855j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
