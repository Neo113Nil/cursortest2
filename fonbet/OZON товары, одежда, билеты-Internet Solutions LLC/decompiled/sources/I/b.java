package I;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
final class b<I, O> extends d<O> implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private I.a<? super I, ? extends O> f11247c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f11248d = new LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    private final CountDownLatch f11249e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    private com.google.common.util.concurrent.m<? extends I> f11250f;

    /* renamed from: g, reason: collision with root package name */
    volatile com.google.common.util.concurrent.m<? extends O> f11251g;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.m f11252a;

        a(com.google.common.util.concurrent.m mVar) {
            this.f11252a = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    b bVar = b.this;
                    Object e11 = k.e(this.f11252a);
                    b.a<V> aVar = bVar.f11255b;
                    if (aVar != 0) {
                        aVar.c(e11);
                    }
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                } catch (ExecutionException e12) {
                    b bVar2 = b.this;
                    Throwable cause = e12.getCause();
                    b.a<V> aVar2 = bVar2.f11255b;
                    if (aVar2 != 0) {
                        aVar2.e(cause);
                    }
                    b.this.f11251g = null;
                    return;
                }
                b.this.f11251g = null;
            } catch (Throwable th2) {
                b.this.f11251g = null;
                throw th2;
            }
        }
    }

    b(@NonNull I.a<? super I, ? extends O> aVar, @NonNull com.google.common.util.concurrent.m<? extends I> mVar) {
        this.f11247c = aVar;
        mVar.getClass();
        this.f11250f = mVar;
    }

    private static Object c(@NonNull LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z11 = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // I.d, java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        boolean z12 = false;
        if (!super.cancel(z11)) {
            return false;
        }
        while (true) {
            try {
                this.f11248d.put(Boolean.valueOf(z11));
                break;
            } catch (InterruptedException unused) {
                z12 = true;
            } catch (Throwable th2) {
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        com.google.common.util.concurrent.m<? extends I> mVar = this.f11250f;
        if (mVar != null) {
            mVar.cancel(z11);
        }
        com.google.common.util.concurrent.m<? extends O> mVar2 = this.f11251g;
        if (mVar2 != null) {
            mVar2.cancel(z11);
        }
        return true;
    }

    @Override // I.d, java.util.concurrent.Future
    public final O get() throws InterruptedException, ExecutionException {
        if (!isDone()) {
            com.google.common.util.concurrent.m<? extends I> mVar = this.f11250f;
            if (mVar != null) {
                mVar.get();
            }
            this.f11249e.await();
            com.google.common.util.concurrent.m<? extends O> mVar2 = this.f11251g;
            if (mVar2 != null) {
                mVar2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I.a<? super I, ? extends O>, com.google.common.util.concurrent.m<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [I.a<? super I, ? extends O>, com.google.common.util.concurrent.m<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        I.a<? super I, ? extends O> aVar;
        ?? r02 = (I.a<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            com.google.common.util.concurrent.m<? extends O> apply = this.f11247c.apply(k.e(this.f11250f));
                            this.f11251g = apply;
                            if (isCancelled()) {
                                apply.cancel(((Boolean) c(this.f11248d)).booleanValue());
                                this.f11251g = null;
                            } else {
                                apply.a(new a(apply), H.c.b());
                            }
                        } catch (Exception e11) {
                            b.a<V> aVar2 = this.f11255b;
                            aVar = r02;
                            if (aVar2 != 0) {
                                aVar2.e(e11);
                                aVar = r02;
                            }
                        }
                    } catch (Error e12) {
                        b.a<V> aVar3 = this.f11255b;
                        aVar = r02;
                        if (aVar3 != 0) {
                            aVar3.e(e12);
                            aVar = r02;
                        }
                    }
                } finally {
                    this.f11247c = (I.a<? super I, ? extends O>) r02;
                    this.f11250f = (com.google.common.util.concurrent.m<? extends I>) r02;
                    this.f11249e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e13) {
                Throwable cause = e13.getCause();
                b.a<V> aVar4 = this.f11255b;
                if (aVar4 != 0) {
                    aVar4.e(cause);
                }
            }
        } catch (UndeclaredThrowableException e14) {
            Throwable cause2 = e14.getCause();
            b.a<V> aVar5 = this.f11255b;
            aVar = r02;
            if (aVar5 != 0) {
                aVar5.e(cause2);
                aVar = r02;
            }
        }
    }

    @Override // I.d, java.util.concurrent.Future
    public final O get(long j11, @NonNull TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j11 = timeUnit2.convert(j11, timeUnit);
                timeUnit = timeUnit2;
            }
            com.google.common.util.concurrent.m<? extends I> mVar = this.f11250f;
            if (mVar != null) {
                long nanoTime = System.nanoTime();
                mVar.get(j11, timeUnit);
                j11 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f11249e.await(j11, timeUnit)) {
                j11 -= Math.max(0L, System.nanoTime() - nanoTime2);
                com.google.common.util.concurrent.m<? extends O> mVar2 = this.f11251g;
                if (mVar2 != null) {
                    mVar2.get(j11, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j11, timeUnit);
    }
}
