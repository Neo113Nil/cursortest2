package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* loaded from: classes.dex */
public final class Ak implements ServiceModuleReporterComponentContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0500fk f5707a;

    /* renamed from: b, reason: collision with root package name */
    public final C0474ek f5708b;

    /* JADX WARN: Multi-variable type inference failed */
    public Ak(C0459e5 c0459e5, C0898v4 c0898v4) {
        this.f5707a = new C0500fk(c0459e5, null, 2, 0 == true ? 1 : 0);
        this.f5708b = new C0474ek(c0898v4);
    }

    public final C0474ek a() {
        return this.f5708b;
    }

    public final C0500fk b() {
        return this.f5707a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f5708b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f5707a;
    }
}
