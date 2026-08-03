package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceContext f3923a;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f3925c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.n f3926d;

    /* renamed from: e, reason: collision with root package name */
    public volatile io.appmetrica.analytics.idsync.internal.model.IdSyncConfig f3927e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3928f;

    /* renamed from: b, reason: collision with root package name */
    public final long f3924b = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.C0211f f3929g = new io.appmetrica.analytics.idsync.impl.C0211f(this);

    public h(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers) {
        this.f3923a = serviceContext;
        this.f3925c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f3926d = new io.appmetrica.analytics.idsync.impl.n(serviceContext, new io.appmetrica.analytics.idsync.impl.G(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")), sdkIdentifiers);
    }

    public final synchronized void a(io.appmetrica.analytics.idsync.internal.model.IdSyncConfig idSyncConfig, io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers) {
        try {
            this.f3926d.f3955c = sdkIdentifiers;
            if (!kotlin.jvm.internal.i.a(this.f3927e, idSyncConfig)) {
                this.f3927e = idSyncConfig;
                if (a(idSyncConfig) && !this.f3928f) {
                    this.f3923a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f3925c, new io.appmetrica.analytics.idsync.impl.C0212g(this));
                    this.f3928f = true;
                } else if (!a(idSyncConfig) && this.f3928f) {
                    this.f3928f = false;
                    io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor = this.f3925c;
                    io.appmetrica.analytics.idsync.impl.C0211f c0211f = this.f3929g;
                    if (c0211f == null) {
                        kotlin.jvm.internal.i.i("syncRunnable");
                        throw null;
                    }
                    iHandlerExecutor.remove(c0211f);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public static boolean a(io.appmetrica.analytics.idsync.internal.model.IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }
}
