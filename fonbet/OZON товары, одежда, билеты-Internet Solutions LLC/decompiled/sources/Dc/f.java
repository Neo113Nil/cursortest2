package Dc;

import io.reactivex.x;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class f extends x {

    /* renamed from: c, reason: collision with root package name */
    static final i f6357c;

    /* renamed from: d, reason: collision with root package name */
    static final i f6358d;

    /* renamed from: g, reason: collision with root package name */
    static final c f6361g;

    /* renamed from: h, reason: collision with root package name */
    static final a f6362h;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a> f6363b;

    /* renamed from: f, reason: collision with root package name */
    private static final TimeUnit f6360f = TimeUnit.SECONDS;

    /* renamed from: e, reason: collision with root package name */
    private static final long f6359e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f6364a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f6365b;

        /* renamed from: c, reason: collision with root package name */
        final C8486a f6366c;

        /* renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f6367d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledFuture f6368e;

        /* renamed from: f, reason: collision with root package name */
        private final i f6369f;

        a(long j11, TimeUnit timeUnit, i iVar) {
            a aVar;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j11) : 0L;
            this.f6364a = nanos;
            this.f6365b = new ConcurrentLinkedQueue<>();
            this.f6366c = new C8486a();
            this.f6369f = iVar;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, f.f6358d);
                aVar = this;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            aVar.f6367d = scheduledExecutorService;
            aVar.f6368e = scheduledFuture;
        }

        final c a() {
            c poll;
            C8486a c8486a = this.f6366c;
            if (c8486a.isDisposed()) {
                return f.f6361g;
            }
            do {
                ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f6365b;
                if (concurrentLinkedQueue.isEmpty()) {
                    c cVar = new c(this.f6369f);
                    c8486a.a(cVar);
                    return cVar;
                }
                poll = concurrentLinkedQueue.poll();
            } while (poll == null);
            return poll;
        }

        final void b(c cVar) {
            cVar.i(System.nanoTime() + this.f6364a);
            this.f6365b.offer(cVar);
        }

        final void c() {
            this.f6366c.dispose();
            ScheduledFuture scheduledFuture = this.f6368e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f6367d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f6365b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long nanoTime = System.nanoTime();
            Iterator<c> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.h() > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(next)) {
                    this.f6366c.c(next);
                }
            }
        }
    }

    static final class b extends x.c {

        /* renamed from: b, reason: collision with root package name */
        private final a f6371b;

        /* renamed from: c, reason: collision with root package name */
        private final c f6372c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f6373d = new AtomicBoolean();

        /* renamed from: a, reason: collision with root package name */
        private final C8486a f6370a = new C8486a();

        b(a aVar) {
            this.f6371b = aVar;
            this.f6372c = aVar.a();
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b b(Runnable runnable, long j11, TimeUnit timeUnit) {
            return this.f6370a.isDisposed() ? rc.e.INSTANCE : this.f6372c.d(runnable, j11, timeUnit, this.f6370a);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f6373d.compareAndSet(false, true)) {
                this.f6370a.dispose();
                this.f6371b.b(this.f6372c);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f6373d.get();
        }
    }

    static final class c extends h {

        /* renamed from: c, reason: collision with root package name */
        private long f6374c;

        c(i iVar) {
            super(iVar);
            this.f6374c = 0L;
        }

        public final long h() {
            return this.f6374c;
        }

        public final void i(long j11) {
            this.f6374c = j11;
        }
    }

    static {
        c cVar = new c(new i("RxCachedThreadSchedulerShutdown"));
        f6361g = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        i iVar = new i("RxCachedThreadScheduler", max, false);
        f6357c = iVar;
        f6358d = new i("RxCachedWorkerPoolEvictor", max, false);
        a aVar = new a(0L, null, iVar);
        f6362h = aVar;
        aVar.c();
    }

    public f() {
        AtomicReference<a> atomicReference;
        i iVar = f6357c;
        a aVar = f6362h;
        this.f6363b = new AtomicReference<>(aVar);
        a aVar2 = new a(f6359e, f6360f, iVar);
        do {
            atomicReference = this.f6363b;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                return;
            }
        } while (atomicReference.get() == aVar);
        aVar2.c();
    }

    @Override // io.reactivex.x
    public final x.c b() {
        return new b(this.f6363b.get());
    }
}
