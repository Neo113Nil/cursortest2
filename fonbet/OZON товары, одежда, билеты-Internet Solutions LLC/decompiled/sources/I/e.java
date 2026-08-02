package I;

import androidx.concurrent.futures.b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final /* synthetic */ class e implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.m f11257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f11258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11259c;

    public /* synthetic */ e(com.google.common.util.concurrent.m mVar, ScheduledExecutorService scheduledExecutorService, long j11) {
        this.f11257a = mVar;
        this.f11258b = scheduledExecutorService;
        this.f11259c = j11;
    }

    @Override // androidx.concurrent.futures.b.c
    public final Object c(b.a aVar) {
        com.google.common.util.concurrent.m mVar = this.f11257a;
        k.j(aVar, mVar);
        if (!mVar.isDone()) {
            mVar.a(new g(this.f11258b.schedule(new GI.d(1, aVar, mVar), this.f11259c, TimeUnit.MILLISECONDS), 0), H.c.b());
        }
        return "TimeoutFuture[" + mVar + "]";
    }
}
