package Dc;

import Cc.C2738a;
import Kc.C3493a;
import io.reactivex.x;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class d extends x {

    /* renamed from: c, reason: collision with root package name */
    static final x f6336c = Mc.a.c();

    /* renamed from: b, reason: collision with root package name */
    final ExecutorService f6337b;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f6338a;

        a(b bVar) {
            this.f6338a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f6338a;
            rc.h hVar = bVar.f6341b;
            InterfaceC8487b d11 = d.this.d(bVar);
            hVar.getClass();
            rc.d.d(hVar, d11);
        }
    }

    static final class b extends AtomicReference<Runnable> implements Runnable, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final rc.h f6340a;

        /* renamed from: b, reason: collision with root package name */
        final rc.h f6341b;

        b(Runnable runnable) {
            super(runnable);
            this.f6340a = new rc.h();
            this.f6341b = new rc.h();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (getAndSet(null) != null) {
                rc.h hVar = this.f6340a;
                hVar.getClass();
                rc.d.a(hVar);
                rc.h hVar2 = this.f6341b;
                hVar2.getClass();
                rc.d.a(hVar2);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            rc.h hVar = this.f6341b;
            rc.h hVar2 = this.f6340a;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    rc.d dVar = rc.d.DISPOSED;
                    hVar2.lazySet(dVar);
                    hVar.lazySet(dVar);
                } catch (Throwable th2) {
                    lazySet(null);
                    hVar2.lazySet(rc.d.DISPOSED);
                    hVar.lazySet(rc.d.DISPOSED);
                    throw th2;
                }
            }
        }
    }

    public static final class c extends x.c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final ExecutorService f6342a;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f6344c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f6345d = new AtomicInteger();

        /* renamed from: e, reason: collision with root package name */
        final C8486a f6346e = new C8486a();

        /* renamed from: b, reason: collision with root package name */
        final C2738a<Runnable> f6343b = new C2738a<>();

        static final class a extends AtomicBoolean implements Runnable, InterfaceC8487b {

            /* renamed from: a, reason: collision with root package name */
            final Runnable f6347a;

            a(Runnable runnable) {
                this.f6347a = runnable;
            }

            @Override // nc.InterfaceC8487b
            public final void dispose() {
                lazySet(true);
            }

            @Override // nc.InterfaceC8487b
            public final boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f6347a.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final rc.h f6348a;

            /* renamed from: b, reason: collision with root package name */
            private final Runnable f6349b;

            b(rc.h hVar, Runnable runnable) {
                this.f6348a = hVar;
                this.f6349b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8487b a11 = c.this.a(this.f6349b);
                rc.h hVar = this.f6348a;
                hVar.getClass();
                rc.d.d(hVar, a11);
            }
        }

        public c(ExecutorService executorService) {
            this.f6342a = executorService;
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b a(Runnable runnable) {
            if (this.f6344c) {
                return rc.e.INSTANCE;
            }
            a aVar = new a(runnable);
            this.f6343b.offer(aVar);
            if (this.f6345d.getAndIncrement() != 0) {
                return aVar;
            }
            try {
                this.f6342a.execute(this);
                return aVar;
            } catch (RejectedExecutionException e11) {
                this.f6344c = true;
                this.f6343b.clear();
                C3493a.f(e11);
                return rc.e.INSTANCE;
            }
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b b(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (j11 <= 0) {
                return a(runnable);
            }
            if (this.f6344c) {
                return rc.e.INSTANCE;
            }
            rc.h hVar = new rc.h();
            rc.h hVar2 = new rc.h(hVar);
            l lVar = new l(new b(hVar2, runnable), this.f6346e);
            this.f6346e.a(lVar);
            ExecutorService executorService = this.f6342a;
            if (executorService instanceof ScheduledExecutorService) {
                try {
                    lVar.a(((ScheduledExecutorService) executorService).schedule((Callable) lVar, j11, timeUnit));
                } catch (RejectedExecutionException e11) {
                    this.f6344c = true;
                    C3493a.f(e11);
                    return rc.e.INSTANCE;
                }
            } else {
                lVar.a(new Dc.c(d.f6336c.e(lVar, j11, timeUnit)));
            }
            rc.d.d(hVar, lVar);
            return hVar2;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f6344c) {
                return;
            }
            this.f6344c = true;
            this.f6346e.dispose();
            if (this.f6345d.getAndIncrement() == 0) {
                this.f6343b.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f6344c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2738a<Runnable> c2738a = this.f6343b;
            int i11 = 1;
            while (!this.f6344c) {
                do {
                    Runnable poll = c2738a.poll();
                    if (poll != null) {
                        poll.run();
                    } else if (this.f6344c) {
                        c2738a.clear();
                        return;
                    } else {
                        i11 = this.f6345d.addAndGet(-i11);
                        if (i11 == 0) {
                            return;
                        }
                    }
                } while (!this.f6344c);
                c2738a.clear();
                return;
            }
            c2738a.clear();
        }
    }

    public d(ExecutorService executorService) {
        this.f6337b = executorService;
    }

    @Override // io.reactivex.x
    public final x.c b() {
        return new c(this.f6337b);
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b d(Runnable runnable) {
        ExecutorService executorService = this.f6337b;
        try {
            if (executorService != null) {
                k kVar = new k(runnable);
                kVar.a(executorService.submit(kVar));
                return kVar;
            }
            c.a aVar = new c.a(runnable);
            executorService.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e11) {
            C3493a.f(e11);
            return rc.e.INSTANCE;
        }
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        ExecutorService executorService = this.f6337b;
        if (executorService instanceof ScheduledExecutorService) {
            try {
                k kVar = new k(runnable);
                kVar.a(((ScheduledExecutorService) executorService).schedule(kVar, j11, timeUnit));
                return kVar;
            } catch (RejectedExecutionException e11) {
                C3493a.f(e11);
                return rc.e.INSTANCE;
            }
        }
        b bVar = new b(runnable);
        InterfaceC8487b e12 = f6336c.e(new a(bVar), j11, timeUnit);
        rc.h hVar = bVar.f6340a;
        hVar.getClass();
        rc.d.d(hVar, e12);
        return bVar;
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        ExecutorService executorService = this.f6337b;
        if (!(executorService instanceof ScheduledExecutorService)) {
            return super.f(runnable, j11, j12, timeUnit);
        }
        try {
            j jVar = new j(runnable);
            jVar.a(((ScheduledExecutorService) executorService).scheduleAtFixedRate(jVar, j11, j12, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e11) {
            C3493a.f(e11);
            return rc.e.INSTANCE;
        }
    }
}
