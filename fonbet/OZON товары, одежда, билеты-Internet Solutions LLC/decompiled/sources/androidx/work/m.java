package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.D0;

/* loaded from: classes8.dex */
public final class m<R> implements com.google.common.util.concurrent.m<R> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.utils.futures.c<R> f45543a;

    public m(D0 job) {
        androidx.work.impl.utils.futures.c<R> underlying = androidx.work.impl.utils.futures.c.k();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f45543a = underlying;
        job.y(new l(this));
    }

    @Override // com.google.common.util.concurrent.m
    public final void a(Runnable runnable, Executor executor) {
        this.f45543a.a(runnable, executor);
    }

    public final void c(R r11) {
        this.f45543a.j(r11);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return this.f45543a.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f45543a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f45543a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f45543a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j11, TimeUnit timeUnit) {
        return this.f45543a.get(j11, timeUnit);
    }
}
