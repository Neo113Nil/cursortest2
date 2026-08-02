package D6;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class N implements O {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f1798a;

    public N(ScheduledFuture scheduledFuture) {
        this.f1798a = scheduledFuture;
    }

    @Override // D6.O
    public final void dispose() {
        this.f1798a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f1798a + ']';
    }
}
