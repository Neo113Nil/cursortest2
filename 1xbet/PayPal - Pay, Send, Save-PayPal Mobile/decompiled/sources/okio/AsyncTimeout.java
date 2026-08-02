package okio;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b \u0010\u001fR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b$\u0010#R$\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n8\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "<init>", "()V", "", "enter", "", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, "()Z", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "", "now", "remainingNanos$okio", "(J)J", "setTimeoutAt$okio", "(J)V", "timedOut", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", "Lokio/Source;", "source", "(Lokio/Source;)Lokio/Source;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "", "state", com.visa.cbp.getEncExpo.warmup, "index", "p0", "timeoutAt", "J", "getTimeoutAt$okio", "()J", "Companion", "Watchdog"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class AsyncTimeout extends okio.Timeout {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final java.util.concurrent.locks.Condition condition;
    private static okio.AsyncTimeout idleSentinel;
    private static final java.util.concurrent.locks.ReentrantLock lock;
    public int index = -1;
    private int state;
    private long timeoutAt;
    private static final okio.AsyncTimeout.Companion Companion = new okio.AsyncTimeout.Companion(null);
    private static final okio.PriorityQueue queue = new okio.PriorityQueue();

    protected void timedOut() {
    }

    /* renamed from: getTimeoutAt$okio, reason: from getter */
    public final long getTimeoutAt() {
        return this.timeoutAt;
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new java.lang.IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.state = 1;
                okio.AsyncTimeout.Companion.getHighSpeedVideoFpsRanges(Companion, this);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            queue.remove(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // okio.Timeout
    public void cancel() {
        super.cancel();
        java.util.concurrent.locks.ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                queue.remove(this);
                this.state = 3;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long remainingNanos$okio(long now) {
        return this.timeoutAt - now;
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(okio.AsyncTimeout asyncTimeout, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimeoutAt");
        }
        if ((i & 1) != 0) {
            j = java.lang.System.nanoTime();
        }
        asyncTimeout.setTimeoutAt$okio(j);
    }

    public final void setTimeoutAt$okio(long now) {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (getTimeoutNanos() != 0 && getHasDeadline()) {
            this.timeoutAt = now + java.lang.Math.min(timeoutNanos, deadlineNanoTime() - now);
        } else if (timeoutNanos != 0) {
            this.timeoutAt = now + timeoutNanos;
        } else {
            if (hasDeadline) {
                this.timeoutAt = deadlineNanoTime();
                return;
            }
            throw new java.lang.AssertionError();
        }
    }

    public final okio.Sink sink(final okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        return new okio.Sink() { // from class: okio.AsyncTimeout$sink$1
            @Override // okio.Sink
            public final void write(okio.Buffer source, long byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
                while (true) {
                    long j = 0;
                    if (byteCount <= 0) {
                        return;
                    }
                    okio.Segment segment = source.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    while (true) {
                        if (j >= 65536) {
                            break;
                        }
                        j += segment.limit - segment.pos;
                        if (j >= byteCount) {
                            j = byteCount;
                            break;
                        } else {
                            segment = segment.next;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        }
                    }
                    okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                    okio.Sink sink2 = sink;
                    asyncTimeout.enter();
                    try {
                        sink2.write(source, j);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        byteCount -= j;
                    } catch (java.io.IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    } finally {
                        asyncTimeout.exit();
                    }
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public final void flush() {
                okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                okio.Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.flush();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    if (asyncTimeout.exit()) {
                        e = asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                okio.Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.close();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    if (asyncTimeout.exit()) {
                        e = asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink
            /* renamed from: timeout, reason: from getter */
            public final okio.AsyncTimeout getGetHighSpeedVideoSizes() {
                return okio.AsyncTimeout.this;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AsyncTimeout.sink(");
                sb.append(sink);
                sb.append(')');
                return sb.toString();
            }
        };
    }

    public final okio.Source source(final okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new okio.Source() { // from class: okio.AsyncTimeout$source$1
            @Override // okio.Source
            public final long read(okio.Buffer sink, long byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                okio.Source source2 = source;
                asyncTimeout.enter();
                try {
                    long read = source2.read(sink, byteCount);
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    return read;
                } catch (java.io.IOException e) {
                    e = e;
                    if (asyncTimeout.exit()) {
                        e = asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                okio.Source source2 = source;
                asyncTimeout.enter();
                try {
                    source2.close();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    if (asyncTimeout.exit()) {
                        e = asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            /* renamed from: timeout, reason: from getter */
            public final okio.AsyncTimeout getCamera2StreamConfigurationMap() {
                return okio.AsyncTimeout.this;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AsyncTimeout.source(");
                sb.append(source);
                sb.append(')');
                return sb.toString();
            }
        };
    }

    public final <T> T withTimeout(kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        enter();
        try {
            T invoke = block.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return invoke;
        } catch (java.io.IOException e) {
            e = e;
            if (exit()) {
                e = access$newTimeoutException(e);
            }
            throw e;
        } finally {
            exit();
        }
    }

    public final java.io.IOException access$newTimeoutException(java.io.IOException cause) {
        return newTimeoutException(cause);
    }

    protected java.io.IOException newTimeoutException(java.io.IOException cause) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "<init>", "()V", "", "run"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class Watchdog extends java.lang.Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            java.util.concurrent.locks.ReentrantLock lock;
            okio.AsyncTimeout.Companion companion;
            okio.AsyncTimeout first;
            while (true) {
                try {
                    lock = okio.AsyncTimeout.Companion.getLock();
                    lock.lock();
                    try {
                        companion = okio.AsyncTimeout.Companion;
                        first = companion.getQueue().first();
                    } finally {
                        lock.unlock();
                    }
                } catch (java.lang.InterruptedException unused) {
                }
                if (first == null) {
                    long nanoTime = java.lang.System.nanoTime();
                    companion.getCondition().await(okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS, java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (companion.getQueue().first() == null && java.lang.System.nanoTime() - nanoTime >= okio.AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                        first = companion.getIdleSentinel();
                        if (first != okio.AsyncTimeout.Companion.getIdleSentinel()) {
                            okio.AsyncTimeout.Companion.setIdleSentinel(null);
                            return;
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        lock.unlock();
                        if (first != null) {
                            first.timedOut();
                        }
                    }
                    first = null;
                    if (first != okio.AsyncTimeout.Companion.getIdleSentinel()) {
                    }
                } else {
                    long remainingNanos$okio = first.remainingNanos$okio(java.lang.System.nanoTime());
                    if (remainingNanos$okio > 0) {
                        companion.getCondition().await(remainingNanos$okio, java.util.concurrent.TimeUnit.NANOSECONDS);
                        first = null;
                        if (first != okio.AsyncTimeout.Companion.getIdleSentinel()) {
                        }
                    } else {
                        companion.getQueue().remove(first);
                        first.state = 2;
                        if (first != okio.AsyncTimeout.Companion.getIdleSentinel()) {
                        }
                    }
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0083T¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\u001a8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u001a8\u0002X\u0083T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u001a8\u0002X\u0083T¢\u0006\u0006\n\u0004\b$\u0010\u001c"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "<init>", "()V", "Lokio/PriorityQueue;", "queue", "Lokio/PriorityQueue;", "getQueue", "()Lokio/PriorityQueue;", "Lokio/AsyncTimeout;", "idleSentinel", "Lokio/AsyncTimeout;", "getIdleSentinel", "()Lokio/AsyncTimeout;", "setIdleSentinel", "(Lokio/AsyncTimeout;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "", "TIMEOUT_WRITE_SIZE", com.visa.cbp.getEncExpo.warmup, "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public final okio.PriorityQueue getQueue() {
            return okio.AsyncTimeout.queue;
        }

        public final okio.AsyncTimeout getIdleSentinel() {
            return okio.AsyncTimeout.idleSentinel;
        }

        public final void setIdleSentinel(okio.AsyncTimeout asyncTimeout) {
            okio.AsyncTimeout.idleSentinel = asyncTimeout;
        }

        public final java.util.concurrent.locks.ReentrantLock getLock() {
            return okio.AsyncTimeout.lock;
        }

        public final java.util.concurrent.locks.Condition getCondition() {
            return okio.AsyncTimeout.condition;
        }

        public static final /* synthetic */ void getHighSpeedVideoFpsRanges(okio.AsyncTimeout.Companion companion, okio.AsyncTimeout asyncTimeout) {
            if (companion.getIdleSentinel() == null) {
                companion.setIdleSentinel(new okio.AsyncTimeout());
                new okio.AsyncTimeout.Watchdog().start();
            }
            okio.AsyncTimeout.setTimeoutAt$okio$default(asyncTimeout, 0L, 1, null);
            companion.getQueue().add(asyncTimeout);
            if (asyncTimeout.index == 1) {
                companion.getCondition().signal();
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        lock = reentrantLock;
        java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newCondition, "");
        condition = newCondition;
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }
}
