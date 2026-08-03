package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0368g {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f5948a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Qk f5949b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Uk f5950c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Pk f5951d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ra f5952e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f5953f;

    public AbstractC0368g(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.Qk qk, io.appmetrica.analytics.impl.Uk uk, io.appmetrica.analytics.impl.Pk pk, io.appmetrica.analytics.impl.Ra ra, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f5948a = x4;
        this.f5949b = qk;
        this.f5950c = uk;
        this.f5951d = pk;
        this.f5952e = ra;
        this.f5953f = systemTimeProvider;
    }

    public final /* bridge */ io.appmetrica.analytics.impl.Dk a(java.lang.Object obj) {
        return a((io.appmetrica.analytics.impl.Ek) obj);
    }

    public final io.appmetrica.analytics.impl.Dk b() {
        if (this.f5950c.h()) {
            return new io.appmetrica.analytics.impl.Dk(this.f5948a, this.f5950c, a(), this.f5953f);
        }
        return null;
    }

    public final io.appmetrica.analytics.impl.Dk a(io.appmetrica.analytics.impl.Ek ek) {
        if (this.f5950c.h()) {
            this.f5952e.reportEvent("create session with non-empty storage");
        }
        io.appmetrica.analytics.impl.X4 x4 = this.f5948a;
        io.appmetrica.analytics.impl.Uk uk = this.f5950c;
        long a2 = this.f5949b.a();
        io.appmetrica.analytics.impl.Uk uk2 = this.f5950c;
        uk2.a(io.appmetrica.analytics.impl.Uk.f5086f, java.lang.Long.valueOf(a2));
        uk2.a(io.appmetrica.analytics.impl.Uk.f5084d, java.lang.Long.valueOf(ek.f4272a));
        uk2.a(io.appmetrica.analytics.impl.Uk.f5088h, java.lang.Long.valueOf(ek.f4272a));
        uk2.a(io.appmetrica.analytics.impl.Uk.f5087g, 0L);
        uk2.a(io.appmetrica.analytics.impl.Uk.f5089i, java.lang.Boolean.TRUE);
        uk2.b();
        this.f5948a.f5259e.a(a2, this.f5951d.f4849a, java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(ek.f4273b));
        return new io.appmetrica.analytics.impl.Dk(x4, uk, a(), new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }

    public final io.appmetrica.analytics.impl.Gk a() {
        io.appmetrica.analytics.impl.Fk fk = new io.appmetrica.analytics.impl.Fk(this.f5951d);
        fk.f4304g = this.f5950c.i();
        fk.f4303f = this.f5950c.f5092c.a(io.appmetrica.analytics.impl.Uk.f5087g);
        fk.f4301d = this.f5950c.f5092c.a(io.appmetrica.analytics.impl.Uk.f5088h);
        fk.f4300c = this.f5950c.f5092c.a(io.appmetrica.analytics.impl.Uk.f5086f);
        fk.f4305h = this.f5950c.f5092c.a(io.appmetrica.analytics.impl.Uk.f5084d);
        fk.f4298a = this.f5950c.f5092c.a(io.appmetrica.analytics.impl.Uk.f5085e);
        return new io.appmetrica.analytics.impl.Gk(fk);
    }
}
