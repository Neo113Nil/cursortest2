package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0004uvtwB3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010%\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020!¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\u00072\u0006\u0010,\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00103\u001a\u00020\u00172\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0003¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00172\u0006\u0010)\u001a\u00020!¢\u0006\u0004\b7\u0010+J\u000f\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0017H\u0000¢\u0006\u0004\b:\u0010(J\u0015\u0010=\u001a\u00020\u00172\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0017H\u0000¢\u0006\u0004\b?\u0010(J\u000f\u0010@\u001a\u00020\u0017H\u0000¢\u0006\u0004\b@\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR*\u0010M\u001a\u00020;2\u0006\u0010L\u001a\u00020;8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010>R*\u0010R\u001a\u00020;2\u0006\u0010L\u001a\u00020;8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010N\u001a\u0004\bS\u0010P\"\u0004\bT\u0010>R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\n0U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u00101\u001a\u00060ZR\u00020\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b1\u0010[\u001a\u0004\b\\\u0010]R\u001e\u0010_\u001a\u00060^R\u00020\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001e\u0010\u001e\u001a\u00060cR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010d\u001a\u0004\be\u0010fR\u001e\u0010 \u001a\u00060cR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010d\u001a\u0004\bg\u0010fR$\u0010)\u001a\u0004\u0018\u00010!8A@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b)\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010+R$\u0010$\u001a\u0004\u0018\u00010#8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b$\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0011\u0010q\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bq\u00109R\u0011\u0010r\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\br\u00109R\u0011\u0010s\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bs\u00109"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/internal/concurrent/Lockable;", "Lokio/Socket;", "", "id", "Lokhttp3/internal/http2/Http2Connection;", "connection", "", "outFinished", "inFinished", "Lokhttp3/Headers;", "headers", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "callerIsIdle", "takeHeaders", "(Z)Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "flushHeaders", "", "writeHeaders", "(Ljava/util/List;ZZ)V", "trailers", "enqueueTrailers", "(Lokhttp3/Headers;)V", "Lokio/Timeout;", "readTimeout", "()Lokio/Timeout;", "writeTimeout", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", "close", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "errorCode", "closeLater", "(Lokhttp3/internal/http2/ErrorCode;)V", "p0", "p1", "Camera2StreamConfigurationMap", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)Z", "Lokio/BufferedSource;", "source", "length", "receiveData", "(Lokio/BufferedSource;I)V", "receiveHeaders", "(Lokhttp3/Headers;Z)V", "receiveRstStream", "getHighSpeedVideoSizes", "()Z", "cancelStreamIfNecessary$okhttp", "", "delta", "addBytesToWriteWindow", "(J)V", "checkOutNotClosed$okhttp", "waitForIo$okhttp", com.visa.cbp.getEncExpo.warmup, "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "readBytes", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "getReadBytes", "()Lokhttp3/internal/http2/flowcontrol/WindowCounter;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "writeBytesTotal", "J", "getWriteBytesTotal", "()J", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "isLocallyInitiated", "isSourceComplete", "Companion", "FramingSource", "FramingSink", "StreamTimeout"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2Stream implements okhttp3.internal.concurrent.Lockable, okio.Socket {
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final okhttp3.internal.http2.Http2Connection connection;
    private okhttp3.internal.http2.ErrorCode errorCode;
    private java.io.IOException errorException;
    private boolean hasResponseHeaders;
    private final java.util.ArrayDeque<okhttp3.Headers> headersQueue;
    private final int id;
    private final okhttp3.internal.http2.flowcontrol.WindowCounter readBytes;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout readTimeout;
    private final okhttp3.internal.http2.Http2Stream.FramingSink sink;
    private final okhttp3.internal.http2.Http2Stream.FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout writeTimeout;

    public Http2Stream(int i, okhttp3.internal.http2.Http2Connection http2Connection, boolean z, boolean z2, okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(http2Connection, "");
        this.id = i;
        this.connection = http2Connection;
        this.readBytes = new okhttp3.internal.http2.flowcontrol.WindowCounter(i);
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        java.util.ArrayDeque<okhttp3.Headers> arrayDeque = new java.util.ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new okhttp3.internal.http2.Http2Stream.FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new okhttp3.internal.http2.Http2Stream.FramingSink(z);
        this.readTimeout = new okhttp3.internal.http2.Http2Stream.StreamTimeout();
        this.writeTimeout = new okhttp3.internal.http2.Http2Stream.StreamTimeout();
        if (headers != null) {
            if (isLocallyInitiated()) {
                throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        } else if (!isLocallyInitiated()) {
            throw new java.lang.IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final int getId() {
        return this.id;
    }

    public final okhttp3.internal.http2.Http2Connection getConnection() {
        return this.connection;
    }

    public final okhttp3.internal.http2.flowcontrol.WindowCounter getReadBytes() {
        return this.readBytes;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    @Override // okio.Socket
    public final okhttp3.internal.http2.Http2Stream.FramingSource getSource() {
        return this.source;
    }

    @Override // okio.Socket
    public final okhttp3.internal.http2.Http2Stream.FramingSink getSink() {
        return this.sink;
    }

    /* renamed from: getReadTimeout$okhttp, reason: from getter */
    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    /* renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final void setErrorCode$okhttp(okhttp3.internal.http2.ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final okhttp3.internal.http2.ErrorCode getErrorCode$okhttp() {
        okhttp3.internal.http2.ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    /* renamed from: getErrorException$okhttp, reason: from getter */
    public final java.io.IOException getErrorException() {
        return this.errorException;
    }

    public final void setErrorException$okhttp(java.io.IOException iOException) {
        this.errorException = iOException;
    }

    public final boolean isOpen() {
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            if ((getSource().getFinished() || getSource().getClosed()) && (getSink().getFinished() || getSink().getClosed())) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final boolean isSourceComplete() {
        boolean z;
        synchronized (this) {
            if (getSource().getFinished()) {
                z = getSource().getReadBuffer().exhausted();
            }
        }
        return z;
    }

    public static /* synthetic */ okhttp3.Headers takeHeaders$default(okhttp3.internal.http2.Http2Stream http2Stream, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            z = false;
        }
        return http2Stream.takeHeaders(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0004, B:6:0x000c, B:9:0x0014, B:14:0x0020, B:19:0x002a, B:26:0x0033, B:27:0x0038, B:31:0x0039, B:33:0x0043, B:36:0x0052, B:39:0x0064, B:40:0x0066, B:41:0x0057, B:16:0x0025), top: B:3:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.Headers takeHeaders(boolean callerIsIdle) throws java.io.IOException {
        okhttp3.Headers headers;
        boolean z;
        synchronized (this) {
            while (this.headersQueue.isEmpty() && getErrorCode$okhttp() == null) {
                try {
                    if (!callerIsIdle && !getHighSpeedVideoSizes()) {
                        z = false;
                        if (z) {
                            this.readTimeout.enter();
                        }
                        waitForIo$okhttp();
                        if (!z) {
                            this.readTimeout.exitAndThrowIfTimedOut();
                        }
                    }
                    waitForIo$okhttp();
                    if (!z) {
                    }
                } catch (java.lang.Throwable th) {
                    if (z) {
                        this.readTimeout.exitAndThrowIfTimedOut();
                    }
                    throw th;
                }
                z = true;
                if (z) {
                }
            }
            if (!this.headersQueue.isEmpty()) {
                okhttp3.Headers removeFirst = this.headersQueue.removeFirst();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(removeFirst, "");
                headers = removeFirst;
            } else {
                java.io.IOException iOException = this.errorException;
                if (iOException == null) {
                    okhttp3.internal.http2.ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode$okhttp);
                    iOException = new okhttp3.internal.http2.StreamResetException(errorCode$okhttp);
                }
                throw iOException;
            }
        }
        return headers;
    }

    public final okhttp3.Headers peekTrailers() throws java.io.IOException {
        synchronized (this) {
            if (getSource().getFinished() && getSource().getReceiveBuffer().exhausted() && getSource().getReadBuffer().exhausted()) {
                okhttp3.Headers trailers = getSource().getTrailers();
                if (trailers == null) {
                    trailers = okhttp3.Headers.EMPTY;
                }
                return trailers;
            }
            if (getErrorCode$okhttp() == null) {
                return null;
            }
            java.io.IOException iOException = this.errorException;
            if (iOException == null) {
                okhttp3.internal.http2.ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode$okhttp);
                iOException = new okhttp3.internal.http2.StreamResetException(errorCode$okhttp);
            }
            throw iOException;
        }
    }

    public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> responseHeaders, boolean outFinished, boolean flushHeaders) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseHeaders, "");
        okhttp3.internal.http2.Http2Stream http2Stream = this;
        if (okhttp3.internal._UtilJvmKt.assertionsEnabled && java.lang.Thread.holdsLock(http2Stream)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new java.lang.AssertionError(sb.toString());
        }
        synchronized (http2Stream) {
            this.hasResponseHeaders = true;
            if (outFinished) {
                getSink().setFinished(true);
                okhttp3.internal.http2.Http2Stream http2Stream2 = this;
                kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream2, "");
                http2Stream2.notifyAll();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (!flushHeaders) {
            synchronized (http2Stream) {
                flushHeaders = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }
        this.connection.writeHeaders$okhttp(this.id, outFinished, responseHeaders);
        if (flushHeaders) {
            this.connection.flush();
        }
    }

    public final void enqueueTrailers(okhttp3.Headers trailers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trailers, "");
        synchronized (this) {
            if (getSink().getFinished()) {
                throw new java.lang.IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                throw new java.lang.IllegalArgumentException("trailers.size() == 0".toString());
            }
            getSink().setTrailers(trailers);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final okio.Timeout readTimeout() {
        return this.readTimeout;
    }

    public final okio.Timeout writeTimeout() {
        return this.writeTimeout;
    }

    public final void close(okhttp3.internal.http2.ErrorCode rstStatusCode, java.io.IOException errorException) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rstStatusCode, "");
        if (Camera2StreamConfigurationMap(rstStatusCode, errorException)) {
            this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
        }
    }

    @Override // okio.Socket
    public final void cancel() {
        closeLater(okhttp3.internal.http2.ErrorCode.CANCEL);
    }

    public final void closeLater(okhttp3.internal.http2.ErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        if (Camera2StreamConfigurationMap(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    private final boolean Camera2StreamConfigurationMap(okhttp3.internal.http2.ErrorCode p0, java.io.IOException p1) {
        okhttp3.internal.http2.Http2Stream http2Stream = this;
        if (okhttp3.internal._UtilJvmKt.assertionsEnabled && java.lang.Thread.holdsLock(http2Stream)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new java.lang.AssertionError(sb.toString());
        }
        synchronized (http2Stream) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            this.errorCode = p0;
            this.errorException = p1;
            okhttp3.internal.http2.Http2Stream http2Stream2 = this;
            kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream2, "");
            http2Stream2.notifyAll();
            if (getSource().getFinished() && getSink().getFinished()) {
                return false;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void receiveData(okio.BufferedSource source, int length) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        okhttp3.internal.http2.Http2Stream http2Stream = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
            getSource().receive$okhttp(source, length);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(http2Stream);
        throw new java.lang.AssertionError(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: all -> 0x0086, TryCatch #0 {, blocks: (B:10:0x0038, B:12:0x003d, B:14:0x0045, B:17:0x004e, B:19:0x0061, B:20:0x0068, B:27:0x0056), top: B:9:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void receiveHeaders(okhttp3.Headers headers, boolean inFinished) {
        boolean isOpen;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        okhttp3.internal.http2.Http2Stream http2Stream = this;
        if (okhttp3.internal._UtilJvmKt.assertionsEnabled && java.lang.Thread.holdsLock(http2Stream)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new java.lang.AssertionError(sb.toString());
        }
        synchronized (http2Stream) {
            if (this.hasResponseHeaders && headers.get(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8) == null && headers.get(okhttp3.internal.http2.Header.TARGET_METHOD_UTF8) == null) {
                getSource().setTrailers(headers);
                if (inFinished) {
                    getSource().setFinished$okhttp(true);
                }
                isOpen = isOpen();
                okhttp3.internal.http2.Http2Stream http2Stream2 = this;
                kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream2, "");
                http2Stream2.notifyAll();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            this.hasResponseHeaders = true;
            this.headersQueue.add(headers);
            if (inFinished) {
            }
            isOpen = isOpen();
            okhttp3.internal.http2.Http2Stream http2Stream22 = this;
            kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream22, "");
            http2Stream22.notifyAll();
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        if (isOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.id);
    }

    public final void receiveRstStream(okhttp3.internal.http2.ErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        synchronized (this) {
            if (getErrorCode$okhttp() == null) {
                this.errorCode = errorCode;
                okhttp3.internal.http2.Http2Stream http2Stream = this;
                kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream, "");
                http2Stream.notifyAll();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoSizes() {
        return !this.connection.getClient() || getSink().getClosed() || getSink().getFinished();
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R$\u0010'\u001a\u0004\u0018\u00010&8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "", "maxByteCount", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "Lokio/Buffer;", "sink", "byteCount", "read", "(Lokio/Buffer;J)J", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(J)V", "Lokio/BufferedSource;", "source", "receive$okhttp", "(Lokio/BufferedSource;J)V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "close", "()V", "J", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "receiveBuffer", "Lokio/Buffer;", "getReceiveBuffer", "()Lokio/Buffer;", "readBuffer", "getReadBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "getClosed$okhttp", "setClosed$okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class FramingSource implements okio.Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private okhttp3.Headers trailers;
        private final okio.Buffer receiveBuffer = new okio.Buffer();
        private final okio.Buffer readBuffer = new okio.Buffer();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        /* renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final okio.Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final okio.Buffer getReadBuffer() {
            return this.readBuffer;
        }

        public final okhttp3.Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(okhttp3.Headers headers) {
            this.trailers = headers;
        }

        /* renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        @Override // okio.Source
        public final long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            okhttp3.internal.http2.StreamResetException streamResetException;
            boolean z;
            long j;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            long j2 = 0;
            if (byteCount < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
            }
            while (true) {
                okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
                synchronized (http2Stream) {
                    boolean highSpeedVideoSizes = http2Stream.getHighSpeedVideoSizes();
                    if (highSpeedVideoSizes) {
                        http2Stream.getReadTimeout().enter();
                    }
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || this.finished) {
                            streamResetException = null;
                        } else {
                            streamResetException = http2Stream.getErrorException();
                            if (streamResetException == null) {
                                okhttp3.internal.http2.ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode$okhttp);
                                streamResetException = new okhttp3.internal.http2.StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new java.io.IOException("stream closed");
                        }
                        if (this.readBuffer.size() > j2) {
                            okio.Buffer buffer = this.readBuffer;
                            j = buffer.read(sink, java.lang.Math.min(byteCount, buffer.size()));
                            okhttp3.internal.http2.flowcontrol.WindowCounter.update$default(http2Stream.getReadBytes(), j, 0L, 2, null);
                            long unacknowledged = http2Stream.getReadBytes().getUnacknowledged();
                            if (streamResetException == null) {
                                if (unacknowledged >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                    http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), unacknowledged);
                                    okhttp3.internal.http2.flowcontrol.WindowCounter.update$default(http2Stream.getReadBytes(), 0L, unacknowledged, 1, null);
                                }
                                j = j;
                            }
                            z = false;
                        } else {
                            if (this.finished || streamResetException != null) {
                                z = false;
                            } else {
                                http2Stream.waitForIo$okhttp();
                                z = true;
                            }
                            j = -1;
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } finally {
                        if (highSpeedVideoSizes) {
                            http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                        }
                    }
                }
                okhttp3.internal.http2.Http2Stream.this.getConnection().getFlowControlListener().receivingStreamWindowChanged(okhttp3.internal.http2.Http2Stream.this.getId(), okhttp3.internal.http2.Http2Stream.this.getReadBytes(), this.readBuffer.size());
                if (!z) {
                    if (j != -1) {
                        return j;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j2 = 0;
            }
        }

        private final void getHighResolutionOutputSizeshNQ4ISI(long p0) {
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                okhttp3.internal.http2.Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(p0);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new java.lang.AssertionError(sb.toString());
        }

        public final void receive$okhttp(okio.BufferedSource source, long byteCount) throws java.io.IOException {
            boolean z;
            boolean z2;
            boolean z3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                long j = byteCount;
                while (j > 0) {
                    synchronized (okhttp3.internal.http2.Http2Stream.this) {
                        z = this.finished;
                        z2 = true;
                        z3 = this.readBuffer.size() + j > this.maxByteCount;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    if (z3) {
                        source.skip(j);
                        okhttp3.internal.http2.Http2Stream.this.closeLater(okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    }
                    if (z) {
                        source.skip(j);
                        return;
                    }
                    long read = source.read(this.receiveBuffer, j);
                    if (read == -1) {
                        throw new java.io.EOFException();
                    }
                    j -= read;
                    okhttp3.internal.http2.Http2Stream http2Stream2 = okhttp3.internal.http2.Http2Stream.this;
                    synchronized (http2Stream2) {
                        if (this.closed) {
                            this.receiveBuffer.clear();
                        } else {
                            if (this.readBuffer.size() != 0) {
                                z2 = false;
                            }
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z2) {
                                okhttp3.internal.http2.Http2Stream http2Stream3 = http2Stream2;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream3, "");
                                http2Stream3.notifyAll();
                            }
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                }
                getHighResolutionOutputSizeshNQ4ISI(byteCount);
                okhttp3.internal.http2.Http2Stream.this.getConnection().getFlowControlListener().receivingStreamWindowChanged(okhttp3.internal.http2.Http2Stream.this.getId(), okhttp3.internal.http2.Http2Stream.this.getReadBytes(), this.readBuffer.size());
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new java.lang.AssertionError(sb.toString());
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public final okio.Timeout getGetHighSpeedVideoFpsRangesFor() {
            return okhttp3.internal.http2.Http2Stream.this.getReadTimeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            long size;
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                okhttp3.internal.http2.Http2Stream http2Stream2 = http2Stream;
                kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream2, "");
                http2Stream2.notifyAll();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (size > 0) {
                getHighResolutionOutputSizeshNQ4ISI(size);
            }
            okhttp3.internal.http2.Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws java.io.IOException {
        boolean z;
        boolean isOpen;
        okhttp3.internal.http2.Http2Stream http2Stream = this;
        if (okhttp3.internal._UtilJvmKt.assertionsEnabled && java.lang.Thread.holdsLock(http2Stream)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new java.lang.AssertionError(sb.toString());
        }
        synchronized (http2Stream) {
            z = !getSource().getFinished() && getSource().getClosed() && (getSink().getFinished() || getSink().getClosed());
            isOpen = isOpen();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (z) {
            close(okhttp3.internal.http2.ErrorCode.CANCEL, null);
        } else {
            if (isOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u000f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "p0", "getHighSpeedVideoSizes", "(Z)V", "flush", "()V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "close", "Z", "getFinished", "()Z", "setFinished", "sendBuffer", "Lokio/Buffer;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "getClosed", "setClosed"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class FramingSink implements okio.Sink {
        private boolean closed;
        private boolean finished;
        private final okio.Buffer sendBuffer;
        private okhttp3.Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new okio.Buffer();
        }

        public /* synthetic */ FramingSink(okhttp3.internal.http2.Http2Stream http2Stream, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final okhttp3.Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(okhttp3.Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // okio.Sink
        public final void write(okio.Buffer source, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(source, byteCount);
                while (this.sendBuffer.size() >= okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) {
                    getHighSpeedVideoSizes(false);
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
                sb.append(java.lang.Thread.currentThread().getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(http2Stream);
                throw new java.lang.AssertionError(sb.toString());
            }
        }

        private final void getHighSpeedVideoSizes(boolean p0) throws java.io.IOException {
            long min;
            boolean z;
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } finally {
                        http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                    }
                }
                http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = java.lang.Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                z = p0 && min == this.sendBuffer.size();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            okhttp3.internal.http2.Http2Stream.this.getWriteTimeout().enter();
            try {
                okhttp3.internal.http2.Http2Stream.this.getConnection().writeData(okhttp3.internal.http2.Http2Stream.this.getId(), z, this.sendBuffer, min);
            } finally {
                http2Stream = okhttp3.internal.http2.Http2Stream.this;
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() throws java.io.IOException {
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                okhttp3.internal.http2.Http2Stream http2Stream2 = okhttp3.internal.http2.Http2Stream.this;
                synchronized (http2Stream2) {
                    http2Stream2.checkOutNotClosed$okhttp();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                while (this.sendBuffer.size() > 0) {
                    getHighSpeedVideoSizes(false);
                    okhttp3.internal.http2.Http2Stream.this.getConnection().flush();
                }
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new java.lang.AssertionError(sb.toString());
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public final okio.Timeout getGetHighResolutionOutputSizeshNQ4ISI() {
            return okhttp3.internal.http2.Http2Stream.this.getWriteTimeout();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (okhttp3.internal._UtilJvmKt.assertionsEnabled && java.lang.Thread.holdsLock(http2Stream)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
                sb.append(java.lang.Thread.currentThread().getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(http2Stream);
                throw new java.lang.AssertionError(sb.toString());
            }
            okhttp3.internal.http2.Http2Stream http2Stream2 = okhttp3.internal.http2.Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                boolean z = http2Stream2.getErrorCode$okhttp() == null;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (!okhttp3.internal.http2.Http2Stream.this.getSink().finished) {
                    boolean z2 = this.sendBuffer.size() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            getHighSpeedVideoSizes(false);
                        }
                        okhttp3.internal.http2.Http2Connection connection = okhttp3.internal.http2.Http2Stream.this.getConnection();
                        int id = okhttp3.internal.http2.Http2Stream.this.getId();
                        okhttp3.Headers headers = this.trailers;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(headers);
                        connection.writeHeaders$okhttp(id, z, okhttp3.internal._UtilJvmKt.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.size() > 0) {
                            getHighSpeedVideoSizes(true);
                        }
                    } else if (z) {
                        okhttp3.internal.http2.Http2Stream.this.getConnection().writeData(okhttp3.internal.http2.Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                okhttp3.internal.http2.Http2Stream http2Stream3 = okhttp3.internal.http2.Http2Stream.this;
                synchronized (http2Stream3) {
                    this.closed = true;
                    okhttp3.internal.http2.Http2Stream http2Stream4 = http2Stream3;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream4, "");
                    http2Stream4.notifyAll();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                okhttp3.internal.http2.Http2Stream.this.getConnection().flush();
                okhttp3.internal.http2.Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }
    }

    public final void addBytesToWriteWindow(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            okhttp3.internal.http2.Http2Stream http2Stream = this;
            kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream, "");
            http2Stream.notifyAll();
        }
    }

    public final void checkOutNotClosed$okhttp() throws java.io.IOException {
        if (getSink().getClosed()) {
            throw new java.io.IOException("stream closed");
        }
        if (getSink().getFinished()) {
            throw new java.io.IOException("stream finished");
        }
        if (getErrorCode$okhttp() != null) {
            java.io.IOException iOException = this.errorException;
            if (iOException == null) {
                okhttp3.internal.http2.ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode$okhttp);
                iOException = new okhttp3.internal.http2.StreamResetException(errorCode$okhttp);
            }
            throw iOException;
        }
    }

    public final void waitForIo$okhttp() throws java.io.InterruptedIOException {
        try {
            okhttp3.internal.http2.Http2Stream http2Stream = this;
            kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream, "");
            http2Stream.wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "", "timedOut", "()V", "Ljava/io/IOException;", "cause", "newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "exitAndThrowIfTimedOut"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class StreamTimeout extends okio.AsyncTimeout {
        public StreamTimeout() {
        }

        @Override // okio.AsyncTimeout
        public final void timedOut() {
            okhttp3.internal.http2.Http2Stream.this.closeLater(okhttp3.internal.http2.ErrorCode.CANCEL);
            okhttp3.internal.http2.Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }

        @Override // okio.AsyncTimeout
        public final java.io.IOException newTimeoutException(java.io.IOException cause) {
            java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        public final void exitAndThrowIfTimedOut() throws java.io.IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }
    }
}
