package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oi {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.Revenue f4777a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Um f4778b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0315dn f4779c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0315dn f4780d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f4781e;

    public Oi(io.appmetrica.analytics.Revenue revenue, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4781e = publicLogger;
        this.f4777a = revenue;
        this.f4778b = new io.appmetrica.analytics.impl.Um(30720, "revenue payload", publicLogger);
        this.f4779c = new io.appmetrica.analytics.impl.C0315dn(new io.appmetrica.analytics.impl.Um(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f4780d = new io.appmetrica.analytics.impl.C0315dn(new io.appmetrica.analytics.impl.Xm(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
