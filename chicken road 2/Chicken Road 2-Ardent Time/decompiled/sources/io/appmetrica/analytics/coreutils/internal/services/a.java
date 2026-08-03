package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public final class a implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f3781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper f3782b;

    public a(io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, java.lang.Runnable runnable) {
        this.f3782b = activationBarrierHelper;
        this.f3781a = runnable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f3782b.f3778a = true;
        this.f3781a.run();
    }
}
