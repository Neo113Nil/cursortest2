package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* loaded from: classes.dex */
public final class g implements ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6409a;

    public g(h hVar) {
        this.f6409a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        f fVar = this.f6409a.f6416g;
        if (fVar != null) {
            fVar.run();
        } else {
            kotlin.jvm.internal.i.l("syncRunnable");
            throw null;
        }
    }
}
