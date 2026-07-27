package A;

import B4.i;
import O1.j;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f0a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1b;

    public /* synthetic */ c(int i2, Object obj) {
        this.f0a = i2;
        this.f1b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f0a) {
            case 0:
                runnable.getClass();
                Handler handler = (Handler) this.f1b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Handler) ((i) this.f1b).f312c).post(runnable);
                return;
            case 2:
                ((A1.c) this.f1b).post(runnable);
                return;
            case 3:
                ((ExecutorService) this.f1b).execute(new j(runnable, 1));
                return;
            case 4:
                ((A1.c) this.f1b).post(runnable);
                return;
            default:
                ((A1.c) this.f1b).post(runnable);
                return;
        }
    }

    public c() {
        this.f0a = 2;
        A1.c cVar = new A1.c(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f1b = cVar;
    }

    public c(Looper looper) {
        this.f0a = 5;
        this.f1b = new A1.c(looper, 0);
    }
}
