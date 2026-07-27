package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* loaded from: classes.dex */
public final class g implements ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f5586a;

    public g(h hVar) {
        this.f5586a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        f fVar = this.f5586a.f5592g;
        if (fVar != null) {
            fVar.run();
        } else {
            kotlin.jvm.internal.j.g("syncRunnable");
            throw null;
        }
    }
}
