package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227ad implements io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.J1 f5474a;

    public C0227ad(io.appmetrica.analytics.impl.J1 j12) {
        this.f5474a = j12;
    }

    public static final void a(io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, android.content.Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, android.content.Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f5474a.b(new io.appmetrica.analytics.impl.Wo(0, moduleServiceLifecycleObserver));
        this.f5474a.a(new io.appmetrica.analytics.impl.Wo(1, moduleServiceLifecycleObserver));
    }
}
