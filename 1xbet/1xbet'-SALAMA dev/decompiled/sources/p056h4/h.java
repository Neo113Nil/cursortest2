package p056h4;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p129s.a;
import p129s.g;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends g implements ScheduledFuture {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ScheduledFuture f13560y;

    public h(g gVar) {
        this.f13560y = gVar.a(new C1010l1(this));
    }

    @Override // p129s.g
    public final void b() {
        ScheduledFuture scheduledFuture = this.f13560y;
        Object obj = this.f16087a;
        scheduledFuture.cancel((obj instanceof a) && ((a) obj).f16068a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f13560y.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f13560y.getDelay(timeUnit);
    }
}
