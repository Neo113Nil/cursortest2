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
    public final /* synthetic */ h f5585a;

    public f(h hVar) {
        this.f5585a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f5585a.f && (idSyncConfig = this.f5585a.f5591e) != null) {
            this.f5585a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f5585a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f5590d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f5585a;
                IHandlerExecutor iHandlerExecutor = hVar2.f5589c;
                f fVar = hVar2.f5592g;
                if (fVar != null) {
                    iHandlerExecutor.executeDelayed(fVar, hVar2.f5588b);
                } else {
                    kotlin.jvm.internal.j.g("syncRunnable");
                    throw null;
                }
            }
        }
    }
}
