package okio.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lokio/internal/DefaultSocket;", "Lokio/Socket;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "", "toString", "()Ljava/lang/String;", "Ljava/net/Socket;", "getSocket", "()Ljava/net/Socket;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoSizes", "Lokio/Source;", "source", "Lokio/Source;", "getSource", "()Lokio/Source;", "Lokio/Sink;", "sink", "Lokio/Sink;", "getSink", "()Lokio/Sink;", "SocketSink", "SocketSource"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultSocket implements okio.Socket {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes;
    private final okio.Sink sink;
    private final java.net.Socket socket;
    private final okio.Source source;

    public DefaultSocket(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        this.socket = socket;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger();
        this.source = new okio.internal.DefaultSocket.SocketSource();
        this.sink = new okio.internal.DefaultSocket.SocketSink();
    }

    public final java.net.Socket getSocket() {
        return this.socket;
    }

    @Override // okio.Socket
    public final okio.Source getSource() {
        return this.source;
    }

    @Override // okio.Socket
    public final okio.Sink getSink() {
        return this.sink;
    }

    @Override // okio.Socket
    public final void cancel() {
        this.socket.close();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.socket.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0006*\u00020\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lokio/internal/DefaultSocket$SocketSink;", "Lokio/Sink;", "<init>", "(Lokio/internal/DefaultSocket;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "Lokio/internal/SocketAsyncTimeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/internal/SocketAsyncTimeout;", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/io/OutputStream;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lokio/internal/SocketAsyncTimeout;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class SocketSink implements okio.Sink {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.io.OutputStream Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final okio.internal.SocketAsyncTimeout getHighResolutionOutputSizeshNQ4ISI;

        public SocketSink() {
            this.Camera2StreamConfigurationMap = okio.internal.DefaultSocket.this.getSocket().getOutputStream();
            this.getHighResolutionOutputSizeshNQ4ISI = new okio.internal.SocketAsyncTimeout(okio.internal.DefaultSocket.this.getSocket());
        }

        @Override // okio.Sink
        public final void write(okio.Buffer source, long byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
            while (byteCount > 0) {
                this.getHighResolutionOutputSizeshNQ4ISI.throwIfReached();
                okio.Segment segment = source.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                int min = (int) java.lang.Math.min(byteCount, segment.limit - segment.pos);
                okio.internal.SocketAsyncTimeout socketAsyncTimeout = this.getHighResolutionOutputSizeshNQ4ISI;
                socketAsyncTimeout.enter();
                try {
                    this.Camera2StreamConfigurationMap.write(segment.data, segment.pos, min);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (!socketAsyncTimeout.exit()) {
                        segment.pos += min;
                        long j = min;
                        byteCount -= j;
                        source.setSize$okio(source.size() - j);
                        if (segment.pos == segment.limit) {
                            source.head = segment.pop();
                            okio.SegmentPool.recycle(segment);
                        }
                    } else {
                        throw socketAsyncTimeout.access$newTimeoutException(null);
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    if (socketAsyncTimeout.exit()) {
                        e = socketAsyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    socketAsyncTimeout.exit();
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            okio.internal.SocketAsyncTimeout socketAsyncTimeout = this.getHighResolutionOutputSizeshNQ4ISI;
            socketAsyncTimeout.enter();
            try {
                this.Camera2StreamConfigurationMap.flush();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (socketAsyncTimeout.exit()) {
                    throw socketAsyncTimeout.access$newTimeoutException(null);
                }
            } catch (java.io.IOException e) {
                e = e;
                if (socketAsyncTimeout.exit()) {
                    e = socketAsyncTimeout.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            okio.internal.SocketAsyncTimeout socketAsyncTimeout = this.getHighResolutionOutputSizeshNQ4ISI;
            okio.internal.DefaultSocket defaultSocket = okio.internal.DefaultSocket.this;
            socketAsyncTimeout.enter();
            try {
                int bitsOrZero = okio.internal._AtomicKt.setBitsOrZero(defaultSocket.getHighSpeedVideoSizes, 1);
                if (bitsOrZero != 0) {
                    if (bitsOrZero != 3) {
                        if (!defaultSocket.getSocket().isClosed() && !defaultSocket.getSocket().isOutputShutdown()) {
                            this.Camera2StreamConfigurationMap.flush();
                            try {
                                defaultSocket.getSocket().shutdownOutput();
                            } catch (java.lang.UnsupportedOperationException unused) {
                                this.Camera2StreamConfigurationMap.close();
                            }
                        }
                        return;
                    }
                    defaultSocket.getSocket().close();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.access$newTimeoutException(null);
                    }
                }
            } catch (java.io.IOException e) {
                e = e;
                if (socketAsyncTimeout.exit()) {
                    e = socketAsyncTimeout.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        @Override // okio.Sink
        /* renamed from: timeout, reason: from getter */
        public final okio.internal.SocketAsyncTimeout getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("sink(");
            sb.append(okio.internal.DefaultSocket.this.getSocket());
            sb.append(')');
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0006*\u00020\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokio/internal/DefaultSocket$SocketSource;", "Lokio/Source;", "<init>", "(Lokio/internal/DefaultSocket;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "Lokio/internal/SocketAsyncTimeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/internal/SocketAsyncTimeout;", "", "toString", "()Ljava/lang/String;", "Ljava/io/InputStream;", "getHighSpeedVideoSizes", "Ljava/io/InputStream;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lokio/internal/SocketAsyncTimeout;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class SocketSource implements okio.Source {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final okio.internal.SocketAsyncTimeout getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.io.InputStream getHighSpeedVideoFpsRanges;

        public SocketSource() {
            this.getHighSpeedVideoFpsRanges = okio.internal.DefaultSocket.this.getSocket().getInputStream();
            this.getHighResolutionOutputSizeshNQ4ISI = new okio.internal.SocketAsyncTimeout(okio.internal.DefaultSocket.this.getSocket());
        }

        @Override // okio.Source
        public final long read(okio.Buffer sink, long byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            if (byteCount == 0) {
                return 0L;
            }
            if (byteCount < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI.throwIfReached();
            okio.Segment writableSegment$okio = sink.writableSegment$okio(1);
            int min = (int) java.lang.Math.min(byteCount, 8192 - writableSegment$okio.limit);
            try {
                okio.internal.SocketAsyncTimeout socketAsyncTimeout = this.getHighResolutionOutputSizeshNQ4ISI;
                socketAsyncTimeout.enter();
                try {
                    int read = this.getHighSpeedVideoFpsRanges.read(writableSegment$okio.data, writableSegment$okio.limit, min);
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.access$newTimeoutException(null);
                    }
                    if (read == -1) {
                        if (writableSegment$okio.pos != writableSegment$okio.limit) {
                            return -1L;
                        }
                        sink.head = writableSegment$okio.pop();
                        okio.SegmentPool.recycle(writableSegment$okio);
                        return -1L;
                    }
                    writableSegment$okio.limit += read;
                    long j = read;
                    sink.setSize$okio(sink.size() + j);
                    return j;
                } catch (java.io.IOException e) {
                    e = e;
                    if (socketAsyncTimeout.exit()) {
                        e = socketAsyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    socketAsyncTimeout.exit();
                }
            } catch (java.lang.AssertionError e2) {
                if (okio.internal._JavaIoKt.isAndroidGetsocknameError(e2)) {
                    throw new java.io.IOException(e2);
                }
                throw e2;
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            okio.internal.SocketAsyncTimeout socketAsyncTimeout = this.getHighResolutionOutputSizeshNQ4ISI;
            okio.internal.DefaultSocket defaultSocket = okio.internal.DefaultSocket.this;
            socketAsyncTimeout.enter();
            try {
                int bitsOrZero = okio.internal._AtomicKt.setBitsOrZero(defaultSocket.getHighSpeedVideoSizes, 2);
                if (bitsOrZero != 0) {
                    if (bitsOrZero == 3) {
                        defaultSocket.getSocket().close();
                    } else {
                        if (defaultSocket.getSocket().isClosed() || defaultSocket.getSocket().isInputShutdown()) {
                            return;
                        }
                        try {
                            defaultSocket.getSocket().shutdownInput();
                        } catch (java.lang.UnsupportedOperationException unused) {
                            this.getHighSpeedVideoFpsRanges.close();
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.access$newTimeoutException(null);
                    }
                }
            } catch (java.io.IOException e) {
                e = e;
                if (socketAsyncTimeout.exit()) {
                    e = socketAsyncTimeout.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        @Override // okio.Source
        /* renamed from: timeout, reason: from getter */
        public final okio.internal.SocketAsyncTimeout getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("source(");
            sb.append(okio.internal.DefaultSocket.this.getSocket());
            sb.append(')');
            return sb.toString();
        }
    }
}
