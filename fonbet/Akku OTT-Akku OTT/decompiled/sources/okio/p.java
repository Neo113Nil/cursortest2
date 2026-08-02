package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends L {
    public L a;

    public p(L delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // okio.L
    public final void awaitSignal(Condition condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.a.awaitSignal(condition);
    }

    @Override // okio.L
    public final void cancel() {
        this.a.cancel();
    }

    @Override // okio.L
    public final L clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // okio.L
    public final L clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // okio.L
    public final long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // okio.L
    /* renamed from: hasDeadline */
    public final boolean getHasDeadline() {
        return this.a.getHasDeadline();
    }

    @Override // okio.L
    public final void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }

    @Override // okio.L
    public final L timeout(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.a.timeout(j, unit);
    }

    @Override // okio.L
    /* renamed from: timeoutNanos */
    public final long getTimeoutNanos() {
        return this.a.getTimeoutNanos();
    }

    @Override // okio.L
    public final void waitUntilNotified(Object monitor) {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        this.a.waitUntilNotified(monitor);
    }

    @Override // okio.L
    public final L deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
