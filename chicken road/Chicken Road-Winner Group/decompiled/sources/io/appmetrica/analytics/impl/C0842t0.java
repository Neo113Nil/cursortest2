package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842t0 implements Ia {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f8322a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f8323b;

    /* renamed from: c, reason: collision with root package name */
    public final C0639l4 f8324c;

    public C0842t0() {
        IHandlerExecutor a3 = C0587j4.l().g().a();
        this.f8323b = a3;
        this.f8322a = a3.getHandler();
        this.f8324c = new C0639l4();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(AppMetricaConfig appMetricaConfig, InterfaceC0362ab interfaceC0362ab) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Handler b() {
        return this.f8322a;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0379b2 c() {
        return new C0379b2();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0801rb d() {
        return new C0801rb();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final ICommonExecutor getDefaultExecutor() {
        return this.f8323b;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0639l4 a() {
        return this.f8324c;
    }
}
