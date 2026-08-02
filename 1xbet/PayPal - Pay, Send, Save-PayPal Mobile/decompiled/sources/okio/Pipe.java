package okio;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R$\u0010'\u001a\u0004\u0018\u00010\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\nR\u001a\u0010,\u001a\u00020+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b\u0007\u0010\fR\u001a\u00105\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u0010\u000f"}, d2 = {"Lokio/Pipe;", "", "", "maxBufferSize", "<init>", "(J)V", "Lokio/Sink;", "sink", "", "fold", "(Lokio/Sink;)V", "-deprecated_sink", "()Lokio/Sink;", "Lokio/Source;", "-deprecated_source", "()Lokio/Source;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "J", "getMaxBufferSize$okio", "()J", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED, "Z", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "setFoldedSink$okio", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "source", "Lokio/Source;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
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
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newCondition, "");
        this.condition = newCondition;
        if (j < 1) {
            throw new java.lang.IllegalArgumentException("maxBufferSize < 1: ".concat(java.lang.String.valueOf(j)).toString());
        }
        this.sink = new okio.Sink() { // from class: okio.Pipe$sink$1

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private final okio.Timeout getHighSpeedVideoSizes = new okio.Timeout();

            /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
            
                r1 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
            
                if (r2 == null) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
            
                r0 = r11.getHighResolutionOutputSizeshNQ4ISI;
                r1 = r2.getGetHighSpeedVideoSizes();
                r0 = r0.sink().getGetHighSpeedVideoSizes();
                r3 = r1.getTimeoutNanos();
                r1.timeout(okio.Timeout.INSTANCE.minTimeout(r0.getTimeoutNanos(), r1.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
            
                if (r1.getHasDeadline() == false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
            
                r5 = r1.deadlineNanoTime();
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
            
                if (r0.getHasDeadline() == false) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
            
                r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
            
                r2.write(r12, r13);
                r12 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
            
                r12 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
            
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
            
                if (r0.getHasDeadline() != false) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
            
                r1.deadlineNanoTime(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
            
                throw r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
            
                if (r0.getHasDeadline() == false) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
            
                r1.deadlineNanoTime(r0.deadlineNanoTime());
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
            
                r2.write(r12, r13);
                r12 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0106, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
            
                r12 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
            
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0111, code lost:
            
                if (r0.getHasDeadline() != false) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
            
                r1.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0116, code lost:
            
                throw r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
            
                return;
             */
            @Override // okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void write(okio.Buffer source, long byteCount) {
                okio.Sink sink;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed()) {
                        throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
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
                                this.getHighSpeedVideoSizes.awaitSignal(pipe.getCondition());
                                if (pipe.getCanceled()) {
                                    throw new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
                                }
                            } else {
                                long min = java.lang.Math.min(maxBufferSize, byteCount);
                                pipe.getBuffer().write(source, min);
                                byteCount -= min;
                                pipe.getCondition().signalAll();
                            }
                        }
                    } else {
                        throw new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public final void flush() {
                boolean hasDeadline;
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed()) {
                        throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
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
                        okio.Timeout getHighSpeedVideoSizes = foldedSink.getGetHighSpeedVideoSizes();
                        okio.Timeout getHighSpeedVideoSizes2 = pipe2.sink().getGetHighSpeedVideoSizes();
                        long timeoutNanos = getHighSpeedVideoSizes.getTimeoutNanos();
                        getHighSpeedVideoSizes.timeout(okio.Timeout.INSTANCE.minTimeout(getHighSpeedVideoSizes2.getTimeoutNanos(), getHighSpeedVideoSizes.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (getHighSpeedVideoSizes.getHasDeadline()) {
                            long deadlineNanoTime = getHighSpeedVideoSizes.deadlineNanoTime();
                            if (getHighSpeedVideoSizes2.getHasDeadline()) {
                                getHighSpeedVideoSizes.deadlineNanoTime(java.lang.Math.min(getHighSpeedVideoSizes.deadlineNanoTime(), getHighSpeedVideoSizes2.deadlineNanoTime()));
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
                                getHighSpeedVideoSizes.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                                if (getHighSpeedVideoSizes2.getHasDeadline()) {
                                    getHighSpeedVideoSizes.deadlineNanoTime(deadlineNanoTime);
                                }
                            }
                        }
                        if (getHighSpeedVideoSizes2.getHasDeadline()) {
                            getHighSpeedVideoSizes.deadlineNanoTime(getHighSpeedVideoSizes2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.flush();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } finally {
                            getHighSpeedVideoSizes.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                            if (getHighSpeedVideoSizes2.getHasDeadline()) {
                                getHighSpeedVideoSizes.clearDeadline();
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
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
                        okio.Timeout getHighSpeedVideoSizes = foldedSink.getGetHighSpeedVideoSizes();
                        okio.Timeout getHighSpeedVideoSizes2 = pipe2.sink().getGetHighSpeedVideoSizes();
                        long timeoutNanos = getHighSpeedVideoSizes.getTimeoutNanos();
                        getHighSpeedVideoSizes.timeout(okio.Timeout.INSTANCE.minTimeout(getHighSpeedVideoSizes2.getTimeoutNanos(), getHighSpeedVideoSizes.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (!getHighSpeedVideoSizes.getHasDeadline()) {
                            if (getHighSpeedVideoSizes2.getHasDeadline()) {
                                getHighSpeedVideoSizes.deadlineNanoTime(getHighSpeedVideoSizes2.deadlineNanoTime());
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
                                getHighSpeedVideoSizes.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                                if (getHighSpeedVideoSizes2.getHasDeadline()) {
                                    getHighSpeedVideoSizes.clearDeadline();
                                }
                            }
                        }
                        long deadlineNanoTime = getHighSpeedVideoSizes.deadlineNanoTime();
                        if (getHighSpeedVideoSizes2.getHasDeadline()) {
                            getHighSpeedVideoSizes.deadlineNanoTime(java.lang.Math.min(getHighSpeedVideoSizes.deadlineNanoTime(), getHighSpeedVideoSizes2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink.close();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } finally {
                            getHighSpeedVideoSizes.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                            if (getHighSpeedVideoSizes2.getHasDeadline()) {
                                getHighSpeedVideoSizes.deadlineNanoTime(deadlineNanoTime);
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink
            /* renamed from: timeout, reason: from getter */
            public final okio.Timeout getGetHighSpeedVideoSizes() {
                return this.getHighSpeedVideoSizes;
            }
        };
        this.source = new okio.Source() { // from class: okio.Pipe$source$1
            private final okio.Timeout getHighSpeedVideoFpsRanges = new okio.Timeout();

            @Override // okio.Source
            public final long read(okio.Buffer sink, long byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSourceClosed()) {
                        throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
                    }
                    while (pipe.getBuffer().size() == 0) {
                        if (pipe.getSinkClosed()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.getHighSpeedVideoFpsRanges.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled()) {
                            throw new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
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
            public final void close() {
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
            public final okio.Timeout getGetHighSpeedVideoFpsRanges() {
                return this.getHighSpeedVideoFpsRanges;
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        while (true) {
            this.lock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new java.lang.IllegalStateException("sink already folded".toString());
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
                }
                boolean z2 = this.sinkClosed;
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    buffer = null;
                    z = true;
                } else {
                    buffer = new okio.Buffer();
                    okio.Buffer buffer2 = this.buffer;
                    buffer.write(buffer2, buffer2.size());
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
                try {
                    sink.write(buffer, buffer.size());
                    sink.flush();
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
            } finally {
            }
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
