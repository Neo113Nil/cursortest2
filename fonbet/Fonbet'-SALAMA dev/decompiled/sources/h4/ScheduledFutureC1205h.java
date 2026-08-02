package h4;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s.C1583a;
import w1.C1719l1;

/* renamed from: h4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ScheduledFutureC1205h extends s.g implements ScheduledFuture {

    /* renamed from: y, reason: collision with root package name */
    public final ScheduledFuture f13554y;

    public ScheduledFutureC1205h(InterfaceC1204g interfaceC1204g) {
        this.f13554y = interfaceC1204g.a(new C1719l1(this));
    }

    @Override // s.g
    public final void b() {
        ScheduledFuture scheduledFuture = this.f13554y;
        Object obj = this.f16081a;
        scheduledFuture.cancel((obj instanceof C1583a) && ((C1583a) obj).f16062a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f13554y.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f13554y.getDelay(timeUnit);
    }
}
