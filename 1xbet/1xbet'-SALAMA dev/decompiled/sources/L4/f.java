package L4;

import A1.K0;
import K4.s;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4361c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4360b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f4359a = new d(this);

    public final Task a(Runnable runnable) {
        return this.f4359a.a(new s(runnable, 1));
    }

    public final C1017n0 b(e eVar, long j, Runnable runnable) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (this.f4361c.contains(eVar)) {
            j = 0;
        }
        System.currentTimeMillis();
        C1017n0 c1017n0 = new C1017n0(this, runnable);
        d dVar = this.f4359a;
        K0 k7 = new K0(c1017n0, 12);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (dVar) {
            scheduledFutureSchedule = !dVar.f4345b ? dVar.f4344a.schedule(k7, j, timeUnit) : null;
        }
        c1017n0.f17812c = scheduledFutureSchedule;
        this.f4360b.add(c1017n0);
        return c1017n0;
    }

    public final void c(Throwable th) {
        this.f4359a.f4344a.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new K0(th, 11));
    }

    public final void d() {
        Thread threadCurrentThread = Thread.currentThread();
        d dVar = this.f4359a;
        Thread thread = dVar.f4346c;
        if (thread == threadCurrentThread) {
            return;
        }
        p113p3.f.F("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(dVar.f4346c.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        throw null;
    }
}
