package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6408a;

    public f(h hVar) {
        this.f6408a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f6408a.f6415f && (idSyncConfig = this.f6408a.f6414e) != null) {
            this.f6408a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f6408a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f6413d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f6408a;
                IHandlerExecutor iHandlerExecutor = hVar2.f6412c;
                f fVar = hVar2.f6416g;
                if (fVar != null) {
                    iHandlerExecutor.executeDelayed(fVar, hVar2.f6411b);
                } else {
                    kotlin.jvm.internal.i.l("syncRunnable");
                    throw null;
                }
            }
        }
    }
}
