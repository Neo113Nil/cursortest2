package io.appmetrica.analytics.idsync.impl;

/* renamed from: io.appmetrica.analytics.idsync.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211f extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.idsync.impl.h f3921a;

    public C0211f(io.appmetrica.analytics.idsync.impl.h hVar) {
        this.f3921a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.idsync.internal.model.IdSyncConfig idSyncConfig;
        if (this.f3921a.f3928f && (idSyncConfig = this.f3921a.f3927e) != null) {
            this.f3921a.getClass();
            if (io.appmetrica.analytics.idsync.impl.h.a(idSyncConfig)) {
                java.util.List<io.appmetrica.analytics.idsync.internal.model.RequestConfig> requests = idSyncConfig.getRequests();
                io.appmetrica.analytics.idsync.impl.h hVar = this.f3921a;
                java.util.Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f3926d.a((io.appmetrica.analytics.idsync.internal.model.RequestConfig) it.next());
                }
                io.appmetrica.analytics.idsync.impl.h hVar2 = this.f3921a;
                io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor = hVar2.f3925c;
                io.appmetrica.analytics.idsync.impl.C0211f c0211f = hVar2.f3929g;
                if (c0211f != null) {
                    iHandlerExecutor.executeDelayed(c0211f, hVar2.f3924b);
                } else {
                    kotlin.jvm.internal.i.i("syncRunnable");
                    throw null;
                }
            }
        }
    }
}
