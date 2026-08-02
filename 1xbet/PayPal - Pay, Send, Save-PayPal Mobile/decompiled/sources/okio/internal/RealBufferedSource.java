package okio.internal;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u001c\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001bH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a,\u0010\u0005\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\b\u0005\u0010\"\u001a$\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010#\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020$H\u0080\b¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010(\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010*\u001a\u0016\u0010+\u001a\u0004\u0018\u00010'*\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010)\u001a\u001c\u0010-\u001a\u00020'*\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00104\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u0010/\u001a\u0014\u00105\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u0010/\u001a\u0014\u00106\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b8\u00107\u001a\u0014\u00109\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u00107\u001a\u0014\u0010:\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b:\u00107\u001a\u001c\u0010;\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b;\u0010\f\u001a,\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010@\u001aA\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010A\u001a\u00020\u00122\b\b\u0002\u0010B\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u0003H\u0000¢\u0006\u0004\b?\u0010C\u001a$\u0010E\u001a\u00020\u0003*\u00020\u00002\u0006\u0010D\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bE\u0010F\u001a4\u0010G\u001a\u00020\u0007*\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\bG\u0010H\u001a\u0014\u0010J\u001a\u00020I*\u00020\u0000H\u0080\b¢\u0006\u0004\bJ\u0010K\u001a\u0014\u0010L\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\bL\u0010M\u001a\u0014\u0010O\u001a\u00020N*\u00020\u0000H\u0080\b¢\u0006\u0004\bO\u0010P\u001a\u0014\u0010Q\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\bQ\u0010)"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/Buffer;", "sink", "", "byteCount", "commonRead", "(Lokio/RealBufferedSource;Lokio/Buffer;J)J", "", "commonExhausted", "(Lokio/RealBufferedSource;)Z", "", "commonRequire", "(Lokio/RealBufferedSource;J)V", "commonRequest", "(Lokio/RealBufferedSource;J)Z", "", "commonReadByte", "(Lokio/RealBufferedSource;)B", "Lokio/ByteString;", "commonReadByteString", "(Lokio/RealBufferedSource;)Lokio/ByteString;", "(Lokio/RealBufferedSource;J)Lokio/ByteString;", "Lokio/Options;", "options", "", "commonSelect", "(Lokio/RealBufferedSource;Lokio/Options;)I", "", "commonReadByteArray", "(Lokio/RealBufferedSource;)[B", "(Lokio/RealBufferedSource;J)[B", "commonReadFully", "(Lokio/RealBufferedSource;[B)V", "offset", "(Lokio/RealBufferedSource;[BII)I", "(Lokio/RealBufferedSource;Lokio/Buffer;J)V", "Lokio/Sink;", "commonReadAll", "(Lokio/RealBufferedSource;Lokio/Sink;)J", "", "commonReadUtf8", "(Lokio/RealBufferedSource;)Ljava/lang/String;", "(Lokio/RealBufferedSource;J)Ljava/lang/String;", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "(Lokio/RealBufferedSource;)I", "", "commonReadShort", "(Lokio/RealBufferedSource;)S", "commonReadShortLe", "commonReadInt", "commonReadIntLe", "commonReadLong", "(Lokio/RealBufferedSource;)J", "commonReadLongLe", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonSkip", util.h.xy.cb.b.f1091, "fromIndex", "toIndex", "commonIndexOf", "(Lokio/RealBufferedSource;BJJ)J", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "bytesOffset", "(Lokio/RealBufferedSource;Lokio/ByteString;IIJJ)J", "targetBytes", "commonIndexOfElement", "(Lokio/RealBufferedSource;Lokio/ByteString;J)J", "commonRangeEquals", "(Lokio/RealBufferedSource;JLokio/ByteString;II)Z", "Lokio/BufferedSource;", "commonPeek", "(Lokio/RealBufferedSource;)Lokio/BufferedSource;", "commonClose", "(Lokio/RealBufferedSource;)V", "Lokio/Timeout;", "commonTimeout", "(Lokio/RealBufferedSource;)Lokio/Timeout;", "commonToString"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: classes5.dex */
public final class RealBufferedSource {
    public static final long commonRead(okio.RealBufferedSource realBufferedSource, okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)).toString());
        }
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (realBufferedSource.bufferField.size() == 0) {
            if (j == 0) {
                return 0L;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return realBufferedSource.bufferField.read(buffer, java.lang.Math.min(j, realBufferedSource.bufferField.size()));
    }

    public static final boolean commonExhausted(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final void commonRequire(okio.RealBufferedSource realBufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        if (!realBufferedSource.request(j)) {
            throw new java.io.EOFException();
        }
    }

    public static final boolean commonRequest(okio.RealBufferedSource realBufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)).toString());
        }
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        while (realBufferedSource.bufferField.size() < j) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final byte commonReadByte(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteString(j);
    }

    public static final int commonSelect(okio.RealBufferedSource realBufferedSource, okio.Options options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        do {
            int selectPrefix = okio.internal.Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (selectPrefix != -2) {
                if (selectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings()[selectPrefix].size());
                return selectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteArray(j);
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        try {
            realBufferedSource.require(bArr.length);
            realBufferedSource.bufferField.readFully(bArr);
        } catch (java.io.EOFException e) {
            int i = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                int read = realBufferedSource.bufferField.read(bArr, i, (int) realBufferedSource.bufferField.size());
                if (read == -1) {
                    throw new java.lang.AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    public static final int commonRead(okio.RealBufferedSource realBufferedSource, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        long j = i2;
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i, j);
        if (realBufferedSource.bufferField.size() == 0) {
            if (i2 == 0) {
                return 0;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1;
            }
        }
        return realBufferedSource.bufferField.read(bArr, i, (int) java.lang.Math.min(j, realBufferedSource.bufferField.size()));
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        try {
            realBufferedSource.require(j);
            realBufferedSource.bufferField.readFully(buffer, j);
        } catch (java.io.EOFException e) {
            buffer.writeAll(realBufferedSource.bufferField);
            throw e;
        }
    }

    public static final long commonReadAll(okio.RealBufferedSource realBufferedSource, okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        long j = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long completeSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(realBufferedSource.bufferField, completeSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j;
        }
        long size = j + realBufferedSource.bufferField.size();
        sink.write(realBufferedSource.bufferField, realBufferedSource.bufferField.size());
        return size;
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource realBufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readUtf8(j);
    }

    public static final java.lang.String commonReadUtf8Line(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        long indexOf = realBufferedSource.indexOf((byte) 10);
        if (indexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(realBufferedSource.bufferField, indexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.RealBufferedSource realBufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("limit < 0: ".concat(java.lang.String.valueOf(j)).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long indexOf = realBufferedSource.indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(realBufferedSource.bufferField, indexOf);
        }
        if (j2 < Long.MAX_VALUE && realBufferedSource.request(j2) && realBufferedSource.bufferField.getByte(j2 - 1) == 13 && realBufferedSource.request(1 + j2) && realBufferedSource.bufferField.getByte(j2) == 10) {
            return okio.internal.Buffer.readUtf8Line(realBufferedSource.bufferField, j2);
        }
        okio.Buffer buffer = new okio.Buffer();
        realBufferedSource.bufferField.copyTo(buffer, 0L, java.lang.Math.min(32L, realBufferedSource.bufferField.size()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\\n not found: limit=");
        sb.append(java.lang.Math.min(realBufferedSource.bufferField.size(), j));
        sb.append(" content=");
        sb.append(buffer.readByteString().hex());
        sb.append(kotlin.text.Typography.ellipsis);
        throw new java.io.EOFException(sb.toString());
    }

    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(1L);
        byte b = realBufferedSource.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b & com.visa.cbp.getEncExpo.onUnminimized) == 224) {
            realBufferedSource.require(3L);
        } else if ((b & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final short commonReadShort(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final int commonReadInt(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r11 = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
        r1 = java.lang.Integer.toString(r9, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r11.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        throw new java.lang.NumberFormatException(r11.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadDecimalLong(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!realBufferedSource.request(j2)) {
                break;
            }
            byte b = realBufferedSource.bufferField.getByte(j);
            if ((b < 48 || b > 57) && !(j == 0 && b == 45)) {
                break;
            }
            j = j2;
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r1 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r6 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = java.lang.Integer.toString(r3, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r6.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        throw new java.lang.NumberFormatException(r6.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!realBufferedSource.request(i2)) {
                break;
            }
            byte b = realBufferedSource.bufferField.getByte(i);
            if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                break;
            }
            i = i2;
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final void commonSkip(okio.RealBufferedSource realBufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        while (j > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long min = java.lang.Math.min(j, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(min);
            j -= min;
        }
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, byte b, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (0 > j || j > j2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex=");
            sb.append(j);
            sb.append(" toIndex=");
            sb.append(j2);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        while (j < j2) {
            long indexOf = realBufferedSource.bufferField.indexOf(b, j, j2);
            if (indexOf == -1) {
                long size = realBufferedSource.bufferField.size();
                if (size >= j2 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                    break;
                }
                j = java.lang.Math.max(j, size);
            } else {
                return indexOf;
            }
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, okio.ByteString byteString, int i, int i2, long j, long j2) {
        long j3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        long j4 = i2;
        okio.SegmentedByteString.checkOffsetAndCount(byteString.size(), i, j4);
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        long j5 = j;
        loop0: while (true) {
            long commonIndexOf = okio.internal.Buffer.commonIndexOf(realBufferedSource.bufferField, byteString, j5, j2, i, i2);
            if (commonIndexOf != -1) {
                return commonIndexOf;
            }
            long size = (realBufferedSource.bufferField.size() - j4) + 1;
            if (size >= j2) {
                return -1L;
            }
            okio.Buffer buffer = realBufferedSource.bufferField;
            if (buffer.size() >= j2) {
                int max = (int) java.lang.Math.max(1L, (buffer.size() - j2) + 1);
                int min = ((int) java.lang.Math.min(j4, (buffer.size() - j5) + 1)) - 1;
                if (max > min) {
                    break;
                }
                int i3 = min;
                while (true) {
                    int i4 = max;
                    int i5 = i3;
                    j3 = size;
                    if (!buffer.rangeEquals(buffer.size() - i3, byteString, i, i5)) {
                        if (i5 == i4) {
                            break loop0;
                        }
                        i3 = i5 - 1;
                        max = i4;
                        size = j3;
                    } else {
                        break;
                    }
                }
            } else {
                j3 = size;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j5 = java.lang.Math.max(j5, j3);
        }
    }

    public static final long commonIndexOfElement(okio.RealBufferedSource realBufferedSource, okio.ByteString byteString, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        while (true) {
            long indexOfElement = realBufferedSource.bufferField.indexOfElement(byteString, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = java.lang.Math.max(j, size);
        }
    }

    public static final boolean commonRangeEquals(okio.RealBufferedSource realBufferedSource, long j, okio.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        if (realBufferedSource.closed) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        return i2 >= 0 && j >= 0 && i >= 0 && i + i2 <= byteString.size() && (i2 == 0 || commonIndexOf(realBufferedSource, byteString, i, i2, j, j + 1) != -1);
    }

    public static final okio.BufferedSource commonPeek(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        return okio.Okio.buffer(new okio.PeekSource(realBufferedSource));
    }

    public static final void commonClose(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        return realBufferedSource.source.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public static final java.lang.String commonToString(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("buffer(");
        sb.append(realBufferedSource.source);
        sb.append(')');
        return sb.toString();
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }
}
