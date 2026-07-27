package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623ek implements ServiceComponentModuleConfig {

    /* renamed from: a, reason: collision with root package name */
    public final C1047v4 f8156a;

    public C0623ek(C1047v4 c1047v4) {
        this.f8156a = c1047v4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f8156a.f9438m, Boolean.TRUE)).booleanValue();
    }
}
