package H1;

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
import o1.u;
import s1.C1419a;
import s1.c;
import s1.d;
import u1.C1478b;
import v.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f1120n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f1121o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f1122p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1123a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f1124b;

    /* renamed from: c, reason: collision with root package name */
    public int f1125c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f1126d;

    /* renamed from: e, reason: collision with root package name */
    public long f1127e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f1128f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1129g;

    /* renamed from: h, reason: collision with root package name */
    public C1.a f1130h;

    /* renamed from: i, reason: collision with root package name */
    public final C1419a f1131i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1132j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f1133k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f1134l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f1135m;

    public a(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.f1123a = new Object();
        this.f1125c = 0;
        this.f1128f = new HashSet();
        this.f1129g = true;
        this.f1131i = C1419a.f11800a;
        this.f1133k = new HashMap();
        this.f1134l = new AtomicInteger(0);
        u.d("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f1130h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f1132j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f1132j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C1.b(sb.toString());
        }
        this.f1124b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = d.f11809a;
        synchronized (d.class) {
            Boolean bool = d.f11811c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = f.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                d.f11811c = Boolean.valueOf(z);
            }
        }
        if (z) {
            int i2 = c.f11808a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = ((Context) C1478b.a(context).f3053a).getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i3 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = d.f11810b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i3), packageName);
                            } catch (Exception e3) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                            }
                        } else {
                            Method method3 = d.f11809a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i3));
                                } catch (Exception e6) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e6);
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
                    this.f1124b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                    Log.wtf("WakeLock", e7.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f1121o;
        if (scheduledExecutorService == null) {
            synchronized (f1122p) {
                try {
                    scheduledExecutorService = f1121o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f1121o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f1135m = scheduledExecutorService;
    }

    public final void a(long j2) {
        this.f1134l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f1120n), 1L);
        if (j2 > 0) {
            max = Math.min(j2, max);
        }
        synchronized (this.f1123a) {
            try {
                if (!b()) {
                    this.f1130h = C1.a.f385a;
                    this.f1124b.acquire();
                    this.f1131i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f1125c++;
                if (this.f1129g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f1133k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f1133k.put(null, bVar);
                }
                bVar.f1136a++;
                this.f1131i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j6 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j6 > this.f1127e) {
                    this.f1127e = j6;
                    ScheduledFuture scheduledFuture = this.f1126d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f1126d = this.f1135m.schedule(new B.a(2, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f1123a) {
            z = this.f1125c > 0;
        }
        return z;
    }

    public final void c() {
        if (this.f1134l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f1132j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f1123a) {
            try {
                if (this.f1129g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f1133k.containsKey(null)) {
                    b bVar = (b) this.f1133k.get(null);
                    if (bVar != null) {
                        int i2 = bVar.f1136a - 1;
                        bVar.f1136a = i2;
                        if (i2 == 0) {
                            this.f1133k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f1132j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f1128f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f1123a) {
            try {
                if (b()) {
                    if (this.f1129g) {
                        int i2 = this.f1125c - 1;
                        this.f1125c = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.f1125c = 0;
                    }
                    d();
                    Iterator it = this.f1133k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f1136a = 0;
                    }
                    this.f1133k.clear();
                    ScheduledFuture scheduledFuture = this.f1126d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f1126d = null;
                        this.f1127e = 0L;
                    }
                    if (this.f1124b.isHeld()) {
                        try {
                            try {
                                this.f1124b.release();
                                if (this.f1130h != null) {
                                    this.f1130h = null;
                                }
                            } catch (RuntimeException e3) {
                                if (!e3.getClass().equals(RuntimeException.class)) {
                                    throw e3;
                                }
                                Log.e("WakeLock", String.valueOf(this.f1132j).concat(" failed to release!"), e3);
                                if (this.f1130h != null) {
                                    this.f1130h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f1130h != null) {
                                this.f1130h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f1132j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
