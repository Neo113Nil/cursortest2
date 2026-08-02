package O4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: O4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0255a implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4202k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f4203l;

    public ExecutorC0255a() {
        this.f4202k = 0;
        this.f4203l = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4202k) {
            case 0:
                this.f4203l.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f4203l;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC0255a(Handler handler) {
        this.f4202k = 1;
        this.f4203l = handler;
    }
}
