package androidx.concurrent.futures;

import T7.E;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.a;
import com.google.common.util.concurrent.m;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public final class b {

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        Object f41195a;

        /* renamed from: b, reason: collision with root package name */
        d<T> f41196b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.c<Void> f41197c = new androidx.concurrent.futures.c<>();

        /* renamed from: d, reason: collision with root package name */
        private boolean f41198d;

        a() {
        }

        public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            androidx.concurrent.futures.c<Void> cVar = this.f41197c;
            if (cVar != null) {
                cVar.a(runnable, executor);
            }
        }

        final void b() {
            this.f41195a = null;
            this.f41196b = null;
            this.f41197c.j(null);
        }

        public final boolean c(T t2) {
            this.f41198d = true;
            d<T> dVar = this.f41196b;
            boolean z11 = dVar != null && dVar.c(t2);
            if (z11) {
                this.f41195a = null;
                this.f41196b = null;
                this.f41197c = null;
            }
            return z11;
        }

        public final void d() {
            this.f41198d = true;
            d<T> dVar = this.f41196b;
            if (dVar == null || !dVar.b()) {
                return;
            }
            this.f41195a = null;
            this.f41196b = null;
            this.f41197c = null;
        }

        public final boolean e(@NonNull Throwable th2) {
            this.f41198d = true;
            d<T> dVar = this.f41196b;
            boolean z11 = dVar != null && dVar.d(th2);
            if (z11) {
                this.f41195a = null;
                this.f41196b = null;
                this.f41197c = null;
            }
            return z11;
        }

        protected final void finalize() {
            androidx.concurrent.futures.c<Void> cVar;
            d<T> dVar = this.f41196b;
            if (dVar != null && !dVar.isDone()) {
                dVar.d(new C0756b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f41195a));
            }
            if (this.f41198d || (cVar = this.f41197c) == null) {
                return;
            }
            cVar.j(null);
        }
    }

    /* renamed from: androidx.concurrent.futures.b$b, reason: collision with other inner class name */
    static final class C0756b extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface c<T> {
        Object c(@NonNull a<T> aVar) throws Exception;
    }

    private static final class d<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference<a<T>> f41199a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f41200b = new a();

        final class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected final String h() {
                a<T> aVar = d.this.f41199a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return E.c(aVar.f41195a, "]", new StringBuilder("tag=["));
            }
        }

        d(a<T> aVar) {
            this.f41199a = new WeakReference<>(aVar);
        }

        @Override // com.google.common.util.concurrent.m
        public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f41200b.a(runnable, executor);
        }

        final boolean b() {
            return this.f41200b.cancel(true);
        }

        final boolean c(T t2) {
            return this.f41200b.j(t2);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z11) {
            a<T> aVar = this.f41199a.get();
            boolean cancel = this.f41200b.cancel(z11);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        final boolean d(Throwable th2) {
            return this.f41200b.k(th2);
        }

        @Override // java.util.concurrent.Future
        public final T get() throws InterruptedException, ExecutionException {
            return this.f41200b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f41200b.f41175a instanceof a.b;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f41200b.isDone();
        }

        public final String toString() {
            return this.f41200b.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f41200b.get(j11, timeUnit);
        }
    }

    @NonNull
    public static <T> m<T> a(@NonNull c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f41196b = dVar;
        aVar.f41195a = cVar.getClass();
        try {
            Object c11 = cVar.c(aVar);
            if (c11 != null) {
                aVar.f41195a = c11;
                return dVar;
            }
        } catch (Exception e11) {
            dVar.d(e11);
        }
        return dVar;
    }
}
