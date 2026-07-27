package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991t0 implements Ia {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f9270a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f9271b;

    /* renamed from: c, reason: collision with root package name */
    public final C0788l4 f9272c;

    public C0991t0() {
        IHandlerExecutor a6 = C0736j4.l().g().a();
        this.f9271b = a6;
        this.f9270a = a6.getHandler();
        this.f9272c = new C0788l4();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(AppMetricaConfig appMetricaConfig, InterfaceC0511ab interfaceC0511ab) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Handler b() {
        return this.f9270a;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0528b2 c() {
        return new C0528b2();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0950rb d() {
        return new C0950rb();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final ICommonExecutor getDefaultExecutor() {
        return this.f9271b;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0788l4 a() {
        return this.f9272c;
    }
}
