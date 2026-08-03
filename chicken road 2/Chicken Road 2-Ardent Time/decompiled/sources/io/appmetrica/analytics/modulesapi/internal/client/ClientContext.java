package io.appmetrica.analytics.modulesapi.internal.client;

/* loaded from: classes.dex */
public interface ClientContext {
    io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry getActivityLifecycleRegistry();

    io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator getClientActivator();

    io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider getClientExecutorProvider();

    io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider getClientStorageProvider();

    android.content.Context getContext();

    io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade getInternalClientModuleFacade();

    io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext getModuleAdRevenueContext();

    io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector getProcessDetector();
}
