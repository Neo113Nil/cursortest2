package L4;

import android.support.v4.media.session.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class b extends ScheduledThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4340b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, ThreadFactory threadFactory, int i7) {
        super(1, threadFactory);
        this.f4339a = i7;
        this.f4340b = obj;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        switch (this.f4339a) {
            case 0:
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e7) {
                        th = e7.getCause();
                    }
                }
                if (th != null) {
                    ((d) this.f4340b).f4347d.c(th);
                    break;
                }
                break;
            default:
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future2 = (Future) runnable;
                    try {
                        if (future2.isDone()) {
                            future2.get();
                        }
                    } catch (InterruptedException unused3) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused4) {
                    } catch (ExecutionException e8) {
                        th = e8.getCause();
                    }
                }
                if (th != null) {
                    ((t) this.f4340b).j0(th);
                    break;
                }
                break;
        }
    }
}
