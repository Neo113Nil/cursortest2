package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper f3783a;

    public b(io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper) {
        this.f3783a = activationBarrierHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.coreutils.internal.services.a aVar;
        aVar = this.f3783a.f3779b;
        aVar.f3782b.f3778a = true;
        aVar.f3781a.run();
    }
}
