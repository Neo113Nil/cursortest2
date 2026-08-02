package Dc;

import Kc.C3493a;
import io.reactivex.x;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public class h extends x.c {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f6377a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f6378b;

    public h(i iVar) {
        boolean z11 = n.f6387a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, iVar);
        if (n.f6387a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            n.f6390d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f6377a = newScheduledThreadPool;
    }

    @Override // io.reactivex.x.c
    public final InterfaceC8487b a(Runnable runnable) {
        return b(runnable, 0L, null);
    }

    @Override // io.reactivex.x.c
    public final InterfaceC8487b b(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f6378b ? rc.e.INSTANCE : d(runnable, j11, timeUnit, null);
    }

    public final l d(Runnable runnable, long j11, TimeUnit timeUnit, rc.c cVar) {
        l lVar = new l(runnable, cVar);
        if (cVar == null || cVar.a(lVar)) {
            ScheduledExecutorService scheduledExecutorService = this.f6377a;
            try {
                lVar.a(j11 <= 0 ? scheduledExecutorService.submit((Callable) lVar) : scheduledExecutorService.schedule((Callable) lVar, j11, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e11) {
                if (cVar != null) {
                    cVar.c(lVar);
                }
                C3493a.f(e11);
            }
        }
        return lVar;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        if (this.f6378b) {
            return;
        }
        this.f6378b = true;
        this.f6377a.shutdownNow();
    }

    public final InterfaceC8487b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        k kVar = new k(runnable);
        ScheduledExecutorService scheduledExecutorService = this.f6377a;
        try {
            kVar.a(j11 <= 0 ? scheduledExecutorService.submit(kVar) : scheduledExecutorService.schedule(kVar, j11, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e11) {
            C3493a.f(e11);
            return rc.e.INSTANCE;
        }
    }

    public final InterfaceC8487b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        if (j12 > 0) {
            j jVar = new j(runnable);
            try {
                jVar.a(this.f6377a.scheduleAtFixedRate(jVar, j11, j12, timeUnit));
                return jVar;
            } catch (RejectedExecutionException e11) {
                C3493a.f(e11);
                return rc.e.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f6377a;
        e eVar = new e(runnable, scheduledExecutorService);
        try {
            eVar.a(j11 <= 0 ? scheduledExecutorService.submit(eVar) : scheduledExecutorService.schedule(eVar, j11, timeUnit));
            return eVar;
        } catch (RejectedExecutionException e12) {
            C3493a.f(e12);
            return rc.e.INSTANCE;
        }
    }

    public final void g() {
        if (this.f6378b) {
            return;
        }
        this.f6378b = true;
        this.f6377a.shutdown();
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f6378b;
    }
}
