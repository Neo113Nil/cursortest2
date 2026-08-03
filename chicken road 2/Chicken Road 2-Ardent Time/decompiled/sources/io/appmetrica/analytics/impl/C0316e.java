package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f5759g = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f5760h = "WatchDog-" + io.appmetrica.analytics.impl.ThreadFactoryC0874zd.f7184a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f5761a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f5762b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f5763c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0291d f5764d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f5765e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f5766f;

    public C0316e(io.appmetrica.analytics.impl.Db db) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        this.f5761a = copyOnWriteArrayList;
        this.f5762b = new java.util.concurrent.atomic.AtomicInteger();
        this.f5763c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f5765e = new java.util.concurrent.atomic.AtomicBoolean();
        this.f5766f = new F0.a(6, this);
        copyOnWriteArrayList.add(db);
    }

    public final /* synthetic */ void a() {
        this.f5765e.set(true);
    }

    public final synchronized void b() {
        io.appmetrica.analytics.impl.C0291d c0291d = this.f5764d;
        if (c0291d != null) {
            c0291d.f5680a.set(false);
            this.f5764d = null;
            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new java.lang.Object[0]);
        }
    }

    public final synchronized void a(int i2) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f5762b;
        int i3 = 5;
        if (i2 >= 5) {
            i3 = i2;
        }
        atomicInteger.set(i3);
        if (this.f5764d == null) {
            io.appmetrica.analytics.impl.C0291d c0291d = new io.appmetrica.analytics.impl.C0291d(this);
            this.f5764d = c0291d;
            try {
                c0291d.setName(f5760h);
            } catch (java.lang.SecurityException unused) {
            }
            this.f5764d.start();
            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", java.lang.Integer.valueOf(i2));
        }
    }
}
