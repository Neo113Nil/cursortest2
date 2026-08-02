package I;

import androidx.concurrent.futures.b;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public final /* synthetic */ class h implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.m f11264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f11265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11266c;

    public /* synthetic */ h(com.google.common.util.concurrent.m mVar, ScheduledExecutorService scheduledExecutorService, long j11) {
        this.f11264a = mVar;
        this.f11265b = scheduledExecutorService;
        this.f11266c = j11;
    }

    @Override // androidx.concurrent.futures.b.c
    public final Object c(final b.a aVar) {
        final com.google.common.util.concurrent.m mVar = this.f11264a;
        k.j(aVar, mVar);
        if (!mVar.isDone()) {
            final long j11 = this.f11266c;
            mVar.a(new j(this.f11265b.schedule(new Callable() { // from class: I.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(b.a.this.e(new TimeoutException("Future[" + mVar + "] is not done within " + j11 + " ms.")));
                }
            }, j11, TimeUnit.MILLISECONDS), 0), H.c.b());
        }
        return "TimeoutFuture[" + mVar + "]";
    }
}
