package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474ek implements ServiceComponentModuleConfig {

    /* renamed from: a, reason: collision with root package name */
    public final C0898v4 f7261a;

    public C0474ek(C0898v4 c0898v4) {
        this.f7261a = c0898v4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f7261a.f8484m, Boolean.TRUE)).booleanValue();
    }
}
