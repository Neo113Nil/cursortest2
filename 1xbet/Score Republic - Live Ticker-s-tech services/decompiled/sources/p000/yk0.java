package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yk0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jl0 f9316a;

    public yk0(jl0 jl0Var) {
        this.f9316a = jl0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = jl0.f3965c0;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder("[");
        jl0 jl0Var = this.f9316a;
        sb.append(jl0Var.f3998a);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb.toString(), th);
        if (jl0Var.f4025z) {
            return;
        }
        jl0Var.f4025z = true;
        r11 r11Var = jl0Var.f3999a0;
        r11Var.f6662f = false;
        ScheduledFuture scheduledFuture = r11Var.f6663g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            r11Var.f6663g = null;
        }
        jl0Var.m2924k(false);
        xk0 xk0Var = new xk0(th);
        jl0Var.f4024y = xk0Var;
        jl0Var.f3976E.m6029g(xk0Var);
        jl0Var.f3987P.m2122h(null);
        jl0Var.f3985N.mo5321i("PANIC! Entering TRANSIENT_FAILURE", 4);
        jl0Var.f4017r.m3881d(EnumC0474ml.f5073l);
    }
}
