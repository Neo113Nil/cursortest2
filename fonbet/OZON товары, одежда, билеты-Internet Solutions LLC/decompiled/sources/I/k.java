package I;

import B90.P;
import I.n;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import p.InterfaceC8822a;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC8822a<?, ?> f11272a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    final class a<I, O> implements I.a<I, O> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8822a f11273a;

        a(InterfaceC8822a interfaceC8822a) {
            this.f11273a = interfaceC8822a;
        }

        @Override // I.a, qc.o
        @NonNull
        public final com.google.common.util.concurrent.m<O> apply(I i11) {
            return k.h(this.f11273a.apply(i11));
        }
    }

    final class b implements InterfaceC8822a<Object, Object> {
        @Override // p.InterfaceC8822a
        public final Object apply(Object obj) {
            return obj;
        }
    }

    private static final class c<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final com.google.common.util.concurrent.m f11274a;

        /* renamed from: b, reason: collision with root package name */
        final I.c<? super V> f11275b;

        c(com.google.common.util.concurrent.m mVar, I.c cVar) {
            this.f11274a = mVar;
            this.f11275b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            I.c<? super V> cVar = this.f11275b;
            try {
                cVar.onSuccess((Object) k.d(this.f11274a));
            } catch (Error e11) {
                e = e11;
                cVar.onFailure(e);
            } catch (RuntimeException e12) {
                e = e12;
                cVar.onFailure(e);
            } catch (ExecutionException e13) {
                Throwable cause = e13.getCause();
                if (cause == null) {
                    cVar.onFailure(e13);
                } else {
                    cVar.onFailure(cause);
                }
            }
        }

        @NonNull
        public final String toString() {
            return c.class.getSimpleName() + "," + this.f11275b;
        }
    }

    public static /* synthetic */ String a(b.a aVar, com.google.common.util.concurrent.m mVar) {
        k(false, mVar, aVar, H.c.b());
        return "nonCancellationPropagating[" + mVar + "]";
    }

    public static <V> void b(@NonNull com.google.common.util.concurrent.m<V> mVar, @NonNull I.c<? super V> cVar, @NonNull Executor executor) {
        cVar.getClass();
        mVar.a(new c(mVar, cVar), executor);
    }

    @NonNull
    public static com.google.common.util.concurrent.m c(@NonNull List list) {
        return new r(new ArrayList(list), true, H.c.b());
    }

    public static Object d(@NonNull com.google.common.util.concurrent.m mVar) throws ExecutionException {
        x2.i.f("Future was expected to be done, " + mVar, mVar.isDone());
        return e(mVar);
    }

    public static <V> V e(@NonNull Future<V> future) throws ExecutionException {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
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
        return v11;
    }

    @NonNull
    public static <V> com.google.common.util.concurrent.m<V> f(@NonNull Throwable th2) {
        return new n.a(th2);
    }

    @NonNull
    public static ScheduledFuture g(@NonNull RejectedExecutionException rejectedExecutionException) {
        return new n.b(rejectedExecutionException);
    }

    @NonNull
    public static <V> com.google.common.util.concurrent.m<V> h(V v11) {
        return v11 == null ? n.c.f11280b : new n.c(v11);
    }

    @NonNull
    public static <V> com.google.common.util.concurrent.m<V> i(@NonNull com.google.common.util.concurrent.m<V> mVar) {
        mVar.getClass();
        return mVar.isDone() ? mVar : androidx.concurrent.futures.b.a(new P(mVar));
    }

    public static void j(@NonNull b.a aVar, @NonNull com.google.common.util.concurrent.m mVar) {
        k(true, mVar, aVar, H.c.b());
    }

    private static void k(boolean z11, @NonNull com.google.common.util.concurrent.m mVar, @NonNull b.a aVar, @NonNull Executor executor) {
        InterfaceC8822a<?, ?> interfaceC8822a = f11272a;
        mVar.getClass();
        aVar.getClass();
        executor.getClass();
        b(mVar, new l(aVar, interfaceC8822a), executor);
        if (z11) {
            aVar.a(new m(mVar), H.c.b());
        }
    }

    @NonNull
    public static com.google.common.util.concurrent.m l(@NonNull ArrayList arrayList) {
        return new r(new ArrayList(arrayList), false, H.c.b());
    }

    @NonNull
    public static <I, O> com.google.common.util.concurrent.m<O> m(@NonNull com.google.common.util.concurrent.m<I> mVar, @NonNull InterfaceC8822a<? super I, ? extends O> interfaceC8822a, @NonNull Executor executor) {
        return n(mVar, new a(interfaceC8822a), executor);
    }

    @NonNull
    public static <I, O> com.google.common.util.concurrent.m<O> n(@NonNull com.google.common.util.concurrent.m<I> mVar, @NonNull I.a<? super I, ? extends O> aVar, @NonNull Executor executor) {
        I.b bVar = new I.b(aVar, mVar);
        mVar.a(bVar, executor);
        return bVar;
    }
}
