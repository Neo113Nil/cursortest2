package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public interface Ca extends io.appmetrica.analytics.impl.Hc, io.appmetrica.analytics.impl.A6, io.appmetrica.analytics.impl.Ta {
    /* synthetic */ io.appmetrica.analytics.impl.Sa a();

    /* synthetic */ void a(int i2, android.os.Bundle bundle);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(android.location.Location location);

    void a(io.appmetrica.analytics.AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    void a(io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener);

    void a(io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(io.appmetrica.analytics.ReporterConfig reporterConfig);

    void a(io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List<java.lang.String> list);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(java.lang.String str);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(java.lang.String str, java.lang.String str2);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(boolean z2);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(boolean z2, boolean z3);

    void b(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig);

    io.appmetrica.analytics.impl.Ra c(io.appmetrica.analytics.ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void clearAppEnvironment();

    io.appmetrica.analytics.impl.X9 d();

    java.lang.String e();

    java.util.Map<java.lang.String, java.lang.String> g();

    io.appmetrica.analytics.AdvIdentifiersResult h();

    io.appmetrica.analytics.impl.C0458jc i();

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void putAppEnvironmentValue(java.lang.String str, java.lang.String str2);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void setDataSendingEnabled(boolean z2);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void setUserProfileID(java.lang.String str);
}
