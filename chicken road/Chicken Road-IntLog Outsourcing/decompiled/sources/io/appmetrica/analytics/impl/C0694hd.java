package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694hd implements ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final T1 f8319a;

    public C0694hd(T1 t1) {
        this.f8319a = t1;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f8319a.b(new Uo(0, moduleServiceLifecycleObserver));
        this.f8319a.a(new Uo(1, moduleServiceLifecycleObserver));
    }
}
