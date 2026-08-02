package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000b\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010%J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\u00020\u00068WX\u0096\u0004¢\u0006\f\u0012\u0004\b7\u0010%\u001a\u0004\b5\u00106"}, d2 = {"Lkotlinx/io/RealSink;", "Lkotlinx/io/Sink;", "Lkotlinx/io/RawSink;", "sink", "<init>", "(Lkotlinx/io/RawSink;)V", "Lkotlinx/io/Buffer;", "source", "", "byteCount", "", "write", "(Lkotlinx/io/Buffer;J)V", "", "", "startIndex", "endIndex", "([BII)V", "Lkotlinx/io/RawSource;", "transferFrom", "(Lkotlinx/io/RawSource;)J", "(Lkotlinx/io/RawSource;J)V", "", "byte", "writeByte", "(B)V", "", "short", "writeShort", "(S)V", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, "writeInt", "(I)V", com.adjust.sdk.Constants.LONG, "writeLong", "(J)V", "hintEmit", "()V", "emit", "flush", "close", "", "toString", "()Ljava/lang/String;", "Lkotlinx/io/RawSink;", "getSink", "()Lkotlinx/io/RawSink;", "", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Z", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/io/Buffer;", "getHighSpeedVideoFpsRanges", "getBuffer", "()Lkotlinx/io/Buffer;", "getBuffer$annotations", "buffer"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealSink implements kotlinx.io.Sink {
    public boolean closed;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.io.Buffer getHighSpeedVideoFpsRanges;
    private final kotlinx.io.RawSink sink;

    public static /* synthetic */ void getBuffer$annotations() {
    }

    public RealSink(kotlinx.io.RawSink rawSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawSink, "");
        this.sink = rawSink;
        this.getHighSpeedVideoFpsRanges = new kotlinx.io.Buffer();
    }

    public final kotlinx.io.RawSink getSink() {
        return this.sink;
    }

    @Override // kotlinx.io.Sink
    /* renamed from: getBuffer, reason: from getter */
    public final kotlinx.io.Buffer getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.io.RawSink, java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        try {
            if (this.getHighSpeedVideoFpsRanges.getSizeMut() > 0) {
                kotlinx.io.RawSink rawSink = this.sink;
                kotlinx.io.Buffer buffer = this.getHighSpeedVideoFpsRanges;
                rawSink.write(buffer, buffer.getSizeMut());
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

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("buffered(");
        sb.append(this.sink);
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlinx.io.RawSink
    public final void write(kotlinx.io.Buffer source, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException("Sink is closed.".toString());
        }
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        this.getHighSpeedVideoFpsRanges.write(source, byteCount);
        hintEmit();
    }

    @Override // kotlinx.io.Sink
    public final void write(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException("Sink is closed.".toString());
        }
        kotlinx.io._UtilKt.checkBounds(source.length, startIndex, endIndex);
        this.getHighSpeedVideoFpsRanges.write(source, startIndex, endIndex);
        hintEmit();
    }

    @Override // kotlinx.io.Sink
    public final long transferFrom(kotlinx.io.RawSource source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException("Sink is closed.".toString());
        }
        long j = 0;
        while (true) {
            long readAtMostTo = source.readAtMostTo(this.getHighSpeedVideoFpsRanges, 8192L);
            if (readAtMostTo == -1) {
                return j;
            }
            j += readAtMostTo;
            hintEmit();
        }
    }

    @Override // kotlinx.io.Sink
    public final void write(kotlinx.io.RawSource source, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (this.closed) {
            throw new java.lang.IllegalStateException("Sink is closed.".toString());
        }
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        long j = byteCount;
        while (j > 0) {
            long readAtMostTo = source.readAtMostTo(this.getHighSpeedVideoFpsRanges, j);
            if (readAtMostTo == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Source exhausted before reading ");
                sb.append(byteCount);
                sb.append(" bytes from it (number of bytes read: ");
                sb.append(byteCount - j);
                sb.append(").");
                throw new java.io.EOFException(sb.toString());
            }
            j -= readAtMostTo;
            hintEmit();
        }
    }

    @Override // kotlinx.io.Sink
    public final void writeByte(byte r2) {
        if (!this.closed) {
            this.getHighSpeedVideoFpsRanges.writeByte(r2);
            hintEmit();
            return;
        }
        throw new java.lang.IllegalStateException("Sink is closed.".toString());
    }

    @Override // kotlinx.io.Sink
    public final void writeShort(short r2) {
        if (!this.closed) {
            this.getHighSpeedVideoFpsRanges.writeShort(r2);
            hintEmit();
            return;
        }
        throw new java.lang.IllegalStateException("Sink is closed.".toString());
    }

    @Override // kotlinx.io.Sink
    public final void writeInt(int r2) {
        if (!this.closed) {
            this.getHighSpeedVideoFpsRanges.writeInt(r2);
            hintEmit();
            return;
        }
        throw new java.lang.IllegalStateException("Sink is closed.".toString());
    }

    @Override // kotlinx.io.Sink
    public final void writeLong(long r2) {
        if (!this.closed) {
            this.getHighSpeedVideoFpsRanges.writeLong(r2);
            hintEmit();
            return;
        }
        throw new java.lang.IllegalStateException("Sink is closed.".toString());
    }

    @Override // kotlinx.io.Sink
    public final void hintEmit() {
        if (!this.closed) {
            long completeSegmentByteCount$kotlinx_io_core = this.getHighSpeedVideoFpsRanges.completeSegmentByteCount$kotlinx_io_core();
            if (completeSegmentByteCount$kotlinx_io_core > 0) {
                this.sink.write(this.getHighSpeedVideoFpsRanges, completeSegmentByteCount$kotlinx_io_core);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("Sink is closed.".toString());
    }

    @Override // kotlinx.io.Sink
    public final void emit() {
        if (!this.closed) {
            long sizeMut = this.getHighSpeedVideoFpsRanges.getSizeMut();
            if (sizeMut > 0) {
                this.sink.write(this.getHighSpeedVideoFpsRanges, sizeMut);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("Sink is closed.".toString());
    }

    @Override // kotlinx.io.Sink, kotlinx.io.RawSink, java.io.Flushable
    public final void flush() {
        if (!this.closed) {
            if (this.getHighSpeedVideoFpsRanges.getSizeMut() > 0) {
                kotlinx.io.RawSink rawSink = this.sink;
                kotlinx.io.Buffer buffer = this.getHighSpeedVideoFpsRanges;
                rawSink.write(buffer, buffer.getSizeMut());
            }
            this.sink.flush();
            return;
        }
        throw new java.lang.IllegalStateException("Sink is closed.".toString());
    }
}
