package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803wk implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle, io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f7032a = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    public final void onMainReporterCreated(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        java.util.Iterator it = this.f7032a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener) it.next()).onMainReporterCreated(serviceModuleReporterComponentContext);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle
    public final void subscribe(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener serviceModuleReporterComponentLifecycleListener) {
        this.f7032a.add(serviceModuleReporterComponentLifecycleListener);
    }
}
