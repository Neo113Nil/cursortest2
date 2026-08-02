package L4;

import A1.K0;
import K4.s;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4361c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4360b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final d f4359a = new d(this);

    public final Task a(Runnable runnable) {
        return this.f4359a.a(new s(runnable, 1));
    }

    public final C1726n0 b(e eVar, long j, Runnable runnable) {
        ScheduledFuture<?> schedule;
        if (this.f4361c.contains(eVar)) {
            j = 0;
        }
        System.currentTimeMillis();
        C1726n0 c1726n0 = new C1726n0(this, runnable);
        d dVar = this.f4359a;
        K0 k02 = new K0(c1726n0, 12);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (dVar) {
            schedule = !dVar.f4345b ? dVar.f4344a.schedule(k02, j, timeUnit) : null;
        }
        c1726n0.f17806c = schedule;
        this.f4360b.add(c1726n0);
        return c1726n0;
    }

    public final void c(Throwable th) {
        this.f4359a.f4344a.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new K0(th, 11));
    }

    public final void d() {
        Thread currentThread = Thread.currentThread();
        d dVar = this.f4359a;
        Thread thread = dVar.f4346c;
        if (thread == currentThread) {
            return;
        }
        p3.f.F("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(dVar.f4346c.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        throw null;
    }
}
