package I;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
final class r<V> implements com.google.common.util.concurrent.m<List<V>> {

    /* renamed from: a, reason: collision with root package name */
    ArrayList f11287a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList f11288b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11289c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final AtomicInteger f11290d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final com.google.common.util.concurrent.m<List<V>> f11291e = androidx.concurrent.futures.b.a(new o(this));

    /* renamed from: f, reason: collision with root package name */
    b.a<List<V>> f11292f;

    r(@NonNull ArrayList arrayList, boolean z11, @NonNull Executor executor) {
        this.f11287a = arrayList;
        this.f11288b = new ArrayList(arrayList.size());
        this.f11289c = z11;
        this.f11290d = new AtomicInteger(arrayList.size());
        a(new p(this), H.c.b());
        if (this.f11287a.isEmpty()) {
            this.f11292f.c(new ArrayList(this.f11288b));
            return;
        }
        for (int i11 = 0; i11 < this.f11287a.size(); i11++) {
            this.f11288b.add(null);
        }
        ArrayList arrayList2 = this.f11287a;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            com.google.common.util.concurrent.m mVar = (com.google.common.util.concurrent.m) arrayList2.get(i12);
            mVar.a(new q(this, i12, mVar), executor);
        }
    }

    @Override // com.google.common.util.concurrent.m
    public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f11291e.a(runnable, executor);
    }

    final void b(int i11, @NonNull Future<? extends V> future) {
        b.a<List<V>> aVar;
        ArrayList arrayList;
        AtomicInteger atomicInteger = this.f11290d;
        ArrayList arrayList2 = this.f11288b;
        com.google.common.util.concurrent.m<List<V>> mVar = this.f11291e;
        boolean isDone = mVar.isDone();
        boolean z11 = this.f11289c;
        if (isDone || arrayList2 == null) {
            x2.i.f("Future was done before all dependencies completed", z11);
            return;
        }
        try {
            try {
                try {
                    try {
                        x2.i.f("Tried to set value from future which is not done", future.isDone());
                        arrayList2.set(i11, k.e(future));
                        int decrementAndGet = atomicInteger.decrementAndGet();
                        x2.i.f("Less than 0 remaining futures", decrementAndGet >= 0);
                        if (decrementAndGet == 0) {
                            ArrayList arrayList3 = this.f11288b;
                            if (arrayList3 != null) {
                                this.f11292f.c(new ArrayList(arrayList3));
                            } else {
                                x2.i.f(null, mVar.isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (z11) {
                            cancel(false);
                        }
                        int decrementAndGet2 = atomicInteger.decrementAndGet();
                        x2.i.f("Less than 0 remaining futures", decrementAndGet2 >= 0);
                        if (decrementAndGet2 == 0) {
                            ArrayList arrayList4 = this.f11288b;
                            if (arrayList4 != null) {
                                aVar = this.f11292f;
                                arrayList = new ArrayList(arrayList4);
                                aVar.c(arrayList);
                                return;
                            }
                            x2.i.f(null, mVar.isDone());
                        }
                    }
                } catch (ExecutionException e11) {
                    if (z11) {
                        this.f11292f.e(e11.getCause());
                    }
                    int decrementAndGet3 = atomicInteger.decrementAndGet();
                    x2.i.f("Less than 0 remaining futures", decrementAndGet3 >= 0);
                    if (decrementAndGet3 == 0) {
                        ArrayList arrayList5 = this.f11288b;
                        if (arrayList5 != null) {
                            aVar = this.f11292f;
                            arrayList = new ArrayList(arrayList5);
                            aVar.c(arrayList);
                            return;
                        }
                        x2.i.f(null, mVar.isDone());
                    }
                }
            } catch (Error e12) {
                this.f11292f.e(e12);
                int decrementAndGet4 = atomicInteger.decrementAndGet();
                x2.i.f("Less than 0 remaining futures", decrementAndGet4 >= 0);
                if (decrementAndGet4 == 0) {
                    ArrayList arrayList6 = this.f11288b;
                    if (arrayList6 != null) {
                        aVar = this.f11292f;
                        arrayList = new ArrayList(arrayList6);
                        aVar.c(arrayList);
                        return;
                    }
                    x2.i.f(null, mVar.isDone());
                }
            } catch (RuntimeException e13) {
                if (z11) {
                    this.f11292f.e(e13);
                }
                int decrementAndGet5 = atomicInteger.decrementAndGet();
                x2.i.f("Less than 0 remaining futures", decrementAndGet5 >= 0);
                if (decrementAndGet5 == 0) {
                    ArrayList arrayList7 = this.f11288b;
                    if (arrayList7 != null) {
                        aVar = this.f11292f;
                        arrayList = new ArrayList(arrayList7);
                        aVar.c(arrayList);
                        return;
                    }
                    x2.i.f(null, mVar.isDone());
                }
            }
        } catch (Throwable th2) {
            int decrementAndGet6 = atomicInteger.decrementAndGet();
            x2.i.f("Less than 0 remaining futures", decrementAndGet6 >= 0);
            if (decrementAndGet6 == 0) {
                ArrayList arrayList8 = this.f11288b;
                if (arrayList8 != null) {
                    this.f11292f.c(new ArrayList(arrayList8));
                } else {
                    x2.i.f(null, mVar.isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        ArrayList arrayList = this.f11287a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.google.common.util.concurrent.m) it.next()).cancel(z11);
            }
        }
        return this.f11291e.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f11291e.get(j11, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11291e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11291e.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        ArrayList arrayList = this.f11287a;
        com.google.common.util.concurrent.m<List<V>> mVar = this.f11291e;
        if (arrayList != null && !mVar.isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                com.google.common.util.concurrent.m mVar2 = (com.google.common.util.concurrent.m) it.next();
                while (!mVar2.isDone()) {
                    try {
                        mVar2.get();
                    } catch (Error e11) {
                        throw e11;
                    } catch (InterruptedException e12) {
                        throw e12;
                    } catch (Throwable unused) {
                        if (this.f11289c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return mVar.get();
    }
}
