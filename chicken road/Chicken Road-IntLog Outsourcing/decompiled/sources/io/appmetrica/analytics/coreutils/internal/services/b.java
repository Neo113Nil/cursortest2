package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f6286a;

    public b(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper) {
        this.f6286a = activationBarrierHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        aVar = this.f6286a.f6282b;
        aVar.f6285b.f6281a = true;
        aVar.f6284a.run();
    }
}
