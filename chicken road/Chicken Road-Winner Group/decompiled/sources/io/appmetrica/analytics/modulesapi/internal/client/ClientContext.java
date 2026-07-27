package io.appmetrica.analytics.modulesapi.internal.client;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;

/* loaded from: classes.dex */
public interface ClientContext {
    ActivityLifecycleRegistry getActivityLifecycleRegistry();

    ModuleClientActivator getClientActivator();

    ModuleClientExecutorProvider getClientExecutorProvider();

    ClientStorageProvider getClientStorageProvider();

    Context getContext();

    InternalClientModuleFacade getInternalClientModuleFacade();

    ModuleAdRevenueContext getModuleAdRevenueContext();

    ProcessDetector getProcessDetector();
}
