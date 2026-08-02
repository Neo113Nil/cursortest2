package Dc;

import Kc.C3493a;
import io.reactivex.x;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class o extends x {

    /* renamed from: c, reason: collision with root package name */
    static final i f6391c;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f6392b;

    /* loaded from: classes9.dex */
    static final class a extends x.c {

        /* renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f6393a;

        /* renamed from: b, reason: collision with root package name */
        final C8486a f6394b = new C8486a();

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f6395c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f6393a = scheduledExecutorService;
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b b(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (this.f6395c) {
                return rc.e.INSTANCE;
            }
            l lVar = new l(runnable, this.f6394b);
            this.f6394b.a(lVar);
            try {
                lVar.a(j11 <= 0 ? this.f6393a.submit((Callable) lVar) : this.f6393a.schedule((Callable) lVar, j11, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e11) {
                dispose();
                C3493a.f(e11);
                return rc.e.INSTANCE;
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f6395c) {
                return;
            }
            this.f6395c = true;
            this.f6394b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f6395c;
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f6391c = new i("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public o() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f6392b = atomicReference;
        boolean z11 = n.f6387a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, f6391c);
        if (n.f6387a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            n.f6390d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // io.reactivex.x
    public final x.c b() {
        return new a(this.f6392b.get());
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        k kVar = new k(runnable);
        AtomicReference<ScheduledExecutorService> atomicReference = this.f6392b;
        try {
            kVar.a(j11 <= 0 ? atomicReference.get().submit(kVar) : atomicReference.get().schedule(kVar, j11, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e11) {
            C3493a.f(e11);
            return rc.e.INSTANCE;
        }
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        AtomicReference<ScheduledExecutorService> atomicReference = this.f6392b;
        if (j12 > 0) {
            j jVar = new j(runnable);
            try {
                jVar.a(atomicReference.get().scheduleAtFixedRate(jVar, j11, j12, timeUnit));
                return jVar;
            } catch (RejectedExecutionException e11) {
                C3493a.f(e11);
                return rc.e.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = atomicReference.get();
        e eVar = new e(runnable, scheduledExecutorService);
        try {
            eVar.a(j11 <= 0 ? scheduledExecutorService.submit(eVar) : scheduledExecutorService.schedule(eVar, j11, timeUnit));
            return eVar;
        } catch (RejectedExecutionException e12) {
            C3493a.f(e12);
            return rc.e.INSTANCE;
        }
    }
}
