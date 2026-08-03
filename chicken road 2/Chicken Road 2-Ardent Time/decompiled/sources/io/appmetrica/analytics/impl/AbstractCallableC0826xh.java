package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC0826xh implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.C0800wh f7114d = new io.appmetrica.analytics.impl.C0800wh();

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0602p0 f7115a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Zk f7116b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7117c;

    public AbstractCallableC0826xh(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Zk zk) {
        this.f7115a = c0602p0;
        this.f7116b = zk;
    }

    public abstract void a(io.appmetrica.analytics.internal.IAppMetricaService iAppMetricaService);

    public void a(java.lang.Throwable th) {
    }

    public final io.appmetrica.analytics.impl.C0602p0 b() {
        return this.f7115a;
    }

    public boolean c() {
        io.appmetrica.analytics.impl.C0602p0 c0602p0 = this.f7115a;
        synchronized (c0602p0) {
            try {
                if (c0602p0.f6614d == null) {
                    c0602p0.f6615e = new java.util.concurrent.CountDownLatch(1);
                    android.content.Intent a2 = c0602p0.f6618h.a(c0602p0.f6611a);
                    try {
                        c0602p0.f6617g.b(c0602p0.f6611a);
                        c0602p0.f6611a.bindService(a2, c0602p0.f6620j, 1);
                    } catch (java.lang.Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f7115a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        a();
        return h1.C0177i.f3302a;
    }

    public final boolean d() {
        return this.f7117c;
    }

    public final void a(boolean z2) {
        this.f7117c = z2;
    }

    public void a() {
        io.appmetrica.analytics.internal.IAppMetricaService iAppMetricaService;
        try {
            if (this.f7117c) {
                return;
            }
            this.f7117c = true;
            int i2 = 0;
            do {
                io.appmetrica.analytics.impl.C0602p0 c0602p0 = this.f7115a;
                synchronized (c0602p0) {
                    iAppMetricaService = c0602p0.f6614d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        io.appmetrica.analytics.impl.Zk zk = this.f7116b;
                        if (zk != null && !((io.appmetrica.analytics.impl.C0438ii) zk).a()) {
                            return;
                        }
                        this.f7115a.c();
                        return;
                    } catch (android.os.RemoteException unused) {
                    }
                }
                i2++;
                if (!c() || io.appmetrica.analytics.impl.O1.f4753e.get()) {
                    return;
                }
            } while (i2 < 3);
        } catch (java.lang.Throwable th) {
            a(th);
        }
    }
}
