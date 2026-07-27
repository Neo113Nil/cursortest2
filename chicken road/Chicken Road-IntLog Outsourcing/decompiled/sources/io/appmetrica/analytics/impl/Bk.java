package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class Bk implements ServiceModuleReporterComponentLifecycle, ServiceModuleReporterComponentLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f6612a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    public final void onMainReporterCreated(ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        Iterator it = this.f6612a.iterator();
        while (it.hasNext()) {
            ((ServiceModuleReporterComponentLifecycleListener) it.next()).onMainReporterCreated(serviceModuleReporterComponentContext);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle
    public final void subscribe(ServiceModuleReporterComponentLifecycleListener serviceModuleReporterComponentLifecycleListener) {
        this.f6612a.add(serviceModuleReporterComponentLifecycleListener);
    }
}
