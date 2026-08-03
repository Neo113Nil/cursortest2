package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355fc extends io.appmetrica.analytics.impl.Wn {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.AppMetricaConfig f5885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355fc(io.appmetrica.analytics.impl.Ta ta, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        super(ta);
        java.lang.String str = appMetricaConfig.apiKey;
        this.f5885b = appMetricaConfig;
    }

    public final io.appmetrica.analytics.impl.Ua a() {
        return this.f5246a.a().a(this.f5885b);
    }
}
