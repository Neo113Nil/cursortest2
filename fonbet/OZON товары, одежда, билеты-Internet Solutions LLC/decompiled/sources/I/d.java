package I;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public class d<V> implements com.google.common.util.concurrent.m<V> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final com.google.common.util.concurrent.m<V> f11254a;

    /* renamed from: b, reason: collision with root package name */
    b.a<V> f11255b;

    final class a implements b.c<V> {
        a() {
        }

        @Override // androidx.concurrent.futures.b.c
        public final Object c(@NonNull b.a<V> aVar) {
            d dVar = d.this;
            x2.i.f("The result can only set once!", dVar.f11255b == null);
            dVar.f11255b = aVar;
            return "FutureChain[" + dVar + "]";
        }
    }

    d(@NonNull com.google.common.util.concurrent.m<V> mVar) {
        mVar.getClass();
        this.f11254a = mVar;
    }

    @NonNull
    public static <V> d<V> b(@NonNull com.google.common.util.concurrent.m<V> mVar) {
        return mVar instanceof d ? (d) mVar : new d<>(mVar);
    }

    @Override // com.google.common.util.concurrent.m
    public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f11254a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f11254a.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.f11254a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11254a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11254a.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f11254a.get(j11, timeUnit);
    }

    d() {
        this.f11254a = androidx.concurrent.futures.b.a(new a());
    }
}
