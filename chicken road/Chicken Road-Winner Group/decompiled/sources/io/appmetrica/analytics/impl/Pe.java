package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Pe implements Bc, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0980y9 f6419a;

    /* renamed from: b, reason: collision with root package name */
    public final Ac f6420b;

    /* renamed from: c, reason: collision with root package name */
    public final Ac f6421c;

    public Pe(InterfaceC0980y9 interfaceC0980y9, Vg vg, C0898v4 c0898v4, C0392bf c0392bf) {
        this.f6419a = interfaceC0980y9;
        Ac ac = new Ac(vg, c0898v4, c0392bf);
        this.f6420b = ac;
        this.f6421c = ac;
        if (ac.b()) {
            return;
        }
        C0878ua.k().a().subscribe(TimeUnit.SECONDS.toMillis(O7.f6352a.longValue()), C0878ua.k().x().e(), this);
    }

    @Override // io.appmetrica.analytics.impl.Bc
    public final K8 a() {
        return this.f6421c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f6420b.a();
        ((C0795r5) this.f6419a.a()).e();
    }
}
