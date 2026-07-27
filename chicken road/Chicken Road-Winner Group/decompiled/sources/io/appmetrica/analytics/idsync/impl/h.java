package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f5587a;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f5589c;

    /* renamed from: d, reason: collision with root package name */
    public final p f5590d;

    /* renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f5591e;
    public volatile boolean f;

    /* renamed from: b, reason: collision with root package name */
    public final long f5588b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public final f f5592g = new f(this);

    public h(ServiceContext serviceContext) {
        this.f5587a = serviceContext;
        this.f5589c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f5590d = new p(serviceContext, new B(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")));
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }

    public final synchronized void b(IdSyncConfig idSyncConfig) {
        try {
            if (!kotlin.jvm.internal.j.a(this.f5591e, idSyncConfig)) {
                this.f5591e = idSyncConfig;
                if (a(idSyncConfig) && !this.f) {
                    this.f5587a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f5589c, new g(this));
                    this.f = true;
                } else if (!a(idSyncConfig) && this.f) {
                    this.f = false;
                    IHandlerExecutor iHandlerExecutor = this.f5589c;
                    f fVar = this.f5592g;
                    if (fVar == null) {
                        kotlin.jvm.internal.j.g("syncRunnable");
                        throw null;
                    }
                    iHandlerExecutor.remove(fVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
