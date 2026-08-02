package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 implements Executor {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3872j;

    /* JADX INFO: renamed from: k */
    public final Object f3873k;

    public ja0() {
        this.f3872j = 4;
        bm1 bm1Var = new bm1(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f3873k = bm1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f3872j;
        Object obj = this.f3873k;
        switch (i) {
            case 0:
                ((bm1) obj).post(runnable);
                return;
            case 1:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                ((Executor) obj).execute(new RunnableC0825w2(runnable, 1));
                return;
            case 3:
                a02 a02Var = ((f02) ((v22) obj).f7192j).f2248p;
                f02.m1560m(a02Var);
                a02Var.m6J(runnable);
                return;
            default:
                ((bm1) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ ja0(int i, Object obj) {
        this.f3872j = i;
        this.f3873k = obj;
    }

    public ja0(Looper looper) {
        this.f3872j = 0;
        this.f3873k = new bm1(looper, 4);
    }
}
