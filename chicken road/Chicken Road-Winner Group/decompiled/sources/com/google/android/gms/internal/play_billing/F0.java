package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public H0 f2623a;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC0242y0 interfaceFutureC0242y0;
        C0183e0 c0183e0;
        H0 h02 = this.f2623a;
        if (h02 == null || (interfaceFutureC0242y0 = h02.f2629h) == null) {
            return;
        }
        this.f2623a = null;
        if (interfaceFutureC0242y0.isDone()) {
            Object obj = h02.f2782a;
            if (obj == null) {
                if (interfaceFutureC0242y0.isDone()) {
                    if (AbstractC0210n0.f.D(h02, null, AbstractC0210n0.e(interfaceFutureC0242y0))) {
                        AbstractC0210n0.h(h02);
                        return;
                    }
                    return;
                }
                RunnableC0192h0 runnableC0192h0 = new RunnableC0192h0(h02, interfaceFutureC0242y0);
                if (AbstractC0210n0.f.D(h02, null, runnableC0192h0)) {
                    try {
                        interfaceFutureC0242y0.a(runnableC0192h0, EnumC0221r0.f2804a);
                        return;
                    } catch (Throwable th) {
                        try {
                            c0183e0 = new C0183e0(th);
                        } catch (Error | Exception unused) {
                            c0183e0 = C0183e0.f2743b;
                        }
                        AbstractC0210n0.f.D(h02, runnableC0192h0, c0183e0);
                        return;
                    }
                }
                obj = h02.f2782a;
            }
            if (obj instanceof C0177c0) {
                interfaceFutureC0242y0.cancel(((C0177c0) obj).f2729a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = h02.f2630i;
            h02.f2630i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    h02.d(new G0(str));
                    throw th2;
                }
            }
            h02.d(new G0(str + ": " + interfaceFutureC0242y0.toString()));
        } finally {
            interfaceFutureC0242y0.cancel(true);
        }
    }
}
