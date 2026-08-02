package okio;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J)\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lokio/Throttler;", "", "", "allocatedUntil", "<init>", "(J)V", "()V", "bytesPerSecond", "waitByteCount", "maxByteCount", "", "(JJJ)V", "byteCount", "take$okio", "(J)J", "now", "byteCountOrWaitNanos$okio", "(JJ)J", "Lokio/Source;", "source", "(Lokio/Source;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Throttler {
    private long Camera2StreamConfigurationMap;
    private final java.util.concurrent.locks.Condition condition;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges;
    private long getHighSpeedVideoSizes;
    private final java.util.concurrent.locks.ReentrantLock lock;

    public Throttler(long j) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = 8192L;
        this.getHighSpeedVideoSizes = 262144L;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = reentrantLock;
        java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newCondition, "");
        this.condition = newCondition;
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
        return this.lock;
    }

    public final java.util.concurrent.locks.Condition getCondition() {
        return this.condition;
    }

    public Throttler() {
        this(java.lang.System.nanoTime());
    }

    public static /* synthetic */ void bytesPerSecond$default(okio.Throttler throttler, long j, long j2, long j3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = throttler.getHighSpeedVideoFpsRangesFor;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = throttler.getHighSpeedVideoSizes;
        }
        throttler.bytesPerSecond(j, j4, j3);
    }

    public final void bytesPerSecond(long bytesPerSecond, long waitByteCount, long maxByteCount) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (bytesPerSecond < 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (waitByteCount <= 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (maxByteCount < waitByteCount) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            this.Camera2StreamConfigurationMap = bytesPerSecond;
            this.getHighSpeedVideoFpsRangesFor = waitByteCount;
            this.getHighSpeedVideoSizes = maxByteCount;
            this.condition.signalAll();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long take$okio(long byteCount) {
        if (byteCount <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                long byteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(java.lang.System.nanoTime(), byteCount);
                if (byteCountOrWaitNanos$okio >= 0) {
                    return byteCountOrWaitNanos$okio;
                }
                this.condition.awaitNanos(-byteCountOrWaitNanos$okio);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final long byteCountOrWaitNanos$okio(long now, long byteCount) {
        if (this.Camera2StreamConfigurationMap == 0) {
            return byteCount;
        }
        long max = java.lang.Math.max(this.getHighSpeedVideoFpsRanges - now, 0L);
        long j = this.getHighSpeedVideoSizes;
        long j2 = this.Camera2StreamConfigurationMap;
        long j3 = j - ((max * j2) / 1000000000);
        if (j3 >= byteCount) {
            this.getHighSpeedVideoFpsRanges = now + max + ((byteCount * 1000000000) / j2);
            return byteCount;
        }
        long j4 = this.getHighSpeedVideoFpsRangesFor;
        if (j3 >= j4) {
            this.getHighSpeedVideoFpsRanges = now + ((j * 1000000000) / j2);
            return j3;
        }
        long min = java.lang.Math.min(j4, byteCount);
        long j5 = this.getHighSpeedVideoSizes;
        long j6 = this.Camera2StreamConfigurationMap;
        long j7 = max + (((min - j5) * 1000000000) / j6);
        if (j7 != 0) {
            return -j7;
        }
        this.getHighSpeedVideoFpsRanges = now + ((j5 * 1000000000) / j6);
        return min;
    }

    public final okio.Source source(final okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new okio.ForwardingSource(source) { // from class: okio.Throttler$source$1
            @Override // okio.ForwardingSource, okio.Source
            public final long read(okio.Buffer sink, long byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                try {
                    return super.read(sink, this.take$okio(byteCount));
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    throw new java.io.InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final okio.Sink sink(final okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        return new okio.ForwardingSink(sink) { // from class: okio.Throttler$sink$1
            @Override // okio.ForwardingSink, okio.Sink
            public final void write(okio.Buffer source, long byteCount) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                while (byteCount > 0) {
                    try {
                        long take$okio = this.take$okio(byteCount);
                        super.write(source, take$okio);
                        byteCount -= take$okio;
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.io.InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    public final void bytesPerSecond(long j, long j2) {
        bytesPerSecond$default(this, j, j2, 0L, 4, null);
    }

    public final void bytesPerSecond(long j) {
        bytesPerSecond$default(this, j, 0L, 0L, 6, null);
    }
}
