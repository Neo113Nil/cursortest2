package okio;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J)\u0010 \u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020\"2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016¢\u0006\u0004\b \u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010)J\u0017\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020&H\u0016¢\u0006\u0004\b\f\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020&H\u0016¢\u0006\u0004\b+\u0010,J'\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020&2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\f\u0010.J\u0017\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020/H\u0016¢\u0006\u0004\b\f\u00100J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00106\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00108J\u0017\u0010;\u001a\u0002052\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010;\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010=J\u0011\u0010>\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b>\u00107J\u000f\u0010?\u001a\u000205H\u0016¢\u0006\u0004\b?\u00107J\u0017\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u00108J\u000f\u0010A\u001a\u00020\u001fH\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020CH\u0016¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\u001fH\u0016¢\u0006\u0004\bG\u0010BJ\u000f\u0010H\u001a\u00020\u001fH\u0016¢\u0006\u0004\bH\u0010BJ\u000f\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010JJ\u000f\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010JJ\u000f\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010JJ\u0017\u0010N\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010\u0013J\u0017\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0016H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00162\u0006\u0010R\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010SJ'\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00162\u0006\u0010R\u001a\u00020\n2\u0006\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010UJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0019H\u0016¢\u0006\u0004\bP\u0010WJ\u001f\u0010P\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010XJ'\u0010P\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\n2\u0006\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010YJ\u0017\u0010[\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u0019H\u0016¢\u0006\u0004\b[\u0010WJ\u001f\u0010[\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\nH\u0016¢\u0006\u0004\b[\u0010XJ\u001f\u0010\\\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\\\u0010]J/\u0010\\\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010^\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\\\u0010_J\u000f\u0010`\u001a\u00020\u0001H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u000eH\u0016¢\u0006\u0004\be\u0010\u0010J\u000f\u0010f\u001a\u00020\u0011H\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u000205H\u0016¢\u0006\u0004\bk\u00107R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010lR\u0011\u0010m\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001b\u0010\u0007\u001a\u00020\u00068×\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\br\u0010g\u001a\u0004\bq\u0010\b"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "Lokio/Source;", "source", "<init>", "(Lokio/Source;)V", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "", "exhausted", "()Z", "", "require", "(J)V", "request", "(J)Z", "", "readByte", "()B", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lokio/Options;", "options", "", "select", "(Lokio/Options;)I", "", "T", "Lokio/TypedOptions;", "(Lokio/TypedOptions;)Ljava/lang/Object;", "", "readByteArray", "()[B", "(J)[B", "([B)I", "readFully", "([B)V", "offset", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "(Lokio/Buffer;J)V", "Lokio/Sink;", "readAll", "(Lokio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "()I", "", "readShort", "()S", "readShortLe", "readInt", "readIntLe", "readLong", "()J", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", util.h.xy.cb.b.f1091, "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "(Lokio/ByteString;)J", "(Lokio/ByteString;J)J", "(Lokio/ByteString;JJ)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLokio/ByteString;)Z", "bytesOffset", "(JLokio/ByteString;II)Z", "peek", "()Lokio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "toString", "Lokio/Source;", "bufferField", "Lokio/Buffer;", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Z", "getBuffer", "getBuffer$annotations"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealBufferedSource implements okio.BufferedSource {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Source source;

    public static /* synthetic */ void getBuffer$annotations() {
    }

    public RealBufferedSource(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        this.source = source;
        this.bufferField = new okio.Buffer();
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final okio.Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* renamed from: buffer, reason: from getter */
    public final okio.Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource
    public final <T> T select(okio.TypedOptions<T> options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        int select = select(options.getOptions());
        if (select == -1) {
            return null;
        }
        return options.get(select);
    }

    @Override // okio.BufferedSource
    public final int read(byte[] sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public final java.lang.String readString(long byteCount, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        require(byteCount);
        return this.bufferField.readString(byteCount, charset);
    }

    @Override // okio.BufferedSource
    public final java.lang.String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b, long fromIndex) {
        return indexOf(b, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOf(okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public final long indexOf(okio.ByteString bytes, long fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        return indexOf(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOf(okio.ByteString bytes, long fromIndex, long toIndex) {
        long commonIndexOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        commonIndexOf = okio.internal.RealBufferedSource.commonIndexOf(this, bytes, (r17 & 2) != 0 ? 0 : 0, (r17 & 4) != 0 ? bytes.size() : 0, fromIndex, (r17 & 16) != 0 ? Long.MAX_VALUE : toIndex);
        return commonIndexOf;
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(okio.ByteString targetBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long offset, okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public final java.io.InputStream inputStream() {
        return new java.io.InputStream() { // from class: okio.RealBufferedSource$inputStream$1
            @Override // java.io.InputStream
            public final int read() {
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
                }
                if (okio.RealBufferedSource.this.bufferField.size() == 0 && okio.RealBufferedSource.this.source.read(okio.RealBufferedSource.this.bufferField, 8192L) == -1) {
                    return -1;
                }
                return okio.RealBufferedSource.this.bufferField.readByte() & 255;
            }

            @Override // java.io.InputStream
            public final int read(byte[] data, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
                }
                okio.SegmentedByteString.checkOffsetAndCount(data.length, offset, byteCount);
                if (okio.RealBufferedSource.this.bufferField.size() == 0 && okio.RealBufferedSource.this.source.read(okio.RealBufferedSource.this.bufferField, 8192L) == -1) {
                    return -1;
                }
                return okio.RealBufferedSource.this.bufferField.read(data, offset, byteCount);
            }

            @Override // java.io.InputStream
            public final int available() {
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
                }
                return (int) java.lang.Math.min(okio.RealBufferedSource.this.bufferField.size(), androidx.collection.SieveCacheKt.NodeLinkMask);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                okio.RealBufferedSource.this.close();
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(okio.RealBufferedSource.this);
                sb.append(".inputStream()");
                return sb.toString();
            }

            @Override // java.io.InputStream
            public final long transferTo(java.io.OutputStream out) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "");
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
                }
                long j = 0;
                while (true) {
                    if (okio.RealBufferedSource.this.bufferField.size() == 0 && okio.RealBufferedSource.this.source.read(okio.RealBufferedSource.this.bufferField, 8192L) == -1) {
                        return j;
                    }
                    j += okio.RealBufferedSource.this.bufferField.size();
                    okio.Buffer.writeTo$default(okio.RealBufferedSource.this.bufferField, out, 0L, 2, null);
                }
            }
        };
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.Source
    public final long read(okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (this.bufferField.size() == 0) {
            if (byteCount == 0) {
                return 0L;
            }
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return this.bufferField.read(sink, java.lang.Math.min(byteCount, this.bufferField.size()));
    }

    @Override // okio.BufferedSource
    public final boolean exhausted() {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        return this.bufferField.exhausted() && this.source.read(this.bufferField, 8192L) == -1;
    }

    @Override // okio.BufferedSource
    public final void require(long byteCount) {
        if (!request(byteCount)) {
            throw new java.io.EOFException();
        }
    }

    @Override // okio.BufferedSource
    public final boolean request(long byteCount) {
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        while (this.bufferField.size() < byteCount) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    public final okio.ByteString readByteString() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override // okio.BufferedSource
    public final okio.ByteString readByteString(long byteCount) {
        require(byteCount);
        return this.bufferField.readByteString(byteCount);
    }

    @Override // okio.BufferedSource
    public final int select(okio.Options options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        do {
            int selectPrefix = okio.internal.Buffer.selectPrefix(this.bufferField, options, true);
            if (selectPrefix != -2) {
                if (selectPrefix == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[selectPrefix].size());
                return selectPrefix;
            }
        } while (this.source.read(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray(long byteCount) {
        require(byteCount);
        return this.bufferField.readByteArray(byteCount);
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (java.io.EOFException e) {
            int i = 0;
            while (this.bufferField.size() > 0) {
                okio.Buffer buffer = this.bufferField;
                int read = buffer.read(sink, i, (int) buffer.size());
                if (read == -1) {
                    throw new java.lang.AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public final int read(byte[] sink, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        long j = byteCount;
        okio.SegmentedByteString.checkOffsetAndCount(sink.length, offset, j);
        if (this.bufferField.size() == 0) {
            if (byteCount == 0) {
                return 0;
            }
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1;
            }
        }
        return this.bufferField.read(sink, offset, (int) java.lang.Math.min(j, this.bufferField.size()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // okio.BufferedSource
    public final void readFully(okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        try {
            require(byteCount);
            this.bufferField.readFully(sink, byteCount);
        } catch (java.io.EOFException e) {
            sink.writeAll(this.bufferField);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public final long readAll(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        long j = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(this.bufferField, completeSegmentByteCount);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j;
        }
        long size = j + this.bufferField.size();
        okio.Buffer buffer = this.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    @Override // okio.BufferedSource
    public final java.lang.String readUtf8() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.BufferedSource
    public final java.lang.String readUtf8(long byteCount) {
        require(byteCount);
        return this.bufferField.readUtf8(byteCount);
    }

    @Override // okio.BufferedSource
    public final java.lang.String readString(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.BufferedSource
    public final java.lang.String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, indexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public final java.lang.String readUtf8LineStrict(long limit) {
        if (limit < 0) {
            throw new java.lang.IllegalArgumentException("limit < 0: ".concat(java.lang.String.valueOf(limit)).toString());
        }
        long j = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long indexOf = indexOf((byte) 10, 0L, j);
        if (indexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, indexOf);
        }
        if (j < Long.MAX_VALUE && request(j) && this.bufferField.getByte(j - 1) == 13 && request(1 + j) && this.bufferField.getByte(j) == 10) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, j);
        }
        okio.Buffer buffer = new okio.Buffer();
        okio.Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, java.lang.Math.min(32L, buffer2.size()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\\n not found: limit=");
        sb.append(java.lang.Math.min(this.bufferField.size(), limit));
        sb.append(" content=");
        sb.append(buffer.readByteString().hex());
        sb.append(kotlin.text.Typography.ellipsis);
        throw new java.io.EOFException(sb.toString());
    }

    @Override // okio.BufferedSource
    public final int readUtf8CodePoint() {
        require(1L);
        byte b = this.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            require(2L);
        } else if ((b & com.visa.cbp.getEncExpo.onUnminimized) == 224) {
            require(3L);
        } else if ((b & 248) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    public final short readShort() {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.BufferedSource
    public final short readShortLe() {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    public final int readInt() {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public final int readIntLe() {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public final long readLong() {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public final long readLongLe() {
        require(8L);
        return this.bufferField.readLongLe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r0 = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
        r1 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long readDecimalLong() {
        require(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!request(j2)) {
                break;
            }
            byte b = this.bufferField.getByte(j);
            if ((b < 48 || b > 57) && !(j == 0 && b == 45)) {
                break;
            }
            j = j2;
        }
        return this.bufferField.readDecimalLong();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        r0 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long readHexadecimalUnsignedLong() {
        require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            byte b = this.bufferField.getByte(i);
            if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                break;
            }
            i = i2;
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public final void skip(long byteCount) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        while (byteCount > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long min = java.lang.Math.min(byteCount, this.bufferField.size());
            this.bufferField.skip(min);
            byteCount -= min;
        }
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex=");
            sb.append(fromIndex);
            sb.append(" toIndex=");
            sb.append(toIndex);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        while (fromIndex < toIndex) {
            long indexOf = this.bufferField.indexOf(b, fromIndex, toIndex);
            if (indexOf == -1) {
                long size = this.bufferField.size();
                if (size >= toIndex || this.source.read(this.bufferField, 8192L) == -1) {
                    break;
                }
                fromIndex = java.lang.Math.max(fromIndex, size);
            } else {
                return indexOf;
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(okio.ByteString targetBytes, long fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        while (true) {
            long indexOfElement = this.bufferField.indexOfElement(targetBytes, fromIndex);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = java.lang.Math.max(fromIndex, size);
        }
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long offset, okio.ByteString bytes, int bytesOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        return byteCount >= 0 && offset >= 0 && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.size() && (byteCount == 0 || okio.internal.RealBufferedSource.commonIndexOf(this, bytes, bytesOffset, byteCount, offset, offset + 1) != -1);
    }

    @Override // okio.BufferedSource
    public final okio.BufferedSource peek() {
        return okio.Okio.buffer(new okio.PeekSource(this));
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final okio.Timeout getCamera2StreamConfigurationMap() {
        return this.source.getCamera2StreamConfigurationMap();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("buffer(");
        sb.append(this.source);
        sb.append(')');
        return sb.toString();
    }
}
