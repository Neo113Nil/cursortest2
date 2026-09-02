package k;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0042a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f852b;

    public ExecutorC0042a(Handler handler) {
        this.f852b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f852b;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
