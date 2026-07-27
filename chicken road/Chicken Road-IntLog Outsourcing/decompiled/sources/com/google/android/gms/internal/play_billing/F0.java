package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public H0 f5047a;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC0386y0 interfaceFutureC0386y0;
        C0327e0 c0327e0;
        H0 h02 = this.f5047a;
        if (h02 == null || (interfaceFutureC0386y0 = h02.f5053h) == null) {
            return;
        }
        this.f5047a = null;
        if (interfaceFutureC0386y0.isDone()) {
            Object obj = h02.f5216a;
            if (obj == null) {
                if (interfaceFutureC0386y0.isDone()) {
                    if (AbstractC0354n0.f5214f.L(h02, null, AbstractC0354n0.f(interfaceFutureC0386y0))) {
                        AbstractC0354n0.i(h02);
                        return;
                    }
                    return;
                }
                RunnableC0336h0 runnableC0336h0 = new RunnableC0336h0(h02, interfaceFutureC0386y0);
                if (AbstractC0354n0.f5214f.L(h02, null, runnableC0336h0)) {
                    try {
                        interfaceFutureC0386y0.b(runnableC0336h0, EnumC0365r0.f5239a);
                        return;
                    } catch (Throwable th) {
                        try {
                            c0327e0 = new C0327e0(th);
                        } catch (Error | Exception unused) {
                            c0327e0 = C0327e0.f5174b;
                        }
                        AbstractC0354n0.f5214f.L(h02, runnableC0336h0, c0327e0);
                        return;
                    }
                }
                obj = h02.f5216a;
            }
            if (obj instanceof C0324d0) {
                interfaceFutureC0386y0.cancel(((C0324d0) obj).f5165a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = h02.f5054i;
            h02.f5054i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    h02.e(new G0(str));
                    throw th2;
                }
            }
            h02.e(new G0(str + ": " + interfaceFutureC0386y0.toString()));
        } finally {
            interfaceFutureC0386y0.cancel(true);
        }
    }
}
