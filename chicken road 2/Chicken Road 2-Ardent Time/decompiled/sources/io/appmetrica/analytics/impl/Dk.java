package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dk {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f4219a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Uk f4220b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Gk f4221c;

    /* renamed from: d, reason: collision with root package name */
    public long f4222d;

    /* renamed from: e, reason: collision with root package name */
    public long f4223e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicLong f4224f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4225g;

    /* renamed from: h, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.Sk f4226h;

    /* renamed from: i, reason: collision with root package name */
    public long f4227i;

    /* renamed from: j, reason: collision with root package name */
    public long f4228j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f4229k;

    public Dk(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.Uk uk, io.appmetrica.analytics.impl.Gk gk, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f4219a = x4;
        this.f4220b = uk;
        this.f4221c = gk;
        this.f4229k = systemTimeProvider;
        a();
    }

    public final void a() {
        io.appmetrica.analytics.impl.Gk gk = this.f4221c;
        long elapsedRealtime = this.f4229k.elapsedRealtime();
        java.lang.Long l2 = gk.f4345c;
        if (l2 != null) {
            elapsedRealtime = l2.longValue();
        }
        this.f4223e = elapsedRealtime;
        java.lang.Long l3 = this.f4221c.f4344b;
        this.f4222d = l3 == null ? -1L : l3.longValue();
        java.lang.Long l4 = this.f4221c.f4347e;
        this.f4224f = new java.util.concurrent.atomic.AtomicLong(l4 == null ? 0L : l4.longValue());
        java.lang.Boolean bool = this.f4221c.f4348f;
        this.f4225g = bool == null ? true : bool.booleanValue();
        java.lang.Long l5 = this.f4221c.f4349g;
        long longValue = l5 != null ? l5.longValue() : 0L;
        this.f4227i = longValue;
        io.appmetrica.analytics.impl.Gk gk2 = this.f4221c;
        long j2 = longValue - this.f4223e;
        java.lang.Long l6 = gk2.f4350h;
        if (l6 != null) {
            j2 = l6.longValue();
        }
        this.f4228j = j2;
    }

    public final java.lang.String toString() {
        return "Session{id=" + this.f4222d + ", creationTime=" + this.f4223e + ", currentReportId=" + this.f4224f + ", sessionRequestParams=" + this.f4226h + ", sleepStart=" + this.f4227i + '}';
    }
}
