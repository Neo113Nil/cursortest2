package I;

import C.S;
import T7.E;
import androidx.annotation.NonNull;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
abstract class n<V> implements com.google.common.util.concurrent.m<V> {

    static class a<V> extends n<V> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final Throwable f11279a;

        a(@NonNull Throwable th2) {
            this.f11279a = th2;
        }

        @Override // java.util.concurrent.Future
        public final V get() throws ExecutionException {
            throw new ExecutionException(this.f11279a);
        }

        @NonNull
        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f11279a + "]]";
        }
    }

    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(@NonNull Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(@NonNull TimeUnit timeUnit) {
            return 0L;
        }
    }

    static final class c<V> extends n<V> {

        /* renamed from: b, reason: collision with root package name */
        static final c f11280b = new c(null);

        /* renamed from: a, reason: collision with root package name */
        private final V f11281a;

        c(V v11) {
            this.f11281a = v11;
        }

        @Override // java.util.concurrent.Future
        public final V get() {
            return this.f11281a;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append("[status=SUCCESS, result=[");
            return E.c(this.f11281a, "]]", sb2);
        }
    }

    @Override // com.google.common.util.concurrent.m
    public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            S.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e11);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j11, @NonNull TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
