package P;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f322b;

    public /* synthetic */ k(Handler handler, int i2) {
        this.f321a = i2;
        this.f322b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f321a) {
            case 0:
                ((Z.e) this.f322b).post(runnable);
                return;
            case 1:
                ((Z.e) this.f322b).post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f322b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public k() {
        this.f321a = 1;
        Z.e eVar = new Z.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f322b = eVar;
    }
}
