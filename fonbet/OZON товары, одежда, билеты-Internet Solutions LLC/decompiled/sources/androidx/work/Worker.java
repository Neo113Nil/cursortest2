package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.n;

/* loaded from: classes.dex */
public abstract class Worker extends n {
    androidx.work.impl.utils.futures.c<n.a> mFuture;

    /* loaded from: classes8.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.mFuture.j(worker.doWork());
            } catch (Throwable th2) {
                worker.mFuture.l(th2);
            }
        }
    }

    /* loaded from: classes8.dex */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f45243a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f45243a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.work.impl.utils.futures.c cVar = this.f45243a;
            try {
                cVar.j(Worker.this.getForegroundInfo());
            } catch (Throwable th2) {
                cVar.l(th2);
            }
        }
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public abstract n.a doWork();

    @NonNull
    public h getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.n
    @NonNull
    public com.google.common.util.concurrent.m<h> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c k11 = androidx.work.impl.utils.futures.c.k();
        getBackgroundExecutor().execute(new b(k11));
        return k11;
    }

    @Override // androidx.work.n
    @NonNull
    public final com.google.common.util.concurrent.m<n.a> startWork() {
        this.mFuture = androidx.work.impl.utils.futures.c.k();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
