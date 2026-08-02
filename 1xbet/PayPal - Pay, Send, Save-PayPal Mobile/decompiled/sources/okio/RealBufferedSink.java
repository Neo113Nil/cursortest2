package okio;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011J'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010!\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010#J\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020$H\u0016¢\u0006\u0004\b\r\u0010%J'\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\r\u0010&J\u0017\u0010\r\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020'H\u0016¢\u0006\u0004\b\r\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010,J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010\u001eJ\u0017\u00100\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u001eJ\u0017\u00101\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b1\u0010\u001eJ\u0017\u00103\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00104\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u0010\u001eJ\u0017\u00106\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00107J\u0017\u00109\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u00107J\u0017\u0010:\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u00107J\u000f\u0010;\u001a\u00020\u0001H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0001H\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\fH\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0016¢\u0006\u0004\bF\u0010BJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0015H\u0016¢\u0006\u0004\bJ\u0010KR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0011\u0010M\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010\u0007\u001a\u00020\u00068×\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bR\u0010B\u001a\u0004\bQ\u0010\b"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "Lokio/Sink;", "sink", "<init>", "(Lokio/Sink;)V", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "(Lokio/ByteString;)Lokio/BufferedSink;", "", "offset", "(Lokio/ByteString;II)Lokio/BufferedSink;", "", "string", "writeUtf8", "(Ljava/lang/String;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "(I)Lokio/BufferedSink;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;", "", "([B)Lokio/BufferedSink;", "([BII)Lokio/BufferedSink;", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Lokio/Source;", "writeAll", "(Lokio/Source;)J", "(Lokio/Source;J)Lokio/BufferedSink;", util.h.xy.cb.b.f1091, "writeByte", lib.android.paypal.com.magnessdk.g.n2, "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "(J)Lokio/BufferedSink;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "emitCompleteSegments", "()Lokio/BufferedSink;", "emit", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "flush", "()V", "", "isOpen", "()Z", "close", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "toString", "()Ljava/lang/String;", "Lokio/Sink;", "bufferField", "Lokio/Buffer;", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Z", "getBuffer", "getBuffer$annotations"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealBufferedSink implements okio.BufferedSink {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Sink sink;

    public static /* synthetic */ void getBuffer$annotations() {
    }

    public RealBufferedSink(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        this.sink = sink;
        this.bufferField = new okio.Buffer();
    }

    @Override // okio.BufferedSink
    public final okio.Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSink
    /* renamed from: buffer, reason: from getter */
    public final okio.Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeString(java.lang.String string, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeString(string, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeString(java.lang.String string, int beginIndex, int endIndex, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeString(string, beginIndex, endIndex, charset);
        return emitCompleteSegments();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        int write = this.bufferField.write(source);
        emitCompleteSegments();
        return write;
    }

    @Override // okio.BufferedSink
    public final java.io.OutputStream outputStream() {
        return new java.io.OutputStream() { // from class: okio.RealBufferedSink$outputStream$1
            @Override // java.io.OutputStream
            public final void write(int b) {
                if (okio.RealBufferedSink.this.closed) {
                    throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
                }
                okio.RealBufferedSink.this.bufferField.writeByte((int) ((byte) b));
                okio.RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream
            public final void write(byte[] data, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                if (okio.RealBufferedSink.this.closed) {
                    throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
                }
                okio.RealBufferedSink.this.bufferField.write(data, offset, byteCount);
                okio.RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                if (okio.RealBufferedSink.this.closed) {
                    return;
                }
                okio.RealBufferedSink.this.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                okio.RealBufferedSink.this.close();
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(okio.RealBufferedSink.this);
                sb.append(".outputStream()");
                return sb.toString();
            }
        };
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.Sink
    public final void write(okio.Buffer source, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.write(source, byteCount);
        emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink write(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.write(byteString);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink write(okio.ByteString byteString, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.write(byteString, offset, byteCount);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeUtf8(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeUtf8(java.lang.String string, int beginIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeUtf8(string, beginIndex, endIndex);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeUtf8CodePoint(int codePoint) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeUtf8CodePoint(codePoint);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink write(byte[] source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.write(source);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink write(byte[] source, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.write(source, offset, byteCount);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final long writeAll(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        long j = 0;
        while (true) {
            long read = source.read(this.bufferField, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink write(okio.Source source, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        while (byteCount > 0) {
            long read = source.read(this.bufferField, byteCount);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            byteCount -= read;
            emitCompleteSegments();
        }
        return this;
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeByte(int b) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeByte(b);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeShort(int s) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeShort(s);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeShortLe(int s) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeShortLe(s);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeInt(int i) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeInt(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeIntLe(int i) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeIntLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeLong(long v) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeLong(v);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeLongLe(long v) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeLongLe(v);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeDecimalLong(long v) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeDecimalLong(v);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink writeHexadecimalUnsignedLong(long v) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        this.bufferField.writeHexadecimalUnsignedLong(v);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink emitCompleteSegments() {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            this.sink.write(this.bufferField, completeSegmentByteCount);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public final okio.BufferedSink emit() {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (this.bufferField.size() > 0) {
            okio.Sink sink = this.sink;
            okio.Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        try {
            if (this.bufferField.size() > 0) {
                okio.Sink sink = this.sink;
                okio.Buffer buffer = this.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            this.sink.close();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final okio.Timeout getGetHighSpeedVideoFpsRangesFor() {
        return this.sink.getGetHighSpeedVideoFpsRangesFor();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("buffer(");
        sb.append(this.sink);
        sb.append(')');
        return sb.toString();
    }
}
