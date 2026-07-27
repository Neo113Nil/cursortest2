package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* loaded from: classes.dex */
public final class a implements ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f6284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f6285b;

    public a(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, Runnable runnable) {
        this.f6285b = activationBarrierHelper;
        this.f6284a = runnable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f6285b.f6281a = true;
        this.f6284a.run();
    }
}
