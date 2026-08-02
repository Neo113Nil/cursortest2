package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k70 {
    /* JADX INFO: renamed from: a */
    public static C0305i m2990a(ListenableFuture listenableFuture, Class cls, InterfaceC0387k8 interfaceC0387k8, Executor executor) {
        int i = AbstractRunnableC0378k.f4237u;
        C0305i c0305i = new C0305i(listenableFuture, cls, interfaceC0387k8);
        listenableFuture.mo995c(c0305i, vk1.m5169f(executor, c0305i));
        return c0305i;
    }

    /* JADX INFO: renamed from: b */
    public static Object m2991b(Future future) {
        Object obj;
        a90.m131o(future, "Future was expected to be done: %s", future.isDone());
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static ic0 m2992c(Exception exc) {
        ic0 ic0Var = new ic0();
        ic0Var.m2178m(exc);
        return ic0Var;
    }

    /* JADX INFO: renamed from: d */
    public static jc0 m2993d(Object obj) {
        return obj == null ? jc0.f3900k : new jc0(obj);
    }

    /* JADX INFO: renamed from: e */
    public static ListenableFuture m2994e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        j70 j70Var = new j70();
        j70Var.f3832q = listenableFuture;
        listenableFuture.mo995c(j70Var, EnumC0113ct.f1449j);
        return j70Var;
    }

    /* JADX INFO: renamed from: f */
    public static C0002a1 m2995f(ListenableFuture listenableFuture, e70 e70Var, Executor executor) {
        int i = AbstractRunnableC0046b1.f667t;
        C0002a1 c0002a1 = new C0002a1(listenableFuture, e70Var);
        listenableFuture.mo995c(c0002a1, vk1.m5169f(executor, c0002a1));
        return c0002a1;
    }

    /* JADX INFO: renamed from: g */
    public static C0934z0 m2996g(ListenableFuture listenableFuture, InterfaceC0387k8 interfaceC0387k8, Executor executor) {
        int i = AbstractRunnableC0046b1.f667t;
        executor.getClass();
        C0934z0 c0934z0 = new C0934z0(listenableFuture, interfaceC0387k8);
        listenableFuture.mo995c(c0934z0, vk1.m5169f(executor, c0934z0));
        return c0934z0;
    }
}
