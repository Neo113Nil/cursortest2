package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* loaded from: classes.dex */
public final class Ak implements ServiceModuleReporterComponentContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0649fk f6538a;

    /* renamed from: b, reason: collision with root package name */
    public final C0623ek f6539b;

    /* JADX WARN: Multi-variable type inference failed */
    public Ak(C0608e5 c0608e5, C1047v4 c1047v4) {
        this.f6538a = new C0649fk(c0608e5, null, 2, 0 == true ? 1 : 0);
        this.f6539b = new C0623ek(c1047v4);
    }

    public final C0623ek a() {
        return this.f6539b;
    }

    public final C0649fk b() {
        return this.f6538a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f6539b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f6538a;
    }
}
