package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class A0 implements io.appmetrica.analytics.impl.InterfaceC0795wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0 f4003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.AppMetricaConfig f4004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f4005c;

    public A0(io.appmetrica.analytics.impl.C0 c02, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4003a = c02;
        this.f4004b = appMetricaConfig;
        this.f4005c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0795wc
    public final io.appmetrica.analytics.impl.C0407hc a() {
        io.appmetrica.analytics.impl.C0 c02 = this.f4003a;
        io.appmetrica.analytics.impl.C0464ji c0464ji = c02.f4155g;
        io.appmetrica.analytics.AppMetricaConfig appMetricaConfig = this.f4004b;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4005c;
        io.appmetrica.analytics.impl.D7 d7 = c02.f4157i;
        return c0464ji.a(appMetricaConfig, publicLogger, new io.appmetrica.analytics.impl.C0498l0(d7.f4199j, d7.f4197h));
    }
}
