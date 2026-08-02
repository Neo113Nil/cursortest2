package okio;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010 \u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokio/Timeout;", "", "<init>", "()V", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;", "timeoutNanos", "()J", "", "hasDeadline", "()Z", "deadlineNanoTime", "(J)Lokio/Timeout;", "duration", "deadline", "clearTimeout", "()Lokio/Timeout;", "clearDeadline", "", "throwIfReached", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "Ljava/util/concurrent/locks/Condition;", "condition", "awaitSignal", "(Ljava/util/concurrent/locks/Condition;)V", "monitor", "waitUntilNotified", "(Ljava/lang/Object;)V", "T", "other", "Lkotlin/Function0;", "block", "intersectWith", "(Lokio/Timeout;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Z", "J", "cancelMark", "Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Timeout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.Timeout.Companion INSTANCE = new okio.Timeout.Companion(null);
    public static final okio.Timeout NONE = new okio.Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        public final void throwIfReached() {
        }

        @Override // okio.Timeout
        public final okio.Timeout timeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            return this;
        }

        @Override // okio.Timeout
        public final okio.Timeout deadlineNanoTime(long deadlineNanoTime) {
            return this;
        }
    };
    private volatile java.lang.Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public okio.Timeout timeout(long timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        if (timeout < 0) {
            throw new java.lang.IllegalArgumentException("timeout < 0: ".concat(java.lang.String.valueOf(timeout)).toString());
        }
        this.timeoutNanos = unit.toNanos(timeout);
        return this;
    }

    /* renamed from: timeoutNanos, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    /* renamed from: hasDeadline, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public long deadlineNanoTime() {
        if (!this.hasDeadline) {
            throw new java.lang.IllegalStateException("No deadline".toString());
        }
        return this.deadlineNanoTime;
    }

    public okio.Timeout deadlineNanoTime(long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }

    public final okio.Timeout deadline(long duration, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        if (duration <= 0) {
            throw new java.lang.IllegalArgumentException("duration <= 0: ".concat(java.lang.String.valueOf(duration)).toString());
        }
        return deadlineNanoTime(java.lang.System.nanoTime() + unit.toNanos(duration));
    }

    public okio.Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public okio.Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public void throwIfReached() throws java.io.IOException {
        if (java.lang.Thread.currentThread().isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public void cancel() {
        this.cancelMark = new java.lang.Object();
    }

    public void awaitSignal(java.util.concurrent.locks.Condition condition) throws java.io.InterruptedIOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = java.lang.Math.min(timeoutNanos, deadlineNanoTime() - java.lang.System.nanoTime());
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - java.lang.System.nanoTime();
            }
            if (timeoutNanos <= 0) {
                throw new java.io.InterruptedIOException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
            }
            java.lang.Object obj = this.cancelMark;
            if (condition.awaitNanos(timeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new java.io.InterruptedIOException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException("interrupted");
        }
    }

    public void waitUntilNotified(java.lang.Object monitor) throws java.io.InterruptedIOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monitor, "");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long nanoTime = java.lang.System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = java.lang.Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos <= 0) {
                throw new java.io.InterruptedIOException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
            }
            java.lang.Object obj = this.cancelMark;
            long j = timeoutNanos / 1000000;
            monitor.wait(j, (int) (timeoutNanos - (1000000 * j)));
            if (java.lang.System.nanoTime() - nanoTime >= timeoutNanos && this.cancelMark == obj) {
                throw new java.io.InterruptedIOException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException("interrupted");
        }
    }

    public final <T> T intersectWith(okio.Timeout other, kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        long timeoutNanos = getTimeoutNanos();
        timeout(INSTANCE.minTimeout(other.getTimeoutNanos(), getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
        if (getHasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (other.getHasDeadline()) {
                deadlineNanoTime(java.lang.Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
            }
            try {
                return block.invoke();
            } finally {
                timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                if (other.getHasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
            }
        }
        if (other.getHasDeadline()) {
            deadlineNanoTime(other.deadlineNanoTime());
        }
        try {
            return block.invoke();
        } finally {
            timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            if (other.getHasDeadline()) {
                clearDeadline();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0006\u0010\tJ\u0019\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lokio/Timeout$Companion;", "", "<init>", "()V", "Lokio/Timeout;", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Lkotlin/time/DurationUnit;", "unit", "(Lokio/Timeout;JLkotlin/time/DurationUnit;)Lokio/Timeout;", "Lkotlin/time/Duration;", "duration", "timeout-HG0u8IE", "(Lokio/Timeout;J)Lokio/Timeout;", "aNanos", "bNanos", "minTimeout", "(JJ)J", "NONE", "Lokio/Timeout;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public final long minTimeout(long aNanos, long bNanos) {
            return (aNanos == 0 || (bNanos != 0 && aNanos >= bNanos)) ? bNanos : aNanos;
        }

        private Companion() {
        }

        public final okio.Timeout timeout(okio.Timeout timeout, long j, kotlin.time.DurationUnit durationUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
            return timeout.timeout(j, kotlin.time.DurationUnitKt.toTimeUnit(durationUnit));
        }

        /* renamed from: timeout-HG0u8IE, reason: not valid java name */
        public final okio.Timeout m24452timeoutHG0u8IE(okio.Timeout timeout, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "");
            return timeout.timeout(kotlin.time.Duration.m23955getInWholeNanosecondsimpl(j), java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
