package okio;

/* compiled from: Pipe.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0014J\r\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0002\b,J\r\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\b-J&\u0010.\u001a\u00020**\u00020\u00142\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020*00¢\u0006\u0002\b1H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u0013\u0010#\u001a\u00020$8G¢\u0006\b\n\u0000\u001a\u0004\b#\u0010%R\u001a\u0010&\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000e¨\u00062"}, d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "canceled", "", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "()Lokio/Sink;", "setFoldedSink$okio", "(Lokio/Sink;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "getMaxBufferSize$okio", "()J", "sink", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "source", "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "cancel", "", "fold", "-deprecated_sink", "-deprecated_source", "forward", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Pipe {
    private final okio.Buffer buffer = new okio.Buffer();
    private boolean canceled;
    private final java.util.concurrent.locks.Condition condition;
    private okio.Sink foldedSink;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final long maxBufferSize;
    private final okio.Sink sink;
    private boolean sinkClosed;
    private final okio.Source source;
    private boolean sourceClosed;

    public Pipe(long j) {
        this.maxBufferSize = j;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = reentrantLock;
        java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        this.condition = newCondition;
        if (j < 1) {
            throw new java.lang.IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
        }
        this.sink = new okio.Sink() { // from class: okio.Pipe$sink$1
            private final okio.Timeout timeout = new okio.Timeout();

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
            
                r1 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
            
                if (r2 == null) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
            
                r0 = r11.this$0;
                r1 = r2.getTimeout();
                r0 = r0.sink().getTimeout();
                r3 = r1.getTimeoutNanos();
                r1.timeout(okio.Timeout.INSTANCE.minTimeout(r0.getTimeoutNanos(), r1.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
            
                if (r1.getHasDeadline() == false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
            
                r5 = r1.deadlineNanoTime();
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
            
                if (r0.getHasDeadline() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
            
                r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
            
                r2.write(r12, r13);
                r12 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
            
                r12 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
            
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
            
                if (r0.getHasDeadline() != false) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
            
                r1.deadlineNanoTime(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
            
                throw r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
            
                if (r0.getHasDeadline() == false) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
            
                r1.deadlineNanoTime(r0.deadlineNanoTime());
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
            
                r2.write(r12, r13);
                r12 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
            
                r12 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x010a, code lost:
            
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
            
                if (r0.getHasDeadline() != false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
            
                r1.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
            
                throw r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
            
                return;
             */
            @Override // okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void write(okio.Buffer source, long byteCount) {
                okio.Sink sink;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed())) {
                        throw new java.lang.IllegalStateException("closed".toString());
                    }
                    if (!pipe.getCanceled()) {
                        while (true) {
                            if (byteCount <= 0) {
                                sink = null;
                                break;
                            }
                            sink = pipe.getFoldedSink();
                            if (sink != null) {
                                break;
                            }
                            if (pipe.getSourceClosed()) {
                                throw new java.io.IOException("source is closed");
                            }
                            long maxBufferSize = pipe.getMaxBufferSize() - pipe.getBuffer().size();
                            if (maxBufferSize == 0) {
                                this.timeout.awaitSignal(pipe.getCondition());
                                if (pipe.getCanceled()) {
                                    throw new java.io.IOException("canceled");
                                }
                            } else {
                                long min = java.lang.Math.min(maxBufferSize, byteCount);
                                pipe.getBuffer().write(source, min);
                                byteCount -= min;
                                pipe.getCondition().signalAll();
                            }
                        }
                    } else {
                        throw new java.io.IOException("canceled");
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                boolean hasDeadline;
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed())) {
                        throw new java.lang.IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new java.io.IOException("canceled");
                    }
                    okio.Sink foldedSink = pipe.getFoldedSink();
                    if (foldedSink == null) {
                        if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                            throw new java.io.IOException("source is closed");
                        }
                        foldedSink = null;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (foldedSink != null) {
                        okio.Pipe pipe2 = okio.Pipe.this;
                        okio.Timeout timeout = foldedSink.getTimeout();
                        okio.Timeout timeout2 = pipe2.sink().getTimeout();
                        long timeoutNanos = timeout.getTimeoutNanos();
                        timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (timeout.getHasDeadline()) {
                            long deadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink.flush();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                if (hasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(deadlineNanoTime);
                                }
                            }
                        }
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.flush();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } finally {
                            timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                boolean hasDeadline;
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed()) {
                        return;
                    }
                    okio.Sink foldedSink = pipe.getFoldedSink();
                    if (foldedSink == null) {
                        if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                            throw new java.io.IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getCondition().signalAll();
                        foldedSink = null;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (foldedSink != null) {
                        okio.Pipe pipe2 = okio.Pipe.this;
                        okio.Timeout timeout = foldedSink.getTimeout();
                        okio.Timeout timeout2 = pipe2.sink().getTimeout();
                        long timeoutNanos = timeout.getTimeoutNanos();
                        timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (timeout.getHasDeadline()) {
                            long deadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink.close();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                if (hasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(deadlineNanoTime);
                                }
                            }
                        }
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.close();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } finally {
                            timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink
            /* renamed from: timeout, reason: from getter */
            public okio.Timeout getTimeout() {
                return this.timeout;
            }
        };
        this.source = new okio.Source() { // from class: okio.Pipe$source$1
            private final okio.Timeout timeout = new okio.Timeout();

            @Override // okio.Source
            public long read(okio.Buffer sink, long byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSourceClosed())) {
                        throw new java.lang.IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new java.io.IOException("canceled");
                    }
                    while (pipe.getBuffer().size() == 0) {
                        if (pipe.getSinkClosed()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.timeout.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled()) {
                            throw new java.io.IOException("canceled");
                        }
                    }
                    long read = pipe.getBuffer().read(sink, byteCount);
                    pipe.getCondition().signalAll();
                    return read;
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    pipe.setSourceClosed$okio(true);
                    pipe.getCondition().signalAll();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source
            /* renamed from: timeout, reason: from getter */
            public okio.Timeout getTimeout() {
                return this.timeout;
            }
        };
    }

    /* renamed from: getMaxBufferSize$okio, reason: from getter */
    public final long getMaxBufferSize() {
        return this.maxBufferSize;
    }

    /* renamed from: getBuffer$okio, reason: from getter */
    public final okio.Buffer getBuffer() {
        return this.buffer;
    }

    /* renamed from: getCanceled$okio, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    public final void setCanceled$okio(boolean z) {
        this.canceled = z;
    }

    /* renamed from: getSinkClosed$okio, reason: from getter */
    public final boolean getSinkClosed() {
        return this.sinkClosed;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.sinkClosed = z;
    }

    /* renamed from: getSourceClosed$okio, reason: from getter */
    public final boolean getSourceClosed() {
        return this.sourceClosed;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.sourceClosed = z;
    }

    /* renamed from: getFoldedSink$okio, reason: from getter */
    public final okio.Sink getFoldedSink() {
        return this.foldedSink;
    }

    public final void setFoldedSink$okio(okio.Sink sink) {
        this.foldedSink = sink;
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
        return this.lock;
    }

    public final java.util.concurrent.locks.Condition getCondition() {
        return this.condition;
    }

    public final okio.Sink sink() {
        return this.sink;
    }

    public final okio.Source source() {
        return this.source;
    }

    public final void fold(okio.Sink sink) throws java.io.IOException {
        okio.Buffer buffer;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            this.lock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new java.lang.IllegalStateException("sink already folded".toString());
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new java.io.IOException("canceled");
                }
                boolean z2 = this.sinkClosed;
                okio.Buffer buffer2 = null;
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    buffer = null;
                    z = true;
                } else {
                    buffer = new okio.Buffer();
                    okio.Buffer buffer3 = this.buffer;
                    buffer.write(buffer3, buffer3.size());
                    this.condition.signalAll();
                    z = false;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (z) {
                    if (z2) {
                        sink.close();
                        return;
                    }
                    return;
                }
                if (buffer == null) {
                    try {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sinkBuffer");
                    } catch (java.lang.Throwable th) {
                        this.lock.lock();
                        try {
                            this.sourceClosed = true;
                            this.condition.signalAll();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    buffer2 = buffer;
                }
                sink.write(buffer2, buffer.size());
                sink.flush();
            } finally {
            }
        }
    }

    private final void forward(okio.Sink sink, kotlin.jvm.functions.Function1<? super okio.Sink, kotlin.Unit> function1) {
        okio.Timeout timeout = sink.getTimeout();
        okio.Timeout timeout2 = sink().getTimeout();
        long timeoutNanos = timeout.getTimeoutNanos();
        timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
        if (timeout.getHasDeadline()) {
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                function1.invoke(sink);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }
        if (timeout2.getHasDeadline()) {
            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
        }
        try {
            function1.invoke(sink);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            if (timeout2.getHasDeadline()) {
                timeout.clearDeadline();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sink", imports = {}))
    /* renamed from: -deprecated_sink, reason: not valid java name and from getter */
    public final okio.Sink getSink() {
        return this.sink;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "source", imports = {}))
    /* renamed from: -deprecated_source, reason: not valid java name and from getter */
    public final okio.Source getSource() {
        return this.source;
    }

    public final void cancel() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
