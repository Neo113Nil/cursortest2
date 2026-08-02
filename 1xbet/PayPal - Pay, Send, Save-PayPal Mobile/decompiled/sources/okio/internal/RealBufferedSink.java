package okio.internal;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u0006\u0010\u000b\u001a,\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0006\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0019H\u0080\b¢\u0006\u0004\b\u0006\u0010\u001a\u001a,\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0006\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u001f\u001a\u001c\u0010!\u001a\u00020\n*\u00020\u00002\u0006\u0010 \u001a\u00020\fH\u0080\b¢\u0006\u0004\b!\u0010\u0018\u001a\u001c\u0010#\u001a\u00020\n*\u00020\u00002\u0006\u0010\"\u001a\u00020\fH\u0080\b¢\u0006\u0004\b#\u0010\u0018\u001a\u001c\u0010$\u001a\u00020\n*\u00020\u00002\u0006\u0010\"\u001a\u00020\fH\u0080\b¢\u0006\u0004\b$\u0010\u0018\u001a\u001c\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0080\b¢\u0006\u0004\b&\u0010\u0018\u001a\u001c\u0010'\u001a\u00020\n*\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0080\b¢\u0006\u0004\b'\u0010\u0018\u001a\u001c\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b+\u0010*\u001a\u001c\u0010,\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b,\u0010*\u001a\u001c\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00100\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b0\u0010/\u001a\u0014\u00101\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00105\u001a\u000204*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00106\u001a\u0014\u00107\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b7\u00108"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/Buffer;", "source", "", "byteCount", "", "commonWrite", "(Lokio/RealBufferedSink;Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "Lokio/BufferedSink;", "(Lokio/RealBufferedSink;Lokio/ByteString;)Lokio/BufferedSink;", "", "offset", "(Lokio/RealBufferedSink;Lokio/ByteString;II)Lokio/BufferedSink;", "", "string", "commonWriteUtf8", "(Lokio/RealBufferedSink;Ljava/lang/String;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Lokio/RealBufferedSink;Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "commonWriteUtf8CodePoint", "(Lokio/RealBufferedSink;I)Lokio/BufferedSink;", "", "(Lokio/RealBufferedSink;[B)Lokio/BufferedSink;", "(Lokio/RealBufferedSink;[BII)Lokio/BufferedSink;", "Lokio/Source;", "commonWriteAll", "(Lokio/RealBufferedSink;Lokio/Source;)J", "(Lokio/RealBufferedSink;Lokio/Source;J)Lokio/BufferedSink;", util.h.xy.cb.b.f1091, "commonWriteByte", lib.android.paypal.com.magnessdk.g.n2, "commonWriteShort", "commonWriteShortLe", "i", "commonWriteInt", "commonWriteIntLe", "v", "commonWriteLong", "(Lokio/RealBufferedSink;J)Lokio/BufferedSink;", "commonWriteLongLe", "commonWriteDecimalLong", "commonWriteHexadecimalUnsignedLong", "commonEmitCompleteSegments", "(Lokio/RealBufferedSink;)Lokio/BufferedSink;", "commonEmit", "commonFlush", "(Lokio/RealBufferedSink;)V", "commonClose", "Lokio/Timeout;", "commonTimeout", "(Lokio/RealBufferedSink;)Lokio/Timeout;", "commonToString", "(Lokio/RealBufferedSink;)Ljava/lang/String;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* loaded from: classes17.dex */
public final class RealBufferedSink {
    public static final void commonWrite(okio.RealBufferedSink realBufferedSink, okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.write(buffer, j);
        realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.write(byteString);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, okio.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.write(byteString, i, i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeUtf8(str);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeUtf8(str, i, i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteUtf8CodePoint(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.write(bArr);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.write(bArr, i, i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteByte(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeByte(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteShort(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeShort(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteShortLe(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeShortLe(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteInt(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeInt(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteIntLe(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeIntLe(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteLong(okio.RealBufferedSink realBufferedSink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteLongLe(okio.RealBufferedSink realBufferedSink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeLongLe(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteDecimalLong(okio.RealBufferedSink realBufferedSink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeDecimalLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteHexadecimalUnsignedLong(okio.RealBufferedSink realBufferedSink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonEmitCompleteSegments(okio.RealBufferedSink realBufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        long completeSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, completeSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final okio.BufferedSink commonEmit(okio.RealBufferedSink realBufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(okio.RealBufferedSink realBufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (realBufferedSink.bufferField.size() > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, realBufferedSink.bufferField.size());
        }
        realBufferedSink.sink.flush();
    }

    public static final void commonClose(okio.RealBufferedSink realBufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        if (realBufferedSink.closed) {
            return;
        }
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                realBufferedSink.sink.write(realBufferedSink.bufferField, realBufferedSink.bufferField.size());
            }
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            realBufferedSink.sink.close();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSink realBufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        return realBufferedSink.sink.getGetHighSpeedVideoFpsRangesFor();
    }

    public static final java.lang.String commonToString(okio.RealBufferedSink realBufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("buffer(");
        sb.append(realBufferedSink.sink);
        sb.append(')');
        return sb.toString();
    }

    public static final long commonWriteAll(okio.RealBufferedSink realBufferedSink, okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        long j = 0;
        while (true) {
            long read = source.read(realBufferedSink.bufferField, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, okio.Source source, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        while (j > 0) {
            long read = source.read(realBufferedSink.bufferField, j);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            j -= read;
            realBufferedSink.emitCompleteSegments();
        }
        return realBufferedSink;
    }
}
