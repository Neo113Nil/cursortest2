package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Zw extends Gw {

    /* renamed from: r, reason: collision with root package name */
    public E3.a f12543r;

    /* renamed from: s, reason: collision with root package name */
    public ScheduledFuture f12544s;

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final String d() {
        E3.a aVar = this.f12543r;
        ScheduledFuture scheduledFuture = this.f12544s;
        if (aVar == null) {
            return null;
        }
        String n5 = L1.a.n("inputFuture=[", aVar.toString(), "]");
        if (scheduledFuture == null) {
            return n5;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return n5;
        }
        return n5 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final void e() {
        k(this.f12543r);
        ScheduledFuture scheduledFuture = this.f12544s;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f12543r = null;
        this.f12544s = null;
    }
}
