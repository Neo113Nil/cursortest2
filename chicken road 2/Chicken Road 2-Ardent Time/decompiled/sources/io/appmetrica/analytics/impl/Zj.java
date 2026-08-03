package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zj implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0580o4 f5435a;

    public Zj(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        this.f5435a = c0580o4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(this.f5435a.f6565m, java.lang.Boolean.TRUE)).booleanValue();
    }
}
