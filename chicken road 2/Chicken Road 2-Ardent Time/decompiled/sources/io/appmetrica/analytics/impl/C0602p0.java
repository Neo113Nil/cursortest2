package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602p0 {

    /* renamed from: k, reason: collision with root package name */
    public static final long f6610k = java.util.concurrent.TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6611a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f6612b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6613c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.internal.IAppMetricaService f6614d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f6615e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f6616f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.F1 f6617g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.G1 f6618h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.RunnableC0550n0 f6619i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.ServiceConnectionC0576o0 f6620j;

    public C0602p0(android.content.Context context, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, io.appmetrica.analytics.impl.C0244b4.l().e(), new io.appmetrica.analytics.impl.G1());
    }

    public final synchronized boolean a() {
        return this.f6614d != null;
    }

    public final void b() {
        synchronized (this.f6616f) {
            this.f6612b.remove(this.f6619i);
        }
    }

    public final void c() {
        io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor = this.f6612b;
        synchronized (this.f6616f) {
            try {
                iCommonExecutor.remove(this.f6619i);
                if (!this.f6613c) {
                    iCommonExecutor.executeDelayed(this.f6619i, f6610k);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void a(java.lang.Long l2) {
        try {
            synchronized (this) {
                try {
                    java.util.concurrent.CountDownLatch countDownLatch = this.f6615e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l2.longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public C0602p0(android.content.Context context, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.impl.F1 f12, io.appmetrica.analytics.impl.G1 g12) {
        this.f6614d = null;
        this.f6616f = new java.lang.Object();
        this.f6619i = new io.appmetrica.analytics.impl.RunnableC0550n0(this);
        this.f6620j = new io.appmetrica.analytics.impl.ServiceConnectionC0576o0(this);
        this.f6611a = context.getApplicationContext();
        this.f6612b = iCommonExecutor;
        this.f6613c = false;
        this.f6617g = f12;
        this.f6618h = g12;
    }
}
