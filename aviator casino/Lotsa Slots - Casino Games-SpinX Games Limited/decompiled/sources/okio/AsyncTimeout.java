package okio;

/* compiled from: AsyncTimeout.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\fH\u0014J%\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", io.ktor.http.LinkHeader.Rel.Next, "state", "", "timeoutAt", "", "access$newTimeoutException", "Ljava/io/IOException;", "cause", "cancel", "", "enter", "exit", "", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "withTimeout", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Watchdog", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AsyncTimeout extends okio.Timeout {
    private static final okio.AsyncTimeout.Companion Companion = new okio.AsyncTimeout.Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final java.util.concurrent.locks.Condition condition;
    private static okio.AsyncTimeout head;
    private static final java.util.concurrent.locks.ReentrantLock lock;
    private okio.AsyncTimeout next;
    private int state;
    private long timeoutAt;

    protected void timedOut() {
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
                Companion.insertIntoQueue(this, timeoutNanos, hasDeadline);
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
            Companion.removeFromQueue(this);
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
                Companion.removeFromQueue(this);
                this.state = 3;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    public final okio.Sink sink(final okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        return new okio.Sink() { // from class: okio.AsyncTimeout$sink$1
            @Override // okio.Sink
            public void write(okio.Buffer source, long byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
                while (true) {
                    long j = 0;
                    if (byteCount <= 0) {
                        return;
                    }
                    okio.Segment segment = source.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    while (true) {
                        if (j >= android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
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
            public void flush() {
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
            public void close() {
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
            public okio.AsyncTimeout getThis$0() {
                return okio.AsyncTimeout.this;
            }

            public java.lang.String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }
        };
    }

    public final okio.Source source(final okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return new okio.Source() { // from class: okio.AsyncTimeout$source$1
            @Override // okio.Source
            public long read(okio.Buffer sink, long byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
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
            public void close() {
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
            public okio.AsyncTimeout getThis$0() {
                return okio.AsyncTimeout.this;
            }

            public java.lang.String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }
        };
    }

    public final <T> T withTimeout(kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T invoke = block.invoke();
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                return invoke;
            } catch (java.io.IOException e) {
                e = e;
                if (exit()) {
                    e = access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            exit();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final java.io.IOException access$newTimeoutException(java.io.IOException cause) {
        return newTimeoutException(cause);
    }

    protected java.io.IOException newTimeoutException(java.io.IOException cause) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* compiled from: AsyncTimeout.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "()V", "run", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Watchdog extends java.lang.Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.util.concurrent.locks.ReentrantLock lock;
            okio.AsyncTimeout awaitTimeout;
            while (true) {
                try {
                    lock = okio.AsyncTimeout.Companion.getLock();
                    lock.lock();
                    try {
                        awaitTimeout = okio.AsyncTimeout.Companion.awaitTimeout();
                    } finally {
                        lock.unlock();
                    }
                } catch (java.lang.InterruptedException unused) {
                    continue;
                }
                if (awaitTimeout == okio.AsyncTimeout.head) {
                    okio.AsyncTimeout.Companion unused2 = okio.AsyncTimeout.Companion;
                    okio.AsyncTimeout.head = null;
                    return;
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    lock.unlock();
                    if (awaitTimeout != null) {
                        awaitTimeout.timedOut();
                    }
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "()V", "IDLE_TIMEOUT_MILLIS", "", "IDLE_TIMEOUT_NANOS", "STATE_CANCELED", "", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "TIMEOUT_WRITE_SIZE", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "head", "Lokio/AsyncTimeout;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "awaitTimeout", "insertIntoQueue", "", "node", "timeoutNanos", "hasDeadline", "", "removeFromQueue", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.concurrent.locks.ReentrantLock getLock() {
            return okio.AsyncTimeout.lock;
        }

        public final java.util.concurrent.locks.Condition getCondition() {
            return okio.AsyncTimeout.condition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void insertIntoQueue(okio.AsyncTimeout node, long timeoutNanos, boolean hasDeadline) {
            if (okio.AsyncTimeout.head == null) {
                okio.AsyncTimeout.head = new okio.AsyncTimeout();
                new okio.AsyncTimeout.Watchdog().start();
            }
            long nanoTime = java.lang.System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.timeoutAt = java.lang.Math.min(timeoutNanos, node.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (timeoutNanos != 0) {
                node.timeoutAt = timeoutNanos + nanoTime;
            } else if (hasDeadline) {
                node.timeoutAt = node.deadlineNanoTime();
            } else {
                throw new java.lang.AssertionError();
            }
            long remainingNanos = node.remainingNanos(nanoTime);
            okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
            while (asyncTimeout.next != null) {
                okio.AsyncTimeout asyncTimeout2 = asyncTimeout.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout2);
                if (remainingNanos < asyncTimeout2.remainingNanos(nanoTime)) {
                    break;
                }
                asyncTimeout = asyncTimeout.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
            }
            node.next = asyncTimeout.next;
            asyncTimeout.next = node;
            if (asyncTimeout == okio.AsyncTimeout.head) {
                getCondition().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeFromQueue(okio.AsyncTimeout node) {
            for (okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.head; asyncTimeout != null; asyncTimeout = asyncTimeout.next) {
                if (asyncTimeout.next == node) {
                    asyncTimeout.next = node.next;
                    node.next = null;
                    return;
                }
            }
            throw new java.lang.IllegalStateException("node was not found in the queue".toString());
        }

        public final okio.AsyncTimeout awaitTimeout() throws java.lang.InterruptedException {
            okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
            okio.AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 != null) {
                long remainingNanos = asyncTimeout2.remainingNanos(java.lang.System.nanoTime());
                if (remainingNanos <= 0) {
                    okio.AsyncTimeout asyncTimeout3 = okio.AsyncTimeout.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout3);
                    asyncTimeout3.next = asyncTimeout2.next;
                    asyncTimeout2.next = null;
                    asyncTimeout2.state = 2;
                    return asyncTimeout2;
                }
                getCondition().await(remainingNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = java.lang.System.nanoTime();
            getCondition().await(okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS, java.util.concurrent.TimeUnit.MILLISECONDS);
            okio.AsyncTimeout asyncTimeout4 = okio.AsyncTimeout.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout4);
            if (asyncTimeout4.next != null || java.lang.System.nanoTime() - nanoTime < okio.AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return okio.AsyncTimeout.head;
        }
    }

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        lock = reentrantLock;
        java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }
}
