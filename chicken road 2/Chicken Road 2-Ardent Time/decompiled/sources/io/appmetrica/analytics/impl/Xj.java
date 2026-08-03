package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xj {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f5309a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Ze f5310b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.coreutils.internal.time.TimeProvider f5311c;

    public static io.appmetrica.analytics.impl.Xj c() {
        return io.appmetrica.analytics.impl.Wj.f5222a;
    }

    public final synchronized long a() {
        return (java.lang.System.currentTimeMillis() / 1000) + this.f5309a;
    }

    public final synchronized void b() {
        this.f5310b.d(false);
        this.f5310b.b();
    }

    public final synchronized long d() {
        return this.f5309a;
    }

    public final synchronized void e() {
        a(io.appmetrica.analytics.impl.C0560na.f6484I.y(), new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f5310b.b(true);
    }

    public final synchronized void a(long j2, java.lang.Long l2) {
        try {
            this.f5309a = (j2 - this.f5311c.currentTimeMillis()) / 1000;
            boolean z2 = true;
            if (this.f5310b.b(true)) {
                if (l2 != null) {
                    long abs = java.lang.Math.abs(j2 - this.f5311c.currentTimeMillis());
                    io.appmetrica.analytics.impl.Ze ze = this.f5310b;
                    if (abs <= java.util.concurrent.TimeUnit.SECONDS.toMillis(l2.longValue())) {
                        z2 = false;
                    }
                    ze.d(z2);
                } else {
                    this.f5310b.d(false);
                }
            }
            this.f5310b.d(this.f5309a);
            this.f5310b.b();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void a(io.appmetrica.analytics.impl.Ze ze, io.appmetrica.analytics.coreutils.internal.time.TimeProvider timeProvider) {
        this.f5310b = ze;
        this.f5309a = ze.a(0);
        this.f5311c = timeProvider;
    }
}
