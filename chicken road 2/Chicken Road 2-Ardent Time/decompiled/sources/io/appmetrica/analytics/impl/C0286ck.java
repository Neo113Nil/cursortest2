package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286ck implements io.appmetrica.analytics.modulesapi.internal.service.ServiceContext {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController f5667a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Sd f5668b = new io.appmetrica.analytics.impl.Sd(getContext());

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Zc f5669c = new io.appmetrica.analytics.impl.Zc();

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ck f5670d = new io.appmetrica.analytics.impl.Ck(getContext(), new io.appmetrica.analytics.impl.Bk(new io.appmetrica.analytics.impl.M1()));

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0881zk f5671e = new io.appmetrica.analytics.impl.C0881zk(getContext(), io.appmetrica.analytics.impl.C0560na.k().y(), io.appmetrica.analytics.impl.C0560na.k().B().f(getContext()));

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0844y9 f5672f = new io.appmetrica.analytics.impl.C0844y9();

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0608p6 f5673g = new io.appmetrica.analytics.impl.C0608p6();

    public C0286ck(io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f5667a = moduleServiceLifecycleController;
    }

    public final io.appmetrica.analytics.impl.Sd a() {
        return this.f5668b;
    }

    public final io.appmetrica.analytics.impl.Zc b() {
        return this.f5669c;
    }

    public final io.appmetrica.analytics.impl.C0881zk c() {
        return this.f5671e;
    }

    public final io.appmetrica.analytics.impl.Ck d() {
        return this.f5670d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier getActivationBarrier() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.f6486B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider getActiveNetworkTypeProvider() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.G;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider getApplicationStateProvider() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.l().f4288b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider getChargeTypeProvider() {
        io.appmetrica.analytics.impl.C0560na c0560na = io.appmetrica.analytics.impl.C0560na.f6484I;
        io.appmetrica.analytics.impl.R2 r2 = c0560na.f6496e;
        if (r2 == null) {
            synchronized (c0560na) {
                try {
                    r2 = c0560na.f6496e;
                    if (r2 == null) {
                        r2 = new io.appmetrica.analytics.impl.R2(c0560na.f6495d.a(), c0560na.l().f4287a);
                        c0560na.f6496e = r2;
                    }
                } finally {
                }
            }
        }
        return r2;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final android.content.Context getContext() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.f6492a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider getCryptoProvider() {
        return this.f5673g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController getDataSendingRestrictionController() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider getExecutorProvider() {
        return this.f5672f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService getFirstExecutionConditionService() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.f6486B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi getLocationServiceApi() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.m();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f5667a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext getNetworkContext() {
        return this.f5668b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor getPermissionExtractor() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers getPlatformIdentifiers() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.v();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter getSelfReporter() {
        return this.f5669c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.f6490F;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider getServiceStorageProvider() {
        return this.f5671e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock getServiceWakeLock() {
        return this.f5670d;
    }
}
