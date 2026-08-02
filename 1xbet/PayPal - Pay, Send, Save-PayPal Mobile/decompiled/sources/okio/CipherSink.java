package okio;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0016\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001e\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "Lokio/BufferedSink;", "sink", "Ljavax/crypto/Cipher;", "cipher", "<init>", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "close", "", "Camera2StreamConfigurationMap", "()Ljava/lang/Throwable;", "Lokio/BufferedSink;", "getHighResolutionOutputSizeshNQ4ISI", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CipherSink implements okio.Sink {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okio.BufferedSink getHighResolutionOutputSizeshNQ4ISI;
    private final javax.crypto.Cipher cipher;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    public CipherSink(okio.BufferedSink bufferedSink, javax.crypto.Cipher cipher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bufferedSink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.Camera2StreamConfigurationMap = blockSize;
        if (blockSize <= 0) {
            throw new java.lang.IllegalArgumentException("Block cipher required ".concat(java.lang.String.valueOf(cipher)).toString());
        }
    }

    public final javax.crypto.Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Sink
    public final void write(okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        if (this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        while (byteCount > 0) {
            okio.Segment segment = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int min = (int) java.lang.Math.min(byteCount, segment.limit - segment.pos);
            okio.Buffer buffer = this.getHighResolutionOutputSizeshNQ4ISI.getBuffer();
            int outputSize = this.cipher.getOutputSize(min);
            while (true) {
                if (outputSize > 8192) {
                    int i = this.Camera2StreamConfigurationMap;
                    if (min <= i) {
                        okio.BufferedSink bufferedSink = this.getHighResolutionOutputSizeshNQ4ISI;
                        byte[] update = this.cipher.update(source.readByteArray(byteCount));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(update, "");
                        bufferedSink.write(update);
                        min = (int) byteCount;
                        break;
                    }
                    min -= i;
                    outputSize = this.cipher.getOutputSize(min);
                } else {
                    okio.Segment writableSegment$okio = buffer.writableSegment$okio(outputSize);
                    int update2 = this.cipher.update(segment.data, segment.pos, min, writableSegment$okio.data, writableSegment$okio.limit);
                    writableSegment$okio.limit += update2;
                    buffer.setSize$okio(buffer.size() + update2);
                    if (writableSegment$okio.pos == writableSegment$okio.limit) {
                        buffer.head = writableSegment$okio.pop();
                        okio.SegmentPool.recycle(writableSegment$okio);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.emitCompleteSegments();
                    source.setSize$okio(source.size() - min);
                    segment.pos += min;
                    if (segment.pos == segment.limit) {
                        source.head = segment.pop();
                        okio.SegmentPool.recycle(segment);
                    }
                }
            }
            byteCount -= min;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        this.getHighResolutionOutputSizeshNQ4ISI.flush();
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final okio.Timeout getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        java.lang.Throwable Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.close();
        } catch (java.lang.Throwable th) {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = th;
            }
        }
        if (Camera2StreamConfigurationMap != null) {
            throw Camera2StreamConfigurationMap;
        }
    }

    private final java.lang.Throwable Camera2StreamConfigurationMap() {
        int outputSize = this.cipher.getOutputSize(0);
        java.lang.Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                okio.BufferedSink bufferedSink = this.getHighResolutionOutputSizeshNQ4ISI;
                byte[] doFinal = this.cipher.doFinal();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "");
                bufferedSink.write(doFinal);
                return null;
            } catch (java.lang.Throwable th2) {
                return th2;
            }
        }
        okio.Buffer buffer = this.getHighResolutionOutputSizeshNQ4ISI.getBuffer();
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(outputSize);
        try {
            int doFinal2 = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.limit);
            writableSegment$okio.limit += doFinal2;
            buffer.setSize$okio(buffer.size() + doFinal2);
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            okio.SegmentPool.recycle(writableSegment$okio);
        }
        return th;
    }
}
