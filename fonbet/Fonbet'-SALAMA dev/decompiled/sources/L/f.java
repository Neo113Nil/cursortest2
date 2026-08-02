package L;

import android.os.Handler;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import w1.C1759x1;

/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4182a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4183b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f4182a = i7;
        this.f4183b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4182a) {
            case 0:
                runnable.getClass();
                Handler handler = (Handler) this.f4183b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((zau) this.f4183b).post(runnable);
                return;
            default:
                ((Handler) ((C1759x1) this.f4183b).f17926c).post(runnable);
                return;
        }
    }
}
