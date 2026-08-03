package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class K3 implements io.appmetrica.analytics.impl.H5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4524a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.K5 f4525b = new io.appmetrica.analytics.impl.K5(new io.appmetrica.analytics.impl.C0426i5());

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0296d4 f4526c = new io.appmetrica.analytics.impl.C0296d4(io.appmetrica.analytics.impl.C0244b4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0225ab f4527d = new io.appmetrica.analytics.impl.C0225ab();

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0575o f4528e = io.appmetrica.analytics.impl.C0244b4.l().a();

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.I3 f4529f = new io.appmetrica.analytics.impl.I3();

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Qc f4530g = new io.appmetrica.analytics.impl.Qc();

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.J3 f4531h = new io.appmetrica.analytics.impl.J3();

    public K3(android.content.Context context) {
        this.f4524a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f4528e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator getClientActivator() {
        return this.f4529f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f4530g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider getClientStorageProvider() {
        return this.f4526c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final android.content.Context getContext() {
        return this.f4524a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f4527d;
    }

    @Override // io.appmetrica.analytics.impl.H5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final io.appmetrica.analytics.impl.J5 getModuleAdRevenueContext() {
        return this.f4525b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector getProcessDetector() {
        return this.f4531h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f4525b;
    }
}
