package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public interface Ia extends io.appmetrica.analytics.impl.Da, io.appmetrica.analytics.impl.Hc {
    void a(android.app.Activity activity);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(android.location.Location location);

    void a(io.appmetrica.analytics.AnrListener anrListener);

    void a(io.appmetrica.analytics.ExternalAttribution externalAttribution);

    void a(io.appmetrica.analytics.impl.Ho ho);

    void a(io.appmetrica.analytics.impl.EnumC0549n enumC0549n);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(java.lang.String str);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(java.lang.String str, java.lang.String str2);

    void a(java.lang.String str, boolean z2);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(boolean z2);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(boolean z2, boolean z3);

    void b(android.app.Activity activity);

    @Override // io.appmetrica.analytics.impl.Da
    /* synthetic */ void b(java.lang.String str);

    @Override // io.appmetrica.analytics.impl.Da
    /* synthetic */ void b(java.lang.String str, java.lang.String str2);

    @Override // io.appmetrica.analytics.impl.Da
    /* synthetic */ boolean b();

    void c();

    java.util.List<java.lang.String> f();
}
