package okio;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002BCB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0018\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001a\u001a\u00020\u001e2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0011\u001a\u00020$2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010%J\r\u0010&\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020$¢\u0006\u0004\b \u0010(J\u001d\u0010\"\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020$2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b\"\u0010)J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u001dJ/\u0010+\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH$¢\u0006\u0004\b+\u0010\u000fJ/\u0010,\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH$¢\u0006\u0004\b,\u0010\u0019J\u000f\u0010-\u001a\u00020\u0015H$¢\u0006\u0004\b-\u0010\u001dJ\u0017\u0010.\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0007H$¢\u0006\u0004\b.\u0010\u0017J\u000f\u0010/\u001a\u00020\u0007H$¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0015H$¢\u0006\u0004\b0\u0010\u001dJ'\u00104\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u0010\u0012J'\u00105\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u00108R\u0016\u0010:\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010;R\u001e\u0010>\u001a\u00060<j\u0002`=8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "read", "(J[BII)I", "Lokio/Buffer;", "sink", "(JLokio/Buffer;J)J", io.ktor.http.ContentDisposition.Parameters.Size, "()J", "", "resize", "(J)V", "write", "(J[BII)V", "source", "(JLokio/Buffer;J)V", "flush", "()V", "Lokio/Source;", "(J)Lokio/Source;", com.daon.sdk.face.license.License.FEATURE_POSITION, "(Lokio/Source;)J", "reposition", "(Lokio/Source;J)V", "Lokio/Sink;", "(J)Lokio/Sink;", "appendingSink", "()Lokio/Sink;", "(Lokio/Sink;)J", "(Lokio/Sink;J)V", "close", "protectedRead", "protectedWrite", "protectedFlush", "protectedResize", "protectedSize", "protectedClose", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Z", "getReadWrite", "()Z", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/getHighResolutionOutputSizeshNQ4ISI;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "FileHandleSink", "FileHandleSource"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FileHandle implements java.io.Closeable {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private final java.util.concurrent.locks.ReentrantLock lock = okio._JvmPlatformKt.newLock();
    private final boolean readWrite;

    protected abstract void protectedClose() throws java.io.IOException;

    protected abstract void protectedFlush() throws java.io.IOException;

    protected abstract int protectedRead(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws java.io.IOException;

    protected abstract void protectedResize(long size) throws java.io.IOException;

    protected abstract long protectedSize() throws java.io.IOException;

    protected abstract void protectedWrite(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws java.io.IOException;

    public FileHandle(boolean z) {
        this.readWrite = z;
    }

    public final boolean getReadWrite() {
        return this.readWrite;
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
        return this.lock;
    }

    public final int read(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            return protectedRead(fileOffset, array, arrayOffset, byteCount);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long read(long fileOffset, okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            return getHighResolutionOutputSizeshNQ4ISI(fileOffset, sink, byteCount);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() throws java.io.IOException {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            return protectedSize();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void resize(long size) throws java.io.IOException {
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            protectedResize(size);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void write(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            protectedWrite(fileOffset, array, arrayOffset, byteCount);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void write(long fileOffset, okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            getHighSpeedVideoFpsRangesFor(fileOffset, source, byteCount);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() throws java.io.IOException {
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            protectedFlush();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static /* synthetic */ okio.Source source$default(okio.FileHandle fileHandle, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return fileHandle.source(j);
    }

    public final okio.Source source(long fileOffset) throws java.io.IOException {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            this.getHighSpeedVideoFpsRanges++;
            reentrantLock.unlock();
            return new okio.FileHandle.FileHandleSource(this, fileOffset);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long position(okio.Source source) throws java.io.IOException {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (source instanceof okio.RealBufferedSource) {
            okio.RealBufferedSource realBufferedSource = (okio.RealBufferedSource) source;
            j = realBufferedSource.bufferField.size();
            source = realBufferedSource.source;
        } else {
            j = 0;
        }
        if (source instanceof okio.FileHandle.FileHandleSource) {
            okio.FileHandle.FileHandleSource fileHandleSource = (okio.FileHandle.FileHandleSource) source;
            if (fileHandleSource.getHighSpeedVideoFpsRanges == this) {
                if (fileHandleSource.Camera2StreamConfigurationMap) {
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
                }
                return fileHandleSource.getHighSpeedVideoFpsRangesFor - j;
            }
        }
        throw new java.lang.IllegalArgumentException("source was not created by this FileHandle".toString());
    }

    public final void reposition(okio.Source source, long position) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (source instanceof okio.RealBufferedSource) {
            okio.RealBufferedSource realBufferedSource = (okio.RealBufferedSource) source;
            okio.Source source2 = realBufferedSource.source;
            if (source2 instanceof okio.FileHandle.FileHandleSource) {
                okio.FileHandle.FileHandleSource fileHandleSource = (okio.FileHandle.FileHandleSource) source2;
                if (fileHandleSource.getHighSpeedVideoFpsRanges == this) {
                    if (fileHandleSource.Camera2StreamConfigurationMap) {
                        throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
                    }
                    long size = realBufferedSource.bufferField.size();
                    long j = position - (fileHandleSource.getHighSpeedVideoFpsRangesFor - size);
                    if (0 <= j && j < size) {
                        realBufferedSource.skip(j);
                        return;
                    } else {
                        realBufferedSource.bufferField.clear();
                        fileHandleSource.getHighSpeedVideoFpsRangesFor = position;
                        return;
                    }
                }
            }
            throw new java.lang.IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        if (source instanceof okio.FileHandle.FileHandleSource) {
            okio.FileHandle.FileHandleSource fileHandleSource2 = (okio.FileHandle.FileHandleSource) source;
            if (fileHandleSource2.getHighSpeedVideoFpsRanges == this) {
                if (fileHandleSource2.Camera2StreamConfigurationMap) {
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
                }
                fileHandleSource2.getHighSpeedVideoFpsRangesFor = position;
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("source was not created by this FileHandle".toString());
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileHandle fileHandle, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return fileHandle.sink(j);
    }

    public final okio.Sink sink(long fileOffset) throws java.io.IOException {
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            this.getHighSpeedVideoFpsRanges++;
            reentrantLock.unlock();
            return new okio.FileHandle.FileHandleSink(this, fileOffset);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final okio.Sink appendingSink() throws java.io.IOException {
        return sink(size());
    }

    public final long position(okio.Sink sink) throws java.io.IOException {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (sink instanceof okio.RealBufferedSink) {
            okio.RealBufferedSink realBufferedSink = (okio.RealBufferedSink) sink;
            j = realBufferedSink.bufferField.size();
            sink = realBufferedSink.sink;
        } else {
            j = 0;
        }
        if (sink instanceof okio.FileHandle.FileHandleSink) {
            okio.FileHandle.FileHandleSink fileHandleSink = (okio.FileHandle.FileHandleSink) sink;
            if (fileHandleSink.getHighResolutionOutputSizeshNQ4ISI == this) {
                if (fileHandleSink.getHighSpeedVideoSizes) {
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
                }
                return fileHandleSink.Camera2StreamConfigurationMap + j;
            }
        }
        throw new java.lang.IllegalArgumentException("sink was not created by this FileHandle".toString());
    }

    public final void reposition(okio.Sink sink, long position) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (sink instanceof okio.RealBufferedSink) {
            okio.RealBufferedSink realBufferedSink = (okio.RealBufferedSink) sink;
            okio.Sink sink2 = realBufferedSink.sink;
            if (sink2 instanceof okio.FileHandle.FileHandleSink) {
                okio.FileHandle.FileHandleSink fileHandleSink = (okio.FileHandle.FileHandleSink) sink2;
                if (fileHandleSink.getHighResolutionOutputSizeshNQ4ISI == this) {
                    if (fileHandleSink.getHighSpeedVideoSizes) {
                        throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
                    }
                    realBufferedSink.emit();
                    fileHandleSink.Camera2StreamConfigurationMap = position;
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        if (sink instanceof okio.FileHandle.FileHandleSink) {
            okio.FileHandle.FileHandleSink fileHandleSink2 = (okio.FileHandle.FileHandleSink) sink;
            if (fileHandleSink2.getHighResolutionOutputSizeshNQ4ISI == this) {
                if (fileHandleSink2.getHighSpeedVideoSizes) {
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
                }
                fileHandleSink2.Camera2StreamConfigurationMap = position;
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("sink was not created by this FileHandle".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            if (this.getHighSpeedVideoFpsRanges != 0) {
                return;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            protectedClose();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighResolutionOutputSizeshNQ4ISI(long p0, okio.Buffer p1, long p2) {
        if (p2 < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(p2)).toString());
        }
        long j = p2 + p0;
        long j2 = p0;
        while (true) {
            if (j2 >= j) {
                break;
            }
            okio.Segment writableSegment$okio = p1.writableSegment$okio(1);
            int protectedRead = protectedRead(j2, writableSegment$okio.data, writableSegment$okio.limit, (int) java.lang.Math.min(j - j2, 8192 - writableSegment$okio.limit));
            if (protectedRead == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    p1.head = writableSegment$okio.pop();
                    okio.SegmentPool.recycle(writableSegment$okio);
                }
                if (p0 == j2) {
                    return -1L;
                }
            } else {
                writableSegment$okio.limit += protectedRead;
                long j3 = protectedRead;
                j2 += j3;
                p1.setSize$okio(p1.size() + j3);
            }
        }
        return j2 - p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(long p0, okio.Buffer p1, long p2) {
        okio.SegmentedByteString.checkOffsetAndCount(p1.size(), 0L, p2);
        long j = p2 + p0;
        while (p0 < j) {
            okio.Segment segment = p1.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int min = (int) java.lang.Math.min(j - p0, segment.limit - segment.pos);
            protectedWrite(p0, segment.data, segment.pos, min);
            segment.pos += min;
            long j2 = min;
            p0 += j2;
            p1.setSize$okio(p1.size() - j2);
            if (segment.pos == segment.limit) {
                p1.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "Lokio/FileHandle;", "p0", "", "p1", "<init>", "(Lokio/FileHandle;J)V", "Lokio/Buffer;", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "close", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/FileHandle;", "Camera2StreamConfigurationMap", "J", "", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes17.dex */
    static final class FileHandleSink implements okio.Sink {
        long Camera2StreamConfigurationMap;
        final okio.FileHandle getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        boolean getHighSpeedVideoSizes;

        public FileHandleSink(okio.FileHandle fileHandle, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileHandle, "");
            this.getHighResolutionOutputSizeshNQ4ISI = fileHandle;
            this.Camera2StreamConfigurationMap = j;
        }

        @Override // okio.Sink
        public final void write(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (!this.getHighSpeedVideoSizes) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, p0, p1);
                this.Camera2StreamConfigurationMap += p1;
                return;
            }
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI.protectedFlush();
        }

        @Override // okio.Sink
        public final okio.Timeout timeout() {
            return okio.Timeout.NONE;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            java.util.concurrent.locks.ReentrantLock lock = this.getHighResolutionOutputSizeshNQ4ISI.getLock();
            lock.lock();
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges--;
                if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges == 0 && this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    lock.unlock();
                    this.getHighResolutionOutputSizeshNQ4ISI.protectedClose();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "Lokio/FileHandle;", "p0", "", "p1", "<init>", "(Lokio/FileHandle;J)V", "Lokio/Buffer;", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "close", "()V", "getHighSpeedVideoFpsRanges", "Lokio/FileHandle;", "getHighSpeedVideoFpsRangesFor", "J", "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class FileHandleSource implements okio.Source {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        boolean Camera2StreamConfigurationMap;
        final okio.FileHandle getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;

        public FileHandleSource(okio.FileHandle fileHandle, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileHandle, "");
            this.getHighSpeedVideoFpsRanges = fileHandle;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // okio.Source
        public final long read(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (!this.Camera2StreamConfigurationMap) {
                long highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, p0, p1);
                if (highResolutionOutputSizeshNQ4ISI != -1) {
                    this.getHighSpeedVideoFpsRangesFor += highResolutionOutputSizeshNQ4ISI;
                }
                return highResolutionOutputSizeshNQ4ISI;
            }
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }

        @Override // okio.Source
        public final okio.Timeout timeout() {
            return okio.Timeout.NONE;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            java.util.concurrent.locks.ReentrantLock lock = this.getHighSpeedVideoFpsRanges.getLock();
            lock.lock();
            try {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges--;
                if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges == 0 && this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    lock.unlock();
                    this.getHighSpeedVideoFpsRanges.protectedClose();
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
