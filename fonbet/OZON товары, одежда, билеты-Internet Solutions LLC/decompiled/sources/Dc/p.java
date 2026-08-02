package Dc;

import Kc.C3493a;
import io.reactivex.x;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import nc.C8488c;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class p extends x {

    /* renamed from: b, reason: collision with root package name */
    private static final p f6396b = new p();

    /* loaded from: classes9.dex */
    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f6397a;

        /* renamed from: b, reason: collision with root package name */
        private final c f6398b;

        /* renamed from: c, reason: collision with root package name */
        private final long f6399c;

        a(Runnable runnable, c cVar, long j11) {
            this.f6397a = runnable;
            this.f6398b = cVar;
            this.f6399c = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f6398b.f6407d) {
                return;
            }
            c cVar = this.f6398b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVar.getClass();
            long convert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
            long j11 = this.f6399c;
            if (j11 > convert) {
                try {
                    Thread.sleep(j11 - convert);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    C3493a.f(e11);
                    return;
                }
            }
            if (this.f6398b.f6407d) {
                return;
            }
            this.f6397a.run();
        }
    }

    /* loaded from: classes9.dex */
    static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f6400a;

        /* renamed from: b, reason: collision with root package name */
        final long f6401b;

        /* renamed from: c, reason: collision with root package name */
        final int f6402c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f6403d;

        b(Runnable runnable, Long l11, int i11) {
            this.f6400a = runnable;
            this.f6401b = l11.longValue();
            this.f6402c = i11;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            long j11 = bVar2.f6401b;
            long j12 = this.f6401b;
            int i11 = j12 < j11 ? -1 : j12 > j11 ? 1 : 0;
            if (i11 != 0) {
                return i11;
            }
            int i12 = this.f6402c;
            int i13 = bVar2.f6402c;
            if (i12 < i13) {
                return -1;
            }
            return i12 > i13 ? 1 : 0;
        }
    }

    /* loaded from: classes9.dex */
    static final class c extends x.c {

        /* renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue<b> f6404a = new PriorityBlockingQueue<>();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f6405b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f6406c = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f6407d;

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b f6408a;

            a(b bVar) {
                this.f6408a = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6408a.f6403d = true;
                c.this.f6404a.remove(this.f6408a);
            }
        }

        c() {
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b a(Runnable runnable) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return d(runnable, timeUnit.convert(System.currentTimeMillis(), timeUnit));
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b b(Runnable runnable, long j11, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long millis = timeUnit.toMillis(j11) + timeUnit2.convert(System.currentTimeMillis(), timeUnit2);
            return d(new a(runnable, this, millis), millis);
        }

        final InterfaceC8487b d(Runnable runnable, long j11) {
            if (this.f6407d) {
                return rc.e.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j11), this.f6406c.incrementAndGet());
            this.f6404a.add(bVar);
            if (this.f6405b.getAndIncrement() != 0) {
                return C8488c.a(new a(bVar));
            }
            int i11 = 1;
            while (!this.f6407d) {
                b poll = this.f6404a.poll();
                if (poll == null) {
                    i11 = this.f6405b.addAndGet(-i11);
                    if (i11 == 0) {
                        return rc.e.INSTANCE;
                    }
                } else if (!poll.f6403d) {
                    poll.f6400a.run();
                }
            }
            this.f6404a.clear();
            return rc.e.INSTANCE;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f6407d = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f6407d;
        }
    }

    public static p g() {
        return f6396b;
    }

    @Override // io.reactivex.x
    public final x.c b() {
        return new c();
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b d(Runnable runnable) {
        runnable.run();
        return rc.e.INSTANCE;
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j11);
            runnable.run();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            C3493a.f(e11);
        }
        return rc.e.INSTANCE;
    }
}
