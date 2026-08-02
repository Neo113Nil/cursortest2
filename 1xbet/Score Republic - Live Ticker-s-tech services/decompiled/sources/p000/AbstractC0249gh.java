package p000;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: gh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0249gh {

    /* JADX INFO: renamed from: a */
    public static final Logger f2733a = Logger.getLogger(AbstractC0249gh.class.getName());

    /* JADX INFO: renamed from: b */
    public static final boolean f2734b;

    /* JADX INFO: renamed from: c */
    public static final C0059be f2735c;

    static {
        int i = 0;
        f2734b = !gw0.m2161a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f2735c = new C0059be("internal-stub-type", i);
    }

    /* JADX INFO: renamed from: a */
    public static void m2051a(xe1 xe1Var, Throwable th) {
        try {
            xe1Var.mo272b(null, th);
        } catch (Error | RuntimeException e) {
            f2733a.log(Level.SEVERE, "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    /* JADX INFO: renamed from: b */
    public static C0098ch m2052b(xe1 xe1Var, C0525nz c0525nz) {
        C0098ch c0098ch = new C0098ch(xe1Var);
        xe1Var.mo273o(new C0211fh(c0098ch), new np0());
        xe1Var.mo661m();
        try {
            xe1Var.mo662n(c0525nz);
            xe1Var.mo660i();
            return c0098ch;
        } catch (Error | RuntimeException e) {
            m2051a(xe1Var, e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m2053c(C0098ch c0098ch) {
        try {
            return c0098ch.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw ja1.f3876f.m2840h("Thread interrupted").m2839g(e).m2836a();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            a90.m127k(cause, "t");
            for (Throwable cause2 = cause; cause2 != null; cause2 = cause2.getCause()) {
                if (cause2 instanceof ka1) {
                    throw new la1(((ka1) cause2).f4331j, null);
                }
                if (cause2 instanceof la1) {
                    la1 la1Var = (la1) cause2;
                    throw new la1(la1Var.f4744j, la1Var.f4745k);
                }
            }
            throw ja1.f3877g.m2840h("unexpected exception").m2839g(cause).m2836a();
        }
    }
}
