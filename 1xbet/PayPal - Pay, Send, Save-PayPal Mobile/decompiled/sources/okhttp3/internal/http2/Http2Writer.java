package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001OB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\u001d\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\t2\u0006\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010\u000fJ%\u0010-\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J%\u00102\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J-\u0010:\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u000bJ\u001f\u0010?\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u000204H\u0002¢\u0006\u0004\b?\u00107J+\u0010A\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010E\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010DR\u0017\u0010K\u001a\u00020J8\u0007¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Lokio/BufferedSink;", "sink", "", "client", "<init>", "(Lokio/BufferedSink;Z)V", "", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "", "streamId", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "Lokio/Buffer;", "source", "byteCount", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(ZILokio/Buffer;I)V", "flags", "buffer", "dataFrame", "(IILokio/Buffer;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "length", "type", "frameHeader", "(IIII)V", "close", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "headerBlock", "headers", "(ZILjava/util/List;)V", "Lokio/BufferedSink;", "Z", "hpackBuffer", "Lokio/Buffer;", "maxFrameSize", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2Writer implements java.io.Closeable, okhttp3.internal.concurrent.Lockable {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(okhttp3.internal.http2.Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final okio.Buffer hpackBuffer;
    private final okhttp3.internal.http2.Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final okio.BufferedSink sink;

    public Http2Writer(okio.BufferedSink bufferedSink, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        this.sink = bufferedSink;
        this.client = z;
        okio.Buffer buffer = new okio.Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = 16384;
        this.hpackWriter = new okhttp3.internal.http2.Hpack.Writer(0, false, buffer, 3, null);
    }

    public final okhttp3.internal.http2.Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void connectionPreface() throws java.io.IOException {
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (this.client) {
                java.util.logging.Logger logger2 = logger;
                if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(">> CONNECTION ");
                    sb.append(okhttp3.internal.http2.Http2.CONNECTION_PREFACE.hex());
                    logger2.fine(okhttp3.internal._UtilJvmKt.format(sb.toString(), new java.lang.Object[0]));
                }
                this.sink.write(okhttp3.internal.http2.Http2.CONNECTION_PREFACE);
                this.sink.flush();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    public final void applyAndAckSettings(okhttp3.internal.http2.Settings peerSettings) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerSettings, "");
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
            if (peerSettings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void pushPromise(int streamId, int promisedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "");
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            this.hpackWriter.writeHeaders(requestHeaders);
            long size = this.hpackBuffer.size();
            int min = (int) java.lang.Math.min(this.maxFrameSize - 4, size);
            long j = min;
            frameHeader(streamId, min + 4, 5, size == j ? 4 : 0);
            this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (size > j) {
                getHighResolutionOutputSizeshNQ4ISI(streamId, size - j);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void flush() throws java.io.IOException {
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            this.sink.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void rstStream(int streamId, okhttp3.internal.http2.ErrorCode errorCode) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (errorCode.getHttpCode() == -1) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            frameHeader(streamId, 4, 3, 0);
            this.sink.writeInt(errorCode.getHttpCode());
            this.sink.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void data(boolean outFinished, int streamId, okio.Buffer source, int byteCount) throws java.io.IOException {
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void dataFrame(int streamId, int flags, okio.Buffer buffer, int byteCount) throws java.io.IOException {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            okio.BufferedSink bufferedSink = this.sink;
            kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
            bufferedSink.write(buffer, byteCount);
        }
    }

    public final void settings(okhttp3.internal.http2.Settings settings) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            frameHeader(0, settings.size() * 6, 4, 0);
            for (int i = 0; i < 10; i++) {
                if (settings.isSet(i)) {
                    this.sink.writeShort(i);
                    this.sink.writeInt(settings.get(i));
                }
            }
            this.sink.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void ping(boolean ack, int payload1, int payload2) throws java.io.IOException {
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            frameHeader(0, 8, 6, ack ? 1 : 0);
            this.sink.writeInt(payload1);
            this.sink.writeInt(payload2);
            this.sink.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void goAway(int lastGoodStreamId, okhttp3.internal.http2.ErrorCode errorCode, byte[] debugData) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugData, "");
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (errorCode.getHttpCode() == -1) {
                throw new java.lang.IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            frameHeader(0, debugData.length + 8, 7, 0);
            this.sink.writeInt(lastGoodStreamId);
            this.sink.writeInt(errorCode.getHttpCode());
            if (debugData.length != 0) {
                this.sink.write(debugData);
            }
            this.sink.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void windowUpdate(int streamId, long windowSizeIncrement) throws java.io.IOException {
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (windowSizeIncrement == 0 || windowSizeIncrement > androidx.collection.SieveCacheKt.NodeLinkMask) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                sb.append(windowSizeIncrement);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.util.logging.Logger logger2 = logger;
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                logger2.fine(okhttp3.internal.http2.Http2.INSTANCE.frameLogWindowUpdate(false, streamId, 4, windowSizeIncrement));
            }
            frameHeader(streamId, 4, 8, 0);
            this.sink.writeInt((int) windowSizeIncrement);
            this.sink.flush();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void frameHeader(int streamId, int length, int type, int flags) throws java.io.IOException {
        if (type != 8) {
            java.util.logging.Logger logger2 = logger;
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                logger2.fine(okhttp3.internal.http2.Http2.INSTANCE.frameLog(false, streamId, length, type, flags));
            }
        }
        if (length > this.maxFrameSize) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FRAME_SIZE_ERROR length > ");
            sb.append(this.maxFrameSize);
            sb.append(": ");
            sb.append(length);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if ((Integer.MIN_VALUE & streamId) != 0) {
            throw new java.lang.IllegalArgumentException("reserved bit set: ".concat(java.lang.String.valueOf(streamId)).toString());
        }
        okhttp3.internal._UtilCommonKt.writeMedium(this.sink, length);
        this.sink.writeByte(type & 255);
        this.sink.writeByte(flags & 255);
        this.sink.writeInt(streamId & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, long p1) throws java.io.IOException {
        while (p1 > 0) {
            long min = java.lang.Math.min(this.maxFrameSize, p1);
            p1 -= min;
            frameHeader(p0, (int) min, 9, p1 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final void headers(boolean outFinished, int streamId, java.util.List<okhttp3.internal.http2.Header> headerBlock) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "");
        synchronized (this) {
            if (this.closed) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            this.hpackWriter.writeHeaders(headerBlock);
            long size = this.hpackBuffer.size();
            long min = java.lang.Math.min(this.maxFrameSize, size);
            int i = size == min ? 4 : 0;
            if (outFinished) {
                i |= 1;
            }
            frameHeader(streamId, (int) min, 1, i);
            this.sink.write(this.hpackBuffer, min);
            if (size > min) {
                getHighResolutionOutputSizeshNQ4ISI(streamId, size - min);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
