package A0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f83b;

    public /* synthetic */ q(int i3, Object obj) {
        this.f82a = i3;
        this.f83b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f82a) {
            case 0:
                ((ExecutorService) this.f83b).execute(new A.b(1, runnable));
                return;
            case 1:
                ((b1.e) this.f83b).post(runnable);
                return;
            case 2:
                ((b1.e) this.f83b).post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.f83b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public q() {
        this.f82a = 2;
        b1.e eVar = new b1.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f83b = eVar;
    }
}
