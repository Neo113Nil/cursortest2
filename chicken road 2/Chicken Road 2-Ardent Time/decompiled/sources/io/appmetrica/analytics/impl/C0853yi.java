package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853yi implements io.appmetrica.analytics.impl.InterfaceC0312dk {

    /* renamed from: e, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.C0827xi f7142e = new io.appmetrica.analytics.impl.C0827xi();

    /* renamed from: f, reason: collision with root package name */
    public static final long f7143f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f7144g;

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0602p0 f7145a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Yj f7146b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.TimeProvider f7147c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f7148d;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        f7143f = timeUnit.toMillis(1L);
        f7144g = timeUnit.toMillis(4L);
    }

    public C0853yi(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Yj yj, io.appmetrica.analytics.coreutils.internal.time.TimeProvider timeProvider) {
        this.f7145a = c0602p0;
        this.f7146b = yj;
        this.f7147c = timeProvider;
        this.f7148d = io.appmetrica.analytics.impl.C0244b4.l().g().b();
    }

    public final void a(io.appmetrica.analytics.impl.C0774vh c0774vh) {
        java.util.concurrent.Callable pg;
        io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor = this.f7148d;
        if (c0774vh.f6975b) {
            io.appmetrica.analytics.impl.Yj yj = this.f7146b;
            pg = new io.appmetrica.analytics.impl.C0272c6(yj.f5351a, yj.f5352b, yj.f5353c, c0774vh);
        } else {
            io.appmetrica.analytics.impl.Yj yj2 = this.f7146b;
            pg = new io.appmetrica.analytics.impl.Pg(yj2.f5352b, yj2.f5353c, c0774vh);
        }
        iCommonExecutor.submit(pg);
    }

    public final void b(io.appmetrica.analytics.impl.C0774vh c0774vh) {
        long uptimeMillis = this.f7147c.uptimeMillis();
        io.appmetrica.analytics.impl.Yj yj = this.f7146b;
        io.appmetrica.analytics.impl.C0272c6 c0272c6 = new io.appmetrica.analytics.impl.C0272c6(yj.f5351a, yj.f5352b, yj.f5353c, c0774vh);
        long j2 = kotlin.jvm.internal.i.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper()) ? f7143f : f7144g;
        if (this.f7145a.a()) {
            try {
                this.f7148d.submit(c0272c6).get(j2, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (c0272c6.f7117c) {
            return;
        }
        try {
            c0272c6.a();
            java.lang.Thread.sleep(java.lang.Math.max(0L, j2 - (this.f7147c.uptimeMillis() - uptimeMillis)));
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0312dk
    public final void reportData(int i2, android.os.Bundle bundle) {
        io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor = this.f7148d;
        io.appmetrica.analytics.impl.Yj yj = this.f7146b;
        iCommonExecutor.submit(new io.appmetrica.analytics.impl.Nn(yj.f5352b, yj.f5353c, i2, bundle));
    }

    public C0853yi(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Yj yj) {
        this(c0602p0, yj, new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }

    public final void a(io.appmetrica.analytics.impl.Bf bf) {
        io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor = this.f7148d;
        io.appmetrica.analytics.impl.Yj yj = this.f7146b;
        iCommonExecutor.submit(new io.appmetrica.analytics.impl.C0667re(yj.f5352b, yj.f5353c, bf));
    }

    public final void b(io.appmetrica.analytics.impl.Bf bf) {
        io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor = this.f7148d;
        io.appmetrica.analytics.impl.Yj yj = this.f7146b;
        iCommonExecutor.submit(new io.appmetrica.analytics.impl.Ei(yj.f5352b, yj.f5353c, bf));
    }
}
