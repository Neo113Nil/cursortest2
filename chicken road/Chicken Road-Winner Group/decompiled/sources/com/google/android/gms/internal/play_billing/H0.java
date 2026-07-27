package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class H0 extends AbstractC0224s0 {

    /* renamed from: h, reason: collision with root package name */
    public InterfaceFutureC0242y0 f2629h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f2630i;

    @Override // com.google.android.gms.internal.play_billing.AbstractC0210n0
    public final String b() {
        InterfaceFutureC0242y0 interfaceFutureC0242y0 = this.f2629h;
        ScheduledFuture scheduledFuture = this.f2630i;
        if (interfaceFutureC0242y0 == null) {
            return null;
        }
        String k3 = B0.c.k("inputFuture=[", interfaceFutureC0242y0.toString(), "]");
        if (scheduledFuture == null) {
            return k3;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return k3;
        }
        return k3 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0210n0
    public final void c() {
        InterfaceFutureC0242y0 interfaceFutureC0242y0 = this.f2629h;
        if ((interfaceFutureC0242y0 != null) & (this.f2782a instanceof C0177c0)) {
            Object obj = this.f2782a;
            interfaceFutureC0242y0.cancel((obj instanceof C0177c0) && ((C0177c0) obj).f2729a);
        }
        ScheduledFuture scheduledFuture = this.f2630i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f2629h = null;
        this.f2630i = null;
    }
}
