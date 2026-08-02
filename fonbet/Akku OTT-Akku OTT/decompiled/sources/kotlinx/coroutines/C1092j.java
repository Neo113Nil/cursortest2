package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;

/* renamed from: kotlinx.coroutines.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1092j implements InterfaceC1094k {
    public final ScheduledFuture a;

    public C1092j(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // kotlinx.coroutines.InterfaceC1094k
    public final void b(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}
