package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;

/* renamed from: io.appmetrica.analytics.impl.hk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701hk implements ServiceContext {

    /* renamed from: a, reason: collision with root package name */
    public final ModuleServiceLifecycleController f8331a;

    /* renamed from: b, reason: collision with root package name */
    public final Zd f8332b = new Zd(getContext());

    /* renamed from: c, reason: collision with root package name */
    public final C0668gd f8333c = new C0668gd();

    /* renamed from: d, reason: collision with root package name */
    public final Hk f8334d = new Hk(getContext(), new Gk(new V1()));

    /* renamed from: e, reason: collision with root package name */
    public final Dk f8335e = new Dk(getContext(), C1027ua.k().z(), C0662g7.a(getContext()).h());

    /* renamed from: f, reason: collision with root package name */
    public final F9 f8336f = new F9();

    /* renamed from: g, reason: collision with root package name */
    public final C1075w6 f8337g = new C1075w6();

    public C0701hk(ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f8331a = moduleServiceLifecycleController;
    }

    public final Zd a() {
        return this.f8332b;
    }

    public final C0668gd b() {
        return this.f8333c;
    }

    public final Dk c() {
        return this.f8335e;
    }

    public final Hk d() {
        return this.f8334d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActivationBarrier getActivationBarrier() {
        return C1027ua.f9366H.f9368B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActiveNetworkTypeProvider getActiveNetworkTypeProvider() {
        return C1027ua.f9366H.f9373G;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C1027ua.f9366H.l().f7138b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ChargeTypeProvider getChargeTypeProvider() {
        C1027ua c1027ua = C1027ua.f9366H;
        Z2 z22 = c1027ua.f9378e;
        if (z22 == null) {
            synchronized (c1027ua) {
                try {
                    z22 = c1027ua.f9378e;
                    if (z22 == null) {
                        z22 = new Z2(c1027ua.f9377d.a(), c1027ua.l().f7137a);
                        c1027ua.f9378e = z22;
                    }
                } finally {
                }
            }
        }
        return z22;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final Context getContext() {
        return C1027ua.f9366H.f9374a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final CryptoProvider getCryptoProvider() {
        return this.f8337g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C1027ua.f9366H.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ExecutorProvider getExecutorProvider() {
        return this.f8336f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C1027ua.f9366H.f9368B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final LocationServiceApi getLocationServiceApi() {
        return C1027ua.f9366H.m();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f8331a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f8332b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PermissionExtractor getPermissionExtractor() {
        return C1027ua.f9366H.j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C1027ua.f9366H.s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C1027ua.f9366H.v();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f8333c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle() {
        return C1027ua.f9366H.f9372F;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f8335e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f8334d;
    }
}
