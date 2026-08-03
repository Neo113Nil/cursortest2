package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback f3730a;

    public m(io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback activationBarrierCallback) {
        this.f3730a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3730a.onWaitFinished();
    }
}
