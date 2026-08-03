package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Cc {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Xm f4166a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Xm f4167b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0528m4 f4168c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f4169d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f4170e;

    public Cc(java.lang.String str, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this(new io.appmetrica.analytics.impl.C0528m4(30), new io.appmetrica.analytics.impl.Xm(50, str.concat("map key"), publicLogger), new io.appmetrica.analytics.impl.Xm(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Cc(io.appmetrica.analytics.impl.C0528m4 c0528m4, io.appmetrica.analytics.impl.Xm xm, io.appmetrica.analytics.impl.Xm xm2, java.lang.String str, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4168c = c0528m4;
        this.f4166a = xm;
        this.f4167b = xm2;
        this.f4170e = str;
        this.f4169d = publicLogger;
    }
}
