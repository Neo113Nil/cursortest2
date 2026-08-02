package okio;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\"\u001a\u0004\b\u0002\u0010\u0014\"\u0004\b\u0005\u0010\u0004"}, d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "delegate", "<init>", "(Lokio/Timeout;)V", "setDelegate", "(Lokio/Timeout;)Lokio/ForwardingTimeout;", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;", "timeoutNanos", "()J", "", "hasDeadline", "()Z", "deadlineNanoTime", "(J)Lokio/Timeout;", "clearTimeout", "()Lokio/Timeout;", "clearDeadline", "", "throwIfReached", "()V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "Ljava/util/concurrent/locks/Condition;", "condition", "awaitSignal", "(Ljava/util/concurrent/locks/Condition;)V", "", "monitor", "waitUntilNotified", "(Ljava/lang/Object;)V", "Lokio/Timeout;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ForwardingTimeout extends okio.Timeout {
    private okio.Timeout delegate;

    public ForwardingTimeout(okio.Timeout timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "");
        this.delegate = timeout;
    }

    /* renamed from: delegate, reason: from getter */
    public final okio.Timeout getDelegate() {
        return this.delegate;
    }

    /* renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m24446setDelegate(okio.Timeout timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "");
        this.delegate = timeout;
    }

    public final okio.ForwardingTimeout setDelegate(okio.Timeout delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        this.delegate = delegate;
        return this;
    }

    @Override // okio.Timeout
    public okio.Timeout timeout(long timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return this.delegate.timeout(timeout, unit);
    }

    @Override // okio.Timeout
    /* renamed from: timeoutNanos */
    public long getTimeoutNanos() {
        return this.delegate.getTimeoutNanos();
    }

    @Override // okio.Timeout
    /* renamed from: hasDeadline */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    @Override // okio.Timeout
    public okio.Timeout deadlineNanoTime(long deadlineNanoTime) {
        return this.delegate.deadlineNanoTime(deadlineNanoTime);
    }

    @Override // okio.Timeout
    public okio.Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // okio.Timeout
    public okio.Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // okio.Timeout
    public void throwIfReached() throws java.io.IOException {
        this.delegate.throwIfReached();
    }

    @Override // okio.Timeout
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // okio.Timeout
    public void awaitSignal(java.util.concurrent.locks.Condition condition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "");
        this.delegate.awaitSignal(condition);
    }

    @Override // okio.Timeout
    public void waitUntilNotified(java.lang.Object monitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monitor, "");
        this.delegate.waitUntilNotified(monitor);
    }
}
