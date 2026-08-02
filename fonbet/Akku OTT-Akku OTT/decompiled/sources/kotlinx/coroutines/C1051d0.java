package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;

/* renamed from: kotlinx.coroutines.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1051d0 implements InterfaceC1053e0 {
    public final ScheduledFuture a;

    public C1051d0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // kotlinx.coroutines.InterfaceC1053e0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
