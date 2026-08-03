package io.appmetrica.analytics.idsync.impl;

/* renamed from: io.appmetrica.analytics.idsync.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212g implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.idsync.impl.h f3922a;

    public C0212g(io.appmetrica.analytics.idsync.impl.h hVar) {
        this.f3922a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        io.appmetrica.analytics.idsync.impl.C0211f c0211f = this.f3922a.f3929g;
        if (c0211f != null) {
            c0211f.run();
        } else {
            kotlin.jvm.internal.i.i("syncRunnable");
            throw null;
        }
    }
}
