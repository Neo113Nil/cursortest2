package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public interface ServiceContext {
    io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier getActivationBarrier();

    io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider getActiveNetworkTypeProvider();

    io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider getApplicationStateProvider();

    io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider getChargeTypeProvider();

    android.content.Context getContext();

    io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider getCryptoProvider();

    io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController getDataSendingRestrictionController();

    io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider getExecutorProvider();

    io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService getFirstExecutionConditionService();

    io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi getLocationServiceApi();

    io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController getModuleServiceLifecycleController();

    io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext getNetworkContext();

    io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor getPermissionExtractor();

    io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers getPlatformIdentifiers();

    io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider getSdkEnvironmentProvider();

    io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter getSelfReporter();

    io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle();

    io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider getServiceStorageProvider();

    io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock getServiceWakeLock();
}
