package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ks */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC0407ks extends AbstractC0786v0 implements ScheduledFuture {

    /* JADX INFO: renamed from: q */
    public final ScheduledFuture f4507q;

    public ScheduledFutureC0407ks(InterfaceC0370js interfaceC0370js) {
        this.f4507q = interfaceC0370js.mo1300a(new nu1(15, this));
    }

    @Override // p000.AbstractC0786v0
    /* JADX INFO: renamed from: b */
    public final void mo3070b() {
        ScheduledFuture scheduledFuture = this.f4507q;
        Object obj = this.f7980j;
        scheduledFuture.cancel((obj instanceof C0564p0) && ((C0564p0) obj).f5942a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4507q.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4507q.getDelay(timeUnit);
    }
}
